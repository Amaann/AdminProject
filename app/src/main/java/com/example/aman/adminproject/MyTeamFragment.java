package com.example.aman.adminproject;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.TooltipCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


public class MyTeamFragment extends Fragment {

    View v;
    TextView textView;
    CircleImageView circleImageView;
    CircleImageView circleImageView2;

    public MyTeamFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_my_team, container, false);
        initView();
        return v;
    }

    private void initView() {
        SetcircleImageView();
        setCircleImageView2();


    }

    public void SetcircleImageView() {

        circleImageView = v.findViewById(R.id.Id_IcV_CircleOne);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            circleImageView.setTooltipText("Aman Kumar, System Admin, 7022266557");
        } else {
            TooltipCompat.setTooltipText(circleImageView, "Aman Kumar, System Admin, 7022266557");
        }

    }

    public void setCircleImageView2() {

        circleImageView2 = v.findViewById(R.id.Id_IcV_CircleTwo);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            circleImageView2.setTooltipText("Ritesh, System Admin, 7022266557");
        } else {
            TooltipCompat.setTooltipText(circleImageView2, "Ritesh, System Admin, 7022266557");
        }

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
