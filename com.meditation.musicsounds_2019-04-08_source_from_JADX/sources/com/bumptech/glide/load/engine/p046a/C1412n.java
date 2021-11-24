package com.bumptech.glide.load.engine.p046a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.bumptech.glide.p040g.C1258j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.a.n */
public class C1412n implements C1410l {

    /* renamed from: a */
    private static final Config[] f4727a;

    /* renamed from: b */
    private static final Config[] f4728b = f4727a;

    /* renamed from: c */
    private static final Config[] f4729c = {Config.RGB_565};

    /* renamed from: d */
    private static final Config[] f4730d = {Config.ARGB_4444};

    /* renamed from: e */
    private static final Config[] f4731e = {Config.ALPHA_8};

    /* renamed from: f */
    private final C1415b f4732f = new C1415b();

    /* renamed from: g */
    private final C1401h<C1414a, Bitmap> f4733g = new C1401h<>();

    /* renamed from: h */
    private final Map<Config, NavigableMap<Integer, Integer>> f4734h = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.a.n$1 */
    static /* synthetic */ class C14131 {

        /* renamed from: a */
        static final /* synthetic */ int[] f4735a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4735a = r0
                int[] r0 = f4735a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f4735a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f4735a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f4735a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.p046a.C1412n.C14131.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a.n$a */
    static final class C1414a implements C1411m {

        /* renamed from: a */
        int f4736a;

        /* renamed from: b */
        private final C1415b f4737b;

        /* renamed from: c */
        private Config f4738c;

        public C1414a(C1415b bVar) {
            this.f4737b = bVar;
        }

        /* renamed from: a */
        public void mo6128a() {
            this.f4737b.mo6136a(this);
        }

        /* renamed from: a */
        public void mo6164a(int i, Config config) {
            this.f4736a = i;
            this.f4738c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1414a)) {
                return false;
            }
            C1414a aVar = (C1414a) obj;
            return this.f4736a == aVar.f4736a && C1258j.m6709a((Object) this.f4738c, (Object) aVar.f4738c);
        }

        public int hashCode() {
            return (this.f4736a * 31) + (this.f4738c != null ? this.f4738c.hashCode() : 0);
        }

        public String toString() {
            return C1412n.m7222a(this.f4736a, this.f4738c);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a.n$b */
    static class C1415b extends C1397d<C1414a> {
        C1415b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1414a mo6135b() {
            return new C1414a(this);
        }

        /* renamed from: a */
        public C1414a mo6169a(int i, Config config) {
            C1414a aVar = (C1414a) mo6137c();
            aVar.mo6164a(i, config);
            return aVar;
        }
    }

    static {
        Config[] configArr = {Config.ARGB_8888, null};
        if (VERSION.SDK_INT >= 26) {
            configArr = (Config[]) Arrays.copyOf(configArr, configArr.length + 1);
            configArr[configArr.length - 1] = Config.RGBA_F16;
        }
        f4727a = configArr;
    }

    /* renamed from: a */
    static String m7222a(int i, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private NavigableMap<Integer, Integer> m7223a(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f4734h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4734h.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    private void m7224a(Integer num, Bitmap bitmap) {
        NavigableMap a = m7223a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            sb.append(mo6125b(bitmap));
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: b */
    private C1414a m7225b(int i, Config config) {
        C1414a a = this.f4732f.mo6169a(i, config);
        Config[] b = m7226b(config);
        int length = b.length;
        int i2 = 0;
        while (i2 < length) {
            Config config2 = b[i2];
            Integer num = (Integer) m7223a(config2).ceilingKey(Integer.valueOf(i));
            if (num == null || num.intValue() > i * 8) {
                i2++;
            } else {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return a;
                        }
                    } else if (config2.equals(config)) {
                        return a;
                    }
                }
                this.f4732f.mo6136a(a);
                return this.f4732f.mo6169a(num.intValue(), config2);
            }
        }
        return a;
    }

    /* renamed from: b */
    private static Config[] m7226b(Config config) {
        if (VERSION.SDK_INT >= 26 && Config.RGBA_F16.equals(config)) {
            return f4728b;
        }
        switch (C14131.f4735a[config.ordinal()]) {
            case 1:
                return f4727a;
            case 2:
                return f4729c;
            case 3:
                return f4730d;
            case 4:
                return f4731e;
            default:
                return new Config[]{config};
        }
    }

    /* renamed from: a */
    public Bitmap mo6121a() {
        Bitmap bitmap = (Bitmap) this.f4733g.mo6145a();
        if (bitmap != null) {
            m7224a(Integer.valueOf(C1258j.m6700a(bitmap)), bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap mo6122a(int i, int i2, Config config) {
        C1414a b = m7225b(C1258j.m6698a(i, i2, config), config);
        Bitmap bitmap = (Bitmap) this.f4733g.mo6146a(b);
        if (bitmap != null) {
            m7224a(Integer.valueOf(b.f4736a), bitmap);
            bitmap.reconfigure(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888);
        }
        return bitmap;
    }

    /* renamed from: a */
    public void mo6123a(Bitmap bitmap) {
        C1414a a = this.f4732f.mo6169a(C1258j.m6700a(bitmap), bitmap.getConfig());
        this.f4733g.mo6147a(a, bitmap);
        NavigableMap a2 = m7223a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.f4736a));
        Integer valueOf = Integer.valueOf(a.f4736a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        a2.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: b */
    public String mo6124b(int i, int i2, Config config) {
        return m7222a(C1258j.m6698a(i, i2, config), config);
    }

    /* renamed from: b */
    public String mo6125b(Bitmap bitmap) {
        return m7222a(C1258j.m6700a(bitmap), bitmap.getConfig());
    }

    /* renamed from: c */
    public int mo6126c(Bitmap bitmap) {
        return C1258j.m6700a(bitmap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f4733g);
        sb.append(", sortedSizes=(");
        for (Entry entry : this.f4734h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f4734h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
