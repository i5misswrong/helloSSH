package com.wrong.dao;

import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
public class GeniericeUtils {
	@SuppressWarnings({"rawtypes"})
	public static Class getGeniericeType(Class clazz){
		Type getType=clazz.getGenericSuperclass();
		Type [] types=((ParameterizedType) getType).getActualTypeArguments();
		if(!(types[0] instanceof Class)){
			return Object.class;
		}
		return (Class) types[0];
	}
	
	@SuppressWarnings("rawtypes")
	public static String getGenericName(Class clazz){
		return clazz.getSimpleName();
	}
}
