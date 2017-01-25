package IteratorPattern;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/1/25.
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast",
                "Pancackes with scrambled eggs, and toast",
                true,
                2.99
                );

        addItem("Blueberry Pancake",
                "Pancackes made with blueberries",
                true,
                3.59
        );

        addItem("Orange Pancake",
                "Pancackes made with oranges",
                true,
                8.59
        );
    }

    public void addItem(String name,
                        String description,
                        boolean vegetarian,
                        double price
                        )
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }


    //其他依赖于arrayList不想改写的方法
}
