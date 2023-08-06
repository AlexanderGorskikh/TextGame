package com.game.textgame.model.player;

import com.game.textgame.model.NPC.Enemy;
import com.game.textgame.model.player.inventory.Inventory;
import com.game.textgame.model.player.inventory.InventoryItem;

public class Warrior extends Player{
    Warrior(Location location) {
        super(location);
    }

    @Override
    public boolean attack(Enemy enemy) {

        return true;
    }
}
