package com.bumptech.glide.load.p044b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p042a.p043a.C1264b;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p039f.C1230b;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bumptech.glide.load.b.k */
public final class C1336k implements C1343n<Uri, File> {

    /* renamed from: a */
    private final Context f4574a;

    /* renamed from: com.bumptech.glide.load.b.k$a */
    public static final class C1337a implements C1345o<Uri, File> {

        /* renamed from: a */
        private final Context f4575a;

        public C1337a(Context context) {
            this.f4575a = context;
        }

        /* renamed from: a */
        public C1343n<Uri, File> mo5975a(C1351r rVar) {
            return new C1336k(this.f4575a);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.k$b */
    private static class C1338b implements C1272d<File> {

        /* renamed from: a */
        private static final String[] f4576a = {"_data"};

        /* renamed from: b */
        private final Context f4577b;

        /* renamed from: c */
        private final Uri f4578c;

        C1338b(Context context, Uri uri) {
            this.f4577b = context;
            this.f4578c = uri;
        }

        /* renamed from: a */
        public Class<File> mo5924a() {
            return File.class;
        }

        /* renamed from: a */
        public void mo5931a(Priority priority, C1273a<? super File> aVar) {
            Cursor query = this.f4577b.getContentResolver().query(this.f4578c, f4576a, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find file path for: ");
                sb.append(this.f4578c);
                aVar.mo5945a((Exception) new FileNotFoundException(sb.toString()));
                return;
            }
            aVar.mo5946a(new File(str));
        }

        /* renamed from: b */
        public void mo5932b() {
        }

        /* renamed from: c */
        public void mo5933c() {
        }

        /* renamed from: d */
        public DataSource mo5934d() {
            return DataSource.LOCAL;
        }
    }

    public C1336k(Context context) {
        this.f4574a = context;
    }

    /* renamed from: a */
    public C1344a<File> mo5971a(Uri uri, int i, int i2, C1379e eVar) {
        return new C1344a<>(new C1230b(uri), new C1338b(this.f4574a, uri));
    }

    /* renamed from: a */
    public boolean mo5973a(Uri uri) {
        return C1264b.m6731a(uri);
    }
}
