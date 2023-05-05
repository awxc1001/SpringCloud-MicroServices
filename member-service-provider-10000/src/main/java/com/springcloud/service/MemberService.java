package com.springcloud.service;

import com.springcloud.entity.Member;

/**
 * @author Andre Wang
 * @version 1.0
 */
public interface MemberService {
    Member queryMemberById(Long id);

    int save(Member member);
}
