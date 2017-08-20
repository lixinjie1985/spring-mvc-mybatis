package org.eop.spring.mvc.mybatis.service;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Post;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface PostService {

	Long savePost(Post post);
	
	Post getPost(Long id);
	
	Long updatePost(Post post);
	
	Long removePost(Long id);
	
	List<Post> listAllPosts();
	
	List<Post> listPostsByBlog(Long blogId);
}
