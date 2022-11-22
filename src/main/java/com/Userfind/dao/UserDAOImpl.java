package com.Userfind.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Userfind.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	SqlSession sqlSession;

	private static final String nameSpace = "com.config.UserMapper";

	@Override
	public List<UserDTO> userFind(UserDTO dto) throws Exception {
		return sqlSession.selectList(nameSpace + ".userFind", dto);
	}
	
	@Override
	public int findId(String id) throws Exception {
		return sqlSession.selectOne(nameSpace + ".findId", id);
	}

}
