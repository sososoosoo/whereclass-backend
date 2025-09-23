package com.whereclass.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class Floor {
    @JsonProperty("floor_name")
    private String floorName;

    @JsonProperty("svg_file")
    private String svgFile;

    @JsonProperty("svg_dimensions")
    private Object svgDimensions;  // Use Object to handle any structure

    @JsonProperty("clickable_areas")
    private Object clickableAreas;  // Use Object to handle any structure

    public Floor() {}

    public Floor(String floorName, String svgFile, Object svgDimensions,
                 Object clickableAreas) {
        this.floorName = floorName;
        this.svgFile = svgFile;
        this.svgDimensions = svgDimensions;
        this.clickableAreas = clickableAreas;
    }

    public String getFloorName() { return floorName; }
    public void setFloorName(String floorName) { this.floorName = floorName; }

    public String getSvgFile() { return svgFile; }
    public void setSvgFile(String svgFile) { this.svgFile = svgFile; }

    public Object getSvgDimensions() { return svgDimensions; }
    public void setSvgDimensions(Object svgDimensions) { this.svgDimensions = svgDimensions; }

    public Object getClickableAreas() { return clickableAreas; }
    public void setClickableAreas(Object clickableAreas) { this.clickableAreas = clickableAreas; }
}