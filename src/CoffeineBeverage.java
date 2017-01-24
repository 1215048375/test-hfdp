/**
 * Created by Administrator on 2017/1/24.
 */
public abstract class CoffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {

    }

    public void pourInCup() {

    }

    abstract void brew();

    abstract void addCondiments();
}
