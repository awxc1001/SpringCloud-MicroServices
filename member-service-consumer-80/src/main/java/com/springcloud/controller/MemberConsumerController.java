package com.springcloud.controller;

import com.springcloud.entity.Member;
import com.springcloud.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Andre Wang
 * @version 1.0
 */
@RestController
@Slf4j
public class MemberConsumerController {
    public static final String MEMBER_SERVICE_PROVIDER_URL =
            "http://localhost:10000";
    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/member/consumer/save")
    public Result<Member> save(Member member){
        log.info("member consumer: "+member);
        Result result = restTemplate.postForObject(MEMBER_SERVICE_PROVIDER_URL +
                "/member/save", member, Result.class);
        return result;

    }

    @GetMapping("/member/consumer/get/{id}")
    public Result<Member> save(@PathVariable("id") long userId){
        return restTemplate.getForObject(MEMBER_SERVICE_PROVIDER_URL+
                "/member/get/"+userId, Result.class);
    }
}
