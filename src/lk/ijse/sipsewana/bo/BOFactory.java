package lk.ijse.sipsewana.bo;

import lk.ijse.sipsewana.bo.custom.impl.CourseBOImpl;
import lk.ijse.sipsewana.bo.custom.impl.RegistrationBOImpl;
import lk.ijse.sipsewana.bo.custom.impl.StudentBOImpl;

public class BOFactory {

    public enum BOType{
        COURSE, STUDENT, REGISTRATION
    }

    private static BOFactory boFactory;

    private BOFactory(){

    }
    public static BOFactory getBoFactory(){
        return (boFactory != null) ? boFactory : (boFactory = new BOFactory());
    }

    public <T extends SuperBO> T getBO(BOType boType) {
        switch (boType){
            case COURSE:
                return (T) new CourseBOImpl();
            case STUDENT:
                return (T) new StudentBOImpl();
            case REGISTRATION:
                return (T) new RegistrationBOImpl();
            default:
                return null;
        }
    }
}
