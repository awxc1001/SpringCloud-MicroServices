package com.springcloud;

import com.springcloud.dao.MemberDao;
import com.springcloud.entity.Member;
import com.springcloud.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author Andre Wang
 * @version 1.0
 */
@SpringBootTest
@Slf4j
public class MemberAppTest {
    @Resource
    private MemberDao memberDao;
    @Resource
    private MemberService memberService;

    //must be junit test api
    @Test
    public void queryMemberById(){
        Member member = memberDao.queryMemberById(1L);
        log.info("member~~{}", member);
    }

    @Test
    public void save(){
        Member member = new Member(null,"Alistar","abc123","23212313","ali@123.com",1);
        int affected = memberDao.save(member);
        log.info("affected~~{}", affected);
    }
}
