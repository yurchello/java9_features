package com.yurchello.impl.ru;

import com.yurchello.moduleTest.ServiceModule;

public class ServiceRUImpl implements ServiceModule {
    public String doService(String message) {
        return "RU Impl " + message;
    }
}
