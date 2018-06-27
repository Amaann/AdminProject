package com.example.aman.adminproject;

import android.app.Fragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class HomeActivity extends AppCompatActivity {
    Context context;
    ActionBarDrawerToggle drawerToggle;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
//        getSupportActionBar().hide(); // hide the title bar

//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen

        setContentView(R.layout.activity_home);
        context = this;
        initView();


    }

    private void initView() {

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

                            case R.id.Id_Approval:
                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                        new PendingLeaveFragment(), "pendingLeaves").commit();
                                break;

                            case R.id.Id_Tickets:
                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                        new TicketsFragment(), "Tickets").commit();
                                break;

                            case R.id.Id_Setting:
                                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                        new SettingFragment(), "Setting").commit();
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
            super.onBackPressed();
        }


    }

    //hamburgerItem, navigation drawer select
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (drawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);


    }
//    public  void toolBar(){
//
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//    }
}