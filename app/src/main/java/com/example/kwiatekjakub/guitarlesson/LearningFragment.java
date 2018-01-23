package com.example.kwiatekjakub.guitarlesson;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by KwiatekJakub on 2017-09-21.
 */

public class LearningFragment extends Fragment{
    private static final String TAG = "LearningFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.learning_fragment, container, false);

        return view;
    }
}
