package com.eu.entitiy;

import java.io.Serializable;

/**
 * Created by Kamal on 4/29/16.
 */
public class Post implements Serializable {

    private int eid;
    private String post_id;
    private String cat_id;
    private String subcat_id;
    private String detail;
    private String title;
    private String author_id;
    private String type;
    private String a_detail;
    private String options;
    private int a_option;
    private String c_time;
    private String e_time;
    private boolean attemp;

    public void setData(){
        setEid(1);
        setPost_id("AXCGJD");
        setCat_id("abc");
        setSubcat_id("def");
        setDetail("data");
        setTitle("abc");
        setAuthor_id("abc");
        setType("abc");
        setA_detail("abc");
        setOptions("abc");
        setC_time("abc");
        setE_time("abc");
        setA_option(1);
        setAttemp(false);
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getSubcat_id() {
        return subcat_id;
    }

    public void setSubcat_id(String subcat_id) {
        this.subcat_id = subcat_id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getA_detail() {
        return a_detail;
    }

    public void setA_detail(String a_detail) {
        this.a_detail = a_detail;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public int getA_option() {
        return a_option;
    }

    public void setA_option(int a_option) {
        this.a_option = a_option;
    }

    public String getC_time() {
        return c_time;
    }

    public void setC_time(String c_time) {
        this.c_time = c_time;
    }

    public String getE_time() {
        return e_time;
    }

    public void setE_time(String e_time) {
        this.e_time = e_time;
    }

    public boolean isAttemp() {
        return attemp;
    }

    public void setAttemp(boolean attemp) {
        this.attemp = attemp;
    }
}
