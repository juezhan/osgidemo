package com.osgidemo.impl;

import com.osgidemo.api.IHelloWorldApi;

/**
 * Created by Administrator on 2017/6/7.
 */
public class HelloWorldImplOne implements IHelloWorldApi {
    public void say() {
        System.out.println("this is HelloWorldImplOne !!!");
    }
}
