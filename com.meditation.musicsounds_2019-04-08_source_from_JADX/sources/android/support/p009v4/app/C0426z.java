package android.support.p009v4.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0419y.C0420a;
import android.support.p009v4.app.C0419y.C0424d;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.app.z */
class C0426z implements C0418x {

    /* renamed from: a */
    private final Builder f1310a;

    /* renamed from: b */
    private final C0424d f1311b;

    /* renamed from: c */
    private RemoteViews f1312c;

    /* renamed from: d */
    private RemoteViews f1313d;

    /* renamed from: e */
    private final List<Bundle> f1314e = new ArrayList();

    /* renamed from: f */
    private final Bundle f1315f = new Bundle();

    /* renamed from: g */
    private int f1316g;

    /* renamed from: h */
    private RemoteViews f1317h;

    C0426z(C0424d dVar) {
        Bundle bundle;
        String str;
        this.f1311b = dVar;
        this.f1310a = VERSION.SDK_INT >= 26 ? new Builder(dVar.f1280a, dVar.f1273H) : new Builder(dVar.f1280a);
        Notification notification = dVar.f1278M;
        this.f1310a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f1286g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f1282c).setContentText(dVar.f1283d).setContentInfo(dVar.f1288i).setContentIntent(dVar.f1284e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f1285f, (notification.flags & 128) != 0).setLargeIcon(dVar.f1287h).setNumber(dVar.f1289j).setProgress(dVar.f1296q, dVar.f1297r, dVar.f1298s);
        if (VERSION.SDK_INT < 21) {
            this.f1310a.setSound(notification.sound, notification.audioStreamType);
        }
        if (VERSION.SDK_INT >= 16) {
            this.f1310a.setSubText(dVar.f1294o).setUsesChronometer(dVar.f1292m).setPriority(dVar.f1290k);
            Iterator it = dVar.f1281b.iterator();
            while (it.hasNext()) {
                m1976a((C0420a) it.next());
            }
            if (dVar.f1266A != null) {
                this.f1315f.putAll(dVar.f1266A);
            }
            if (VERSION.SDK_INT < 20) {
                if (dVar.f1302w) {
                    this.f1315f.putBoolean("android.support.localOnly", true);
                }
                if (dVar.f1299t != null) {
                    this.f1315f.putString("android.support.groupKey", dVar.f1299t);
                    if (dVar.f1300u) {
                        bundle = this.f1315f;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f1315f;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                if (dVar.f1301v != null) {
                    this.f1315f.putString("android.support.sortKey", dVar.f1301v);
                }
            }
            this.f1312c = dVar.f1270E;
            this.f1313d = dVar.f1271F;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f1310a.setShowWhen(dVar.f1291l);
            if (VERSION.SDK_INT < 21 && dVar.f1279N != null && !dVar.f1279N.isEmpty()) {
                this.f1315f.putStringArray("android.people", (String[]) dVar.f1279N.toArray(new String[dVar.f1279N.size()]));
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f1310a.setLocalOnly(dVar.f1302w).setGroup(dVar.f1299t).setGroupSummary(dVar.f1300u).setSortKey(dVar.f1301v);
            this.f1316g = dVar.f1277L;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f1310a.setCategory(dVar.f1305z).setColor(dVar.f1267B).setVisibility(dVar.f1268C).setPublicVersion(dVar.f1269D).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = dVar.f1279N.iterator();
            while (it2.hasNext()) {
                this.f1310a.addPerson((String) it2.next());
            }
            this.f1317h = dVar.f1272G;
        }
        if (VERSION.SDK_INT >= 24) {
            this.f1310a.setExtras(dVar.f1266A).setRemoteInputHistory(dVar.f1295p);
            if (dVar.f1270E != null) {
                this.f1310a.setCustomContentView(dVar.f1270E);
            }
            if (dVar.f1271F != null) {
                this.f1310a.setCustomBigContentView(dVar.f1271F);
            }
            if (dVar.f1272G != null) {
                this.f1310a.setCustomHeadsUpContentView(dVar.f1272G);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f1310a.setBadgeIconType(dVar.f1274I).setShortcutId(dVar.f1275J).setTimeoutAfter(dVar.f1276K).setGroupAlertBehavior(dVar.f1277L);
            if (dVar.f1304y) {
                this.f1310a.setColorized(dVar.f1303x);
            }
            if (!TextUtils.isEmpty(dVar.f1273H)) {
                this.f1310a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
    }

    /* renamed from: a */
    private void m1975a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* renamed from: a */
    private void m1976a(C0420a aVar) {
        if (VERSION.SDK_INT >= 20) {
            Action.Builder builder = new Action.Builder(aVar.mo1700a(), aVar.mo1701b(), aVar.mo1702c());
            if (aVar.mo1705f() != null) {
                for (RemoteInput addRemoteInput : C0352ac.m1469a(aVar.mo1705f())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.mo1703d() != null ? new Bundle(aVar.mo1703d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1704e());
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.mo1704e());
            }
            builder.addExtras(bundle);
            this.f1310a.addAction(builder.build());
        } else if (VERSION.SDK_INT >= 16) {
            this.f1314e.add(C0350aa.m1461a(this.f1310a, aVar));
        }
    }

    /* renamed from: a */
    public Builder mo1699a() {
        return this.f1310a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification mo1741b() {
        /*
            r5 = this;
            android.support.v4.app.y$d r0 = r5.f1311b
            android.support.v4.app.y$e r0 = r0.f1293n
            if (r0 == 0) goto L_0x0009
            r0.mo1710a(r5)
        L_0x0009:
            if (r0 == 0) goto L_0x0010
            android.widget.RemoteViews r1 = r0.mo1738b(r5)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            android.app.Notification r2 = r5.mo1742c()
            if (r1 == 0) goto L_0x001a
        L_0x0017:
            r2.contentView = r1
            goto L_0x0025
        L_0x001a:
            android.support.v4.app.y$d r1 = r5.f1311b
            android.widget.RemoteViews r1 = r1.f1270E
            if (r1 == 0) goto L_0x0025
            android.support.v4.app.y$d r1 = r5.f1311b
            android.widget.RemoteViews r1 = r1.f1270E
            goto L_0x0017
        L_0x0025:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 16
            if (r1 < r3) goto L_0x0035
            if (r0 == 0) goto L_0x0035
            android.widget.RemoteViews r1 = r0.mo1739c(r5)
            if (r1 == 0) goto L_0x0035
            r2.bigContentView = r1
        L_0x0035:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r1 < r4) goto L_0x0049
            if (r0 == 0) goto L_0x0049
            android.support.v4.app.y$d r1 = r5.f1311b
            android.support.v4.app.y$e r1 = r1.f1293n
            android.widget.RemoteViews r1 = r1.mo1740d(r5)
            if (r1 == 0) goto L_0x0049
            r2.headsUpContentView = r1
        L_0x0049:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r3) goto L_0x0058
            if (r0 == 0) goto L_0x0058
            android.os.Bundle r1 = android.support.p009v4.app.C0419y.m1929a(r2)
            if (r1 == 0) goto L_0x0058
            r0.mo1736a(r1)
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p009v4.app.C0426z.mo1741b():android.app.Notification");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Notification mo1742c() {
        if (VERSION.SDK_INT >= 26) {
            return this.f1310a.build();
        }
        if (VERSION.SDK_INT >= 24) {
            Notification build = this.f1310a.build();
            if (this.f1316g != 0) {
                if (!(build.getGroup() == null || (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.f1316g != 2)) {
                    m1975a(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f1316g == 1) {
                    m1975a(build);
                }
            }
            return build;
        } else if (VERSION.SDK_INT >= 21) {
            this.f1310a.setExtras(this.f1315f);
            Notification build2 = this.f1310a.build();
            if (this.f1312c != null) {
                build2.contentView = this.f1312c;
            }
            if (this.f1313d != null) {
                build2.bigContentView = this.f1313d;
            }
            if (this.f1317h != null) {
                build2.headsUpContentView = this.f1317h;
            }
            if (this.f1316g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.f1316g != 2)) {
                    m1975a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f1316g == 1) {
                    m1975a(build2);
                }
            }
            return build2;
        } else if (VERSION.SDK_INT >= 20) {
            this.f1310a.setExtras(this.f1315f);
            Notification build3 = this.f1310a.build();
            if (this.f1312c != null) {
                build3.contentView = this.f1312c;
            }
            if (this.f1313d != null) {
                build3.bigContentView = this.f1313d;
            }
            if (this.f1316g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || this.f1316g != 2)) {
                    m1975a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f1316g == 1) {
                    m1975a(build3);
                }
            }
            return build3;
        } else if (VERSION.SDK_INT >= 19) {
            SparseArray a = C0350aa.m1464a(this.f1314e);
            if (a != null) {
                this.f1315f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f1310a.setExtras(this.f1315f);
            Notification build4 = this.f1310a.build();
            if (this.f1312c != null) {
                build4.contentView = this.f1312c;
            }
            if (this.f1313d != null) {
                build4.bigContentView = this.f1313d;
            }
            return build4;
        } else if (VERSION.SDK_INT < 16) {
            return this.f1310a.getNotification();
        } else {
            Notification build5 = this.f1310a.build();
            Bundle a2 = C0419y.m1929a(build5);
            Bundle bundle = new Bundle(this.f1315f);
            for (String str : this.f1315f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray a3 = C0350aa.m1464a(this.f1314e);
            if (a3 != null) {
                C0419y.m1929a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            if (this.f1312c != null) {
                build5.contentView = this.f1312c;
            }
            if (this.f1313d != null) {
                build5.bigContentView = this.f1313d;
            }
            return build5;
        }
    }
}
