package lk.ijse.sipsewana.bo.custom.impl;

import lk.ijse.sipsewana.bo.custom.RegistrationBO;
import lk.ijse.sipsewana.dao.DAOFactory;
import lk.ijse.sipsewana.dao.custom.QueryDAO;
import lk.ijse.sipsewana.dao.custom.RegisterDAO;
import lk.ijse.sipsewana.dto.CustomDTO;
import lk.ijse.sipsewana.dto.RegistrationDTO;
import lk.ijse.sipsewana.entity.Course;
import lk.ijse.sipsewana.entity.Registration;
import lk.ijse.sipsewana.entity.Student;
import lk.ijse.sipsewana.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegistrationBOImpl implements RegistrationBO {

    private final RegisterDAO registerDAO = (RegisterDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.REGISTRATION);
    private final QueryDAO queryDAO = (QueryDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.QUERY);

    @Override
    public boolean registerDetails(RegistrationDTO dto){

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, dto.getNicNo());

        Course program = session.get(Course.class, dto.getcId());
        

        Registration register = new Registration(dto.getRegId(), dto.getRegDate(), student, program);

        session.save(register);

        transaction.commit();

        session.close();

        return true;
    }

    @Override
    public ArrayList<CustomDTO> getAllDetails(){
        ArrayList<CustomDTO> allDetails = new ArrayList<>();
        ArrayList<CustomDTO> all = queryDAO.getAll();
        for (CustomDTO register : all) {
            allDetails.add(new CustomDTO(register.getRegId(),register.getStudentNic(),register.getStudentName(),
                    register.getCourseId(),register.getCourseName(),register.getRegDate()));
        }
        return allDetails;
    }


    @Override
    public boolean ifExist(String id) throws SQLException, ClassNotFoundException {
        return registerDAO.ifRegExist(id);
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return registerDAO.generateNewID();
    }

    @Override
    public List<CustomDTO> searchDetail(String value) {
        return queryDAO.searchDetail(value);
    }
}
