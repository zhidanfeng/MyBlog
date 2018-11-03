package com.zhidanfeng.blog.controller;

import com.zhidanfeng.blog.entity.T_ARTICLE;
import com.zhidanfeng.blog.service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

import static com.sun.deploy.config.JREInfo.getAll;

@Controller
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @RequestMapping("/")
    public ModelAndView getArticle() {
        ModelAndView mav = new ModelAndView("index");
        List<T_ARTICLE> articleList = articleService.getAll();
        if(articleList.size() > 0) {
            mav.addObject("article", articleList.get(0));
        }
        return mav;
    }
}
