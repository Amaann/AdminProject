package com.example.aman.adminproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AllTicketsAdapter extends RecyclerView.Adapter<AllTicketsAdapter.MyViewHolder> {

    private List<Tickets> ticketsList;



    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView ticketId, title, date, time;

        public MyViewHolder (View view){

            super(view);
            ticketId = view.findViewById(R.id.Id_Tv_TicketId);
            title = view.findViewById(R.id.Id_Tv_Title);
            date = view.findViewById(R.id.Id_Tv_date);
            time = view.findViewById(R.id.Id_Tv_Time);
        }
    }

    AllTicketsAdapter(List<Tickets> ticketsList){
        this.ticketsList = ticketsList;


    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.all_tickets,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Tickets tickets = ticketsList.get(position);
//        holder.ticketId.setText(tickets.getId());
        holder.title.setText(tickets.getTitle());
        holder.date.setText(tickets.getDate());
        holder.time.setText(tickets.getTime());

    }

    @Override
    public int getItemCount() {
        return ticketsList.size();
    }


}
