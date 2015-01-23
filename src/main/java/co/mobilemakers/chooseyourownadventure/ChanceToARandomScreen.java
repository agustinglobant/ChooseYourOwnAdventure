package co.mobilemakers.chooseyourownadventure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.Random;
import android.view.ViewGroup;


/**
 * Created by agustin.gugliotta on 23/01/2015.
 */
public class ChanceToARandomScreen implements View.OnClickListener {

    Random mChance = new Random();
    Context mSourceActivity;

    public ChanceToARandomScreen(Context context){
        mSourceActivity = context;
    }

    @Override
    public void onClick(View v) {
        if (mChance.nextInt(65000) % 2 == 0) {
            //alley
            Intent intent = new Intent(mSourceActivity, AlleyActivity.class);
        } else {
            //room
            Intent intent = new Intent(mSourceActivity, RoomActivity.class);
        }
    }
}
