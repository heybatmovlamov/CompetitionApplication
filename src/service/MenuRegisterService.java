package service;

import service.inter.MenuRegisterServiceInter;
import util.UtilMenu;

import java.util.Scanner;

public class MenuRegisterService implements MenuRegisterServiceInter {
    private static int a;

    public static int getA() {
        return a;
    }

    public void setA(int a) {
        MenuRegisterService.a = a;
    }

    @Override
    public void process() {
        utilProcess();
    }

    public void utilProcess() {
        System.out.println("How many people will participate in the race ?");
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        a = people;
        int[] arr = new int[people];
        for (int i = 0; i < people; i++) {
            System.out.print(i + 1 + ") ");
            int race = sc.nextInt();
            arr[i] = race;
        }
        UtilMenu.showMenu();
    }

}
