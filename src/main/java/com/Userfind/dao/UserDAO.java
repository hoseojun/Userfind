package com.Userfind.dao;

import java.util.List;

import com.Userfind.dto.UserDTO;

public interface UserDAO {
	public List<UserDTO> userFind(UserDTO dto) throws Exception;
	public int findId(String id) throws Exception;
}
