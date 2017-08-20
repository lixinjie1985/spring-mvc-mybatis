package org.eop.spring.mvc.mybatis.mapper;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.User;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface UserMapper {

	int insertUser(User user);
	
	User selectUser(Long id);
	
	User selectUserByLogin(String userName, String password);
	
	int updateUser(User user);
	
	int updateUserStatus(Long id, Integer status);
	
	int deleteUser(Long id);
	
	List<User> selectUsers();
	
	List<User> selectUsersByStatus(Integer status);
}
