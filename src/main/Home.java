package main;
import java.util.Arrays;
import java.util.Scanner;
public class Home {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Code Student : ");
        String code = reader.next();
        Student student = new Student();
        Grade grade = new Grade();
        String [][] sList = student.studentList();
        if(!"all".equals(code)) {
            System.out.println(student.studentFind(code));
        }
        if(code.equals("all")) {
            int j = 1;
            for(int i = 0; i < sList.length; i++) {
                System.out.print(j + ". " +sList[i][0] +" "+ sList[i][1] +" "+ sList[i][2] +" "+ grade.showGrade(Double.valueOf(sList[i][2])));
                System.out.println();
                j++;
            }
        }
    }
}
