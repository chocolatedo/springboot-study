package com.tt.study.test;

import static org.apache.logging.log4j.util.Strings.isNotBlank;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Description:
 * @Date: 2020/06/27 16:57
 * @Author: dujianyong
 */
public class CountUtil {

  private static Map<String, Integer> map = null;

  static {
    map = new HashMap<String, Integer>();
  }


  /**
   * 实现一个简单的计数器
   */
  public static int countNum(String str) {
    if (isNotBlank(str)) {
      Integer count = map.get(str);
      if (count == null) {
        count = 1;
      } else {
        count++;
      }
      map.put(str, count);
    }
    return map.get(str);
  }


  public static void main(String[] args) {

    for (int i = 0; i < new Random().nextInt(50); i++) {
      countNum("a");
    }
    countNum("a");
    countNum("b");
    countNum("b");
    countNum("c");
    int counta = countNum("a");
    int countb = countNum("b");
    countNum("c");
    countNum("c");
    int countc = countNum("c");

    System.out.println(" countaNum: " + counta + " countbNum: " + countb + " countcNum: " + countc);

  }
}
