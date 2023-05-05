package com.springcloud.dao;

import com.springcloud.entity.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Andre Wang
 * @version 1.0
 */
@Mapper
public interface MemberDao {

    //定义方法
    //根据id返回member数据
    public Member queryMemberById(Long id);
    //添加member
    public int save(Member member);
}
