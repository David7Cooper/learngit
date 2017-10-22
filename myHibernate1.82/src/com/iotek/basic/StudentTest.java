package com.iotek.basic;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.iotek.basic.projo.Student;
import com.iotek.common.HibernateSessionFactory;

public class StudentTest {
	/**
	 * 主函数
	 */
	public static void main(String[] args) {
//		StudentTest.query();
		StudentTest.add();
//		StudentTest.delete();
//		StudentTest.update();
	}
	/**
	 * 查
	 */
	private static void query() {
//		Configuration config = new Configuration();
//		config.configure("hibernate.cfg.xml");
//		SessionFactory factory = config.buildSessionFactory();
//		Session session = factory.openSession();
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Student stu = (Student) session.get(Student.class, 25L);
			System.out.println(stu);
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
	/**
	 * 增
	 */
	private static void add() {
		Student stu = new Student();
		stu.setName("zhangSanF");
		stu.setAddress("shangHai");
		stu.setGender("male");
		stu.setAge(20);
	
		Session session = HibernateSessionFactory.getSession();
		/*通过Session完成CRUD的操作*/
		Transaction trans = null;
		try {
			/*启动事务*/
			trans = session.beginTransaction();
			/*保存对象*/
			session.save(stu);
			/*提交事务*/
			trans.commit();
		}catch(Exception e){
			e.printStackTrace();
			/*回滚事务*/
			trans.rollback();
		}
	}
	/**
	 * 删
	 */
	private static void delete() {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Student stu = (Student) session.load(Student.class, 21L);
			session.delete(stu);
			trans.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
	/**
	 * 改
	 */
	private static void update() {
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Student stu = (Student) session.load(Student.class, 24L);
			stu.setName("Marry");
			stu.setGender("female");
			session.update(stu);
			trans.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
	/**
	 * END
	 */
}
