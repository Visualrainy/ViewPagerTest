package com.visual.viewpagertest;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by pchen on 7/10/15.
 */
public class FragmentB extends BaseFragment {
    @Override
    protected void setTestBtnText() {
        testBtn.setText("Fragment B");
        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).onDetailClick();
            }
        });
    }
}
