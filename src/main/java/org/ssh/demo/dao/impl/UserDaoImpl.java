package org.ssh.demo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.ssh.demo.dao.UserDao;

/**
 * @Desc: TODO
 * @author: GanHaiqiang
 * @date: 2020-05-28 09:25
 */
@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Resource
	public final void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public List<Object[]> getAllUser() {
		return getSession().createSQLQuery("select * from user").list();
	}
}
