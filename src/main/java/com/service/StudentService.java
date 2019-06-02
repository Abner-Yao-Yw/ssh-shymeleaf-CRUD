package com.service;

import com.dao.StudentDao;
import com.enties.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public void addStudent(Student student)
    {
         studentDao.add(student);
    }
    public List<Student> query()
    {
        return studentDao.query();
    }
    public void deleteStudent(Integer id)
    {
           studentDao.delete(id);
    }
    public void editStudent(Student student)
    {
        studentDao.edit(student);
    }
}
