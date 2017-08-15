package hagai.edu.snakedefiner;

import android.content.Context;

/**
 * Created by Hagai Zamir on 11-Aug-17.
 */

public enum EnumSnakeColor {
    snakeColorUndefined (R.string.snake_color_undefined),
    snakeColorOrangeRed(R.string.snake_color_orange_red),
    snakeColorLightBrwon(R.string.snake_color_lightbrown),
    snakeColorWhite(R.string.snake_color_white),
    snakeColorYellow(R.string.snake_color_yellow),
    snakeColorGreen(R.string.snake_color_green),
    snakeColorGray(R.string.snake_color_gray),
    snakeColorDarkBrown(R.string.snake_color_darkbrown),
    snakeColorPink(R.string.snake_color_pink),
    snakeColorBluish(R.string.snake_color_bluish),
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
