package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//这是单行注释
public class HelloWorld {
    public static void main(String[] args) {
        String age = "dasdas";
    }

    public void method() {

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
