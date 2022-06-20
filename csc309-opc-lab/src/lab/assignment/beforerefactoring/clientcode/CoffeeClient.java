package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.beforerefactoring.AmericanoCoffee;
import lab.assignment.beforerefactoring.CapuccinoCoffee;
import lab.assignment.beforerefactoring.CoffeeTemplate;
import lab.assignment.beforerefactoring.MochaCoffee;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeTemplate starbuzz = new AmericanoCoffee();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoCoffee();
        starbuzz.prepareCoffee();
        
        System.out.println("********************");

        starbuzz = new MochaCoffee();
        starbuzz.prepareCoffee();
    }

}
