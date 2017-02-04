package IteratorPattern;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/1/25.
 */
public class DinerMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position > menuItems.length || menuItems[position] == null) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }

    public void remove() {

    }
}
