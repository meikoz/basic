package com.dintech.android.variants.api;

import com.dintech.architecture.http.CallbackEvent;
import com.dintech.architecture.http.Network;

import java.util.Map;

public class OkHttpNetworkImpl implements Network {

    @Override
    public <T> void get(String url, CallbackEvent<T> callbackEvent) {
        //TODO OKHttp GET REQUEST
        callbackEvent.fail("OKHttp GET REQUEST");
        System.out.print("OKHttp GET REQUEST");
    }

    @Override
    public <T> void post(String url, Map<String, Object> paramMaps, CallbackEvent<T> callbackEvent) {
        //TODO OKHttp POST REQUEST
        System.out.print("OKHttp POST REQUEST");
    }
}