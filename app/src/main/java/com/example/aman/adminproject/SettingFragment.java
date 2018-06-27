package com.example.aman.adminproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SettingFragment extends Fragment {

    View view;
    TextView  textView;

    public SettingFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

         view= inflater.inflate(R.layout.fragment_setting, container, false);
         initView();
        return view;
    }

    public void initView(){
        textView = view.findViewById(R.id.textViewSetting);
        textView.setText("Setting Fragment");

    }


    @Override
    public void onAttach(Context context) {super.onAttach(context);

    }

    @Override
    public void onDetach() {super.onDetach();

    }


}
