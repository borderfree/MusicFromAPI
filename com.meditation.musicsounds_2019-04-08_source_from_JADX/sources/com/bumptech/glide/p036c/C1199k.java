package com.bumptech.glide.p036c;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.C1231g;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.c.k */
public class C1199k extends Fragment {

    /* renamed from: a */
    private final C1187a f4341a;

    /* renamed from: b */
    private final C1204m f4342b;

    /* renamed from: c */
    private final Set<C1199k> f4343c;

    /* renamed from: d */
    private C1231g f4344d;

    /* renamed from: e */
    private C1199k f4345e;

    /* renamed from: f */
    private Fragment f4346f;

    /* renamed from: com.bumptech.glide.c.k$a */
    private class C1200a implements C1204m {
        C1200a() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{fragment=");
            sb.append(C1199k.this);
            sb.append("}");
            return sb.toString();
        }
    }

    public C1199k() {
        this(new C1187a());
    }

    @SuppressLint({"ValidFragment"})
    C1199k(C1187a aVar) {
        this.f4342b = new C1200a();
        this.f4343c = new HashSet();
        this.f4341a = aVar;
    }

    /* renamed from: a */
    private void m6496a(Activity activity) {
        m6500e();
        this.f4345e = C1186c.m6450a((Context) activity).mo5745g().mo5780b(activity);
        if (!equals(this.f4345e)) {
            this.f4345e.m6497a(this);
        }
    }

    /* renamed from: a */
    private void m6497a(C1199k kVar) {
        this.f4343c.add(kVar);
    }

    /* renamed from: b */
    private void m6498b(C1199k kVar) {
        this.f4343c.remove(kVar);
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m6499d() {
        Fragment parentFragment = VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f4346f;
    }

    /* renamed from: e */
    private void m6500e() {
        if (this.f4345e != null) {
            this.f4345e.m6498b(this);
            this.f4345e = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1187a mo5762a() {
        return this.f4341a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5763a(Fragment fragment) {
        this.f4346f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m6496a(fragment.getActivity());
        }
    }

    /* renamed from: a */
    public void mo5764a(C1231g gVar) {
        this.f4344d = gVar;
    }

    /* renamed from: b */
    public C1231g mo5765b() {
        return this.f4344d;
    }

    /* renamed from: c */
    public C1204m mo5766c() {
        return this.f4342b;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m6496a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4341a.mo5754c();
        m6500e();
    }

    public void onDetach() {
        super.onDetach();
        m6500e();
    }

    public void onStart() {
        super.onStart();
        this.f4341a.mo5750a();
    }

    public void onStop() {
        super.onStop();
        this.f4341a.mo5752b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        sb.append(m6499d());
        sb.append("}");
        return sb.toString();
    }
}
