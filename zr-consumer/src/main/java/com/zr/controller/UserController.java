package com.zr.controller;

import com.zr.bean.User;
import com.zr.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("consumer/user")
public class UserController {

    /*@Autowired
    private RestTemplate restTemplate;*/

    /*@Autowired
    private DiscoveryClient discoveryClient;*/

    @Autowired
    private UserClient userClient;

    @RequestMapping
    public String find(@RequestParam Long id){
     /*   String user=restTemplate.getForObject("http://localhost:8081/user/"+id, String.class);*/
       /* List<ServiceInstance> instances = discoveryClient.getInstances("zr-provider");
        ServiceInstance instance = instances.get(0);
        String user=restTemplate.getForObject("http://"+instance.getHost()+":"+instance.getPort()+"/user/"+id, String.class);
*/
        String user = userClient.findById(id);
        return user;

    }
}
