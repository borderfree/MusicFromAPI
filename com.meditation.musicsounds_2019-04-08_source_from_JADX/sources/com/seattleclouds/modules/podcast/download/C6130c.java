package com.seattleclouds.modules.podcast.download;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.p009v4.app.C0395p;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.C6557s;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6600as;

/* renamed from: com.seattleclouds.modules.podcast.download.c */
public class C6130c extends C6557s {

    /* renamed from: a */
    private C0395p f21737a;

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(C5460i.fragment_podcast_downloads, viewGroup, false);
        ViewPager viewPager = (ViewPager) linearLayout.findViewById(C5458g.pager);
        viewPager.setAdapter(this.f21737a);
        C6600as.m31946a((C6348n) mo1318s());
        TabLayout tabLayout = (TabLayout) linearLayout.findViewById(C5458g.tabs);
        C5334b.m26765a(((C6348n) mo1318s()).mo19778o(), tabLayout);
        tabLayout.setTabMode(0);
        tabLayout.setTabGravity(0);
        tabLayout.setupWithViewPager(viewPager);
        return linearLayout;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f21737a = new C0395p(mo1322u()) {
            /* renamed from: a */
            public Fragment mo1664a(int i) {
                return i == 0 ? new C6106a() : new C6119b();
            }

            /* renamed from: b */
            public int mo2480b() {
                return 2;
            }

            /* renamed from: c */
            public CharSequence mo2484c(int i) {
                C6130c cVar;
                int i2;
                if (i == 0) {
                    cVar = C6130c.this;
                    i2 = C5462k.podcast_downloaded_page_title;
                } else {
                    cVar = C6130c.this;
                    i2 = C5462k.podcast_downloading_page_title;
                }
                return cVar.mo1219a(i2);
            }
        };
    }
}
