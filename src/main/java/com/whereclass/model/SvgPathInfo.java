package com.whereclass.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SvgPathInfo {
    @JsonProperty("original_element")
    private String originalElement;

    @JsonProperty("child_count")
    private int childCount;

    @JsonProperty("path_data")
    private String pathData;

    @JsonProperty("has_path")
    private Boolean hasPath;

    @JsonProperty("has_rect")
    private Boolean hasRect;

    public SvgPathInfo() {}

    public SvgPathInfo(String originalElement, int childCount, String pathData) {
        this.originalElement = originalElement;
        this.childCount = childCount;
        this.pathData = pathData;
    }

    public String getOriginalElement() { return originalElement; }
    public void setOriginalElement(String originalElement) { this.originalElement = originalElement; }

    public int getChildCount() { return childCount; }
    public void setChildCount(int childCount) { this.childCount = childCount; }

    public String getPathData() { return pathData; }
    public void setPathData(String pathData) { this.pathData = pathData; }

    public Boolean getHasPath() { return hasPath; }
    public void setHasPath(Boolean hasPath) { this.hasPath = hasPath; }

    public Boolean getHasRect() { return hasRect; }
    public void setHasRect(Boolean hasRect) { this.hasRect = hasRect; }
}