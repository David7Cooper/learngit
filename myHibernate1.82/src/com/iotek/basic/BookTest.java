package com.iotek.basic;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iotek.basic.projo.Book;
import com.iotek.common.HibernateSessionFactory;

public class BookTest {
	public static void main(String[] args) {
		BookTest.assigned();
	}
	/**
	 * UUID标识符
	 */
	private static void uuid() {
		Book book = new Book();
		book.setName("Hibernate");
		book.setAuthor("iotek");
		book.setPrice(46.56);
		
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			session.save(book);
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
	/**
	 * assigned标识符
	 */
	private static void assigned() {
		Book book = new Book();
		book.setIsbn("qwer");
		book.setName("Hibernate");
		book.setAuthor("iotek");
		book.setPrice(46.56);
		
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			session.save(book);
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
	/**
	 * END
	 */
}
