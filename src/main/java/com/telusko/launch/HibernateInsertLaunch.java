package com.telusko.launch;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.telusko.model.Answer;
import com.telusko.model.Question;

public class HibernateInsertLaunch {

	public static void main(String[] args) {
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Answer a1 = new Answer();
		a1.setId(1);
		a1.setAnswer("Balck");
		
		Answer a2 = new Answer();
		a2.setId(2);
		a2.setAnswer("Red");
		
	    Question q1 = new Question();
	    q1.setId(1);
	    q1.setQuestion("What's your fav colour");
		
		a1.setQuestion(q1);
		a2.setQuestion(q1);
		
		List<Answer> answers = new ArrayList<>();
		
		answers.add(a1);
		answers.add(a2);
		
		q1.setAnswerList(answers);
		
		session.persist(q1);
		
		transaction.commit();
	
		
		session.close();
		

	}

}
