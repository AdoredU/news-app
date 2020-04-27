package cn.adoredu.newsapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private String source;
    private Date createTime;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", source='" + source + '\'' +
                ", createTime=" + createTime +
                ", content='" + content + '\'' +
                '}';
    }

    /**
     * 修改时更新属性
     * @param news：要修改的对象
     */
    public void upDate(News news) {
        String _author = news.getAuthor();
        String _title = news.getTitle();
        String _content = news.getContent();
        String _source = news.getSource();
        if (null != _author) {
            this.setAuthor(_author);
        }
        if (null != _title) {
            this.setTitle(_title);
        }
        if (null != _content) {
            this.setContent(_content);
        }
        if (null != _source) {
            this.setSource(_source);
        }
    }
}
