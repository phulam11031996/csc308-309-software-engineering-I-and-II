package lab.example.afterrefactoring;

public class ConcreteHouse extends HouseTemplate {
    @Override
    protected void buildWalls() {
        System.out.println("Building Cement Walls");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building Pillars with cement");
    }
}
