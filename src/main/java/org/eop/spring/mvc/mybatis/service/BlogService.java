package org.eop.spring.mvc.mybatis.service;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Blog;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface BlogService {

	Long saveBlog(Blog blog);
	
	Long updateBlog(Blog blog);
	
	Long removeBlog(Long id);
	
	Blog getBlog(Long id);
	
	Blog getBlogByUser(Long userId);
	
	Blog getBlogByPath(String path);
	
	List<Blog> listAllBlogs();
}
