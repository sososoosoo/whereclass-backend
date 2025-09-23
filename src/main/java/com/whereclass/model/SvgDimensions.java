package com.whereclass.model;

public class SvgDimensions {
    private int width;
    private int height;
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