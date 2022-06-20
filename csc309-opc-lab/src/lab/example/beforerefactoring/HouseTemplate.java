package lab.example.beforerefactoring;

public class HouseTemplate {

    public void buildWoodenHouse(){
        buildFoundation();
        buildWoodenPillars();
        buildWoodenWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    public void buildGlassHouse(){
        buildFoundation();
        buildGlassPillars();
        buildGlassWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    public void buildConcreteHouse(){
        buildFoundation();
        buildCementPillars();
        buildCementWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    private void buildFoundation() {

        System.out.println("Building foundation with cement, iron rods and sand");
    }

    private void buildWoodenPillars() {

        System.out.println("Building Pillars with Wood coating");
    }

    private void buildGlassPillars() {

        System.out.println("Building Pillars with glass coating");
    }

    private void buildCementPillars() {

        System.out.println("Building Pillars with cement");
    }

    private void buildWoodenWalls(){

        System.out.println("Building Wooden Walls");

    }

    private void buildGlassWalls(){

        System.out.println("Building Glass Walls");
    }

    private void buildCementWalls(){

        System.out.println("Building Cement Walls");
    }

    private void buildWindows() {

        System.out.println("Building Glass Windows");
    }


}
