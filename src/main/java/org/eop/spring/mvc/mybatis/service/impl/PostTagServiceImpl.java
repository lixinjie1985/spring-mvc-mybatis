package org.eop.spring.mvc.mybatis.service.impl;

import org.eop.spring.mvc.mybatis.bean.PostTag;
import org.eop.spring.mvc.mybatis.mapper.PostTagMapper;
import org.eop.spring.mvc.mybatis.service.PostTagService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lixinjie
 * @since 2017-08-23
 */
public class PostTagServiceImpl implements PostTagService {

	@Autowired
	private PostTagMapper postTagMapper;
	
	@Override
	public Long savePostTag(PostTag postTag) {
		return null;
	}

	@Override
	public Long deletePostTag(Long id) {
		return null;
	}

	@Override
	public Long deletePostTagByPost(Long postId) {
		return null;
	}

	@Override
	public Long deletePostTagByTag(Long tagId) {
		return null;
	}

}
