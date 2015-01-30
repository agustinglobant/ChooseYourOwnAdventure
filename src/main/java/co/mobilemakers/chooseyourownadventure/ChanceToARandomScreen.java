package co.mobilemakers.chooseyourownadventure;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

/**
 * Created by agustin.gugliotta on 29/01/2015.
 */
public class ChanceToARandomScreen implements View.OnClickListener {

    Random mChance = new Random();
    FragmentManager fragmentManager;


    public ChanceToARandomScreen(FragmentManager fragmentManager){
        this.fragmentManager = fragmentManager;
    }

    @Override
    public void onClick(View v) {
        Fragment random_fragment = null;
        Bundle bundle = new Bundle();
        switch (mChance.nextInt(4)){
            case 0:
                random_fragment = new AlleyFragment();
                break;
            case 1:
                random_fragment = new RoomFragment();
                break;
            case 2:
                random_fragment = new ResultFragment();
                bundle.putInt("win_or_lose",mChance.nextInt(9));
                random_fragment.setArguments(bundle);
                break;
            case 3:
                random_fragment = new ResultFragment();
                bundle.putInt("win_or_lose",mChance.nextInt(9));
                random_fragment.setArguments(bundle);
                break;
        }
        fragmentManager.beginTransaction().replace(R.id.main_layout, random_fragment).addToBackStack(null).commit();
    }
}