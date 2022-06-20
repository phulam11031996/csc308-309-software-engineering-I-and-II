package lab.assignment.beforerefactoring;

public class CapuccinoCoffee extends CoffeeTemplate {

    protected void finalTouch() {
        System.out.println("Top with milk foam");
    }

    protected void addIngredients() {
        System.out.println("Add hot milk");
        System.out.println("Add cinnamon");
    }
}
