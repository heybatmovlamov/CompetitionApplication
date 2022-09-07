package service;

import util.UtilMenu;

import java.util.Scanner;

public class SimpleLogin {
    private static SimpleLogin obj = null;
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }


    public void process() {
        utilProcess();

    }
    private void utilProcess(){
        int i = 0;
        boolean b = true;
        while (b) {
            System.out.println("Enter login info");
            Scanner sc = new Scanner(System.in);
            System.out.println("username :");
            String username = sc.nextLine();
            setUsername(username);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("password :");
            String password = sc2.nextLine();
            setPassword(password);

            if ((username.equals("Heybet")) && (password.equals("11111"))) {
                System.out.println("Login completed");
                UtilMenu.showMenu();
            } else {
                i++;
                System.out.println(3 - i + "Sansiniz qaldi");
                if (i == 3) {
                    b = false;
                }
            }
        }
    }

    public static SimpleLogin instance() {
        if (obj == null) {
            obj = new SimpleLogin();
        }
        return obj;
    }
}