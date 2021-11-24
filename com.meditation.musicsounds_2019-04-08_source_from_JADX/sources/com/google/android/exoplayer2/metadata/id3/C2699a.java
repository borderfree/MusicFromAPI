package com.google.android.exoplayer2.metadata.id3;

import android.util.Log;
import com.google.android.exoplayer2.metadata.C2682a;
import com.google.android.exoplayer2.metadata.C2685c;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.metadata.id3.a */
public final class C2699a implements C2682a {

    /* renamed from: a */
    public static final int f9224a = C2511s.m11819e("ID3");

    /* renamed from: b */
    private final C2700a f9225b;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.a$a */
    public interface C2700a {
        /* renamed from: a */
        boolean mo9122a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.google.android.exoplayer2.metadata.id3.a$b */
    private static final class C2701b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f9226a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f9227b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f9228c;

        public C2701b(int i, boolean z, int i2) {
            this.f9226a = i;
            this.f9227b = z;
            this.f9228c = i2;
        }
    }

    public C2699a() {
        this(null);
    }

    public C2699a(C2700a aVar) {
        this.f9225b = aVar;
    }

    /* renamed from: a */
    private static int m12774a(byte[] bArr, int i, int i2) {
        int b = m12785b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b;
        }
        while (b < bArr.length - 1) {
            if (b % 2 == 0 && bArr[b + 1] == 0) {
                return b;
            }
            b = m12785b(bArr, b + 1);
        }
        return bArr.length;
    }

    /* renamed from: a */
    private static ApicFrame m12775a(C2500k kVar, int i, int i2) {
        String str;
        int i3;
        int g = kVar.mo8834g();
        String a = m12781a(g);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        kVar.mo8823a(bArr, 0, i4);
        if (i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("image/");
            sb.append(C2511s.m11818d(new String(bArr, 0, 3, "ISO-8859-1")));
            String sb2 = sb.toString();
            if (sb2.equals("image/jpg")) {
                sb2 = "image/jpeg";
            }
            str = sb2;
            i3 = 2;
        } else {
            i3 = m12785b(bArr, 0);
            str = C2511s.m11818d(new String(bArr, 0, i3, "ISO-8859-1"));
            if (str.indexOf(47) == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("image/");
                sb3.append(str);
                str = sb3.toString();
            }
        }
        byte b = bArr[i3 + 1] & 255;
        int i5 = i3 + 2;
        int a2 = m12774a(bArr, i5, g);
        return new ApicFrame(str, new String(bArr, i5, a2 - i5, a), b, Arrays.copyOfRange(bArr, a2 + m12784b(g), bArr.length));
    }

    /* renamed from: a */
    private static ChapterFrame m12776a(C2500k kVar, int i, int i2, boolean z, int i3, C2700a aVar) {
        C2500k kVar2 = kVar;
        int d = kVar.mo8828d();
        int b = m12785b(kVar2.f8094a, d);
        String str = new String(kVar2.f8094a, d, b - d, "ISO-8859-1");
        kVar.mo8827c(b + 1);
        int n = kVar.mo8841n();
        int n2 = kVar.mo8841n();
        long l = kVar.mo8839l();
        long j = l == 4294967295L ? -1 : l;
        long l2 = kVar.mo8839l();
        long j2 = l2 == 4294967295L ? -1 : l2;
        ArrayList arrayList = new ArrayList();
        int i4 = d + i;
        while (kVar.mo8828d() < i4) {
            Id3Frame a = m12777a(i2, kVar, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        ChapterFrame chapterFrame = new ChapterFrame(str, n, n2, j, j2, id3FrameArr);
        return chapterFrame;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame m12777a(int r19, com.google.android.exoplayer2.p102c.C2500k r20, boolean r21, int r22, com.google.android.exoplayer2.metadata.id3.C2699a.C2700a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.mo8834g()
            int r9 = r20.mo8834g()
            int r10 = r20.mo8834g()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.mo8834g()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.mo8847t()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.mo8847t()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.mo8838k()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.mo8835h()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.mo8826c()
            r7.mo8827c(r0)
            return r16
        L_0x0067:
            int r1 = r20.mo8828d()
            int r5 = r1 + r15
            int r1 = r20.mo8826c()
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Id3Decoder"
            java.lang.String r1 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r0, r1)
            int r0 = r20.mo8826c()
            r7.mo8827c(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x0098
            r1 = r23
            r2 = r19
            r3 = r8
            r4 = r9
            r12 = r5
            r5 = r10
            r14 = r6
            r6 = r13
            boolean r1 = r1.mo9122a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009a
            r7.mo8827c(r12)
            return r16
        L_0x0098:
            r12 = r5
            r14 = r6
        L_0x009a:
            r1 = 1
            if (r0 != r11) goto L_0x00b7
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00a3
            r2 = 1
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            r3 = r14 & 64
            if (r3 == 0) goto L_0x00aa
            r3 = 1
            goto L_0x00ab
        L_0x00aa:
            r3 = 0
        L_0x00ab:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00b1
            r4 = 1
            goto L_0x00b2
        L_0x00b1:
            r4 = 0
        L_0x00b2:
            r17 = r3
            r5 = 0
            r3 = r2
            goto L_0x00ee
        L_0x00b7:
            r2 = 4
            if (r0 != r2) goto L_0x00e8
            r2 = r14 & 64
            if (r2 == 0) goto L_0x00c0
            r2 = 1
            goto L_0x00c1
        L_0x00c0:
            r2 = 0
        L_0x00c1:
            r3 = r14 & 8
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r14 & 4
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r14 & 1
            if (r6 == 0) goto L_0x00dd
            r17 = 1
            goto L_0x00df
        L_0x00dd:
            r17 = 0
        L_0x00df:
            r18 = r4
            r4 = r2
            r2 = r3
            r3 = r17
            r17 = r18
            goto L_0x00ee
        L_0x00e8:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r17 = 0
        L_0x00ee:
            if (r2 != 0) goto L_0x021d
            if (r17 == 0) goto L_0x00f4
            goto L_0x021d
        L_0x00f4:
            if (r4 == 0) goto L_0x00fb
            int r15 = r15 + -1
            r7.mo8829d(r1)
        L_0x00fb:
            if (r3 == 0) goto L_0x0103
            int r15 = r15 + -4
            r1 = 4
            r7.mo8829d(r1)
        L_0x0103:
            r1 = r15
            if (r5 == 0) goto L_0x010a
            int r1 = m12793f(r7, r1)
        L_0x010a:
            r11 = r1
            r1 = 84
            r2 = 88
            r3 = 2
            if (r8 != r1) goto L_0x0120
            if (r9 != r2) goto L_0x0120
            if (r10 != r2) goto L_0x0120
            if (r0 == r3) goto L_0x011a
            if (r13 != r2) goto L_0x0120
        L_0x011a:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m12778a(r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x0120:
            if (r8 != r1) goto L_0x012f
            java.lang.String r1 = m12782a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m12779a(r7, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x012c:
            r0 = move-exception
            goto L_0x0219
        L_0x012f:
            r4 = 87
            if (r8 != r4) goto L_0x0141
            if (r9 != r2) goto L_0x0141
            if (r10 != r2) goto L_0x0141
            if (r0 == r3) goto L_0x013b
            if (r13 != r2) goto L_0x0141
        L_0x013b:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m12787b(r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x0141:
            r2 = 87
            if (r8 != r2) goto L_0x014f
            java.lang.String r1 = m12782a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m12788b(r7, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x014f:
            r2 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r2) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            com.google.android.exoplayer2.metadata.id3.PrivFrame r1 = m12790c(r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r3) goto L_0x017d
        L_0x0177:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r1 = m12791d(r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x017d:
            r5 = 67
            if (r0 != r3) goto L_0x0188
            if (r8 != r4) goto L_0x0197
            if (r9 != r2) goto L_0x0197
            if (r10 != r5) goto L_0x0197
            goto L_0x0192
        L_0x0188:
            r14 = 65
            if (r8 != r14) goto L_0x0197
            if (r9 != r4) goto L_0x0197
            if (r10 != r2) goto L_0x0197
            if (r13 != r5) goto L_0x0197
        L_0x0192:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r1 = m12775a(r7, r11, r0)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x0197:
            if (r8 != r5) goto L_0x01aa
            if (r9 != r6) goto L_0x01aa
            r2 = 77
            if (r10 != r2) goto L_0x01aa
            r2 = 77
            if (r13 == r2) goto L_0x01a5
            if (r0 != r3) goto L_0x01aa
        L_0x01a5:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r1 = m12792e(r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x01aa:
            if (r8 != r5) goto L_0x01c6
            r2 = 72
            if (r9 != r2) goto L_0x01c6
            r2 = 65
            if (r10 != r2) goto L_0x01c6
            if (r13 != r4) goto L_0x01c6
            r1 = r20
            r2 = r11
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r1 = m12776a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x01c6:
            if (r8 != r5) goto L_0x01de
            if (r9 != r1) goto L_0x01de
            if (r10 != r6) goto L_0x01de
            if (r13 != r5) goto L_0x01de
            r1 = r20
            r2 = r11
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = m12786b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            goto L_0x01e6
        L_0x01de:
            java.lang.String r1 = m12782a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r1 = m12789c(r7, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x020e }
        L_0x01e6:
            if (r1 != 0) goto L_0x020a
            java.lang.String r2 = "Id3Decoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x020e }
            r3.<init>()     // Catch:{ UnsupportedEncodingException -> 0x020e }
            java.lang.String r4 = "Failed to decode frame: id="
            r3.append(r4)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            java.lang.String r0 = m12782a(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            java.lang.String r0 = ", frameSize="
            r3.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            r3.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x020e }
            java.lang.String r0 = r3.toString()     // Catch:{ UnsupportedEncodingException -> 0x020e }
            android.util.Log.w(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x020e }
        L_0x020a:
            r7.mo8827c(r12)
            return r1
        L_0x020e:
            java.lang.String r0 = "Id3Decoder"
            java.lang.String r1 = "Unsupported character encoding"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x012c }
            r7.mo8827c(r12)
            return r16
        L_0x0219:
            r7.mo8827c(r12)
            throw r0
        L_0x021d:
            java.lang.String r0 = "Id3Decoder"
            java.lang.String r1 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r0, r1)
            r7.mo8827c(r12)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.C2699a.m12777a(int, com.google.android.exoplayer2.c.k, boolean, int, com.google.android.exoplayer2.metadata.id3.a$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* renamed from: a */
    private static TextInformationFrame m12778a(C2500k kVar, int i) {
        if (i < 1) {
            return null;
        }
        int g = kVar.mo8834g();
        String a = m12781a(g);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        kVar.mo8823a(bArr, 0, i2);
        int a2 = m12774a(bArr, 0, g);
        String str = new String(bArr, 0, a2, a);
        int b = a2 + m12784b(g);
        return new TextInformationFrame("TXXX", str, b < bArr.length ? new String(bArr, b, m12774a(bArr, b, g) - b, a) : "");
    }

    /* renamed from: a */
    private static TextInformationFrame m12779a(C2500k kVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int g = kVar.mo8834g();
        String a = m12781a(g);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        kVar.mo8823a(bArr, 0, i2);
        return new TextInformationFrame(str, null, new String(bArr, 0, m12774a(bArr, 0, g), a));
    }

    /* renamed from: a */
    private static C2701b m12780a(C2500k kVar) {
        String str;
        StringBuilder sb;
        String str2;
        String str3;
        if (kVar.mo8824b() < 10) {
            str = "Id3Decoder";
            str3 = "Data too short to be an ID3 tag";
        } else {
            int k = kVar.mo8838k();
            if (k != f9224a) {
                str = "Id3Decoder";
                sb = new StringBuilder();
                str2 = "Unexpected first three bytes of ID3 tag header: ";
            } else {
                k = kVar.mo8834g();
                boolean z = true;
                kVar.mo8829d(1);
                int g = kVar.mo8834g();
                int s = kVar.mo8846s();
                if (k == 2) {
                    if ((g & 64) != 0) {
                        str = "Id3Decoder";
                        str3 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (k == 3) {
                    if ((g & 64) != 0) {
                        int n = kVar.mo8841n();
                        kVar.mo8829d(n);
                        s -= n + 4;
                    }
                } else if (k == 4) {
                    if ((g & 64) != 0) {
                        int s2 = kVar.mo8846s();
                        kVar.mo8829d(s2 - 4);
                        s -= s2;
                    }
                    if ((g & 16) != 0) {
                        s -= 10;
                    }
                } else {
                    str = "Id3Decoder";
                    sb = new StringBuilder();
                    str2 = "Skipped ID3 tag with unsupported majorVersion=";
                }
                if (k >= 4 || (g & 128) == 0) {
                    z = false;
                }
                return new C2701b(k, z, s);
            }
            sb.append(str2);
            sb.append(k);
            str3 = sb.toString();
        }
        Log.w(str, str3);
        return null;
    }

    /* renamed from: a */
    private static String m12781a(int i) {
        switch (i) {
            case 0:
                return "ISO-8859-1";
            case 1:
                return "UTF-16";
            case 2:
                return "UTF-16BE";
            case 3:
                return "UTF-8";
            default:
                return "ISO-8859-1";
        }
    }

    /* renamed from: a */
    private static String m12782a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b A[SYNTHETIC, Splitter:B:49:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0097 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m12783a(com.google.android.exoplayer2.p102c.C2500k r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.mo8828d()
        L_0x0008:
            int r3 = r18.mo8824b()     // Catch:{ all -> 0x00b2 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.mo8841n()     // Catch:{ all -> 0x00b2 }
            long r8 = r18.mo8839l()     // Catch:{ all -> 0x00b2 }
            int r10 = r18.mo8835h()     // Catch:{ all -> 0x00b2 }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.mo8838k()     // Catch:{ all -> 0x00b2 }
            int r8 = r18.mo8838k()     // Catch:{ all -> 0x00b2 }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.mo8827c(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.mo8827c(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0089
        L_0x0078:
            r7 = 1
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x0078
        L_0x0088:
            r3 = 0
        L_0x0089:
            r7 = 0
        L_0x008a:
            if (r3 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            if (r7 == 0) goto L_0x0092
            int r4 = r4 + 4
        L_0x0092:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r1.mo8827c(r2)
            return r6
        L_0x009b:
            int r3 = r18.mo8824b()     // Catch:{ all -> 0x00b2 }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a8
            r1.mo8827c(r2)
            return r6
        L_0x00a8:
            int r3 = (int) r8
            r1.mo8829d(r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0008
        L_0x00ae:
            r1.mo8827c(r2)
            return r4
        L_0x00b2:
            r0 = move-exception
            r1.mo8827c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.C2699a.m12783a(com.google.android.exoplayer2.c.k, int, int, boolean):boolean");
    }

    /* renamed from: b */
    private static int m12784b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: b */
    private static int m12785b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: b */
    private static ChapterTocFrame m12786b(C2500k kVar, int i, int i2, boolean z, int i3, C2700a aVar) {
        C2500k kVar2 = kVar;
        int d = kVar.mo8828d();
        int b = m12785b(kVar2.f8094a, d);
        String str = new String(kVar2.f8094a, d, b - d, "ISO-8859-1");
        kVar.mo8827c(b + 1);
        int g = kVar.mo8834g();
        boolean z2 = (g & 2) != 0;
        boolean z3 = (g & 1) != 0;
        int g2 = kVar.mo8834g();
        String[] strArr = new String[g2];
        for (int i4 = 0; i4 < g2; i4++) {
            int d2 = kVar.mo8828d();
            int b2 = m12785b(kVar2.f8094a, d2);
            strArr[i4] = new String(kVar2.f8094a, d2, b2 - d2, "ISO-8859-1");
            kVar.mo8827c(b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = d + i;
        while (kVar.mo8828d() < i5) {
            Id3Frame a = m12777a(i2, kVar, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        ChapterTocFrame chapterTocFrame = new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
        return chapterTocFrame;
    }

    /* renamed from: b */
    private static UrlLinkFrame m12787b(C2500k kVar, int i) {
        if (i < 1) {
            return null;
        }
        int g = kVar.mo8834g();
        String a = m12781a(g);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        kVar.mo8823a(bArr, 0, i2);
        int a2 = m12774a(bArr, 0, g);
        String str = new String(bArr, 0, a2, a);
        int b = a2 + m12784b(g);
        return new UrlLinkFrame("WXXX", str, b < bArr.length ? new String(bArr, b, m12785b(bArr, b) - b, "ISO-8859-1") : "");
    }

    /* renamed from: b */
    private static UrlLinkFrame m12788b(C2500k kVar, int i, String str) {
        byte[] bArr = new byte[i];
        kVar.mo8823a(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m12785b(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: c */
    private static BinaryFrame m12789c(C2500k kVar, int i, String str) {
        byte[] bArr = new byte[i];
        kVar.mo8823a(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: c */
    private static PrivFrame m12790c(C2500k kVar, int i) {
        byte[] bArr = new byte[i];
        kVar.mo8823a(bArr, 0, i);
        int b = m12785b(bArr, 0);
        String str = new String(bArr, 0, b, "ISO-8859-1");
        int i2 = b + 1;
        return new PrivFrame(str, i2 < bArr.length ? Arrays.copyOfRange(bArr, i2, bArr.length) : new byte[0]);
    }

    /* renamed from: d */
    private static GeobFrame m12791d(C2500k kVar, int i) {
        int g = kVar.mo8834g();
        String a = m12781a(g);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        kVar.mo8823a(bArr, 0, i2);
        int b = m12785b(bArr, 0);
        String str = new String(bArr, 0, b, "ISO-8859-1");
        int i3 = b + 1;
        int a2 = m12774a(bArr, i3, g);
        String str2 = new String(bArr, i3, a2 - i3, a);
        int b2 = a2 + m12784b(g);
        int a3 = m12774a(bArr, b2, g);
        return new GeobFrame(str, str2, new String(bArr, b2, a3 - b2, a), Arrays.copyOfRange(bArr, a3 + m12784b(g), bArr.length));
    }

    /* renamed from: e */
    private static CommentFrame m12792e(C2500k kVar, int i) {
        if (i < 4) {
            return null;
        }
        int g = kVar.mo8834g();
        String a = m12781a(g);
        byte[] bArr = new byte[3];
        kVar.mo8823a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        kVar.mo8823a(bArr2, 0, i2);
        int a2 = m12774a(bArr2, 0, g);
        String str2 = new String(bArr2, 0, a2, a);
        int b = a2 + m12784b(g);
        return new CommentFrame(str, str2, b < bArr2.length ? new String(bArr2, b, m12774a(bArr2, b, g) - b, a) : "");
    }

    /* renamed from: f */
    private static int m12793f(C2500k kVar, int i) {
        byte[] bArr = kVar.f8094a;
        int d = kVar.mo8828d();
        while (true) {
            int i2 = d + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[d] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, d + 2, bArr, i2, (i - d) - 2);
                i--;
            }
            d = i2;
        }
    }

    /* renamed from: a */
    public Metadata mo9191a(C2685c cVar) {
        ByteBuffer byteBuffer = cVar.f7788b;
        return mo9268a(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: a */
    public Metadata mo9268a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C2500k kVar = new C2500k(bArr, i);
        C2701b a = m12780a(kVar);
        if (a == null) {
            return null;
        }
        int d = kVar.mo8828d();
        int i2 = a.f9226a == 2 ? 6 : 10;
        int b = a.f9228c;
        if (a.f9227b) {
            b = m12793f(kVar, a.f9228c);
        }
        kVar.mo8825b(d + b);
        boolean z = false;
        if (!m12783a(kVar, a.f9226a, i2, false)) {
            if (a.f9226a != 4 || !m12783a(kVar, 4, i2, true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to validate ID3 tag with majorVersion=");
                sb.append(a.f9226a);
                Log.w("Id3Decoder", sb.toString());
                return null;
            }
            z = true;
        }
        while (kVar.mo8824b() >= i2) {
            Id3Frame a2 = m12777a(a.f9226a, kVar, z, i2, this.f9225b);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new Metadata((List<? extends Entry>) arrayList);
    }
}
