package org.eop.spring.mvc.mybatis.service.impl;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Blog;
import org.eop.spring.mvc.mybatis.mapper.BlogMapper;
import org.eop.spring.mvc.mybatis.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lixinjie
 * @since 2017-08-23
 */
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogMapper blogMapper;
	
	@Override
	public Long saveBlog(Blog blog) {
		blogMapper.insertBlog(blog);
		return blog.getId();
	}

	@Override
	public Long updateBlog(Blog blog) {
		blogMapper.updateBlog(blog);
		return blog.getId();
	}

	@Override
	public Long removeBlog(Long id) {
		blogMapper.deleteBlog(id);
		return id;
	}

	@Override
	public Blog getBlog(Long id) {
		return blogMapper.selectBlog(id);
	}

	@Override
	public Blog getBlogByUser(Long userId) {
		return blogMapper.selectBlogByUser(userId);
	}

	@Override
	public Blog getBlogByPath(String path) {
		return blogMapper.selectBlogByPath(path);
	}

	@Override
	public List<Blog> listAllBlogs() {
		return blogMapper.selectBlogs();
	}

}
