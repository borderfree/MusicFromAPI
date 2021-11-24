package com.seattleclouds.modules.goaltracker;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6620n;
import java.util.HashMap;

/* renamed from: com.seattleclouds.modules.goaltracker.c */
public class C5699c extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TextView f20247a;

    /* renamed from: ae */
    private Bundle f20248ae;

    /* renamed from: af */
    private String f20249af;

    /* renamed from: ag */
    private boolean f20250ag = false;

    /* renamed from: b */
    private TextView f20251b;

    /* renamed from: c */
    private TextView f20252c;

    /* renamed from: d */
    private SeekBar f20253d;

    /* renamed from: e */
    private Button f20254e;

    /* renamed from: f */
    private String f20255f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public HashMap<String, String> f20256g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f20257h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5694a f20258i;

    /* renamed from: a */
    private void m28196a(String str, Activity activity, boolean z) {
        int i;
        this.f20256g = this.f20258i.mo18337b(str);
        if (this.f20256g != null) {
            this.f20251b.setText((CharSequence) this.f20256g.get("title"));
            this.f20252c.setText((CharSequence) this.f20256g.get("note"));
            String str2 = (String) this.f20256g.get("progress");
            try {
                i = Integer.parseInt(str2);
                this.f20257h = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                this.f20253d.setProgress(0);
                this.f20257h = 0;
                i = 0;
            }
            if (z && i < 100) {
                StringBuilder sb = new StringBuilder();
                sb.append(String.format(activity.getString(C5462k.goal_tracker_goal_details_fragment_goal_curret_progress_message), new Object[]{str2}));
                sb.append("%");
                this.f20247a.setText(sb.toString());
                this.f20253d.setProgress(this.f20257h);
            }
            if (i >= 100) {
                this.f20253d.setVisibility(8);
                this.f20247a.setText(activity.getString(C5462k.goal_tracker_goal_details_fragment_goal_congratulation));
                this.f20254e.setVisibility(8);
            }
        }
    }

    /* renamed from: b */
    private void m28198b() {
        Bundle bundle = new Bundle();
        bundle.putString("CATEGORY_ID_KEY", (String) this.f20256g.get("category_id"));
        bundle.putString("GOAL_ID_KEY", (String) this.f20256g.get("id"));
        bundle.putInt("GOAL_PROGRESS_KEY", this.f20257h);
        FragmentInfo fragmentInfo = new FragmentInfo(C5703d.class.getName(), bundle);
        fragmentInfo.mo16870c().putBundle("PAGE_STYLE", this.f20248ae);
        fragmentInfo.mo16869b().putString("PAGE_TRANSITION", this.f20249af);
        App.m25620a(fragmentInfo, (Fragment) this);
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f20250ag) {
            this.f20258i.mo18334a();
            m28196a(this.f20255f, (Activity) mo1318s(), false);
            this.f20250ag = false;
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20255f = m.getString("GOAL_ID_KEY");
            this.f20248ae = m.getBundle("PAGE_STYLE");
            this.f20249af = m.getString("PAGE_TRANSITION");
        }
        View inflate = layoutInflater.inflate(C5460i.goal_tracker_details_goal_fragment, viewGroup, false);
        C6593am.m31914a(inflate, this.f20248ae);
        this.f20247a = (TextView) inflate.findViewById(C5458g.goal_tracker_goal_details_fragment_progress_text);
        C6593am.m31915a(this.f20247a, this.f20248ae);
        this.f20253d = (SeekBar) inflate.findViewById(C5458g.goal_tracker_goal_details_fragment_progress_seek);
        this.f20251b = (TextView) inflate.findViewById(C5458g.goal_tracker_goal_details_fragment_title_text);
        C6593am.m31915a(this.f20251b, this.f20248ae);
        this.f20252c = (TextView) inflate.findViewById(C5458g.goal_tracker_goal_details_fragment_note_text);
        C6593am.m31915a(this.f20252c, this.f20248ae);
        this.f20254e = (Button) inflate.findViewById(C5458g.goal_tracker_goal_details_fragment_apply_button);
        C6593am.m31915a((TextView) this.f20254e, this.f20248ae);
        return inflate;
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.goal_tracker_details_menu, menu);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        final C0367h s = mo1318s();
        this.f20258i = C5694a.m28160a((Context) s);
        this.f20258i.mo18334a();
        this.f20254e.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                sb.append(C5699c.this.f20257h);
                sb.append("");
                C5699c.this.f20256g.put("progress", sb.toString());
                C5699c.this.f20258i.mo18342c(C5699c.this.f20256g);
                C5699c.this.f20258i.mo18338b();
                App.m25625a((Fragment) C5699c.this);
            }
        });
        this.f20253d.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    C5699c.this.f20257h = i;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format(s.getString(C5462k.goal_tracker_goal_details_fragment_goal_curret_progress_message), new Object[]{Integer.valueOf(i)}));
                    sb.append("%");
                    C5699c.this.f20247a.setText(sb.toString());
                    seekBar.setProgress(C5699c.this.f20257h);
                    if (C5699c.this.f20257h == 100) {
                        C6620n.m32035a((Context) s, s.getString(C5462k.info), String.format(s.getString(C5462k.goal_tracker_goal_details_fragment_goal_congratulation_with_name), new Object[]{C5699c.this.f20256g.get("title")}), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(C5699c.this.f20257h);
                                sb.append("");
                                C5699c.this.f20256g.put("progress", sb.toString());
                                C5699c.this.f20258i.mo18342c(C5699c.this.f20256g);
                                C5699c.this.f20258i.mo18338b();
                                App.m25625a((Fragment) C5699c.this);
                            }
                        });
                    }
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        m28196a(this.f20255f, (Activity) mo1318s(), true);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.goal_tracker_edit_goal_menu_item) {
            return super.mo1245a(menuItem);
        }
        this.f20250ag = true;
        m28198b();
        return true;
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        super.mo1278d(bundle);
        if (bundle != null) {
            this.f20253d.setProgress(bundle.getInt("PROGRESS_STATE"));
            this.f20247a.setText(bundle.getString("PROGRESS_STATE_STRING"));
            this.f20257h = bundle.getInt("INTEGER_PROGRESS_VALUE");
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        bundle.putInt("PROGRESS_STATE", this.f20253d.getProgress());
        bundle.putString("PROGRESS_STATE_STRING", this.f20247a.getText().toString());
        bundle.putInt("INTEGER_PROGRESS_VALUE", this.f20257h);
    }
}
