package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4383fm.C4388e;

/* renamed from: com.google.android.gms.internal.measurement.gg */
final class C4409gg implements C4438hi {

    /* renamed from: b */
    private static final C4418gp f16164b = new C4410gh();

    /* renamed from: a */
    private final C4418gp f16165a;

    public C4409gg() {
        this(new C4411gi(C4382fl.m21565a(), m21671a()));
    }

    private C4409gg(C4418gp gpVar) {
        this.f16165a = (C4418gp) C4390fo.m21609a(gpVar, "messageInfoFactory");
    }

    /* renamed from: a */
    private static C4418gp m21671a() {
        try {
            return (C4418gp) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f16164b;
        }
    }

    /* renamed from: a */
    private static boolean m21672a(C4417go goVar) {
        return goVar.mo14567a() == C4388e.f16126h;
    }

    /* renamed from: a */
    public final <T> C4437hh<T> mo14558a(Class<T> cls) {
        C4439hj.m21857a(cls);
        C4417go b = this.f16165a.mo14491b(cls);
        if (b.mo14568b()) {
            return C4383fm.class.isAssignableFrom(cls) ? C4425gw.m21759a(C4439hj.m21869c(), C4375fe.m21527a(), b.mo14569c()) : C4425gw.m21759a(C4439hj.m21847a(), C4375fe.m21528b(), b.mo14569c());
        }
        if (C4383fm.class.isAssignableFrom(cls)) {
            if (m21672a(b)) {
                return C4423gu.m21719a(cls, b, C4430ha.m21777b(), C4404gb.m21652b(), C4439hj.m21869c(), C4375fe.m21527a(), C4416gn.m21697b());
            }
            return C4423gu.m21719a(cls, b, C4430ha.m21777b(), C4404gb.m21652b(), C4439hj.m21869c(), null, C4416gn.m21697b());
        } else if (m21672a(b)) {
            return C4423gu.m21719a(cls, b, C4430ha.m21776a(), C4404gb.m21651a(), C4439hj.m21847a(), C4375fe.m21528b(), C4416gn.m21696a());
        } else {
            return C4423gu.m21719a(cls, b, C4430ha.m21776a(), C4404gb.m21651a(), C4439hj.m21863b(), null, C4416gn.m21696a());
        }
    }
}
