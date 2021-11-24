package com.pollfish.p149e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.pollfish.main.PollFish;
import com.pollfish.p150f.C5162b;
import com.pollfish.p150f.C5166c;
import java.net.URL;

/* renamed from: com.pollfish.e.a */
public class C5147a {
    /* renamed from: a */
    public static Bitmap m25456a(Context context) {
        Bitmap a = m25457a(context, "images/pollfish_indicator_left.png", "pollfish_indicator_left", false);
        if (a != null) {
            try {
                int a2 = C5166c.m25528a(a, "indicator_left.png");
                StringBuilder sb = new StringBuilder();
                sb.append("indic_left hashBtmp: ");
                sb.append(a2);
                C5162b.m25518a("ResImages", sb.toString());
                if (a2 == -1491025382) {
                    C5162b.m25518a("ResImages", "indic_left approved");
                    return a;
                }
                Log.w("Pollfish", "You should not change the images of the library");
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("indic_left approved error: ");
                sb2.append(e);
                C5162b.m25519b("ResImages", sb2.toString());
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Bitmap m25457a(Context context, String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("getBitmap with name: ");
        sb.append(str);
        C5162b.m25518a("ResImages", sb.toString());
        URL resource = PollFish.class.getClassLoader().getResource(str);
        Options options = new Options();
        options.inScaled = z;
        if (resource == null) {
            C5162b.m25518a("ResImages", "getBitmap url == null");
            C5162b.m25518a("ResImages", "getBitmap decodeResource");
            int identifier = context.getResources().getIdentifier(str2, "drawable", context.getPackageName());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getBitmap context.getPackageName(): ");
            sb2.append(context.getPackageName());
            C5162b.m25518a("ResImages", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("getBitmap resId: ");
            sb3.append(str2);
            C5162b.m25518a("ResImages", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("getBitmap resourceID: ");
            sb4.append(identifier);
            C5162b.m25518a("ResImages", sb4.toString());
            return BitmapFactory.decodeResource(context.getResources(), identifier, options);
        }
        C5162b.m25518a("ResImages", "getBitmap url != null");
        try {
            C5162b.m25518a("ResImages", "getBitmap decodeStream");
            return BitmapFactory.decodeStream(resource.openStream(), null, options);
        } catch (Exception unused) {
            new RuntimeException("BITMAP NOT DECODED");
            return null;
        }
    }

    /* renamed from: a */
    public static Drawable m25458a(Context context, Bitmap bitmap) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: b */
    public static Bitmap m25459b(Context context) {
        Bitmap a = m25457a(context, "images/pollfish_indicator_right.png", "pollfish_indicator_right", false);
        if (a != null) {
            try {
                int a2 = C5166c.m25528a(a, "indicator_right.png");
                StringBuilder sb = new StringBuilder();
                sb.append("indicator_right hashBtmp: ");
                sb.append(a2);
                C5162b.m25518a("ResImages", sb.toString());
                if (a2 == 264519317) {
                    C5162b.m25518a("ResImages", "indicator_right approved");
                    return a;
                }
                Log.w("Pollfish", "You should not change the images of the library");
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("indicator_right approved error: ");
                sb2.append(e);
                C5162b.m25519b("ResImages", sb2.toString());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Bitmap m25460c(Context context) {
        Bitmap a = m25457a(context, "images/pollfish_indicator_win_left.png", "pollfish_indicator_win_left", false);
        if (a != null) {
            try {
                int a2 = C5166c.m25528a(a, "indicator_win_left.png");
                StringBuilder sb = new StringBuilder();
                sb.append("indicator_win_left hashBtmp: ");
                sb.append(a2);
                C5162b.m25518a("ResImages", sb.toString());
                if (a2 == -1942405355) {
                    C5162b.m25518a("ResImages", "indicator_win_left approved");
                    return a;
                }
                Log.w("Pollfish", "You should not change the images of the library");
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("indicator_win_left approved error: ");
                sb2.append(e);
                C5162b.m25519b("ResImages", sb2.toString());
            }
        }
        return null;
    }

    /* renamed from: d */
    public static Bitmap m25461d(Context context) {
        Bitmap a = m25457a(context, "images/pollfish_indicator_win_right.png", "pollfish_indicator_win_right", false);
        if (a != null) {
            try {
                int a2 = C5166c.m25528a(a, "indicator_win_right.png");
                StringBuilder sb = new StringBuilder();
                sb.append("indicator_win_right hashBtmp: ");
                sb.append(a2);
                C5162b.m25518a("ResImages", sb.toString());
                if (a2 == -1130941472) {
                    C5162b.m25518a("ResImages", "indicator_win_right approved");
                    return a;
                }
                Log.w("Pollfish", "You should not change the images of the library");
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("indicator_win_right approved error: ");
                sb2.append(e);
                C5162b.m25519b("ResImages", sb2.toString());
            }
        }
        return null;
    }
}
