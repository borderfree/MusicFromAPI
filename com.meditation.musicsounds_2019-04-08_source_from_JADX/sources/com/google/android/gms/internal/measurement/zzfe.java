package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4383fm.C4384a;
import com.google.android.gms.internal.measurement.C4383fm.C4385b;
import com.google.android.gms.internal.measurement.C4383fm.C4388e;

public final class zzfe {

    /* renamed from: com.google.android.gms.internal.measurement.zzfe$a */
    public static final class C4505a extends C4383fm<C4505a, C4506a> implements C4421gs {
        /* access modifiers changed from: private */
        public static final C4505a zzauw = new C4505a();
        private static volatile C4431hb<C4505a> zznw;
        private String zzauu = "";
        private long zzauv;
        private int zznr;

        /* renamed from: com.google.android.gms.internal.measurement.zzfe$a$a */
        public static final class C4506a extends C4384a<C4505a, C4506a> implements C4421gs {
            private C4506a() {
                super(C4505a.zzauw);
            }

            /* synthetic */ C4506a(C4294cf cfVar) {
                this();
            }

            /* renamed from: a */
            public final C4506a mo14877a(long j) {
                mo14504b();
                ((C4505a) this.f16115a).m22390a(j);
                return this;
            }

            /* renamed from: a */
            public final C4506a mo14878a(String str) {
                mo14504b();
                ((C4505a) this.f16115a).m22393a(str);
                return this;
            }
        }

        static {
            C4383fm.m21572a(C4505a.class, zzauw);
        }

        private C4505a() {
        }

        /* renamed from: a */
        public static C4506a m22389a() {
            return (C4506a) ((C4384a) zzauw.mo14492a(C4388e.f16123e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m22390a(long j) {
            this.zznr |= 2;
            this.zzauv = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m22393a(String str) {
            if (str != null) {
                this.zznr |= 1;
                this.zzauu = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo14492a(int i, Object obj, Object obj2) {
            switch (C4294cf.f15863a[i - 1]) {
                case 1:
                    return new C4505a();
                case 2:
                    return new C4506a(null);
                case 3:
                    Object[] objArr = {"zznr", "zzauu", "zzauv"};
                    return m21570a((C4419gq) zzauw, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", objArr);
                case 4:
                    return zzauw;
                case 5:
                    C4431hb<C4505a> hbVar = zznw;
                    if (hbVar == null) {
                        synchronized (C4505a.class) {
                            hbVar = zznw;
                            if (hbVar == null) {
                                hbVar = new C4385b<>(zzauw);
                                zznw = hbVar;
                            }
                        }
                    }
                    return hbVar;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzb extends C4383fm<zzb, C4507a> implements C4421gs {
        /* access modifiers changed from: private */
        public static final zzb zzauz = new zzb();
        private static volatile C4431hb<zzb> zznw;
        private int zzaux = 1;
        private C4394fs<C4505a> zzauy = m21574i();
        private int zznr;

        /* renamed from: com.google.android.gms.internal.measurement.zzfe$zzb$a */
        public static final class C4507a extends C4384a<zzb, C4507a> implements C4421gs {
            private C4507a() {
                super(zzb.zzauz);
            }

            /* synthetic */ C4507a(C4294cf cfVar) {
                this();
            }

            /* renamed from: a */
            public final C4507a mo14879a(C4505a aVar) {
                mo14504b();
                ((zzb) this.f16115a).m22399a(aVar);
                return this;
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.zzfe$zzb$zzb reason: collision with other inner class name */
        public enum C6888zzb implements C4391fp {
            RADS(1),
            PROVISIONING(2);
            

            /* renamed from: c */
            private static final C4392fq<C6888zzb> f16410c = null;
            private final int value;

            static {
                f16410c = new C4295cg();
            }

            private C6888zzb(int i) {
                this.value = i;
            }

            public static C4393fr zzd() {
                return C4296ch.f15864a;
            }

            public static C6888zzb zzt(int i) {
                switch (i) {
                    case 1:
                        return RADS;
                    case 2:
                        return PROVISIONING;
                    default:
                        return null;
                }
            }

            public final int zzc() {
                return this.value;
            }
        }

        static {
            C4383fm.m21572a(zzb.class, zzauz);
        }

        private zzb() {
        }

        /* renamed from: a */
        public static C4507a m22398a() {
            return (C4507a) ((C4384a) zzauz.mo14492a(C4388e.f16123e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m22399a(C4505a aVar) {
            if (aVar != null) {
                if (!this.zzauy.mo14307a()) {
                    C4394fs<C4505a> fsVar = this.zzauy;
                    int size = fsVar.size();
                    this.zzauy = fsVar.mo14322a(size == 0 ? 10 : size << 1);
                }
                this.zzauy.add(aVar);
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: b */
        public static C4431hb<zzb> m22401b() {
            return (C4431hb) zzauz.mo14492a(C4388e.f16125g, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo14492a(int i, Object obj, Object obj2) {
            switch (C4294cf.f15863a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C4507a(null);
                case 3:
                    Object[] objArr = {"zznr", "zzaux", C6888zzb.zzd(), "zzauy", C4505a.class};
                    return m21570a((C4419gq) zzauz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", objArr);
                case 4:
                    return zzauz;
                case 5:
                    C4431hb<zzb> hbVar = zznw;
                    if (hbVar == null) {
                        synchronized (zzb.class) {
                            hbVar = zznw;
                            if (hbVar == null) {
                                hbVar = new C4385b<>(zzauz);
                                zznw = hbVar;
                            }
                        }
                    }
                    return hbVar;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
