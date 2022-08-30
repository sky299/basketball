package com.jckj.vo;


import java.io.Serializable;

/**
 * 基于此对象封装控制层对象 的响应结果,在此对象中应该 包含返回到客户端的数据以及 一个状态码和状态信息
 */
public class JsonResult implements Serializable {

    private static final long serialVersionUID = -5766977494287555486L;
    /**
     * 状态码 200 ok , 500 error
     */
    private int code = 0;
    /**
     * 状态码对应的信息
     */
    private String msg = "";
    /**
     * 正常数据
     */
    private Object data;

    private int count;

    public JsonResult(String msg) {
        this.msg = msg;
    }

    public JsonResult(Object data) {
        this.data = data;
    }

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(Throwable e) {
        this.code = 500;
        this.msg = e.getMessage();
    }

    public JsonResult(int code, String msg, Object data, int count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count = count;
    }

    public JsonResult(Object data, int count) {
        this.data = data;
        this.count = count;
    }

    /**
     * 返回成功
     *
     * @return
     */
    public static JsonResult success() {
        return new JsonResult();
    }

    /**
     * 返回成功
     *
     * @param data
     * @return
     */
    public static JsonResult success(Object data) {
        return new JsonResult(data);
    }

    /**
     * 返回成功
     *
     * @param data
     * @param count
     * @return
     */
    public static JsonResult success(Object data, int count) {
        return new JsonResult(data, count);
    }

    /**
     * 返回失败
     *
     * @param msg
     * @return
     */
    public static JsonResult error(String msg) {
        return new JsonResult(msg);
    }

    /**
     * 返回失败
     *
     * @param msg
     * @return
     */
    public static JsonResult error(Integer code, String msg) {
        return new JsonResult(code, msg);
    }

    /**
     * 返回失败
     *
     * @param e
     * @return
     */
    public static JsonResult error(Throwable e) {
        return new JsonResult(500, e.getLocalizedMessage());
    }


    public JsonResult() {
        super();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
