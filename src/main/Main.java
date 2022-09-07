package main;

import service.SimpleLogin;

public class Main {
    public static void main(String[] args) {
        SimpleLogin.instance().process();
    }
}
