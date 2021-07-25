package com.example.cookhappy;

public class BuaAn {
    public String name;
    private String popula;
    private String overview;
    private int image;

    public BuaAn(String name,String popula, String overview, int image) {
        this.name = name;
        this.popula = popula;
        this.overview = overview;
        this.image = image;
    }
    public BuaAn() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopula(){return popula; }

    public void setPopula(String popula) { this.popula = popula; }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
