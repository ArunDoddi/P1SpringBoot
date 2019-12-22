package com.onmobile.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.TransactionManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onmobile.bean.Login;
import com.onmobile.bean.TableDat;

@Repository
public class P1Dao {
	
	@Autowired
	EntityManagerFactory emf;
	
	public boolean checkUser(Login ll) {
		boolean flag = false;
		EntityManager manager = emf.createEntityManager();
		Login tempLogin = (Login)manager.find(Login.class, ll.getUserId());
		if(tempLogin != null) {
			if(tempLogin.getPass().equals(ll.getPass())) {
				return true;
			}
		}
		return flag;
	}
	
	public boolean dataTab(TableDat tb){
		boolean flag = false;
		EntityManager manager = emf.createEntityManager();
		EntityTransaction transaction =  manager.getTransaction();
		transaction.begin();
		manager.persist(tb);
		transaction.commit();
		TableDat temptb = (TableDat)manager.find(TableDat.class,tb.getiId());
		if(temptb.getiId() > 0){
		return true;
		}
		return flag;

	}
	
//	public boolean insertUser(Login ll) {
//		EntityManager manager = emf.createEntityManager();
//		EntityTransaction transaction =  manager.getTransaction();
//		transaction.begin();
//			manager.persist(ll);
//		transaction.commit();
//		
//		
//	}
	
}
