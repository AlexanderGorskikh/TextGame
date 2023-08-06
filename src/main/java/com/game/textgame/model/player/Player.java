package com.game.textgame.model.player;

import com.game.textgame.model.NPC.Enemy;
import com.game.textgame.model.player.inventory.Inventory;
import com.game.textgame.model.player.inventory.InventoryItem;

public abstract class Player {
    private final Inventory<InventoryItem> inventory;
    private Location location;
    private int HP;
    private int MP;
    private int XP;
    private int lvl = 1;
    private int gold;
    private final int BASIC_XP_BAR = 1000; // Количество опыта для набора 1 уровня
    private int XP_BAR = (int) (BASIC_XP_BAR * (.2 * lvl));
    private boolean isAlive = true;

    public Player(Location location) {
        inventory = new Inventory<>();
        this.location = location;
        HP = ConfigClass.WARRIOR_BASIC_HP;
        MP = ConfigClass.WARRIOR_BASIC_MP;
    }
    public abstract boolean attack(Enemy enemy);

    void checkLife() { // После каждого удара противника будет проверка на жизнь
        if (HP <= 0) {
            this.isAlive = false;
        }
    }

    private void checkLevelUp() {  // При достижении нужного количества опыта будет lvl up
        if (XP > XP_BAR) {
            lvl++;
            XP = 0;
            XP_BAR = (int) (BASIC_XP_BAR * (.2 * lvl));
        }
    }

    public int getXP_BAR() {
        return this.XP_BAR;
    }

    public void setXP(int XP) {
        this.XP += XP;
        checkLevelUp();
    }

    public int getHP() {
        return this.HP;
    }

    public void setHealing(int HP) {
        this.HP += HP;
    }

    public void getDamage(int HP) {
        this.HP -= HP;
    }

    public int getMP() {
        return this.MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getLvl() {
        return this.lvl;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
}
