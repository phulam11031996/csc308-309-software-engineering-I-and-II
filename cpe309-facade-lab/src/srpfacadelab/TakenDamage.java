package srpfacadelab;

public class TakenDamage extends InventoryManager {

    public TakenDamage(IGameEngine gameEngine) {
        super(gameEngine);
    }

    public void takeDamage(int damage) {
        if (calculateInventoryWeight() <= getCarryingCapacity() / 2) damage = damage * 3 / 4;

        if (damage < super.getArmour()) {
            super.getGameEngine().playSpecialEffect("parry");
        }

        int damageToDeal = damage - super.getArmour();
        setHealth(super.getHealth() - damageToDeal);

        super.getGameEngine().playSpecialEffect("lots_of_gore");
    }
}
