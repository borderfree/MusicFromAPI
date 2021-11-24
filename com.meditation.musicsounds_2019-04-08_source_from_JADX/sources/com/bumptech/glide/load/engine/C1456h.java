package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.bumptech.glide.load.engine.h */
public abstract class C1456h {

    /* renamed from: a */
    public static final C1456h f4827a = new C1456h() {
        /* renamed from: a */
        public boolean mo6241a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo6242a(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        /* renamed from: a */
        public boolean mo6243a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: b */
        public boolean mo6244b() {
            return true;
        }
    };

    /* renamed from: b */
    public static final C1456h f4828b = new C1456h() {
        /* renamed from: a */
        public boolean mo6241a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo6242a(DataSource dataSource) {
            return false;
        }

        /* renamed from: a */
        public boolean mo6243a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        /* renamed from: b */
        public boolean mo6244b() {
            return false;
        }
    };

    /* renamed from: c */
    public static final C1456h f4829c = new C1456h() {
        /* renamed from: a */
        public boolean mo6241a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo6242a(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: a */
        public boolean mo6243a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        /* renamed from: b */
        public boolean mo6244b() {
            return true;
        }
    };

    /* renamed from: d */
    public static final C1456h f4830d = new C1456h() {
        /* renamed from: a */
        public boolean mo6241a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo6242a(DataSource dataSource) {
            return false;
        }

        /* renamed from: a */
        public boolean mo6243a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: b */
        public boolean mo6244b() {
            return false;
        }
    };

    /* renamed from: e */
    public static final C1456h f4831e = new C1456h() {
        /* renamed from: a */
        public boolean mo6241a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo6242a(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        /* renamed from: a */
        public boolean mo6243a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }

        /* renamed from: b */
        public boolean mo6244b() {
            return true;
        }
    };

    /* renamed from: a */
    public abstract boolean mo6241a();

    /* renamed from: a */
    public abstract boolean mo6242a(DataSource dataSource);

    /* renamed from: a */
    public abstract boolean mo6243a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);

    /* renamed from: b */
    public abstract boolean mo6244b();
}
