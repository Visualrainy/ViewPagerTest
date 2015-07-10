package com.visual.viewpagertest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by pchen on 7/10/15.
 */
public abstract class BaseFragment extends Fragment {

    protected Button testBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        initView(view);
        return view;
    }
    
    public void initView(View view) {
        testBtn = (Button) view.findViewById(R.id.test_btn);
        setTestBtnText();
    }

    protected abstract void setTestBtnText();
}
