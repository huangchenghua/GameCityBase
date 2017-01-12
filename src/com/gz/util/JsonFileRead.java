package com.gz.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonFileRead {
	
	private static JsonFileRead _instance;
	public static JsonFileRead getInstance(){
		if (_instance == null) {
			_instance = new JsonFileRead();
		}
		return _instance;
	}
	
	public JSONObject readJson(String filename)
	{
		FileInputStream fis;				
		try {
			fis = new FileInputStream(new File(filename));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int readed = 0;
			while ((readed = fis.read(buf)) != -1) {
				baos.write(buf, 0, readed);
			}
		JSONObject json = JSONObject.parseObject(new String(baos.toByteArray(), "utf-8"));
			baos.close();
			fis.close();
			return json;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public JSONArray readJsonArray(String filename)
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File(filename));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		int readed = 0;
			while ((readed = fis.read(buf)) != -1) {
				baos.write(buf, 0, readed);
			}
			JSONArray json = JSONArray.parseArray(new String(baos.toByteArray(), "utf-8"));
			baos.close();
			fis.close();
			return json;
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
