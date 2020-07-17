package com.tt.study.envm;

/**
 * @Description:
 * @Date: 2020/07/16 17:12
 * @Author: dujianyong
 */
public class Test {

  public static void main(String[] args) {
    DBConnection conn1 = DataSourceEnum.DATASOURCE.getConnection();
    DBConnection conn2 = DataSourceEnum.DATASOURCE.getConnection();
    System.out.println(conn1 == conn2);
  }
}
