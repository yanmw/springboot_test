package com.test.demo.util;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public abstract class EmptyUtil {

	public static boolean isNullOrEmpty(String str) {
		if (str == null || "".equals(str.trim()) || "null".equalsIgnoreCase(str.trim())
				|| "undefined".equalsIgnoreCase(str.trim())) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNullOrEmpty(StringBuffer str) {
		return (str == null || str.length() == 0);
	}

	public static boolean isNullOrEmpty(String[] str) {
		if (str == null || (str == null || str.length == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNullOrEmpty(Long longTime) {
		if (longTime == null || longTime <= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNullOrEmpty(Object obj) {
		if (obj == null || "".equals(obj)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNullOrEmpty(Object[] obj) {
		if (obj == null || obj.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNullOrEmpty(Collection<?> collection) {
		if (collection == null || collection.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isNullOrEmpty(Map<?, ?> map) {
		if (map == null || map.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public static <T> List<T> removeNullUnit(List<T> xllxList) {
		List<T> need = new ArrayList<T>();
		for (int i = 0; i < xllxList.size(); i++) {
			if (!isNullOrEmpty(xllxList.get(i))) {
				need.add(xllxList.get(i));
			}
		}
		return need;
	}

	/**
	 * 实体之间的赋值，源数据（source）的字段值赋给目标数据（dest）的相同字段
	 * @param source 源数据
	 * @param dest 目标数据
	 * @param isCoverExistField  是否覆盖dest中已存在数据的字段
	 * @throws Exception
	 */
	public static void Copy(Object source, Object dest, Boolean isCoverExistField) throws Exception {
		// 获取属性
		BeanInfo sourceBean = Introspector.getBeanInfo(source.getClass(), Object.class);
		PropertyDescriptor[] sourceProperty = sourceBean.getPropertyDescriptors();

		BeanInfo destBean = Introspector.getBeanInfo(dest.getClass(), Object.class);
		PropertyDescriptor[] destProperty = destBean.getPropertyDescriptors();

		try {
			for (int i = 0; i < sourceProperty.length; i++) {

				for (int j = 0; j < destProperty.length; j++) {

					if (sourceProperty[i].getName().equals(destProperty[j].getName()) && sourceProperty[i].getPropertyType() == destProperty[j].getPropertyType()) {
						if (isCoverExistField) {
							destProperty[j].getWriteMethod().invoke(dest, sourceProperty[i].getReadMethod().invoke(source));
							break;
						} else {
							Object destData = destProperty[j].getReadMethod().invoke(dest);
							Object sourceData = sourceProperty[i].getReadMethod().invoke(source);
							System.out.println(destData);
							System.out.println(sourceData);
							// 如果目标数据中有数据，但是源数据中无数据，则不进行赋值
							if (destData != null && sourceData == null) {
								break;
							} else {
								// 调用source的getter方法和dest的setter方法
								destProperty[j].getWriteMethod().invoke(dest, sourceProperty[i].getReadMethod().invoke(source));
								break;
							}
						}
					}
				}
			}
		} catch (Exception e) {
			throw new Exception("属性复制失败:" + e.getMessage());
		}
	}
}
