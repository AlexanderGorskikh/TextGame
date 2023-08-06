package com.game.textgame.model.NPC;

import com.game.textgame.model.player.Player;
import com.game.textgame.model.player.inventory.InventoryItem;

public abstract class Enemy {
    private int HP;
    private int MP;
    private int XP;
    private int gold;
    private boolean isAlive = true;

    public void getDamage(int HP) {
        this.HP -= HP;
        checkIsAlive();
    }

    public void checkIsAlive() {
        if (HP <= 0) {
            isAlive = false;
        }
    }

    public abstract void attack(Player player);
    public abstract InventoryItem getLoot();

    public int getGold() {
        return gold;
    }
}
