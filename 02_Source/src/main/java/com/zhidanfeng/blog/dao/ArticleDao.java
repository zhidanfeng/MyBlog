package com.zhidanfeng.blog.dao;

import com.zhidanfeng.blog.entity.T_ARTICLE;

import java.util.List;

public interface ArticleDao {
    /**
     * 获取所有博客文章
     * @return
     */
    public List<T_ARTICLE> getAll();
}
