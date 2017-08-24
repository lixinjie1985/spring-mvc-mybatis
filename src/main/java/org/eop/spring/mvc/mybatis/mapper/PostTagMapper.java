package org.eop.spring.mvc.mybatis.mapper;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.PostTag;

/**
 * @author lixinjie
 * @since 2017-08-20
 */
public interface PostTagMapper {

	int insertPostTag(PostTag postTag);
	
	int insertPostTags(List<PostTag> postTags);
	
	int deletePostTag(Long id);
	
	int deletePostTagByPost(Long postId);
	
	int deletePostTagByTag(Long tagId);
}
