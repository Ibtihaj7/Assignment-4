package edu.najah.cap.extended;

import edu.najah.cap.abstractClass.Color;

public class DifferentColor extends Color {
    public DifferentColor(int red, int green, int blue) {
        super(red, green, blue);
    }
    @Override
    public String toString() {
        return "Red: "+this.getRed()+" ,Green: "+this.getGreen()+" ,Blue: "+this.getBlue();
    }

}
