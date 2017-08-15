package hagai.edu.snakedefiner;

import android.content.Context;

/**
 * Created by Hagai Zamir on 11-Aug-17.
 */

public enum EnumSnakeLocation {

    snakeLocationUndefined (R.string.snake_location_undefined),
    snakeLocationNegevArava (R.string.snake_location_negev_arava),
    snakeLocationJudaDeserd (R.string.snake_location_juda_deserd),
    snakeLocationJudaSamaria (R.string.snake_location_juda_samaria),
    snakeLocationGalil (R.string.snake_location_galil),
    snakeLocationGlolaHights (R.string.snake_location_golan_hights),
    snakeLocationCoastLine (R.string.snake_location_coast_line);

    private int snakeLocationStringID;


    EnumSnakeLocation(int snakeLocationStringID) {
        this.snakeLocationStringID = snakeLocationStringID;
    }

    static String getSnakeLocationStringID(EnumSnakeLocation snakeLocation , Context context) {
        return context.getString(snakeLocation.snakeLocationStringID);
    }


}
