package com.example.chen.myapplication;

public class SSEntity {
    public int icon = R.mipmap.ic_launcher;
    public String name;
    public String content =  "今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!今天贼嗨!";
    public boolean isLike;  //我是否点赞
    public int likeNum; //点赞数
    public int commentNum;  //评论数

    public SSEntity(String name, boolean isLike, int likeNum,int commentNum) {
        this.name = name;
        this.isLike = isLike;
        this.likeNum = likeNum;
        this.commentNum = commentNum;
    }
}
