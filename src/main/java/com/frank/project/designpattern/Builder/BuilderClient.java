package com.frank.project.designpattern.Builder;

public class BuilderClient {
    public static void main(String[] args) {
        Computor computor = new Computor.Builder()
                .setCpu("2G")
                .setKeyBoard("捷达")
                .setScreen("三星")
                .setKeyBoard("双飞燕")
                .setMemory("4G")
                .build();
        System.out.println(computor.toString());
    }
}
