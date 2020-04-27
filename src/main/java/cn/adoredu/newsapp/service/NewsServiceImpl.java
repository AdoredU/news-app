package cn.adoredu.newsapp.service;

import cn.adoredu.newsapp.dao.NewsDao;
import cn.adoredu.newsapp.domain.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> getNews() {
        Sort sort = Sort.by(Sort.Direction.DESC, "createTime");
        return newsDao.findAll(sort);
    }

    @Override
    public void publishNews(News news) {
        news.setCreateTime(new Date());
        newsDao.save(news);
    }

    @Override
    public void updateNews(News news) {
        News newsDB = newsDao.getOne(news.getId());
        System.out.println(newsDB);
        newsDB.upDate(news);
        newsDao.save(newsDB);
    }

    @Override
    public void deleteNews(Integer id) {
        newsDao.deleteById(id);
    }
}
