package fi.centria.ruuvitag.settings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fi.centria.ruuvitag.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Display SettingsFragment as main content
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();

    }


}
