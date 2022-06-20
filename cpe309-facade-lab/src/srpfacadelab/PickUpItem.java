package srpfacadelab;

public class PickUpItem extends InventoryManager {

    public PickUpItem(IGameEngine gameEngine) {
        super(gameEngine);
    }

    public boolean pickUpItem(Item item) {
        int weight = calculateInventoryWeight();
        if (weight + item.getWeight() > super.getCarryingCapacity()) return false;

        if (item.isUnique() && checkIfItemExistsInInventory(item)) return false;

        // Don't pick up items that give health, just consume them.
        if (item.getHeal() > 0) {
            setHealth(getMaxHealth() + item.getHeal());

            if (super.getHealth() > super.getMaxHealth()) setHealth(getMaxHealth());

            if (item.getHeal() > 500) {
                super.getGameEngine().playSpecialEffect("green_swirly");
            }

            return true;
        }

        if (item.isRare() && !item.isUnique()) super.getGameEngine().playSpecialEffect("cool_swirly_particles");

        if (item.isRare() && item.isUnique()) super.getGameEngine().playSpecialEffect("blue_swirly");

        super.getInventory().add(item);

        calculateStats();

        return true;
    }
}
