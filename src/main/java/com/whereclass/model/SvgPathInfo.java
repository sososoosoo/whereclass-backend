package com.whereclass.model;

public class SvgPathInfo {
    private String originalElement;
    private int childCount;
    private String pathData;

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
}