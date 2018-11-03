package com.zhidanfeng.blog.service;

import com.zhidanfeng.blog.entity.T_ARTICLE;
import com.zhidanfeng.blog.dao.ArticleDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleService {

    @Resource
    public ArticleDao articleDao;

    public List<T_ARTICLE> getAll() {
        return articleDao.getAll();
    }
}
