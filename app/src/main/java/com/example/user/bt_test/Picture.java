package com.example.user.bt_test;

/**
 * Created by Tran Minh Tan on 10/12/2017.
 */

public class Picture {
    int Image;
    String text;

    public void setImage(int image) {
        Image = image;
    }

    public void setText(String text) {
        this.text = text;
    }


    public Picture(int image, String text) {
        Image = image;
        this.text = text;
    }
    public int getImage() {
        return Image;
    }

    public String getText() {
        return text;
    }







}
