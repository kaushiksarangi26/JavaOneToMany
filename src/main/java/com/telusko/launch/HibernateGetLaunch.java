package com.telusko.launch;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Answer;
import com.telusko.model.Question;

public class HibernateGetLaunch {

	public static void main(String[] args) {
		
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		
        Question question=   session.get(Question.class, 1);
        System.out.println(question);
        
        
		
		session.close();

	}

}
