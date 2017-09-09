package org.eop.spring.mvc.mybatis.service;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.User;
import org.eop.spring.mvc.mybatis.mapper.param.PageParam;

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
	
	List<User> listAllUsers(int pageNum, int pageSize);
	
	List<User> listAllUsers(PageParam pageParam);
	
	List<User> listUsersByStatus(Integer status);
	
	List<User> listUsersByStatus(Integer status, int pageNum, int pageSize);
	
	List<User> listUsersByStatus(Integer status, PageParam pageParam);
}
