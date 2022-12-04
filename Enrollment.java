public class Enrollment {
    private Student student;
    private Unit unit;
    private String grade;

    public String toString(){
        return student.toString()+", "+unit.toString()+", grade: "+grade;
    }


    //getters
    public Student getStudent() {
        return student;
    }
    public Unit getUnit() {
        return unit;
    }
    public String getGrade() {
        return grade;
    }
}
