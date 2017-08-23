package org.eop.spring.mvc.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.eop.spring.mvc.mybatis.bean.User;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface UserMapper {

	int insertUser(User user);
	
	int updateUser(User user);
	
	int updateUserStatus(@Param("id") Long id, @Param("status") Integer status);
	
	int deleteUser(Long id);
	
	User selectUser(Long id);
	
	User selectUserByLogin(@Param("userName") String userName, @Param("password") String password);
	
	List<User> selectUsers();
	
	List<User> selectUsersByStatus(Integer status);
}
