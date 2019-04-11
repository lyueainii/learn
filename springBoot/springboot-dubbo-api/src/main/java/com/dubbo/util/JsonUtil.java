package com.dubbo.util;

import java.lang.reflect.Type;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
/*
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
*/
public class JsonUtil {
	
/*	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map convertToMap(String jsonStr) {

		JSONObject localJSONObject = JSONObject.fromObject(jsonStr);
		HashMap localHashMap = new HashMap();
		Iterator localIterator = localJSONObject.keys();
		while (localIterator.hasNext()) {
			Object localObject = localIterator.next();
			localHashMap.put(localObject, localJSONObject.get(localObject));
		}
		return localHashMap;
	}

	public static String convertArrayToString(Object jsArray, String split) {
		if ((jsArray == null) || (!(jsArray instanceof JSONArray))) {
			return null;
		}
		JSONArray localJSONArray = (JSONArray) jsArray;
		if (StringUtils.isBlank(split)) {
			split = ",";
		}
		StringBuffer localStringBuffer = new StringBuffer();
		for (int i = 0; i < localJSONArray.size(); i++) {
			if (i > 0) {
				localStringBuffer.append(split);
			}
			localStringBuffer.append(localJSONArray.get(i).toString());
		}
		return localStringBuffer.toString();
	}

	@SuppressWarnings({ "rawtypes", "deprecation" })
	public static List paserJsonArray(Class type, String jsArrayStr) {
		if ((StringUtils.isBlank(jsArrayStr)) || (jsArrayStr.equals("[]"))) {
			return new ArrayList();
		}
		JSONArray localJSONArray = JSONArray.fromObject(jsArrayStr);
		List list = (List) JSONArray.toList(localJSONArray, type);
		return list;
	}

	public static String paserJsonObject(Object obj) {
		JsonConfig jsonConfig = new JsonConfig();
		registerJsonConfig(jsonConfig);
		String json = JSONArray.fromObject(obj, jsonConfig).toString();
		json = json.substring(1, json.length() - 1);
		return json;
	}*/


	/**
	 * ���ʽ��Timestamp��������Ϊ��ʽyyyy-MM-dd
	 * @param obj
	 * @return
	 */
	/*public static String toJSON(Object obj) {
		return timestampGson.toJson(obj);
	}
	
	*//**
	 * ֱ�ӵ���Gsonԭ����toJson�����������κθ�ʽת��
	 * @param obj
	 * @return
	 *//*
	public static String toJson(Object obj){
		return gson.toJson(obj);
	}

	public static Gson createGson() {
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(Timestamp.class, new TimestampTypeAdapter())
				.setDateFormat("yyyy-MM-dd");
		return builder.create();
	}

	public static void registerJsonConfig(JsonConfig jsonConfig) {
		jsonConfig.registerJsonValueProcessor(Timestamp.class,
				new JsonDateValueProcessor());
		jsonConfig.registerJsonValueProcessor(Date.class,
				new JsonDateValueProcessor());
		jsonConfig.registerJsonValueProcessor(java.util.Date.class,
				new JsonDateValueProcessor());
	}

	public static <T> T fromJSONToObject(String json, Class<T> clazz) {
		return timestampGson.fromJson(json, clazz);
	}

	public static <T> List<T> fromJSONToList(String json, Type type) {
		return timestampGson.fromJson(json, type);
	}

	public static List<Map<String, Object>> fromJSONToListKeyMaps(String json) {
		return timestampGson.fromJson(json, new TypeToken<List<Map<String, Object>>>() {
		}.getType());
	}

	public static Map<String, Object> fromJSONToMaps(String json) {
		Map<String, Object> map = timestampGson.fromJson(json, new TypeToken<Map<String, Object>>() {
		}.getType());
		if (null == map) {
			return new HashMap<String, Object>();
		}
		return map;
	}

	public static <T> Map<String, T> fromJSONToMaps(String json, Type type) {
		Map<String, T> map = timestampGson.fromJson(json, type);
		if (null == map) {
			return new HashMap<String, T>();
		}
		return map;
	}

	public static Map<String, String> ObjCovertStringMap(Object obj){
		String json = JsonUtil.paserJsonObject(obj);
		
		JSONObject localJSONObject = JSONObject.fromObject(json);
		Map<String,String> localHashMap = new HashMap<String,String>();
		Iterator localIterator = localJSONObject.keys();
		while (localIterator.hasNext()) {
			Object localObject = localIterator.next();
			String key = String.valueOf(localObject);
			String value = String.valueOf(localJSONObject.get(localObject));
			localHashMap.put(key,value);
		}
		return localHashMap;
	}
*/
}
