package com.example.aman.adminproject;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TeamLeavesFragment extends Fragment {
    View v;
    TextView textView;


    public TeamLeavesFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_team_leaves, container, false);
//        initView();
        return v;
    }

//    private void initView() {
//        textView = v.findViewById(R.id.textViewPendingLeave);
//        textView.setText("Team Leaves");
//    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
