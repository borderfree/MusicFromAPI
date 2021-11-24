package android.support.p009v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
class C0550e {

    /* renamed from: android.support.v4.media.session.e$a */
    static final class C0551a {
        /* renamed from: a */
        public static String m2544a(Object obj) {
            return ((CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static CharSequence m2545b(Object obj) {
            return ((CustomAction) obj).getName();
        }

        /* renamed from: c */
        public static int m2546c(Object obj) {
            return ((CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static Bundle m2547d(Object obj) {
            return ((CustomAction) obj).getExtras();
        }
    }

    /* renamed from: a */
    public static int m2535a(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* renamed from: b */
    public static long m2536b(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: c */
    public static long m2537c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static float m2538d(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: e */
    public static long m2539e(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: f */
    public static CharSequence m2540f(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: g */
    public static long m2541g(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: h */
    public static List<Object> m2542h(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: i */
    public static long m2543i(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }
}
