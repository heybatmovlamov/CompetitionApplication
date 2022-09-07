package service;

import service.inter.MenuLogOutServiceInter;

public class MenuLogOutService implements MenuLogOutServiceInter {
    @Override
    public void process(){
        SimpleLogin.instance().process();
    }
}
