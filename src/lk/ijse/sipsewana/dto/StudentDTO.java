package lk.ijse.sipsewana.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class StudentDTO implements Serializable {
    private String nicNo;
    private String name;
    private String address;
    private LocalDate dateOfBirth;
    private String gender;
    private String contact;

    public StudentDTO() {
    }

    public StudentDTO(String nicNo, String name, String address, LocalDate dateOfBirth, String gender, String contact) {
        this.nicNo = nicNo;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.contact = contact;
    }

    public StudentDTO(String nic, String name, String address, String dob, String gender, String contact) {
        this.nicNo = nicNo;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.contact = contact;
    }

    public String getNicNo() {
        return nicNo;
    }

    public void setNicNo(String nicNo) {
        this.nicNo = nicNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "niceNo='" + nicNo + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
