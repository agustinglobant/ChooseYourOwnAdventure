package co.mobilemakers.chooseyourownadventure;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {


    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_result, container, false);
        TextView mTextView = (TextView) rootView.findViewById(R.id.result_message);
        int winOrLose = getArguments().getInt("win_or_lose");
        if (winOrLose >= 5) {
            mTextView.setText("You’ve reached the gold!");
        } else {
            mTextView.setText("You’ve fallen into the pit of despair");
        }

        return rootView;
    }


}
