package com.jackie.neteasenews.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jackie.neteasenews.R;

/**
 * Created by Jackie on 2015/12/29.
 * 头条
 */
public class SportFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_sport, container, false);
        return view;
    }
}
