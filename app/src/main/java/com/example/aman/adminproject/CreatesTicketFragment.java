package com.example.aman.adminproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class CreatesTicketFragment extends Fragment {

    Spinner spinnerAssignedto, spinnerWatchers, spinnerTicketSlot, spinnerSelectStore;
    ArrayAdapter<CharSequence> arrayAdapterAssignedto, arrayAdapterWatchers, arrayAdapterTicketSlot, arrayAdapterSelectStore;

    View v;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_creates_ticket, container, false);

        initView();

        return v;


    }

    private void initView() {
        spinnerWatchers = v.findViewById(R.id.Id_Spinner_Watchers);
        spinnerAssignedto = v.findViewById(R.id.Id_Spinner_AssignedTo);
        spinnerTicketSlot = v.findViewById(R.id.Id_Spinner_TicketSlot);
        spinnerSelectStore = v.findViewById(R.id.Id_Spinner_SelectStore);

        arrayAdapterWatchers = ArrayAdapter.createFromResource(getActivity(), R.array.watchers, android.R.layout.simple_spinner_item);
        arrayAdapterWatchers.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerWatchers.setAdapter(arrayAdapterWatchers);


        arrayAdapterAssignedto = ArrayAdapter.createFromResource(getActivity(), R.array.assignedTo, android.R.layout.simple_spinner_item);
        arrayAdapterAssignedto.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerAssignedto.setAdapter(arrayAdapterAssignedto);


        arrayAdapterTicketSlot = ArrayAdapter.createFromResource(getActivity(),R.array.ticketSlot, android.R.layout.simple_spinner_item);
        arrayAdapterTicketSlot.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerTicketSlot.setAdapter(arrayAdapterTicketSlot);

        arrayAdapterSelectStore = ArrayAdapter.createFromResource(getActivity(), R.array.Warehouse, android.R.layout.simple_spinner_item);
        arrayAdapterSelectStore.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinnerSelectStore.setAdapter(arrayAdapterSelectStore);




    }

}
