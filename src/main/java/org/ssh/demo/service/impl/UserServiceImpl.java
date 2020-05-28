package org.ssh.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.ssh.demo.dao.UserDao;
import org.ssh.demo.service.UserService;

/**
 * @Desc: TODO
 * @author: GanHaiqiang
 * @date: 2020-05-28 09:33
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	@Override
	public List<Object[]> getAllUser() {
		return userDao.getAllUser();
	}
}
