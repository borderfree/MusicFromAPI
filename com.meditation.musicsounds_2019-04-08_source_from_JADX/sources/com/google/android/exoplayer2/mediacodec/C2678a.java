package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2495h;
import com.google.android.exoplayer2.p102c.C2511s;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.mediacodec.a */
public final class C2678a {

    /* renamed from: a */
    public final String f9168a;

    /* renamed from: b */
    public final boolean f9169b;

    /* renamed from: c */
    public final boolean f9170c;

    /* renamed from: d */
    private final String f9171d;

    /* renamed from: e */
    private final CodecCapabilities f9172e;

    private C2678a(String str, String str2, CodecCapabilities codecCapabilities, boolean z) {
        this.f9168a = (String) C2488a.m11664a(str);
        this.f9171d = str2;
        this.f9172e = codecCapabilities;
        boolean z2 = true;
        this.f9169b = !z && codecCapabilities != null && m12716a(codecCapabilities);
        if (codecCapabilities == null || !m12720c(codecCapabilities)) {
            z2 = false;
        }
        this.f9170c = z2;
    }

    /* renamed from: a */
    public static C2678a m12714a(String str) {
        return new C2678a(str, null, null, false);
    }

    /* renamed from: a */
    public static C2678a m12715a(String str, String str2, CodecCapabilities codecCapabilities, boolean z) {
        return new C2678a(str, str2, codecCapabilities, z);
    }

    /* renamed from: a */
    private static boolean m12716a(CodecCapabilities codecCapabilities) {
        return C2511s.f8123a >= 19 && m12718b(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static boolean m12717a(VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m12718b(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: c */
    private void m12719c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.f9168a);
        sb.append(", ");
        sb.append(this.f9171d);
        sb.append("] [");
        sb.append(C2511s.f8127e);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    /* renamed from: c */
    private static boolean m12720c(CodecCapabilities codecCapabilities) {
        return C2511s.f8123a >= 21 && m12722d(codecCapabilities);
    }

    /* renamed from: d */
    private void m12721d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.f9168a);
        sb.append(", ");
        sb.append(this.f9171d);
        sb.append("] [");
        sb.append(C2511s.f8127e);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    /* renamed from: d */
    private static boolean m12722d(CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    @TargetApi(21)
    /* renamed from: a */
    public Point mo9173a(int i, int i2) {
        String str;
        if (this.f9172e == null) {
            str = "align.caps";
        } else {
            VideoCapabilities videoCapabilities = this.f9172e.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "align.vCaps";
            } else {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(C2511s.m11797a(i, widthAlignment) * widthAlignment, C2511s.m11797a(i2, heightAlignment) * heightAlignment);
            }
        }
        m12719c(str);
        return null;
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean mo9174a(int i) {
        String sb;
        if (this.f9172e == null) {
            sb = "sampleRate.caps";
        } else {
            AudioCapabilities audioCapabilities = this.f9172e.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i)) {
                return true;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("sampleRate.support, ");
                sb2.append(i);
                sb = sb2.toString();
            }
        }
        m12719c(sb);
        return false;
    }

    @TargetApi(21)
    /* renamed from: a */
    public boolean mo9175a(int i, int i2, double d) {
        String sb;
        if (this.f9172e == null) {
            sb = "sizeAndRate.caps";
        } else {
            VideoCapabilities videoCapabilities = this.f9172e.getVideoCapabilities();
            if (videoCapabilities == null) {
                sb = "sizeAndRate.vCaps";
            } else {
                if (!m12717a(videoCapabilities, i, i2, d)) {
                    if (i >= i2 || !m12717a(videoCapabilities, i2, i, d)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("sizeAndRate.support, ");
                        sb2.append(i);
                        sb2.append("x");
                        sb2.append(i2);
                        sb2.append("x");
                        sb2.append(d);
                        sb = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("sizeAndRate.rotated, ");
                        sb3.append(i);
                        sb3.append("x");
                        sb3.append(i2);
                        sb3.append("x");
                        sb3.append(d);
                        m12721d(sb3.toString());
                    }
                }
                return true;
            }
        }
        m12719c(sb);
        return false;
    }

    /* renamed from: a */
    public CodecProfileLevel[] mo9176a() {
        return (this.f9172e == null || this.f9172e.profileLevels == null) ? new CodecProfileLevel[0] : this.f9172e.profileLevels;
    }

    @TargetApi(21)
    /* renamed from: b */
    public boolean mo9177b(int i) {
        String sb;
        if (this.f9172e == null) {
            sb = "channelCount.caps";
        } else {
            AudioCapabilities audioCapabilities = this.f9172e.getAudioCapabilities();
            if (audioCapabilities == null) {
                sb = "channelCount.aCaps";
            } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
                return true;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("channelCount.support, ");
                sb2.append(i);
                sb = sb2.toString();
            }
        }
        m12719c(sb);
        return false;
    }

    /* renamed from: b */
    public boolean mo9178b(String str) {
        CodecProfileLevel[] a;
        StringBuilder sb;
        String str2;
        if (str == null || this.f9171d == null) {
            return true;
        }
        String d = C2495h.m11695d(str);
        if (d == null) {
            return true;
        }
        if (!this.f9171d.equals(d)) {
            sb = new StringBuilder();
            str2 = "codec.mime ";
        } else {
            Pair a2 = MediaCodecUtil.m12691a(str);
            if (a2 == null) {
                return true;
            }
            for (CodecProfileLevel codecProfileLevel : mo9176a()) {
                if (codecProfileLevel.profile == ((Integer) a2.first).intValue() && codecProfileLevel.level >= ((Integer) a2.second).intValue()) {
                    return true;
                }
            }
            sb = new StringBuilder();
            str2 = "codec.profileLevel, ";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", ");
        sb.append(d);
        m12719c(sb.toString());
        return false;
    }
}
