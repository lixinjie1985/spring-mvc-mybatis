package org.eop.spring.mvc.mybatis.service;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Tag;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface TagService {

	Long saveTag(Tag tag);
	
	Tag getTag(Long id);
	
	Long updateTag(Tag tag);
	
	Long removeTag(Long id);
	
	List<Tag> listAllTags();
	
	List<Tag> listTagsByBlog(Long blogId);
	
	List<Tag> listTagsByPost(Long postId);
}
