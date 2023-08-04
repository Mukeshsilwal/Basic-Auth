package com.info.payloads;

public class StudentDto {
    int id;
    String name;
    String schoolName;
    String email;

    public StudentDto() {
    }

    public StudentDto(int id, String name, String schoolName, String email) {
        this.id = id;
        this.name = name;
        this.schoolName = schoolName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
