package co.mobilemakers.chooseyourownadventure;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.Fragment;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {
    public static final String USERNAME_PREFERENCE  = "username_preference";
    public static final String DIFFICULTY_PREFERENCE = "difficulty_preference";

    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_result, container, false);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        String username = sharedPreferences.getString(USERNAME_PREFERENCE, getString(R.string.default_username));
        username += ", Brave fighter";
        int difficulty = Integer.valueOf(sharedPreferences.getString(DIFFICULTY_PREFERENCE, "0"));
        TextView mTextView = (TextView) rootView.findViewById(R.id.result_message);
        int winOrLose = getArguments().getInt("win_or_lose");
        if (winOrLose >= (5 + difficulty)) {
            mTextView.setText(username+" You’ve reached the gold!");
        } else {
            mTextView.setText(username+" You’ve fallen into the pit of despair "+username);
        }

        return rootView;
    }


}
