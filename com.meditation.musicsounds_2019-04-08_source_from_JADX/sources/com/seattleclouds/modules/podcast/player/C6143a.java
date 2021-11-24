package com.seattleclouds.modules.podcast.player;

import android.content.Context;

/* renamed from: com.seattleclouds.modules.podcast.player.a */
public class C6143a {

    /* renamed from: a */
    private static String f21784a;

    /* renamed from: b */
    private static String f21785b;

    /* renamed from: c */
    private static String f21786c;

    /* renamed from: d */
    private static String f21787d;

    /* renamed from: e */
    private static String f21788e;

    /* renamed from: f */
    private static String f21789f;

    /* renamed from: g */
    private static String f21790g;

    /* renamed from: h */
    private static String f21791h;

    /* renamed from: i */
    private static String f21792i;

    /* renamed from: j */
    private static String f21793j;

    /* renamed from: k */
    private static String f21794k;

    /* renamed from: l */
    private static String f21795l;

    /* renamed from: m */
    private static String f21796m;

    /* renamed from: n */
    private static String f21797n;

    /* renamed from: o */
    private static String f21798o;

    /* renamed from: a */
    public static String m29998a(Context context) {
        if (f21784a != null) {
            return f21784a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_TOGGLE_PLAY");
        f21784a = sb.toString();
        return f21784a;
    }

    /* renamed from: b */
    public static String m29999b(Context context) {
        if (f21785b != null) {
            return f21785b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_PLAY");
        f21785b = sb.toString();
        return f21785b;
    }

    /* renamed from: c */
    public static String m30000c(Context context) {
        if (f21786c != null) {
            return f21786c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_PAUSE");
        f21786c = sb.toString();
        return f21786c;
    }

    /* renamed from: d */
    public static String m30001d(Context context) {
        if (f21787d != null) {
            return f21787d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_STOP");
        f21787d = sb.toString();
        return f21787d;
    }

    /* renamed from: e */
    public static String m30002e(Context context) {
        if (f21788e != null) {
            return f21788e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_SET_URL");
        f21788e = sb.toString();
        return f21788e;
    }

    /* renamed from: f */
    public static String m30003f(Context context) {
        if (f21789f != null) {
            return f21789f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_REWIND");
        f21789f = sb.toString();
        return f21789f;
    }

    /* renamed from: g */
    public static String m30004g(Context context) {
        if (f21790g != null) {
            return f21790g;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_FAST_FORWARD");
        f21790g = sb.toString();
        return f21790g;
    }

    /* renamed from: h */
    public static String m30005h(Context context) {
        if (f21791h != null) {
            return f21791h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_MEDIA_ERROR");
        f21791h = sb.toString();
        return f21791h;
    }

    /* renamed from: i */
    public static String m30006i(Context context) {
        if (f21792i != null) {
            return f21792i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_PREPARING");
        f21792i = sb.toString();
        return f21792i;
    }

    /* renamed from: j */
    public static String m30007j(Context context) {
        if (f21793j != null) {
            return f21793j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_PREPARED");
        f21793j = sb.toString();
        return f21793j;
    }

    /* renamed from: k */
    public static String m30008k(Context context) {
        if (f21794k != null) {
            return f21794k;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_SEEK_COMPLETE");
        f21794k = sb.toString();
        return f21794k;
    }

    /* renamed from: l */
    public static String m30009l(Context context) {
        if (f21795l != null) {
            return f21795l;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_BUFFER_START");
        f21795l = sb.toString();
        return f21795l;
    }

    /* renamed from: m */
    public static String m30010m(Context context) {
        if (f21796m != null) {
            return f21796m;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_BUFFER_END");
        f21796m = sb.toString();
        return f21796m;
    }

    /* renamed from: n */
    public static String m30011n(Context context) {
        if (f21797n != null) {
            return f21797n;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_BUFFER_UPDATE");
        f21797n = sb.toString();
        return f21797n;
    }

    /* renamed from: o */
    public static String m30012o(Context context) {
        if (f21798o != null) {
            return f21798o;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".modules.podcast.player.ACTION_COMPLETE");
        f21798o = sb.toString();
        return f21798o;
    }
}
