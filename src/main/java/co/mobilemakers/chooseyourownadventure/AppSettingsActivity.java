package co.mobilemakers.chooseyourownadventure;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by agustin.gugliotta on 30/01/2015.
 */
public class AppSettingsActivity extends Activity {
    public static class AppSettingFragment extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        getFragmentManager().beginTransaction().
                add(R.id.settigs, new AppSettingFragment()).
                commit();
    }
}
