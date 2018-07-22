package com.java.business;

import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.java.hibercrud.User;
import com.java.util.UserUtil;

import constants.AppLevelConstants;

public class UserLogin {

	public String authenticateUser(String uname, String pwd){
		String msg=null;
		if("NA".equals(uname))
			return AppLevelConstants.USERNAME_EMPTY;
		if("NA".equals(pwd))
			return AppLevelConstants.PASSWORD_EMPTY;
		else{
			SessionFactory sf=UserUtil.getSessionFactory();
			Session session=sf.openSession();
			Transaction tr = session.beginTransaction();
			CriteriaQuery<User> criteriaQuery = session.getCriteriaBuilder().createQuery(User.class);
		        criteriaQuery.from(User.class);

		        List<User> allUsers = session.createQuery(criteriaQuery).getResultList();
		    Iterator<User> itr = allUsers.iterator();
		    while(itr.hasNext()){
		    	User u = itr.next();
		    	if(u.getUserName().equals(uname)){
		    		if(u.getPassword().equals(pwd))
		    			return AppLevelConstants.SUCCESS;
		    		else
		    			return AppLevelConstants.INCORRECT_PASSWORD;
		    	}else{
		    		msg = AppLevelConstants.INCORRECT_USERNAME;
		    	}
		    }
			tr.commit();
		}
		return msg;
			
	}
	/*public static void main(String []args){
		SessionFactory sf=UserUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr = session.beginTransaction();
		User u1=new User(1,"Admin","admin");
		User u2=new User(2,"user","user123");
		session.save(u1);
		session.save(u2);
		tr.commit();
		
		//authenticateUser("Admin","admin");
		System.out.println("Successful");
	}*/
}

