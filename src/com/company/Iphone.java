package com.company;

public class Iphone extends Smartphone {

    private String model;

    public Iphone(String operating_system, String model) {
        super(operating_system);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String print() {
        return super.print() + "; " +  "Model: " + model  + "\n";
    }

}
