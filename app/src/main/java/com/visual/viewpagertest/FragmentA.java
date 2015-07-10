package com.visual.viewpagertest;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by pchen on 7/10/15.
 */
public class FragmentA extends BaseFragment {

    @Override
    protected void setTestBtnText() {
        testBtn.setText("Fragment A");
    }
}
