package IteratorPattern;

/**
 * Created by Administrator on 2017/1/25.
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("item1", "item1 is good", true, 2.00);
        addItem("item2", "item2 is very good", true, 4.00);
        addItem("item3", "item3 is very very good", false, 3.00);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            //err
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    //其他依赖menuItem不愿意修改的方法
}
