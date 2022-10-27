package utill;

import bean.Config;
import service.menu.*;
import service.menu.inter.MenuService;

public enum Menu {
    LOGIN(1,"Login", new MenuLoginService()),
    REGISTER(2,"Register",new MenuRegisterService()),
    ADD_TEACHER(3,"Add teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4,"Add student",new MenuAddStudentService()),
    SHOW_ALL_TEACHER(5,"Show teachers",new MenuShowTeacherService()),
    SHOW_ALL_STUDENT(6,"show students",new MenuShowStudentService()),
    EXIT(7,"Exit the System", new MenuExitService()),
    UNKNOWN;

    private int number;
    private String label;
    private MenuService service;

    Menu(){

    }
    Menu(int number,String label, MenuService service){
        this.number = number;
        this.label = label;
        this.service = service;
    }

    public String getLabel(){
        return this.label;
    }

    public void process(){
        this.service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return  number + "." + label ;
    }

    public static Menu find(int number){
        Menu[] menus = Menu.values();
        for(int i = 0; i < menus.length; i++){
            if(menus[i].getNumber() == number){
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }

    public static void showAllMenu(){
        Menu[] menus = Menu.values();
        for(int i = 0; i < menus.length; i++){
            if(menus[i] != UNKNOWN) {
                if(menus[i] == LOGIN || menus[i] == REGISTER){
                    if(!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                }else if(Config.isLoggedIn()){
                    System.out.println(menus[i]);
                }
            }
        }
    }
}
