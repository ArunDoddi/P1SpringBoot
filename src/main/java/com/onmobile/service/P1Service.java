package com.onmobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onmobile.DAO.P1Dao;
import com.onmobile.bean.Login;
import com.onmobile.bean.TableDat;

@Service
public class P1Service {
	
	@Autowired
	P1Dao p1Dao;
	
	public String checkUser(Login ll) {
		if(p1Dao.checkUser(ll)) {
			return "success";
		}
		else {
			return "failure";
		}
	}
	
	public String checkInsrtDb(TableDat tb) {
		if(p1Dao.dataTab(tb)) {
			return "success";
		}
		else {
			return "failure";
		}
	}
}
