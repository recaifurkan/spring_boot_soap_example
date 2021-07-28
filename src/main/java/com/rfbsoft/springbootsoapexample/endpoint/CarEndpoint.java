package com.rfbsoft.springbootsoapexample.endpoint;

import com.rfbsoft.spring_boot_soap_example.GetCarRequest;
import com.rfbsoft.spring_boot_soap_example.GetCarResponse;
import com.rfbsoft.springbootsoapexample.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CarEndpoint {

    @Autowired
    private CarService carService;


    @PayloadRoot(namespace = "http://rfbsoft.com",
            localPart = "getCarRequest")
    @ResponsePayload
    public GetCarResponse getCarRequest(@RequestPayload GetCarRequest request) {
        GetCarResponse response = new GetCarResponse();
        response.setCar(carService.getCars(request.getName()));
        return response;
    }
}
