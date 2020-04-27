# news-app
使用springboot + spring data jpa快速搭建的简易版新闻发布系统后台，目的为提供增删改查基本接口，配合前端熟悉dva而用。
- 接口列表：
    - news/publishNews：post请求，发布新闻。
    - news/getNews：get请求，获取新闻列表。
    - news/updateNews：post请求，修改新闻。
    - news/deleteNews：post请求，删除新闻（单条）。
- 返回值格式：
    ```json
    {
        "status": 0,
        "msg": "获取新闻列表成功！",
        "data": [
            {
                "id": 1,
                "title": "NBA交易",
                "author": "腾讯新闻",
                "source": "nba官网",
                "createTime": "2020-04-27 10:44:51",
                "content": "麦迪交易至马刺"
            }
        ]
    }
    ```