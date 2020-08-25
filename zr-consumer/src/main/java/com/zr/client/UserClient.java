package com.zr.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "zr-provider")
public interface UserClient {

    @RequestMapping("user/{id}")
    String findById(@PathVariable Long id);
}
