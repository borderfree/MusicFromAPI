package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: com.google.android.exoplayer2.audio.b */
public final class C2451b {

    /* renamed from: a */
    public static final C2451b f7898a = new C2451b(new int[]{2}, 2);

    /* renamed from: b */
    private final int[] f7899b;

    /* renamed from: c */
    private final int f7900c;

    C2451b(int[] iArr, int i) {
        if (iArr != null) {
            this.f7899b = Arrays.copyOf(iArr, iArr.length);
            Arrays.sort(this.f7899b);
        } else {
            this.f7899b = new int[0];
        }
        this.f7900c = i;
    }

    /* renamed from: a */
    public static C2451b m11493a(Context context) {
        return m11494a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    static C2451b m11494a(Intent intent) {
        return (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f7898a : new C2451b(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
    }

    /* renamed from: a */
    public boolean mo8711a(int i) {
        return Arrays.binarySearch(this.f7899b, i) >= 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2451b)) {
            return false;
        }
        C2451b bVar = (C2451b) obj;
        if (!Arrays.equals(this.f7899b, bVar.f7899b) || this.f7900c != bVar.f7900c) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f7900c + (Arrays.hashCode(this.f7899b) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(this.f7900c);
        sb.append(", supportedEncodings=");
        sb.append(Arrays.toString(this.f7899b));
        sb.append("]");
        return sb.toString();
    }
}
