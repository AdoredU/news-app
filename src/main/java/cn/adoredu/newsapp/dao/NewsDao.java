package cn.adoredu.newsapp.dao;

import cn.adoredu.newsapp.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsDao extends JpaRepository<News, Integer> {
}
