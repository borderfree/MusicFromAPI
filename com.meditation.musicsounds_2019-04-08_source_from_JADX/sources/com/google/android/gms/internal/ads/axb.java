package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3266s;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
final class axb {

    /* renamed from: a */
    private final LinkedList<axc> f13250a = new LinkedList<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public zzjj f13251b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f13252c;

    /* renamed from: d */
    private final int f13253d;

    /* renamed from: e */
    private boolean f13254e;

    axb(zzjj zzjj, String str, int i) {
        C3266s.m14913a(zzjj);
        C3266s.m14913a(str);
        this.f13251b = zzjj;
        this.f13252c = str;
        this.f13253d = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final axc mo12565a(zzjj zzjj) {
        if (zzjj != null) {
            this.f13251b = zzjj;
        }
        return (axc) this.f13250a.remove();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final zzjj mo12566a() {
        return this.f13251b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12567a(avu avu, zzjj zzjj) {
        this.f13250a.add(new axc(this, avu, zzjj));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo12568a(avu avu) {
        axc axc = new axc(this, avu);
        this.f13250a.add(axc);
        return axc.mo12576a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo12569b() {
        return this.f13253d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final String mo12570c() {
        return this.f13252c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo12571d() {
        return this.f13250a.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo12572e() {
        Iterator it = this.f13250a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((axc) it.next()).f13259e) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo12573f() {
        Iterator it = this.f13250a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((axc) it.next()).mo12576a()) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo12574g() {
        this.f13254e = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo12575h() {
        return this.f13254e;
    }
}
