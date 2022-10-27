package utill;

import java.util.Scanner;

public class MenuUtil {

    public static void showMenu(){

        Menu.showAllMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu:");
        int selectedMenu = sc.nextInt();

        Menu menu =  Menu.find(selectedMenu);
        menu.process();

    }

    public static void processMenu(Menu menu){
       menu.process();
    }
}
