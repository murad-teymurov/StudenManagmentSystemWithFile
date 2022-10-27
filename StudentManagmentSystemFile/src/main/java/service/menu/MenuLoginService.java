package service.menu;

import bean.Config;
import service.menu.inter.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {

    @Override
    public void process() {
        System.out.println("enter username and password");

        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("password:");
        String password = sc2.nextLine();

        if(!(username.equals("user") && password.equals("1111"))){
            throw  new IllegalArgumentException("username or password is invalid");
        }
        Config.setLoggedIn(true);
    }
}
