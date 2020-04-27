package cn.adoredu.newsapp.utils;

import cn.adoredu.newsapp.domain.News;

import java.util.List;

/**
 * 返回结果封装类
 */
public class Result {

    private Integer status;  // 0 表示接口正常
    private String msg;
    private Object data;

    public Result(Object data, String msg) {
        this.data = data;
        this.status = 0;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
