package com.facebook.ads.internal.p077s.p078a;

import android.content.Context;
import android.media.AudioManager;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.s.a.q */
public class C1807q {
    /* renamed from: a */
    public static float m8927a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                return (((float) streamVolume) * 1.0f) / ((float) streamMaxVolume);
            }
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m8928a(Map<String, String> map, boolean z, boolean z2) {
        map.put("autoplay", z ? "1" : "0");
        map.put("inline", z2 ? "1" : "0");
    }
}
