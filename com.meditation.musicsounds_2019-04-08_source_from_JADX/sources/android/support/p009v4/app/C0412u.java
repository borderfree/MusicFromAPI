package android.support.p009v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: android.support.v4.app.u */
public class C0412u extends Fragment {

    /* renamed from: a */
    ListAdapter f1236a;

    /* renamed from: ae */
    private final Runnable f1237ae = new Runnable() {
        public void run() {
            C0412u.this.f1239b.focusableViewAvailable(C0412u.this.f1239b);
        }
    };

    /* renamed from: af */
    private final OnItemClickListener f1238af = new OnItemClickListener() {
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C0412u.this.mo1692a((ListView) adapterView, view, i, j);
        }
    };

    /* renamed from: b */
    ListView f1239b;

    /* renamed from: c */
    View f1240c;

    /* renamed from: d */
    TextView f1241d;

    /* renamed from: e */
    View f1242e;

    /* renamed from: f */
    View f1243f;

    /* renamed from: g */
    CharSequence f1244g;

    /* renamed from: h */
    boolean f1245h;

    /* renamed from: i */
    private final Handler f1246i = new Handler();

    /* renamed from: a */
    private void m1907a(boolean z, boolean z2) {
        mo1453c();
        if (this.f1242e == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f1245h != z) {
            this.f1245h = z;
            if (z) {
                if (z2) {
                    this.f1242e.startAnimation(AnimationUtils.loadAnimation(mo1316q(), 17432577));
                    this.f1243f.startAnimation(AnimationUtils.loadAnimation(mo1316q(), 17432576));
                } else {
                    this.f1242e.clearAnimation();
                    this.f1243f.clearAnimation();
                }
                this.f1242e.setVisibility(8);
                this.f1243f.setVisibility(0);
            } else {
                if (z2) {
                    this.f1242e.startAnimation(AnimationUtils.loadAnimation(mo1316q(), 17432576));
                    this.f1243f.startAnimation(AnimationUtils.loadAnimation(mo1316q(), 17432577));
                } else {
                    this.f1242e.clearAnimation();
                    this.f1243f.clearAnimation();
                }
                this.f1242e.setVisibility(0);
                this.f1243f.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    private void mo1453c() {
        ListView listView;
        View view;
        if (this.f1239b == null) {
            View I = mo1199I();
            if (I != null) {
                if (I instanceof ListView) {
                    this.f1239b = (ListView) I;
                } else {
                    this.f1241d = (TextView) I.findViewById(16711681);
                    if (this.f1241d == null) {
                        this.f1240c = I.findViewById(16908292);
                    } else {
                        this.f1241d.setVisibility(8);
                    }
                    this.f1242e = I.findViewById(16711682);
                    this.f1243f = I.findViewById(16711683);
                    View findViewById = I.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        this.f1239b = (ListView) findViewById;
                        if (this.f1240c != null) {
                            listView = this.f1239b;
                            view = this.f1240c;
                        } else if (this.f1244g != null) {
                            this.f1241d.setText(this.f1244g);
                            listView = this.f1239b;
                            view = this.f1241d;
                        }
                        listView.setEmptyView(view);
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f1245h = true;
                this.f1239b.setOnItemClickListener(this.f1238af);
                if (this.f1236a != null) {
                    ListAdapter listAdapter = this.f1236a;
                    this.f1236a = null;
                    mo1691a(listAdapter);
                } else if (this.f1242e != null) {
                    m1907a(false, false);
                }
                this.f1246i.post(this.f1237ae);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context q = mo1316q();
        FrameLayout frameLayout = new FrameLayout(q);
        LinearLayout linearLayout = new LinearLayout(q);
        linearLayout.setId(16711682);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(q, null, 16842874), new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(q);
        frameLayout2.setId(16711683);
        TextView textView = new TextView(q);
        textView.setId(16711681);
        textView.setGravity(17);
        frameLayout2.addView(textView, new LayoutParams(-1, -1));
        ListView listView = new ListView(q);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        mo1453c();
    }

    /* renamed from: a */
    public void mo1691a(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = this.f1236a != null;
        this.f1236a = listAdapter;
        if (this.f1239b != null) {
            this.f1239b.setAdapter(listAdapter);
            if (!this.f1245h && !z2) {
                if (mo1199I().getWindowToken() != null) {
                    z = true;
                }
                m1907a(true, z);
            }
        }
    }

    /* renamed from: a */
    public void mo1692a(ListView listView, View view, int i, long j) {
    }

    /* renamed from: a */
    public void mo1693a(CharSequence charSequence) {
        mo1453c();
        if (this.f1241d != null) {
            this.f1241d.setText(charSequence);
            if (this.f1244g == null) {
                this.f1239b.setEmptyView(this.f1241d);
            }
            this.f1244g = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    /* renamed from: b */
    public ListView mo1450b() {
        mo1453c();
        return this.f1239b;
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f1246i.removeCallbacks(this.f1237ae);
        this.f1239b = null;
        this.f1245h = false;
        this.f1243f = null;
        this.f1242e = null;
        this.f1240c = null;
        this.f1241d = null;
        super.mo1296i();
    }
}
