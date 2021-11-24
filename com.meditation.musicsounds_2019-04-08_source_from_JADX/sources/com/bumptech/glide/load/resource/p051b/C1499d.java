package com.bumptech.glide.load.resource.p051b;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.engine.C1482s;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.b.d */
public class C1499d implements C1488f<Uri, Drawable> {

    /* renamed from: a */
    private final Context f4942a;

    public C1499d(Context context) {
        this.f4942a = context.getApplicationContext();
    }

    /* renamed from: a */
    private int m7485a(Uri uri) {
        Integer num;
        List pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            num = Integer.valueOf(this.f4942a.getResources().getIdentifier(str2, str, uri.getAuthority()));
        } else {
            if (pathSegments.size() == 1) {
                try {
                    num = Integer.valueOf((String) pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            num = null;
        }
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized Uri format: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString());
        } else if (num.intValue() != 0) {
            return num.intValue();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to obtain resource id for: ");
            sb2.append(uri);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private Context m7486a(Uri uri, String str) {
        try {
            return this.f4942a.createPackageContext(str, 0);
        } catch (NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to obtain context or unrecognized Uri format for: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public C1482s<Drawable> mo6289a(Uri uri, int i, int i2, C1379e eVar) {
        int a = m7485a(uri);
        String authority = uri.getAuthority();
        return C1498c.m7481a(C1496a.m7474a(this.f4942a, authority.equals(this.f4942a.getPackageName()) ? this.f4942a : m7486a(uri, authority), a));
    }

    /* renamed from: a */
    public boolean mo6290a(Uri uri, C1379e eVar) {
        return uri.getScheme().equals("android.resource");
    }
}
