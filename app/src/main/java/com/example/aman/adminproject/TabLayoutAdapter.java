package com.example.aman.adminproject;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public final class TabLayoutAdapter  extends FragmentPagerAdapter{

    private Context context;
    int  totalTabs;

    public TabLayoutAdapter(Context context1, FragmentManager fragmentManager, int totalTabs){
        super(fragmentManager);
        context = context1;
        this.totalTabs= totalTabs;

    }




    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                AllTicketsFragment allTicketsFragment = new AllTicketsFragment();
                return allTicketsFragment;

            case 1:

                CreatesTicketFragment createsTicketFragment = new CreatesTicketFragment();
                return createsTicketFragment;

            case 2:

                SearchTicktesFragment searchTicktesFragment = new SearchTicktesFragment();
                return searchTicktesFragment;

                default:
                    return null;
        }


    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
