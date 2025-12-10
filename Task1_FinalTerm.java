class Contact {
    private String email ;
    private String phone ;

    public Contact(String email , String phone){
        this.email = email ;
        this.phone = phone ;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
}


class Student{
    private String studentName ;
    private Contact contact ;
    private int count = 0 ;

    public Student(String studentName , Contact contact ){
        this.studentName = studentName ;
        this.contact = contact ;
    }
    public String getStudentName() {
        return studentName;
    }
    public Contact getContact() {
        return contact;
    }

}



class School{
    private String schoolName ;
    private Student[] student ;
    private int count = 0 ;

    public School (String schoolName  , int numberOfStudent){
        this.schoolName = schoolName ;
        this.student = new Student[numberOfStudent] ;
    }

    public void addStudent(Student stdnt){
        if (count < student.length) {
            student[count] =  stdnt  ;
            count ++ ;
        }
        else System.out.println("Cannot add more student. ");
    }

    public void showStudents(){
        System.out.println("School Name: " + schoolName);
        System.out.println("---- Student List ----");
        for(int i = 0 ; i<count ;i++){
            System.out.println(student[i].getStudentName() + 
            ", Email: " + student[i].getContact().getEmail() +
            " , Phone: " + student[i].getContact().getPhone());
        }
    }
}



public class Task1_FinalTerm {
    public static void main(String[] args) {
        School school = new School("EUSC " , 3) ;

        Contact c1 = new Contact("Samin@gmail.com", "0171111112") ;
        Student s1 = new Student("Samin", c1) ;


        Contact c2 = new Contact("Abdullah@gmail.com", "0171111112") ;
        Student s2 = new Student("Abdullah", c2) ;
    
    
        school.addStudent(s1);
        school.addStudent(s2);

        school.showStudents();
    }
}
