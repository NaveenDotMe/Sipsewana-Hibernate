package lk.ijse.sipsewana.dao.custom;

import lk.ijse.sipsewana.dao.CrudDAO;
import lk.ijse.sipsewana.entity.Registration;

import java.sql.SQLException;

public interface RegisterDAO extends CrudDAO<Registration,String> {
    boolean ifRegExist(String id) throws SQLException, ClassNotFoundException;
    String generateNewID() throws SQLException, ClassNotFoundException;
}
