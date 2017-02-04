package ch010;

/**
 * Created by Administrator on 2017/2/4.
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;

    int count = 0;

    public GumballMachine(int numberGumballs) {
        this.soldOutState = new SoldoutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("a gumball comes rolling out the slot");
        if (count != 0) {
            count = count - 1;
        }
    }

    void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return this.count;
    }

    public State getHasQuarterState() {
        return this.hasQuarterState;
    }

    public State getNoQuarterState() {
        return this.noQuarterState;
    }

    public State getSoldOutState() {
        return this.soldOutState;
    }

    public State getSoldState() {
        return this.soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
}
