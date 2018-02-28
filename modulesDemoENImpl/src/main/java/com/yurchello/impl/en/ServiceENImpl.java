package com.yurchello.impl.en;

import com.yurchello.moduleTest.ServiceModule;

public class ServiceENImpl implements ServiceModule {
    public String doService(String message) {
        return "EN Impl " + message;
    }
}
