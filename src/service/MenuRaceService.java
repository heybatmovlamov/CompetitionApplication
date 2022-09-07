package service;

import service.inter.MenuRaceServiceInter;
import util.UtilMenu;

import java.util.Random;
import java.util.Scanner;

public class MenuRaceService implements MenuRaceServiceInter {
    @Override
    public void process() {
        Random r = new Random();
        int i = r.nextInt(MenuRegisterService.getA());

        if (i != 0) {
            System.out.println("Who do you think is the chosen one?");
            Scanner sc = new Scanner(System.in);
            int i1 = sc.nextInt();
            if (i1 == i) {
                System.out.println("“Congratulations you won!”");
            } else {
                System.out.println("You failed");
            }
        }
        UtilMenu.showMenu();
    }
}
