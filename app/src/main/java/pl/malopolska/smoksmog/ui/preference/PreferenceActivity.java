package pl.malopolska.smoksmog.ui.preference;

import android.os.Bundle;

import pl.malopolska.smoksmog.base.BaseActivity;

public class PreferenceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if( savedInstanceState != null ){

            getFragmentManager().beginTransaction()
                    .replace( android.R.id.content , new SmokSmogPreferenceFragment())
                    .commit();
        }
    }
}
