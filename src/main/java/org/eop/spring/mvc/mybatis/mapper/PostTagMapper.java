package org.eop.spring.mvc.mybatis.mapper;

import org.eop.spring.mvc.mybatis.bean.PostTag;

/**
 * @author lixinjie
 * @since 2017-08-20
 */
public interface PostTagMapper {

	int insertPostTag(PostTag postTag);
	
	int deletePostTag(Long id);
	
	int deletePostTagByPost(Long postId);
	
	int deletePostTagByTag(Long tagId);
}
