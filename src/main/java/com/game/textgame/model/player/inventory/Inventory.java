package com.game.textgame.model.player.inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory<I extends InventoryItem> {
    private List<I> inventory;

    public Inventory() {
        inventory = new ArrayList<I>();
    }

    public void add(I item) {
        inventory.add(item);
    }

    public void remove(I item) {
        inventory.remove(item);
    }

}
