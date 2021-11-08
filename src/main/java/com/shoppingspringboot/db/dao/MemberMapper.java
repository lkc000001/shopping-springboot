package com.shoppingspringboot.db.dao;

import com.shoppingspringboot.db.model.Member;

public interface MemberMapper {
	int insertMember(Member member);
	
	Member questMember(Integer id);
}
