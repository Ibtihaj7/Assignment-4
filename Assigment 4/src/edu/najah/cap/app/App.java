package edu.najah.cap.app;

import edu.najah.cap.abstractClass.Color;
import edu.najah.cap.ColorStore;

public class App {

    public static void main(String[] args) {
        ColorStore colorStore = new ColorStore();

        colorStore.getColor(0, 4, 5);
        colorStore.getColor(255, 4, 5);
        colorStore.getColor(0, 0, 0);//exist(Black color)
        colorStore.getColor(5, 255, 88);
        colorStore.getColor(10, 102, 100);
        colorStore.getColor(253, 22, 255);
        colorStore.getColor(253, 22, 255);//exist
        colorStore.getColor(88, 84, 120);
        colorStore.getColor(50, 4, 140);
        colorStore.getColor(260, 4, 5);//invalid input

        System.out.println(colorStore.getColor(0,0,0).toString());

        ColorStore.colors.values().forEach(el -> print(el));

    }
    public static void print(Color color){
        System.out.println(color.toString());
    }
}