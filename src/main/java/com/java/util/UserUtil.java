package com.java.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserUtil {
	static SessionFactory sf;
	public static SessionFactory getSessionFactory(){
		
		if(sf==null){
			synchronized(SessionFactory.class){
				if(sf==null)
					sf = new Configuration().configure().buildSessionFactory();
			}
		}
		return sf;
	}

}