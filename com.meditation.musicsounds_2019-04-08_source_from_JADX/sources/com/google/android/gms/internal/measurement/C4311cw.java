package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfe.zzb;
import com.google.android.gms.internal.measurement.zzfe.zzb.C4507a;

/* renamed from: com.google.android.gms.internal.measurement.cw */
public final class C4311cw extends C4478ir<C4311cw> {

    /* renamed from: N */
    private static volatile C4311cw[] f15936N;

    /* renamed from: A */
    public C4306cr[] f15937A;

    /* renamed from: B */
    public String f15938B;

    /* renamed from: C */
    public Integer f15939C;

    /* renamed from: D */
    public String f15940D;

    /* renamed from: E */
    public Long f15941E;

    /* renamed from: F */
    public Long f15942F;

    /* renamed from: G */
    public String f15943G;

    /* renamed from: H */
    public Integer f15944H;

    /* renamed from: I */
    public String f15945I;

    /* renamed from: J */
    public zzb f15946J;

    /* renamed from: K */
    public int[] f15947K;

    /* renamed from: O */
    private Integer f15948O;

    /* renamed from: P */
    private Integer f15949P;

    /* renamed from: Q */
    private String f15950Q;

    /* renamed from: R */
    private Long f15951R;

    /* renamed from: a */
    public Integer f15952a;

    /* renamed from: b */
    public C4308ct[] f15953b;

    /* renamed from: c */
    public C4314cz[] f15954c;

    /* renamed from: d */
    public Long f15955d;

    /* renamed from: e */
    public Long f15956e;

    /* renamed from: f */
    public Long f15957f;

    /* renamed from: g */
    public Long f15958g;

    /* renamed from: h */
    public Long f15959h;

    /* renamed from: i */
    public String f15960i;

    /* renamed from: j */
    public String f15961j;

    /* renamed from: k */
    public String f15962k;

    /* renamed from: l */
    public String f15963l;

    /* renamed from: m */
    public Integer f15964m;

    /* renamed from: n */
    public String f15965n;

    /* renamed from: o */
    public String f15966o;

    /* renamed from: p */
    public String f15967p;

    /* renamed from: q */
    public Long f15968q;

    /* renamed from: r */
    public Long f15969r;

    /* renamed from: s */
    public String f15970s;

    /* renamed from: t */
    public Boolean f15971t;

    /* renamed from: u */
    public String f15972u;

    /* renamed from: v */
    public Long f15973v;

    /* renamed from: w */
    public Integer f15974w;

    /* renamed from: x */
    public String f15975x;

    /* renamed from: y */
    public String f15976y;

    /* renamed from: z */
    public Boolean f15977z;

    public C4311cw() {
        this.f15952a = null;
        this.f15953b = C4308ct.m21202a();
        this.f15954c = C4314cz.m21224a();
        this.f15955d = null;
        this.f15956e = null;
        this.f15957f = null;
        this.f15958g = null;
        this.f15959h = null;
        this.f15960i = null;
        this.f15961j = null;
        this.f15962k = null;
        this.f15963l = null;
        this.f15964m = null;
        this.f15965n = null;
        this.f15966o = null;
        this.f15967p = null;
        this.f15968q = null;
        this.f15969r = null;
        this.f15970s = null;
        this.f15971t = null;
        this.f15972u = null;
        this.f15973v = null;
        this.f15974w = null;
        this.f15975x = null;
        this.f15976y = null;
        this.f15977z = null;
        this.f15937A = C4306cr.m21194a();
        this.f15938B = null;
        this.f15939C = null;
        this.f15948O = null;
        this.f15949P = null;
        this.f15940D = null;
        this.f15941E = null;
        this.f15942F = null;
        this.f15943G = null;
        this.f15950Q = null;
        this.f15944H = null;
        this.f15945I = null;
        this.f15946J = null;
        this.f15947K = C4486iz.f16329a;
        this.f15951R = null;
        this.f16310L = null;
        this.f16326M = -1;
    }

    /* renamed from: a */
    public static C4311cw[] m21213a() {
        if (f15936N == null) {
            synchronized (C4482iv.f16324b) {
                if (f15936N == null) {
                    f15936N = new C4311cw[0];
                }
            }
        }
        return f15936N;
    }

    /* renamed from: a */
    public final /* synthetic */ C4483iw mo14223a(C4475io ioVar) {
        while (true) {
            int a = ioVar.mo14707a();
            switch (a) {
                case 0:
                    return this;
                case 8:
                    this.f15952a = Integer.valueOf(ioVar.mo14718d());
                    break;
                case 18:
                    int a2 = C4486iz.m22281a(ioVar, 18);
                    int length = this.f15953b == null ? 0 : this.f15953b.length;
                    C4308ct[] ctVarArr = new C4308ct[(a2 + length)];
                    if (length != 0) {
                        System.arraycopy(this.f15953b, 0, ctVarArr, 0, length);
                    }
                    while (length < ctVarArr.length - 1) {
                        ctVarArr[length] = new C4308ct();
                        ioVar.mo14710a((C4483iw) ctVarArr[length]);
                        ioVar.mo14707a();
                        length++;
                    }
                    ctVarArr[length] = new C4308ct();
                    ioVar.mo14710a((C4483iw) ctVarArr[length]);
                    this.f15953b = ctVarArr;
                    break;
                case 26:
                    int a3 = C4486iz.m22281a(ioVar, 26);
                    int length2 = this.f15954c == null ? 0 : this.f15954c.length;
                    C4314cz[] czVarArr = new C4314cz[(a3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f15954c, 0, czVarArr, 0, length2);
                    }
                    while (length2 < czVarArr.length - 1) {
                        czVarArr[length2] = new C4314cz();
                        ioVar.mo14710a((C4483iw) czVarArr[length2]);
                        ioVar.mo14707a();
                        length2++;
                    }
                    czVarArr[length2] = new C4314cz();
                    ioVar.mo14710a((C4483iw) czVarArr[length2]);
                    this.f15954c = czVarArr;
                    break;
                case 32:
                    this.f15955d = Long.valueOf(ioVar.mo14720e());
                    break;
                case 40:
                    this.f15956e = Long.valueOf(ioVar.mo14720e());
                    break;
                case 48:
                    this.f15957f = Long.valueOf(ioVar.mo14720e());
                    break;
                case 56:
                    this.f15959h = Long.valueOf(ioVar.mo14720e());
                    break;
                case 66:
                    this.f15960i = ioVar.mo14717c();
                    break;
                case 74:
                    this.f15961j = ioVar.mo14717c();
                    break;
                case 82:
                    this.f15962k = ioVar.mo14717c();
                    break;
                case 90:
                    this.f15963l = ioVar.mo14717c();
                    break;
                case 96:
                    this.f15964m = Integer.valueOf(ioVar.mo14718d());
                    break;
                case 106:
                    this.f15965n = ioVar.mo14717c();
                    break;
                case 114:
                    this.f15966o = ioVar.mo14717c();
                    break;
                case 130:
                    this.f15967p = ioVar.mo14717c();
                    break;
                case 136:
                    this.f15968q = Long.valueOf(ioVar.mo14720e());
                    break;
                case 144:
                    this.f15969r = Long.valueOf(ioVar.mo14720e());
                    break;
                case 154:
                    this.f15970s = ioVar.mo14717c();
                    break;
                case 160:
                    this.f15971t = Boolean.valueOf(ioVar.mo14714b());
                    break;
                case 170:
                    this.f15972u = ioVar.mo14717c();
                    break;
                case 176:
                    this.f15973v = Long.valueOf(ioVar.mo14720e());
                    break;
                case 184:
                    this.f15974w = Integer.valueOf(ioVar.mo14718d());
                    break;
                case 194:
                    this.f15975x = ioVar.mo14717c();
                    break;
                case 202:
                    this.f15976y = ioVar.mo14717c();
                    break;
                case 208:
                    this.f15958g = Long.valueOf(ioVar.mo14720e());
                    break;
                case 224:
                    this.f15977z = Boolean.valueOf(ioVar.mo14714b());
                    break;
                case 234:
                    int a4 = C4486iz.m22281a(ioVar, 234);
                    int length3 = this.f15937A == null ? 0 : this.f15937A.length;
                    C4306cr[] crVarArr = new C4306cr[(a4 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f15937A, 0, crVarArr, 0, length3);
                    }
                    while (length3 < crVarArr.length - 1) {
                        crVarArr[length3] = new C4306cr();
                        ioVar.mo14710a((C4483iw) crVarArr[length3]);
                        ioVar.mo14707a();
                        length3++;
                    }
                    crVarArr[length3] = new C4306cr();
                    ioVar.mo14710a((C4483iw) crVarArr[length3]);
                    this.f15937A = crVarArr;
                    break;
                case 242:
                    this.f15938B = ioVar.mo14717c();
                    break;
                case 248:
                    this.f15939C = Integer.valueOf(ioVar.mo14718d());
                    break;
                case 256:
                    this.f15948O = Integer.valueOf(ioVar.mo14718d());
                    break;
                case 264:
                    this.f15949P = Integer.valueOf(ioVar.mo14718d());
                    break;
                case 274:
                    this.f15940D = ioVar.mo14717c();
                    break;
                case 280:
                    this.f15941E = Long.valueOf(ioVar.mo14720e());
                    break;
                case 288:
                    this.f15942F = Long.valueOf(ioVar.mo14720e());
                    break;
                case 298:
                    this.f15943G = ioVar.mo14717c();
                    break;
                case 306:
                    this.f15950Q = ioVar.mo14717c();
                    break;
                case 312:
                    this.f15944H = Integer.valueOf(ioVar.mo14718d());
                    break;
                case 330:
                    this.f15945I = ioVar.mo14717c();
                    break;
                case 354:
                    zzb zzb = (zzb) ioVar.mo14708a(zzb.m22401b());
                    if (this.f15946J != null) {
                        zzb = (zzb) ((C4383fm) ((C4507a) ((C4507a) this.f15946J.mo14496g()).mo14304a(zzb)).mo14508g());
                    }
                    this.f15946J = zzb;
                    break;
                case 360:
                    int a5 = C4486iz.m22281a(ioVar, 360);
                    int length4 = this.f15947K == null ? 0 : this.f15947K.length;
                    int[] iArr = new int[(a5 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.f15947K, 0, iArr, 0, length4);
                    }
                    while (length4 < iArr.length - 1) {
                        iArr[length4] = ioVar.mo14718d();
                        ioVar.mo14707a();
                        length4++;
                    }
                    iArr[length4] = ioVar.mo14718d();
                    this.f15947K = iArr;
                    break;
                case 362:
                    int c = ioVar.mo14716c(ioVar.mo14718d());
                    int i = ioVar.mo14725i();
                    int i2 = 0;
                    while (ioVar.mo14724h() > 0) {
                        ioVar.mo14718d();
                        i2++;
                    }
                    ioVar.mo14721e(i);
                    int length5 = this.f15947K == null ? 0 : this.f15947K.length;
                    int[] iArr2 = new int[(i2 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.f15947K, 0, iArr2, 0, length5);
                    }
                    while (length5 < iArr2.length) {
                        iArr2[length5] = ioVar.mo14718d();
                        length5++;
                    }
                    this.f15947K = iArr2;
                    ioVar.mo14719d(c);
                    break;
                case 368:
                    this.f15951R = Long.valueOf(ioVar.mo14720e());
                    break;
                default:
                    if (super.mo14761a(ioVar, a)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo14224a(C4477iq iqVar) {
        if (this.f15952a != null) {
            iqVar.mo14750a(1, this.f15952a.intValue());
        }
        if (this.f15953b != null && this.f15953b.length > 0) {
            for (C4308ct ctVar : this.f15953b) {
                if (ctVar != null) {
                    iqVar.mo14753a(2, (C4483iw) ctVar);
                }
            }
        }
        if (this.f15954c != null && this.f15954c.length > 0) {
            for (C4314cz czVar : this.f15954c) {
                if (czVar != null) {
                    iqVar.mo14753a(3, (C4483iw) czVar);
                }
            }
        }
        if (this.f15955d != null) {
            iqVar.mo14757b(4, this.f15955d.longValue());
        }
        if (this.f15956e != null) {
            iqVar.mo14757b(5, this.f15956e.longValue());
        }
        if (this.f15957f != null) {
            iqVar.mo14757b(6, this.f15957f.longValue());
        }
        if (this.f15959h != null) {
            iqVar.mo14757b(7, this.f15959h.longValue());
        }
        if (this.f15960i != null) {
            iqVar.mo14754a(8, this.f15960i);
        }
        if (this.f15961j != null) {
            iqVar.mo14754a(9, this.f15961j);
        }
        if (this.f15962k != null) {
            iqVar.mo14754a(10, this.f15962k);
        }
        if (this.f15963l != null) {
            iqVar.mo14754a(11, this.f15963l);
        }
        if (this.f15964m != null) {
            iqVar.mo14750a(12, this.f15964m.intValue());
        }
        if (this.f15965n != null) {
            iqVar.mo14754a(13, this.f15965n);
        }
        if (this.f15966o != null) {
            iqVar.mo14754a(14, this.f15966o);
        }
        if (this.f15967p != null) {
            iqVar.mo14754a(16, this.f15967p);
        }
        if (this.f15968q != null) {
            iqVar.mo14757b(17, this.f15968q.longValue());
        }
        if (this.f15969r != null) {
            iqVar.mo14757b(18, this.f15969r.longValue());
        }
        if (this.f15970s != null) {
            iqVar.mo14754a(19, this.f15970s);
        }
        if (this.f15971t != null) {
            iqVar.mo14755a(20, this.f15971t.booleanValue());
        }
        if (this.f15972u != null) {
            iqVar.mo14754a(21, this.f15972u);
        }
        if (this.f15973v != null) {
            iqVar.mo14757b(22, this.f15973v.longValue());
        }
        if (this.f15974w != null) {
            iqVar.mo14750a(23, this.f15974w.intValue());
        }
        if (this.f15975x != null) {
            iqVar.mo14754a(24, this.f15975x);
        }
        if (this.f15976y != null) {
            iqVar.mo14754a(25, this.f15976y);
        }
        if (this.f15958g != null) {
            iqVar.mo14757b(26, this.f15958g.longValue());
        }
        if (this.f15977z != null) {
            iqVar.mo14755a(28, this.f15977z.booleanValue());
        }
        if (this.f15937A != null && this.f15937A.length > 0) {
            for (C4306cr crVar : this.f15937A) {
                if (crVar != null) {
                    iqVar.mo14753a(29, (C4483iw) crVar);
                }
            }
        }
        if (this.f15938B != null) {
            iqVar.mo14754a(30, this.f15938B);
        }
        if (this.f15939C != null) {
            iqVar.mo14750a(31, this.f15939C.intValue());
        }
        if (this.f15948O != null) {
            iqVar.mo14750a(32, this.f15948O.intValue());
        }
        if (this.f15949P != null) {
            iqVar.mo14750a(33, this.f15949P.intValue());
        }
        if (this.f15940D != null) {
            iqVar.mo14754a(34, this.f15940D);
        }
        if (this.f15941E != null) {
            iqVar.mo14757b(35, this.f15941E.longValue());
        }
        if (this.f15942F != null) {
            iqVar.mo14757b(36, this.f15942F.longValue());
        }
        if (this.f15943G != null) {
            iqVar.mo14754a(37, this.f15943G);
        }
        if (this.f15950Q != null) {
            iqVar.mo14754a(38, this.f15950Q);
        }
        if (this.f15944H != null) {
            iqVar.mo14750a(39, this.f15944H.intValue());
        }
        if (this.f15945I != null) {
            iqVar.mo14754a(41, this.f15945I);
        }
        if (this.f15946J != null) {
            iqVar.mo14752a(44, (C4419gq) this.f15946J);
        }
        if (this.f15947K != null && this.f15947K.length > 0) {
            for (int i : this.f15947K) {
                iqVar.mo14760c(45, 0);
                iqVar.mo14759c(i);
            }
        }
        if (this.f15951R != null) {
            iqVar.mo14757b(46, this.f15951R.longValue());
        }
        super.mo14224a(iqVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo14225b() {
        int b = super.mo14225b();
        if (this.f15952a != null) {
            b += C4477iq.m22223b(1, this.f15952a.intValue());
        }
        if (this.f15953b != null && this.f15953b.length > 0) {
            int i = b;
            for (C4308ct ctVar : this.f15953b) {
                if (ctVar != null) {
                    i += C4477iq.m22224b(2, (C4483iw) ctVar);
                }
            }
            b = i;
        }
        if (this.f15954c != null && this.f15954c.length > 0) {
            int i2 = b;
            for (C4314cz czVar : this.f15954c) {
                if (czVar != null) {
                    i2 += C4477iq.m22224b(3, (C4483iw) czVar);
                }
            }
            b = i2;
        }
        if (this.f15955d != null) {
            b += C4477iq.m22228c(4, this.f15955d.longValue());
        }
        if (this.f15956e != null) {
            b += C4477iq.m22228c(5, this.f15956e.longValue());
        }
        if (this.f15957f != null) {
            b += C4477iq.m22228c(6, this.f15957f.longValue());
        }
        if (this.f15959h != null) {
            b += C4477iq.m22228c(7, this.f15959h.longValue());
        }
        if (this.f15960i != null) {
            b += C4477iq.m22225b(8, this.f15960i);
        }
        if (this.f15961j != null) {
            b += C4477iq.m22225b(9, this.f15961j);
        }
        if (this.f15962k != null) {
            b += C4477iq.m22225b(10, this.f15962k);
        }
        if (this.f15963l != null) {
            b += C4477iq.m22225b(11, this.f15963l);
        }
        if (this.f15964m != null) {
            b += C4477iq.m22223b(12, this.f15964m.intValue());
        }
        if (this.f15965n != null) {
            b += C4477iq.m22225b(13, this.f15965n);
        }
        if (this.f15966o != null) {
            b += C4477iq.m22225b(14, this.f15966o);
        }
        if (this.f15967p != null) {
            b += C4477iq.m22225b(16, this.f15967p);
        }
        if (this.f15968q != null) {
            b += C4477iq.m22228c(17, this.f15968q.longValue());
        }
        if (this.f15969r != null) {
            b += C4477iq.m22228c(18, this.f15969r.longValue());
        }
        if (this.f15970s != null) {
            b += C4477iq.m22225b(19, this.f15970s);
        }
        if (this.f15971t != null) {
            this.f15971t.booleanValue();
            b += C4477iq.m22222b(20) + 1;
        }
        if (this.f15972u != null) {
            b += C4477iq.m22225b(21, this.f15972u);
        }
        if (this.f15973v != null) {
            b += C4477iq.m22228c(22, this.f15973v.longValue());
        }
        if (this.f15974w != null) {
            b += C4477iq.m22223b(23, this.f15974w.intValue());
        }
        if (this.f15975x != null) {
            b += C4477iq.m22225b(24, this.f15975x);
        }
        if (this.f15976y != null) {
            b += C4477iq.m22225b(25, this.f15976y);
        }
        if (this.f15958g != null) {
            b += C4477iq.m22228c(26, this.f15958g.longValue());
        }
        if (this.f15977z != null) {
            this.f15977z.booleanValue();
            b += C4477iq.m22222b(28) + 1;
        }
        if (this.f15937A != null && this.f15937A.length > 0) {
            int i3 = b;
            for (C4306cr crVar : this.f15937A) {
                if (crVar != null) {
                    i3 += C4477iq.m22224b(29, (C4483iw) crVar);
                }
            }
            b = i3;
        }
        if (this.f15938B != null) {
            b += C4477iq.m22225b(30, this.f15938B);
        }
        if (this.f15939C != null) {
            b += C4477iq.m22223b(31, this.f15939C.intValue());
        }
        if (this.f15948O != null) {
            b += C4477iq.m22223b(32, this.f15948O.intValue());
        }
        if (this.f15949P != null) {
            b += C4477iq.m22223b(33, this.f15949P.intValue());
        }
        if (this.f15940D != null) {
            b += C4477iq.m22225b(34, this.f15940D);
        }
        if (this.f15941E != null) {
            b += C4477iq.m22228c(35, this.f15941E.longValue());
        }
        if (this.f15942F != null) {
            b += C4477iq.m22228c(36, this.f15942F.longValue());
        }
        if (this.f15943G != null) {
            b += C4477iq.m22225b(37, this.f15943G);
        }
        if (this.f15950Q != null) {
            b += C4477iq.m22225b(38, this.f15950Q);
        }
        if (this.f15944H != null) {
            b += C4477iq.m22223b(39, this.f15944H.intValue());
        }
        if (this.f15945I != null) {
            b += C4477iq.m22225b(41, this.f15945I);
        }
        if (this.f15946J != null) {
            b += zztv.m22424c(44, (C4419gq) this.f15946J);
        }
        if (this.f15947K != null && this.f15947K.length > 0) {
            int i4 = 0;
            for (int d : this.f15947K) {
                i4 += C4477iq.m22229d(d);
            }
            b = b + i4 + (this.f15947K.length * 2);
        }
        return this.f15951R != null ? b + C4477iq.m22228c(46, this.f15951R.longValue()) : b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4311cw)) {
            return false;
        }
        C4311cw cwVar = (C4311cw) obj;
        if (this.f15952a == null) {
            if (cwVar.f15952a != null) {
                return false;
            }
        } else if (!this.f15952a.equals(cwVar.f15952a)) {
            return false;
        }
        if (!C4482iv.m22271a((Object[]) this.f15953b, (Object[]) cwVar.f15953b) || !C4482iv.m22271a((Object[]) this.f15954c, (Object[]) cwVar.f15954c)) {
            return false;
        }
        if (this.f15955d == null) {
            if (cwVar.f15955d != null) {
                return false;
            }
        } else if (!this.f15955d.equals(cwVar.f15955d)) {
            return false;
        }
        if (this.f15956e == null) {
            if (cwVar.f15956e != null) {
                return false;
            }
        } else if (!this.f15956e.equals(cwVar.f15956e)) {
            return false;
        }
        if (this.f15957f == null) {
            if (cwVar.f15957f != null) {
                return false;
            }
        } else if (!this.f15957f.equals(cwVar.f15957f)) {
            return false;
        }
        if (this.f15958g == null) {
            if (cwVar.f15958g != null) {
                return false;
            }
        } else if (!this.f15958g.equals(cwVar.f15958g)) {
            return false;
        }
        if (this.f15959h == null) {
            if (cwVar.f15959h != null) {
                return false;
            }
        } else if (!this.f15959h.equals(cwVar.f15959h)) {
            return false;
        }
        if (this.f15960i == null) {
            if (cwVar.f15960i != null) {
                return false;
            }
        } else if (!this.f15960i.equals(cwVar.f15960i)) {
            return false;
        }
        if (this.f15961j == null) {
            if (cwVar.f15961j != null) {
                return false;
            }
        } else if (!this.f15961j.equals(cwVar.f15961j)) {
            return false;
        }
        if (this.f15962k == null) {
            if (cwVar.f15962k != null) {
                return false;
            }
        } else if (!this.f15962k.equals(cwVar.f15962k)) {
            return false;
        }
        if (this.f15963l == null) {
            if (cwVar.f15963l != null) {
                return false;
            }
        } else if (!this.f15963l.equals(cwVar.f15963l)) {
            return false;
        }
        if (this.f15964m == null) {
            if (cwVar.f15964m != null) {
                return false;
            }
        } else if (!this.f15964m.equals(cwVar.f15964m)) {
            return false;
        }
        if (this.f15965n == null) {
            if (cwVar.f15965n != null) {
                return false;
            }
        } else if (!this.f15965n.equals(cwVar.f15965n)) {
            return false;
        }
        if (this.f15966o == null) {
            if (cwVar.f15966o != null) {
                return false;
            }
        } else if (!this.f15966o.equals(cwVar.f15966o)) {
            return false;
        }
        if (this.f15967p == null) {
            if (cwVar.f15967p != null) {
                return false;
            }
        } else if (!this.f15967p.equals(cwVar.f15967p)) {
            return false;
        }
        if (this.f15968q == null) {
            if (cwVar.f15968q != null) {
                return false;
            }
        } else if (!this.f15968q.equals(cwVar.f15968q)) {
            return false;
        }
        if (this.f15969r == null) {
            if (cwVar.f15969r != null) {
                return false;
            }
        } else if (!this.f15969r.equals(cwVar.f15969r)) {
            return false;
        }
        if (this.f15970s == null) {
            if (cwVar.f15970s != null) {
                return false;
            }
        } else if (!this.f15970s.equals(cwVar.f15970s)) {
            return false;
        }
        if (this.f15971t == null) {
            if (cwVar.f15971t != null) {
                return false;
            }
        } else if (!this.f15971t.equals(cwVar.f15971t)) {
            return false;
        }
        if (this.f15972u == null) {
            if (cwVar.f15972u != null) {
                return false;
            }
        } else if (!this.f15972u.equals(cwVar.f15972u)) {
            return false;
        }
        if (this.f15973v == null) {
            if (cwVar.f15973v != null) {
                return false;
            }
        } else if (!this.f15973v.equals(cwVar.f15973v)) {
            return false;
        }
        if (this.f15974w == null) {
            if (cwVar.f15974w != null) {
                return false;
            }
        } else if (!this.f15974w.equals(cwVar.f15974w)) {
            return false;
        }
        if (this.f15975x == null) {
            if (cwVar.f15975x != null) {
                return false;
            }
        } else if (!this.f15975x.equals(cwVar.f15975x)) {
            return false;
        }
        if (this.f15976y == null) {
            if (cwVar.f15976y != null) {
                return false;
            }
        } else if (!this.f15976y.equals(cwVar.f15976y)) {
            return false;
        }
        if (this.f15977z == null) {
            if (cwVar.f15977z != null) {
                return false;
            }
        } else if (!this.f15977z.equals(cwVar.f15977z)) {
            return false;
        }
        if (!C4482iv.m22271a((Object[]) this.f15937A, (Object[]) cwVar.f15937A)) {
            return false;
        }
        if (this.f15938B == null) {
            if (cwVar.f15938B != null) {
                return false;
            }
        } else if (!this.f15938B.equals(cwVar.f15938B)) {
            return false;
        }
        if (this.f15939C == null) {
            if (cwVar.f15939C != null) {
                return false;
            }
        } else if (!this.f15939C.equals(cwVar.f15939C)) {
            return false;
        }
        if (this.f15948O == null) {
            if (cwVar.f15948O != null) {
                return false;
            }
        } else if (!this.f15948O.equals(cwVar.f15948O)) {
            return false;
        }
        if (this.f15949P == null) {
            if (cwVar.f15949P != null) {
                return false;
            }
        } else if (!this.f15949P.equals(cwVar.f15949P)) {
            return false;
        }
        if (this.f15940D == null) {
            if (cwVar.f15940D != null) {
                return false;
            }
        } else if (!this.f15940D.equals(cwVar.f15940D)) {
            return false;
        }
        if (this.f15941E == null) {
            if (cwVar.f15941E != null) {
                return false;
            }
        } else if (!this.f15941E.equals(cwVar.f15941E)) {
            return false;
        }
        if (this.f15942F == null) {
            if (cwVar.f15942F != null) {
                return false;
            }
        } else if (!this.f15942F.equals(cwVar.f15942F)) {
            return false;
        }
        if (this.f15943G == null) {
            if (cwVar.f15943G != null) {
                return false;
            }
        } else if (!this.f15943G.equals(cwVar.f15943G)) {
            return false;
        }
        if (this.f15950Q == null) {
            if (cwVar.f15950Q != null) {
                return false;
            }
        } else if (!this.f15950Q.equals(cwVar.f15950Q)) {
            return false;
        }
        if (this.f15944H == null) {
            if (cwVar.f15944H != null) {
                return false;
            }
        } else if (!this.f15944H.equals(cwVar.f15944H)) {
            return false;
        }
        if (this.f15945I == null) {
            if (cwVar.f15945I != null) {
                return false;
            }
        } else if (!this.f15945I.equals(cwVar.f15945I)) {
            return false;
        }
        if (this.f15946J == null) {
            if (cwVar.f15946J != null) {
                return false;
            }
        } else if (!this.f15946J.equals(cwVar.f15946J)) {
            return false;
        }
        if (!C4482iv.m22269a(this.f15947K, cwVar.f15947K)) {
            return false;
        }
        if (this.f15951R == null) {
            if (cwVar.f15951R != null) {
                return false;
            }
        } else if (!this.f15951R.equals(cwVar.f15951R)) {
            return false;
        }
        return (this.f16310L == null || this.f16310L.mo14773b()) ? cwVar.f16310L == null || cwVar.f16310L.mo14773b() : this.f16310L.equals(cwVar.f16310L);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f15952a == null ? 0 : this.f15952a.hashCode())) * 31) + C4482iv.m22267a((Object[]) this.f15953b)) * 31) + C4482iv.m22267a((Object[]) this.f15954c)) * 31) + (this.f15955d == null ? 0 : this.f15955d.hashCode())) * 31) + (this.f15956e == null ? 0 : this.f15956e.hashCode())) * 31) + (this.f15957f == null ? 0 : this.f15957f.hashCode())) * 31) + (this.f15958g == null ? 0 : this.f15958g.hashCode())) * 31) + (this.f15959h == null ? 0 : this.f15959h.hashCode())) * 31) + (this.f15960i == null ? 0 : this.f15960i.hashCode())) * 31) + (this.f15961j == null ? 0 : this.f15961j.hashCode())) * 31) + (this.f15962k == null ? 0 : this.f15962k.hashCode())) * 31) + (this.f15963l == null ? 0 : this.f15963l.hashCode())) * 31) + (this.f15964m == null ? 0 : this.f15964m.hashCode())) * 31) + (this.f15965n == null ? 0 : this.f15965n.hashCode())) * 31) + (this.f15966o == null ? 0 : this.f15966o.hashCode())) * 31) + (this.f15967p == null ? 0 : this.f15967p.hashCode())) * 31) + (this.f15968q == null ? 0 : this.f15968q.hashCode())) * 31) + (this.f15969r == null ? 0 : this.f15969r.hashCode())) * 31) + (this.f15970s == null ? 0 : this.f15970s.hashCode())) * 31) + (this.f15971t == null ? 0 : this.f15971t.hashCode())) * 31) + (this.f15972u == null ? 0 : this.f15972u.hashCode())) * 31) + (this.f15973v == null ? 0 : this.f15973v.hashCode())) * 31) + (this.f15974w == null ? 0 : this.f15974w.hashCode())) * 31) + (this.f15975x == null ? 0 : this.f15975x.hashCode())) * 31) + (this.f15976y == null ? 0 : this.f15976y.hashCode())) * 31) + (this.f15977z == null ? 0 : this.f15977z.hashCode())) * 31) + C4482iv.m22267a((Object[]) this.f15937A)) * 31) + (this.f15938B == null ? 0 : this.f15938B.hashCode())) * 31) + (this.f15939C == null ? 0 : this.f15939C.hashCode())) * 31) + (this.f15948O == null ? 0 : this.f15948O.hashCode())) * 31) + (this.f15949P == null ? 0 : this.f15949P.hashCode())) * 31) + (this.f15940D == null ? 0 : this.f15940D.hashCode())) * 31) + (this.f15941E == null ? 0 : this.f15941E.hashCode())) * 31) + (this.f15942F == null ? 0 : this.f15942F.hashCode())) * 31) + (this.f15943G == null ? 0 : this.f15943G.hashCode())) * 31) + (this.f15950Q == null ? 0 : this.f15950Q.hashCode())) * 31) + (this.f15944H == null ? 0 : this.f15944H.hashCode())) * 31) + (this.f15945I == null ? 0 : this.f15945I.hashCode());
        zzb zzb = this.f15946J;
        int hashCode2 = ((((((hashCode * 31) + (zzb == null ? 0 : zzb.hashCode())) * 31) + C4482iv.m22265a(this.f15947K)) * 31) + (this.f15951R == null ? 0 : this.f15951R.hashCode())) * 31;
        if (this.f16310L != null && !this.f16310L.mo14773b()) {
            i = this.f16310L.hashCode();
        }
        return hashCode2 + i;
    }
}
