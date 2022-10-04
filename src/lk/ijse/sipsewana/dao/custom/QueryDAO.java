package lk.ijse.sipsewana.dao.custom;

import lk.ijse.sipsewana.dao.SuperDAO;
import lk.ijse.sipsewana.dto.CustomDTO;

import java.util.ArrayList;
import java.util.List;

public interface QueryDAO extends SuperDAO {
    ArrayList<CustomDTO> getAll();
    List<CustomDTO> searchDetail(String s);
}
