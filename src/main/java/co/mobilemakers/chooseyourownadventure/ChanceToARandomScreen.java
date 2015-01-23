package co.mobilemakers.chooseyourownadventure;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.Random;


/**
 * Created by agustin.gugliotta on 23/01/2015.
 */
public class ChanceToARandomScreen implements View.OnClickListener {

    Random mChance = new Random();
    Context mSourceActivity;
    int mWinningChance;

    public ChanceToARandomScreen(Context context, int winning_chance){
        mSourceActivity = context;
        mWinningChance = winning_chance;
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (mChance.nextInt(4)){
            case 0:
                intent = new Intent(mSourceActivity.getApplicationContext(), AlleyActivity.class);
                break;
            case 1:
                intent = new Intent(mSourceActivity.getApplicationContext(), RoomActivity.class);
                break;
            case 2:
                intent = new Intent(mSourceActivity.getApplicationContext(), ResultActivity.class);
                intent.putExtra("win_or_lose", mChance.nextInt(9));
                break;
            case 3:
                intent = new Intent(mSourceActivity.getApplicationContext(), ResultActivity.class);
                intent.putExtra("win_or_lose", mChance.nextInt(9));
                break;

        }
        mSourceActivity.startActivity(intent);
    }
}
