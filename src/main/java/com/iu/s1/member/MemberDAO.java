package com.iu.s1.member;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s1.bankbook.BankBookDTO;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s1.member.MemberDAO.";
	
	//mypage
			public MemberDTO mypage(MemberDTO memberDTO)throws Exception{
				
				return sqlSession.selectOne(NAMESPACE+"mypage", memberDTO);
			}
	
	//select
			public MemberDTO login(MemberDTO memberDTO) throws Exception{
				
				return sqlSession.selectOne(NAMESPACE+"login", memberDTO);
			}
	
	
	//insert
			public int join(MemberDTO memberDTO) throws Exception{
				
				return sqlSession.insert(NAMESPACE+"join", memberDTO);
			}
			
}
