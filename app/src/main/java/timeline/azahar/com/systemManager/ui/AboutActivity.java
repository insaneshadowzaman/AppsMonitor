package timeline.azahar.com.systemManager.ui;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Locale;

import timeline.azahar.com.systemManager.BuildConfig;
import timeline.azahar.com.systemManager.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle(R.string.about);
        }

        ((TextView) findViewById(R.id.version)).setText(
                String.format(Locale.getDefault(),
                        getResources().getString(R.string.version), BuildConfig.VERSION_NAME));
    }
}
