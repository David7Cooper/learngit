package com.iotek.association.many2many;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iotek.association.many2many.proj.Engineer;
import com.iotek.association.many2many.proj.Technology;
import com.iotek.common.HibernateSessionFactory;

public class Many2ManyTest {
	public static void main(String[] args) {
		Engineer engineer1 = new Engineer();
		engineer1.setName("zhangsan");
		engineer1.setAge(20);
		engineer1.setCompany("iotek");
		engineer1.setGender("male");
		
		Engineer engineer2 = new Engineer();
		engineer1.setName("lisi");
		engineer1.setAge(20);
		engineer1.setCompany("iotek");
		engineer1.setGender("male");
		
		Technology technology1 = new Technology();
		technology1.setName("hibernate");
		technology1.setCategory("Java");
		
		Technology technology2 = new Technology();
		technology1.setName("hibernate");
		technology1.setCategory("xml");
		
		/*建立他们双向的关联关系*/
		engineer1.getTechnologies().add(technology1);
		engineer1.getTechnologies().add(technology2);
		engineer2.getTechnologies().add(technology1);
		engineer2.getTechnologies().add(technology2);
		
		technology1.getEngineers().add(engineer1);
		technology1.getEngineers().add(engineer2);
		technology2.getEngineers().add(engineer1);
		technology2.getEngineers().add(engineer2);
		
		Session session = HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			session.save(engineer1);
			session.save(engineer2);
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
}
