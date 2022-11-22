package com.Userfind.service;

import java.util.List;
import com.Userfind.dto.UserDTO;

public interface UserService {
	public List<UserDTO> userFind(UserDTO dto) throws Exception;
	public int findId(String id) throws Exception;
}
