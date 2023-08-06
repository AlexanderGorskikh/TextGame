package com.game.textgame.model.player;

public class Test {
    public static void main(String[] args) {
        Player player = new Warrior(new Location(1,5));
        System.out.println(player.getXP_BAR());
        System.out.println(player.getLvl());
        player.setXP(250);
        System.out.println(player.getXP_BAR());
        System.out.println(player.getLvl());
    }
}
