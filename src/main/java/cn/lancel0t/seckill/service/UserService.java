package cn.lancel0t.seckill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lancel0t.seckill.dao.UserDao;
import cn.lancel0t.seckill.domain.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public User getById(int id) {
		return userDao.getById(id);
	}
}
