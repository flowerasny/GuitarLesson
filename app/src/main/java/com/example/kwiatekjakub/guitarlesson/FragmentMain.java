package com.example.kwiatekjakub.guitarlesson;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.zip.Inflater;

/**
 * Created by KwiatekJakub on 2017-09-21.
 */

public class FragmentMain extends Fragment {
    private static final String TAG = "FragmentMain";
    private ToggleButton button1;
    private ToggleButton button2;
    private ToggleButton button3;
    private ToggleButton button4;
    private ToggleButton button5;
    private ToggleButton button6;
    private Button startBtn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, container, false);
        button1 = view.findViewById(R.id.el_string);
        button2 = view.findViewById(R.id.a_string);
        button3 = view.findViewById(R.id.d_string);
        button4 = view.findViewById(R.id.g_string);
        button5 = view.findViewById(R.id.h_string);
        button6 = view.findViewById(R.id.eh_string);
        startBtn = view.findViewById(R.id.startbtn);
        startBtn.setBackgroundResource(R.drawable.start_button);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked");
                ((MainActivity)getActivity()).setViewPager(1);
            }
        });

        return view;
    }
}
