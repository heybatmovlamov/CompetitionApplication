package util;

import java.util.Scanner;

public class UtilMenu {
    public static void showMenu() {

        System.out.println("Please select menu");
        Menu.ShowAllMenu();
        Scanner sc = new Scanner(System.in);
        int selectedMenuNumber = sc.nextInt();
        Menu selectedMenu = Menu.find(selectedMenuNumber);
        selectedMenu.process();
    }
}
