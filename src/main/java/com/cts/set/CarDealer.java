package com.cts.set;

import java.util.Set;

public class CarDealer {
    private String name;
    private String location;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    private Set<String> models;
    public Set<String> getModels() {
        return models;
    }
    public void setModels(Set<String> models) {
        this.models = models;
    }
}
