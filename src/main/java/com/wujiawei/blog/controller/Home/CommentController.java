package com.wujiawei.blog.controller.Home;

import com.wujiawei.blog.entity.Article;
import com.wujiawei.blog.entity.Comment;
import com.wujiawei.blog.service.ArticleService;
import com.wujiawei.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by wjw
 */

@Controller
public class CommentController {
	@Autowired
	private CommentService commentService;

	@Autowired
	private ArticleService articleService;
	
	//添加评论
	@RequestMapping(value = "/comment/insert",method = {RequestMethod.POST})
	@ResponseBody
	public void insertComment(HttpServletRequest request,Comment comment) throws Exception {
		//添加评论
		comment.setCommentCreateTime(new Date());
		commentService.insertComment(request,comment);
		//更新文章的评论数
		Article article = articleService.getArticleById(null,comment.getCommentArticleId());
		articleService.updateCommentCount(article.getArticleId());
	}


}
