package com.bumptech.glide.load.p044b;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p042a.C1272d;
import com.bumptech.glide.load.p042a.C1272d.C1273a;
import com.bumptech.glide.load.p044b.C1343n.C1344a;
import com.bumptech.glide.p039f.C1230b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.b.f */
public class C1321f<Data> implements C1343n<File, Data> {

    /* renamed from: a */
    private final C1326d<Data> f4552a;

    /* renamed from: com.bumptech.glide.load.b.f$a */
    public static class C1322a<Data> implements C1345o<File, Data> {

        /* renamed from: a */
        private final C1326d<Data> f4553a;

        public C1322a(C1326d<Data> dVar) {
            this.f4553a = dVar;
        }

        /* renamed from: a */
        public final C1343n<File, Data> mo5975a(C1351r rVar) {
            return new C1321f(this.f4553a);
        }
    }

    /* renamed from: com.bumptech.glide.load.b.f$b */
    public static class C1323b extends C1322a<ParcelFileDescriptor> {
        public C1323b() {
            super(new C1326d<ParcelFileDescriptor>() {
                /* renamed from: a */
                public ParcelFileDescriptor mo6006b(File file) {
                    return ParcelFileDescriptor.open(file, 268435456);
                }

                /* renamed from: a */
                public Class<ParcelFileDescriptor> mo6003a() {
                    return ParcelFileDescriptor.class;
                }

                /* renamed from: a */
                public void mo6005a(ParcelFileDescriptor parcelFileDescriptor) {
                    parcelFileDescriptor.close();
                }
            });
        }
    }

    /* renamed from: com.bumptech.glide.load.b.f$c */
    private static final class C1325c<Data> implements C1272d<Data> {

        /* renamed from: a */
        private final File f4554a;

        /* renamed from: b */
        private final C1326d<Data> f4555b;

        /* renamed from: c */
        private Data f4556c;

        C1325c(File file, C1326d<Data> dVar) {
            this.f4554a = file;
            this.f4555b = dVar;
        }

        /* renamed from: a */
        public Class<Data> mo5924a() {
            return this.f4555b.mo6003a();
        }

        /* renamed from: a */
        public void mo5931a(Priority priority, C1273a<? super Data> aVar) {
            try {
                this.f4556c = this.f4555b.mo6006b(this.f4554a);
                aVar.mo5946a(this.f4556c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                aVar.mo5945a((Exception) e);
            }
        }

        /* renamed from: b */
        public void mo5932b() {
            if (this.f4556c != null) {
                try {
                    this.f4555b.mo6005a(this.f4556c);
                } catch (IOException unused) {
                }
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

    /* renamed from: com.bumptech.glide.load.b.f$d */
    public interface C1326d<Data> {
        /* renamed from: a */
        Class<Data> mo6003a();

        /* renamed from: a */
        void mo6005a(Data data);

        /* renamed from: b */
        Data mo6006b(File file);
    }

    /* renamed from: com.bumptech.glide.load.b.f$e */
    public static class C1327e extends C1322a<InputStream> {
        public C1327e() {
            super(new C1326d<InputStream>() {
                /* renamed from: a */
                public InputStream mo6006b(File file) {
                    return new FileInputStream(file);
                }

                /* renamed from: a */
                public Class<InputStream> mo6003a() {
                    return InputStream.class;
                }

                /* renamed from: a */
                public void mo6005a(InputStream inputStream) {
                    inputStream.close();
                }
            });
        }
    }

    public C1321f(C1326d<Data> dVar) {
        this.f4552a = dVar;
    }

    /* renamed from: a */
    public C1344a<Data> mo5971a(File file, int i, int i2, C1379e eVar) {
        return new C1344a<>(new C1230b(file), new C1325c(file, this.f4552a));
    }

    /* renamed from: a */
    public boolean mo5973a(File file) {
        return true;
    }
}
