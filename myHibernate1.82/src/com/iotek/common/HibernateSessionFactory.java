package com.iotek.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static Configuration config;
	private static SessionFactory factory;
	
	static {
		config = new Configuration();
		config.configure("hibernate.cfg.xml");
		factory = config.buildSessionFactory();
	}
	/**
	 * 获取Session对象
	 */
	public static Session getSession() {
		/*这种方法需要在Hibernate.cfg.xml文件中配置*/
		Session session = factory.getCurrentSession();
		return session;
	}
	/**
	 * END
	 */
}
