package srpfacadelab;

public class InventoryManager extends RpgPlayer {

    public InventoryManager(IGameEngine gameEngine) {
        super(gameEngine);
    }

    // functions
    public void calculateStats() {
        for (Item i : getInventory()) {
            super.setArmour(i.getArmour());
        }
    }

    public boolean checkIfItemExistsInInventory(Item item) {
        for (Item i : getInventory()) {
            if (i.getId() == item.getId()) return true;
        }
        return false;
    }

    public int calculateInventoryWeight() {
        int sum = 0;
        for (Item i : getInventory()) {
            sum += i.getWeight();
        }
        return sum;
    }
}
