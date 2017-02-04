package IteratorPattern;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/1/25.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();

        printMenu(dinerIterator);
        printMenu(pancakeIterator);
    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName());
        }
    }
}
