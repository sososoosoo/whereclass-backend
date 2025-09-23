package com.whereclass.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SvgDimensions {
    private int width;
    private int height;

    @JsonProperty("viewBox")
    private String viewBox;

    public SvgDimensions() {}

    public SvgDimensions(int width, int height, String viewBox) {
        this.width = width;
        this.height = height;
        this.viewBox = viewBox;
    }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public String getViewBox() { return viewBox; }
    public void setViewBox(String viewBox) { this.viewBox = viewBox; }
}