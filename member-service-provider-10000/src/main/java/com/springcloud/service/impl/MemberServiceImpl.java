package com.springcloud.service.impl;

import com.springcloud.dao.MemberDao;
import com.springcloud.entity.Member;
import com.springcloud.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Andre Wang
 * @version 1.0
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberDao memberDao;

    @Override
    public Member queryMemberById(Long id) {
        return memberDao.queryMemberById(id);
    }

    @Override
    public int save(Member member) {
        return memberDao.save(member);
    }
}
