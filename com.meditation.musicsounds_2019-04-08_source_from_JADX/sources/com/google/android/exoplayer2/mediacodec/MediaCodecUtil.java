package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class MediaCodecUtil {

    /* renamed from: a */
    private static final C2678a f9157a = C2678a.m12714a("OMX.google.raw.decoder");

    /* renamed from: b */
    private static final Pattern f9158b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap<C2674a, List<C2678a>> f9159c = new HashMap<>();

    /* renamed from: d */
    private static final SparseIntArray f9160d = new SparseIntArray();

    /* renamed from: e */
    private static final SparseIntArray f9161e = new SparseIntArray();

    /* renamed from: f */
    private static final Map<String, Integer> f9162f = new HashMap();

    /* renamed from: g */
    private static int f9163g = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$a */
    private static final class C2674a {

        /* renamed from: a */
        public final String f9164a;

        /* renamed from: b */
        public final boolean f9165b;

        public C2674a(String str, boolean z) {
            this.f9164a = str;
            this.f9165b = z;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C2674a.class) {
                return false;
            }
            C2674a aVar = (C2674a) obj;
            if (!TextUtils.equals(this.f9164a, aVar.f9164a) || this.f9165b != aVar.f9165b) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (((this.f9164a == null ? 0 : this.f9164a.hashCode()) + 31) * 31) + (this.f9165b ? 1231 : 1237);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b */
    private interface C2675b {
        /* renamed from: a */
        int mo9169a();

        /* renamed from: a */
        MediaCodecInfo mo9170a(int i);

        /* renamed from: a */
        boolean mo9171a(String str, CodecCapabilities codecCapabilities);

        /* renamed from: b */
        boolean mo9172b();
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c */
    private static final class C2676c implements C2675b {
        private C2676c() {
        }

        /* renamed from: a */
        public int mo9169a() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: a */
        public MediaCodecInfo mo9170a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: a */
        public boolean mo9171a(String str, CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }

        /* renamed from: b */
        public boolean mo9172b() {
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$d */
    private static final class C2677d implements C2675b {

        /* renamed from: a */
        private final int f9166a;

        /* renamed from: b */
        private MediaCodecInfo[] f9167b;

        public C2677d(boolean z) {
            this.f9166a = z ? 1 : 0;
        }

        /* renamed from: c */
        private void m12709c() {
            if (this.f9167b == null) {
                this.f9167b = new MediaCodecList(this.f9166a).getCodecInfos();
            }
        }

        /* renamed from: a */
        public int mo9169a() {
            m12709c();
            return this.f9167b.length;
        }

        /* renamed from: a */
        public MediaCodecInfo mo9170a(int i) {
            m12709c();
            return this.f9167b[i];
        }

        /* renamed from: a */
        public boolean mo9171a(String str, CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        /* renamed from: b */
        public boolean mo9172b() {
            return true;
        }
    }

    static {
        f9160d.put(66, 1);
        f9160d.put(77, 2);
        f9160d.put(88, 4);
        f9160d.put(100, 8);
        f9161e.put(10, 1);
        f9161e.put(11, 4);
        f9161e.put(12, 8);
        f9161e.put(13, 16);
        f9161e.put(20, 32);
        f9161e.put(21, 64);
        f9161e.put(22, 128);
        f9161e.put(30, 256);
        f9161e.put(31, AdRequest.MAX_CONTENT_URL_LENGTH);
        f9161e.put(32, 1024);
        f9161e.put(40, 2048);
        f9161e.put(41, 4096);
        f9161e.put(42, 8192);
        f9161e.put(50, 16384);
        f9161e.put(51, 32768);
        f9161e.put(52, 65536);
        f9162f.put("L30", Integer.valueOf(1));
        f9162f.put("L60", Integer.valueOf(4));
        f9162f.put("L63", Integer.valueOf(16));
        f9162f.put("L90", Integer.valueOf(64));
        f9162f.put("L93", Integer.valueOf(256));
        f9162f.put("L120", Integer.valueOf(1024));
        f9162f.put("L123", Integer.valueOf(4096));
        f9162f.put("L150", Integer.valueOf(16384));
        f9162f.put("L153", Integer.valueOf(65536));
        f9162f.put("L156", Integer.valueOf(262144));
        f9162f.put("L180", Integer.valueOf(1048576));
        f9162f.put("L183", Integer.valueOf(4194304));
        f9162f.put("L186", Integer.valueOf(16777216));
        f9162f.put("H30", Integer.valueOf(2));
        f9162f.put("H60", Integer.valueOf(8));
        f9162f.put("H63", Integer.valueOf(32));
        f9162f.put("H90", Integer.valueOf(128));
        f9162f.put("H93", Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH));
        f9162f.put("H120", Integer.valueOf(2048));
        f9162f.put("H123", Integer.valueOf(8192));
        f9162f.put("H150", Integer.valueOf(32768));
        f9162f.put("H153", Integer.valueOf(131072));
        f9162f.put("H156", Integer.valueOf(524288));
        f9162f.put("H180", Integer.valueOf(2097152));
        f9162f.put("H183", Integer.valueOf(8388608));
        f9162f.put("H186", Integer.valueOf(33554432));
    }

    /* renamed from: a */
    private static int m12690a(int i) {
        switch (i) {
            case 1:
            case 2:
                return 25344;
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case AdRequest.MAX_CONTENT_URL_LENGTH /*512*/:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r3.equals("hev1") != false) goto L_0x003e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m12691a(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r6.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3006243: goto L_0x0033;
                case 3006244: goto L_0x0029;
                case 3199032: goto L_0x0020;
                case 3214780: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x003d
        L_0x0016:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x003d
            r2 = 1
            goto L_0x003e
        L_0x0020:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x003d
            goto L_0x003e
        L_0x0029:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x003d
            r2 = 3
            goto L_0x003e
        L_0x0033:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x003d
            r2 = 2
            goto L_0x003e
        L_0x003d:
            r2 = -1
        L_0x003e:
            switch(r2) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0047;
                case 2: goto L_0x0042;
                case 3: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            return r0
        L_0x0042:
            android.util.Pair r6 = m12698b(r6, r1)
            return r6
        L_0x0047:
            android.util.Pair r6 = m12692a(r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m12691a(java.lang.String):android.util.Pair");
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m12692a(String str, String[] strArr) {
        int i;
        if (strArr.length < 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring malformed HEVC codec string: ");
            sb.append(str);
            Log.w("MediaCodecUtil", sb.toString());
            return null;
        }
        Matcher matcher = f9158b.matcher(strArr[1]);
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring malformed HEVC codec string: ");
            sb2.append(str);
            Log.w("MediaCodecUtil", sb2.toString());
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i = 1;
        } else if ("2".equals(group)) {
            i = 2;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown HEVC profile string: ");
            sb3.append(group);
            Log.w("MediaCodecUtil", sb3.toString());
            return null;
        }
        Integer num = (Integer) f9162f.get(strArr[3]);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i), num);
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Unknown HEVC level string: ");
        sb4.append(matcher.group(1));
        Log.w("MediaCodecUtil", sb4.toString());
        return null;
    }

    /* renamed from: a */
    public static C2678a m12693a() {
        return f9157a;
    }

    /* renamed from: a */
    public static C2678a m12694a(String str, boolean z) {
        List b = m12699b(str, z);
        if (b.isEmpty()) {
            return null;
        }
        return (C2678a) b.get(0);
    }

    /* renamed from: a */
    private static List<C2678a> m12695a(C2674a aVar, C2675b bVar) {
        ArrayList arrayList;
        String name;
        String str;
        C2674a aVar2 = aVar;
        C2675b bVar2 = bVar;
        try {
            arrayList = new ArrayList();
            String str2 = aVar2.f9164a;
            int a = bVar.mo9169a();
            boolean b = bVar.mo9172b();
            int i = 0;
            while (i < a) {
                MediaCodecInfo a2 = bVar2.mo9170a(i);
                name = a2.getName();
                if (m12696a(a2, name, b)) {
                    String[] supportedTypes = a2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        str = supportedTypes[i2];
                        if (str.equalsIgnoreCase(str2)) {
                            CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str);
                            boolean a3 = bVar2.mo9171a(str2, capabilitiesForType);
                            boolean b2 = m12700b(name);
                            if ((b && aVar2.f9165b == a3) || (!b && !aVar2.f9165b)) {
                                arrayList.add(C2678a.m12715a(name, str2, capabilitiesForType, b2));
                            } else if (!b && a3) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(name);
                                sb.append(".secure");
                                arrayList.add(C2678a.m12715a(sb.toString(), str2, capabilitiesForType, b2));
                                return arrayList;
                            }
                        }
                        i2++;
                        bVar2 = bVar;
                    }
                    continue;
                }
                i++;
                bVar2 = bVar;
            }
            return arrayList;
        } catch (Exception e) {
            if (C2511s.f8123a > 23 || arrayList.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to query codec ");
                sb2.append(name);
                sb2.append(" (");
                sb2.append(str);
                sb2.append(")");
                Log.e("MediaCodecUtil", sb2.toString());
                throw e;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Skipping codec ");
            sb3.append(name);
            sb3.append(" (failed to query capabilities)");
            Log.e("MediaCodecUtil", sb3.toString());
        } catch (Exception e2) {
            throw new DecoderQueryException(e2);
        }
    }

    /* renamed from: a */
    private static boolean m12696a(MediaCodecInfo mediaCodecInfo, String str, boolean z) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (C2511s.f8123a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (C2511s.f8123a < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (C2511s.f8123a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && "a70".equals(C2511s.f8124b)) {
            return false;
        }
        if (C2511s.f8123a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(C2511s.f8124b) || "protou".equals(C2511s.f8124b) || "ville".equals(C2511s.f8124b) || "villeplus".equals(C2511s.f8124b) || "villec2".equals(C2511s.f8124b) || C2511s.f8124b.startsWith("gee") || "C6602".equals(C2511s.f8124b) || "C6603".equals(C2511s.f8124b) || "C6606".equals(C2511s.f8124b) || "C6616".equals(C2511s.f8124b) || "L36h".equals(C2511s.f8124b) || "SO-02E".equals(C2511s.f8124b))) {
            return false;
        }
        if (C2511s.f8123a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(C2511s.f8124b) || "C1505".equals(C2511s.f8124b) || "C1604".equals(C2511s.f8124b) || "C1605".equals(C2511s.f8124b))) {
            return false;
        }
        if (C2511s.f8123a > 19 || !"OMX.SEC.vp8.dec".equals(str) || !"samsung".equals(C2511s.f8125c) || (!C2511s.f8124b.startsWith("d2") && !C2511s.f8124b.startsWith("serrano") && !C2511s.f8124b.startsWith("jflte") && !C2511s.f8124b.startsWith("santos") && !C2511s.f8124b.startsWith("t0"))) {
            return C2511s.f8123a > 19 || !C2511s.f8124b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(str);
        }
        return false;
    }

    /* renamed from: b */
    public static int m12697b() {
        if (f9163g == -1) {
            int i = 0;
            C2678a a = m12694a("video/avc", false);
            if (a != null) {
                CodecProfileLevel[] a2 = a.mo9176a();
                int length = a2.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m12690a(a2[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C2511s.f8123a >= 21 ? 345600 : 172800);
            }
            f9163g = i;
        }
        return f9163g;
    }

    /* renamed from: b */
    private static Pair<Integer, Integer> m12698b(String str, String[] strArr) {
        Integer num;
        Integer num2;
        if (strArr.length < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring malformed AVC codec string: ");
            sb.append(str);
            Log.w("MediaCodecUtil", sb.toString());
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
                num2 = valueOf;
            } else if (strArr.length >= 3) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
            } else {
                String str2 = "MediaCodecUtil";
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring malformed AVC codec string: ");
                sb2.append(str);
                Log.w(str2, sb2.toString());
                return null;
            }
            Integer valueOf2 = Integer.valueOf(f9160d.get(num2.intValue()));
            if (valueOf2 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown AVC profile: ");
                sb3.append(num2);
                Log.w("MediaCodecUtil", sb3.toString());
                return null;
            }
            Integer valueOf3 = Integer.valueOf(f9161e.get(num.intValue()));
            if (valueOf3 != null) {
                return new Pair<>(valueOf2, valueOf3);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown AVC level: ");
            sb4.append(num);
            Log.w("MediaCodecUtil", sb4.toString());
            return null;
        } catch (NumberFormatException unused) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Ignoring malformed AVC codec string: ");
            sb5.append(str);
            Log.w("MediaCodecUtil", sb5.toString());
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized List<C2678a> m12699b(String str, boolean z) {
        synchronized (MediaCodecUtil.class) {
            C2674a aVar = new C2674a(str, z);
            List<C2678a> list = (List) f9159c.get(aVar);
            if (list != null) {
                return list;
            }
            List a = m12695a(aVar, C2511s.f8123a >= 21 ? new C2677d(z) : new C2676c());
            if (z && a.isEmpty() && 21 <= C2511s.f8123a && C2511s.f8123a <= 23) {
                a = m12695a(aVar, (C2675b) new C2676c());
                if (!a.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(((C2678a) a.get(0)).f9168a);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List<C2678a> unmodifiableList = Collections.unmodifiableList(a);
            f9159c.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: b */
    private static boolean m12700b(String str) {
        return C2511s.f8123a <= 22 && (C2511s.f8126d.equals("ODROID-XU3") || C2511s.f8126d.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }
}
