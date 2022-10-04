package lk.ijse.sipsewana.bo.custom;

import lk.ijse.sipsewana.bo.SuperBO;
import lk.ijse.sipsewana.dto.StudentDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface StudentBO extends SuperBO {
    ArrayList<StudentDTO> getAllStudents() throws Exception;

    boolean addStudent(StudentDTO studentDTO) throws Exception;

    boolean updateStudent(StudentDTO studentDTO) throws Exception;

    boolean ifStudentExist(String id) throws SQLException, ClassNotFoundException;

    boolean deleteStudent(String id) throws Exception;
}
