package com.seattleclouds.modules.gcmtopics;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5463l;
import com.seattleclouds.util.C6619m;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.seattleclouds.modules.gcmtopics.a */
public class C5684a extends BaseAdapter implements SectionIndexer {

    /* renamed from: a */
    private LayoutInflater f20191a;

    /* renamed from: b */
    private List<GCMTopicListItem> f20192b;

    /* renamed from: c */
    private String[] f20193c;

    /* renamed from: d */
    private HashMap<Integer, Integer> f20194d;

    /* renamed from: e */
    private int f20195e = 0;

    /* renamed from: com.seattleclouds.modules.gcmtopics.a$a */
    private static class C5686a {

        /* renamed from: a */
        public TextView f20196a;

        private C5686a() {
            this.f20196a = null;
        }
    }

    public C5684a(Context context, List<GCMTopicListItem> list, String[] strArr, HashMap<Integer, Integer> hashMap) {
        this.f20191a = LayoutInflater.from(context);
        this.f20192b = list;
        this.f20193c = strArr;
        this.f20194d = hashMap;
        m28093a(context);
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m28093a(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(C5463l.AppTheme, VERSION.SDK_INT >= 14 ? new int[]{16843655} : new int[]{16842829});
        this.f20195e = obtainStyledAttributes.getDimensionPixelSize(0, C6619m.m32014a(context, 48.0f));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m28094a(C5686a aVar) {
        LayoutParams layoutParams = new LayoutParams(aVar.f20196a.getLayoutParams());
        layoutParams.height = -2;
        aVar.f20196a.setLayoutParams(layoutParams);
        aVar.f20196a.setMinimumHeight(this.f20195e);
    }

    /* renamed from: a */
    public void mo18302a(List<GCMTopicListItem> list) {
        this.f20192b = list;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public int getCount() {
        return this.f20192b.size();
    }

    public Object getItem(int i) {
        return this.f20192b.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return ((GCMTopicListItem) this.f20192b.get(i)).mo18288a();
    }

    public int getPositionForSection(int i) {
        if (this.f20194d != null) {
            return ((Integer) this.f20194d.get(Integer.valueOf(i))).intValue();
        }
        return 0;
    }

    public int getSectionForPosition(int i) {
        return ((GCMTopicListItem) this.f20192b.get(i)).mo18291b();
    }

    public Object[] getSections() {
        return this.f20193c;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C5686a aVar;
        GCMTopicListItem gCMTopicListItem = (GCMTopicListItem) getItem(i);
        if (view == null) {
            if (gCMTopicListItem.mo18288a() == 0) {
                view = this.f20191a.inflate(C5460i.dynamic_list_separator, viewGroup, false);
                aVar = new C5686a();
                aVar.f20196a = (TextView) view.findViewById(C5458g.section);
            } else {
                view = this.f20191a.inflate(17367056, viewGroup, false);
                aVar = new C5686a();
                aVar.f20196a = (TextView) view.findViewById(16908308);
                m28094a(aVar);
            }
            view.setTag(aVar);
        } else {
            aVar = (C5686a) view.getTag();
        }
        aVar.f20196a.setText(gCMTopicListItem.mo18296e());
        view.forceLayout();
        return view;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public boolean isEnabled(int i) {
        return getItemViewType(i) != 0;
    }
}
