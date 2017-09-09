package org.eop.spring.mvc.mybatis.service;

import java.util.List;
import java.util.Map;

import org.eop.spring.mvc.mybatis.bean.Post;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface PostService {

	Long savePost(Post post);
	
	Long updatePost(Post post);
	
	Long removePost(Long id);
	
	Post getPost(Long id);
	
	List<Post> listAllPosts();
	
	List<Post> listPostsByBlog(Long blogId);
	
	List<Post> listPostsByTag(Long tagId);
	
	List<Map<String, Object>> listPostVOsForHome();
	
	List<Map<String, Object>> listPostVOsByTagNameForHome(String tagName);
	
}
