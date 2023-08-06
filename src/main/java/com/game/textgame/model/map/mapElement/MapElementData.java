package com.game.textgame.model.map.mapElement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public abstract class MapElementData implements Iterable<MapElement> {
    public static final HashMap<Integer, MapElement> mapData = new HashMap<>();

    @Override
    public Iterator<MapElement> iterator() {
        return mapData.values().iterator();
    }

    public static void addMapElement(MapElement newMapElement) {
        int id = Collections.max(mapData.keySet());
        if (Collections.max(mapData.keySet()) != 0) {
            newMapElement.setId(++id);
            mapData.put(++id, newMapElement);
        } else {
            newMapElement.setId(id);
            mapData.put(id, newMapElement);
        }
    }

    public static MapElement getMapElement(int id) {
        return mapData.get(id);
    }
    public static String printInfo(){
        StringBuilder sb = new StringBuilder();
        for (MapElement m: mapData.values()){
            sb.append(sb.toString());
        }
        return sb.toString();
    }
}