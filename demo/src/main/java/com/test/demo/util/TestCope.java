package com.test.demo.util;

import org.springframework.beans.BeanUtils;
import org.springframework.cglib.beans.BeanCopier;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/17 10:05
 */
public class TestCope {
    public static void Copy(Object source, Object dest) throws Exception {
        // 获取属性
        BeanInfo sourceBean = Introspector.getBeanInfo(source.getClass(), Object.class);
        PropertyDescriptor[] sourceProperty = sourceBean.getPropertyDescriptors();

        BeanInfo destBean = Introspector.getBeanInfo(dest.getClass(), Object.class);
        PropertyDescriptor[] destProperty = destBean.getPropertyDescriptors();

        try {
            for (int i = 0; i < sourceProperty.length; i++) {

                for (int j = 0; j < destProperty.length; j++) {

                    if (sourceProperty[i].getName().equals(destProperty[j].getName()) && sourceProperty[i].getPropertyType() == destProperty[j].getPropertyType()) {
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
        } catch (Exception e) {
            throw new Exception("属性复制失败:" + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        AppointmentOrderParam appointmentOrderParam = new AppointmentOrderParam();
//        appointmentOrderParam.setId(1);
        appointmentOrderParam.setName("小明");
        appointmentOrderParam.setSex("男");
        AppointmentOrder appointmentOrder = new AppointmentOrder();
        appointmentOrder.setId(1);
        appointmentOrderParam.setSex("女");
        TestCope.Copy(appointmentOrderParam, appointmentOrder,true);
//        BeanUtils.copyProperties(appointmentOrder,appointmentOrderParam);
//        BeanCopier beanCopier = BeanCopier.create(AppointmentOrderParam.class,AppointmentOrder.class,false);
//        beanCopier.copy(appointmentOrderParam,appointmentOrder,null);
        System.out.println(appointmentOrderParam);
        System.out.println(appointmentOrder);
    }

    public static void Copy1(Object source, Object dest) throws Exception {
        // 获取属性
        BeanInfo sourceBean = Introspector.getBeanInfo(source.getClass(), Object.class);
        PropertyDescriptor[] sourceProperty = sourceBean.getPropertyDescriptors();

        BeanInfo destBean = Introspector.getBeanInfo(dest.getClass(), Object.class);
        PropertyDescriptor[] destProperty = destBean.getPropertyDescriptors();

        try {
            for (int i = 0; i < sourceProperty.length; i++) {

                for (int j = 0; j < destProperty.length; j++) {

                    if (sourceProperty[i].getName().equals(destProperty[j].getName()) && sourceProperty[i].getPropertyType() == destProperty[j].getPropertyType()) {
//                        Object destData = destProperty[j].getReadMethod().invoke(dest);
//                        Object sourceData = sourceProperty[i].getReadMethod().invoke(source);
//                        System.out.println(destData);
//                        System.out.println(sourceData);
//                        // 如果目标数据中有数据，但是源数据中无数据，则不进行赋值
//                        if (destData != null && sourceData == null) {
//                            break;
//                        } else {
                        // 调用source的getter方法和dest的setter方法
                        destProperty[j].getWriteMethod().invoke(dest, sourceProperty[i].getReadMethod().invoke(source));
                        break;
//                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new Exception("属性复制失败:" + e.getMessage());
        }
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
