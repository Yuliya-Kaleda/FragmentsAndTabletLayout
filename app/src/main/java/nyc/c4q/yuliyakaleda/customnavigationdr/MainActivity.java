package nyc.c4q.yuliyakaleda.customnavigationdr;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity implements NavigationFragment.PassInfo {
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getFragmentManager();
    }

    @Override
    public void getPositionFromListView(String title) {
        DetailsFragment g = (DetailsFragment) getFragmentManager().findFragmentById(R.id.navigation_det_fragment);
        g.tv.setText(title);
    }
}
