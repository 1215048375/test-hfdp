package ch010;

/**
 * Created by Administrator on 2017/2/4.
 */
public interface State {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();

}
