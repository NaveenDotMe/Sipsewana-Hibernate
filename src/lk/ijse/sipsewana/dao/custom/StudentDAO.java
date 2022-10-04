package lk.ijse.sipsewana.dao.custom;

import lk.ijse.sipsewana.dao.CrudDAO;
import lk.ijse.sipsewana.dao.SuperDAO;
import lk.ijse.sipsewana.entity.Student;

import java.sql.SQLException;

public interface StudentDAO extends CrudDAO <Student, String> {
    boolean ifStudentExist(String id) throws SQLException, ClassNotFoundException;
    String getStudentName(String id) throws SQLException, ClassNotFoundException;
}
