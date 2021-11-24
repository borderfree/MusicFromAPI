package com.bumptech.glide.load.p044b;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.u */
public class C1361u<Data> implements C1343n<String, Data> {

    /* renamed from: a */
    private final C1343n<Uri, Data> f4616a;

    /* renamed from: com.bumptech.glide.load.b.u$a */
    public static final class C1362a implements C1345o<String, AssetFileDescriptor> {
        /* renamed from: a */
        public C1343n<String, AssetFileDescriptor> mo5975a(C1351r rVar) {
            return new C1361u(rVar.mo6038a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.u$b */
    public static class C1363b implements C1345o<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public C1343n<String, ParcelFileDescriptor> mo5975a(C1351r rVar) {
            return new C1361u(rVar.mo6038a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.u$c */
    public static class C1364c implements C1345o<String, InputStream> {
        /* renamed from: a */
        public C1343n<String, InputStream> mo5975a(C1351r rVar) {
            return new C1361u(rVar.mo6038a(Uri.class, InputStream.class));
        }
    }

    public C1361u(C1343n<Uri, Data> nVar) {
        this.f4616a = nVar;
    }

    /* renamed from: b */
    private static Uri m7008b(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                uri = parse;
                return uri;
            }
        }
        uri = m7009c(str);
        return uri;
    }

    /* renamed from: c */
    private static Uri m7009c(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: a */
    public C1344a<Data> mo5971a(String str, int i, int i2, C1379e eVar) {
        Uri b = m7008b(str);
        if (b == null) {
            return null;
        }
        return this.f4616a.mo5971a(b, i, i2, eVar);
    }

    /* renamed from: a */
    public boolean mo5973a(String str) {
        return true;
    }
}
