package com.example.aman.adminproject;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class AllTicketsFragment extends Fragment {

    List<Tickets> ticketsList = new ArrayList<>();
    RecyclerView recyclerView;
    AllTicketsAdapter allTicketsAdapter;

    View v;
    TextView textView;

    public AllTicketsFragment() {


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_all_tickets, container, false);
        initView();
        return v;
    }

    private void initView() {

        recyclerView = v.findViewById(R.id.Id_Rv_allTickets);

        allTicketsAdapter = new AllTicketsAdapter(ticketsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(allTicketsAdapter);

        ticketData();


    }

    public void ticketData() {

        Tickets tickets = new Tickets(123435, "zoppies return", "20/07/2018", "20:18");
        ticketsList.add(tickets);

        tickets = new Tickets(123534, "zoppies return", "20/07/2018", "20:18");
        ticketsList.add(tickets);

        tickets = new Tickets(123435, "zoppies return", "20/07/2018", "20:18");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "20:18");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "20:18");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "20:18");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "20:18");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "20:18");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "20:18");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "2018");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "2018");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "2018");
        ticketsList.add(tickets);

        tickets = new Tickets(123436, "zoppies return", "20/07/2018", "2018");
        ticketsList.add(tickets);

        allTicketsAdapter.notifyDataSetChanged();
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
