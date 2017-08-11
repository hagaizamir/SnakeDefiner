package hagai.edu.snakedefiner;

import android.content.Context;

/**
 * Created by Hagai Zamir on 11-Aug-17.
 */

public enum EnumSnakeColor {
    snakeColorBrownRed(R.string.snake_color_brown_red),
    snakeColorBlack(R.string.snake_color_black);

    private int snakeColorStringID;

//constructor
    EnumSnakeColor(int snakeColorStringID) {
        this.snakeColorStringID = snakeColorStringID;
    }

    static String getSnakeColor(EnumSnakeColor snakeColor, Context context) {
        return  context.getString(snakeColor.snakeColorStringID);
    }

}
