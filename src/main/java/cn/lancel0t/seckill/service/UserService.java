package cn.lancel0t.seckill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.lancel0t.seckill.dao.UserDao;
import cn.lancel0t.seckill.domain.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public User getById(int id) {
		return userDao.getById(id);
	}

	public int addUser(User user) {
		return userDao.insert(user);
	}

	@Transactional
	public Boolean transaction() {
		User user1 = new User();
		user1.setName("name4");
		userDao.insert(user1);

		User user2 = new User();
		user2.setName("name1");
		userDao.insert(user2);

		return true;
	}
}
