package com.tt.study.pojo;

import java.util.Objects;
import lombok.Data;

/**
 * @Description:
 * @Date: 2020/06/05 10:44
 * @Author: dujianyong
 */
//@Data
public class Room {

  private String roomName;
  private Student student;

  public Room() {
  }

  public Room(String roomName, Student student) {
    this.roomName = roomName;
    this.student = student;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Room room = (Room) o;
    return Objects.equals(roomName, room.roomName) &&
        Objects.equals(student, room.student);
  }

  @Override
  public String toString() {
    return "Room{" +
        "roomName='" + roomName + '\'' +
        ", student=" + student +
        '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomName, student);
  }

  public String getRoomName() {
    return roomName;
  }

  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }
}
