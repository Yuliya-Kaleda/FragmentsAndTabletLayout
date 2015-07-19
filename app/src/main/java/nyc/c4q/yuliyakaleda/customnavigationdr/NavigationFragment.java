package nyc.c4q.yuliyakaleda.customnavigationdr;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by July on 7/18/15.
 */
public class NavigationFragment extends Fragment {
    ListView listView;
    PassInfo passInfo;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.navigation_fragment, container, false);
        listView = (ListView) view.findViewById(R.id.list);
        return view;
    }


    @Override
    public void onResume() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.list));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                passInfo.getPositionFromListView(title);
                if (!Utils.isTablet(getActivity())) {

                    String title = getResources().getStringArray(R.array.list)[i];
                    Log.d("george", title);
                    Intent g = new Intent(getActivity(), DetailsActivity.class);
                    g.putExtra("title", title);
                    startActivity(g);
                } else {
                    String title = getResources().getStringArray(R.array.list)[i];
                    passInfo.getPositionFromListView(title);
                }
            }
        });
        super.onResume();
    }


    public interface PassInfo {
        void getPositionFromListView(String title);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        passInfo = (PassInfo) activity;
    }
}
