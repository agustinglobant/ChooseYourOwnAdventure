package co.mobilemakers.chooseyourownadventure;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class RoomFragment extends Fragment {
    Button mButtonDoorOne, mButtonDoorTwo;

    public RoomFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getWidgets();
        mButtonDoorOne.setOnClickListener(new ChanceToARandomScreen(getActivity()));
        mButtonDoorTwo.setOnClickListener(new ChanceToARandomScreen(getActivity()));

    }

    private void getWidgets() {
        mButtonDoorOne = (Button) getView().findViewById(R.id.button_door_one);
        mButtonDoorTwo = (Button) getView().findViewById(R.id.button_door_two);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_room, container, false);
    }


}
