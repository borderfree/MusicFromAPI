package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.C3310o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public abstract class axv<ReferenceT> {

    /* renamed from: a */
    private final Map<String, CopyOnWriteArrayList<zzv<? super ReferenceT>>> f13293a = new HashMap();

    /* renamed from: a */
    private final synchronized void mo12588a(String str, Map<String, String> map) {
        if (C3643iy.m19171a(2)) {
            String str2 = "Received GMSG: ";
            String valueOf = String.valueOf(str);
            C3643iy.m18780a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 4 + String.valueOf(str4).length());
                sb.append("  ");
                sb.append(str3);
                sb.append(": ");
                sb.append(str4);
                C3643iy.m18780a(sb.toString());
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f13293a.get(str);
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C3758ne.f14481a.execute(new axw(this, (zzv) it.next(), map));
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo12610a(String str, zzv<? super ReferenceT> zzv) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f13293a.get(str);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f13293a.put(str, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(zzv);
    }

    /* renamed from: a */
    public final synchronized void mo12611a(String str, C3310o<zzv<? super ReferenceT>> oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f13293a.get(str);
        if (copyOnWriteArrayList != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                zzv zzv = (zzv) it.next();
                if (oVar.mo11329a(zzv)) {
                    arrayList.add(zzv);
                }
            }
            copyOnWriteArrayList.removeAll(arrayList);
        }
    }

    /* renamed from: a */
    public final boolean mo12612a(Uri uri) {
        if (!"gmsg".equalsIgnoreCase(uri.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String path = uri.getPath();
        zzbv.zzek();
        mo12588a(path, C3653jh.m18870a(uri));
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo12613b(String str, zzv<? super ReferenceT> zzv) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f13293a.get(str);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(zzv);
        }
    }

    /* renamed from: k */
    public synchronized void mo12614k() {
        this.f13293a.clear();
    }

    /* renamed from: o */
    public abstract ReferenceT mo12602o();
}
