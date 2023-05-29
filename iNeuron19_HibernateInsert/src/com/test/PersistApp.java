package com.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.HibernateUtil;

public class PersistApp {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Student student = null;
		try {
			session = HibernateUtil.getSession();

			if (session != null) {
				transaction = session.beginTransaction();
			}
			if (transaction != null) {
				student = new Student();

				student.setSid(11);
				student.setSname("Kohli");
				student.setSaddress("RCB");
				student.setSage(38);

				session.persist(student);
				flag = true;

			}
		} catch (HibernateException he) {
			he.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("data save to database ");
				System.out.println("Inserted Data : " + student);
			} else {
				transaction.rollback();
				System.out.println("data failed to save");
			}
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();

		}

	}

}
