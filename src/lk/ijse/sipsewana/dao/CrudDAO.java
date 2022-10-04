package lk.ijse.sipsewana.dao;

import lk.ijse.sipsewana.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;

public interface CrudDAO <Entity extends SuperEntity, ID extends Serializable> extends SuperDAO {
    boolean add(Entity entity) throws Exception;
    boolean delete(ID id) throws Exception;
    boolean update(Entity entity) throws Exception;
    Entity search(ID id) throws Exception;
    List getAll() throws Exception;
}
