package com.iotek.association.one2one;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iotek.association.one2one.proj.Passport;
import com.iotek.association.one2one.proj.Person;
import com.iotek.common.HibernateSessionFactory;
/**
 * 级联操作：
 * 对一个表进行操作另一个表也随之改变
 * @author Administrator
 *
 */
public class One2OneTest {
	public static void main(String[] args) {
		One2OneTest.add();
//		One2OneTest.remove();
//		One2OneTest.query();
//		One2OneTest.update();
	}
	/**
	 * Create
	 */
	private static void add() {
		Person p = new Person();
		p.setName("Jack11111");
		p.setGender("male");
		p.setAge(20);
		
		Passport pp = new Passport();
		pp.setBh("G45672348");
		/*建立双向关联关系*/
		p.setPassport(pp);
		pp.setPerson(p);
		
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			/*保存Person对象同时级联保存Passport对象*/
			session.save(p);
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
	/**
	 * Retrieve
	 */
	private static void query() {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Person person = (Person) session.get(Person.class, 1L);
			System.out.println(person.toString());
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
	/**
	 * Update
	 */
	private static void update() {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Person person = (Person) session.get(Person.class, 1L);
			person.setName("Cooper");
			person.getPassport().setBh("G123");
			session.update(person);
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
	/**
	 * delete
	 */
	private static void remove() {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
//			Person person = (Person) session.get(Person.class, 1L);
			Passport passport = (Passport) session.get(Passport.class, 2L);
			session.delete(passport);
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
