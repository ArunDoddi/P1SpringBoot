package com.onmobile.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.onmobile.bean.Login;
import com.onmobile.bean.TableDat;
import com.onmobile.service.P1Service;

@RestController
@CrossOrigin
public class P1Controller {

	@Autowired
	P1Service p1Service;
	
	@RequestMapping(value="checkLogin", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
	public String checkLogin(@RequestBody Login ll) {
		System.out.println(ll);
		System.out.println(ll.getUserId());
		System.out.println(ll.getPass());
		String message = p1Service.checkUser(ll);
		System.out.println(message);
		return message;
	}
	
	@RequestMapping(value="insertDb", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
	public String insertDb(@RequestBody TableDat tb) {
		System.out.println(tb);
		String message = p1Service.checkInsrtDb(tb);
		System.out.println(message);
		return message;
	}
}
