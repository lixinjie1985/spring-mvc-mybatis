package org.eop.spring.mvc.mybatis.service;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Blog;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface BlogService {

	Long saveBlog(Blog blog);
	
	Blog getBlog(Long id);
	
	Blog getBlogByUser(Long userId);
	
	Long updateBlog(Blog blog);
	
	Long removeBlog(Long id);
	
	List<Blog> listAllBlogs();
}
