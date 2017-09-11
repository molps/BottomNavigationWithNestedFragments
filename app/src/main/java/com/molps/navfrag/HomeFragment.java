package com.molps.navfrag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements MainActivity.OnNavigationClick {

    private static final String LOG_TAG = HomeFragment.class.getSimpleName();

    private RecyclerView recyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        List<String> list = new ArrayList<>();
        setupList(list);

        recyclerView = (RecyclerView) view.findViewById(R.id.recViewHome);
        RecAdapter adapter = new RecAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        return view;
    }

    public void setupList(List<String> list) {
        list.add("Nikola");
        list.add("Nemanja");
        list.add("Nevena");
        list.add("Kosovka");
        list.add("Nebojsa");
        list.add("Marko");
        list.add("Janko");
        list.add("Bozidar");
        list.add("Branko");
        list.add("Milivoje");
        list.add("Radonja");
        list.add("Dragana");
        list.add("Suzana");
        list.add("Marija");
        list.add("Bojana");
        list.add("Jelena");
        list.add("Isidora");
        list.add("Danica");
        list.add("Brankica");
        list.add("Milica");
        list.add("Jovana");
        list.add("Ksenija");
        list.add("Filip");
        list.add("Miljan");
        list.add("Radenko");
    }


    @Override
    public void onBtmNavClick() {
        Log.v(LOG_TAG, "AKTIVIRALO SE home fragment");
        recyclerView.smoothScrollToPosition(0);
    }
}
