package lab.example.afterrefactoring.clientcode;

import lab.example.afterrefactoring.ConcreteHouse;
import lab.example.afterrefactoring.GlassHouse;
import lab.example.afterrefactoring.HouseTemplate;
import lab.example.afterrefactoring.WoodenHouse;

public class HouseClient {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        //using template method
        houseType.buildHouse();
        System.out.println("************");

        houseType = new GlassHouse();
        houseType.buildHouse();

        System.out.println("************");

        houseType = new ConcreteHouse();
        houseType.buildHouse();
    }
}
