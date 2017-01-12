package com.gz.util;

import com.alibaba.fastjson.JSONObject;

public class JsonUtil {
	public static final JSONObject copyJson(JSONObject src){
		if(src==null)
			return null;
		JSONObject json=new JSONObject();
		for(String key:src.keySet()){
			json.put(key, src.get(key));
		}
		return json;
	}
	
	public static final JSONObject[] copyJsonArray(JSONObject[] src){
		if(src==null)
			return null;
		JSONObject[] array=new JSONObject[src.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = copyJson(src[i]);
		}
		return array;
	}
}
