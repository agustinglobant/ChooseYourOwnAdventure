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
        Intent intent;
        if (mChance.nextInt(65000) % 2 == 0) {
            //alley
            intent = new Intent(mSourceActivity.getApplicationContext(), AlleyActivity.class);
        } else {
            //room
            intent = new Intent(mSourceActivity.getApplicationContext(), RoomActivity.class);
        }
        mSourceActivity.startActivity(intent);
    }
}
