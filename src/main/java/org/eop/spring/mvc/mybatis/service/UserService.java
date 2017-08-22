package org.eop.spring.mvc.mybatis.service;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.User;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface UserService {

	Long saveUser(User user);
	
	Long updateUser(User user);
	
	Long updateUserStatus(Long id, Integer status);
	
	Long removeUser(Long id);
	
	User getUser(Long id);
	
	User getUserByLogin(String userName, String password);
	
	List<User> listAllUsers();
	
	List<User> listUsersByStatus(Integer status);
}
