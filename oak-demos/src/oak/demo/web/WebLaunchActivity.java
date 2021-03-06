package oak.demo.web;

import android.os.Bundle;
import android.view.View;

import oak.demo.OakDemoActivity;
import oak.demo.R;
import oak.web.OakWebViewFragment;
import oak.web.WebViewActivity;

/**
 * Created by ericrichardson on 3/19/14.
 */
public class WebLaunchActivity extends OakDemoActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_launch);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchWebActivity();
            }
        });
    }

    private void launchWebActivity() {
        OakWebViewFragment.BundleBuilder builder = new OakWebViewFragment.BundleBuilder("http://willowtreeapps.com")
                .fadeControls(true)
                .maxControlAlpha(0.9f)
                .minControlAlpha(0.4f)
                .fadeTimeout(2500);
        WebViewActivity.startWebActivity(this, builder.build());
    }

}