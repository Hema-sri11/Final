package com.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.HibernateUtil;

public class GetDetailApp {

	public static void main(String[] args) {
		Session session = null;
		int id = 1;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();

			if (session != null) {
				Student student = session.get(Student.class, id);
				if (student != null)
					System.out.println(student);
				else
					System.out.println("Record not found for the given id :: " + id);
			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();

		}

	}

}
