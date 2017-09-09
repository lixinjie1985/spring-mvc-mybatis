package org.eop.spring.mvc.mybatis.service.impl;

import java.util.List;
import java.util.Map;

import org.eop.spring.mvc.mybatis.bean.Tag;
import org.eop.spring.mvc.mybatis.mapper.TagMapper;
import org.eop.spring.mvc.mybatis.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author lixinjie
 * @since 2017-08-23
 */
public class TagServiceImpl implements TagService {

	@Autowired
	private TagMapper tagMapper;
	
	@Override
	public Long saveTag(Tag tag) {
		tagMapper.insertTag(tag);
		return tag.getId();
	}

	@Override
	public Long updateTag(Tag tag) {
		tagMapper.updateTag(tag);
		return tag.getId();
	}

	@Override
	public Long removeTag(Long id) {
		tagMapper.deleteTag(id);
		return id;
	}

	@Override
	public Tag getTag(Long id) {
		return tagMapper.selectTag(id);
	}

	@Override
	public List<Tag> listAllTags() {
		return tagMapper.selectTags();
	}

	@Override
	public List<Tag> listTagsByBlog(Long blogId) {
		return tagMapper.selectTagsByBlog(blogId);
	}

	@Override
	public List<Tag> listTagsByPost(Long postId) {
		return tagMapper.selectTagsByPost(postId);
	}

	@Override
	public List<Map<String, Object>> listTagVOsForHome() {
		return tagMapper.selectTagVOsForHome();
	}

}
