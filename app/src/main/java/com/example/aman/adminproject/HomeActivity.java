package com.example.aman.adminproject;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class HomeActivity extends AppCompatActivity {
    Context context;
    ActionBarDrawerToggle drawerToggle;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_home);
        context = this;
        initView();


    }

    private void initView() {

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawerLayout = findViewById(R.id.Id_DrawerLayout);
        navigationView = findViewById(R.id.Id_NavView);

        //BringToFront
        navigationView.bringToFront();

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.Id_Profile:
                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                        new ProfileFragment(), "profile").commit();
                                Log.i("profile", "true");

                                break;

                            case R.id.Id_Leaves:
                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                        new LeavesFragment(), "leaves").commit();
                                Log.i("leaves", "true");

                                break;

                            case R.id.Id_My_Team:
                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                        new MyTeamFragment(), "team").commit();
                                break;

                            case R.id.Id_TeamLeaves:
                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                        new TeamLeavesFragment(), "pendingLeaves").commit();
                                break;

                            case R.id.Id_Tickets:

                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                        new TicketsFragment(), "Tickets").commit();
                                break;

                            case R.id.Id_Setting:
                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                        new SettingsFragment(), "Setting").commit();
                                break;
                        }
                        drawerLayout.closeDrawer(GravityCompat.START);

                        return true;
                    }

                });

        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout,
                R.string.open, R.string.close);

        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

//        to get action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,
                new ProfileFragment(), "profile").commit();


    }

    @Override
//    to not close app on backPress
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {

            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.alert_icon)
                    .setTitle("Alert")
                    .setMessage("Do you want to close this App ?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }

                    })

                    .setNegativeButton("No", null)
                    .show();
        }

    }


    //hamburgerItem, navigation drawer select
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);


    }


}