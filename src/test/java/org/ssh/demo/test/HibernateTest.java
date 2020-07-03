package org.ssh.demo.test;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ssh.demo.pojo.User;

import com.alibaba.fastjson.JSON;

/**
 * @Desc: TODO
 * @author: GanHaiqiang
 * @date: 2020-07-03 13:27
 */
public class HibernateTest {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate-test.cfg.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

//		User user = (User) session.get(User.class, Long.valueOf(3));
//		System.out.println(JSON.toJSONString(user, true));

//		Query query = session.createQuery("from User");
//		System.out.println(JSON.toJSONString(query.list(), true));

//		String sql = "select * from user";
//		SQLQuery sqlQuery = session.createSQLQuery(sql);
//		System.out.println(JSON.toJSONString(sqlQuery.list(), true));

		session.getTransaction().commit();

		session.close();
	}
}
