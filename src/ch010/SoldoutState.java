package ch010;

/**
 * Created by Administrator on 2017/2/4.
 */
public class SoldoutState implements State{
    GumballMachine gumballMachine;

    public SoldoutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
