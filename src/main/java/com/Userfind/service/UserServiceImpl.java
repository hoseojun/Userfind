package com.Userfind.service;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Userfind.dao.UserDAO;
import com.Userfind.dto.UserDTO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO dao;

	@Override
	public List<UserDTO> userFind(UserDTO dto) throws Exception {
		return dao.userFind(dto);
	}
	
	@Override
	public int findId(String id) throws Exception {
		return dao.findId(id);
	}

}
