import java.util.ArrayList;

public class Students{

    public static ArrayList<Student> students = new ArrayList<>();

    public static void addStudent(Student st){
        Students.students.add(st);
    }

    public static void displayInfoAboutAllStudents(){
        for(Student student : students){
            System.out.println("Imię i nazwisko: " + student.getName() + " " + student.getSurname());
            System.out.println("Numer indeksu: " + student.getIndexNumber());
            System.out.println("Adres mailowy: " + student.getEmail());
            System.out.println("Adres: " + student.getAddress());
            System.out.println("Numer telefonu: " + student.getPhoneNumber());
            System.out.println("Data urodzenia: " + student.getBirthDate());
        }
    }

    public int showStudents(){
        return Students.students.size();
    }

    public static void promoteAllStudents() throws Exception {
        for(Student student : students){
            if(student.getNumberOfItn() > student.maxStudentItn){
                throw new Exception("Max number of ITN's is exceeded");
            }else{
                student.currentSemester++;
            }
        }
    }  
}
