package com.seattleclouds.util;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.seattleclouds.util.q */
public class C6635q {

    /* renamed from: a */
    private Map<String, Bitmap> f23369a = Collections.synchronizedMap(new LinkedHashMap(10, 1.5f, true));

    /* renamed from: b */
    private long f23370b = 0;

    /* renamed from: c */
    private long f23371c = 1000000;

    public C6635q() {
        mo20625a(Runtime.getRuntime().maxMemory() / 4);
    }

    /* renamed from: a */
    private void m32056a() {
        StringBuilder sb = new StringBuilder();
        sb.append("cache size=");
        sb.append(this.f23370b);
        sb.append(" length=");
        sb.append(this.f23369a.size());
        Log.i("ImageCache", sb.toString());
        if (this.f23370b > this.f23371c) {
            Iterator it = this.f23369a.entrySet().iterator();
            while (it.hasNext()) {
                this.f23370b -= mo20623a((Bitmap) ((Entry) it.next()).getValue());
                it.remove();
                if (this.f23370b <= this.f23371c) {
                    break;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Clean cache. New size ");
            sb2.append(this.f23369a.size());
            Log.i("ImageCache", sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo20623a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return (long) (bitmap.getRowBytes() * bitmap.getHeight());
    }

    /* renamed from: a */
    public Bitmap mo20624a(String str) {
        try {
            if (!this.f23369a.containsKey(str)) {
                return null;
            }
            return (Bitmap) this.f23369a.get(str);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo20625a(long j) {
        this.f23371c = j;
        StringBuilder sb = new StringBuilder();
        sb.append("MemoryCache will use up to ");
        double d = (double) this.f23371c;
        Double.isNaN(d);
        sb.append((d / 1024.0d) / 1024.0d);
        sb.append("MB");
        Log.i("ImageCache", sb.toString());
    }

    /* renamed from: a */
    public void mo20626a(String str, Bitmap bitmap) {
        try {
            if (this.f23369a.containsKey(str)) {
                this.f23370b -= mo20623a((Bitmap) this.f23369a.get(str));
            }
            this.f23369a.put(str, bitmap);
            this.f23370b += mo20623a(bitmap);
            m32056a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
