package cn.adoredu.newsapp.controller;

import cn.adoredu.newsapp.domain.News;
import cn.adoredu.newsapp.service.NewsService;
import cn.adoredu.newsapp.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @RequestMapping("/getNews")
    public Result getNews() {
        List<News> newsList = newsService.getNews();
        return new Result(newsList, "获取新闻列表成功！");
    }

    @RequestMapping("/publishNews")
    public Result publishNews(News news) {
        newsService.publishNews(news);
        return new Result(null, "发布成功！");
    }

    @RequestMapping("/updateNews")
    public Result upDateNews(News news) {
        newsService.updateNews(news);
        return new Result(null, "修改成功！");
    }

    @RequestMapping("/deleteNews")
    public Result deleteNews(Integer id) {
        newsService.deleteNews(id);
        return new Result(null, "删除成功！");
    }
}
