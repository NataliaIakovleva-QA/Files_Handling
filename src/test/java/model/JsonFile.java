package model;

import java.util.List;

public class JsonFile {
    private String size;
    private String colour;
    private double volume;
    private String condition;
    private boolean closed;
    private List<String> contents;

    public String getSize() {
        return size;
    }


    public String getColour() {
        return colour;
    }

    public double getVolume() {
        return volume;
    }

    public String getCondition() {
        return condition;
    }

    public boolean isClosed() {
        return closed;
    }

    public List<String> getContents() {
        return contents;
    }
}
