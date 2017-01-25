package TemplatePattern;

/**
 * Created by Administrator on 2017/1/24.
 */
public class Coffee extends CoffeineBeverage{

    public void brewCoffeeGrinds() {
    }

    public void addSugarAndMilk() {
    }

    public void brew() {
        brewCoffeeGrinds();
    }

    public void addCondiments() {
        addSugarAndMilk();
    }

}
