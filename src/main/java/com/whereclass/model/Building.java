package com.whereclass.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Map;

@Document(collection = "buildings")
public class Building {
    @Id
    private String id;
    private String buildingName;
    private Map<String, Object> floors;

    public Building() {}

    public Building(String id, String buildingName, Map<String, Object> floors) {
        this.id = id;
        this.buildingName = buildingName;
        this.floors = floors;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBuildingName() { return buildingName; }
    public void setBuildingName(String buildingName) { this.buildingName = buildingName; }

    public Map<String, Object> getFloors() { return floors; }
    public void setFloors(Map<String, Object> floors) { this.floors = floors; }
}