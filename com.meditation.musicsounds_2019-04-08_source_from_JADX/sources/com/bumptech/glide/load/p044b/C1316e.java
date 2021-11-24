package com.bumptech.glide.load.p044b;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p039f.C1230b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.e */
public final class C1316e<Model, Data> implements C1343n<Model, Data> {

    /* renamed from: a */
    private final C1317a<Data> f4546a;

    /* renamed from: com.bumptech.glide.load.b.e$a */
    public interface C1317a<Data> {
        /* renamed from: a */
        Class<Data> mo5995a();

        /* renamed from: a */
        Data mo5996a(String str);

        /* renamed from: a */
        void mo5997a(Data data);
    }

    /* renamed from: com.bumptech.glide.load.b.e$b */
    private static final class C1318b<Data> implements C1272d<Data> {

        /* renamed from: a */
        private final String f4547a;

        /* renamed from: b */
        private final C1317a<Data> f4548b;

        /* renamed from: c */
        private Data f4549c;

        C1318b(String str, C1317a<Data> aVar) {
            this.f4547a = str;
            this.f4548b = aVar;
        }

        /* renamed from: a */
        public Class<Data> mo5924a() {
            return this.f4548b.mo5995a();
        }

        /* renamed from: a */
        public void mo5931a(Priority priority, C1273a<? super Data> aVar) {
            try {
                this.f4549c = this.f4548b.mo5996a(this.f4547a);
                aVar.mo5946a(this.f4549c);
            } catch (IllegalArgumentException e) {
                aVar.mo5945a((Exception) e);
            }
        }

        /* renamed from: b */
        public void mo5932b() {
            try {
                this.f4548b.mo5997a(this.f4549c);
            } catch (IOException unused) {
            }
        }

        /* renamed from: c */
        public void mo5933c() {
        }

        /* renamed from: d */
        public DataSource mo5934d() {
            return DataSource.LOCAL;
        }
    }

    /* renamed from: com.bumptech.glide.load.b.e$c */
    public static final class C1319c<Model> implements C1345o<Model, InputStream> {

        /* renamed from: a */
        private final C1317a<InputStream> f4550a = new C1317a<InputStream>() {
            /* renamed from: a */
            public Class<InputStream> mo5995a() {
                return InputStream.class;
            }

            /* renamed from: a */
            public void mo5997a(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: b */
            public InputStream mo5996a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        };

        /* renamed from: a */
        public C1343n<Model, InputStream> mo5975a(C1351r rVar) {
            return new C1316e(this.f4550a);
        }
    }

    public C1316e(C1317a<Data> aVar) {
        this.f4546a = aVar;
    }

    /* renamed from: a */
    public C1344a<Data> mo5971a(Model model, int i, int i2, C1379e eVar) {
        return new C1344a<>(new C1230b(model), new C1318b(model.toString(), this.f4546a));
    }

    /* renamed from: a */
    public boolean mo5973a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
