package com.example.netclanexplorer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toolbar;

import com.example.netclanexplorer.Fragments.ChatFragment;
import com.example.netclanexplorer.Fragments.ContactsFragment;
import com.example.netclanexplorer.Fragments.ExploreFragment;
import com.example.netclanexplorer.Fragments.GroupsFragment;
import com.example.netclanexplorer.Fragments.NetworkFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private ImageView imageView,imageview_menu;
//    public ActionBarDrawerToggle actionBarDrawerToggle;

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        navigationView = findViewById(R.id.Navigatin_view);
        imageView = findViewById(R.id.tool_Imageview);
        imageview_menu=findViewById(R.id.imageview_menu);
        bottomNavigationView = findViewById(R.id.bottom_Navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) this);
        bottomNavigationView.setSelectedItemId(R.id.explore);

        imageview_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Refine.class);
                Slide slide = new Slide(Gravity.END);
                slide.setDuration(1000); // Set the transition duration
                getWindow().setEnterTransition(slide);
                startActivity(i);
                finish();
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShowNavigationMenu();


            }
        });


    }

    private void ShowNavigationMenu() {

        if (drawerLayout != null && !drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.openDrawer(GravityCompat.START);
        }


//        ExploreFragment exploreFragment = new ExploreFragment();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.explore) {

            ExploreFragment exploreFragment = new ExploreFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_Layout, exploreFragment)
                    .commit();
            return true;
        }
            if (item.getItemId() == R.id.network) {
                NetworkFragment networkFragment = new NetworkFragment();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_Layout,networkFragment )
                        .commit();
                return true;
            }
        if (item.getItemId() == R.id.chat) {
          ChatFragment chatFragment= new ChatFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_Layout,chatFragment )
                    .commit();
            return true;
        }

        if (item.getItemId() == R.id.contact) {
       ContactsFragment contactsFragment= new ContactsFragment();
         getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_Layout,contactsFragment )
                    .commit();
            return true;
        }
        if (item.getItemId() == R.id.groups) {
            GroupsFragment groupsFragment= new GroupsFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_Layout,groupsFragment )
                    .commit();
            return true;
        }





        return false;
    }

}
