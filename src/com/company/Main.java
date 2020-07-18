package com.company;

public class Main {

    public static void main(String[] args) {

        String[] array = new String[]{Iphone.class.getSimpleName(),Samsung.class.getSimpleName(),Xiaomi.class.getSimpleName()};

        for (String k: array
             ) {
            Smartphone smartphone = Main.createObject(k);
            System.out.printf(smartphone.print());
        }

    }

    public static Smartphone createObject(String className){
        Smartphone phone = null;
        switch (className){
            case "Xiaomi":
                phone = new Xiaomi("Android",108.5);
                break;
            case "Iphone":
                phone = new Iphone("IOS","XS");
                break;
            case "Samsung":
                phone = new Samsung("Android",128);
                break;
        }
        return phone;
    }

}
