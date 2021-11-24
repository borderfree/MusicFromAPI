package com.google.android.exoplayer2.extractor.p105c;

import android.util.Log;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.google.android.exoplayer2.extractor.c.f */
final class C2562f {

    /* renamed from: A */
    private static final int f8491A = C2511s.m11819e("sosn");

    /* renamed from: B */
    private static final int f8492B = C2511s.m11819e("tvsh");

    /* renamed from: C */
    private static final int f8493C = C2511s.m11819e("----");

    /* renamed from: D */
    private static final String[] f8494D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f8495a = C2511s.m11819e("nam");

    /* renamed from: b */
    private static final int f8496b = C2511s.m11819e("trk");

    /* renamed from: c */
    private static final int f8497c = C2511s.m11819e("cmt");

    /* renamed from: d */
    private static final int f8498d = C2511s.m11819e("day");

    /* renamed from: e */
    private static final int f8499e = C2511s.m11819e("ART");

    /* renamed from: f */
    private static final int f8500f = C2511s.m11819e("too");

    /* renamed from: g */
    private static final int f8501g = C2511s.m11819e("alb");

    /* renamed from: h */
    private static final int f8502h = C2511s.m11819e("com");

    /* renamed from: i */
    private static final int f8503i = C2511s.m11819e("wrt");

    /* renamed from: j */
    private static final int f8504j = C2511s.m11819e("lyr");

    /* renamed from: k */
    private static final int f8505k = C2511s.m11819e("gen");

    /* renamed from: l */
    private static final int f8506l = C2511s.m11819e("covr");

    /* renamed from: m */
    private static final int f8507m = C2511s.m11819e("gnre");

    /* renamed from: n */
    private static final int f8508n = C2511s.m11819e("grp");

    /* renamed from: o */
    private static final int f8509o = C2511s.m11819e("disk");

    /* renamed from: p */
    private static final int f8510p = C2511s.m11819e("trkn");

    /* renamed from: q */
    private static final int f8511q = C2511s.m11819e("tmpo");

    /* renamed from: r */
    private static final int f8512r = C2511s.m11819e("cpil");

    /* renamed from: s */
    private static final int f8513s = C2511s.m11819e("aART");

    /* renamed from: t */
    private static final int f8514t = C2511s.m11819e("sonm");

    /* renamed from: u */
    private static final int f8515u = C2511s.m11819e("soal");

    /* renamed from: v */
    private static final int f8516v = C2511s.m11819e("soar");

    /* renamed from: w */
    private static final int f8517w = C2511s.m11819e("soaa");

    /* renamed from: x */
    private static final int f8518x = C2511s.m11819e("soco");

    /* renamed from: y */
    private static final int f8519y = C2511s.m11819e("rtng");

    /* renamed from: z */
    private static final int f8520z = C2511s.m11819e("pgap");

    /* renamed from: a */
    public static Entry m12075a(C2500k kVar) {
        int d = kVar.mo8828d() + kVar.mo8841n();
        int n = kVar.mo8841n();
        int i = (n >> 24) & 255;
        if (i == 169 || i == 65533) {
            int i2 = 16777215 & n;
            if (i2 == f8497c) {
                CommentFrame a = m12076a(n, kVar);
                kVar.mo8827c(d);
                return a;
            }
            if (i2 != f8495a) {
                if (i2 != f8496b) {
                    if (i2 != f8502h) {
                        if (i2 != f8503i) {
                            if (i2 == f8498d) {
                                TextInformationFrame a2 = m12079a(n, "TDRC", kVar);
                                kVar.mo8827c(d);
                                return a2;
                            } else if (i2 == f8499e) {
                                TextInformationFrame a3 = m12079a(n, "TPE1", kVar);
                                kVar.mo8827c(d);
                                return a3;
                            } else if (i2 == f8500f) {
                                TextInformationFrame a4 = m12079a(n, "TSSE", kVar);
                                kVar.mo8827c(d);
                                return a4;
                            } else if (i2 == f8501g) {
                                TextInformationFrame a5 = m12079a(n, "TALB", kVar);
                                kVar.mo8827c(d);
                                return a5;
                            } else if (i2 == f8504j) {
                                TextInformationFrame a6 = m12079a(n, "USLT", kVar);
                                kVar.mo8827c(d);
                                return a6;
                            } else if (i2 == f8505k) {
                                TextInformationFrame a7 = m12079a(n, "TCON", kVar);
                                kVar.mo8827c(d);
                                return a7;
                            } else if (i2 == f8508n) {
                                TextInformationFrame a8 = m12079a(n, "TIT1", kVar);
                                kVar.mo8827c(d);
                                return a8;
                            }
                        }
                    }
                    TextInformationFrame a9 = m12079a(n, "TCOM", kVar);
                    kVar.mo8827c(d);
                    return a9;
                }
            }
            TextInformationFrame a10 = m12079a(n, "TIT2", kVar);
            kVar.mo8827c(d);
            return a10;
        }
        try {
            if (n == f8507m) {
                return m12081b(kVar);
            }
            if (n == f8509o) {
                TextInformationFrame b = m12080b(n, "TPOS", kVar);
                kVar.mo8827c(d);
                return b;
            } else if (n == f8510p) {
                TextInformationFrame b2 = m12080b(n, "TRCK", kVar);
                kVar.mo8827c(d);
                return b2;
            } else if (n == f8511q) {
                Id3Frame a11 = m12077a(n, "TBPM", kVar, true, false);
                kVar.mo8827c(d);
                return a11;
            } else if (n == f8512r) {
                Id3Frame a12 = m12077a(n, "TCMP", kVar, true, true);
                kVar.mo8827c(d);
                return a12;
            } else if (n == f8506l) {
                ApicFrame c = m12082c(kVar);
                kVar.mo8827c(d);
                return c;
            } else if (n == f8513s) {
                TextInformationFrame a13 = m12079a(n, "TPE2", kVar);
                kVar.mo8827c(d);
                return a13;
            } else if (n == f8514t) {
                TextInformationFrame a14 = m12079a(n, "TSOT", kVar);
                kVar.mo8827c(d);
                return a14;
            } else if (n == f8515u) {
                TextInformationFrame a15 = m12079a(n, "TSO2", kVar);
                kVar.mo8827c(d);
                return a15;
            } else if (n == f8516v) {
                TextInformationFrame a16 = m12079a(n, "TSOA", kVar);
                kVar.mo8827c(d);
                return a16;
            } else if (n == f8517w) {
                TextInformationFrame a17 = m12079a(n, "TSOP", kVar);
                kVar.mo8827c(d);
                return a17;
            } else if (n == f8518x) {
                TextInformationFrame a18 = m12079a(n, "TSOC", kVar);
                kVar.mo8827c(d);
                return a18;
            } else if (n == f8519y) {
                Id3Frame a19 = m12077a(n, "ITUNESADVISORY", kVar, false, false);
                kVar.mo8827c(d);
                return a19;
            } else if (n == f8520z) {
                Id3Frame a20 = m12077a(n, "ITUNESGAPLESS", kVar, false, true);
                kVar.mo8827c(d);
                return a20;
            } else if (n == f8491A) {
                TextInformationFrame a21 = m12079a(n, "TVSHOWSORT", kVar);
                kVar.mo8827c(d);
                return a21;
            } else if (n == f8492B) {
                TextInformationFrame a22 = m12079a(n, "TVSHOW", kVar);
                kVar.mo8827c(d);
                return a22;
            } else if (n == f8493C) {
                Id3Frame a23 = m12078a(kVar, d);
                kVar.mo8827c(d);
                return a23;
            }
        } finally {
            kVar.mo8827c(d);
        }
        String str = "MetadataUtil";
        StringBuilder sb = new StringBuilder();
        sb.append("Skipped unknown metadata entry: ");
        sb.append(C2544a.m11993c(n));
        Log.d(str, sb.toString());
        kVar.mo8827c(d);
        return null;
    }

    /* renamed from: a */
    private static CommentFrame m12076a(int i, C2500k kVar) {
        int n = kVar.mo8841n();
        if (kVar.mo8841n() == C2544a.f8342aF) {
            kVar.mo8829d(8);
            String f = kVar.mo8833f(n - 16);
            return new CommentFrame("und", f, f);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse comment attribute: ");
        sb.append(C2544a.m11993c(i));
        Log.w("MetadataUtil", sb.toString());
        return null;
    }

    /* renamed from: a */
    private static Id3Frame m12077a(int i, String str, C2500k kVar, boolean z, boolean z2) {
        int d = m12083d(kVar);
        if (z2) {
            d = Math.min(1, d);
        }
        if (d >= 0) {
            return z ? new TextInformationFrame(str, null, Integer.toString(d)) : new CommentFrame("und", str, Integer.toString(d));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse uint8 attribute: ");
        sb.append(C2544a.m11993c(i));
        Log.w("MetadataUtil", sb.toString());
        return null;
    }

    /* renamed from: a */
    private static Id3Frame m12078a(C2500k kVar, int i) {
        Object obj = null;
        String str = null;
        int i2 = -1;
        int i3 = -1;
        while (kVar.mo8828d() < i) {
            int d = kVar.mo8828d();
            int n = kVar.mo8841n();
            int n2 = kVar.mo8841n();
            kVar.mo8829d(4);
            if (n2 == C2544a.f8340aD) {
                obj = kVar.mo8833f(n - 12);
            } else if (n2 == C2544a.f8341aE) {
                str = kVar.mo8833f(n - 12);
            } else {
                if (n2 == C2544a.f8342aF) {
                    i2 = d;
                    i3 = n;
                }
                kVar.mo8829d(n - 12);
            }
        }
        if (!"com.apple.iTunes".equals(obj) || !"iTunSMPB".equals(str) || i2 == -1) {
            return null;
        }
        kVar.mo8827c(i2);
        kVar.mo8829d(16);
        return new CommentFrame("und", str, kVar.mo8833f(i3 - 16));
    }

    /* renamed from: a */
    private static TextInformationFrame m12079a(int i, String str, C2500k kVar) {
        int n = kVar.mo8841n();
        if (kVar.mo8841n() == C2544a.f8342aF) {
            kVar.mo8829d(8);
            return new TextInformationFrame(str, null, kVar.mo8833f(n - 16));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse text attribute: ");
        sb.append(C2544a.m11993c(i));
        Log.w("MetadataUtil", sb.toString());
        return null;
    }

    /* renamed from: b */
    private static TextInformationFrame m12080b(int i, String str, C2500k kVar) {
        int n = kVar.mo8841n();
        if (kVar.mo8841n() == C2544a.f8342aF && n >= 22) {
            kVar.mo8829d(10);
            int h = kVar.mo8835h();
            if (h > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(h);
                String sb2 = sb.toString();
                int h2 = kVar.mo8835h();
                if (h2 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                    sb3.append(h2);
                    sb2 = sb3.toString();
                }
                return new TextInformationFrame(str, null, sb2);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Failed to parse index/count attribute: ");
        sb4.append(C2544a.m11993c(i));
        Log.w("MetadataUtil", sb4.toString());
        return null;
    }

    /* renamed from: b */
    private static TextInformationFrame m12081b(C2500k kVar) {
        int d = m12083d(kVar);
        String str = (d <= 0 || d > f8494D.length) ? null : f8494D[d - 1];
        if (str != null) {
            return new TextInformationFrame("TCON", null, str);
        }
        Log.w("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    /* renamed from: c */
    private static ApicFrame m12082c(C2500k kVar) {
        String str;
        String str2;
        int n = kVar.mo8841n();
        if (kVar.mo8841n() == C2544a.f8342aF) {
            int b = C2544a.m11992b(kVar.mo8841n());
            String str3 = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str3 == null) {
                str = "MetadataUtil";
                StringBuilder sb = new StringBuilder();
                sb.append("Unrecognized cover art flags: ");
                sb.append(b);
                str2 = sb.toString();
            } else {
                kVar.mo8829d(4);
                byte[] bArr = new byte[(n - 16)];
                kVar.mo8823a(bArr, 0, bArr.length);
                return new ApicFrame(str3, null, 3, bArr);
            }
        } else {
            str = "MetadataUtil";
            str2 = "Failed to parse cover art attribute";
        }
        Log.w(str, str2);
        return null;
    }

    /* renamed from: d */
    private static int m12083d(C2500k kVar) {
        kVar.mo8829d(4);
        if (kVar.mo8841n() == C2544a.f8342aF) {
            kVar.mo8829d(8);
            return kVar.mo8834g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
