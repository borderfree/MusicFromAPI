package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class ajj {

    /* renamed from: a */
    private final Object f12189a = new Object();

    /* renamed from: b */
    private int f12190b;

    /* renamed from: c */
    private List<aji> f12191c = new LinkedList();

    /* renamed from: a */
    public final aji mo12021a() {
        synchronized (this.f12189a) {
            aji aji = null;
            if (this.f12191c.size() == 0) {
                C3643iy.m19172b("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f12191c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (aji aji2 : this.f12191c) {
                    int i4 = aji2.mo12018i();
                    if (i4 > i2) {
                        i = i3;
                        aji = aji2;
                        i2 = i4;
                    }
                    i3++;
                }
                this.f12191c.remove(i);
                return aji;
            }
            aji aji3 = (aji) this.f12191c.get(0);
            aji3.mo12012e();
            return aji3;
        }
    }

    /* renamed from: a */
    public final boolean mo12022a(aji aji) {
        synchronized (this.f12189a) {
            return this.f12191c.contains(aji);
        }
    }

    /* renamed from: b */
    public final boolean mo12023b(aji aji) {
        synchronized (this.f12189a) {
            Iterator it = this.f12191c.iterator();
            while (it.hasNext()) {
                aji aji2 = (aji) it.next();
                if (!((Boolean) ane.m16650f().mo12297a(aqm.f12630W)).booleanValue() || zzbv.zzeo().mo13060l().mo13104b()) {
                    if (((Boolean) ane.m16650f().mo12297a(aqm.f12632Y)).booleanValue() && !zzbv.zzeo().mo13060l().mo13110d() && aji != aji2 && aji2.mo12011d().equals(aji.mo12011d())) {
                        it.remove();
                        return true;
                    }
                } else if (aji != aji2 && aji2.mo12008b().equals(aji.mo12008b())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo12024c(aji aji) {
        synchronized (this.f12189a) {
            if (this.f12191c.size() >= 10) {
                int size = this.f12191c.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                C3643iy.m19172b(sb.toString());
                this.f12191c.remove(0);
            }
            int i = this.f12190b;
            this.f12190b = i + 1;
            aji.mo12005a(i);
            this.f12191c.add(aji);
        }
    }
}
