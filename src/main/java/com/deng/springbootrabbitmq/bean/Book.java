package com.deng.springbootrabbitmq.bean;

public class Book {

    private String Bookname;
    private String zuozhe;

    public String getBookname() {
        return Bookname;
    }

    public void setBookname(String bookname) {
        Bookname = bookname;
    }

    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe;
    }

    public Book(String bookname, String zuozhe) {
        Bookname = bookname;
        this.zuozhe = zuozhe;
    }

    public Book() {
    }
}
