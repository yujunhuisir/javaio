package com.excelib.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@SessionAttributes(value= {"articleId"})
public class FollowMeContoller {
	private final Log logger = LogFactory.getLog(FollowMeContoller.class);
	private final String[]sensitiveWords = new String[] {"k1","s2"};
	
	@ModelAttribute("comment")
	public String replaceSensitiveWords(String comment) {
		if(comment!=null) {
			logger.info("原始comment:"+comment);
			for(String sw:sensitiveWords)
				comment = comment.replace(sw, "");
			logger.info("去掉敏感词comment:"+comment);
		}
		return comment;
	}
	@RequestMapping(value= {"/articles/{articleId}/comment"})
	public String doComment(@PathVariable String articleId,RedirectAttributes attributes,Model model) {
		attributes.addFlashAttribute("comment",model.asMap().get("comment"));
		model.addAttribute("articleId", articleId);
		return "redirect:/showArticle";
	}
	
	@RequestMapping(value= {"/showArticle"},method= {RequestMethod.GET})
	public String showArticle(Model model,SessionStatus sessionStatus) {
		String articleId = (String) model.asMap().get("articleId");
		model.addAttribute("articleTile", articleId+"号文章标题");
		model.addAttribute("article",articleId+"号文章内容");
		sessionStatus.setComplete();
		return "article";
	}
	//HandlerInterceptor h
}
