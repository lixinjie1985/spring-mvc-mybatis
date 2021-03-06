package org.eop.spring.mvc.mybatis.service.impl;

import java.util.ArrayList;
import java.util.List;

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
		postTagMapper.insertPostTag(postTag);
		return postTag.getId();
	}
	
	@Override
	public List<Long> savePostTags(List<PostTag> postTags) {
		postTagMapper.insertPostTags(postTags);
		List<Long> ids = new ArrayList<>(postTags.size());
		for (PostTag pt : postTags) {
			ids.add(pt.getId());
		}
		return ids;
	}
	
	@Override
	public Long deletePostTag(Long id) {
		postTagMapper.deletePostTag(id);
		return id;
	}

	@Override
	public Long deletePostTagByPost(Long postId) {
		postTagMapper.deletePostTagByPost(postId);
		return postId;
	}

	@Override
	public Long deletePostTagByTag(Long tagId) {
		postTagMapper.deletePostTagByTag(tagId);
		return tagId;
	}

}
