package com.iotek.association.one2many;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iotek.association.one2many.proj.Order;
import com.iotek.association.one2many.proj.OrderLine;
import com.iotek.common.HibernateSessionFactory;

public class One2ManyTest {
	public static void main(String[] args) {
		OrderLine ol1 = new OrderLine();
		ol1.setProduct("Jdbc");
		ol1.setPrice(20.5);
		ol1.setQuantity(5L);
		
		OrderLine ol2 = new OrderLine();
		ol2.setProduct("Hibernate");
		ol2.setPrice(45.6);
		ol2.setQuantity(7L);
		
		Order order = new Order();
		order.setOrderedDate(new Date(System.currentTimeMillis()));
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.DAY_OF_MONTH,c1.get(Calendar.DAY_OF_MONTH)+3);
		order.setShippedDate(new Date(c1.getTimeInMillis()));
		//建立双向关联关系
		order.getOrderlines().add(ol1);
		order.getOrderlines().add(ol2);
		ol1.setOrder(order);
		ol2.setOrder(order);
		//总计多少钱
		order.setTotal(ol1.getPrice()*ol1.getQuantity()+ol2.getPrice()*ol2.getQuantity());
		Session session =  HibernateSessionFactory.getSession();
		Transaction trans = null;
		try {
			trans = session.beginTransaction();
			/*保存订单的时候会级联保存*/
			session.save(order);
			trans.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			trans.rollback();
		}
	}
}
