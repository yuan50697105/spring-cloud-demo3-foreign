package com.example.cloudserviceconsumerr.service;

import com.example.cloudserviceconsumerr.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-user")
public interface UserService {
    @RequestMapping(value = "/user/{id}")
    public User get(@PathVariable(value = "id") long id);
}
