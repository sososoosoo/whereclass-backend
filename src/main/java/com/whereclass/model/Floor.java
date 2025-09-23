package com.whereclass.model;

import java.util.Map;

public class Floor {
    private String floorName;
    private String svgFile;
    private SvgDimensions svgDimensions;
    private Map<String, Room> clickableAreas;

    public Floor() {}

    public Floor(String floorName, String svgFile, SvgDimensions svgDimensions,
                 Map<String, Room> clickableAreas) {
        this.floorName = floorName;
        this.svgFile = svgFile;
        this.svgDimensions = svgDimensions;
        this.clickableAreas = clickableAreas;
    }

    public String getFloorName() { return floorName; }
    public void setFloorName(String floorName) { this.floorName = floorName; }

    public String getSvgFile() { return svgFile; }
    public void setSvgFile(String svgFile) { this.svgFile = svgFile; }

    public SvgDimensions getSvgDimensions() { return svgDimensions; }
    public void setSvgDimensions(SvgDimensions svgDimensions) { this.svgDimensions = svgDimensions; }

    public Map<String, Room> getClickableAreas() { return clickableAreas; }
    public void setClickableAreas(Map<String, Room> clickableAreas) { this.clickableAreas = clickableAreas; }
}