package com.example.spamsmsblocker;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private ViewPager mViewPager;
    private SectionsPageAdapter mSectionsPageAdapter;
    private ListViewAdapter listViewAdapter;
    private List<ContactBlocked> blockedList;
    private  int currentViewMode=0;

    static final int VIEW_MODE_BLOCKLISTVIEW = 0;
    static final int VIEW_MODE_NOTIFICATIONVIEW = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate: Starting.");
        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                if(tab.getPosition()==0)
//                {
//                    listViewAdapter = new ListViewAdapter(this,R.layout.fragment_list__item_,blockedList);
//                }
//                Log.d(TAG,"Tab Selected: Starting.");
//                mViewPager.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });

       // getContactsBlocked();

        //SharedPreferences sharedPreferences = getSharedPreferences("View_Mode",MODE_PRIVATE);
        //currentViewMode  = sharedPreferences.getInt("currentViewMode",VIEW_MODE_BLOCKLISTVIEW);

        //switchView();
        //listViewAdapter = new ListViewAdapter(this,R.layout.fragment_list__item_,blockedList);
    }

//    private void switchView() {
//        if(VIEW_MODE_BLOCKLISTVIEW == currentViewMode)
//        {
//            curren
//        }
//        else
//        {}
//    }

    private List<ContactBlocked> getContactsBlocked() {

        blockedList = new ArrayList<>();
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );
        blockedList.add(new ContactBlocked("JOHN BLACK",true,false,R.drawable.ic_launcher_foreground) );


        return blockedList;
    }

    private void setupViewPager(ViewPager viewPager)
    {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1_Fragment(),"Block List");
        adapter.addFragment(new Tab2_Fragment(),"Potential Spam");
        viewPager.setAdapter(adapter);

    }
}
