package com.seattleclouds.modules.p185r;

import android.graphics.Bitmap;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.r.e */
public class C6216e {

    /* renamed from: a */
    private Map<String, WeakReference<Bitmap>> f22048a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    /* renamed from: b */
    private long f22049b = 0;

    /* renamed from: c */
    private long f22050c = 1000000;

    public C6216e() {
        mo19489a(Runtime.getRuntime().maxMemory() / 2);
    }

    /* renamed from: a */
    private long m30271a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return (long) (bitmap.getRowBytes() * bitmap.getHeight());
    }

    /* renamed from: b */
    private Bitmap m30272b(String str) {
        WeakReference weakReference = (WeakReference) this.f22048a.get(str);
        if (weakReference == null) {
            return null;
        }
        Bitmap bitmap = (Bitmap) weakReference.get();
        if (bitmap == null) {
            this.f22048a.remove(weakReference);
            m30275c();
            m30276c("reference was empty");
        }
        return bitmap;
    }

    /* renamed from: b */
    private void m30273b() {
        m30275c();
        StringBuilder sb = new StringBuilder();
        sb.append("cache size=");
        sb.append(this.f22049b);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(this.f22050c);
        sb.append(" length=");
        sb.append(this.f22048a.size());
        m30276c(sb.toString());
        if (this.f22049b > this.f22050c) {
            Iterator it = this.f22048a.entrySet().iterator();
            while (it.hasNext()) {
                this.f22049b -= m30271a((Bitmap) ((WeakReference) ((Entry) it.next()).getValue()).get());
                it.remove();
                if (this.f22049b <= this.f22050c) {
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Clean cache. New size ");
            sb2.append(this.f22048a.size());
            m30276c(sb2.toString());
        }
    }

    /* renamed from: b */
    private void m30274b(String str, Bitmap bitmap) {
        this.f22048a.put(str, bitmap == null ? null : new WeakReference(bitmap));
    }

    /* renamed from: c */
    private void m30275c() {
        this.f22049b = 0;
        for (Entry value : this.f22048a.entrySet()) {
            this.f22049b += m30271a((Bitmap) ((WeakReference) value.getValue()).get());
        }
    }

    /* renamed from: c */
    private static void m30276c(String str) {
        Log.i("ImageWeakCache", str);
    }

    /* renamed from: a */
    public Bitmap mo19487a(String str) {
        try {
            if (!this.f22048a.containsKey(str)) {
                return null;
            }
            return m30272b(str);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo19488a() {
        Iterator it = this.f22048a.entrySet().iterator();
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) ((WeakReference) ((Entry) it.next()).getValue()).get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            it.remove();
        }
        this.f22049b = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("cache size=");
        sb.append(this.f22049b);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(this.f22050c);
        sb.append(" length=");
        sb.append(this.f22048a.size());
        m30276c(sb.toString());
    }

    /* renamed from: a */
    public void mo19489a(long j) {
        this.f22050c = j;
        StringBuilder sb = new StringBuilder();
        sb.append("MemoryCache will use up to ");
        double d = (double) this.f22050c;
        Double.isNaN(d);
        sb.append((d / 1024.0d) / 1024.0d);
        sb.append("MB");
        m30276c(sb.toString());
    }

    /* renamed from: a */
    public void mo19490a(String str, Bitmap bitmap) {
        try {
            m30274b(str, bitmap);
            m30273b();
        } catch (Throwable unused) {
        }
    }
}
