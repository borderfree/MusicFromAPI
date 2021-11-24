package com.bumptech.glide.load.p044b;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.s */
public class C1355s<Data> implements C1343n<Integer, Data> {

    /* renamed from: a */
    private final C1343n<Uri, Data> f4609a;

    /* renamed from: b */
    private final Resources f4610b;

    /* renamed from: com.bumptech.glide.load.b.s$a */
    public static final class C1356a implements C1345o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f4611a;

        public C1356a(Resources resources) {
            this.f4611a = resources;
        }

        /* renamed from: a */
        public C1343n<Integer, AssetFileDescriptor> mo5975a(C1351r rVar) {
            return new C1355s(this.f4611a, rVar.mo6038a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.s$b */
    public static class C1357b implements C1345o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f4612a;

        public C1357b(Resources resources) {
            this.f4612a = resources;
        }

        /* renamed from: a */
        public C1343n<Integer, ParcelFileDescriptor> mo5975a(C1351r rVar) {
            return new C1355s(this.f4612a, rVar.mo6038a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.s$c */
    public static class C1358c implements C1345o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f4613a;

        public C1358c(Resources resources) {
            this.f4613a = resources;
        }

        /* renamed from: a */
        public C1343n<Integer, InputStream> mo5975a(C1351r rVar) {
            return new C1355s(this.f4613a, rVar.mo6038a(Uri.class, InputStream.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.b.s$d */
    public static class C1359d implements C1345o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f4614a;

        public C1359d(Resources resources) {
            this.f4614a = resources;
        }

        /* renamed from: a */
        public C1343n<Integer, Uri> mo5975a(C1351r rVar) {
            return new C1355s(this.f4614a, C1365v.m7017a());
        }
    }

    public C1355s(Resources resources, C1343n<Uri, Data> nVar) {
        this.f4610b = resources;
        this.f4609a = nVar;
    }

    /* renamed from: b */
    private Uri m6997b(Integer num) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("android.resource://");
            sb.append(this.f4610b.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.f4610b.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.f4610b.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received invalid resource id: ");
                sb2.append(num);
                Log.w("ResourceLoader", sb2.toString(), e);
            }
            return null;
        }
    }

    /* renamed from: a */
    public C1344a<Data> mo5971a(Integer num, int i, int i2, C1379e eVar) {
        Uri b = m6997b(num);
        if (b == null) {
            return null;
        }
        return this.f4609a.mo5971a(b, i, i2, eVar);
    }

    /* renamed from: a */
    public boolean mo5973a(Integer num) {
        return true;
    }
}
