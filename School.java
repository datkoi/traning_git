import java.util.ArrayList;
import java.util.Scanner;

public class School {
    static ArrayList<Student> students = new ArrayList<>();
    public void add(){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.print("FullName: ");
        student.setFullname(scanner.nextLine());
        System.out.print("Age: ");
        student.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Address: ");
        student.setAddress(scanner.nextLine());
        System.out.print("ClassName: ");
        student.setClassname(scanner.nextLine());
        students.add(student);
    }
    public void showInfo(){
        for (Student student : students) {
            String s = String.format("%-20s%-8d%-20s%-20s", student.getFullname(), student.getAge(),
                                                            student.getAddress(), student.getClassname());
            System.out.println(s);
        }
    }
}    