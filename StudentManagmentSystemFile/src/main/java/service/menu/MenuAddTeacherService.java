package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.menu.inter.MenuAddTeacherServiceInter;
import utill.FileUtility;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void process() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter surname:");
        String surname = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc3.nextInt();

        Teacher teacher = new Teacher(name,surname,age);
//        teacher.setName(name);
//        teacher.setSurname(surname);

        Config.getInstance().appendTeacher(teacher);
        FileUtility.writeObjectToFile(Config.getInstance(),"base.obj");
        System.out.println("Teacher added!");

    }
}
