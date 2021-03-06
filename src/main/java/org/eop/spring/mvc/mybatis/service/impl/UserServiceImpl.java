package org.eop.spring.mvc.mybatis.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.eop.spring.mvc.mybatis.bean.User;
import org.eop.spring.mvc.mybatis.mapper.UserMapper;
import org.eop.spring.mvc.mybatis.mapper.param.PageParam;
import org.eop.spring.mvc.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lixinjie
 * @since 2017-08-20
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Long saveUser(User user) {
		userMapper.insertUser(user);
		return user.getId();
	}

	@Override
	public Long updateUser(User user) {
		userMapper.updateUser(user);
		return user.getId();
	}

	@Override
	public Long updateUserStatus(Long id, Integer status) {
		userMapper.updateUserStatus(id, status);
		return id;
	}

	@Override
	public Long removeUser(Long id) {
		userMapper.deleteUser(id);
		return id;
	}

	@Override
	public User getUser(Long id) {
		return userMapper.selectUser(id);
	}

	@Override
	public User getUserByLogin(String userName, String password) {
		return userMapper.selectUserByLogin(userName, password);
	}

	@Override
	public List<User> listAllUsers() {
		return userMapper.selectUsers();
	}

	@Override
	public List<User> listAllUsers(int pageNum, int pageSize) {
		return userMapper.selectUsers(pageNum, pageSize);
	}
	
	@Override
	public List<User> listAllUsers(PageParam pageParam) {
		return userMapper.selectUsers(pageParam);
	}
	
	@Override
	public List<User> listUsersByStatus(Integer status) {
		return userMapper.selectUsersByStatus(status);
	}
	
	@Override
	public List<User> listUsersByStatus(Integer status, int pageNum, int pageSize) {
		return userMapper.selectUsersByStatus(status, pageNum, pageSize);
	}
	
	@Override
	public List<User> listUsersByStatus(Integer status, PageParam pageParam) {
		return userMapper.selectUsersByStatus(status, pageParam);
	}
	
	@Override
	public List<User> listUsersByStatus(Integer status, RowBounds rowBounds) {
		return userMapper.selectUsersByStatus(status, rowBounds);
	}
}
