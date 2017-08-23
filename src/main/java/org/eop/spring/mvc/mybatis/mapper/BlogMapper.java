package org.eop.spring.mvc.mybatis.mapper;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Blog;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface BlogMapper {

	int insertBlog(Blog blog);
	
	int updateBlog(Blog blog);
	
	int deleteBlog(Long id);
	
	Blog selectBlog(Long id);
	
	Blog selectBlogByUser(Long userId);
	
	Blog selectBlogByPath(String path);
	
	List<Blog> selectBlogs();
}
