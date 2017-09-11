package com.molps.navfrag;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private OnNavigationClick onNavigationClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Fragment homeFragment = new HomeFragment();
        final Fragment followingFragment = new FollowingFragment();
        final Fragment matchesFragment = new MatchesFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder, homeFragment).commit();

        BottomNavigationView btmNavView = (BottomNavigationView) findViewById(R.id.bot_nav_view);
        btmNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()) {
                    case R.id.action_home:
                        if (homeFragment.isVisible()) {
                            onNavigationClick = (OnNavigationClick) homeFragment;
                            onNavigationClick.onBtmNavClick();
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder, homeFragment).commit();
                        return true;
                    case R.id.action_matches:
                        if (matchesFragment.isVisible()) {
                            onNavigationClick = (OnNavigationClick) matchesFragment;
                            onNavigationClick.onBtmNavClick();
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder, matchesFragment).commit();
                        return true;
                    case R.id.action_following:
                        if (followingFragment.isVisible()) {
                            onNavigationClick = (OnNavigationClick) followingFragment;
                            onNavigationClick.onBtmNavClick();
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder, followingFragment).commit();
                        return true;
                }
                return true;
            }
        });
    }

    public interface OnNavigationClick {
        void onBtmNavClick();
    }
}
