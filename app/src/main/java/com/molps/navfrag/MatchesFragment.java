package com.molps.navfrag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MatchesFragment extends Fragment implements MainActivity.OnNavigationClick {

    private static final String LOG_TAG = MatchesFragment.class.getSimpleName();

    public MatchesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_matches, container, false);
    }

    @Override
    public void onBtmNavClick() {
        Log.v(LOG_TAG, "AKTIVIRALO SE matches fragment");
    }
}
