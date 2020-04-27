package cn.adoredu.newsapp.service;

import cn.adoredu.newsapp.domain.News;

import java.util.List;

public interface NewsService {

    List<News> getNews();

    void publishNews(News news);

    void updateNews(News news);

    void deleteNews(Integer id);
}
