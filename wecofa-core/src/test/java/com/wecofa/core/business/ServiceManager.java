package com.wecofa.core.business;


import com.wecofa.core.business.serviceInterface.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ServiceManager {

    private Map<String, ServiceInterface> serviceMap;

    public ServiceManager(List<ServiceInterface> serviceInterfaces){
        this.serviceMap = serviceInterfaces.stream()
                .collect(Collectors.toMap(ServiceInterface::getServiceId, Function.identity()));
    }

    public void executeService(){
        this.serviceMap.forEach(
                (s, serviceInterface) -> serviceInterface.execute()
        );
    }
}
