package com.javaex.repository;

import org.apache.jasper.compiler.Node.ELExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.UserVO;

@Repository
public class RepositoryUserDAO {

    @Autowired
    private ELExpression sqlSession;

    // 회원가입
    public int insert(UserVO userVO) {
        System.out.println("RepositoryUserDAO.insert()");
   
        return sqlSession.insert("user.insert", userVO);
    }

    // 아이디 중복 확인
    public UserVO selectById(String id) {
        System.out.println("RepositoryUserDAO.selectById()");
        return sqlSession.selectOne("user.selectById", id);
    }
}