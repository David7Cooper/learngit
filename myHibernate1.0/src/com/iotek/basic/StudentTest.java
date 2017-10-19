package com.iotek.basic;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.iotek.basic.projo.Student;

public class StudentTest {
	/**
	 * 主函数
	 */
	public static void main(String[] args) {
		StudentTest.query();
//		StudentTest.add();
//		StudentTest.delete();
//		StudentTest.update();
	}
	/**
	 * 查
	 */
	private static void query() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			Student stu = (Student) session.get(Student.class, 24L);
			System.out.println(stu);
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}finally {
			session.close();
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
		/*创建Configuration对象，读取指定的Hibernate配置文件*/
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
//		config.addResource("com/iotek/basic/projo/Student.hbm.xml");Student.hbm.xml的另一种映射
		/*创建SessionFactory对象*/
		SessionFactory factory = config.buildSessionFactory();
//		第二种方法获取SessionFactory对象
//		ServiceRegistryBuilder builder = new ServiceRegistryBuilder();
//		builder.applySettings(config.getProperties());
//		ServiceRegistry serviceRegistry = builder.buildServiceRegistry();
//		SessionFactory factory = config.buildSessionFactory(serviceRegistry);
		/*创建Session对象，获取数据库的连接*/
		Session session = factory.openSession();
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
		}finally {
			/*关闭Session*/
			session.close();
		}
	}
	/**
	 * 删
	 */
	private static void delete() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
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
		}finally {
			session.close();
		}
	}
	/**
	 * 改
	 */
	private static void update() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
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
		}finally {
			session.close();
		}
	}
	/**
	 * END
	 */
}
