package hagai.edu.snakedefiner;

import android.content.Context;

/**
 * Created by Hagai Zamir on 11-Aug-17.
 */

public enum EnumSnakeSize {
    snakeSizeUndefined (R.string.snake_size_undefined),
    snakeSizeSmall (R.string.snake_size_small),
    snakeSizeMedium (R.string.snake_size_medium),
    snakeSizeLarge (R.string.snake_size_large),
    snakeSizeExtraLarge (R.string.snake_size_extra_large);

    private int snakeSizeStringID;

    EnumSnakeSize(int snakeSizeStringID) {
        this.snakeSizeStringID = snakeSizeStringID;
    }

    public String getSnakeSize(int snakeSizeStringID , Context context) {
        return context.getString(snakeSizeStringID) ;
    }
}
