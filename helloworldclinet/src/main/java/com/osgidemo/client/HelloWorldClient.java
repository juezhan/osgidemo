package com.osgidemo.client;

import com.osgidemo.api.IHelloWorldApi;

/**
 * Created by Administrator on 2017/6/7.
 */
public class HelloWorldClient  {
    IHelloWorldApi iHelloWorldApi;
    public void echo(){
        iHelloWorldApi.say();
    }
    public void setiHelloWorldApi(IHelloWorldApi iHelloWorldApi){
        this.iHelloWorldApi = iHelloWorldApi;
    }
}
