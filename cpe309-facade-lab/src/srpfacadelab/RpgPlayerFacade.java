package srpfacadelab;

public class RpgPlayerFacade {
    PickUpItem pickUpItem;
    TakenDamage takenDamage;
    UseItem useItem;
    InventoryManager inventoryManager;

    public RpgPlayerFacade(PickUpItem pickUpItem, TakenDamage takenDamage, UseItem useItem, InventoryManager inventoryManager) {
        this.pickUpItem = pickUpItem;
        this.takenDamage = takenDamage;
        this.useItem = useItem;
        this.inventoryManager = inventoryManager;
    }

    public void pickUpItem(Item item) {
        this.pickUpItem.pickUpItem(item);
    }

    public void takenDamage(int damage) {
        this.takenDamage.takeDamage(damage);
    }

    public void useItem(Item item) {
        this.useItem.useItem(item);
    }

    public void calculateStats() {
        this.inventoryManager.calculateStats();
    }

    public boolean checkIfItemExistsInInventory(Item item) {
        return this.inventoryManager.checkIfItemExistsInInventory(item);
    }

    public int calculateInventoryWeight() {
        return this.inventoryManager.calculateInventoryWeight();
    }
}
