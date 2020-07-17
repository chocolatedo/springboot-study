package com.tt.study.pojo;

/**
 * @Description: 饿汉式 线程安全的
 * @Date: 2020/07/16 15:10
 * @Author: dujianyong
 */
public class SingletonLazySafe {

  private static volatile SingletonLazySafe singletonLazySafe = null;

  private static final Object lock = new Object();

  public SingletonLazySafe() {
  }

  public static SingletonLazySafe getSingletonLazySafe() {
    if (singletonLazySafe == null) {
      synchronized (SingletonLazySafe.class) {
        if (singletonLazySafe == null) {
          singletonLazySafe = new SingletonLazySafe();
        }
      }
    }
    return singletonLazySafe;
  }
}
