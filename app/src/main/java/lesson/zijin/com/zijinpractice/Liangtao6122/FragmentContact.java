package lesson.zijin.com.zijinpractice.Liangtao6122;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import lesson.zijin.com.zijinpractice.R;


/**
 *
 */
public class FragmentContact extends Fragment {
    private ListView listview;
    private ListAdapter listAdapter;

    public FragmentContact() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_contact, container, false);
        //初始化listview
        listview = (ListView) view.findViewById(R.id.lv);
        GetPhone.getPhone(getContext());
        listAdapter = new ListAdapter(GetPhone.list,getContext());
        return view;
    }


}
