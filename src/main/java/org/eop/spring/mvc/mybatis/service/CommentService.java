package org.eop.spring.mvc.mybatis.service;

import java.util.List;

import org.eop.spring.mvc.mybatis.bean.Comment;

/**
 * @author lixinjie
 * @since 2017-08-19
 */
public interface CommentService {

	Long saveComment(Comment comment);
	
	Long updateComment(Comment comment);
	
	Long removeComment(Long id);
	
	Comment getComment(Long id);
	
	List<Comment> listAllComments();
	
	List<Comment> listCommentsByPost(Long postId);
	
	List<Comment> listCommentsByUser(Long userId);
}
