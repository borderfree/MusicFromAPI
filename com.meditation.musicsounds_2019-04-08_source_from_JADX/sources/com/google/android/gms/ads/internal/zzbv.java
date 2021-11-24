package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.zza;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.common.util.C3303h;
import com.google.android.gms.internal.ads.C3411am;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3465cj;
import com.google.android.gms.internal.ads.C3535ey;
import com.google.android.gms.internal.ads.C3611ht;
import com.google.android.gms.internal.ads.C3627ii;
import com.google.android.gms.internal.ads.C3636ir;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3659jn;
import com.google.android.gms.internal.ads.C3664js;
import com.google.android.gms.internal.ads.C3665jt;
import com.google.android.gms.internal.ads.C3666ju;
import com.google.android.gms.internal.ads.C3667jv;
import com.google.android.gms.internal.ads.C3668jw;
import com.google.android.gms.internal.ads.C3670jy;
import com.google.android.gms.internal.ads.C3671jz;
import com.google.android.gms.internal.ads.C3681ki;
import com.google.android.gms.internal.ads.C3705lf;
import com.google.android.gms.internal.ads.C3706lg;
import com.google.android.gms.internal.ads.C3715lp;
import com.google.android.gms.internal.ads.C3764nk;
import com.google.android.gms.internal.ads.C3771nr;
import com.google.android.gms.internal.ads.C3780o;
import com.google.android.gms.internal.ads.C3816pi;
import com.google.android.gms.internal.ads.C3840qf;
import com.google.android.gms.internal.ads.ajk;
import com.google.android.gms.internal.ads.akh;
import com.google.android.gms.internal.ads.aki;
import com.google.android.gms.internal.ads.aku;
import com.google.android.gms.internal.ads.aqr;
import com.google.android.gms.internal.ads.awz;
import com.google.android.gms.internal.ads.axt;
import com.google.android.gms.internal.ads.azk;
import com.google.android.gms.internal.ads.bal;

@C3464ci
public final class zzbv {

    /* renamed from: a */
    private static final Object f10213a = new Object();

    /* renamed from: b */
    private static zzbv f10214b;

    /* renamed from: A */
    private final zzbb f10215A;

    /* renamed from: B */
    private final C3780o f10216B;

    /* renamed from: C */
    private final aku f10217C;

    /* renamed from: D */
    private final C3611ht f10218D;

    /* renamed from: E */
    private final C3816pi f10219E;

    /* renamed from: F */
    private final C3771nr f10220F;

    /* renamed from: G */
    private final axt f10221G;

    /* renamed from: H */
    private final C3671jz f10222H;

    /* renamed from: I */
    private final C3715lp f10223I;

    /* renamed from: J */
    private final C3636ir f10224J;

    /* renamed from: c */
    private final zza f10225c = new zza();

    /* renamed from: d */
    private final C3465cj f10226d = new C3465cj();

    /* renamed from: e */
    private final zzl f10227e = new zzl();

    /* renamed from: f */
    private final C3411am f10228f = new C3411am();

    /* renamed from: g */
    private final C3653jh f10229g = new C3653jh();

    /* renamed from: h */
    private final C3840qf f10230h = new C3840qf();

    /* renamed from: i */
    private final C3659jn f10231i;

    /* renamed from: j */
    private final ajk f10232j;

    /* renamed from: k */
    private final C3627ii f10233k;

    /* renamed from: l */
    private final akh f10234l;

    /* renamed from: m */
    private final aki f10235m;

    /* renamed from: n */
    private final C3300e f10236n;

    /* renamed from: o */
    private final zzad f10237o;

    /* renamed from: p */
    private final aqr f10238p;

    /* renamed from: q */
    private final C3681ki f10239q;

    /* renamed from: r */
    private final C3535ey f10240r;

    /* renamed from: s */
    private final C3764nk f10241s;

    /* renamed from: t */
    private final awz f10242t;

    /* renamed from: u */
    private final azk f10243u;

    /* renamed from: v */
    private final C3705lf f10244v;

    /* renamed from: w */
    private final zzu f10245w;

    /* renamed from: x */
    private final zzv f10246x;

    /* renamed from: y */
    private final bal f10247y;

    /* renamed from: z */
    private final C3706lg f10248z;

    static {
        zzbv zzbv = new zzbv();
        synchronized (f10213a) {
            f10214b = zzbv;
        }
    }

    protected zzbv() {
        int i = VERSION.SDK_INT;
        C3659jn jnVar = i >= 21 ? new C3670jy() : i >= 19 ? new C3668jw() : i >= 18 ? new C3666ju() : i >= 17 ? new C3665jt() : i >= 16 ? new C3667jv() : new C3664js();
        this.f10231i = jnVar;
        this.f10232j = new ajk();
        this.f10233k = new C3627ii();
        this.f10224J = new C3636ir();
        this.f10234l = new akh();
        this.f10235m = new aki();
        this.f10236n = C3303h.m15052d();
        this.f10237o = new zzad();
        this.f10238p = new aqr();
        this.f10239q = new C3681ki();
        this.f10240r = new C3535ey();
        this.f10221G = new axt();
        this.f10241s = new C3764nk();
        this.f10242t = new awz();
        this.f10243u = new azk();
        this.f10244v = new C3705lf();
        this.f10245w = new zzu();
        this.f10246x = new zzv();
        this.f10247y = new bal();
        this.f10248z = new C3706lg();
        this.f10215A = new zzbb();
        this.f10216B = new C3780o();
        this.f10217C = new aku();
        this.f10218D = new C3611ht();
        this.f10219E = new C3816pi();
        this.f10220F = new C3771nr();
        this.f10222H = new C3671jz();
        this.f10223I = new C3715lp();
    }

    /* renamed from: a */
    private static zzbv m13686a() {
        zzbv zzbv;
        synchronized (f10213a) {
            zzbv = f10214b;
        }
        return zzbv;
    }

    public static C3465cj zzeg() {
        return m13686a().f10226d;
    }

    public static zza zzeh() {
        return m13686a().f10225c;
    }

    public static zzl zzei() {
        return m13686a().f10227e;
    }

    public static C3411am zzej() {
        return m13686a().f10228f;
    }

    public static C3653jh zzek() {
        return m13686a().f10229g;
    }

    public static C3840qf zzel() {
        return m13686a().f10230h;
    }

    public static C3659jn zzem() {
        return m13686a().f10231i;
    }

    public static ajk zzen() {
        return m13686a().f10232j;
    }

    public static C3627ii zzeo() {
        return m13686a().f10233k;
    }

    public static C3636ir zzep() {
        return m13686a().f10224J;
    }

    public static aki zzeq() {
        return m13686a().f10235m;
    }

    public static C3300e zzer() {
        return m13686a().f10236n;
    }

    public static zzad zzes() {
        return m13686a().f10237o;
    }

    public static aqr zzet() {
        return m13686a().f10238p;
    }

    public static C3681ki zzeu() {
        return m13686a().f10239q;
    }

    public static C3535ey zzev() {
        return m13686a().f10240r;
    }

    public static C3764nk zzew() {
        return m13686a().f10241s;
    }

    public static awz zzex() {
        return m13686a().f10242t;
    }

    public static azk zzey() {
        return m13686a().f10243u;
    }

    public static C3705lf zzez() {
        return m13686a().f10244v;
    }

    public static C3780o zzfa() {
        return m13686a().f10216B;
    }

    public static zzu zzfb() {
        return m13686a().f10245w;
    }

    public static zzv zzfc() {
        return m13686a().f10246x;
    }

    public static bal zzfd() {
        return m13686a().f10247y;
    }

    public static C3706lg zzfe() {
        return m13686a().f10248z;
    }

    public static C3816pi zzff() {
        return m13686a().f10219E;
    }

    public static C3771nr zzfg() {
        return m13686a().f10220F;
    }

    public static C3611ht zzfh() {
        return m13686a().f10218D;
    }

    public static axt zzfi() {
        return m13686a().f10221G;
    }

    public static C3671jz zzfj() {
        return m13686a().f10222H;
    }

    public static C3715lp zzfk() {
        return m13686a().f10223I;
    }
}
