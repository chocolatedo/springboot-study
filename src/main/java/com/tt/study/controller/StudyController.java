package com.tt.study.controller;

import com.tt.study.pojo.Room;
import com.tt.study.pojo.School;
import com.tt.study.pojo.Student;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Date: 2020/06/05 09:46
 * @Author: dujianyong
 */
@Slf4j
@RestController
public class StudyController {

  @PostMapping("/test")
  public void test(Student student) {


    //Objects.requireNonNull()


//    throw  new NoSuchElementException();
//    Optional<Object> o = Optional.of(null);
//
//    Optional<Object> empty = Optional.empty();
//    //Optional<Student> student1 = Optional.of(student);
//    Optional<Student> stu = Optional.ofNullable(student);
//
//    boolean present = stu.isPresent();
//
//    Student student1 = new Student();
//
//    student1 = null;

//    return Optional.ofNullable(student1)
//        .map(null)
//        .orElse("Unknown");

  }

  @PostMapping("/test02")
  public String test02(School school) {

    String name = Optional.ofNullable(school)
        .map(School::getRoom)
        .map(Room::getStudent)
        .map(Student::getName)
        .orElse("no have the stu");
    return name;
  }

  @PostMapping("/test03")
  public String test03(School school) {
    return Optional.ofNullable(school)
        .map(School::getRoom)
        .map(Room::getStudent)
        .map(Student::getName)
        .orElseThrow(() -> new RuntimeException("参数不能为空；"));
  }

  @PostMapping("/test04")
  public String test04(School school) {
    return Optional.ofNullable(school)
        .map(School::getRoom)
        .map(Room::getStudent)
        .map(Student::getName)
        .orElseGet(() -> "llllll");
  }

  @GetMapping("/vueporxy")
  public String vueporxy() {

    System.out.println("vueporxy");
    return "vue3";
  }
}
