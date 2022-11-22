package com.Userfind.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Userfind.dto.UserDTO;
import com.Userfind.service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/idchk")
    public ModelAndView userFind(@ModelAttribute UserDTO dto) throws Exception {
    	ModelAndView mav = new ModelAndView();
        mav.setViewName("/Userfindpage");
        List<UserDTO> userList = service.userFind(dto);
        mav.addObject("userFind", userList); 
        return mav;
    }
    
    @RequestMapping("/findid")
    public ModelAndView findId(@RequestParam String id) throws Exception {
        int result = 0;
        if (service.findId(id) != 0) {
            result = 1;
        }
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName("/Userfind");
        if (result == 0) {
        	mav.addObject("message", "찾기 결과 : no");
        } else {
        	mav.addObject("message", "찾기 결과 : ok");
        }
        
    	return mav;
    }

}
