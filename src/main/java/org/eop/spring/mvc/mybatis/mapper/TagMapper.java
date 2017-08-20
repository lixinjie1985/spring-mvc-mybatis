package org.eop.spring.mvc.mybatis.mapper;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Tag;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface TagMapper {

	int insertTag(Tag tag);
	
	Tag selectTag(Long id);
	
	int updateTag(Tag tag);
	
	int deleteTag(Long id);
	
	List<Tag> selectTags();
	
	List<Tag> selectTagsByBlog(Long blogId);
	
	List<Tag> selectTagsByPost(Long postId);
}
