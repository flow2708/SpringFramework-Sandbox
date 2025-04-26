package com.flow;

import org.springframework.beans.factory.BeanFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, URISyntaxException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.instantiate("com.flow");
        ProductService productService = (ProductService) beanFactory.getBean("productService");
        System.out.println(productService);//ProductService@3d71d552
        beanFactory.populateProperties();
        }
    }