package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public class asg implements asb {

    /* renamed from: a */
    boolean f13063a;

    /* renamed from: b */
    boolean f13064b;

    /* renamed from: c */
    private final Object f13065c = new Object();

    /* renamed from: d */
    private final asd f13066d;

    /* renamed from: e */
    private final Context f13067e;

    /* renamed from: f */
    private final arm f13068f;

    /* renamed from: g */
    private final JSONObject f13069g;

    /* renamed from: h */
    private final C3442bn f13070h;

    /* renamed from: i */
    private final ase f13071i;

    /* renamed from: j */
    private final afm f13072j;

    /* renamed from: k */
    private final zzang f13073k;

    /* renamed from: l */
    private String f13074l;

    /* renamed from: m */
    private C3610hs f13075m;

    /* renamed from: n */
    private WeakReference<View> f13076n = null;

    public asg(Context context, asd asd, C3442bn bnVar, afm afm, JSONObject jSONObject, ase ase, zzang zzang, String str) {
        this.f13067e = context;
        this.f13066d = asd;
        this.f13070h = bnVar;
        this.f13072j = afm;
        this.f13069g = jSONObject;
        this.f13071i = ase;
        this.f13073k = zzang;
        this.f13074l = str;
        this.f13068f = new arm(this.f13070h);
    }

    /* renamed from: a */
    private final int m17160a(int i) {
        ane.m16645a();
        return C3719lt.m19117b(this.f13067e, i);
    }

    /* renamed from: a */
    private final JSONObject m17161a(Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", m17160a(rect.right - rect.left));
        jSONObject.put("height", m17160a(rect.bottom - rect.top));
        jSONObject.put("x", m17160a(rect.left));
        jSONObject.put("y", m17160a(rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: a */
    private final JSONObject m17162a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject2;
        }
        int[] f = m17167f(view);
        synchronized (map) {
            for (Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] f2 = m17167f(view2);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        jSONObject4.put("width", m17160a(view2.getMeasuredWidth()));
                        jSONObject4.put("height", m17160a(view2.getMeasuredHeight()));
                        jSONObject4.put("x", m17160a(f2[0] - f[0]));
                        jSONObject4.put("y", m17160a(f2[1] - f[1]));
                        jSONObject4.put("relative_to", "ad_view");
                        jSONObject3.put("frame", jSONObject4);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject = m17161a(rect);
                        } else {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("width", 0);
                            jSONObject5.put("height", 0);
                            jSONObject5.put("x", m17160a(f2[0] - f[0]));
                            jSONObject5.put("y", m17160a(f2[1] - f[1]));
                            jSONObject5.put("relative_to", "ad_view");
                            jSONObject = jSONObject5;
                        }
                        jSONObject3.put("visible_bounds", jSONObject);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject3.put("text_color", textView.getCurrentTextColor());
                            jSONObject3.put("font_size", (double) textView.getTextSize());
                            jSONObject3.put("text", textView.getText());
                        }
                        jSONObject2.put((String) entry.getKey(), jSONObject3);
                    } catch (JSONException unused) {
                        C3643iy.m19178e("Unable to get asset views information");
                    }
                }
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m17163a(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6) {
        C3266s.m14922b("Invalid call from a non-UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f13069g);
            if (jSONObject2 != null) {
                jSONObject7.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject7.put("ad_view_signal", jSONObject);
            }
            if (jSONObject5 != null) {
                jSONObject7.put("click_signal", jSONObject5);
            }
            if (jSONObject3 != null) {
                jSONObject7.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject7.put("lock_screen_signal", jSONObject4);
            }
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f13071i.mo12371k());
            zzbv.zzem();
            jSONObject8.put("is_privileged_process", C3659jn.m18934e());
            boolean z = true;
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12777ck)).booleanValue() && this.f13068f.mo12349a() != null && this.f13069g.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", zzbv.zzer().mo11326a());
            jSONObject8.put("has_custom_click_handler", this.f13066d.zzr(this.f13071i.mo12372l()) != null);
            String str2 = "has_custom_click_handler";
            if (this.f13066d.zzr(this.f13071i.mo12372l()) == null) {
                z = false;
            }
            jSONObject7.put(str2, z);
            try {
                JSONObject optJSONObject = this.f13069g.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject8.put("click_signals", this.f13072j.mo11851a().zza(this.f13067e, optJSONObject.optString("click_string"), view));
            } catch (Exception e) {
                C3643iy.m19173b("Exception obtaining click signals", e);
            }
            jSONObject7.put("click", jSONObject8);
            if (jSONObject6 != null) {
                jSONObject7.put("provided_signals", jSONObject6);
            }
            jSONObject7.put("ads_id", this.f13074l);
            C3738ml.m19187a(this.f13070h.mo12819b(jSONObject7), "NativeAdEngineImpl.performClick");
        } catch (JSONException e2) {
            C3643iy.m19173b("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: a */
    private final boolean m17164a(String str) {
        JSONObject optJSONObject = this.f13069g == null ? null : this.f13069g.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null) {
            return false;
        }
        return optJSONObject.optBoolean(str, false);
    }

    /* renamed from: a */
    private final boolean m17165a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        C3266s.m14922b("Invalid call from a non-UI thread.");
        if (this.f13063a) {
            return true;
        }
        this.f13063a = true;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f13069g);
            jSONObject6.put("ads_id", this.f13074l);
            if (jSONObject2 != null) {
                jSONObject6.put("asset_view_signal", jSONObject2);
            }
            if (jSONObject != null) {
                jSONObject6.put("ad_view_signal", jSONObject);
            }
            if (jSONObject3 != null) {
                jSONObject6.put("scroll_view_signal", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject6.put("lock_screen_signal", jSONObject4);
            }
            if (jSONObject5 != null) {
                jSONObject6.put("provided_signals", jSONObject5);
            }
            C3738ml.m19187a(this.f13070h.mo12821c(jSONObject6), "NativeAdEngineImpl.recordImpression");
            this.f13066d.zza((asb) this);
            this.f13066d.zzbv();
            mo12448j();
            return true;
        } catch (JSONException e) {
            C3643iy.m19173b("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m17166e(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    /* renamed from: f */
    private static int[] m17167f(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: g */
    private final JSONObject m17168g(View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] f = m17167f(view);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", m17160a(view.getMeasuredWidth()));
            jSONObject3.put("height", m17160a(view.getMeasuredHeight()));
            jSONObject3.put("x", m17160a(f[0]));
            jSONObject3.put("y", m17160a(f[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = m17161a(rect);
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("width", 0);
                jSONObject.put("height", 0);
                jSONObject.put("x", m17160a(f[0]));
                jSONObject.put("y", m17160a(f[1]));
                jSONObject.put("relative_to", "window");
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            C3643iy.m19178e("Unable to get native ad view bounding box");
        }
        return jSONObject2;
    }

    /* renamed from: h */
    private static JSONObject m17169h(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            zzbv.zzek();
            jSONObject.put("contained_in_scroll_view", C3653jh.m18898d(view) != -1);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final JSONObject m17170i(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        String str = "can_show_on_lock_screen";
        try {
            zzbv.zzek();
            jSONObject.put(str, C3653jh.m18896c(view));
            zzbv.zzek();
            jSONObject.put("is_keyguard_locked", C3653jh.m18909j(this.f13067e));
        } catch (JSONException unused) {
            C3643iy.m19178e("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1.addRule(11);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo12431a(android.view.View.OnClickListener r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.ase r0 = r6.f13071i
            com.google.android.gms.internal.ads.arl r0 = r0.mo12373m()
            if (r0 != 0) goto L_0x000a
            r7 = 0
            return r7
        L_0x000a:
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r2 = -2
            r1.<init>(r2, r2)
            if (r8 != 0) goto L_0x0038
            int r8 = r0.mo12347h()
            r2 = 9
            r3 = 10
            if (r8 == 0) goto L_0x0032
            r4 = 12
            r5 = 11
            switch(r8) {
                case 2: goto L_0x002e;
                case 3: goto L_0x002a;
                default: goto L_0x0023;
            }
        L_0x0023:
            r1.addRule(r3)
        L_0x0026:
            r1.addRule(r5)
            goto L_0x0038
        L_0x002a:
            r1.addRule(r4)
            goto L_0x0035
        L_0x002e:
            r1.addRule(r4)
            goto L_0x0026
        L_0x0032:
            r1.addRule(r3)
        L_0x0035:
            r1.addRule(r2)
        L_0x0038:
            com.google.android.gms.internal.ads.aro r8 = new com.google.android.gms.internal.ads.aro
            android.content.Context r2 = r6.f13067e
            r8.<init>(r2, r0, r1)
            r8.setOnClickListener(r7)
            com.google.android.gms.internal.ads.aqc<java.lang.String> r7 = com.google.android.gms.internal.ads.aqm.f12771ce
            com.google.android.gms.internal.ads.aqk r0 = com.google.android.gms.internal.ads.ane.m16650f()
            java.lang.Object r7 = r0.mo12297a(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8.setContentDescription(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asg.mo12431a(android.view.View$OnClickListener, boolean):android.view.View");
    }

    /* renamed from: a */
    public final void mo12450a(MotionEvent motionEvent) {
        this.f13072j.mo11852a(motionEvent);
    }

    /* renamed from: a */
    public void mo12432a(View view) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12777ck)).booleanValue()) {
            if (!this.f13069g.optBoolean("custom_one_point_five_click_enabled", false)) {
                C3643iy.m19178e("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
                return;
            }
            arm arm = this.f13068f;
            if (view != null) {
                view.setOnClickListener(arm);
                view.setClickable(true);
                arm.f12973c = new WeakReference<>(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo12451a(View view, arz arz) {
        if (!mo12467b(view, arz)) {
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            ((FrameLayout) view).removeAllViews();
            if (this.f13071i instanceof asf) {
                asf asf = (asf) this.f13071i;
                if (asf.mo12360b() != null && asf.mo12360b().size() > 0) {
                    Object obj = asf.mo12360b().get(0);
                    asy a = obj instanceof IBinder ? asz.m17237a((IBinder) obj) : null;
                    if (a != null) {
                        try {
                            C3323b a2 = a.mo12354a();
                            if (a2 != null) {
                                Drawable drawable = (Drawable) C3327d.m15137a(a2);
                                ImageView imageView = new ImageView(this.f13067e);
                                imageView.setImageDrawable(drawable);
                                imageView.setScaleType(ScaleType.CENTER_INSIDE);
                                ((FrameLayout) view).addView(imageView, layoutParams);
                            }
                        } catch (RemoteException unused) {
                            C3643iy.m19178e("Could not get drawable from image");
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12452a(View view, String str, Bundle bundle, Map<String, WeakReference<View>> map, View view2) {
        JSONObject jSONObject;
        JSONObject a = m17162a(map, view2);
        JSONObject g = m17168g(view2);
        JSONObject h = m17169h(view2);
        JSONObject i = m17170i(view2);
        JSONObject jSONObject2 = null;
        try {
            JSONObject a2 = zzbv.zzek().mo13123a(bundle, (JSONObject) null);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("click_point", a2);
                jSONObject3.put("asset_id", str);
                jSONObject = jSONObject3;
            } catch (Exception e) {
                e = e;
                jSONObject2 = jSONObject3;
                C3643iy.m19173b("Error occurred while grabbing click signals.", e);
                jSONObject = jSONObject2;
                m17163a(view, g, a, h, i, str, jSONObject, null);
            }
        } catch (Exception e2) {
            e = e2;
            C3643iy.m19173b("Error occurred while grabbing click signals.", e);
            jSONObject = jSONObject2;
            m17163a(view, g, a, h, i, str, jSONObject, null);
        }
        m17163a(view, g, a, h, i, str, jSONObject, null);
    }

    /* renamed from: a */
    public void mo12433a(View view, Map<String, WeakReference<View>> map) {
        m17165a(m17168g(view), m17162a(map, view), m17169h(view), m17170i(view), (JSONObject) null);
    }

    /* renamed from: a */
    public void mo12434a(View view, Map<String, WeakReference<View>> map, Bundle bundle, View view2) {
        String str;
        C3266s.m14922b("Invalid call from a non-UI thread.");
        if (map != null) {
            synchronized (map) {
                for (Entry entry : map.entrySet()) {
                    if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                        mo12452a(view, (String) entry.getKey(), bundle, map, view2);
                        return;
                    }
                }
            }
        }
        if ("6".equals(this.f13071i.mo12371k())) {
            str = "3099";
        } else if ("2".equals(this.f13071i.mo12371k())) {
            str = "2099";
        } else {
            if ("1".equals(this.f13071i.mo12371k())) {
                mo12452a(view, "1099", bundle, map, view2);
            }
            return;
        }
        mo12452a(view, str, bundle, map, view2);
    }

    /* renamed from: a */
    public void mo12435a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12768cb)).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                synchronized (map) {
                    for (Entry value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(onTouchListener);
                            view2.setClickable(true);
                            view2.setOnClickListener(onClickListener);
                        }
                    }
                }
            }
            if (map2 != null) {
                synchronized (map2) {
                    for (Entry value2 : map2.entrySet()) {
                        View view3 = (View) ((WeakReference) value2.getValue()).get();
                        if (view3 != null) {
                            view3.setOnTouchListener(onTouchListener);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo12437a(aur aur) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12777ck)).booleanValue()) {
            if (!this.f13069g.optBoolean("custom_one_point_five_click_enabled", false)) {
                C3643iy.m19178e("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            } else {
                this.f13068f.mo12350a(aur);
            }
        }
    }

    /* renamed from: a */
    public final void mo12466a(Map<String, WeakReference<View>> map) {
        if (this.f13071i.mo12375o() != null) {
            if ("2".equals(this.f13071i.mo12371k())) {
                zzbv.zzeo().mo13060l().mo13097a(this.f13066d.getAdUnitId(), this.f13071i.mo12371k(), map.containsKey(NativeAppInstallAd.ASSET_MEDIA_VIDEO));
            } else if ("1".equals(this.f13071i.mo12371k())) {
                zzbv.zzeo().mo13060l().mo13097a(this.f13066d.getAdUnitId(), this.f13071i.mo12371k(), map.containsKey(NativeContentAd.ASSET_MEDIA_VIDEO));
            }
        }
    }

    /* renamed from: a */
    public boolean mo12438a() {
        arl m = this.f13071i.mo12373m();
        return m != null && m.mo12348i();
    }

    /* renamed from: a */
    public final boolean mo12453a(Bundle bundle) {
        if (!m17164a("impression_reporting")) {
            C3643iy.m19174c("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return m17165a((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, zzbv.zzek().mo13123a(bundle, (JSONObject) null));
    }

    /* renamed from: b */
    public final void mo12454b(Bundle bundle) {
        if (bundle == null) {
            C3643iy.m19172b("Click data is null. No click is reported.");
        } else if (!m17164a("click_reporting")) {
            C3643iy.m19174c("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            m17163a(null, null, null, null, null, bundle.getBundle("click_signal").getString("asset_id"), null, zzbv.zzek().mo13123a(bundle, (JSONObject) null));
        }
    }

    /* renamed from: b */
    public final void mo12455b(View view) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12694bG)).booleanValue() && this.f13072j != null) {
            afi a = this.f13072j.mo11851a();
            if (a != null) {
                a.zzb(view);
            }
        }
    }

    /* renamed from: b */
    public void mo12439b(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12767ca)).booleanValue()) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setOnClickListener(null);
            if (map != null) {
                synchronized (map) {
                    for (Entry value : map.entrySet()) {
                        View view2 = (View) ((WeakReference) value.getValue()).get();
                        if (view2 != null) {
                            view2.setOnTouchListener(null);
                            view2.setClickable(false);
                            view2.setOnClickListener(null);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo12440b() {
        return this.f13069g != null && this.f13069g.optBoolean("allow_pub_owned_ad_view", false);
    }

    /* renamed from: b */
    public final boolean mo12467b(View view, arz arz) {
        LayoutParams layoutParams = new LayoutParams(-2, -2, 17);
        View o = this.f13071i.mo12375o();
        if (o == null) {
            return false;
        }
        ViewParent parent = o.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(o);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.removeAllViews();
        frameLayout.addView(o, layoutParams);
        this.f13066d.zza(arz);
        return true;
    }

    /* renamed from: c */
    public void mo12441c() {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12777ck)).booleanValue()) {
            if (!this.f13069g.optBoolean("custom_one_point_five_click_enabled", false)) {
                C3643iy.m19178e("Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            } else {
                this.f13068f.mo12351b();
            }
        }
    }

    /* renamed from: c */
    public final void mo12456c(Bundle bundle) {
        if (bundle == null) {
            C3643iy.m19172b("Touch event data is null. No touch event is reported.");
        } else if (!m17164a("touch_reporting")) {
            C3643iy.m19174c("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            this.f13072j.mo11851a().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        }
    }

    /* renamed from: c */
    public final void mo12457c(View view) {
        this.f13076n = new WeakReference<>(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12458c(android.view.View r4, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13065c
            monitor-enter(r0)
            boolean r1 = r3.f13063a     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0009:
            boolean r1 = m17166e(r4)     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0014
            r3.mo12433a(r4, r5)     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aqm.f12776cj     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo12297a(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x005c
            monitor-enter(r5)     // Catch:{ all -> 0x005e }
            java.util.Set r1 = r5.entrySet()     // Catch:{ all -> 0x0059 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0059 }
        L_0x0031:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0059 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0059 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0059 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = m17166e(r2)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0031
            r3.mo12433a(r4, r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x0057:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r4     // Catch:{ all -> 0x005e }
        L_0x005c:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return
        L_0x005e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.asg.mo12458c(android.view.View, java.util.Map):void");
    }

    /* renamed from: d */
    public void mo12442d() {
        C3266s.m14922b("Invalid call from a non-UI thread.");
        if (!this.f13064b) {
            this.f13064b = true;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad", this.f13069g);
                jSONObject.put("ads_id", this.f13074l);
                C3738ml.m19187a(this.f13070h.mo12822d(jSONObject), "NativeAdEngineImpl.recordDownloadedImpression");
            } catch (JSONException e) {
                C3731me.m19173b("", e);
            }
        }
    }

    /* renamed from: d */
    public final void mo12468d(View view) {
        this.f13066d.zzi(view);
    }

    /* renamed from: g */
    public C3832py mo12445g() {
        if (this.f13069g == null || this.f13069g.optJSONObject("overlay") == null) {
            return null;
        }
        zzbv.zzel();
        Context context = this.f13067e;
        zzjn a = zzjn.m20760a(this.f13067e);
        C3832py a2 = C3840qf.m19490a(context, C3873rl.m19692a(a), a.f15499a, false, false, this.f13072j, this.f13073k, null, null, null, akv.m16455a());
        if (a2 != null) {
            a2.getView().setVisibility(8);
            new asi(a2).mo12470a(this.f13070h);
        }
        return a2;
    }

    /* renamed from: h */
    public void mo12446h() {
        this.f13070h.mo12816a();
    }

    /* renamed from: i */
    public void mo12447i() {
        this.f13066d.zzct();
    }

    /* renamed from: j */
    public void mo12448j() {
        this.f13066d.zzcr();
    }

    /* renamed from: k */
    public void mo12449k() {
        this.f13066d.zzcs();
    }

    /* renamed from: l */
    public final View mo12459l() {
        if (this.f13076n != null) {
            return (View) this.f13076n.get();
        }
        return null;
    }

    /* renamed from: m */
    public final Context mo12460m() {
        return this.f13067e;
    }

    /* renamed from: n */
    public final C3610hs mo12469n() {
        if (!zzbv.zzfh().mo13003c(this.f13067e)) {
            return null;
        }
        if (this.f13075m == null) {
            this.f13075m = new C3610hs(this.f13067e, this.f13066d.getAdUnitId());
        }
        return this.f13075m;
    }
}
