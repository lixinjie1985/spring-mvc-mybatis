package org.eop.spring.mvc.mybatis.service;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.PostTag;

/**
 * @author lixinjie
 * @since 2017-08-20
 */
public interface PostTagService {

	Long savePostTag(PostTag postTag);
	
	List<Long> savePostTags(List<PostTag> postTags);
	
	Long deletePostTag(Long id);
	
	Long deletePostTagByPost(Long postId);
	
	Long deletePostTagByTag(Long tagId);
}
