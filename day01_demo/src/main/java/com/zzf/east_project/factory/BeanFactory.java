package com.zzf.east_project.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 21:57
 * @description
 * 建立一个bean工厂模式，实现解耦
 * 第一个：用配置文件配置service和dao
 * 第二个：通过度配置文件，反射创建对象
 */
public class BeanFactory {
    //定义一个properties对象
    private static Properties props;
    /**
     * 定义单例容器
     */
    private static Map<String,Object> beans;

    //使用静态代码块为properties文件赋值
    static {
        //实例化对象
        props=new Properties();
        //获取Properties文件的流对象
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            props.load(in);
            beans=new HashMap<String,Object>();
            Enumeration<Object> keys = props.keys();
            while (keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String path = props.getProperty(key);
                Object o = null;
                try {
                    o = Class.forName(path).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                beans.put(key,o);
            }
        } catch (IOException e) {
            throw new ExceptionInInitializerError("对象初始化失败");
        }
    }
//    public static Object getBean(String beanname)  {
//        String beanpath = props.getProperty(beanname);
//        Object o = null;
//        try {
//            o = Class.forName(beanpath).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return o;
//    }

    /**
     * 单例模式
     * @param beanname
     * @return
     */
    public static Object getBean(String beanname) {
    Object o = beans.get(beanname);
    return o;
}
}

