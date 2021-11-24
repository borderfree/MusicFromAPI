package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.o */
public class C0038o {

    /* renamed from: a */
    private final HashMap<String, C0035m> f70a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0035m mo85a(String str) {
        return (C0035m) this.f70a.get(str);
    }

    /* renamed from: a */
    public final void mo86a() {
        for (C0035m a : this.f70a.values()) {
            a.mo81a();
        }
        this.f70a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo87a(String str, C0035m mVar) {
        C0035m mVar2 = (C0035m) this.f70a.get(str);
        if (mVar2 != null) {
            mVar2.mo81a();
        }
        this.f70a.put(str, mVar);
    }
}
