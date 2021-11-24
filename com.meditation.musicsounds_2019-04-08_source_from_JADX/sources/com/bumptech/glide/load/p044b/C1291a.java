package com.bumptech.glide.load.p044b;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1280h;
import com.bumptech.glide.load.p042a.C1288m;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p039f.C1230b;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.a */
public class C1291a<Data> implements C1343n<Uri, Data> {

    /* renamed from: a */
    private static final int f4525a = "file:///android_asset/".length();

    /* renamed from: b */
    private final AssetManager f4526b;

    /* renamed from: c */
    private final C1292a<Data> f4527c;

    /* renamed from: com.bumptech.glide.load.b.a$a */
    public interface C1292a<Data> {
        /* renamed from: a */
        C1272d<Data> mo5974a(AssetManager assetManager, String str);
    }

    /* renamed from: com.bumptech.glide.load.b.a$b */
    public static class C1293b implements C1292a<ParcelFileDescriptor>, C1345o<Uri, ParcelFileDescriptor> {

        /* renamed from: a */
        private final AssetManager f4528a;

        public C1293b(AssetManager assetManager) {
            this.f4528a = assetManager;
        }

        /* renamed from: a */
        public C1272d<ParcelFileDescriptor> mo5974a(AssetManager assetManager, String str) {
            return new C1280h(assetManager, str);
        }

        /* renamed from: a */
        public C1343n<Uri, ParcelFileDescriptor> mo5975a(C1351r rVar) {
            return new C1291a(this.f4528a, this);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.a$c */
    public static class C1294c implements C1292a<InputStream>, C1345o<Uri, InputStream> {

        /* renamed from: a */
        private final AssetManager f4529a;

        public C1294c(AssetManager assetManager) {
            this.f4529a = assetManager;
        }

        /* renamed from: a */
        public C1272d<InputStream> mo5974a(AssetManager assetManager, String str) {
            return new C1288m(assetManager, str);
        }

        /* renamed from: a */
        public C1343n<Uri, InputStream> mo5975a(C1351r rVar) {
            return new C1291a(this.f4529a, this);
        }
    }

    public C1291a(AssetManager assetManager, C1292a<Data> aVar) {
        this.f4526b = assetManager;
        this.f4527c = aVar;
    }

    /* renamed from: a */
    public C1344a<Data> mo5971a(Uri uri, int i, int i2, C1379e eVar) {
        return new C1344a<>(new C1230b(uri), this.f4527c.mo5974a(this.f4526b, uri.toString().substring(f4525a)));
    }

    /* renamed from: a */
    public boolean mo5973a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
