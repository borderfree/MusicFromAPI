package com.seattleclouds;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.maps.C4580c;
import com.google.android.gms.maps.C4591f;
import com.google.android.gms.maps.MapView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.util.C6619m;

/* renamed from: com.seattleclouds.y */
public class C6672y extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f23467a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4580c f23468b;

    /* renamed from: c */
    private MapView f23469c;

    /* renamed from: d */
    private boolean f23470d = false;

    /* renamed from: e */
    private boolean f23471e = false;

    /* renamed from: a */
    private Button m32215a(ViewGroup viewGroup) {
        Button button = null;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof Button) {
                return (Button) childAt;
            }
            if (childAt instanceof ViewGroup) {
                button = m32215a((ViewGroup) childAt);
                if (button != null) {
                    return button;
                }
            }
        }
        return button;
    }

    /* renamed from: c */
    private void mo1453c() {
        if (!C6619m.m32023e(mo1318s()) && !this.f23471e) {
            if (this.f23467a) {
                Log.v("SCMapFragment", "Google Play Store app not installed, applying \"Get Google Play Services\" workaround...");
            }
            Button a = m32215a((ViewGroup) this.f23469c);
            if (a == null) {
                if (this.f23467a) {
                    Log.v("SCMapFragment", "\"Get Google Play Services\" not found!");
                }
                return;
            }
            a.setOnClickListener(new OnClickListener() {
                public void onClick(View view) {
                    if (C6672y.this.f23467a) {
                        Log.v("SCMapFragment", "\"Get Google Play Services\" workaround activated");
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.gms"));
                    intent.setFlags(524288);
                    C0367h s = C6672y.this.mo1318s();
                    if (s != null) {
                        s.startActivityForResult(intent, 0);
                    }
                }
            });
            this.f23471e = true;
            if (this.f23467a) {
                Log.v("SCMapFragment", "\"Get Google Play Services\" workaround applied successfully");
            }
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f23469c != null) {
            this.f23469c.mo15033a();
            mo1453c();
        }
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        if (this.f23469c != null) {
            this.f23469c.mo15036b();
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5460i.fragment_map, viewGroup, false);
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        mo20293b(true);
        super.mo1234a(bundle);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f23469c = (MapView) view.findViewById(C5458g.map);
        this.f23469c.mo15034a(bundle);
        this.f23469c.mo15035a((C4591f) new C4591f() {
            /* renamed from: a */
            public void mo15128a(C4580c cVar) {
                C6672y.this.f23468b = cVar;
            }
        });
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (mo1450b()) {
            if (!z && this.f23468b != null) {
                this.f23470d = this.f23468b.mo15113f();
            }
            if (this.f23470d && this.f23469c != null) {
                this.f23468b.mo15107a(z);
            }
        }
    }

    /* renamed from: b */
    public boolean mo1450b() {
        return this.f23469c == null || this.f23468b == null;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        if (this.f23469c != null && mo1199I() != null) {
            this.f23469c.mo15037b(bundle);
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        super.mo1296i();
        if (this.f23469c != null) {
            this.f23469c.mo15038c();
            this.f23469c = null;
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (this.f23469c != null) {
            this.f23469c.mo15039d();
        }
    }
}
