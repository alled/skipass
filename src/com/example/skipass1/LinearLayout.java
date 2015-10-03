package com.example.skipass1;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Alyosha on 03.10.2015.
 */
public class LinearLayout extends android.widget.LinearLayout {
    //private static final int[] CHECKED_STATE_SET = {android.R.attr.state_checked};

    //private boolean mChecked = false;

    public LinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /*public boolean isChecked() {
        return mChecked;
    }*/

    /*public void setChecked(boolean b) {
        if (b != mChecked) {
            mChecked = b;
            refreshDrawableState();
        }
    }*/

    /*public void toggle() {
        setChecked(!mChecked);
    }*/

    @Override
    public int[] onCreateDrawableState(int extraSpace) {
        /*final int[] drawableState = super.onCreateDrawableState(extraSpace + 1);
        *//*if (isChecked()) {
            mergeDrawableStates(drawableState, CHECKED_STATE_SET);
        }*//*
        return drawableState;*/
        return super.onCreateDrawableState(extraSpace + 1);
    }
}