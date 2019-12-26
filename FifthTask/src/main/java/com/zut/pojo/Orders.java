package com.zut.pojo;

import java.util.Date;

public class Orders {
    private Integer id;

    private Integer user_id;

    private String number;

    private Date createtime;

    private String note;

    public Orders() {
    }

    public Orders(Integer id, Integer user_id, String number, Date createtime, String note) {
        this.id = id;
        this.user_id = user_id;
        this.number = number;
        this.createtime = createtime;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}