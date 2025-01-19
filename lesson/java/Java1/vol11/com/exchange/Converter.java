package com.exchange; 

public class Converter{  //パッケージ内のクラスは必ずpublic
    // ドルを円に換算する処理 
    public int toYen(int dollar){  //メソッドも「public」
        return dollar * 161;//2024.07.10現在
    } 
} 