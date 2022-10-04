package lk.ijse.sipsewana.dao.custom;

import lk.ijse.sipsewana.dao.CrudDAO;
import lk.ijse.sipsewana.entity.Course;

import java.util.List;

public interface CourseDAO extends CrudDAO<Course, String> {
    boolean ifCourseExists(String code);
    Course getCourseDetail(String name);
    List getCourse();
}
