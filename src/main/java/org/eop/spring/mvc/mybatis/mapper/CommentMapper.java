package org.eop.spring.mvc.mybatis.mapper;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Comment;

/**
 * @author lixinjie
 * @since 2017-08-20
 */
public interface CommentMapper {

	int insertComment(Comment comment);
	
	Comment selectComment(Long id);
	
	int updateComment(Comment comment);
	
	int deleteComment(Long id);
	
	List<Comment> selectComments();
	
	List<Comment> selectCommentsByPost(Long postId);
	
	List<Comment> selectCommentsByBlog(Long blogId);
}
