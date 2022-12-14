package lk.ijse.sipsewana.dao.custom.impl;

import lk.ijse.sipsewana.dao.custom.CourseDAO;
import lk.ijse.sipsewana.entity.Course;
import lk.ijse.sipsewana.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {

    @Override
    public boolean add(Course entity) throws Exception {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Serializable save = session.save(entity);

        transaction.commit();

        session.close();

        return save != null;
    }

    @Override
    public boolean delete(String s) throws Exception {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.delete(session.get(Course.class, s));

        transaction.commit();

        session.close();

        return true;

    }

    @Override
    public boolean update(Course entity) throws Exception {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.update(entity);

        transaction.commit();

        session.close();

        return true;

    }

    @Override
    public Course search(String s) throws Exception {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Course course = session.get(Course.class, s);

        transaction.commit();

        session.close();

        return course;
    }

    @Override
    public ArrayList <Course>getAll() throws Exception {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM Course");

        List <Course>list = query.list();

        transaction.commit();

        session.close();

        return (ArrayList<Course>) list;
    }

    @Override
    public void setSession(Session session) {

    }

    @Override
    public boolean ifCourseExists(String id) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("SELECT id FROM Course WHERE id = :code");

        String code = (String) query.setParameter("code", id).uniqueResult();

        if (code != null) {

            return true;
        }

        transaction.commit();

        session.close();

        return false;
    }

    @Override
    public Course getCourseDetail(String code) {

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("FROM Course WHERE id =: code");

        Course course = (Course) query.setParameter("code", code).uniqueResult();

        transaction.commit();

        session.close();

        return course;


    }

    @Override
    public List <String>getCourse() {

        ArrayList<String> allCourses = new ArrayList();

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("SELECT id FROM Course");

        allCourses = (ArrayList<String>) query.list();

        transaction.commit();

        session.close();

        return allCourses;
    }

}
