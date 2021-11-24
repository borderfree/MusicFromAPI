package com.bumptech.glide.load.p044b;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p042a.C1262a;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1281i;
import com.bumptech.glide.load.p042a.C1289n;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p039f.C1230b;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.b.w */
public class C1368w<Data> implements C1343n<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f4620a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));

    /* renamed from: b */
    private final C1371c<Data> f4621b;

    /* renamed from: com.bumptech.glide.load.b.w$a */
    public static final class C1369a implements C1345o<Uri, AssetFileDescriptor>, C1371c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f4622a;

        public C1369a(ContentResolver contentResolver) {
            this.f4622a = contentResolver;
        }

        /* renamed from: a */
        public C1272d<AssetFileDescriptor> mo6052a(Uri uri) {
            return new C1262a(this.f4622a, uri);
        }

        /* renamed from: a */
        public C1343n<Uri, AssetFileDescriptor> mo5975a(C1351r rVar) {
            return new C1368w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.w$b */
    public static class C1370b implements C1345o<Uri, ParcelFileDescriptor>, C1371c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f4623a;

        public C1370b(ContentResolver contentResolver) {
            this.f4623a = contentResolver;
        }

        /* renamed from: a */
        public C1272d<ParcelFileDescriptor> mo6052a(Uri uri) {
            return new C1281i(this.f4623a, uri);
        }

        /* renamed from: a */
        public C1343n<Uri, ParcelFileDescriptor> mo5975a(C1351r rVar) {
            return new C1368w(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.w$c */
    public interface C1371c<Data> {
        /* renamed from: a */
        C1272d<Data> mo6052a(Uri uri);
    }

    /* renamed from: com.bumptech.glide.load.b.w$d */
    public static class C1372d implements C1345o<Uri, InputStream>, C1371c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f4624a;

        public C1372d(ContentResolver contentResolver) {
            this.f4624a = contentResolver;
        }

        /* renamed from: a */
        public C1272d<InputStream> mo6052a(Uri uri) {
            return new C1289n(this.f4624a, uri);
        }

        /* renamed from: a */
        public C1343n<Uri, InputStream> mo5975a(C1351r rVar) {
            return new C1368w(this);
        }
    }

    public C1368w(C1371c<Data> cVar) {
        this.f4621b = cVar;
    }

    /* renamed from: a */
    public C1344a<Data> mo5971a(Uri uri, int i, int i2, C1379e eVar) {
        return new C1344a<>(new C1230b(uri), this.f4621b.mo6052a(uri));
    }

    /* renamed from: a */
    public boolean mo5973a(Uri uri) {
        return f4620a.contains(uri.getScheme());
    }
}
