package com.zhidanfeng.blog;

import com.zhidanfeng.blog.entity.T_ARTICLE;
import com.zhidanfeng.blog.service.ArticleService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class ArticleServiceTest {
    static ArticleService articleService;

    @BeforeClass
    public static void before() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        articleService = (ArticleService) context.getBean(ArticleService.class);
    }

    @Test
    public void testGetAll() {
        List<T_ARTICLE> list = articleService.getAll();
        if(list != null) {
            for (int i = 0; i < list.size(); i++) {
                T_ARTICLE model = list.get(i);
                System.out.println("编号：" + model.getId() + ", 内容：" + model.getContent());
            }
        }
    }
}
