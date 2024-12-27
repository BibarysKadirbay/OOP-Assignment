import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private static int ID = 1;
    private ArrayList<Integer> grades;
    private Double GPA;
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    public Student(){}
    public Student(String name , String surname , int age , boolean gender) {
        super(name,  surname , age , gender);
        this.grades = new ArrayList<>();
        this.studentID = ID++;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        Student.ID = ID;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public double convertGPA(int grade){
        if(grade >= 95) return 4.0;
        else if(grade >= 90) return 3.67;
        else if(grade >= 85) return 3.33;
        else if(grade >= 80) return 3.0;
        else if(grade >= 75) return 2.67;
        else if(grade >= 70) return 2.33;
        else if(grade >= 65) return 2.0;
        else if(grade >= 60) return 1.67;
        else if(grade >= 55) return 1.33;
        else if(grade >= 50) return 1.0;
        else return 0. ;
    }
    public void calculateGPA() {
        if (grades.isEmpty()){
            this.GPA = 0.0;
            return;
        }
        double sum = 0.0;
        for(Integer grade : grades) {
            sum += convertGPA(grade);
        }
        GPA = sum/grades.size();
        return ;
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}