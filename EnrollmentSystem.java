import java.util.*;

public class EnrollmentSystem {
    private Set<Student> studentList;
    private Set<Unit> unitList;
    private Set<Enrollment> enrollmentList;

    public EnrollmentSystem() { //constructor
        studentList = new HashSet<Student>();
        unitList = new HashSet<Unit>();
        enrollmentList = new HashSet<Enrollment>();
    }


//pre-condition 1: id? exists
    public boolean searchStudent (String id){
        for (Student s:studentList){ //s is a Student object
            if ( s.getId().equals(id) ){ //".equals()" from where???
                return true;
            }
        }
        return false;
    }

//pre-condition 2: student has not enrolled yet
    public boolean checkNoEnrollment(String id){
        for (Student s:studentList) {
            if (int e = enrollmentList.size()){

            }
        }
        return false;
    }

    public String toString() {
        return studentList.toString()+", "+unitList.toString()+", "+enrollmentList.toString();
    }

}
