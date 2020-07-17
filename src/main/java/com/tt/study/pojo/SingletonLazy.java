package com.tt.study.pojo;

/**
 * @Description: 懒汉式 单线程
 * @Date: 2020/07/16 14:52
 * @Author: dujianyong
 */
public class SingletonLazy {

  private static SingletonLazy singleton = null;

  public SingletonLazy() {

  }

  public static SingletonLazy getSingletonLazy() {
    if (singleton == null) {
      singleton = new SingletonLazy();
    }
    return singleton;
  }
}
