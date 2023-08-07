package com.game.textgame.model.map.mapElement;

import javafx.scene.paint.Color;

public class MapElement {
    private int id;
    private Color color;

    void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%d %s",id,color.toString());
    }
}
