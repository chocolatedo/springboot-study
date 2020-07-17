package com.tt.study.controller;

import static org.junit.Assert.*;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class StudyControllerTest {

  @Test
  public void test(){
    System.out.println(123);
  }

  @Test
  public void test02(){

    LongAdder longAdder = new LongAdder();

    System.out.println("longAdder:"+longAdder.longValue());

    longAdder.add(10);

    System.out.println("longAdder:"+longAdder.longValue());

    longAdder.decrement();

    System.out.println("longAdder:"+longAdder.longValue());

    long sum = longAdder.sum();

    System.out.println(sum);

    longAdder.reset();

    System.out.println("longAdder:"+longAdder.longValue());
  }

  @Test
  public void test03(){
    //new LongAccumulator()
    AtomicLong atomicLong = new AtomicLong(0);

    for (int i = 0; i < 10; i++) {
      long l = atomicLong.addAndGet(1);
      System.out.println(l);
    }

  }
}