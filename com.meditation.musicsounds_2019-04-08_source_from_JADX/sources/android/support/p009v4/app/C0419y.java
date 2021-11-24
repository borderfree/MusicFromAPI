package android.support.p009v4.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: android.support.v4.app.y */
public class C0419y {

    /* renamed from: android.support.v4.app.y$a */
    public static class C0420a {

        /* renamed from: a */
        final Bundle f1249a;

        /* renamed from: b */
        public int f1250b;

        /* renamed from: c */
        public CharSequence f1251c;

        /* renamed from: d */
        public PendingIntent f1252d;

        /* renamed from: e */
        private final C0352ac[] f1253e;

        /* renamed from: f */
        private final C0352ac[] f1254f;

        /* renamed from: g */
        private boolean f1255g;

        /* renamed from: android.support.v4.app.y$a$a */
        public static final class C0421a {

            /* renamed from: a */
            private final int f1256a;

            /* renamed from: b */
            private final CharSequence f1257b;

            /* renamed from: c */
            private final PendingIntent f1258c;

            /* renamed from: d */
            private boolean f1259d;

            /* renamed from: e */
            private final Bundle f1260e;

            /* renamed from: f */
            private ArrayList<C0352ac> f1261f;

            public C0421a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), null, true);
            }

            private C0421a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0352ac[] acVarArr, boolean z) {
                this.f1259d = true;
                this.f1256a = i;
                this.f1257b = C0424d.m1944e(charSequence);
                this.f1258c = pendingIntent;
                this.f1260e = bundle;
                this.f1261f = acVarArr == null ? null : new ArrayList<>(Arrays.asList(acVarArr));
                this.f1259d = z;
            }

            /* renamed from: a */
            public C0420a mo1707a() {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (this.f1261f != null) {
                    Iterator it = this.f1261f.iterator();
                    while (it.hasNext()) {
                        C0352ac acVar = (C0352ac) it.next();
                        if (acVar.mo1386e()) {
                            arrayList.add(acVar);
                        } else {
                            arrayList2.add(acVar);
                        }
                    }
                }
                C0352ac[] acVarArr = null;
                C0352ac[] acVarArr2 = arrayList.isEmpty() ? null : (C0352ac[]) arrayList.toArray(new C0352ac[arrayList.size()]);
                if (!arrayList2.isEmpty()) {
                    acVarArr = (C0352ac[]) arrayList2.toArray(new C0352ac[arrayList2.size()]);
                }
                C0420a aVar = new C0420a(this.f1256a, this.f1257b, this.f1258c, this.f1260e, acVarArr, acVarArr2, this.f1259d);
                return aVar;
            }
        }

        public C0420a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true);
        }

        C0420a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0352ac[] acVarArr, C0352ac[] acVarArr2, boolean z) {
            this.f1250b = i;
            this.f1251c = C0424d.m1944e(charSequence);
            this.f1252d = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.f1249a = bundle;
            this.f1253e = acVarArr;
            this.f1254f = acVarArr2;
            this.f1255g = z;
        }

        /* renamed from: a */
        public int mo1700a() {
            return this.f1250b;
        }

        /* renamed from: b */
        public CharSequence mo1701b() {
            return this.f1251c;
        }

        /* renamed from: c */
        public PendingIntent mo1702c() {
            return this.f1252d;
        }

        /* renamed from: d */
        public Bundle mo1703d() {
            return this.f1249a;
        }

        /* renamed from: e */
        public boolean mo1704e() {
            return this.f1255g;
        }

        /* renamed from: f */
        public C0352ac[] mo1705f() {
            return this.f1253e;
        }

        /* renamed from: g */
        public C0352ac[] mo1706g() {
            return this.f1254f;
        }
    }

    /* renamed from: android.support.v4.app.y$b */
    public static class C0422b extends C0425e {

        /* renamed from: e */
        private Bitmap f1262e;

        /* renamed from: f */
        private Bitmap f1263f;

        /* renamed from: g */
        private boolean f1264g;

        /* renamed from: a */
        public C0422b mo1708a(Bitmap bitmap) {
            this.f1262e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0422b mo1709a(CharSequence charSequence) {
            this.f1308c = C0424d.m1944e(charSequence);
            this.f1309d = true;
            return this;
        }

        /* renamed from: a */
        public void mo1710a(C0418x xVar) {
            if (VERSION.SDK_INT >= 16) {
                BigPictureStyle bigPicture = new BigPictureStyle(xVar.mo1699a()).setBigContentTitle(this.f1307b).bigPicture(this.f1262e);
                if (this.f1264g) {
                    bigPicture.bigLargeIcon(this.f1263f);
                }
                if (this.f1309d) {
                    bigPicture.setSummaryText(this.f1308c);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.y$c */
    public static class C0423c extends C0425e {

        /* renamed from: e */
        private CharSequence f1265e;

        /* renamed from: a */
        public C0423c mo1711a(CharSequence charSequence) {
            this.f1265e = C0424d.m1944e(charSequence);
            return this;
        }

        /* renamed from: a */
        public void mo1710a(C0418x xVar) {
            if (VERSION.SDK_INT >= 16) {
                BigTextStyle bigText = new BigTextStyle(xVar.mo1699a()).setBigContentTitle(this.f1307b).bigText(this.f1265e);
                if (this.f1309d) {
                    bigText.setSummaryText(this.f1308c);
                }
            }
        }
    }

    /* renamed from: android.support.v4.app.y$d */
    public static class C0424d {

        /* renamed from: A */
        Bundle f1266A;

        /* renamed from: B */
        int f1267B;

        /* renamed from: C */
        int f1268C;

        /* renamed from: D */
        Notification f1269D;

        /* renamed from: E */
        RemoteViews f1270E;

        /* renamed from: F */
        RemoteViews f1271F;

        /* renamed from: G */
        RemoteViews f1272G;

        /* renamed from: H */
        String f1273H;

        /* renamed from: I */
        int f1274I;

        /* renamed from: J */
        String f1275J;

        /* renamed from: K */
        long f1276K;

        /* renamed from: L */
        int f1277L;

        /* renamed from: M */
        Notification f1278M;
        @Deprecated

        /* renamed from: N */
        public ArrayList<String> f1279N;

        /* renamed from: a */
        public Context f1280a;

        /* renamed from: b */
        public ArrayList<C0420a> f1281b;

        /* renamed from: c */
        CharSequence f1282c;

        /* renamed from: d */
        CharSequence f1283d;

        /* renamed from: e */
        PendingIntent f1284e;

        /* renamed from: f */
        PendingIntent f1285f;

        /* renamed from: g */
        RemoteViews f1286g;

        /* renamed from: h */
        Bitmap f1287h;

        /* renamed from: i */
        CharSequence f1288i;

        /* renamed from: j */
        int f1289j;

        /* renamed from: k */
        int f1290k;

        /* renamed from: l */
        boolean f1291l;

        /* renamed from: m */
        boolean f1292m;

        /* renamed from: n */
        C0425e f1293n;

        /* renamed from: o */
        CharSequence f1294o;

        /* renamed from: p */
        CharSequence[] f1295p;

        /* renamed from: q */
        int f1296q;

        /* renamed from: r */
        int f1297r;

        /* renamed from: s */
        boolean f1298s;

        /* renamed from: t */
        String f1299t;

        /* renamed from: u */
        boolean f1300u;

        /* renamed from: v */
        String f1301v;

        /* renamed from: w */
        boolean f1302w;

        /* renamed from: x */
        boolean f1303x;

        /* renamed from: y */
        boolean f1304y;

        /* renamed from: z */
        String f1305z;

        @Deprecated
        public C0424d(Context context) {
            this(context, null);
        }

        public C0424d(Context context, String str) {
            this.f1281b = new ArrayList<>();
            this.f1291l = true;
            this.f1302w = false;
            this.f1267B = 0;
            this.f1268C = 0;
            this.f1274I = 0;
            this.f1277L = 0;
            this.f1278M = new Notification();
            this.f1280a = context;
            this.f1273H = str;
            this.f1278M.when = System.currentTimeMillis();
            this.f1278M.audioStreamType = -1;
            this.f1290k = 0;
            this.f1279N = new ArrayList<>();
        }

        /* renamed from: a */
        private void m1943a(int i, boolean z) {
            Notification notification;
            int i2;
            if (z) {
                notification = this.f1278M;
                i2 = i | notification.flags;
            } else {
                notification = this.f1278M;
                i2 = (i ^ -1) & notification.flags;
            }
            notification.flags = i2;
        }

        /* renamed from: e */
        protected static CharSequence m1944e(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: a */
        public Notification mo1712a() {
            return new C0426z(this).mo1741b();
        }

        /* renamed from: a */
        public C0424d mo1713a(int i) {
            this.f1278M.icon = i;
            return this;
        }

        /* renamed from: a */
        public C0424d mo1714a(int i, int i2, boolean z) {
            this.f1296q = i;
            this.f1297r = i2;
            this.f1298s = z;
            return this;
        }

        /* renamed from: a */
        public C0424d mo1715a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1281b.add(new C0420a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0424d mo1716a(long j) {
            this.f1278M.when = j;
            return this;
        }

        /* renamed from: a */
        public C0424d mo1717a(PendingIntent pendingIntent) {
            this.f1284e = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C0424d mo1718a(Bitmap bitmap) {
            this.f1287h = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0424d mo1719a(Uri uri) {
            this.f1278M.sound = uri;
            this.f1278M.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                this.f1278M.audioAttributes = new Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public C0424d mo1720a(C0420a aVar) {
            this.f1281b.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C0424d mo1721a(C0425e eVar) {
            if (this.f1293n != eVar) {
                this.f1293n = eVar;
                if (this.f1293n != null) {
                    this.f1293n.mo1737a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C0424d mo1722a(RemoteViews remoteViews) {
            this.f1278M.contentView = remoteViews;
            return this;
        }

        /* renamed from: a */
        public C0424d mo1723a(CharSequence charSequence) {
            this.f1282c = m1944e(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0424d mo1724a(String str) {
            this.f1273H = str;
            return this;
        }

        /* renamed from: a */
        public C0424d mo1725a(boolean z) {
            m1943a(2, z);
            return this;
        }

        /* renamed from: b */
        public C0424d mo1726b(int i) {
            this.f1278M.defaults = i;
            if ((i & 4) != 0) {
                this.f1278M.flags |= 1;
            }
            return this;
        }

        /* renamed from: b */
        public C0424d mo1727b(PendingIntent pendingIntent) {
            this.f1278M.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public C0424d mo1728b(RemoteViews remoteViews) {
            this.f1271F = remoteViews;
            return this;
        }

        /* renamed from: b */
        public C0424d mo1729b(CharSequence charSequence) {
            this.f1283d = m1944e(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0424d mo1730b(boolean z) {
            m1943a(16, z);
            return this;
        }

        /* renamed from: c */
        public C0424d mo1731c(int i) {
            this.f1290k = i;
            return this;
        }

        /* renamed from: c */
        public C0424d mo1732c(CharSequence charSequence) {
            this.f1294o = m1944e(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0424d mo1733c(boolean z) {
            this.f1302w = z;
            return this;
        }

        /* renamed from: d */
        public C0424d mo1734d(int i) {
            this.f1267B = i;
            return this;
        }

        /* renamed from: d */
        public C0424d mo1735d(CharSequence charSequence) {
            this.f1278M.tickerText = m1944e(charSequence);
            return this;
        }
    }

    /* renamed from: android.support.v4.app.y$e */
    public static abstract class C0425e {

        /* renamed from: a */
        protected C0424d f1306a;

        /* renamed from: b */
        CharSequence f1307b;

        /* renamed from: c */
        CharSequence f1308c;

        /* renamed from: d */
        boolean f1309d = false;

        /* renamed from: a */
        public void mo1736a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1710a(C0418x xVar) {
        }

        /* renamed from: a */
        public void mo1737a(C0424d dVar) {
            if (this.f1306a != dVar) {
                this.f1306a = dVar;
                if (this.f1306a != null) {
                    this.f1306a.mo1721a(this);
                }
            }
        }

        /* renamed from: b */
        public RemoteViews mo1738b(C0418x xVar) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo1739c(C0418x xVar) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo1740d(C0418x xVar) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bundle m1929a(Notification notification) {
        if (VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (VERSION.SDK_INT >= 16) {
            return C0350aa.m1462a(notification);
        }
        return null;
    }
}
