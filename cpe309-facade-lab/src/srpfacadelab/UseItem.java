package srpfacadelab;

import java.util.List;

public class UseItem extends RpgPlayer {

    public UseItem(IGameEngine gameEngine) {
        super(gameEngine);
    }

    public void useItem(Item item) {
        if (item.getName().equals("Stink Bomb")) {
            List<IEnemy> enemies = super.getGameEngine().getEnemiesNear(this);

            for (IEnemy enemy : enemies) {
                enemy.takeDamage(100);
            }
        }
    }
}
