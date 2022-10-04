package lk.ijse.sipsewana.bo.custom;

import lk.ijse.sipsewana.bo.SuperBO;
import lk.ijse.sipsewana.dto.CustomDTO;
import lk.ijse.sipsewana.dto.RegistrationDTO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface RegistrationBO extends SuperBO {
    boolean registerDetails(RegistrationDTO dto) throws SQLException, ClassNotFoundException;

    ArrayList<CustomDTO> getAllDetails() throws SQLException, ClassNotFoundException;

    boolean ifExist(String id) throws SQLException, ClassNotFoundException;

    String generateNewID() throws SQLException, ClassNotFoundException;

    List<CustomDTO> searchDetail(String value);
}
