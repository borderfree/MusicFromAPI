package com.seattleclouds.modules.p186s;

import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;

/* renamed from: com.seattleclouds.modules.s.a */
public class C6252a implements ListAdapter {

    /* renamed from: a */
    String[] f22167a = {"Facebook", "Twitter", "Share via apps ..."};

    /* renamed from: b */
    int[] f22168b = {C5457f.facebook_blue_icon_2013, C5457f.twitter_bird_white_on_blue, C5457f.ic_my_apps};

    /* renamed from: com.seattleclouds.modules.s.a$a */
    private class C6253a {

        /* renamed from: a */
        public final TextView f22169a;

        /* renamed from: b */
        public final ImageView f22170b;

        public C6253a(TextView textView, ImageView imageView) {
            this.f22169a = textView;
            this.f22170b = imageView;
        }
    }

    public boolean areAllItemsEnabled() {
        return true;
    }

    public int getCount() {
        return this.f22167a.length;
    }

    public Object getItem(int i) {
        return this.f22167a[i];
    }

    public long getItemId(int i) {
        return (long) getItem(i).hashCode();
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C6253a aVar;
        if (view == null) {
            view = (ViewGroup) ((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater")).inflate(C5460i.scoreboard_app_item_view, null);
            aVar = new C6253a((TextView) view.findViewById(C5458g.scoreboard_app_title), (ImageView) view.findViewById(C5458g.scoreboard_app_icon));
            view.setTag(aVar);
        } else {
            aVar = (C6253a) view.getTag();
        }
        aVar.f22169a.setText((String) getItem(i));
        aVar.f22170b.setImageResource(this.f22168b[i]);
        return view;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isEmpty() {
        return this.f22167a.length == 0;
    }

    public boolean isEnabled(int i) {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
