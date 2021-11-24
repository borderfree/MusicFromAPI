package com.google.android.gms.internal.ads;

import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzhu.zza.zzb;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
public final class akv {

    /* renamed from: a */
    private final akz f12275a;
    @GuardedBy("this")

    /* renamed from: b */
    private final all f12276b;

    /* renamed from: c */
    private final boolean f12277c;

    private akv() {
        this.f12277c = false;
        this.f12275a = new akz();
        this.f12276b = new all();
        m16456b();
    }

    public akv(akz akz) {
        this.f12275a = akz;
        this.f12277c = ((Boolean) ane.m16650f().mo12297a(aqm.f12821db)).booleanValue();
        this.f12276b = new all();
        m16456b();
    }

    /* renamed from: a */
    public static akv m16455a() {
        return new akv();
    }

    /* renamed from: b */
    private final synchronized void m16456b() {
        this.f12276b.f12331d = new ale();
        this.f12276b.f12331d.f12289b = new alh();
        this.f12276b.f12330c = new alj();
    }

    /* renamed from: b */
    private final synchronized void m16457b(zzb zzb) {
        this.f12276b.f12329b = m16459c();
        this.f12275a.mo12083a(C3401ads.m16013a((C3401ads) this.f12276b)).mo12087b(zzb.zzhq()).mo12086a();
        String str = "Logging Event with event code : ";
        String valueOf = String.valueOf(Integer.toString(zzb.zzhq(), 10));
        C3643iy.m18780a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: c */
    private final synchronized void m16458c(zzb zzb) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m16460d(zzb).getBytes());
                    fileOutputStream.write(10);
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        C3643iy.m18780a("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    C3643iy.m18780a("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        C3643iy.m18780a("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                C3643iy.m18780a("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    C3643iy.m18780a("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: c */
    private static long[] m16459c() {
        int i;
        List b = aqm.m16922b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String[] split = ((String) it.next()).split(",");
            int length = split.length;
            while (i < length) {
                try {
                    arrayList.add(Long.valueOf(split[i]));
                } catch (NumberFormatException unused) {
                    C3643iy.m18780a("Experiment ID is not a number");
                }
                i++;
            }
        }
        long[] jArr = new long[arrayList.size()];
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            jArr[i2] = ((Long) obj).longValue();
            i2++;
        }
        return jArr;
    }

    /* renamed from: d */
    private final synchronized String m16460d(zzb zzb) {
        return String.format("id=%s,timestamp=%s,event=%s", new Object[]{this.f12276b.f12328a, Long.valueOf(zzbv.zzer().mo11327b()), Integer.valueOf(zzb.zzhq())});
    }

    /* renamed from: a */
    public final synchronized void mo12081a(akw akw) {
        if (this.f12277c) {
            try {
                akw.mo9994a(this.f12276b);
            } catch (NullPointerException e) {
                zzbv.zzeo().mo13047a((Throwable) e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo12082a(zzb zzb) {
        if (this.f12277c) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12822dc)).booleanValue()) {
                m16458c(zzb);
            } else {
                m16457b(zzb);
            }
        }
    }
}
