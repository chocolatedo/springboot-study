package com.tt.study.pojo;

/**
 * @Description: 饿汉式
 * @Date: 2020/07/16 14:41
 * @Author: dujianyong
 */
public class Singleton {

  private static Singleton singleton = new Singleton();

  private Singleton() {
  }

  public static Singleton getSingleton() {
    return singleton;
  }

}
