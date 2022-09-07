package util;

import service.MenuExitService;
import service.MenuLogOutService;
import service.MenuRaceService;
import service.MenuRegisterService;
import service.inter.MenuService;

public enum Menu {
    REGISTER(1,"Register racers",new MenuRegisterService()),
    START(2,"Start the race",new MenuRaceService()),
    LOGOUT(3,"Logout",new MenuLogOutService()),
    EXIT(4,"Quit",new MenuExitService()),
    UNKNOWN;


    private int number;
    private String label;
    private MenuService service;

    @Override
    public String toString() {
        return number + "." + label;
    }

    Menu(int number , String label , MenuService service) {
        this.number = number;
        this.label = label;
        this.service = service;
    }
    Menu(){

    }
    public void process() {
        service.process();
    }
    public static void ShowAllMenu(){
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length ; i++) {
            if (UNKNOWN != menus[i]) {
                System.out.println(menus[i]);
            }
        }
    }
    public static Menu find(int number) {
        Menu[] menus = Menu.values();

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }
        return Menu.UNKNOWN;
    }
    public int getNumber(){
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public MenuService getService() {
        return service;
    }



    public void setService(MenuService service) {
        this.service = service;
    }
}
