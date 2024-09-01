package com.example.recyclerapplication;

public class ModelClass {
    String name;
    int imageurl;
    int age;
    public ModelClass(String name, int imageurl, int age) {
        this.name = name;
        this.imageurl = imageurl;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageurl() {
        return imageurl;
    }

    public void setImageurl(int imageurl) {
        this.imageurl = imageurl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

