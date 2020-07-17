package com.tt.study.pojo;

/**
 * @Description:
 * @Date: 2020/07/16 16:56
 * @Author: dujianyong
 */
public class SingletonStaticClass {

  private static class Holder {

    private static final SingletonStaticClass sinleton = new SingletonStaticClass();
  }

  private SingletonStaticClass() {
  }

  public static SingletonStaticClass getInstance() {
    return Holder.sinleton;
  }
}
