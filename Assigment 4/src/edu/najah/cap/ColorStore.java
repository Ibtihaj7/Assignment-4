package edu.najah.cap;

import edu.najah.cap.abstractClass.Color;
import edu.najah.cap.extended.DefultColor;
import edu.najah.cap.extended.DifferentColor;
import edu.najah.cap.validate.Validate;

import java.util.HashMap;

public class ColorStore {
    public final static HashMap<String, Color> colors = new HashMap<>();
    private final static Validate checkValidate = new Validate();

    static {
        colors.put("255,0,0",new DefultColor("Red",255,0,0));
        colors.put("0,255,0", new DefultColor("Green",0,255,0));
        colors.put("0,0,255", new DefultColor("Blue",0,0,255));
        colors.put("0,0,0", new DefultColor("Black",0,0,0));
        colors.put("255,255,255", new DefultColor("White",255,255,255));
    }

    public Color getColor(int red,int green,int blue){
        if(checkValidate.ifExist(red,green,blue)){
            return colors.get(red+","+green+","+blue);
        }else {
            if (checkValidate.validInput(red, green, blue)) {
                String colorFormat = red + "," + green + "," + blue;
                colors.put(colorFormat, new DifferentColor(red, green, blue));
                return colors.get(colorFormat);
            }
            System.err.println("invalid value");
            return null;
        }
    }

}
