package com.dao;

import com.enties.Student;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;
import java.util.List;

@Repository
public class StudentDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void add(Student student)
    {
        Session session=sessionFactory.getCurrentSession();
        Query query=session.createSQLQuery("insert into student(id,name,sex,birth) values(?,?,?,?)");
        query.setInteger(0,student.getId());
        query.setString(1,student.getName());
        query.setString(2,student.getSex());
        query.setDate(3,student.getBirth());
        query.executeUpdate();
        String hql="from Student";
        List<Student> students=session.createQuery(hql).list();
        Iterator<Student> studentIterator=students.iterator();
        while (studentIterator.hasNext())
        {
            Student stu=studentIterator.next();
            System.out.println(stu.getId()+stu.getName()+stu.getSex()+stu.getBirth());
        }
    }
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public List<Student> query()
    {
        Session session=sessionFactory.getCurrentSession();
        String hql="from Student";
        List<Student> students=session.createQuery(hql).list();
        Iterator<Student> studentIterator=students.iterator();
        while (studentIterator.hasNext())
        {
            Student stu=studentIterator.next();
            System.out.println(stu.getId()+stu.getName()+stu.getSex()+stu.getBirth());
        }
        return students;
    }
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void delete(Integer id)
    {
        Session session=sessionFactory.getCurrentSession();
        String hql="delete from Student where id=? ";
        Query query=session.createQuery(hql);
        query.setInteger(0,id);
        int count=query.executeUpdate();
        System.out.println(count);
    }
    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void edit(Student student)
    {
        Session session=sessionFactory.getCurrentSession();
        String hql="update Student set name=?,sex=?,birth=? where id=?";
        Query query=session.createQuery(hql);
        query.setString(0,student.getName());
        query.setString(1,student.getSex());
        query.setDate(2,student.getBirth());
        query.setInteger(3,student.getId());
        int count=query.executeUpdate();

    }
}
