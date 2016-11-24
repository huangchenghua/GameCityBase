package com.gz.gamecity.protocol;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;


public class ProtocolUtilMain {


	static String tab1="	";
	static String tab2=tab1+"	";
	static String tab3=tab2+"	";
	static String tab4=tab3+"	";
	
	
	public static void main(String[] args) {
		
		String xmlpath = "./conf/protocol.xml";
		SAXBuilder builder = new SAXBuilder(false);
//		List<Element> 
		try {
			Document doc = builder.build(xmlpath);
			Element servers = doc.getRootElement();
			List serverlist = servers.getChildren("protocol");
			List<Element> protocol_list=new ArrayList<>();
			for (Iterator iter = serverlist.iterator(); iter.hasNext();) {
				Element protocol = (Element) iter.next();
				protocol_list.add(protocol);
			}
			List constlist = servers.getChildren("const");
			createJavaFile2(protocol_list,constlist);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	private static void createJavaFile2(List<Element> fieldList,List constlist){
		FileWriter writer=null;
		try {
			writer = new FileWriter("./src/com/gz/gamecity/protocol/Protocols.java");
			writer.write("package com.gz.gamecity.protocol;"+"\r\n");
			writer.write("\r\n");
			writer.write("public class Protocols{"+"\r\n");
			writer.write("\r\n");
			for(Element e:fieldList){
				
				writeClass2(e,writer,tab1);
				
			}

			writeConst(writer,constlist);
			
			writer.write("\r\n");
			writer.write(tab1+"public static final String MAINCODE = \"mainCode\";"+"\r\n");
			writer.write(tab1+"public static final String SUBCODE = \"subCode\";"+"\r\n");
			writer.write(tab1+"public static final String ERRORCODE = \"errorCode\";"+"\r\n");
			
			writer.write("\r\n");
			writer.write("}");
			writer.flush();
		} 
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	public static void writeClass2(Element element,FileWriter writer,String tab){
		String className = element.getAttributeValue("name");
		className=className.substring(0, 1).toUpperCase()+className.substring(1, className.length());
		String mainCode = element.getChildText("mainCode");
		String subCode = element.getChildText("subCode");
		
		try {
			writer.write("\r\n");
			writer.write(tab +"public static final class "+className+"{"+"\r\n" );
			
			if(mainCode!=null && !mainCode.equals("")){
				writer.write(tab + tab1 +"public static final int mainCode_value = "+ mainCode+";\r\n");
			}
			if(subCode!=null && !subCode.equals("")){
				writer.write(tab + tab1 +"public static final int subCode_value = "+ subCode+";\r\n");
			}
			List fieldList = element.getChildren("field");
			for(int i=0;i<fieldList.size();i++){
				Element e = (Element) fieldList.get(i);
				String field = e.getAttributeValue("name");
				writer.write(tab + tab1 +"public static final String " + field.toUpperCase()+" = \""+ field+"\";\r\n");
				if(e.getAttributeValue("type")!=null && e.getAttributeValue("type").equals("obj")){
					String t=tab+tab1;
					writeClass2(e,writer,t);
				}
				
			}
			
			
			writer.write("\r\n");
			writer.write(tab+"}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static void writeConst(FileWriter writer,List constlist){
		try {
			writer.write("\r\n");
			writer.write(tab1 +"public static final class ProtocolConst {"+"\r\n" );
			
			for(int i=0;i<constlist.size();i++){
				Element e = (Element) constlist.get(i);
				String name = e.getAttributeValue("name");
				String value = e.getText();
				writer.write(tab2+"public static final String "+name.toUpperCase()+" =\""+value+"\";");
				writer.write("\r\n");
			}
			
			
			writer.write("\r\n");
			writer.write(tab1+"}");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
