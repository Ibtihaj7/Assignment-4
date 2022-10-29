package edu.najah.cap.extended;

import edu.najah.cap.abstractClass.Color;

public class DefultColor extends Color {
    private String nameOfColor;

    public DefultColor(String nameOfColor,int red, int green, int blue) {
        super(red, green, blue);
        this.nameOfColor = nameOfColor;
    }

    @Override
    public String toString() {
        return nameOfColor;
    }

}