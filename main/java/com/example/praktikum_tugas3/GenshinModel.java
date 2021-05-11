package com.example.praktikum_tugas3;

public class GenshinModel {
    private String image,name,vision,summary;

    public GenshinModel(String image, String name, String vision, String summary) {
        this.image   = image;
        this.name    = name;
        this.vision   = vision;
        this.summary = summary;
    }

    public GenshinModel() {

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}