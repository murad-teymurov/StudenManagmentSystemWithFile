package service.menu;

import service.menu.inter.MenuService;

public class MenuExitService implements MenuService {
    @Override
    public void process() {
        System.exit(0);
    }
}
