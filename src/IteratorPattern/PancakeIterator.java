package IteratorPattern;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/1/25.
 */
public class PancakeIterator implements Iterator{
    public boolean hasNext() {
        return true;
    }

    public Object next() {
        return new Object();
    }
}
