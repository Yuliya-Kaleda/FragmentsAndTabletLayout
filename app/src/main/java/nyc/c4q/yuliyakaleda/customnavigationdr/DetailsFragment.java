package nyc.c4q.yuliyakaleda.customnavigationdr;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by July on 7/18/15.
 */
public class DetailsFragment extends Fragment  {
    TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.details_fragment, container, false);


        tv = (TextView) view.findViewById(R.id.details);

        return view;
    }

    void setText(String title) {
        tv.setText(title);
    }


}
