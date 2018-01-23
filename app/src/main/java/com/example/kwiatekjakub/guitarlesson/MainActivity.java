package com.example.kwiatekjakub.guitarlesson;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ViewPager viewPager;
    private StatePagerAdapter statePagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.container);
        statePagerAdapter = new StatePagerAdapter(getSupportFragmentManager());

        FragmentMain fragmentMain = new FragmentMain();
        LearningFragment learningFragment = new LearningFragment();

        statePagerAdapter.addFragment(fragmentMain);
        statePagerAdapter.addFragment(learningFragment);

        viewPager.setAdapter(statePagerAdapter);
        viewPager.setCurrentItem(0);
    }
    public void setViewPager(int position){viewPager.setCurrentItem(position);}


}

