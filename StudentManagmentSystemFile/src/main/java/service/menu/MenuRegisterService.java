package service.menu;

import bean.Config;
import service.menu.inter.MenuRegisterServiceInter;

public class MenuRegisterService implements MenuRegisterServiceInter {

    @Override
    public void process() {
        System.out.println("Register");
        Config.setLoggedIn(true);
    }
}
