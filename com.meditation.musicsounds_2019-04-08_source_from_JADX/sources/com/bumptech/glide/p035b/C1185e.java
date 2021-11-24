package com.bumptech.glide.p035b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p035b.C1180a.C1181a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.b.e */
public class C1185e implements C1180a {

    /* renamed from: a */
    private static final String f4298a = "e";

    /* renamed from: b */
    private int[] f4299b;

    /* renamed from: c */
    private final int[] f4300c;

    /* renamed from: d */
    private final C1181a f4301d;

    /* renamed from: e */
    private ByteBuffer f4302e;

    /* renamed from: f */
    private byte[] f4303f;

    /* renamed from: g */
    private short[] f4304g;

    /* renamed from: h */
    private byte[] f4305h;

    /* renamed from: i */
    private byte[] f4306i;

    /* renamed from: j */
    private byte[] f4307j;

    /* renamed from: k */
    private int[] f4308k;

    /* renamed from: l */
    private int f4309l;

    /* renamed from: m */
    private C1183c f4310m;

    /* renamed from: n */
    private Bitmap f4311n;

    /* renamed from: o */
    private boolean f4312o;

    /* renamed from: p */
    private int f4313p;

    /* renamed from: q */
    private int f4314q;

    /* renamed from: r */
    private int f4315r;

    /* renamed from: s */
    private int f4316s;

    /* renamed from: t */
    private Boolean f4317t;

    /* renamed from: u */
    private Config f4318u;

    public C1185e(C1181a aVar) {
        this.f4300c = new int[256];
        this.f4318u = Config.ARGB_8888;
        this.f4301d = aVar;
        this.f4310m = new C1183c();
    }

    public C1185e(C1181a aVar, C1183c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo5734a(cVar, byteBuffer, i);
    }

    /* renamed from: a */
    private int m6430a(int i, int i2, int i3) {
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i4 < this.f4314q + i && i4 < this.f4307j.length && i4 < i2) {
            int i10 = this.f4299b[this.f4307j[i4] & 255];
            if (i10 != 0) {
                i5 += (i10 >> 24) & 255;
                i6 += (i10 >> 16) & 255;
                i7 += (i10 >> 8) & 255;
                i8 += i10 & 255;
                i9++;
            }
            i4++;
        }
        int i11 = i + i3;
        int i12 = i11;
        while (i12 < this.f4314q + i11 && i12 < this.f4307j.length && i12 < i2) {
            int i13 = this.f4299b[this.f4307j[i12] & 255];
            if (i13 != 0) {
                i5 += (i13 >> 24) & 255;
                i6 += (i13 >> 16) & 255;
                i7 += (i13 >> 8) & 255;
                i8 += i13 & 255;
                i9++;
            }
            i12++;
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    /* renamed from: a */
    private Bitmap m6431a(C1182b bVar, C1182b bVar2) {
        int[] iArr = this.f4308k;
        int i = 0;
        if (bVar2 == null) {
            if (this.f4311n != null) {
                this.f4301d.mo5721a(this.f4311n);
            }
            this.f4311n = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f4276g == 3 && this.f4311n == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f4276g > 0) {
            if (bVar2.f4276g == 2) {
                if (!bVar.f4275f) {
                    int i2 = this.f4310m.f4292l;
                    if (bVar.f4280k == null || this.f4310m.f4290j != bVar.f4277h) {
                        i = i2;
                    }
                } else if (this.f4309l == 0) {
                    this.f4317t = Boolean.valueOf(true);
                }
                int i3 = bVar2.f4273d / this.f4314q;
                int i4 = bVar2.f4271b / this.f4314q;
                int i5 = bVar2.f4272c / this.f4314q;
                int i6 = (i4 * this.f4316s) + (bVar2.f4270a / this.f4314q);
                int i7 = (i3 * this.f4316s) + i6;
                while (i6 < i7) {
                    int i8 = i6 + i5;
                    for (int i9 = i6; i9 < i8; i9++) {
                        iArr[i9] = i;
                    }
                    i6 += this.f4316s;
                }
            } else if (bVar2.f4276g == 3 && this.f4311n != null) {
                this.f4311n.getPixels(iArr, 0, this.f4316s, 0, 0, this.f4316s, this.f4315r);
            }
        }
        m6434c(bVar);
        if (bVar.f4274e || this.f4314q != 1) {
            m6433b(bVar);
        } else {
            m6432a(bVar);
        }
        if (this.f4312o && (bVar.f4276g == 0 || bVar.f4276g == 1)) {
            if (this.f4311n == null) {
                this.f4311n = m6437l();
            }
            this.f4311n.setPixels(iArr, 0, this.f4316s, 0, 0, this.f4316s, this.f4315r);
        }
        Bitmap l = m6437l();
        l.setPixels(iArr, 0, this.f4316s, 0, 0, this.f4316s, this.f4315r);
        return l;
    }

    /* renamed from: a */
    private void m6432a(C1182b bVar) {
        C1182b bVar2 = bVar;
        int[] iArr = this.f4308k;
        int i = bVar2.f4273d;
        int i2 = bVar2.f4271b;
        int i3 = bVar2.f4272c;
        int i4 = bVar2.f4270a;
        boolean z = this.f4309l == 0;
        int i5 = this.f4316s;
        byte[] bArr = this.f4307j;
        int[] iArr2 = this.f4299b;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            byte b2 = b;
            int i11 = bVar2.f4272c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b3 = bArr[i11];
                int i13 = i;
                byte b4 = b3 & 255;
                if (b4 != b2) {
                    int i14 = iArr2[b4];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b2 = b3;
                    }
                }
                i11++;
                i12++;
                i = i13;
                C1182b bVar3 = bVar;
            }
            int i15 = i;
            i6++;
            b = b2;
            bVar2 = bVar;
        }
        this.f4317t = Boolean.valueOf(this.f4317t == null && z && b != -1);
    }

    /* renamed from: b */
    private void m6433b(C1182b bVar) {
        int i;
        int i2;
        int i3;
        C1182b bVar2 = bVar;
        int[] iArr = this.f4308k;
        int i4 = bVar2.f4273d / this.f4314q;
        int i5 = bVar2.f4271b / this.f4314q;
        int i6 = bVar2.f4272c / this.f4314q;
        int i7 = bVar2.f4270a / this.f4314q;
        boolean z = this.f4309l == 0;
        int i8 = this.f4314q;
        int i9 = this.f4316s;
        int i10 = this.f4315r;
        byte[] bArr = this.f4307j;
        int[] iArr2 = this.f4299b;
        Boolean bool = this.f4317t;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        int i14 = 8;
        while (i12 < i4) {
            if (bVar2.f4274e) {
                if (i11 >= i4) {
                    i13++;
                    switch (i13) {
                        case 2:
                            i11 = 4;
                            break;
                        case 3:
                            i11 = 2;
                            i14 = 4;
                            break;
                        case 4:
                            i11 = 1;
                            i14 = 2;
                            break;
                    }
                }
                i = i11 + i14;
            } else {
                i = i11;
                i11 = i12;
            }
            int i15 = i11 + i5;
            int i16 = i4;
            boolean z2 = i8 == 1;
            if (i15 < i10) {
                int i17 = i15 * i9;
                int i18 = i17 + i7;
                i3 = i5;
                int i19 = i18 + i6;
                int i20 = i17 + i9;
                if (i20 < i19) {
                    i19 = i20;
                }
                i2 = i6;
                int i21 = i12 * i8 * bVar2.f4272c;
                if (z2) {
                    for (int i22 = i18; i22 < i19; i22++) {
                        int i23 = iArr2[bArr[i21] & 255];
                        if (i23 != 0) {
                            iArr[i22] = i23;
                        } else if (z && bool == null) {
                            bool = Boolean.valueOf(true);
                        }
                        i21 += i8;
                    }
                } else {
                    int i24 = ((i19 - i18) * i8) + i21;
                    int i25 = i18;
                    while (i25 < i19) {
                        int i26 = i19;
                        int a = m6430a(i21, i24, bVar2.f4272c);
                        if (a != 0) {
                            iArr[i25] = a;
                        } else if (z && bool == null) {
                            bool = Boolean.valueOf(true);
                            i21 += i8;
                            i25++;
                            i19 = i26;
                        }
                        i21 += i8;
                        i25++;
                        i19 = i26;
                    }
                }
            } else {
                i3 = i5;
                i2 = i6;
            }
            i12++;
            i11 = i;
            i4 = i16;
            i5 = i3;
            i6 = i2;
        }
        if (this.f4317t == null) {
            this.f4317t = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [short[]] */
    /* JADX WARNING: type inference failed for: r22v0 */
    /* JADX WARNING: type inference failed for: r22v1 */
    /* JADX WARNING: type inference failed for: r28v0 */
    /* JADX WARNING: type inference failed for: r28v1 */
    /* JADX WARNING: type inference failed for: r22v2 */
    /* JADX WARNING: type inference failed for: r22v3 */
    /* JADX WARNING: type inference failed for: r18v6 */
    /* JADX WARNING: type inference failed for: r22v4 */
    /* JADX WARNING: type inference failed for: r4v15, types: [short] */
    /* JADX WARNING: type inference failed for: r4v17, types: [int] */
    /* JADX WARNING: type inference failed for: r28v3 */
    /* JADX WARNING: type inference failed for: r28v5 */
    /* JADX WARNING: type inference failed for: r22v5 */
    /* JADX WARNING: type inference failed for: r28v6 */
    /* JADX WARNING: type inference failed for: r22v6 */
    /* JADX WARNING: type inference failed for: r18v13 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r28v7 */
    /* JADX WARNING: type inference failed for: r28v8 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r4v15, types: [short] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short[], code=null, for r3v1, types: [short[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r22v3
      assigns: []
      uses: []
      mth insns count: 172
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6434c(com.bumptech.glide.p035b.C1182b r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f4302e
            int r3 = r1.f4279j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x001a
            com.bumptech.glide.b.c r1 = r0.f4310m
            int r1 = r1.f4286f
            com.bumptech.glide.b.c r2 = r0.f4310m
            int r2 = r2.f4287g
            int r1 = r1 * r2
            goto L_0x0020
        L_0x001a:
            int r2 = r1.f4272c
            int r1 = r1.f4273d
            int r1 = r1 * r2
        L_0x0020:
            byte[] r2 = r0.f4307j
            if (r2 == 0) goto L_0x0029
            byte[] r2 = r0.f4307j
            int r2 = r2.length
            if (r2 >= r1) goto L_0x0031
        L_0x0029:
            com.bumptech.glide.b.a$a r2 = r0.f4301d
            byte[] r2 = r2.mo5724a(r1)
            r0.f4307j = r2
        L_0x0031:
            byte[] r2 = r0.f4307j
            short[] r3 = r0.f4304g
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x003d
            short[] r3 = new short[r4]
            r0.f4304g = r3
        L_0x003d:
            short[] r3 = r0.f4304g
            byte[] r5 = r0.f4305h
            if (r5 != 0) goto L_0x0047
            byte[] r5 = new byte[r4]
            r0.f4305h = r5
        L_0x0047:
            byte[] r5 = r0.f4305h
            byte[] r6 = r0.f4306i
            if (r6 != 0) goto L_0x0053
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f4306i = r6
        L_0x0053:
            byte[] r6 = r0.f4306i
            int r7 = r32.m6435j()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = 0
        L_0x0066:
            if (r14 >= r9) goto L_0x0070
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x0066
        L_0x0070:
            byte[] r14 = r0.f4303f
            r15 = -1
            r26 = r7
            r24 = r11
            r25 = r12
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = -1
            r22 = 0
            r23 = 0
        L_0x0089:
            if (r13 >= r1) goto L_0x015a
            if (r16 != 0) goto L_0x009a
            int r16 = r32.m6436k()
            if (r16 > 0) goto L_0x0098
            r3 = 3
            r0.f4313p = r3
            goto L_0x015a
        L_0x0098:
            r20 = 0
        L_0x009a:
            byte r4 = r14[r20]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r20 = r20 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r28 = r22
            r27 = r24
            r18 = r17
            r17 = r13
            r13 = r26
        L_0x00b6:
            if (r4 < r13) goto L_0x0141
            r15 = r19 & r25
            int r19 = r19 >> r13
            int r4 = r4 - r13
            if (r15 != r9) goto L_0x00c7
            r13 = r7
            r27 = r11
            r25 = r12
            r8 = -1
        L_0x00c5:
            r15 = -1
            goto L_0x00b6
        L_0x00c7:
            if (r15 != r10) goto L_0x00dc
            r21 = r8
            r26 = r13
            r13 = r17
            r17 = r18
            r24 = r27
            r22 = r28
            r8 = 1
            r15 = -1
            r18 = r4
            r4 = 4096(0x1000, float:5.74E-42)
            goto L_0x0089
        L_0x00dc:
            r0 = -1
            if (r8 != r0) goto L_0x00ed
            byte r8 = r5[r15]
            r2[r18] = r8
            int r18 = r18 + 1
            int r17 = r17 + 1
            r8 = r15
            r28 = r8
        L_0x00ea:
            r0 = r32
            goto L_0x00c5
        L_0x00ed:
            r0 = r27
            if (r15 < r0) goto L_0x00fc
            r29 = r4
            r4 = r28
            byte r4 = (byte) r4
            r6[r23] = r4
            int r23 = r23 + 1
            r4 = r8
            goto L_0x00ff
        L_0x00fc:
            r29 = r4
            r4 = r15
        L_0x00ff:
            if (r4 < r9) goto L_0x010a
            byte r21 = r5[r4]
            r6[r23] = r21
            int r23 = r23 + 1
            short r4 = r3[r4]
            goto L_0x00ff
        L_0x010a:
            byte r4 = r5[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r30 = r7
            byte r7 = (byte) r4
            r2[r18] = r7
        L_0x0113:
            int r18 = r18 + 1
            int r17 = r17 + 1
            if (r23 <= 0) goto L_0x0120
            int r23 = r23 + -1
            byte r21 = r6[r23]
            r2[r18] = r21
            goto L_0x0113
        L_0x0120:
            r31 = r4
            r4 = 4096(0x1000, float:5.74E-42)
            if (r0 >= r4) goto L_0x0137
            short r8 = (short) r8
            r3[r0] = r8
            r5[r0] = r7
            int r0 = r0 + 1
            r7 = r0 & r25
            if (r7 != 0) goto L_0x0137
            if (r0 >= r4) goto L_0x0137
            int r13 = r13 + 1
            int r25 = r25 + r0
        L_0x0137:
            r27 = r0
            r8 = r15
            r4 = r29
            r7 = r30
            r28 = r31
            goto L_0x00ea
        L_0x0141:
            r29 = r4
            r0 = r27
            r24 = r0
            r21 = r8
            r26 = r13
            r13 = r17
            r17 = r18
            r22 = r28
            r18 = r29
            r0 = r32
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            goto L_0x0089
        L_0x015a:
            r13 = r17
            r0 = 0
            java.util.Arrays.fill(r2, r13, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p035b.C1185e.m6434c(com.bumptech.glide.b.b):void");
    }

    /* renamed from: j */
    private int m6435j() {
        return this.f4302e.get() & 255;
    }

    /* renamed from: k */
    private int m6436k() {
        int j = m6435j();
        if (j <= 0) {
            return j;
        }
        this.f4302e.get(this.f4303f, 0, Math.min(j, this.f4302e.remaining()));
        return j;
    }

    /* renamed from: l */
    private Bitmap m6437l() {
        Bitmap a = this.f4301d.mo5720a(this.f4316s, this.f4315r, (this.f4317t == null || this.f4317t.booleanValue()) ? Config.ARGB_8888 : this.f4318u);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: a */
    public int mo5733a(int i) {
        if (i < 0 || i >= this.f4310m.f4283c) {
            return -1;
        }
        return ((C1182b) this.f4310m.f4285e.get(i)).f4278i;
    }

    /* renamed from: a */
    public ByteBuffer mo5710a() {
        return this.f4302e;
    }

    /* renamed from: a */
    public void mo5711a(Config config) {
        if (config == Config.ARGB_8888 || config == Config.RGB_565) {
            this.f4318u = config;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported format: ");
        sb.append(config);
        sb.append(", must be one of ");
        sb.append(Config.ARGB_8888);
        sb.append(" or ");
        sb.append(Config.RGB_565);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public synchronized void mo5734a(C1183c cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f4313p = 0;
            this.f4310m = cVar;
            this.f4309l = -1;
            this.f4302e = byteBuffer.asReadOnlyBuffer();
            this.f4302e.position(0);
            this.f4302e.order(ByteOrder.LITTLE_ENDIAN);
            this.f4312o = false;
            Iterator it = cVar.f4285e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C1182b) it.next()).f4276g == 3) {
                        this.f4312o = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f4314q = highestOneBit;
            this.f4316s = cVar.f4286f / highestOneBit;
            this.f4315r = cVar.f4287g / highestOneBit;
            this.f4307j = this.f4301d.mo5724a(cVar.f4286f * cVar.f4287g);
            this.f4308k = this.f4301d.mo5725b(this.f4316s * this.f4315r);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Sample size must be >=0, not: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    public void mo5712b() {
        this.f4309l = (this.f4309l + 1) % this.f4310m.f4283c;
    }

    /* renamed from: c */
    public int mo5713c() {
        if (this.f4310m.f4283c <= 0 || this.f4309l < 0) {
            return 0;
        }
        return mo5733a(this.f4309l);
    }

    /* renamed from: d */
    public int mo5714d() {
        return this.f4310m.f4283c;
    }

    /* renamed from: e */
    public int mo5715e() {
        return this.f4309l;
    }

    /* renamed from: f */
    public void mo5716f() {
        this.f4309l = -1;
    }

    /* renamed from: g */
    public int mo5717g() {
        return this.f4302e.limit() + this.f4307j.length + (this.f4308k.length * 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e9, code lost:
        return null;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo5718h() {
        /*
            r7 = this;
            monitor-enter(r7)
            com.bumptech.glide.b.c r0 = r7.f4310m     // Catch:{ all -> 0x00ea }
            int r0 = r0.f4283c     // Catch:{ all -> 0x00ea }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r7.f4309l     // Catch:{ all -> 0x00ea }
            if (r0 >= 0) goto L_0x003b
        L_0x000d:
            java.lang.String r0 = f4298a     // Catch:{ all -> 0x00ea }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = f4298a     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r3.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "Unable to decode frame, frameCount="
            r3.append(r4)     // Catch:{ all -> 0x00ea }
            com.bumptech.glide.b.c r4 = r7.f4310m     // Catch:{ all -> 0x00ea }
            int r4 = r4.f4283c     // Catch:{ all -> 0x00ea }
            r3.append(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = ", framePointer="
            r3.append(r4)     // Catch:{ all -> 0x00ea }
            int r4 = r7.f4309l     // Catch:{ all -> 0x00ea }
            r3.append(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ea }
            android.util.Log.d(r0, r3)     // Catch:{ all -> 0x00ea }
        L_0x0039:
            r7.f4313p = r2     // Catch:{ all -> 0x00ea }
        L_0x003b:
            int r0 = r7.f4313p     // Catch:{ all -> 0x00ea }
            r3 = 0
            if (r0 == r2) goto L_0x00c8
            int r0 = r7.f4313p     // Catch:{ all -> 0x00ea }
            r4 = 2
            if (r0 != r4) goto L_0x0047
            goto L_0x00c8
        L_0x0047:
            r0 = 0
            r7.f4313p = r0     // Catch:{ all -> 0x00ea }
            byte[] r4 = r7.f4303f     // Catch:{ all -> 0x00ea }
            if (r4 != 0) goto L_0x0058
            com.bumptech.glide.b.a$a r4 = r7.f4301d     // Catch:{ all -> 0x00ea }
            r5 = 255(0xff, float:3.57E-43)
            byte[] r4 = r4.mo5724a(r5)     // Catch:{ all -> 0x00ea }
            r7.f4303f = r4     // Catch:{ all -> 0x00ea }
        L_0x0058:
            com.bumptech.glide.b.c r4 = r7.f4310m     // Catch:{ all -> 0x00ea }
            java.util.List<com.bumptech.glide.b.b> r4 = r4.f4285e     // Catch:{ all -> 0x00ea }
            int r5 = r7.f4309l     // Catch:{ all -> 0x00ea }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x00ea }
            com.bumptech.glide.b.b r4 = (com.bumptech.glide.p035b.C1182b) r4     // Catch:{ all -> 0x00ea }
            int r5 = r7.f4309l     // Catch:{ all -> 0x00ea }
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x0074
            com.bumptech.glide.b.c r6 = r7.f4310m     // Catch:{ all -> 0x00ea }
            java.util.List<com.bumptech.glide.b.b> r6 = r6.f4285e     // Catch:{ all -> 0x00ea }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x00ea }
            com.bumptech.glide.b.b r5 = (com.bumptech.glide.p035b.C1182b) r5     // Catch:{ all -> 0x00ea }
            goto L_0x0075
        L_0x0074:
            r5 = r3
        L_0x0075:
            int[] r6 = r4.f4280k     // Catch:{ all -> 0x00ea }
            if (r6 == 0) goto L_0x007c
            int[] r6 = r4.f4280k     // Catch:{ all -> 0x00ea }
            goto L_0x0080
        L_0x007c:
            com.bumptech.glide.b.c r6 = r7.f4310m     // Catch:{ all -> 0x00ea }
            int[] r6 = r6.f4281a     // Catch:{ all -> 0x00ea }
        L_0x0080:
            r7.f4299b = r6     // Catch:{ all -> 0x00ea }
            int[] r6 = r7.f4299b     // Catch:{ all -> 0x00ea }
            if (r6 != 0) goto L_0x00aa
            java.lang.String r0 = f4298a     // Catch:{ all -> 0x00ea }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = f4298a     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r1.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = "No valid color table found for frame #"
            r1.append(r4)     // Catch:{ all -> 0x00ea }
            int r4 = r7.f4309l     // Catch:{ all -> 0x00ea }
            r1.append(r4)     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ea }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ea }
        L_0x00a6:
            r7.f4313p = r2     // Catch:{ all -> 0x00ea }
            monitor-exit(r7)
            return r3
        L_0x00aa:
            boolean r1 = r4.f4275f     // Catch:{ all -> 0x00ea }
            if (r1 == 0) goto L_0x00c2
            int[] r1 = r7.f4299b     // Catch:{ all -> 0x00ea }
            int[] r2 = r7.f4300c     // Catch:{ all -> 0x00ea }
            int[] r3 = r7.f4299b     // Catch:{ all -> 0x00ea }
            int r3 = r3.length     // Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)     // Catch:{ all -> 0x00ea }
            int[] r1 = r7.f4300c     // Catch:{ all -> 0x00ea }
            r7.f4299b = r1     // Catch:{ all -> 0x00ea }
            int[] r1 = r7.f4299b     // Catch:{ all -> 0x00ea }
            int r2 = r4.f4277h     // Catch:{ all -> 0x00ea }
            r1[r2] = r0     // Catch:{ all -> 0x00ea }
        L_0x00c2:
            android.graphics.Bitmap r0 = r7.m6431a(r4, r5)     // Catch:{ all -> 0x00ea }
            monitor-exit(r7)
            return r0
        L_0x00c8:
            java.lang.String r0 = f4298a     // Catch:{ all -> 0x00ea }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = f4298a     // Catch:{ all -> 0x00ea }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ea }
            r1.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.String r2 = "Unable to decode frame, status="
            r1.append(r2)     // Catch:{ all -> 0x00ea }
            int r2 = r7.f4313p     // Catch:{ all -> 0x00ea }
            r1.append(r2)     // Catch:{ all -> 0x00ea }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00ea }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x00ea }
        L_0x00e8:
            monitor-exit(r7)
            return r3
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p035b.C1185e.mo5718h():android.graphics.Bitmap");
    }

    /* renamed from: i */
    public void mo5719i() {
        this.f4310m = null;
        if (this.f4307j != null) {
            this.f4301d.mo5722a(this.f4307j);
        }
        if (this.f4308k != null) {
            this.f4301d.mo5723a(this.f4308k);
        }
        if (this.f4311n != null) {
            this.f4301d.mo5721a(this.f4311n);
        }
        this.f4311n = null;
        this.f4302e = null;
        this.f4317t = null;
        if (this.f4303f != null) {
            this.f4301d.mo5722a(this.f4303f);
        }
    }
}
