package com.wecofa.core.business.serviceImpl;

import com.wecofa.core.business.serviceInterface.ServiceInterface;
import org.springframework.stereotype.Service;

@Service
public class ServiceB implements ServiceInterface {

    private String serviceId="ServiceB";

    @Override
    public String getServiceId() {
        return this.serviceId;
    }

    @Override
    public void execute() {
        System.out.printf("service Id [%s]\n",this.getServiceId());

    }
}
