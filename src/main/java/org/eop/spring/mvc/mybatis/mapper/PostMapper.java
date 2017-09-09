package org.eop.spring.mvc.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.eop.spring.mvc.mybatis.bean.Post;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface PostMapper {

	int insertPost(Post post);
	
	Post selectPost(Long id);
	
	int updatePost(Post post);
	
	int deletePost(Long id);
	
	List<Post> selectPosts();
	
	List<Post> selectPostsByBlog(Long blogId);
	
	List<Post> selectPostsByTag(Long tagId);
	
	List<Map<String, Object>> selectPostVOsForHome();
	
	List<Map<String, Object>> selectPostVOsByTagNameForHome(String tagName);
}
