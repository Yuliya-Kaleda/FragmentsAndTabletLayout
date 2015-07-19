package nyc.c4q.yuliyakaleda.customnavigationdr;

import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class DetailsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String title = getIntent().getStringExtra("title");
        Log.d("george", title);

        DetailsFragment g = (DetailsFragment) getFragmentManager().findFragmentById(R.id.details_fragment);
        g.tv.setText(title);
    }
}
