package service.menu;

import bean.Config;
import bean.Teacher;
import service.menu.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void process() {
        Teacher[] teachers = Config.getInstance().getTeachers();
        for(Teacher teacher: teachers){
            System.out.println(teacher);
        }
    }
}
