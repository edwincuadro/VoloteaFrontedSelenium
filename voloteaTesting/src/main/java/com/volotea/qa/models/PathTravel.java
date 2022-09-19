package com.volotea.qa.models;

public class PathTravel {
    private String origin;
    private String destiny;

    public PathTravel(String origin, String destiny){
        this.origin = origin;
        this.destiny = destiny;
    }

    public String getOrigin() {
        return origin;
    }
    public String getDestiny() {
        return destiny;
    }
}
