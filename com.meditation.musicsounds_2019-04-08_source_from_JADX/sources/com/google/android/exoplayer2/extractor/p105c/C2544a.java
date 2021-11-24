package com.google.android.exoplayer2.extractor.p105c;

import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.c.a */
abstract class C2544a {

    /* renamed from: A */
    public static final int f8310A = C2511s.m11819e("sidx");

    /* renamed from: B */
    public static final int f8311B = C2511s.m11819e("moov");

    /* renamed from: C */
    public static final int f8312C = C2511s.m11819e("mvhd");

    /* renamed from: D */
    public static final int f8313D = C2511s.m11819e("trak");

    /* renamed from: E */
    public static final int f8314E = C2511s.m11819e("mdia");

    /* renamed from: F */
    public static final int f8315F = C2511s.m11819e("minf");

    /* renamed from: G */
    public static final int f8316G = C2511s.m11819e("stbl");

    /* renamed from: H */
    public static final int f8317H = C2511s.m11819e("avcC");

    /* renamed from: I */
    public static final int f8318I = C2511s.m11819e("hvcC");

    /* renamed from: J */
    public static final int f8319J = C2511s.m11819e("esds");

    /* renamed from: K */
    public static final int f8320K = C2511s.m11819e("moof");

    /* renamed from: L */
    public static final int f8321L = C2511s.m11819e("traf");

    /* renamed from: M */
    public static final int f8322M = C2511s.m11819e("mvex");

    /* renamed from: N */
    public static final int f8323N = C2511s.m11819e("mehd");

    /* renamed from: O */
    public static final int f8324O = C2511s.m11819e("tkhd");

    /* renamed from: P */
    public static final int f8325P = C2511s.m11819e("edts");

    /* renamed from: Q */
    public static final int f8326Q = C2511s.m11819e("elst");

    /* renamed from: R */
    public static final int f8327R = C2511s.m11819e("mdhd");

    /* renamed from: S */
    public static final int f8328S = C2511s.m11819e("hdlr");

    /* renamed from: T */
    public static final int f8329T = C2511s.m11819e("stsd");

    /* renamed from: U */
    public static final int f8330U = C2511s.m11819e("pssh");

    /* renamed from: V */
    public static final int f8331V = C2511s.m11819e("sinf");

    /* renamed from: W */
    public static final int f8332W = C2511s.m11819e("schm");

    /* renamed from: X */
    public static final int f8333X = C2511s.m11819e("schi");

    /* renamed from: Y */
    public static final int f8334Y = C2511s.m11819e("tenc");

    /* renamed from: Z */
    public static final int f8335Z = C2511s.m11819e("encv");

    /* renamed from: a */
    public static final int f8336a = C2511s.m11819e("ftyp");

    /* renamed from: aA */
    public static final int f8337aA = C2511s.m11819e("udta");

    /* renamed from: aB */
    public static final int f8338aB = C2511s.m11819e("meta");

    /* renamed from: aC */
    public static final int f8339aC = C2511s.m11819e("ilst");

    /* renamed from: aD */
    public static final int f8340aD = C2511s.m11819e("mean");

    /* renamed from: aE */
    public static final int f8341aE = C2511s.m11819e("name");

    /* renamed from: aF */
    public static final int f8342aF = C2511s.m11819e("data");

    /* renamed from: aG */
    public static final int f8343aG = C2511s.m11819e("emsg");

    /* renamed from: aH */
    public static final int f8344aH = C2511s.m11819e("st3d");

    /* renamed from: aI */
    public static final int f8345aI = C2511s.m11819e("sv3d");

    /* renamed from: aJ */
    public static final int f8346aJ = C2511s.m11819e("proj");

    /* renamed from: aK */
    public static final int f8347aK = C2511s.m11819e("vp08");

    /* renamed from: aL */
    public static final int f8348aL = C2511s.m11819e("vp09");

    /* renamed from: aM */
    public static final int f8349aM = C2511s.m11819e("vpcC");

    /* renamed from: aN */
    public static final int f8350aN = C2511s.m11819e("camm");

    /* renamed from: aO */
    public static final int f8351aO = C2511s.m11819e("alac");

    /* renamed from: aa */
    public static final int f8352aa = C2511s.m11819e("enca");

    /* renamed from: ab */
    public static final int f8353ab = C2511s.m11819e("frma");

    /* renamed from: ac */
    public static final int f8354ac = C2511s.m11819e("saiz");

    /* renamed from: ad */
    public static final int f8355ad = C2511s.m11819e("saio");

    /* renamed from: ae */
    public static final int f8356ae = C2511s.m11819e("sbgp");

    /* renamed from: af */
    public static final int f8357af = C2511s.m11819e("sgpd");

    /* renamed from: ag */
    public static final int f8358ag = C2511s.m11819e("uuid");

    /* renamed from: ah */
    public static final int f8359ah = C2511s.m11819e("senc");

    /* renamed from: ai */
    public static final int f8360ai = C2511s.m11819e("pasp");

    /* renamed from: aj */
    public static final int f8361aj = C2511s.m11819e("TTML");

    /* renamed from: ak */
    public static final int f8362ak = C2511s.m11819e("vmhd");

    /* renamed from: al */
    public static final int f8363al = C2511s.m11819e("mp4v");

    /* renamed from: am */
    public static final int f8364am = C2511s.m11819e("stts");

    /* renamed from: an */
    public static final int f8365an = C2511s.m11819e("stss");

    /* renamed from: ao */
    public static final int f8366ao = C2511s.m11819e("ctts");

    /* renamed from: ap */
    public static final int f8367ap = C2511s.m11819e("stsc");

    /* renamed from: aq */
    public static final int f8368aq = C2511s.m11819e("stsz");

    /* renamed from: ar */
    public static final int f8369ar = C2511s.m11819e("stz2");

    /* renamed from: as */
    public static final int f8370as = C2511s.m11819e("stco");

    /* renamed from: at */
    public static final int f8371at = C2511s.m11819e("co64");

    /* renamed from: au */
    public static final int f8372au = C2511s.m11819e("tx3g");

    /* renamed from: av */
    public static final int f8373av = C2511s.m11819e("wvtt");

    /* renamed from: aw */
    public static final int f8374aw = C2511s.m11819e("stpp");

    /* renamed from: ax */
    public static final int f8375ax = C2511s.m11819e("c608");

    /* renamed from: ay */
    public static final int f8376ay = C2511s.m11819e("samr");

    /* renamed from: az */
    public static final int f8377az = C2511s.m11819e("sawb");

    /* renamed from: b */
    public static final int f8378b = C2511s.m11819e("avc1");

    /* renamed from: c */
    public static final int f8379c = C2511s.m11819e("avc3");

    /* renamed from: d */
    public static final int f8380d = C2511s.m11819e("hvc1");

    /* renamed from: e */
    public static final int f8381e = C2511s.m11819e("hev1");

    /* renamed from: f */
    public static final int f8382f = C2511s.m11819e("s263");

    /* renamed from: g */
    public static final int f8383g = C2511s.m11819e("d263");

    /* renamed from: h */
    public static final int f8384h = C2511s.m11819e("mdat");

    /* renamed from: i */
    public static final int f8385i = C2511s.m11819e("mp4a");

    /* renamed from: j */
    public static final int f8386j = C2511s.m11819e(".mp3");

    /* renamed from: k */
    public static final int f8387k = C2511s.m11819e("wave");

    /* renamed from: l */
    public static final int f8388l = C2511s.m11819e("lpcm");

    /* renamed from: m */
    public static final int f8389m = C2511s.m11819e("sowt");

    /* renamed from: n */
    public static final int f8390n = C2511s.m11819e("ac-3");

    /* renamed from: o */
    public static final int f8391o = C2511s.m11819e("dac3");

    /* renamed from: p */
    public static final int f8392p = C2511s.m11819e("ec-3");

    /* renamed from: q */
    public static final int f8393q = C2511s.m11819e("dec3");

    /* renamed from: r */
    public static final int f8394r = C2511s.m11819e("dtsc");

    /* renamed from: s */
    public static final int f8395s = C2511s.m11819e("dtsh");

    /* renamed from: t */
    public static final int f8396t = C2511s.m11819e("dtsl");

    /* renamed from: u */
    public static final int f8397u = C2511s.m11819e("dtse");

    /* renamed from: v */
    public static final int f8398v = C2511s.m11819e("ddts");

    /* renamed from: w */
    public static final int f8399w = C2511s.m11819e("tfdt");

    /* renamed from: x */
    public static final int f8400x = C2511s.m11819e("tfhd");

    /* renamed from: y */
    public static final int f8401y = C2511s.m11819e("trex");

    /* renamed from: z */
    public static final int f8402z = C2511s.m11819e("trun");

    /* renamed from: aP */
    public final int f8403aP;

    /* renamed from: com.google.android.exoplayer2.extractor.c.a$a */
    static final class C2545a extends C2544a {

        /* renamed from: aQ */
        public final long f8404aQ;

        /* renamed from: aR */
        public final List<C2546b> f8405aR = new ArrayList();

        /* renamed from: aS */
        public final List<C2545a> f8406aS = new ArrayList();

        public C2545a(int i, long j) {
            super(i);
            this.f8404aQ = j;
        }

        /* renamed from: a */
        public void mo8979a(C2545a aVar) {
            this.f8406aS.add(aVar);
        }

        /* renamed from: a */
        public void mo8980a(C2546b bVar) {
            this.f8405aR.add(bVar);
        }

        /* renamed from: d */
        public C2546b mo8981d(int i) {
            int size = this.f8405aR.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2546b bVar = (C2546b) this.f8405aR.get(i2);
                if (bVar.f8403aP == i) {
                    return bVar;
                }
            }
            return null;
        }

        /* renamed from: e */
        public C2545a mo8982e(int i) {
            int size = this.f8406aS.size();
            for (int i2 = 0; i2 < size; i2++) {
                C2545a aVar = (C2545a) this.f8406aS.get(i2);
                if (aVar.f8403aP == i) {
                    return aVar;
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(m11993c(this.f8403aP));
            sb.append(" leaves: ");
            sb.append(Arrays.toString(this.f8405aR.toArray()));
            sb.append(" containers: ");
            sb.append(Arrays.toString(this.f8406aS.toArray()));
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.c.a$b */
    static final class C2546b extends C2544a {

        /* renamed from: aQ */
        public final C2500k f8407aQ;

        public C2546b(int i, C2500k kVar) {
            super(i);
            this.f8407aQ = kVar;
        }
    }

    public C2544a(int i) {
        this.f8403aP = i;
    }

    /* renamed from: a */
    public static int m11991a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static int m11992b(int i) {
        return i & 16777215;
    }

    /* renamed from: c */
    public static String m11993c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m11993c(this.f8403aP);
    }
}
