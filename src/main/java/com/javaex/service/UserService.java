package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.repository.RepositoryUserDAO;
import com.javaex.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
    private RepositoryUserDAO userDAO;


	public int exeJoin(UserVO userVO) {
		return userDAO.insert(userVO);
	}
}

