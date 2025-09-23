package com.whereclass.model;

import java.util.List;

public class Room {
    private String id;
    private String type;
    private String displayName;
    private List<Coordinate> polygon;
    private Coordinate center;
    private SvgPathInfo svgPathInfo;

    public Room() {}

    public Room(String id, String type, String displayName, List<Coordinate> polygon,
                Coordinate center, SvgPathInfo svgPathInfo) {
        this.id = id;
        this.type = type;
        this.displayName = displayName;
        this.polygon = polygon;
        this.center = center;
        this.svgPathInfo = svgPathInfo;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getDisplayName() { return displayName; }
    public void setDisplayName(String displayName) { this.displayName = displayName; }

    public List<Coordinate> getPolygon() { return polygon; }
    public void setPolygon(List<Coordinate> polygon) { this.polygon = polygon; }

    public Coordinate getCenter() { return center; }
    public void setCenter(Coordinate center) { this.center = center; }

    public SvgPathInfo getSvgPathInfo() { return svgPathInfo; }
    public void setSvgPathInfo(SvgPathInfo svgPathInfo) { this.svgPathInfo = svgPathInfo; }
}