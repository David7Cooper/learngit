package com.iotek.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static Configuration config;
	private static SessionFactory factory;
	/*ThreadLocal中维护了一个缓存，放置配对的当前线程和Session对象*/
	private static ThreadLocal<Session> local = new ThreadLocal<>();
	
	static {
		config = new Configuration();
		config.configure("hibernate.cfg.xml");
		factory = config.buildSessionFactory();
	}
	/**
	 * 获取Session对象
	 */
	public static Session getSession() {
		/*获取当前线程绑定的Session对象*/
		Session session = local.get();
		if(session == null) {
			session = factory.openSession();
			/*将新创建的Session对象放置到ThreadLocal维护的缓存中*/
			local.set(session);
		}
		return session;
	}
	/**
	 * 关闭Session对象
	 */
	public static void closeSession() {
		Session session = local.get();
		if(session != null) {
			session.close();
			/*将当前线程与Session对象借出绑定*/
			local.set(null);
		}
	}
	/**
	 * END
	 */
}
