package com.example.aman.adminproject;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TicketsFragment extends Fragment {


    View v;
    TextView textView;
    TabLayout tabLayout;
    ViewPager viewPager;

    public TicketsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_tickets, container, false);
        initView();
        return v;
    }

    private void initView() {
        tabLayout = v.findViewById(R.id.Id_TabLayout);
        viewPager = v.findViewById(R.id.Id_ViewPager);

        tabLayout.addTab(tabLayout.newTab().setText("All \nTickets"));
        tabLayout.addTab(tabLayout.newTab().setText("Create Tickets"));
        tabLayout.addTab(tabLayout.newTab().setText("Search Tickets"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        TabLayoutAdapter tabLayoutAdapter = new TabLayoutAdapter(getContext(), getFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(tabLayoutAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


//        textView = v.findViewById(R.id.textViewTickets);
//        textView.setText("Tickets");
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


