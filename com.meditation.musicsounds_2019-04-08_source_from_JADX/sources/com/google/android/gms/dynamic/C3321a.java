package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C3177d;
import com.google.android.gms.common.internal.C3243f;
import com.google.android.gms.dynamic.C3326c;
import java.util.LinkedList;

/* renamed from: com.google.android.gms.dynamic.a */
public abstract class C3321a<T extends C3326c> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f11230a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bundle f11231b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public LinkedList<C3322a> f11232c;

    /* renamed from: d */
    private final C3328e<T> f11233d = new C3329f(this);

    /* renamed from: com.google.android.gms.dynamic.a$a */
    private interface C3322a {
        /* renamed from: a */
        int mo11341a();

        /* renamed from: a */
        void mo11342a(C3326c cVar);
    }

    /* renamed from: a */
    private final void m15115a(int i) {
        while (!this.f11232c.isEmpty() && ((C3322a) this.f11232c.getLast()).mo11341a() >= i) {
            this.f11232c.removeLast();
        }
    }

    /* renamed from: a */
    private final void m15116a(Bundle bundle, C3322a aVar) {
        if (this.f11230a != null) {
            aVar.mo11342a(this.f11230a);
            return;
        }
        if (this.f11232c == null) {
            this.f11232c = new LinkedList<>();
        }
        this.f11232c.add(aVar);
        if (bundle != null) {
            if (this.f11231b == null) {
                this.f11231b = (Bundle) bundle.clone();
            } else {
                this.f11231b.putAll(bundle);
            }
        }
        mo11335a(this.f11233d);
    }

    /* renamed from: a */
    public static void m15117a(FrameLayout frameLayout) {
        C3177d a = C3177d.m14629a();
        Context context = frameLayout.getContext();
        int a2 = a.mo11106a(context);
        String c = C3243f.m14856c(context, a2);
        String e = C3243f.m14858e(context, a2);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        Intent a3 = a.mo11111a(context, a2, (String) null);
        if (a3 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(e);
            linearLayout.addView(button);
            button.setOnClickListener(new C3331h(context, a3));
        }
    }

    /* renamed from: a */
    public T mo11333a() {
        return this.f11230a;
    }

    /* renamed from: a */
    public void mo11334a(Bundle bundle) {
        m15116a(bundle, (C3322a) new C3330g(this, bundle));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11335a(C3328e<T> eVar);

    /* renamed from: b */
    public void mo11336b() {
        m15116a((Bundle) null, (C3322a) new C3332i(this));
    }

    /* renamed from: b */
    public void mo11337b(Bundle bundle) {
        if (this.f11230a != null) {
            this.f11230a.mo11346b(bundle);
            return;
        }
        if (this.f11231b != null) {
            bundle.putAll(this.f11231b);
        }
    }

    /* renamed from: c */
    public void mo11338c() {
        if (this.f11230a != null) {
            this.f11230a.mo11345b();
        } else {
            m15115a(5);
        }
    }

    /* renamed from: d */
    public void mo11339d() {
        if (this.f11230a != null) {
            this.f11230a.mo11347c();
        } else {
            m15115a(1);
        }
    }

    /* renamed from: e */
    public void mo11340e() {
        if (this.f11230a != null) {
            this.f11230a.mo11348d();
        }
    }
}
