package org.eop.spring.mvc.mybatis.service.impl;

import java.util.List;
import java.util.Map;

import org.eop.spring.mvc.mybatis.bean.Post;
import org.eop.spring.mvc.mybatis.mapper.PostMapper;
import org.eop.spring.mvc.mybatis.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lixinjie
 * @since 2017-08-23
 */
public class PostServiceImpl implements PostService {

	@Autowired
	private PostMapper postMapper;
	
	@Override
	public Long savePost(Post post) {
		postMapper.insertPost(post);
		return post.getId();
	}

	@Override
	public Long updatePost(Post post) {
		postMapper.updatePost(post);
		return post.getId();
	}

	@Override
	public Long removePost(Long id) {
		postMapper.deletePost(id);
		return id;
	}

	@Override
	public Post getPost(Long id) {
		return postMapper.selectPost(id);
	}

	@Override
	public List<Post> listAllPosts() {
		return postMapper.selectPosts();
	}

	@Override
	public List<Post> listPostsByBlog(Long blogId) {
		return postMapper.selectPostsByBlog(blogId);
	}

	@Override
	public List<Post> listPostsByTag(Long tagId) {
		return postMapper.selectPostsByTag(tagId);
	}

	@Override
	public List<Map<String, Object>> listPostVOsForHome() {
		return postMapper.selectPostVOsForHome();
	}

	@Override
	public List<Map<String, Object>> listPostVOsByTagNameForHome(String tagName) {
		return postMapper.selectPostVOsByTagNameForHome(tagName);
	}

}
