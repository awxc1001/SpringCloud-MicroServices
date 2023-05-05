package com.springcloud.controller;


import com.springcloud.entity.Member;
import com.springcloud.entity.Result;
import com.springcloud.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Andre Wang
 * @version 1.0
 */
@Slf4j
@RestController
public class MemberController {

    @Resource
    private MemberService memberService;

    @PostMapping("/member/save")
    //form uplod no @requestBody, only json need to
    public Result save(@RequestBody Member member){
        log.info("member serviceProvider: "+member);
        int save = memberService.save(member);
        if(save > 0){
            return Result.success("member added sucessful!",save);
        }else{
            return Result.error("401","member added failed!");
        }
    }

        //查询的方法/接口
    //老师这里使用url占位符+@PathVariable
    @GetMapping("/member/get/{id}")
    public Result getMemberById(@PathVariable("id") Long id, HttpServletRequest request) {

        //String color = request.getParameter("color");
        //String address = request.getParameter("address");
        //模拟超时, 休眠5s
        //try {
        //    TimeUnit.MILLISECONDS.sleep(5000);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}

        Member member = memberService.queryMemberById(id);

        //使用Result把查询到的结果返回
        if (member != null) {
            //return Result.success("查询会员成功 member-service-provider-10000 " + color + "-" + address, member);
            return Result.success("查询会员成功 member-service-provider-10000", member);
        } else {
            return Result.error("402", "ID= " + id + "不存在");
        }

    }


}
