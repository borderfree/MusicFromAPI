package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbv;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.ParametersAreNonnullByDefault;
import p194nl.siegmann.epublib.domain.TableOfContents;

@ParametersAreNonnullByDefault
@C3464ci
public final class awz {

    /* renamed from: a */
    private final Map<axa, axb> f13243a = new HashMap();

    /* renamed from: b */
    private final LinkedList<axa> f13244b = new LinkedList<>();

    /* renamed from: c */
    private avu f13245c;

    /* renamed from: a */
    static Set<String> m17558a(zzjj zzjj) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzjj.f15483c.keySet());
        Bundle bundle = zzjj.f15493m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    private static void m17559a(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split(TableOfContents.DEFAULT_PATH_SEPARATOR, 2);
            if (split.length != 0) {
                String str2 = split[0];
                if (split.length == 1) {
                    bundle.remove(str2);
                    return;
                }
                bundle = bundle.getBundle(str2);
                if (bundle != null) {
                    str = split[1];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static void m17560a(String str, axa axa) {
        if (C3643iy.m19171a(2)) {
            C3643iy.m18780a(String.format(str, new Object[]{axa}));
        }
    }

    /* renamed from: a */
    private static String[] m17561a(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    /* renamed from: b */
    static zzjj m17562b(zzjj zzjj) {
        zzjj d = m17567d(zzjj);
        String str = "_skipMediation";
        Bundle bundle = d.f15493m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean(str, true);
        }
        d.f15483c.putBoolean(str, true);
        return d;
    }

    /* renamed from: b */
    private final String m17563b() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f13244b.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(((axa) it.next()).toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    private static boolean m17564b(String str) {
        try {
            return Pattern.matches((String) ane.m16650f().mo12297a(aqm.f12714ba), str);
        } catch (RuntimeException e) {
            zzbv.zzeo().mo13047a((Throwable) e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    /* renamed from: c */
    private static zzjj m17565c(zzjj zzjj) {
        String[] split;
        zzjj d = m17567d(zzjj);
        for (String str : ((String) ane.m16650f().mo12297a(aqm.f12657aW)).split(",")) {
            m17559a(d.f15493m, str);
            String str2 = "com.google.ads.mediation.admob.AdMobAdapter/";
            if (str.startsWith(str2)) {
                m17559a(d.f15483c, str.replaceFirst(str2, ""));
            }
        }
        return d;
    }

    /* renamed from: c */
    private static String m17566c(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            if (matcher.matches()) {
                return matcher.group(1);
            }
        } catch (RuntimeException unused) {
        }
        return str;
    }

    /* renamed from: d */
    private static zzjj m17567d(zzjj zzjj) {
        Parcel obtain = Parcel.obtain();
        zzjj.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzjj zzjj2 = (zzjj) zzjj.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return ((Boolean) ane.m16650f().mo12297a(aqm.f12648aN)).booleanValue() ? zzjj2.mo13978a() : zzjj2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final axc mo12557a(zzjj zzjj, String str) {
        if (m17564b(str)) {
            return null;
        }
        int i = new C3534ex(this.f13245c.mo12532a()).mo12895a().f13924n;
        zzjj c = m17565c(zzjj);
        String c2 = m17566c(str);
        axa axa = new axa(c, c2, i);
        axb axb = (axb) this.f13243a.get(axa);
        if (axb == null) {
            m17560a("Interstitial pool created at %s.", axa);
            axb = new axb(c, c2, i);
            this.f13243a.put(axa, axb);
        }
        this.f13244b.remove(axa);
        this.f13244b.add(axa);
        axb.mo12574g();
        while (true) {
            if (this.f13244b.size() <= ((Integer) ane.m16650f().mo12297a(aqm.f12658aX)).intValue()) {
                break;
            }
            axa axa2 = (axa) this.f13244b.remove();
            axb axb2 = (axb) this.f13243a.get(axa2);
            m17560a("Evicting interstitial queue for %s.", axa2);
            while (axb2.mo12571d() > 0) {
                axc a = axb2.mo12565a((zzjj) null);
                if (a.f13259e) {
                    axd.m17586a().mo12579c();
                }
                a.f13255a.zzdj();
            }
            this.f13243a.remove(axa2);
        }
        while (axb.mo12571d() > 0) {
            axc a2 = axb.mo12565a(c);
            if (a2.f13259e) {
                if (zzbv.zzer().mo11326a() - a2.f13258d > ((long) ((Integer) ane.m16650f().mo12297a(aqm.f12660aZ)).intValue()) * 1000) {
                    m17560a("Expired interstitial at %s.", axa);
                    axd.m17586a().mo12578b();
                }
            }
            String str2 = a2.f13256b != null ? " (inline) " : " ";
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 34);
            sb.append("Pooled interstitial");
            sb.append(str2);
            sb.append("returned at %s.");
            m17560a(sb.toString(), axa);
            return a2;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12558a() {
        if (this.f13245c != null) {
            for (Entry entry : this.f13243a.entrySet()) {
                axa axa = (axa) entry.getKey();
                axb axb = (axb) entry.getValue();
                if (C3643iy.m19171a(2)) {
                    int d = axb.mo12571d();
                    int e = axb.mo12572e();
                    if (e < d) {
                        C3643iy.m18780a(String.format("Loading %s/%s pooled interstitials for %s.", new Object[]{Integer.valueOf(d - e), Integer.valueOf(d), axa}));
                    }
                }
                int f = axb.mo12573f() + 0;
                while (true) {
                    if (axb.mo12571d() >= ((Integer) ane.m16650f().mo12297a(aqm.f12659aY)).intValue()) {
                        break;
                    }
                    m17560a("Pooling and loading one new interstitial for %s.", axa);
                    if (axb.mo12568a(this.f13245c)) {
                        f++;
                    }
                }
                axd.m17586a().mo12577a(f);
            }
            if (this.f13245c != null) {
                Editor edit = this.f13245c.mo12532a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
                edit.clear();
                for (Entry entry2 : this.f13243a.entrySet()) {
                    axa axa2 = (axa) entry2.getKey();
                    axb axb2 = (axb) entry2.getValue();
                    if (axb2.mo12575h()) {
                        edit.putString(axa2.toString(), new axf(axb2).mo12587a());
                        m17560a("Saved interstitial queue for %s.", axa2);
                    }
                }
                edit.putString("PoolKeys", m17563b());
                edit.apply();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12559a(avu avu) {
        if (this.f13245c == null) {
            this.f13245c = avu.mo12535b();
            if (this.f13245c != null) {
                SharedPreferences sharedPreferences = this.f13245c.mo12532a().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.f13244b.size() > 0) {
                    axa axa = (axa) this.f13244b.remove();
                    axb axb = (axb) this.f13243a.get(axa);
                    m17560a("Flushing interstitial queue for %s.", axa);
                    while (axb.mo12571d() > 0) {
                        axb.mo12565a((zzjj) null).f13255a.zzdj();
                    }
                    this.f13243a.remove(axa);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Entry entry : sharedPreferences.getAll().entrySet()) {
                        if (!((String) entry.getKey()).equals("PoolKeys")) {
                            axf a = axf.m17598a((String) entry.getValue());
                            axa axa2 = new axa(a.f13273a, a.f13274b, a.f13275c);
                            if (!this.f13243a.containsKey(axa2)) {
                                this.f13243a.put(axa2, new axb(a.f13273a, a.f13274b, a.f13275c));
                                hashMap.put(axa2.toString(), axa2);
                                m17560a("Restored interstitial queue for %s.", axa2);
                            }
                        }
                    }
                    for (String str : m17561a(sharedPreferences.getString("PoolKeys", ""))) {
                        axa axa3 = (axa) hashMap.get(str);
                        if (this.f13243a.containsKey(axa3)) {
                            this.f13244b.add(axa3);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    zzbv.zzeo().mo13047a(e, "InterstitialAdPool.restore");
                    C3643iy.m19175c("Malformed preferences value for InterstitialAdPool.", e);
                    this.f13243a.clear();
                    this.f13244b.clear();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo12560b(zzjj zzjj, String str) {
        if (this.f13245c != null) {
            int i = new C3534ex(this.f13245c.mo12532a()).mo12895a().f13924n;
            zzjj c = m17565c(zzjj);
            String c2 = m17566c(str);
            axa axa = new axa(c, c2, i);
            axb axb = (axb) this.f13243a.get(axa);
            if (axb == null) {
                m17560a("Interstitial pool created at %s.", axa);
                axb = new axb(c, c2, i);
                this.f13243a.put(axa, axb);
            }
            axb.mo12567a(this.f13245c, zzjj);
            axb.mo12574g();
            m17560a("Inline entry added to the queue at %s.", axa);
        }
    }
}
