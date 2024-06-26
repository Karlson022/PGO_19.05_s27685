import java.util.Date;

public class Student {

    protected String name;
    protected String surname;
    protected String email;
    protected String address;
    protected String phoneNumber;
    protected Date birthDate;
    protected static int count;
    protected String indexNumber;
    protected int currentSemester;
    protected int maxStudentSemester;
    protected String studentStudyProgramme;
    protected int numberOfItn;
    protected int maxStudentItn;
    protected String studentStatus;

    public Student(String studentName, String studentSurname, String studentEmail, String studentAddress, String studentPhoneNumber, Date studentBirthDate) {
        this.name = studentName;
        this.surname = studentSurname;
        this.email = studentEmail;
        this.address = studentAddress;
        this.phoneNumber = studentPhoneNumber;
        this.birthDate = studentBirthDate;
        this.studentStatus = "Candidate";
        count++;
        this.indexNumber = "s" + count;
    }

    public void enrollStudent(StudyProgramme studyProgramme){
        this.currentSemester = 1;
        this.studentStatus = "Student";
        this.maxStudentSemester = studyProgramme.numberOfSemesters;
        this.studentStudyProgramme = studyProgramme.getProgrammeName();
        this.maxStudentItn = studyProgramme.maxItn;
    }

    public void promoteToNextSemester() throws Exception{
            if(this.getNumberOfItn() > this.maxStudentItn){
                throw new Exception("Max number of ITN's is exceeded");
            }else{
                this.currentSemester++;
                if(this.getCurrentSemester() == this.getMaxStudentSemester()){
                    this.setStudentStatus("Graduate");
                    System.out.println("Congrats you graduated from PJATK University");
                }
            }
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

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getStudentStudyProgramme() {
        return studentStudyProgramme;
    }

    public void setStudentStudyProgramme(StudyProgramme studentStudyProgramme) {
        this.studentStudyProgramme = studentStudyProgramme.toString();
    }

    public int getNumberOfItn() {
        return numberOfItn;
    }

    public void setNumberOfItn(int numberOfItn) {
        this.numberOfItn = numberOfItn;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }

    public int getMaxStudentSemester() {
        return maxStudentSemester;
    }

    public void setMaxStudentSemester(int maxStudentSemester) {
        this.maxStudentSemester = maxStudentSemester;
    }
    
   
    
}
