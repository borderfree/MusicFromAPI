package com.seattleclouds.modules.nativetetris;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;

/* renamed from: com.seattleclouds.modules.nativetetris.h */
public class C5913h extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5898b f20898a;

    /* renamed from: b */
    private TetrisView f20899b;

    /* renamed from: c */
    private ImageButton f20900c;

    /* renamed from: d */
    private String f20901d;

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        this.f20898a.mo18682a(this.f20901d);
    }

    /* renamed from: K */
    public void mo1201K() {
        this.f20899b.getTetrisHolder().mo18678a();
        this.f20898a.mo18684b(this.f20901d);
        super.mo1201K();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mo1318s().setRequestedOrientation(1);
        View inflate = layoutInflater.inflate(C5460i.native_tetris_layout, viewGroup, false);
        this.f20900c = (ImageButton) inflate.findViewById(C5458g.native_tetris_start_button);
        this.f20899b = (TetrisView) inflate.findViewById(C5458g.native_tetris);
        this.f20901d = mo1307m().getString("PAGE_ID");
        this.f20899b.setPageID(this.f20901d);
        this.f20899b.setStatusTextView((TextView) inflate.findViewById(C5458g.text));
        this.f20899b.setScoreTextView((TextView) inflate.findViewById(C5458g.native_tetris_score_value));
        this.f20899b.setLevelTextView((TextView) inflate.findViewById(C5458g.native_tetris_level_value));
        this.f20899b.setBestScoreTextView((TextView) inflate.findViewById(C5458g.native_tetris_best_score_value));
        this.f20899b.setStartPauseButton(this.f20900c);
        this.f20898a = this.f20899b.getTetrisHolder();
        this.f20898a.mo18682a(this.f20901d);
        this.f20898a.mo18679a(1);
        this.f20900c.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5913h.this.f20898a.mo18689f();
            }
        });
        return inflate;
    }

    /* renamed from: a */
    public void mo1226a(Activity activity) {
        activity.setRequestedOrientation(1);
        super.mo1226a(activity);
    }
}
