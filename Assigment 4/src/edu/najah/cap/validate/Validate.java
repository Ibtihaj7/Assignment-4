package edu.najah.cap.validate;

import edu.najah.cap.ColorStore;

public class Validate {
    public boolean validInput( int red, int green, int blue) {
        return !(red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255);
    }
    public boolean ifExist(int red, int green, int blue) {
       return ColorStore.colors.containsKey(red+","+green+","+blue);
    }

}
