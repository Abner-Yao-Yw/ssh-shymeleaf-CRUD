package com.enties;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
<<<<<<< HEAD

=======
import org.springframework.web.multipart.MultipartFile;

import java.sql.Blob;
>>>>>>> 第二次
import java.sql.Date;


@Component
public class Student{
    private Integer id;
    private String name;
    private String sex;
    private Date birth;
<<<<<<< HEAD
=======
    private Blob file;

    public void setFile(Blob file) {
        this.file = file;
    }

    public Blob getFile() {
        return file;
    }

>>>>>>> 第二次
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }



    public Student() {
    }

<<<<<<< HEAD
    public Student(Integer id, String name, String sex, Date birth) {
=======
    public Student(Integer id, String name, String sex, Date birth, Blob file) {
>>>>>>> 第二次
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birth = birth;
<<<<<<< HEAD
    }

=======
        this.file = file;
    }
    
>>>>>>> 第二次
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birth=" + birth +
<<<<<<< HEAD
=======
                ", file=" + file +
>>>>>>> 第二次
                '}';
    }
}
