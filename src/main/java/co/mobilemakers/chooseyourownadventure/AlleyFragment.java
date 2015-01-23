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
public class AlleyFragment extends Fragment {
    Button mButtonGoLeft, mButtonGoRight, mButtonContinue;

    public AlleyFragment() {
        // Required empty public constructor
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getWidgets();
        mButtonGoRight.setOnClickListener(new ChanceToARandomScreen(getActivity(),8));
        mButtonGoLeft.setOnClickListener(new ChanceToARandomScreen(getActivity(),5));
        mButtonContinue.setOnClickListener(new ChanceToARandomScreen(getActivity(),3));
    }

    private void getWidgets() {
        mButtonContinue = (Button) getView().findViewById(R.id.button_continue);
        mButtonGoLeft = (Button) getView().findViewById(R.id.button_go_left);
        mButtonGoRight = (Button) getView().findViewById(R.id.button_go_right);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alley, container, false);
    }


}
