package com.seattleclouds.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5464m;

public class LoadingView extends RelativeLayout {
    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C5460i.loading_view, this);
        if (!context.getTheme().obtainStyledAttributes(attributeSet, C5464m.LoadingView, 0, 0).getBoolean(C5464m.LoadingView_showLoadingText, false)) {
            TextView textView = (TextView) findViewById(C5458g.loadingText);
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    public void setLoadingText(String str) {
        TextView textView = (TextView) findViewById(C5458g.loadingText);
        if (str != null) {
            textView.setText(str);
        }
    }
}
