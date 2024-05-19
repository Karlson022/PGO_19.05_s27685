import java.util.Date;

public class Student {

    private String name;
    private String surname;
    private String email;
    private String address;
    private String phoneNumber;
    private Date birthDate;
    private static int count;
    private String indexNumber;
    
    public Student(String studentName, String studentSurname, String studentEmail, String studentAddress, String studentPhoneNumber, Date studentBirthDate) {
        this.name = studentName;
        this.surname = studentSurname;
        this.email = studentEmail;
        this.address = studentAddress;
        this.phoneNumber = studentPhoneNumber;
        this.birthDate = studentBirthDate;
        count++;
        this.indexNumber = "s" + count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public String getIndexNumber() {
        return indexNumber;
    }


    

    
}
