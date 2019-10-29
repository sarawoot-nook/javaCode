package main;
import java.util.Arrays;
public class Student {
    //Show list student
    public static String[][] studentList() {
            String student [][]  = {{"100","Nook","70"},{"101","Game","60"},{"102","May","80"},{"103","Gee","49"}};
            return student;
    }
    //Show student from code
    public static String studentFind(String code) {
        String[][] student = studentList();
        Grade grade = new Grade();
        if(code.equals("all")) { 
            return  String.valueOf(studentList());
        }
        if(!"all".equals(code)) {
            for(int i = 0; i < student.length; i++) {
                if(student[i][0].equals(code)) {
                    return  "Code : " + student[i][0] + 
                            "\nName : " + student[i][1] + 
                            "\nScore : " + student[i][2] +
                            "\nGrade : " + grade.showGrade(Double.valueOf(student[i][2]));
                }
            }
        }
        return "Not found";
    }
}
