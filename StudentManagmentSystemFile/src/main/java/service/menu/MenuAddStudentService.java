package service.menu;

import bean.Config;
import bean.Student;
import service.menu.inter.MenuAddStudentServiceInter;
import utill.FileUtility;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter  {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname");
        String surname = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc3.nextInt();

        Student student = new Student(name,surname,age);
//        student.setName(name);
//        student.setSurname(surname);
//        student.setAge(age);

        Config.getInstance().appendStudent(student);
        System.out.println("Student added!");

        FileUtility.writeObjectToFile(Config.getInstance(),"base.obj");
    }
}
