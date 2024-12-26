import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();
        File file = new File("/Users/bibaryskadyrbaj/Downloads/student.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            String[] info = scanner.nextLine().split(" ");
            Student student = new Student();
            student = new Student(info[0] , info[1] , Integer.parseInt(info[2]) , (info[3].equals("Male") ? true : false));
            for(int i = 4 ; i < info.length ; i++) {
                student.addGrade(Integer.parseInt(info[i]));
            }
            student.calculateGPA();
            school.addMember(student);
        }
        scanner.close();
        File file1 = new File("/Users/bibaryskadyrbaj/Downloads/teacher.txt");
        Scanner scan = new Scanner(file1);
        while(scan.hasNextLine()) {
            String[] info = scan.nextLine().split(" ");
            Teacher teacher = new Teacher();
            teacher = new Teacher(info[0] , info[1] , Integer.parseInt(info[2]) , (info[3].equals("Male") ? true : false) ,
                    info[4] , Integer.parseInt(info[5]) , Integer.parseInt(info[6]));
            if(Integer.parseInt(info[5]) > 10) teacher.giveRaise();
            school.addMember(teacher);
        }
        scan.close();
        System.out.println(school);
    }
}