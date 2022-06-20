package lab.example.beforerefactoring.clientcode;

import lab.example.beforerefactoring.HouseTemplate;

public class HouseClient {

    public static void main(String[] args) {
        HouseTemplate house = new HouseTemplate();

        house.buildWoodenHouse();
        System.out.println("************");


        house.buildGlassHouse();
        System.out.println("************");

        house.buildConcreteHouse();
        System.out.println("************");

    }
}
