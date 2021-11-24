package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p009v4.p019g.C0488a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p123d.C3181c;
import com.google.android.gms.common.util.C3300e;
import com.google.android.gms.internal.measurement.C4304cp;
import com.google.android.gms.internal.measurement.C4308ct;
import com.google.android.gms.internal.measurement.C4309cu;
import com.google.android.gms.internal.measurement.C4311cw;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.measurement.internal.eb */
public class C4726eb implements C4663bt {

    /* renamed from: a */
    private static volatile C4726eb f17007a;

    /* renamed from: b */
    private C4633aq f17008b;

    /* renamed from: c */
    private C4771v f17009c;

    /* renamed from: d */
    private C4747ev f17010d;

    /* renamed from: e */
    private C4618ab f17011e;

    /* renamed from: f */
    private C4721dx f17012f;

    /* renamed from: g */
    private C4741ep f17013g;

    /* renamed from: h */
    private final C4733eh f17014h;

    /* renamed from: i */
    private C4682cl f17015i;

    /* renamed from: j */
    private final C4638av f17016j;

    /* renamed from: k */
    private boolean f17017k;

    /* renamed from: l */
    private boolean f17018l;

    /* renamed from: m */
    private boolean f17019m;

    /* renamed from: n */
    private long f17020n;

    /* renamed from: o */
    private List<Runnable> f17021o;

    /* renamed from: p */
    private int f17022p;

    /* renamed from: q */
    private int f17023q;

    /* renamed from: r */
    private boolean f17024r;

    /* renamed from: s */
    private boolean f17025s;

    /* renamed from: t */
    private boolean f17026t;

    /* renamed from: u */
    private FileLock f17027u;

    /* renamed from: v */
    private FileChannel f17028v;

    /* renamed from: w */
    private List<Long> f17029w;

    /* renamed from: x */
    private List<Long> f17030x;

    /* renamed from: y */
    private long f17031y;

    /* renamed from: com.google.android.gms.measurement.internal.eb$a */
    class C4727a implements C4749ex {

        /* renamed from: a */
        C4311cw f17032a;

        /* renamed from: b */
        List<Long> f17033b;

        /* renamed from: c */
        List<C4308ct> f17034c;

        /* renamed from: d */
        private long f17035d;

        private C4727a() {
        }

        /* synthetic */ C4727a(C4726eb ebVar, C4728ec ecVar) {
            this();
        }

        /* renamed from: a */
        private static long m23478a(C4308ct ctVar) {
            return ((ctVar.f15926c.longValue() / 1000) / 60) / 60;
        }

        /* renamed from: a */
        public final void mo15558a(C4311cw cwVar) {
            C3266s.m14913a(cwVar);
            this.f17032a = cwVar;
        }

        /* renamed from: a */
        public final boolean mo15559a(long j, C4308ct ctVar) {
            C3266s.m14913a(ctVar);
            if (this.f17034c == null) {
                this.f17034c = new ArrayList();
            }
            if (this.f17033b == null) {
                this.f17033b = new ArrayList();
            }
            if (this.f17034c.size() > 0 && m23478a((C4308ct) this.f17034c.get(0)) != m23478a(ctVar)) {
                return false;
            }
            long e = this.f17035d + ((long) ctVar.mo14784e());
            if (e >= ((long) Math.max(0, ((Integer) C4756h.f17180q.mo15821b()).intValue()))) {
                return false;
            }
            this.f17035d = e;
            this.f17034c.add(ctVar);
            this.f17033b.add(Long.valueOf(j));
            return this.f17034c.size() < Math.max(1, ((Integer) C4756h.f17181r.mo15821b()).intValue());
        }
    }

    private C4726eb(C4732eg egVar) {
        this(egVar, null);
    }

    private C4726eb(C4732eg egVar, C4638av avVar) {
        this.f17017k = false;
        C3266s.m14913a(egVar);
        this.f17016j = C4638av.m23035a(egVar.f17044a, (C4762m) null);
        this.f17031y = -1;
        C4733eh ehVar = new C4733eh(this);
        ehVar.mo15526v();
        this.f17014h = ehVar;
        C4771v vVar = new C4771v(this);
        vVar.mo15526v();
        this.f17009c = vVar;
        C4633aq aqVar = new C4633aq(this);
        aqVar.mo15526v();
        this.f17008b = aqVar;
        this.f17016j.mo15252q().mo15314a((Runnable) new C4728ec(this, egVar));
    }

    /* renamed from: A */
    private final void m23414A() {
        m23438w();
        if (this.f17024r || this.f17025s || this.f17026t) {
            this.f17016j.mo15253r().mo15855x().mo15861a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f17024r), Boolean.valueOf(this.f17025s), Boolean.valueOf(this.f17026t));
            return;
        }
        this.f17016j.mo15253r().mo15855x().mo15858a("Stopping uploading service(s)");
        if (this.f17021o != null) {
            for (Runnable run : this.f17021o) {
                run.run();
            }
            this.f17021o.clear();
        }
    }

    /* renamed from: B */
    private final boolean m23415B() {
        String str;
        C4769t tVar;
        m23438w();
        try {
            this.f17028v = new RandomAccessFile(new File(this.f17016j.mo15249n().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f17027u = this.f17028v.tryLock();
            if (this.f17027u != null) {
                this.f17016j.mo15253r().mo15855x().mo15858a("Storage concurrent access okay");
                return true;
            }
            this.f17016j.mo15253r().mo15852u_().mo15858a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            tVar = this.f17016j.mo15253r().mo15852u_();
            str = "Failed to acquire storage lock";
            tVar.mo15859a(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            tVar = this.f17016j.mo15253r().mo15852u_();
            str = "Failed to access storage lock file";
            tVar.mo15859a(str, e);
            return false;
        }
    }

    /* renamed from: C */
    private final boolean m23416C() {
        m23438w();
        mo15553j();
        return this.f17018l;
    }

    /* renamed from: a */
    private final int m23417a(FileChannel fileChannel) {
        int i;
        m23438w();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f17016j.mo15253r().mo15852u_().mo15858a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.f17016j.mo15253r().mo15849i().mo15859a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i = allocate.getInt();
            return i;
        } catch (IOException e) {
            this.f17016j.mo15253r().mo15852u_().mo15859a("Failed to read from channel", e);
            i = 0;
        }
    }

    /* renamed from: a */
    public static C4726eb m23418a(Context context) {
        C3266s.m14913a(context);
        C3266s.m14913a(context.getApplicationContext());
        if (f17007a == null) {
            synchronized (C4726eb.class) {
                if (f17007a == null) {
                    f17007a = new C4726eb(new C4732eg(context));
                }
            }
        }
        return f17007a;
    }

    /* renamed from: a */
    private final zzk m23420a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j, String str3) {
        String str4;
        int i;
        String str5 = str;
        String str6 = "Unknown";
        String str7 = "Unknown";
        String str8 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.f17016j.mo15253r().mo15852u_().mo15858a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str6 = packageManager.getInstallerPackageName(str5);
        } catch (IllegalArgumentException unused) {
            this.f17016j.mo15253r().mo15852u_().mo15859a("Error retrieving installer package name. appId", C4767r.m23924a(str));
        }
        if (str6 == null) {
            str6 = "manual_install";
        } else if ("com.android.vending".equals(str6)) {
            str6 = "";
        }
        String str9 = str6;
        try {
            PackageInfo b = C3181c.m14658a(context).mo11129b(str5, 0);
            if (b != null) {
                CharSequence b2 = C3181c.m14658a(context).mo11130b(str5);
                if (!TextUtils.isEmpty(b2)) {
                    String charSequence = b2.toString();
                }
                str4 = b.versionName;
                i = b.versionCode;
            } else {
                str4 = str7;
                i = Integer.MIN_VALUE;
            }
            this.f17016j.mo15256u();
            zzk zzk = new zzk(str, str2, str4, (long) i, str9, this.f17016j.mo15335b().mo15742f(), this.f17016j.mo15343j().mo15578a(context, str5), (String) null, z, false, "", 0, this.f17016j.mo15335b().mo15752l(str5) ? j : 0, 0, z2, z3, false, str3);
            return zzk;
        } catch (NameNotFoundException unused2) {
            this.f17016j.mo15253r().mo15852u_().mo15860a("Error retrieving newly installed package info. appId, appName", C4767r.m23924a(str), str8);
            return null;
        }
    }

    /* renamed from: a */
    private final zzk m23421a(String str) {
        C4769t w;
        String str2;
        Object obj;
        String str3 = str;
        C4738em b = mo15546d().mo15788b(str3);
        if (b == null || TextUtils.isEmpty(b.mo15643j())) {
            w = this.f17016j.mo15253r().mo15854w();
            str2 = "No app data available; dropping";
            obj = str3;
        } else {
            Boolean b2 = m23431b(b);
            if (b2 == null || b2.booleanValue()) {
                C4738em emVar = b;
                zzk zzk = new zzk(str, b.mo15626d(), b.mo15643j(), b.mo15645k(), b.mo15647l(), b.mo15649m(), b.mo15651n(), (String) null, b.mo15654o(), false, b.mo15635g(), emVar.mo15611B(), 0, 0, emVar.mo15612C(), emVar.mo15613D(), false, emVar.mo15629e());
                return zzk;
            }
            w = this.f17016j.mo15253r().mo15852u_();
            str2 = "App version does not match; dropping. appId";
            obj = C4767r.m23924a(str);
        }
        w.mo15859a(str2, obj);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23423a(C4732eg egVar) {
        this.f17016j.mo15252q().mo15239d();
        C4747ev evVar = new C4747ev(this);
        evVar.mo15526v();
        this.f17010d = evVar;
        this.f17016j.mo15335b().mo15733a((C4746eu) this.f17008b);
        C4741ep epVar = new C4741ep(this);
        epVar.mo15526v();
        this.f17013g = epVar;
        C4682cl clVar = new C4682cl(this);
        clVar.mo15526v();
        this.f17015i = clVar;
        C4721dx dxVar = new C4721dx(this);
        dxVar.mo15526v();
        this.f17012f = dxVar;
        this.f17011e = new C4618ab(this);
        if (this.f17022p != this.f17023q) {
            this.f17016j.mo15253r().mo15852u_().mo15860a("Not all upload components initialized", Integer.valueOf(this.f17022p), Integer.valueOf(this.f17023q));
        }
        this.f17017k = true;
    }

    /* renamed from: a */
    private final void m23424a(C4738em emVar) {
        Map map;
        m23438w();
        if (!TextUtils.isEmpty(emVar.mo15626d()) || (C4744es.m23663y() && !TextUtils.isEmpty(emVar.mo15629e()))) {
            C4744es b = this.f17016j.mo15335b();
            Builder builder = new Builder();
            String d = emVar.mo15626d();
            if (TextUtils.isEmpty(d) && C4744es.m23663y()) {
                d = emVar.mo15629e();
            }
            Builder encodedAuthority = builder.scheme((String) C4756h.f17176m.mo15821b()).encodedAuthority((String) C4756h.f17177n.mo15821b());
            String str = "config/app/";
            String valueOf = String.valueOf(d);
            encodedAuthority.path(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).appendQueryParameter("app_instance_id", emVar.mo15622c()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(b.mo15742f()));
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.f17016j.mo15253r().mo15855x().mo15859a("Fetching remote configuration", emVar.mo15618b());
                C4304cp a = m23435s().mo15297a(emVar.mo15618b());
                String b2 = m23435s().mo15300b(emVar.mo15618b());
                if (a == null || TextUtils.isEmpty(b2)) {
                    map = null;
                } else {
                    C0488a aVar = new C0488a();
                    aVar.put("If-Modified-Since", b2);
                    map = aVar;
                }
                this.f17024r = true;
                C4771v c = mo15544c();
                String b3 = emVar.mo15618b();
                C4730ee eeVar = new C4730ee(this);
                c.mo15239d();
                c.mo15525k();
                C3266s.m14913a(url);
                C3266s.m14913a(eeVar);
                C4634ar q = c.mo15252q();
                C4617aa aaVar = new C4617aa(c, b3, url, null, map, eeVar);
                q.mo15316b((Runnable) aaVar);
            } catch (MalformedURLException unused) {
                this.f17016j.mo15253r().mo15852u_().mo15860a("Failed to parse config URL. Not fetching. appId", C4767r.m23924a(emVar.mo15618b()), uri);
            }
        } else {
            mo15537a(emVar.mo15618b(), 204, null, null, null);
        }
    }

    /* renamed from: a */
    private final boolean m23425a(int i, FileChannel fileChannel) {
        m23438w();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.f17016j.mo15253r().mo15852u_().mo15858a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.f17016j.mo15253r().mo15852u_().mo15859a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.f17016j.mo15253r().mo15852u_().mo15859a("Failed to write to channel", e);
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m23426a(C4308ct ctVar, C4308ct ctVar2) {
        C3266s.m14923b("_e".equals(ctVar.f15925b));
        mo15550g();
        C4309cu a = C4733eh.m23483a(ctVar, "_sc");
        String str = null;
        Object obj = a == null ? null : a.f15931b;
        mo15550g();
        C4309cu a2 = C4733eh.m23483a(ctVar2, "_pc");
        if (a2 != null) {
            str = a2.f15931b;
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        mo15550g();
        C4309cu a3 = C4733eh.m23483a(ctVar, "_et");
        if (a3.f15932c != null && a3.f15932c.longValue() > 0) {
            long longValue = a3.f15932c.longValue();
            mo15550g();
            C4309cu a4 = C4733eh.m23483a(ctVar2, "_et");
            if (!(a4 == null || a4.f15932c == null || a4.f15932c.longValue() <= 0)) {
                longValue += a4.f15932c.longValue();
            }
            mo15550g();
            ctVar2.f15924a = C4733eh.m23492a(ctVar2.f15924a, "_et", (Object) Long.valueOf(longValue));
            mo15550g();
            ctVar.f15924a = C4733eh.m23492a(ctVar.f15924a, "_fr", (Object) Long.valueOf(1));
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0234, code lost:
        if (r8 == null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0267, code lost:
        if (r8 != null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r5 = r1;
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if (r3 != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        r8 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0b09, code lost:
        if (r18 != r14) goto L_0x0b0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0130, code lost:
        if (r8 != null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c6, code lost:
        if (r5 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0215, code lost:
        if (r5 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v75 android.database.Cursor) = (r3v69 android.database.Cursor), (r3v78 android.database.Cursor), (r3v78 android.database.Cursor), (r3v78 android.database.Cursor), (r3v78 android.database.Cursor), (r3v0 android.database.Cursor), (r3v0 android.database.Cursor) binds: [B:47:0x00e2, B:24:0x0080, B:30:0x008d, B:32:0x0091, B:33:?, B:9:0x0031, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x026f A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x027d A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0393 A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0395 A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0398 A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0399 A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x05a4 A[ADDED_TO_REGION, Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0667 A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x06e8 A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0839 A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0853 A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0873 A[Catch:{ all -> 0x0dba }] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x0b2b A[Catch:{ all -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0b77 A[Catch:{ all -> 0x0bcb }] */
    /* JADX WARNING: Removed duplicated region for block: B:558:0x0d9c  */
    /* JADX WARNING: Removed duplicated region for block: B:566:0x0db3 A[SYNTHETIC, Splitter:B:566:0x0db3] */
    /* JADX WARNING: Removed duplicated region for block: B:605:0x0850 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011f A[Catch:{ SQLiteException -> 0x0238 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0137 A[SYNTHETIC, Splitter:B:64:0x0137] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:62:0x0132=Splitter:B:62:0x0132, B:28:0x0088=Splitter:B:28:0x0088, B:82:0x01c8=Splitter:B:82:0x01c8, B:123:0x026b=Splitter:B:123:0x026b} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m23427a(java.lang.String r53, long r54) {
        /*
            r52 = this;
            r1 = r52
            com.google.android.gms.measurement.internal.ev r2 = r52.mo15546d()
            r2.mo15799f()
            com.google.android.gms.measurement.internal.eb$a r2 = new com.google.android.gms.measurement.internal.eb$a     // Catch:{ all -> 0x0dba }
            r3 = 0
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.ev r4 = r52.mo15546d()     // Catch:{ all -> 0x0dba }
            long r5 = r1.f17031y     // Catch:{ all -> 0x0dba }
            com.google.android.gms.common.internal.C3266s.m14913a(r2)     // Catch:{ all -> 0x0dba }
            r4.mo15239d()     // Catch:{ all -> 0x0dba }
            r4.mo15525k()     // Catch:{ all -> 0x0dba }
            r8 = -1
            r10 = 2
            r11 = 0
            r12 = 1
            android.database.sqlite.SQLiteDatabase r15 = r4.mo15804y()     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            boolean r13 = android.text.TextUtils.isEmpty(r3)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            if (r13 == 0) goto L_0x00a0
            int r13 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x004b
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            java.lang.String r14 = java.lang.String.valueOf(r54)     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            r13[r12] = r14     // Catch:{ SQLiteException -> 0x0045, all -> 0x0040 }
            goto L_0x0053
        L_0x0040:
            r0 = move-exception
            r5 = r1
            r8 = r3
            goto L_0x024f
        L_0x0045:
            r0 = move-exception
            r7 = r3
            r8 = r7
        L_0x0048:
            r3 = r0
            goto L_0x0256
        L_0x004b:
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r14 = java.lang.String.valueOf(r54)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r13[r11] = r14     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
        L_0x0053:
            int r14 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r14 == 0) goto L_0x005a
            java.lang.String r14 = "rowid <= ? and "
            goto L_0x005c
        L_0x005a:
            java.lang.String r14 = ""
        L_0x005c:
            java.lang.String r16 = java.lang.String.valueOf(r14)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            int r7 = r16.length()     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            int r7 = r7 + 148
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r3.<init>(r7)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r7 = "select app_id, metadata_fingerprint from raw_events where "
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r3.append(r14)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r7 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r3.append(r7)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r3 = r3.toString()     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            android.database.Cursor r3 = r15.rawQuery(r3, r13)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0247, all -> 0x0040 }
            if (r7 != 0) goto L_0x008d
            if (r3 == 0) goto L_0x026b
        L_0x0088:
            r3.close()     // Catch:{ all -> 0x0dba }
            goto L_0x026b
        L_0x008d:
            java.lang.String r7 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0247, all -> 0x0040 }
            java.lang.String r13 = r3.getString(r12)     // Catch:{ SQLiteException -> 0x009d, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x009d, all -> 0x0040 }
            r22 = r3
            r3 = r7
            r7 = r13
            goto L_0x00f6
        L_0x009d:
            r0 = move-exception
            r8 = r3
            goto L_0x0048
        L_0x00a0:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x00b0
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r3[r12] = r7     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            goto L_0x00b5
        L_0x00b0:
            java.lang.String[] r3 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r7 = 0
            r3[r11] = r7     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
        L_0x00b5:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00bc
            java.lang.String r7 = " and rowid <= ?"
            goto L_0x00be
        L_0x00bc:
            java.lang.String r7 = ""
        L_0x00be:
            java.lang.String r13 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            int r13 = r13.length()     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            int r13 = r13 + 84
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r14.<init>(r13)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r13 = "select metadata_fingerprint from raw_events where app_id = ?"
            r14.append(r13)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r7 = " order by rowid limit 1;"
            r14.append(r7)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            java.lang.String r7 = r14.toString()     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            android.database.Cursor r3 = r15.rawQuery(r7, r3)     // Catch:{ SQLiteException -> 0x0252, all -> 0x024c }
            boolean r7 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x0247, all -> 0x0040 }
            if (r7 != 0) goto L_0x00eb
            if (r3 == 0) goto L_0x026b
            goto L_0x0088
        L_0x00eb:
            java.lang.String r13 = r3.getString(r11)     // Catch:{ SQLiteException -> 0x0247, all -> 0x0040 }
            r3.close()     // Catch:{ SQLiteException -> 0x0247, all -> 0x0040 }
            r22 = r3
            r7 = r13
            r3 = 0
        L_0x00f6:
            java.lang.String r14 = "raw_events_metadata"
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0241, all -> 0x023c }
            java.lang.String r16 = "metadata"
            r13[r11] = r16     // Catch:{ SQLiteException -> 0x0241, all -> 0x023c }
            java.lang.String r16 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r8 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0241, all -> 0x023c }
            r8[r11] = r3     // Catch:{ SQLiteException -> 0x0241, all -> 0x023c }
            r8[r12] = r7     // Catch:{ SQLiteException -> 0x0241, all -> 0x023c }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            java.lang.String r21 = "2"
            r9 = r13
            r13 = r15
            r23 = r15
            r15 = r9
            r17 = r8
            android.database.Cursor r8 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0241, all -> 0x023c }
            boolean r9 = r8.moveToFirst()     // Catch:{ SQLiteException -> 0x0238 }
            if (r9 != 0) goto L_0x0137
            com.google.android.gms.measurement.internal.r r5 = r4.mo15253r()     // Catch:{ SQLiteException -> 0x0238 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo15852u_()     // Catch:{ SQLiteException -> 0x0238 }
            java.lang.String r6 = "Raw event metadata record is missing. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)     // Catch:{ SQLiteException -> 0x0238 }
            r5.mo15859a(r6, r7)     // Catch:{ SQLiteException -> 0x0238 }
            if (r8 == 0) goto L_0x026b
        L_0x0132:
            r8.close()     // Catch:{ all -> 0x0dba }
            goto L_0x026b
        L_0x0137:
            byte[] r9 = r8.getBlob(r11)     // Catch:{ SQLiteException -> 0x0238 }
            int r13 = r9.length     // Catch:{ SQLiteException -> 0x0238 }
            com.google.android.gms.internal.measurement.io r9 = com.google.android.gms.internal.measurement.C4475io.m22170a(r9, r11, r13)     // Catch:{ SQLiteException -> 0x0238 }
            com.google.android.gms.internal.measurement.cw r13 = new com.google.android.gms.internal.measurement.cw     // Catch:{ SQLiteException -> 0x0238 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0238 }
            r13.mo14223a(r9)     // Catch:{ IOException -> 0x0221 }
            boolean r9 = r8.moveToNext()     // Catch:{ SQLiteException -> 0x0238 }
            if (r9 == 0) goto L_0x015f
            com.google.android.gms.measurement.internal.r r9 = r4.mo15253r()     // Catch:{ SQLiteException -> 0x0238 }
            com.google.android.gms.measurement.internal.t r9 = r9.mo15849i()     // Catch:{ SQLiteException -> 0x0238 }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r15 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)     // Catch:{ SQLiteException -> 0x0238 }
            r9.mo15859a(r14, r15)     // Catch:{ SQLiteException -> 0x0238 }
        L_0x015f:
            r8.close()     // Catch:{ SQLiteException -> 0x0238 }
            r2.mo15558a(r13)     // Catch:{ SQLiteException -> 0x0238 }
            r13 = -1
            int r9 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x017f
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0238 }
            r14[r11] = r3     // Catch:{ SQLiteException -> 0x0238 }
            r14[r12] = r7     // Catch:{ SQLiteException -> 0x0238 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ SQLiteException -> 0x0238 }
            r14[r10] = r5     // Catch:{ SQLiteException -> 0x0238 }
            r16 = r9
            r17 = r14
            goto L_0x018b
        L_0x017f:
            java.lang.String r5 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x0238 }
            r6[r11] = r3     // Catch:{ SQLiteException -> 0x0238 }
            r6[r12] = r7     // Catch:{ SQLiteException -> 0x0238 }
            r16 = r5
            r17 = r6
        L_0x018b:
            java.lang.String r14 = "raw_events"
            r5 = 4
            java.lang.String[] r15 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0238 }
            java.lang.String r5 = "rowid"
            r15[r11] = r5     // Catch:{ SQLiteException -> 0x0238 }
            java.lang.String r5 = "name"
            r15[r12] = r5     // Catch:{ SQLiteException -> 0x0238 }
            java.lang.String r5 = "timestamp"
            r15[r10] = r5     // Catch:{ SQLiteException -> 0x0238 }
            java.lang.String r5 = "data"
            r6 = 3
            r15[r6] = r5     // Catch:{ SQLiteException -> 0x0238 }
            r18 = 0
            r19 = 0
            java.lang.String r20 = "rowid"
            r21 = 0
            r13 = r23
            android.database.Cursor r5 = r13.query(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ SQLiteException -> 0x0238 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            if (r6 != 0) goto L_0x01cd
            com.google.android.gms.measurement.internal.r r6 = r4.mo15253r()     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo15849i()     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            java.lang.String r7 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            r6.mo15859a(r7, r8)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            if (r5 == 0) goto L_0x026b
        L_0x01c8:
            r5.close()     // Catch:{ all -> 0x0dba }
            goto L_0x026b
        L_0x01cd:
            long r6 = r5.getLong(r11)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            r8 = 3
            byte[] r9 = r5.getBlob(r8)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            int r8 = r9.length     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            com.google.android.gms.internal.measurement.io r8 = com.google.android.gms.internal.measurement.C4475io.m22170a(r9, r11, r8)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            com.google.android.gms.internal.measurement.ct r9 = new com.google.android.gms.internal.measurement.ct     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            r9.<init>()     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            r9.mo14223a(r8)     // Catch:{ IOException -> 0x01fc }
            java.lang.String r8 = r5.getString(r12)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            r9.f15925b = r8     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            long r13 = r5.getLong(r10)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            r9.f15926c = r8     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            boolean r6 = r2.mo15559a(r6, r9)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            if (r6 != 0) goto L_0x020f
            if (r5 == 0) goto L_0x026b
            goto L_0x01c8
        L_0x01fc:
            r0 = move-exception
            r6 = r0
            com.google.android.gms.measurement.internal.r r7 = r4.mo15253r()     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo15852u_()     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            java.lang.String r8 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            r7.mo15860a(r8, r9, r6)     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
        L_0x020f:
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x021c, all -> 0x0218 }
            if (r6 != 0) goto L_0x01cd
            if (r5 == 0) goto L_0x026b
            goto L_0x01c8
        L_0x0218:
            r0 = move-exception
            r8 = r5
            goto L_0x0dae
        L_0x021c:
            r0 = move-exception
            r7 = r3
            r8 = r5
            goto L_0x0048
        L_0x0221:
            r0 = move-exception
            r5 = r0
            com.google.android.gms.measurement.internal.r r6 = r4.mo15253r()     // Catch:{ SQLiteException -> 0x0238 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo15852u_()     // Catch:{ SQLiteException -> 0x0238 }
            java.lang.String r7 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)     // Catch:{ SQLiteException -> 0x0238 }
            r6.mo15860a(r7, r9, r5)     // Catch:{ SQLiteException -> 0x0238 }
            if (r8 == 0) goto L_0x026b
            goto L_0x0132
        L_0x0238:
            r0 = move-exception
            r7 = r3
            goto L_0x0048
        L_0x023c:
            r0 = move-exception
            r5 = r1
            r8 = r22
            goto L_0x024f
        L_0x0241:
            r0 = move-exception
            r7 = r3
            r8 = r22
            goto L_0x0048
        L_0x0247:
            r0 = move-exception
            r8 = r3
            r7 = 0
            goto L_0x0048
        L_0x024c:
            r0 = move-exception
            r5 = r1
            r8 = 0
        L_0x024f:
            r1 = r0
            goto L_0x0db1
        L_0x0252:
            r0 = move-exception
            r3 = r0
            r7 = 0
            r8 = 0
        L_0x0256:
            com.google.android.gms.measurement.internal.r r4 = r4.mo15253r()     // Catch:{ all -> 0x0dad }
            com.google.android.gms.measurement.internal.t r4 = r4.mo15852u_()     // Catch:{ all -> 0x0dad }
            java.lang.String r5 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4767r.m23924a(r7)     // Catch:{ all -> 0x0dad }
            r4.mo15860a(r5, r6, r3)     // Catch:{ all -> 0x0dad }
            if (r8 == 0) goto L_0x026b
            goto L_0x0132
        L_0x026b:
            java.util.List<com.google.android.gms.internal.measurement.ct> r3 = r2.f17034c     // Catch:{ all -> 0x0dba }
            if (r3 == 0) goto L_0x027a
            java.util.List<com.google.android.gms.internal.measurement.ct> r3 = r2.f17034c     // Catch:{ all -> 0x0dba }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0dba }
            if (r3 == 0) goto L_0x0278
            goto L_0x027a
        L_0x0278:
            r3 = 0
            goto L_0x027b
        L_0x027a:
            r3 = 1
        L_0x027b:
            if (r3 != 0) goto L_0x0d9c
            com.google.android.gms.internal.measurement.cw r3 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.util.List<com.google.android.gms.internal.measurement.ct> r4 = r2.f17034c     // Catch:{ all -> 0x0dba }
            int r4 = r4.size()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.ct[] r4 = new com.google.android.gms.internal.measurement.C4308ct[r4]     // Catch:{ all -> 0x0dba }
            r3.f15953b = r4     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.es r4 = r4.mo15335b()     // Catch:{ all -> 0x0dba }
            java.lang.String r5 = r3.f15966o     // Catch:{ all -> 0x0dba }
            boolean r4 = r4.mo15741e(r5)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.av r5 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.es r5 = r5.mo15335b()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r6 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r6 = r6.f15966o     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C4756h.f17153ao     // Catch:{ all -> 0x0dba }
            boolean r5 = r5.mo15740d(r6, r7)     // Catch:{ all -> 0x0dba }
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r13 = 0
            r14 = 0
        L_0x02ac:
            java.util.List<com.google.android.gms.internal.measurement.ct> r7 = r2.f17034c     // Catch:{ all -> 0x0dba }
            int r7 = r7.size()     // Catch:{ all -> 0x0dba }
            r16 = 1
            if (r8 >= r7) goto L_0x0746
            java.util.List<com.google.android.gms.internal.measurement.ct> r7 = r2.f17034c     // Catch:{ all -> 0x0dba }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.ct r7 = (com.google.android.gms.internal.measurement.C4308ct) r7     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.aq r12 = r52.m23435s()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r11 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = r11.f15966o     // Catch:{ all -> 0x0dba }
            r24 = r9
            java.lang.String r9 = r7.f15925b     // Catch:{ all -> 0x0dba }
            boolean r9 = r12.mo15301b(r11, r9)     // Catch:{ all -> 0x0dba }
            if (r9 == 0) goto L_0x0341
            com.google.android.gms.measurement.internal.av r9 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r9 = r9.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r9 = r9.mo15849i()     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.cw r12 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = r12.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4767r.m23924a(r12)     // Catch:{ all -> 0x0dba }
            r25 = r8
            com.google.android.gms.measurement.internal.av r8 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.p r8 = r8.mo15344k()     // Catch:{ all -> 0x0dba }
            r26 = r13
            java.lang.String r13 = r7.f15925b     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = r8.mo15841a(r13)     // Catch:{ all -> 0x0dba }
            r9.mo15860a(r11, r12, r8)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.aq r8 = r52.m23435s()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r9 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = r9.f15966o     // Catch:{ all -> 0x0dba }
            boolean r8 = r8.mo15308f(r9)     // Catch:{ all -> 0x0dba }
            if (r8 != 0) goto L_0x0316
            com.google.android.gms.measurement.internal.aq r8 = r52.m23435s()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r9 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = r9.f15966o     // Catch:{ all -> 0x0dba }
            boolean r8 = r8.mo15310g(r9)     // Catch:{ all -> 0x0dba }
            if (r8 == 0) goto L_0x0314
            goto L_0x0316
        L_0x0314:
            r8 = 0
            goto L_0x0317
        L_0x0316:
            r8 = 1
        L_0x0317:
            if (r8 != 0) goto L_0x033c
            java.lang.String r8 = "_err"
            java.lang.String r9 = r7.f15925b     // Catch:{ all -> 0x0dba }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0dba }
            if (r8 != 0) goto L_0x033c
            com.google.android.gms.measurement.internal.av r8 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.ek r16 = r8.mo15343j()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r8 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = r8.f15966o     // Catch:{ all -> 0x0dba }
            r18 = 11
            java.lang.String r19 = "_ev"
            java.lang.String r7 = r7.f15925b     // Catch:{ all -> 0x0dba }
            r21 = 0
            r17 = r8
            r20 = r7
            r16.mo15587a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0dba }
        L_0x033c:
            r9 = r24
            r13 = 3
            goto L_0x073e
        L_0x0341:
            r25 = r8
            r26 = r13
            com.google.android.gms.measurement.internal.aq r8 = r52.m23435s()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r9 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = r9.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = r7.f15925b     // Catch:{ all -> 0x0dba }
            boolean r8 = r8.mo15303c(r9, r11)     // Catch:{ all -> 0x0dba }
            if (r8 != 0) goto L_0x039f
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = r7.f15925b     // Catch:{ all -> 0x0dba }
            com.google.android.gms.common.internal.C3266s.m14915a(r11)     // Catch:{ all -> 0x0dba }
            int r12 = r11.hashCode()     // Catch:{ all -> 0x0dba }
            r13 = 94660(0x171c4, float:1.32647E-40)
            if (r12 == r13) goto L_0x0385
            r13 = 95025(0x17331, float:1.33158E-40)
            if (r12 == r13) goto L_0x037b
            r13 = 95027(0x17333, float:1.33161E-40)
            if (r12 == r13) goto L_0x0371
            goto L_0x038f
        L_0x0371:
            java.lang.String r12 = "_ui"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dba }
            if (r11 == 0) goto L_0x038f
            r11 = 1
            goto L_0x0390
        L_0x037b:
            java.lang.String r12 = "_ug"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dba }
            if (r11 == 0) goto L_0x038f
            r11 = 2
            goto L_0x0390
        L_0x0385:
            java.lang.String r12 = "_in"
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dba }
            if (r11 == 0) goto L_0x038f
            r11 = 0
            goto L_0x0390
        L_0x038f:
            r11 = -1
        L_0x0390:
            switch(r11) {
                case 0: goto L_0x0395;
                case 1: goto L_0x0395;
                case 2: goto L_0x0395;
                default: goto L_0x0393;
            }     // Catch:{ all -> 0x0dba }
        L_0x0393:
            r11 = 0
            goto L_0x0396
        L_0x0395:
            r11 = 1
        L_0x0396:
            if (r11 == 0) goto L_0x0399
            goto L_0x039f
        L_0x0399:
            r37 = r14
            r39 = r24
            goto L_0x0594
        L_0x039f:
            com.google.android.gms.internal.measurement.cu[] r11 = r7.f15924a     // Catch:{ all -> 0x0dba }
            if (r11 != 0) goto L_0x03a8
            r11 = 0
            com.google.android.gms.internal.measurement.cu[] r12 = new com.google.android.gms.internal.measurement.C4309cu[r11]     // Catch:{ all -> 0x0dba }
            r7.f15924a = r12     // Catch:{ all -> 0x0dba }
        L_0x03a8:
            com.google.android.gms.internal.measurement.cu[] r11 = r7.f15924a     // Catch:{ all -> 0x0dba }
            int r12 = r11.length     // Catch:{ all -> 0x0dba }
            r13 = 0
            r18 = 0
            r19 = 0
        L_0x03b0:
            if (r13 >= r12) goto L_0x03e4
            r9 = r11[r13]     // Catch:{ all -> 0x0dba }
            r28 = r11
            java.lang.String r11 = "_c"
            r29 = r12
            java.lang.String r12 = r9.f15930a     // Catch:{ all -> 0x0dba }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dba }
            if (r11 == 0) goto L_0x03cb
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dba }
            r9.f15932c = r11     // Catch:{ all -> 0x0dba }
            r18 = 1
            goto L_0x03dd
        L_0x03cb:
            java.lang.String r11 = "_r"
            java.lang.String r12 = r9.f15930a     // Catch:{ all -> 0x0dba }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dba }
            if (r11 == 0) goto L_0x03dd
            java.lang.Long r11 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dba }
            r9.f15932c = r11     // Catch:{ all -> 0x0dba }
            r19 = 1
        L_0x03dd:
            int r13 = r13 + 1
            r11 = r28
            r12 = r29
            goto L_0x03b0
        L_0x03e4:
            if (r18 != 0) goto L_0x0426
            if (r8 == 0) goto L_0x0426
            com.google.android.gms.measurement.internal.av r9 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r9 = r9.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r9 = r9.mo15855x()     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.av r12 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.p r12 = r12.mo15344k()     // Catch:{ all -> 0x0dba }
            java.lang.String r13 = r7.f15925b     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = r12.mo15841a(r13)     // Catch:{ all -> 0x0dba }
            r9.mo15859a(r11, r12)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r9 = r7.f15924a     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r11 = r7.f15924a     // Catch:{ all -> 0x0dba }
            int r11 = r11.length     // Catch:{ all -> 0x0dba }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r9 = (com.google.android.gms.internal.measurement.C4309cu[]) r9     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu r11 = new com.google.android.gms.internal.measurement.cu     // Catch:{ all -> 0x0dba }
            r11.<init>()     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = "_c"
            r11.f15930a = r12     // Catch:{ all -> 0x0dba }
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dba }
            r11.f15932c = r12     // Catch:{ all -> 0x0dba }
            int r12 = r9.length     // Catch:{ all -> 0x0dba }
            r13 = 1
            int r12 = r12 - r13
            r9[r12] = r11     // Catch:{ all -> 0x0dba }
            r7.f15924a = r9     // Catch:{ all -> 0x0dba }
        L_0x0426:
            if (r19 != 0) goto L_0x0466
            com.google.android.gms.measurement.internal.av r9 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r9 = r9.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r9 = r9.mo15855x()     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.av r12 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.p r12 = r12.mo15344k()     // Catch:{ all -> 0x0dba }
            java.lang.String r13 = r7.f15925b     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = r12.mo15841a(r13)     // Catch:{ all -> 0x0dba }
            r9.mo15859a(r11, r12)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r9 = r7.f15924a     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r11 = r7.f15924a     // Catch:{ all -> 0x0dba }
            int r11 = r11.length     // Catch:{ all -> 0x0dba }
            r12 = 1
            int r11 = r11 + r12
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r11)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r9 = (com.google.android.gms.internal.measurement.C4309cu[]) r9     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu r11 = new com.google.android.gms.internal.measurement.cu     // Catch:{ all -> 0x0dba }
            r11.<init>()     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = "_r"
            r11.f15930a = r12     // Catch:{ all -> 0x0dba }
            java.lang.Long r12 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dba }
            r11.f15932c = r12     // Catch:{ all -> 0x0dba }
            int r12 = r9.length     // Catch:{ all -> 0x0dba }
            r13 = 1
            int r12 = r12 - r13
            r9[r12] = r11     // Catch:{ all -> 0x0dba }
            r7.f15924a = r9     // Catch:{ all -> 0x0dba }
        L_0x0466:
            com.google.android.gms.measurement.internal.ev r28 = r52.mo15546d()     // Catch:{ all -> 0x0dba }
            long r29 = r52.m23439x()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r9 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = r9.f15966o     // Catch:{ all -> 0x0dba }
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 1
            r31 = r9
            com.google.android.gms.measurement.internal.ew r9 = r28.mo15773a(r29, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0dba }
            long r11 = r9.f17103e     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.av r9 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.es r9 = r9.mo15335b()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r13 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r13 = r13.f15966o     // Catch:{ all -> 0x0dba }
            int r9 = r9.mo15731a(r13)     // Catch:{ all -> 0x0dba }
            r37 = r14
            long r13 = (long) r9     // Catch:{ all -> 0x0dba }
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x04d1
            r9 = 0
        L_0x049a:
            com.google.android.gms.internal.measurement.cu[] r11 = r7.f15924a     // Catch:{ all -> 0x0dba }
            int r11 = r11.length     // Catch:{ all -> 0x0dba }
            if (r9 >= r11) goto L_0x04ce
            java.lang.String r11 = "_r"
            com.google.android.gms.internal.measurement.cu[] r12 = r7.f15924a     // Catch:{ all -> 0x0dba }
            r12 = r12[r9]     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = r12.f15930a     // Catch:{ all -> 0x0dba }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dba }
            if (r11 == 0) goto L_0x04cb
            com.google.android.gms.internal.measurement.cu[] r11 = r7.f15924a     // Catch:{ all -> 0x0dba }
            int r11 = r11.length     // Catch:{ all -> 0x0dba }
            r12 = 1
            int r11 = r11 - r12
            com.google.android.gms.internal.measurement.cu[] r11 = new com.google.android.gms.internal.measurement.C4309cu[r11]     // Catch:{ all -> 0x0dba }
            if (r9 <= 0) goto L_0x04bc
            com.google.android.gms.internal.measurement.cu[] r12 = r7.f15924a     // Catch:{ all -> 0x0dba }
            r13 = 0
            java.lang.System.arraycopy(r12, r13, r11, r13, r9)     // Catch:{ all -> 0x0dba }
        L_0x04bc:
            int r12 = r11.length     // Catch:{ all -> 0x0dba }
            if (r9 >= r12) goto L_0x04c8
            com.google.android.gms.internal.measurement.cu[] r12 = r7.f15924a     // Catch:{ all -> 0x0dba }
            int r13 = r9 + 1
            int r14 = r11.length     // Catch:{ all -> 0x0dba }
            int r14 = r14 - r9
            java.lang.System.arraycopy(r12, r13, r11, r9, r14)     // Catch:{ all -> 0x0dba }
        L_0x04c8:
            r7.f15924a = r11     // Catch:{ all -> 0x0dba }
            goto L_0x04ce
        L_0x04cb:
            int r9 = r9 + 1
            goto L_0x049a
        L_0x04ce:
            r9 = r24
            goto L_0x04d2
        L_0x04d1:
            r9 = 1
        L_0x04d2:
            java.lang.String r11 = r7.f15925b     // Catch:{ all -> 0x0dba }
            boolean r11 = com.google.android.gms.measurement.internal.C4736ek.m23532a(r11)     // Catch:{ all -> 0x0dba }
            if (r11 == 0) goto L_0x0592
            if (r8 == 0) goto L_0x0592
            com.google.android.gms.measurement.internal.ev r12 = r52.mo15546d()     // Catch:{ all -> 0x0dba }
            long r13 = r52.m23439x()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r11 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r15 = r11.f15966o     // Catch:{ all -> 0x0dba }
            r16 = 0
            r17 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            com.google.android.gms.measurement.internal.ew r11 = r12.mo15773a(r13, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0dba }
            long r11 = r11.f17101c     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.av r13 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.es r13 = r13.mo15335b()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r14 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r14 = r14.f15966o     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.C4756h.f17185v     // Catch:{ all -> 0x0dba }
            int r13 = r13.mo15735b(r14, r15)     // Catch:{ all -> 0x0dba }
            long r13 = (long) r13     // Catch:{ all -> 0x0dba }
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0592
            com.google.android.gms.measurement.internal.av r11 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r11 = r11.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r11 = r11.mo15849i()     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.cw r13 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r13 = r13.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4767r.m23924a(r13)     // Catch:{ all -> 0x0dba }
            r11.mo15859a(r12, r13)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r11 = r7.f15924a     // Catch:{ all -> 0x0dba }
            int r12 = r11.length     // Catch:{ all -> 0x0dba }
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x052a:
            if (r13 >= r12) goto L_0x0554
            r39 = r9
            r9 = r11[r13]     // Catch:{ all -> 0x0dba }
            r40 = r11
            java.lang.String r11 = "_c"
            r41 = r12
            java.lang.String r12 = r9.f15930a     // Catch:{ all -> 0x0dba }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0dba }
            if (r11 == 0) goto L_0x0540
            r15 = r9
            goto L_0x054b
        L_0x0540:
            java.lang.String r11 = "_err"
            java.lang.String r9 = r9.f15930a     // Catch:{ all -> 0x0dba }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0dba }
            if (r9 == 0) goto L_0x054b
            r14 = 1
        L_0x054b:
            int r13 = r13 + 1
            r9 = r39
            r11 = r40
            r12 = r41
            goto L_0x052a
        L_0x0554:
            r39 = r9
            if (r14 == 0) goto L_0x056b
            if (r15 == 0) goto L_0x056b
            com.google.android.gms.internal.measurement.cu[] r9 = r7.f15924a     // Catch:{ all -> 0x0dba }
            r11 = 1
            com.google.android.gms.internal.measurement.cu[] r12 = new com.google.android.gms.internal.measurement.C4309cu[r11]     // Catch:{ all -> 0x0dba }
            r11 = 0
            r12[r11] = r15     // Catch:{ all -> 0x0dba }
            java.lang.Object[] r9 = com.google.android.gms.common.util.C3297b.m15031a((T[]) r9, (T[]) r12)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r9 = (com.google.android.gms.internal.measurement.C4309cu[]) r9     // Catch:{ all -> 0x0dba }
            r7.f15924a = r9     // Catch:{ all -> 0x0dba }
            goto L_0x0594
        L_0x056b:
            if (r15 == 0) goto L_0x057a
            java.lang.String r9 = "_err"
            r15.f15930a = r9     // Catch:{ all -> 0x0dba }
            r11 = 10
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0dba }
            r15.f15932c = r9     // Catch:{ all -> 0x0dba }
            goto L_0x0594
        L_0x057a:
            com.google.android.gms.measurement.internal.av r9 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r9 = r9.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r9 = r9.mo15852u_()     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.cw r12 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = r12.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4767r.m23924a(r12)     // Catch:{ all -> 0x0dba }
            r9.mo15859a(r11, r12)     // Catch:{ all -> 0x0dba }
            goto L_0x0594
        L_0x0592:
            r39 = r9
        L_0x0594:
            com.google.android.gms.measurement.internal.av r9 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.es r9 = r9.mo15335b()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r11 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = r11.f15966o     // Catch:{ all -> 0x0dba }
            boolean r9 = r9.mo15753m(r11)     // Catch:{ all -> 0x0dba }
            if (r9 == 0) goto L_0x0654
            if (r8 == 0) goto L_0x0654
            com.google.android.gms.internal.measurement.cu[] r8 = r7.f15924a     // Catch:{ all -> 0x0dba }
            r9 = 0
            r11 = -1
            r12 = -1
        L_0x05ab:
            int r13 = r8.length     // Catch:{ all -> 0x0dba }
            if (r9 >= r13) goto L_0x05cc
            java.lang.String r13 = "value"
            r14 = r8[r9]     // Catch:{ all -> 0x0dba }
            java.lang.String r14 = r14.f15930a     // Catch:{ all -> 0x0dba }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0dba }
            if (r13 == 0) goto L_0x05bc
            r11 = r9
            goto L_0x05c9
        L_0x05bc:
            java.lang.String r13 = "currency"
            r14 = r8[r9]     // Catch:{ all -> 0x0dba }
            java.lang.String r14 = r14.f15930a     // Catch:{ all -> 0x0dba }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0dba }
            if (r13 == 0) goto L_0x05c9
            r12 = r9
        L_0x05c9:
            int r9 = r9 + 1
            goto L_0x05ab
        L_0x05cc:
            r9 = -1
            if (r11 == r9) goto L_0x05fc
            r9 = r8[r11]     // Catch:{ all -> 0x0dba }
            java.lang.Long r9 = r9.f15932c     // Catch:{ all -> 0x0dba }
            if (r9 != 0) goto L_0x05fe
            r9 = r8[r11]     // Catch:{ all -> 0x0dba }
            java.lang.Double r9 = r9.f15933d     // Catch:{ all -> 0x0dba }
            if (r9 != 0) goto L_0x05fe
            com.google.android.gms.measurement.internal.av r9 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r9 = r9.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r9 = r9.mo15851k()     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = "Value must be specified with a numeric type."
            r9.mo15858a(r12)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r8 = m23428a(r8, r11)     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = "_c"
            com.google.android.gms.internal.measurement.cu[] r8 = m23430a(r8, r9)     // Catch:{ all -> 0x0dba }
            r9 = 18
            java.lang.String r11 = "value"
            com.google.android.gms.internal.measurement.cu[] r8 = m23429a(r8, r9, r11)     // Catch:{ all -> 0x0dba }
        L_0x05fc:
            r13 = 3
            goto L_0x0651
        L_0x05fe:
            r9 = -1
            if (r12 != r9) goto L_0x0604
            r9 = 1
            r13 = 3
            goto L_0x062e
        L_0x0604:
            r9 = r8[r12]     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = r9.f15931b     // Catch:{ all -> 0x0dba }
            if (r9 == 0) goto L_0x062c
            int r12 = r9.length()     // Catch:{ all -> 0x0dba }
            r13 = 3
            if (r12 == r13) goto L_0x0612
            goto L_0x062d
        L_0x0612:
            r12 = 0
        L_0x0613:
            int r14 = r9.length()     // Catch:{ all -> 0x0dba }
            if (r12 >= r14) goto L_0x062a
            int r14 = r9.codePointAt(r12)     // Catch:{ all -> 0x0dba }
            boolean r15 = java.lang.Character.isLetter(r14)     // Catch:{ all -> 0x0dba }
            if (r15 != 0) goto L_0x0624
            goto L_0x062d
        L_0x0624:
            int r14 = java.lang.Character.charCount(r14)     // Catch:{ all -> 0x0dba }
            int r12 = r12 + r14
            goto L_0x0613
        L_0x062a:
            r9 = 0
            goto L_0x062e
        L_0x062c:
            r13 = 3
        L_0x062d:
            r9 = 1
        L_0x062e:
            if (r9 == 0) goto L_0x0651
            com.google.android.gms.measurement.internal.av r9 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r9 = r9.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r9 = r9.mo15851k()     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r9.mo15858a(r12)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r8 = m23428a(r8, r11)     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = "_c"
            com.google.android.gms.internal.measurement.cu[] r8 = m23430a(r8, r9)     // Catch:{ all -> 0x0dba }
            r9 = 19
            java.lang.String r11 = "currency"
            com.google.android.gms.internal.measurement.cu[] r8 = m23429a(r8, r9, r11)     // Catch:{ all -> 0x0dba }
        L_0x0651:
            r7.f15924a = r8     // Catch:{ all -> 0x0dba }
            goto L_0x0655
        L_0x0654:
            r13 = 3
        L_0x0655:
            com.google.android.gms.measurement.internal.av r8 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.es r8 = r8.mo15335b()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r9 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = r9.f15966o     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.C4756h.f17152an     // Catch:{ all -> 0x0dba }
            boolean r8 = r8.mo15740d(r9, r11)     // Catch:{ all -> 0x0dba }
            if (r8 == 0) goto L_0x06d6
            java.lang.String r8 = "_e"
            java.lang.String r9 = r7.f15925b     // Catch:{ all -> 0x0dba }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0dba }
            r11 = 1000(0x3e8, double:4.94E-321)
            if (r8 == 0) goto L_0x06a1
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = "_fr"
            com.google.android.gms.internal.measurement.cu r8 = com.google.android.gms.measurement.internal.C4733eh.m23483a(r7, r8)     // Catch:{ all -> 0x0dba }
            if (r8 != 0) goto L_0x06d6
            if (r6 == 0) goto L_0x069f
            java.lang.Long r8 = r6.f15926c     // Catch:{ all -> 0x0dba }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0dba }
            java.lang.Long r10 = r7.f15926c     // Catch:{ all -> 0x0dba }
            long r14 = r10.longValue()     // Catch:{ all -> 0x0dba }
            r10 = 0
            long r8 = r8 - r14
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0dba }
            int r10 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x069f
            boolean r8 = r1.m23426a(r7, r6)     // Catch:{ all -> 0x0dba }
            if (r8 == 0) goto L_0x069f
        L_0x069c:
            r6 = 0
            r10 = 0
            goto L_0x06d6
        L_0x069f:
            r10 = r7
            goto L_0x06d6
        L_0x06a1:
            java.lang.String r8 = "_vs"
            java.lang.String r9 = r7.f15925b     // Catch:{ all -> 0x0dba }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0dba }
            if (r8 == 0) goto L_0x06d6
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = "_et"
            com.google.android.gms.internal.measurement.cu r8 = com.google.android.gms.measurement.internal.C4733eh.m23483a(r7, r8)     // Catch:{ all -> 0x0dba }
            if (r8 != 0) goto L_0x06d6
            if (r10 == 0) goto L_0x06d5
            java.lang.Long r6 = r10.f15926c     // Catch:{ all -> 0x0dba }
            long r8 = r6.longValue()     // Catch:{ all -> 0x0dba }
            java.lang.Long r6 = r7.f15926c     // Catch:{ all -> 0x0dba }
            long r14 = r6.longValue()     // Catch:{ all -> 0x0dba }
            r6 = 0
            long r8 = r8 - r14
            long r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0dba }
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x06d5
            boolean r6 = r1.m23426a(r10, r7)     // Catch:{ all -> 0x0dba }
            if (r6 == 0) goto L_0x06d5
            goto L_0x069c
        L_0x06d5:
            r6 = r7
        L_0x06d6:
            if (r4 == 0) goto L_0x0732
            if (r5 != 0) goto L_0x0732
            java.lang.String r8 = "_e"
            java.lang.String r9 = r7.f15925b     // Catch:{ all -> 0x0dba }
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x0dba }
            if (r8 == 0) goto L_0x0732
            com.google.android.gms.internal.measurement.cu[] r8 = r7.f15924a     // Catch:{ all -> 0x0dba }
            if (r8 == 0) goto L_0x071d
            com.google.android.gms.internal.measurement.cu[] r8 = r7.f15924a     // Catch:{ all -> 0x0dba }
            int r8 = r8.length     // Catch:{ all -> 0x0dba }
            if (r8 != 0) goto L_0x06ee
            goto L_0x071d
        L_0x06ee:
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = "_et"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4733eh.m23493b(r7, r8)     // Catch:{ all -> 0x0dba }
            java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x0dba }
            if (r8 != 0) goto L_0x0713
            com.google.android.gms.measurement.internal.av r8 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r8 = r8.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r8 = r8.mo15849i()     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.cw r11 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = r11.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4767r.m23924a(r11)     // Catch:{ all -> 0x0dba }
        L_0x070f:
            r8.mo15859a(r9, r11)     // Catch:{ all -> 0x0dba }
            goto L_0x0732
        L_0x0713:
            long r8 = r8.longValue()     // Catch:{ all -> 0x0dba }
            r11 = 0
            long r14 = r37 + r8
            r37 = r14
            goto L_0x0732
        L_0x071d:
            com.google.android.gms.measurement.internal.av r8 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r8 = r8.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r8 = r8.mo15849i()     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.cw r11 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r11 = r11.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4767r.m23924a(r11)     // Catch:{ all -> 0x0dba }
            goto L_0x070f
        L_0x0732:
            com.google.android.gms.internal.measurement.ct[] r8 = r3.f15953b     // Catch:{ all -> 0x0dba }
            int r9 = r26 + 1
            r8[r26] = r7     // Catch:{ all -> 0x0dba }
            r26 = r9
            r14 = r37
            r9 = r39
        L_0x073e:
            int r8 = r25 + 1
            r13 = r26
            r11 = 0
            r12 = 1
            goto L_0x02ac
        L_0x0746:
            r24 = r9
            r26 = r13
            r37 = r14
            if (r5 == 0) goto L_0x07a7
            r13 = r26
            r14 = r37
            r5 = 0
        L_0x0753:
            if (r5 >= r13) goto L_0x07a4
            com.google.android.gms.internal.measurement.ct[] r6 = r3.f15953b     // Catch:{ all -> 0x0dba }
            r6 = r6[r5]     // Catch:{ all -> 0x0dba }
            java.lang.String r7 = "_e"
            java.lang.String r8 = r6.f15925b     // Catch:{ all -> 0x0dba }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0dba }
            if (r7 == 0) goto L_0x0780
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            java.lang.String r7 = "_fr"
            com.google.android.gms.internal.measurement.cu r7 = com.google.android.gms.measurement.internal.C4733eh.m23483a(r6, r7)     // Catch:{ all -> 0x0dba }
            if (r7 == 0) goto L_0x0780
            com.google.android.gms.internal.measurement.ct[] r6 = r3.f15953b     // Catch:{ all -> 0x0dba }
            int r7 = r5 + 1
            com.google.android.gms.internal.measurement.ct[] r8 = r3.f15953b     // Catch:{ all -> 0x0dba }
            int r9 = r13 - r5
            r10 = 1
            int r9 = r9 - r10
            java.lang.System.arraycopy(r6, r7, r8, r5, r9)     // Catch:{ all -> 0x0dba }
            int r13 = r13 + -1
            int r5 = r5 + -1
            goto L_0x07a1
        L_0x0780:
            if (r4 == 0) goto L_0x07a1
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            java.lang.String r7 = "_et"
            com.google.android.gms.internal.measurement.cu r6 = com.google.android.gms.measurement.internal.C4733eh.m23483a(r6, r7)     // Catch:{ all -> 0x0dba }
            if (r6 == 0) goto L_0x07a1
            java.lang.Long r6 = r6.f15932c     // Catch:{ all -> 0x0dba }
            if (r6 == 0) goto L_0x07a1
            long r7 = r6.longValue()     // Catch:{ all -> 0x0dba }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x07a1
            long r6 = r6.longValue()     // Catch:{ all -> 0x0dba }
            r8 = 0
            long r14 = r14 + r6
        L_0x07a1:
            r6 = 1
            int r5 = r5 + r6
            goto L_0x0753
        L_0x07a4:
            r37 = r14
            goto L_0x07a9
        L_0x07a7:
            r13 = r26
        L_0x07a9:
            java.util.List<com.google.android.gms.internal.measurement.ct> r5 = r2.f17034c     // Catch:{ all -> 0x0dba }
            int r5 = r5.size()     // Catch:{ all -> 0x0dba }
            if (r13 >= r5) goto L_0x07bb
            com.google.android.gms.internal.measurement.ct[] r5 = r3.f15953b     // Catch:{ all -> 0x0dba }
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r13)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.ct[] r5 = (com.google.android.gms.internal.measurement.C4308ct[]) r5     // Catch:{ all -> 0x0dba }
            r3.f15953b = r5     // Catch:{ all -> 0x0dba }
        L_0x07bb:
            if (r4 == 0) goto L_0x088b
            com.google.android.gms.measurement.internal.ev r4 = r52.mo15546d()     // Catch:{ all -> 0x0dba }
            java.lang.String r5 = r3.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.String r6 = "_lte"
            com.google.android.gms.measurement.internal.ej r4 = r4.mo15792c(r5, r6)     // Catch:{ all -> 0x0dba }
            if (r4 == 0) goto L_0x07f7
            java.lang.Object r5 = r4.f17049e     // Catch:{ all -> 0x0dba }
            if (r5 != 0) goto L_0x07d0
            goto L_0x07f7
        L_0x07d0:
            com.google.android.gms.measurement.internal.ej r5 = new com.google.android.gms.measurement.internal.ej     // Catch:{ all -> 0x0dba }
            java.lang.String r7 = r3.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = "auto"
            java.lang.String r9 = "_lte"
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.common.util.e r6 = r6.mo15248m()     // Catch:{ all -> 0x0dba }
            long r10 = r6.mo11326a()     // Catch:{ all -> 0x0dba }
            java.lang.Object r4 = r4.f17049e     // Catch:{ all -> 0x0dba }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0dba }
            long r12 = r4.longValue()     // Catch:{ all -> 0x0dba }
            r4 = 0
            long r12 = r12 + r37
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0dba }
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x0dba }
            r4 = r5
            goto L_0x0814
        L_0x07f7:
            com.google.android.gms.measurement.internal.ej r4 = new com.google.android.gms.measurement.internal.ej     // Catch:{ all -> 0x0dba }
            java.lang.String r5 = r3.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.String r27 = "auto"
            java.lang.String r28 = "_lte"
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.common.util.e r6 = r6.mo15248m()     // Catch:{ all -> 0x0dba }
            long r29 = r6.mo11326a()     // Catch:{ all -> 0x0dba }
            java.lang.Long r31 = java.lang.Long.valueOf(r37)     // Catch:{ all -> 0x0dba }
            r25 = r4
            r26 = r5
            r25.<init>(r26, r27, r28, r29, r31)     // Catch:{ all -> 0x0dba }
        L_0x0814:
            com.google.android.gms.internal.measurement.cz r5 = new com.google.android.gms.internal.measurement.cz     // Catch:{ all -> 0x0dba }
            r5.<init>()     // Catch:{ all -> 0x0dba }
            java.lang.String r6 = "_lte"
            r5.f15987b = r6     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.common.util.e r6 = r6.mo15248m()     // Catch:{ all -> 0x0dba }
            long r6 = r6.mo11326a()     // Catch:{ all -> 0x0dba }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0dba }
            r5.f15986a = r6     // Catch:{ all -> 0x0dba }
            java.lang.Object r6 = r4.f17049e     // Catch:{ all -> 0x0dba }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0dba }
            r5.f15989d = r6     // Catch:{ all -> 0x0dba }
            r6 = 0
        L_0x0834:
            com.google.android.gms.internal.measurement.cz[] r7 = r3.f15954c     // Catch:{ all -> 0x0dba }
            int r7 = r7.length     // Catch:{ all -> 0x0dba }
            if (r6 >= r7) goto L_0x0850
            java.lang.String r7 = "_lte"
            com.google.android.gms.internal.measurement.cz[] r8 = r3.f15954c     // Catch:{ all -> 0x0dba }
            r8 = r8[r6]     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = r8.f15987b     // Catch:{ all -> 0x0dba }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0dba }
            if (r7 == 0) goto L_0x084d
            com.google.android.gms.internal.measurement.cz[] r7 = r3.f15954c     // Catch:{ all -> 0x0dba }
            r7[r6] = r5     // Catch:{ all -> 0x0dba }
            r6 = 1
            goto L_0x0851
        L_0x084d:
            int r6 = r6 + 1
            goto L_0x0834
        L_0x0850:
            r6 = 0
        L_0x0851:
            if (r6 != 0) goto L_0x086d
            com.google.android.gms.internal.measurement.cz[] r6 = r3.f15954c     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cz[] r7 = r3.f15954c     // Catch:{ all -> 0x0dba }
            int r7 = r7.length     // Catch:{ all -> 0x0dba }
            r8 = 1
            int r7 = r7 + r8
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cz[] r6 = (com.google.android.gms.internal.measurement.C4314cz[]) r6     // Catch:{ all -> 0x0dba }
            r3.f15954c = r6     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cz[] r6 = r3.f15954c     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r7 = r2.f17032a     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cz[] r7 = r7.f15954c     // Catch:{ all -> 0x0dba }
            int r7 = r7.length     // Catch:{ all -> 0x0dba }
            r8 = 1
            int r7 = r7 - r8
            r6[r7] = r5     // Catch:{ all -> 0x0dba }
        L_0x086d:
            r5 = 0
            int r7 = (r37 > r5 ? 1 : (r37 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x088b
            com.google.android.gms.measurement.internal.ev r5 = r52.mo15546d()     // Catch:{ all -> 0x0dba }
            r5.mo15785a(r4)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.av r5 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r5 = r5.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r5 = r5.mo15854w()     // Catch:{ all -> 0x0dba }
            java.lang.String r6 = "Updated lifetime engagement user property with value. Value"
            java.lang.Object r4 = r4.f17049e     // Catch:{ all -> 0x0dba }
            r5.mo15859a(r6, r4)     // Catch:{ all -> 0x0dba }
        L_0x088b:
            java.lang.String r4 = r3.f15966o     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cz[] r5 = r3.f15954c     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.ct[] r6 = r3.f15953b     // Catch:{ all -> 0x0dba }
            com.google.android.gms.common.internal.C3266s.m14915a(r4)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.ep r7 = r52.mo15548e()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cr[] r4 = r7.mo15728a(r4, r6, r5)     // Catch:{ all -> 0x0dba }
            r3.f15937A = r4     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.es r4 = r4.mo15335b()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r5 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r5 = r5.f15966o     // Catch:{ all -> 0x0dba }
            boolean r4 = r4.mo15739d(r5)     // Catch:{ all -> 0x0dba }
            if (r4 == 0) goto L_0x0bd1
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0bcb }
            r4.<init>()     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.ct[] r5 = r3.f15953b     // Catch:{ all -> 0x0bcb }
            int r5 = r5.length     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.ct[] r5 = new com.google.android.gms.internal.measurement.C4308ct[r5]     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.measurement.internal.ek r6 = r6.mo15343j()     // Catch:{ all -> 0x0bcb }
            java.security.SecureRandom r6 = r6.mo15599h()     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.ct[] r7 = r3.f15953b     // Catch:{ all -> 0x0bcb }
            int r8 = r7.length     // Catch:{ all -> 0x0bcb }
            r9 = 0
            r10 = 0
        L_0x08c7:
            if (r9 >= r8) goto L_0x0b99
            r11 = r7[r9]     // Catch:{ all -> 0x0bcb }
            java.lang.String r12 = r11.f15925b     // Catch:{ all -> 0x0bcb }
            java.lang.String r13 = "_ep"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0bcb }
            if (r12 == 0) goto L_0x0952
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = "_en"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4733eh.m23493b(r11, r12)     // Catch:{ all -> 0x0dba }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0dba }
            java.lang.Object r13 = r4.get(r12)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.d r13 = (com.google.android.gms.measurement.internal.C4697d) r13     // Catch:{ all -> 0x0dba }
            if (r13 != 0) goto L_0x08f7
            com.google.android.gms.measurement.internal.ev r13 = r52.mo15546d()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r14 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r14 = r14.f15966o     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.d r13 = r13.mo15772a(r14, r12)     // Catch:{ all -> 0x0dba }
            r4.put(r12, r13)     // Catch:{ all -> 0x0dba }
        L_0x08f7:
            java.lang.Long r12 = r13.f16935h     // Catch:{ all -> 0x0dba }
            if (r12 != 0) goto L_0x0944
            java.lang.Long r12 = r13.f16936i     // Catch:{ all -> 0x0dba }
            long r14 = r12.longValue()     // Catch:{ all -> 0x0dba }
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x0914
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r12 = r11.f15924a     // Catch:{ all -> 0x0dba }
            java.lang.String r14 = "_sr"
            java.lang.Long r15 = r13.f16936i     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r12 = com.google.android.gms.measurement.internal.C4733eh.m23492a(r12, r14, r15)     // Catch:{ all -> 0x0dba }
            r11.f15924a = r12     // Catch:{ all -> 0x0dba }
        L_0x0914:
            java.lang.Boolean r12 = r13.f16937j     // Catch:{ all -> 0x0dba }
            if (r12 == 0) goto L_0x0931
            java.lang.Boolean r12 = r13.f16937j     // Catch:{ all -> 0x0dba }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0dba }
            if (r12 == 0) goto L_0x0931
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r12 = r11.f15924a     // Catch:{ all -> 0x0dba }
            java.lang.String r13 = "_efs"
            java.lang.Long r14 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r12 = com.google.android.gms.measurement.internal.C4733eh.m23492a(r12, r13, r14)     // Catch:{ all -> 0x0dba }
            r11.f15924a = r12     // Catch:{ all -> 0x0dba }
        L_0x0931:
            int r12 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0dba }
            r50 = r2
            r44 = r3
            r49 = r6
            r42 = r7
            r43 = r8
            r45 = r9
            r10 = r12
            goto L_0x0b89
        L_0x0944:
            r50 = r2
            r44 = r3
            r49 = r6
            r42 = r7
            r43 = r8
            r45 = r9
            goto L_0x0b89
        L_0x0952:
            com.google.android.gms.measurement.internal.aq r12 = r52.m23435s()     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.cw r13 = r2.f17032a     // Catch:{ all -> 0x0bcb }
            java.lang.String r13 = r13.f15966o     // Catch:{ all -> 0x0bcb }
            long r12 = r12.mo15306e(r13)     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.measurement.internal.av r14 = r1.f17016j     // Catch:{ all -> 0x0bcb }
            r14.mo15343j()     // Catch:{ all -> 0x0bcb }
            java.lang.Long r14 = r11.f15926c     // Catch:{ all -> 0x0bcb }
            long r14 = r14.longValue()     // Catch:{ all -> 0x0bcb }
            long r14 = com.google.android.gms.measurement.internal.C4736ek.m23524a(r14, r12)     // Catch:{ all -> 0x0bcb }
            r42 = r7
            java.lang.String r7 = "_dbg"
            r43 = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0bcb }
            boolean r18 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0bcb }
            if (r18 != 0) goto L_0x09c3
            if (r8 != 0) goto L_0x0980
            goto L_0x09c3
        L_0x0980:
            r44 = r3
            com.google.android.gms.internal.measurement.cu[] r3 = r11.f15924a     // Catch:{ all -> 0x0dba }
            r45 = r9
            int r9 = r3.length     // Catch:{ all -> 0x0dba }
            r46 = r12
            r12 = 0
        L_0x098a:
            if (r12 >= r9) goto L_0x09c9
            r13 = r3[r12]     // Catch:{ all -> 0x0dba }
            r48 = r3
            java.lang.String r3 = r13.f15930a     // Catch:{ all -> 0x0dba }
            boolean r3 = r7.equals(r3)     // Catch:{ all -> 0x0dba }
            if (r3 == 0) goto L_0x09be
            boolean r3 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x0dba }
            if (r3 == 0) goto L_0x09a4
            java.lang.Long r3 = r13.f15932c     // Catch:{ all -> 0x0dba }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0dba }
            if (r3 != 0) goto L_0x09bc
        L_0x09a4:
            boolean r3 = r8 instanceof java.lang.String     // Catch:{ all -> 0x0dba }
            if (r3 == 0) goto L_0x09b0
            java.lang.String r3 = r13.f15931b     // Catch:{ all -> 0x0dba }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0dba }
            if (r3 != 0) goto L_0x09bc
        L_0x09b0:
            boolean r3 = r8 instanceof java.lang.Double     // Catch:{ all -> 0x0dba }
            if (r3 == 0) goto L_0x09c9
            java.lang.Double r3 = r13.f15933d     // Catch:{ all -> 0x0dba }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x0dba }
            if (r3 == 0) goto L_0x09c9
        L_0x09bc:
            r3 = 1
            goto L_0x09ca
        L_0x09be:
            int r12 = r12 + 1
            r3 = r48
            goto L_0x098a
        L_0x09c3:
            r44 = r3
            r45 = r9
            r46 = r12
        L_0x09c9:
            r3 = 0
        L_0x09ca:
            if (r3 != 0) goto L_0x09db
            com.google.android.gms.measurement.internal.aq r3 = r52.m23435s()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r7 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r7 = r7.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = r11.f15925b     // Catch:{ all -> 0x0dba }
            int r12 = r3.mo15304d(r7, r8)     // Catch:{ all -> 0x0dba }
            goto L_0x09dc
        L_0x09db:
            r12 = 1
        L_0x09dc:
            if (r12 > 0) goto L_0x09fe
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r3 = r3.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r3 = r3.mo15849i()     // Catch:{ all -> 0x0dba }
            java.lang.String r7 = "Sample rate must be positive. event, rate"
            java.lang.String r8 = r11.f15925b     // Catch:{ all -> 0x0dba }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0dba }
            r3.mo15860a(r7, r8, r9)     // Catch:{ all -> 0x0dba }
            int r3 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0dba }
            r50 = r2
            r10 = r3
            r49 = r6
            goto L_0x0b89
        L_0x09fe:
            java.lang.String r3 = r11.f15925b     // Catch:{ all -> 0x0bcb }
            java.lang.Object r3 = r4.get(r3)     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.measurement.internal.d r3 = (com.google.android.gms.measurement.internal.C4697d) r3     // Catch:{ all -> 0x0bcb }
            if (r3 != 0) goto L_0x0a52
            com.google.android.gms.measurement.internal.ev r3 = r52.mo15546d()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r7 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r7 = r7.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = r11.f15925b     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.d r3 = r3.mo15772a(r7, r8)     // Catch:{ all -> 0x0dba }
            if (r3 != 0) goto L_0x0a52
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.r r3 = r3.mo15253r()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.t r3 = r3.mo15849i()     // Catch:{ all -> 0x0dba }
            java.lang.String r7 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.cw r8 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = r8.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = r11.f15925b     // Catch:{ all -> 0x0dba }
            r3.mo15860a(r7, r8, r9)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.d r3 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cw r7 = r2.f17032a     // Catch:{ all -> 0x0dba }
            java.lang.String r7 = r7.f15966o     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = r11.f15925b     // Catch:{ all -> 0x0dba }
            r28 = 1
            r30 = 1
            java.lang.Long r9 = r11.f15926c     // Catch:{ all -> 0x0dba }
            long r32 = r9.longValue()     // Catch:{ all -> 0x0dba }
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r25 = r3
            r26 = r7
            r27 = r8
            r25.<init>(r26, r27, r28, r30, r32, r34, r36, r37, r38, r39)     // Catch:{ all -> 0x0dba }
        L_0x0a52:
            r52.mo15550g()     // Catch:{ all -> 0x0bcb }
            java.lang.String r7 = "_eid"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4733eh.m23493b(r11, r7)     // Catch:{ all -> 0x0bcb }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0bcb }
            if (r7 == 0) goto L_0x0a61
            r8 = 1
            goto L_0x0a62
        L_0x0a61:
            r8 = 0
        L_0x0a62:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0bcb }
            r9 = 1
            if (r12 != r9) goto L_0x0a90
            int r7 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0dba }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0dba }
            if (r8 == 0) goto L_0x0a89
            java.lang.Long r8 = r3.f16935h     // Catch:{ all -> 0x0dba }
            if (r8 != 0) goto L_0x0a7f
            java.lang.Long r8 = r3.f16936i     // Catch:{ all -> 0x0dba }
            if (r8 != 0) goto L_0x0a7f
            java.lang.Boolean r8 = r3.f16937j     // Catch:{ all -> 0x0dba }
            if (r8 == 0) goto L_0x0a89
        L_0x0a7f:
            r8 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo15477a(r8, r8, r8)     // Catch:{ all -> 0x0dba }
            java.lang.String r8 = r11.f15925b     // Catch:{ all -> 0x0dba }
            r4.put(r8, r3)     // Catch:{ all -> 0x0dba }
        L_0x0a89:
            r50 = r2
            r49 = r6
            r10 = r7
            goto L_0x0b89
        L_0x0a90:
            int r9 = r6.nextInt(r12)     // Catch:{ all -> 0x0bcb }
            if (r9 != 0) goto L_0x0ad1
            r52.mo15550g()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r7 = r11.f15924a     // Catch:{ all -> 0x0dba }
            java.lang.String r9 = "_sr"
            long r12 = (long) r12     // Catch:{ all -> 0x0dba }
            r49 = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0dba }
            com.google.android.gms.internal.measurement.cu[] r6 = com.google.android.gms.measurement.internal.C4733eh.m23492a(r7, r9, r6)     // Catch:{ all -> 0x0dba }
            r11.f15924a = r6     // Catch:{ all -> 0x0dba }
            int r6 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0dba }
            boolean r7 = r8.booleanValue()     // Catch:{ all -> 0x0dba }
            if (r7 == 0) goto L_0x0abd
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0dba }
            r8 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo15477a(r8, r7, r8)     // Catch:{ all -> 0x0dba }
        L_0x0abd:
            java.lang.String r7 = r11.f15925b     // Catch:{ all -> 0x0dba }
            java.lang.Long r8 = r11.f15926c     // Catch:{ all -> 0x0dba }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0dba }
            com.google.android.gms.measurement.internal.d r3 = r3.mo15476a(r8, r14)     // Catch:{ all -> 0x0dba }
            r4.put(r7, r3)     // Catch:{ all -> 0x0dba }
            r50 = r2
            r10 = r6
            goto L_0x0b89
        L_0x0ad1:
            r49 = r6
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.measurement.internal.es r6 = r6.mo15335b()     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.cw r9 = r2.f17032a     // Catch:{ all -> 0x0bcb }
            java.lang.String r9 = r9.f15966o     // Catch:{ all -> 0x0bcb }
            boolean r6 = r6.mo15755o(r9)     // Catch:{ all -> 0x0bcb }
            if (r6 == 0) goto L_0x0b0f
            java.lang.Long r6 = r3.f16934g     // Catch:{ all -> 0x0bcb }
            if (r6 == 0) goto L_0x0af2
            java.lang.Long r6 = r3.f16934g     // Catch:{ all -> 0x0dba }
            long r18 = r6.longValue()     // Catch:{ all -> 0x0dba }
            r50 = r2
            r51 = r7
            goto L_0x0b07
        L_0x0af2:
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x0bcb }
            r6.mo15343j()     // Catch:{ all -> 0x0bcb }
            java.lang.Long r6 = r11.f15927d     // Catch:{ all -> 0x0bcb }
            r50 = r2
            long r1 = r6.longValue()     // Catch:{ all -> 0x0bcb }
            r51 = r7
            r6 = r46
            long r18 = com.google.android.gms.measurement.internal.C4736ek.m23524a(r1, r6)     // Catch:{ all -> 0x0bcb }
        L_0x0b07:
            int r1 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0b0d
        L_0x0b0b:
            r1 = 1
            goto L_0x0b29
        L_0x0b0d:
            r1 = 0
            goto L_0x0b29
        L_0x0b0f:
            r50 = r2
            r51 = r7
            long r1 = r3.f16933f     // Catch:{ all -> 0x0bcb }
            java.lang.Long r6 = r11.f15926c     // Catch:{ all -> 0x0bcb }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0bcb }
            r9 = 0
            long r6 = r6 - r1
            long r1 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0bcb }
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 < 0) goto L_0x0b0d
            goto L_0x0b0b
        L_0x0b29:
            if (r1 == 0) goto L_0x0b77
            r52.mo15550g()     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.cu[] r1 = r11.f15924a     // Catch:{ all -> 0x0bcb }
            java.lang.String r2 = "_efs"
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.cu[] r1 = com.google.android.gms.measurement.internal.C4733eh.m23492a(r1, r2, r6)     // Catch:{ all -> 0x0bcb }
            r11.f15924a = r1     // Catch:{ all -> 0x0bcb }
            r52.mo15550g()     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.cu[] r1 = r11.f15924a     // Catch:{ all -> 0x0bcb }
            java.lang.String r2 = "_sr"
            long r6 = (long) r12     // Catch:{ all -> 0x0bcb }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.cu[] r1 = com.google.android.gms.measurement.internal.C4733eh.m23492a(r1, r2, r9)     // Catch:{ all -> 0x0bcb }
            r11.f15924a = r1     // Catch:{ all -> 0x0bcb }
            int r1 = r10 + 1
            r5[r10] = r11     // Catch:{ all -> 0x0bcb }
            boolean r2 = r8.booleanValue()     // Catch:{ all -> 0x0bcb }
            if (r2 == 0) goto L_0x0b66
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0bcb }
            r6 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0bcb }
            r6 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo15477a(r6, r2, r7)     // Catch:{ all -> 0x0bcb }
        L_0x0b66:
            java.lang.String r2 = r11.f15925b     // Catch:{ all -> 0x0bcb }
            java.lang.Long r6 = r11.f15926c     // Catch:{ all -> 0x0bcb }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.measurement.internal.d r3 = r3.mo15476a(r6, r14)     // Catch:{ all -> 0x0bcb }
            r4.put(r2, r3)     // Catch:{ all -> 0x0bcb }
            r10 = r1
            goto L_0x0b89
        L_0x0b77:
            boolean r1 = r8.booleanValue()     // Catch:{ all -> 0x0bcb }
            if (r1 == 0) goto L_0x0b89
            java.lang.String r1 = r11.f15925b     // Catch:{ all -> 0x0bcb }
            r7 = r51
            r2 = 0
            com.google.android.gms.measurement.internal.d r3 = r3.mo15477a(r7, r2, r2)     // Catch:{ all -> 0x0bcb }
            r4.put(r1, r3)     // Catch:{ all -> 0x0bcb }
        L_0x0b89:
            int r9 = r45 + 1
            r7 = r42
            r8 = r43
            r3 = r44
            r6 = r49
            r2 = r50
            r1 = r52
            goto L_0x08c7
        L_0x0b99:
            r50 = r2
            r1 = r3
            com.google.android.gms.internal.measurement.ct[] r2 = r1.f15953b     // Catch:{ all -> 0x0bcb }
            int r2 = r2.length     // Catch:{ all -> 0x0bcb }
            if (r10 >= r2) goto L_0x0ba9
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r10)     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.internal.measurement.ct[] r2 = (com.google.android.gms.internal.measurement.C4308ct[]) r2     // Catch:{ all -> 0x0bcb }
            r1.f15953b = r2     // Catch:{ all -> 0x0bcb }
        L_0x0ba9:
            java.util.Set r2 = r4.entrySet()     // Catch:{ all -> 0x0bcb }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0bcb }
        L_0x0bb1:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0bcb }
            if (r3 == 0) goto L_0x0bd4
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0bcb }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.measurement.internal.ev r4 = r52.mo15546d()     // Catch:{ all -> 0x0bcb }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0bcb }
            com.google.android.gms.measurement.internal.d r3 = (com.google.android.gms.measurement.internal.C4697d) r3     // Catch:{ all -> 0x0bcb }
            r4.mo15779a(r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0bb1
        L_0x0bcb:
            r0 = move-exception
            r1 = r0
            r5 = r52
            goto L_0x0dbd
        L_0x0bd1:
            r50 = r2
            r1 = r3
        L_0x0bd4:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d98 }
            r1.f15956e = r2     // Catch:{ all -> 0x0d98 }
            r2 = -9223372036854775808
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d98 }
            r1.f15957f = r2     // Catch:{ all -> 0x0d98 }
            r2 = 0
        L_0x0be8:
            com.google.android.gms.internal.measurement.ct[] r3 = r1.f15953b     // Catch:{ all -> 0x0d98 }
            int r3 = r3.length     // Catch:{ all -> 0x0d98 }
            if (r2 >= r3) goto L_0x0c1c
            com.google.android.gms.internal.measurement.ct[] r3 = r1.f15953b     // Catch:{ all -> 0x0bcb }
            r3 = r3[r2]     // Catch:{ all -> 0x0bcb }
            java.lang.Long r4 = r3.f15926c     // Catch:{ all -> 0x0bcb }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0bcb }
            java.lang.Long r6 = r1.f15956e     // Catch:{ all -> 0x0bcb }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0bcb }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0c05
            java.lang.Long r4 = r3.f15926c     // Catch:{ all -> 0x0bcb }
            r1.f15956e = r4     // Catch:{ all -> 0x0bcb }
        L_0x0c05:
            java.lang.Long r4 = r3.f15926c     // Catch:{ all -> 0x0bcb }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0bcb }
            java.lang.Long r6 = r1.f15957f     // Catch:{ all -> 0x0bcb }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0bcb }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0c19
            java.lang.Long r3 = r3.f15926c     // Catch:{ all -> 0x0bcb }
            r1.f15957f = r3     // Catch:{ all -> 0x0bcb }
        L_0x0c19:
            int r2 = r2 + 1
            goto L_0x0be8
        L_0x0c1c:
            r2 = r50
            com.google.android.gms.internal.measurement.cw r3 = r2.f17032a     // Catch:{ all -> 0x0d98 }
            java.lang.String r3 = r3.f15966o     // Catch:{ all -> 0x0d98 }
            com.google.android.gms.measurement.internal.ev r4 = r52.mo15546d()     // Catch:{ all -> 0x0d98 }
            com.google.android.gms.measurement.internal.em r4 = r4.mo15788b(r3)     // Catch:{ all -> 0x0d98 }
            if (r4 != 0) goto L_0x0c46
            r5 = r52
            com.google.android.gms.measurement.internal.av r4 = r5.f17016j     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo15253r()     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo15852u_()     // Catch:{ all -> 0x0db7 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.cw r7 = r2.f17032a     // Catch:{ all -> 0x0db7 }
            java.lang.String r7 = r7.f15966o     // Catch:{ all -> 0x0db7 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4767r.m23924a(r7)     // Catch:{ all -> 0x0db7 }
            r4.mo15859a(r6, r7)     // Catch:{ all -> 0x0db7 }
            goto L_0x0ca4
        L_0x0c46:
            r5 = r52
            com.google.android.gms.internal.measurement.ct[] r6 = r1.f15953b     // Catch:{ all -> 0x0db7 }
            int r6 = r6.length     // Catch:{ all -> 0x0db7 }
            if (r6 <= 0) goto L_0x0ca4
            long r6 = r4.mo15641i()     // Catch:{ all -> 0x0db7 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0c5c
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0db7 }
            goto L_0x0c5d
        L_0x0c5c:
            r8 = 0
        L_0x0c5d:
            r1.f15959h = r8     // Catch:{ all -> 0x0db7 }
            long r8 = r4.mo15638h()     // Catch:{ all -> 0x0db7 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0c6a
            goto L_0x0c6b
        L_0x0c6a:
            r6 = r8
        L_0x0c6b:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c74
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0db7 }
            goto L_0x0c75
        L_0x0c74:
            r6 = 0
        L_0x0c75:
            r1.f15958g = r6     // Catch:{ all -> 0x0db7 }
            r4.mo15658s()     // Catch:{ all -> 0x0db7 }
            long r6 = r4.mo15655p()     // Catch:{ all -> 0x0db7 }
            int r6 = (int) r6     // Catch:{ all -> 0x0db7 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0db7 }
            r1.f15974w = r6     // Catch:{ all -> 0x0db7 }
            java.lang.Long r6 = r1.f15956e     // Catch:{ all -> 0x0db7 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0db7 }
            r4.mo15615a(r6)     // Catch:{ all -> 0x0db7 }
            java.lang.Long r6 = r1.f15957f     // Catch:{ all -> 0x0db7 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0db7 }
            r4.mo15619b(r6)     // Catch:{ all -> 0x0db7 }
            java.lang.String r6 = r4.mo15610A()     // Catch:{ all -> 0x0db7 }
            r1.f15975x = r6     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.ev r6 = r52.mo15546d()     // Catch:{ all -> 0x0db7 }
            r6.mo15780a(r4)     // Catch:{ all -> 0x0db7 }
        L_0x0ca4:
            com.google.android.gms.internal.measurement.ct[] r4 = r1.f15953b     // Catch:{ all -> 0x0db7 }
            int r4 = r4.length     // Catch:{ all -> 0x0db7 }
            if (r4 <= 0) goto L_0x0cf7
            com.google.android.gms.measurement.internal.av r4 = r5.f17016j     // Catch:{ all -> 0x0db7 }
            r4.mo15256u()     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.aq r4 = r52.m23435s()     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.internal.measurement.cw r6 = r2.f17032a     // Catch:{ all -> 0x0db7 }
            java.lang.String r6 = r6.f15966o     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.internal.measurement.cp r4 = r4.mo15297a(r6)     // Catch:{ all -> 0x0db7 }
            if (r4 == 0) goto L_0x0cc6
            java.lang.Long r6 = r4.f15904a     // Catch:{ all -> 0x0db7 }
            if (r6 != 0) goto L_0x0cc1
            goto L_0x0cc6
        L_0x0cc1:
            java.lang.Long r4 = r4.f15904a     // Catch:{ all -> 0x0db7 }
        L_0x0cc3:
            r1.f15941E = r4     // Catch:{ all -> 0x0db7 }
            goto L_0x0cee
        L_0x0cc6:
            com.google.android.gms.internal.measurement.cw r4 = r2.f17032a     // Catch:{ all -> 0x0db7 }
            java.lang.String r4 = r4.f15976y     // Catch:{ all -> 0x0db7 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0db7 }
            if (r4 == 0) goto L_0x0cd7
            r6 = -1
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0db7 }
            goto L_0x0cc3
        L_0x0cd7:
            com.google.android.gms.measurement.internal.av r4 = r5.f17016j     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo15253r()     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo15849i()     // Catch:{ all -> 0x0db7 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.cw r7 = r2.f17032a     // Catch:{ all -> 0x0db7 }
            java.lang.String r7 = r7.f15966o     // Catch:{ all -> 0x0db7 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4767r.m23924a(r7)     // Catch:{ all -> 0x0db7 }
            r4.mo15859a(r6, r7)     // Catch:{ all -> 0x0db7 }
        L_0x0cee:
            com.google.android.gms.measurement.internal.ev r4 = r52.mo15546d()     // Catch:{ all -> 0x0db7 }
            r9 = r24
            r4.mo15783a(r1, r9)     // Catch:{ all -> 0x0db7 }
        L_0x0cf7:
            com.google.android.gms.measurement.internal.ev r1 = r52.mo15546d()     // Catch:{ all -> 0x0db7 }
            java.util.List<java.lang.Long> r2 = r2.f17033b     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.common.internal.C3266s.m14913a(r2)     // Catch:{ all -> 0x0db7 }
            r1.mo15239d()     // Catch:{ all -> 0x0db7 }
            r1.mo15525k()     // Catch:{ all -> 0x0db7 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0db7 }
            java.lang.String r6 = "rowid in ("
            r4.<init>(r6)     // Catch:{ all -> 0x0db7 }
            r6 = 0
        L_0x0d0e:
            int r7 = r2.size()     // Catch:{ all -> 0x0db7 }
            if (r6 >= r7) goto L_0x0d2b
            if (r6 == 0) goto L_0x0d1b
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x0db7 }
        L_0x0d1b:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0db7 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0db7 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0db7 }
            r4.append(r7)     // Catch:{ all -> 0x0db7 }
            int r6 = r6 + 1
            goto L_0x0d0e
        L_0x0d2b:
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x0db7 }
            android.database.sqlite.SQLiteDatabase r6 = r1.mo15804y()     // Catch:{ all -> 0x0db7 }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0db7 }
            r8 = 0
            int r4 = r6.delete(r7, r4, r8)     // Catch:{ all -> 0x0db7 }
            int r6 = r2.size()     // Catch:{ all -> 0x0db7 }
            if (r4 == r6) goto L_0x0d5e
            com.google.android.gms.measurement.internal.r r1 = r1.mo15253r()     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo15852u_()     // Catch:{ all -> 0x0db7 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0db7 }
            int r2 = r2.size()     // Catch:{ all -> 0x0db7 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0db7 }
            r1.mo15860a(r6, r4, r2)     // Catch:{ all -> 0x0db7 }
        L_0x0d5e:
            com.google.android.gms.measurement.internal.ev r1 = r52.mo15546d()     // Catch:{ all -> 0x0db7 }
            android.database.sqlite.SQLiteDatabase r2 = r1.mo15804y()     // Catch:{ all -> 0x0db7 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0d75 }
            r7 = 0
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0d75 }
            r7 = 1
            r6[r7] = r3     // Catch:{ SQLiteException -> 0x0d75 }
            r2.execSQL(r4, r6)     // Catch:{ SQLiteException -> 0x0d75 }
            goto L_0x0d88
        L_0x0d75:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.r r1 = r1.mo15253r()     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.t r1 = r1.mo15852u_()     // Catch:{ all -> 0x0db7 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4767r.m23924a(r3)     // Catch:{ all -> 0x0db7 }
            r1.mo15860a(r4, r3, r2)     // Catch:{ all -> 0x0db7 }
        L_0x0d88:
            com.google.android.gms.measurement.internal.ev r1 = r52.mo15546d()     // Catch:{ all -> 0x0db7 }
            r1.mo15802w()     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.ev r1 = r52.mo15546d()
            r1.mo15803x()
            r1 = 1
            return r1
        L_0x0d98:
            r0 = move-exception
            r5 = r52
            goto L_0x0dbc
        L_0x0d9c:
            r5 = r1
            com.google.android.gms.measurement.internal.ev r1 = r52.mo15546d()     // Catch:{ all -> 0x0db7 }
            r1.mo15802w()     // Catch:{ all -> 0x0db7 }
            com.google.android.gms.measurement.internal.ev r1 = r52.mo15546d()
            r1.mo15803x()
            r1 = 0
            return r1
        L_0x0dad:
            r0 = move-exception
        L_0x0dae:
            r5 = r1
            goto L_0x024f
        L_0x0db1:
            if (r8 == 0) goto L_0x0db9
            r8.close()     // Catch:{ all -> 0x0db7 }
            goto L_0x0db9
        L_0x0db7:
            r0 = move-exception
            goto L_0x0dbc
        L_0x0db9:
            throw r1     // Catch:{ all -> 0x0db7 }
        L_0x0dba:
            r0 = move-exception
            r5 = r1
        L_0x0dbc:
            r1 = r0
        L_0x0dbd:
            com.google.android.gms.measurement.internal.ev r2 = r52.mo15546d()
            r2.mo15803x()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4726eb.m23427a(java.lang.String, long):boolean");
    }

    /* renamed from: a */
    private static C4309cu[] m23428a(C4309cu[] cuVarArr, int i) {
        C4309cu[] cuVarArr2 = new C4309cu[(cuVarArr.length - 1)];
        if (i > 0) {
            System.arraycopy(cuVarArr, 0, cuVarArr2, 0, i);
        }
        if (i < cuVarArr2.length) {
            System.arraycopy(cuVarArr, i + 1, cuVarArr2, i, cuVarArr2.length - i);
        }
        return cuVarArr2;
    }

    /* renamed from: a */
    private static C4309cu[] m23429a(C4309cu[] cuVarArr, int i, String str) {
        for (C4309cu cuVar : cuVarArr) {
            if ("_err".equals(cuVar.f15930a)) {
                return cuVarArr;
            }
        }
        C4309cu[] cuVarArr2 = new C4309cu[(cuVarArr.length + 2)];
        System.arraycopy(cuVarArr, 0, cuVarArr2, 0, cuVarArr.length);
        C4309cu cuVar2 = new C4309cu();
        cuVar2.f15930a = "_err";
        cuVar2.f15932c = Long.valueOf((long) i);
        C4309cu cuVar3 = new C4309cu();
        cuVar3.f15930a = "_ev";
        cuVar3.f15931b = str;
        cuVarArr2[cuVarArr2.length - 2] = cuVar2;
        cuVarArr2[cuVarArr2.length - 1] = cuVar3;
        return cuVarArr2;
    }

    /* renamed from: a */
    private static C4309cu[] m23430a(C4309cu[] cuVarArr, String str) {
        int i = 0;
        while (true) {
            if (i >= cuVarArr.length) {
                i = -1;
                break;
            } else if (str.equals(cuVarArr[i].f15930a)) {
                break;
            } else {
                i++;
            }
        }
        return i < 0 ? cuVarArr : m23428a(cuVarArr, i);
    }

    /* renamed from: b */
    private final Boolean m23431b(C4738em emVar) {
        try {
            if (emVar.mo15645k() != -2147483648L) {
                if (emVar.mo15645k() == ((long) C3181c.m14658a(this.f17016j.mo15249n()).mo11129b(emVar.mo15618b(), 0).versionCode)) {
                    return Boolean.valueOf(true);
                }
            } else {
                String str = C3181c.m14658a(this.f17016j.mo15249n()).mo11129b(emVar.mo15618b(), 0).versionName;
                if (emVar.mo15643j() != null && emVar.mo15643j().equals(str)) {
                    return Boolean.valueOf(true);
                }
            }
            return Boolean.valueOf(false);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m23432b(C4725ea eaVar) {
        if (eaVar == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!eaVar.mo15524j()) {
            String valueOf = String.valueOf(eaVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:197:0x0781 A[Catch:{ SQLiteException -> 0x0226, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x07ae A[Catch:{ SQLiteException -> 0x0226, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0259 A[Catch:{ SQLiteException -> 0x0226, all -> 0x07f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x028c A[Catch:{ SQLiteException -> 0x0226, all -> 0x07f3 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23433b(com.google.android.gms.measurement.internal.zzag r26, com.google.android.gms.measurement.internal.zzk r27) {
        /*
            r25 = this;
            r1 = r25
            r2 = r26
            r3 = r27
            com.google.android.gms.common.internal.C3266s.m14913a(r27)
            java.lang.String r0 = r3.f17264a
            com.google.android.gms.common.internal.C3266s.m14915a(r0)
            long r4 = java.lang.System.nanoTime()
            r25.m23438w()
            r25.mo15553j()
            java.lang.String r15 = r3.f17264a
            com.google.android.gms.measurement.internal.eh r0 = r25.mo15550g()
            boolean r0 = r0.mo15569a(r2, r3)
            if (r0 != 0) goto L_0x0025
            return
        L_0x0025:
            boolean r0 = r3.f17271h
            if (r0 != 0) goto L_0x002d
            r1.m23434e(r3)
            return
        L_0x002d:
            com.google.android.gms.measurement.internal.aq r0 = r25.m23435s()
            java.lang.String r6 = r2.f17252a
            boolean r0 = r0.mo15301b(r15, r6)
            r14 = 0
            r21 = 1
            if (r0 == 0) goto L_0x00d7
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()
            java.lang.String r3 = "Dropping blacklisted event. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4767r.m23924a(r15)
            com.google.android.gms.measurement.internal.av r5 = r1.f17016j
            com.google.android.gms.measurement.internal.p r5 = r5.mo15344k()
            java.lang.String r6 = r2.f17252a
            java.lang.String r5 = r5.mo15841a(r6)
            r0.mo15860a(r3, r4, r5)
            com.google.android.gms.measurement.internal.aq r0 = r25.m23435s()
            boolean r0 = r0.mo15308f(r15)
            if (r0 != 0) goto L_0x006f
            com.google.android.gms.measurement.internal.aq r0 = r25.m23435s()
            boolean r0 = r0.mo15310g(r15)
            if (r0 == 0) goto L_0x0070
        L_0x006f:
            r14 = 1
        L_0x0070:
            if (r14 != 0) goto L_0x008d
            java.lang.String r0 = "_err"
            java.lang.String r3 = r2.f17252a
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x008d
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j
            com.google.android.gms.measurement.internal.ek r6 = r0.mo15343j()
            r8 = 11
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f17252a
            r11 = 0
            r7 = r15
            r6.mo15587a(r7, r8, r9, r10, r11)
        L_0x008d:
            if (r14 == 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()
            com.google.android.gms.measurement.internal.em r0 = r0.mo15788b(r15)
            if (r0 == 0) goto L_0x00d6
            long r2 = r0.mo15657r()
            long r4 = r0.mo15656q()
            long r2 = java.lang.Math.max(r2, r4)
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j
            com.google.android.gms.common.util.e r4 = r4.mo15248m()
            long r4 = r4.mo11326a()
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r4 = com.google.android.gms.measurement.internal.C4756h.f17118H
            java.lang.Object r4 = r4.mo15821b()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.av r2 = r1.f17016j
            com.google.android.gms.measurement.internal.r r2 = r2.mo15253r()
            com.google.android.gms.measurement.internal.t r2 = r2.mo15854w()
            java.lang.String r3 = "Fetching config for blacklisted app"
            r2.mo15858a(r3)
            r1.m23424a(r0)
        L_0x00d6:
            return
        L_0x00d7:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()
            r13 = 2
            boolean r0 = r0.mo15846a(r13)
            if (r0 == 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()
            java.lang.String r6 = "Logging event"
            com.google.android.gms.measurement.internal.av r7 = r1.f17016j
            com.google.android.gms.measurement.internal.p r7 = r7.mo15344k()
            java.lang.String r7 = r7.mo15840a(r2)
            r0.mo15859a(r6, r7)
        L_0x00fd:
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()
            r0.mo15799f()
            r1.m23434e(r3)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "_iap"
            java.lang.String r6 = r2.f17252a     // Catch:{ all -> 0x07f3 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "ecommerce_purchase"
            java.lang.String r6 = r2.f17252a     // Catch:{ all -> 0x07f3 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x029b
        L_0x011b:
            com.google.android.gms.measurement.internal.zzad r0 = r2.f17253b     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "currency"
            java.lang.String r0 = r0.mo15871d(r6)     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "ecommerce_purchase"
            java.lang.String r7 = r2.f17252a     // Catch:{ all -> 0x07f3 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x0183
            com.google.android.gms.measurement.internal.zzad r6 = r2.f17253b     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "value"
            java.lang.Double r6 = r6.mo15870c(r7)     // Catch:{ all -> 0x07f3 }
            double r6 = r6.doubleValue()     // Catch:{ all -> 0x07f3 }
            r8 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r6 = r6 * r8
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0158
            com.google.android.gms.measurement.internal.zzad r6 = r2.f17253b     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "value"
            java.lang.Long r6 = r6.mo15869b(r7)     // Catch:{ all -> 0x07f3 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x07f3 }
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r6 = r6 * r8
        L_0x0158:
            r8 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0169
            r8 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0169
            long r6 = java.lang.Math.round(r6)     // Catch:{ all -> 0x07f3 }
            goto L_0x018f
        L_0x0169:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = "Data lost. Currency value is too big. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4767r.m23924a(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r0.mo15860a(r8, r9, r6)     // Catch:{ all -> 0x07f3 }
            r0 = 0
            goto L_0x028a
        L_0x0183:
            com.google.android.gms.measurement.internal.zzad r6 = r2.f17253b     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "value"
            java.lang.Long r6 = r6.mo15869b(r7)     // Catch:{ all -> 0x07f3 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x07f3 }
        L_0x018f:
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07f3 }
            if (r8 != 0) goto L_0x0289
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r0.toUpperCase(r8)     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = "[A-Z]{3}"
            boolean r8 = r0.matches(r8)     // Catch:{ all -> 0x07f3 }
            if (r8 == 0) goto L_0x0289
            java.lang.String r8 = "_ltv_"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x07f3 }
            int r9 = r0.length()     // Catch:{ all -> 0x07f3 }
            if (r9 == 0) goto L_0x01b9
            java.lang.String r0 = r8.concat(r0)     // Catch:{ all -> 0x07f3 }
        L_0x01b7:
            r9 = r0
            goto L_0x01bf
        L_0x01b9:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x07f3 }
            r0.<init>(r8)     // Catch:{ all -> 0x07f3 }
            goto L_0x01b7
        L_0x01bf:
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ej r0 = r0.mo15792c(r15, r9)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x01f4
            java.lang.Object r8 = r0.f17049e     // Catch:{ all -> 0x07f3 }
            boolean r8 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x07f3 }
            if (r8 != 0) goto L_0x01d0
            goto L_0x01f4
        L_0x01d0:
            java.lang.Object r0 = r0.f17049e     // Catch:{ all -> 0x07f3 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x07f3 }
            long r10 = r0.longValue()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ej r0 = new com.google.android.gms.measurement.internal.ej     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r2.f17254c     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r12 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.util.e r12 = r12.mo15248m()     // Catch:{ all -> 0x07f3 }
            long r16 = r12.mo11326a()     // Catch:{ all -> 0x07f3 }
            r12 = 0
            long r10 = r10 + r6
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07f3 }
            r6 = r0
            r7 = r15
            r10 = r16
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x07f3 }
            goto L_0x024f
        L_0x01f4:
            com.google.android.gms.measurement.internal.ev r8 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.es r0 = r0.mo15335b()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.C4756h.f17123M     // Catch:{ all -> 0x07f3 }
            int r0 = r0.mo15735b(r15, r10)     // Catch:{ all -> 0x07f3 }
            int r0 = r0 + -1
            com.google.android.gms.common.internal.C3266s.m14915a(r15)     // Catch:{ all -> 0x07f3 }
            r8.mo15239d()     // Catch:{ all -> 0x07f3 }
            r8.mo15525k()     // Catch:{ all -> 0x07f3 }
            android.database.sqlite.SQLiteDatabase r10 = r8.mo15804y()     // Catch:{ SQLiteException -> 0x0226 }
            java.lang.String r11 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r12 = 3
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0226 }
            r12[r14] = r15     // Catch:{ SQLiteException -> 0x0226 }
            r12[r21] = r15     // Catch:{ SQLiteException -> 0x0226 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0226 }
            r12[r13] = r0     // Catch:{ SQLiteException -> 0x0226 }
            r10.execSQL(r11, r12)     // Catch:{ SQLiteException -> 0x0226 }
            goto L_0x0238
        L_0x0226:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r8 = r8.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo15852u_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r10 = "Error pruning currencies. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C4767r.m23924a(r15)     // Catch:{ all -> 0x07f3 }
            r8.mo15860a(r10, r11, r0)     // Catch:{ all -> 0x07f3 }
        L_0x0238:
            com.google.android.gms.measurement.internal.ej r0 = new com.google.android.gms.measurement.internal.ej     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r2.f17254c     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r10 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.util.e r10 = r10.mo15248m()     // Catch:{ all -> 0x07f3 }
            long r10 = r10.mo11326a()     // Catch:{ all -> 0x07f3 }
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r6 = r0
            r7 = r15
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x07f3 }
        L_0x024f:
            com.google.android.gms.measurement.internal.ev r6 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            boolean r6 = r6.mo15785a(r0)     // Catch:{ all -> 0x07f3 }
            if (r6 != 0) goto L_0x0289
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo15852u_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4767r.m23924a(r15)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r9 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.p r9 = r9.mo15344k()     // Catch:{ all -> 0x07f3 }
            java.lang.String r10 = r0.f17047c     // Catch:{ all -> 0x07f3 }
            java.lang.String r9 = r9.mo15843c(r10)     // Catch:{ all -> 0x07f3 }
            java.lang.Object r0 = r0.f17049e     // Catch:{ all -> 0x07f3 }
            r6.mo15861a(r7, r8, r9, r0)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r6 = r0.mo15343j()     // Catch:{ all -> 0x07f3 }
            r8 = 9
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r15
            r6.mo15587a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x07f3 }
        L_0x0289:
            r0 = 1
        L_0x028a:
            if (r0 != 0) goto L_0x029b
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            r0.mo15802w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()
            r0.mo15803x()
            return
        L_0x029b:
            java.lang.String r0 = r2.f17252a     // Catch:{ all -> 0x07f3 }
            boolean r0 = com.google.android.gms.measurement.internal.C4736ek.m23532a(r0)     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "_err"
            java.lang.String r7 = r2.f17252a     // Catch:{ all -> 0x07f3 }
            boolean r16 = r6.equals(r7)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r6 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            long r7 = r25.m23439x()     // Catch:{ all -> 0x07f3 }
            r10 = 1
            r12 = 0
            r17 = 0
            r9 = r15
            r11 = r0
            r13 = r16
            r22 = r4
            r4 = 0
            r14 = r17
            com.google.android.gms.measurement.internal.ew r5 = r6.mo15773a(r7, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x07f3 }
            long r6 = r5.f17100b     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C4756h.f17182s     // Catch:{ all -> 0x07f3 }
            java.lang.Object r8 = r8.mo15821b()     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x07f3 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x07f3 }
            long r8 = (long) r8     // Catch:{ all -> 0x07f3 }
            long r6 = r6 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = 1
            r13 = 0
            int r12 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0309
            long r6 = r6 % r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x02fa
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r2 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4767r.m23924a(r15)     // Catch:{ all -> 0x07f3 }
            long r4 = r5.f17100b     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07f3 }
            r0.mo15860a(r2, r3, r4)     // Catch:{ all -> 0x07f3 }
        L_0x02fa:
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            r0.mo15802w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()
            r0.mo15803x()
            return
        L_0x0309:
            if (r0 == 0) goto L_0x0363
            long r6 = r5.f17099a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.C4756h.f17184u     // Catch:{ all -> 0x07f3 }
            java.lang.Object r12 = r12.mo15821b()     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ all -> 0x07f3 }
            int r12 = r12.intValue()     // Catch:{ all -> 0x07f3 }
            r24 = r5
            long r4 = (long) r12     // Catch:{ all -> 0x07f3 }
            long r6 = r6 - r4
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0361
            long r6 = r6 % r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0341
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4767r.m23924a(r15)     // Catch:{ all -> 0x07f3 }
            r5 = r24
            long r5 = r5.f17099a     // Catch:{ all -> 0x07f3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x07f3 }
            r0.mo15860a(r3, r4, r5)     // Catch:{ all -> 0x07f3 }
        L_0x0341:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r6 = r0.mo15343j()     // Catch:{ all -> 0x07f3 }
            r8 = 16
            java.lang.String r9 = "_ev"
            java.lang.String r10 = r2.f17252a     // Catch:{ all -> 0x07f3 }
            r11 = 0
            r7 = r15
            r6.mo15587a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            r0.mo15802w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()
            r0.mo15803x()
            return
        L_0x0361:
            r5 = r24
        L_0x0363:
            if (r16 == 0) goto L_0x03b3
            long r6 = r5.f17102d     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.es r4 = r4.mo15335b()     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.C4756h.f17183t     // Catch:{ all -> 0x07f3 }
            int r4 = r4.mo15735b(r8, r9)     // Catch:{ all -> 0x07f3 }
            r8 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = java.lang.Math.min(r8, r4)     // Catch:{ all -> 0x07f3 }
            r12 = 0
            int r4 = java.lang.Math.max(r12, r4)     // Catch:{ all -> 0x07f3 }
            long r8 = (long) r4     // Catch:{ all -> 0x07f3 }
            long r6 = r6 - r8
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x03b4
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x03a4
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r2 = "Too many error events logged. appId, count"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4767r.m23924a(r15)     // Catch:{ all -> 0x07f3 }
            long r4 = r5.f17102d     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07f3 }
            r0.mo15860a(r2, r3, r4)     // Catch:{ all -> 0x07f3 }
        L_0x03a4:
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            r0.mo15802w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()
            r0.mo15803x()
            return
        L_0x03b3:
            r12 = 0
        L_0x03b4:
            com.google.android.gms.measurement.internal.zzad r4 = r2.f17253b     // Catch:{ all -> 0x07f3 }
            android.os.Bundle r4 = r4.mo15868b()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r5 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r5 = r5.mo15343j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "_o"
            java.lang.String r7 = r2.f17254c     // Catch:{ all -> 0x07f3 }
            r5.mo15586a(r4, r6, r7)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r5 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r5 = r5.mo15343j()     // Catch:{ all -> 0x07f3 }
            boolean r5 = r5.mo15597f(r15)     // Catch:{ all -> 0x07f3 }
            if (r5 == 0) goto L_0x03f1
            com.google.android.gms.measurement.internal.av r5 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r5 = r5.mo15343j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "_dbg"
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07f3 }
            r5.mo15586a(r4, r6, r7)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r5 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r5 = r5.mo15343j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "_r"
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x07f3 }
            r5.mo15586a(r4, r6, r7)     // Catch:{ all -> 0x07f3 }
        L_0x03f1:
            com.google.android.gms.measurement.internal.av r5 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.es r5 = r5.mo15335b()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            boolean r5 = r5.mo15757q(r6)     // Catch:{ all -> 0x07f3 }
            if (r5 == 0) goto L_0x042a
            java.lang.String r5 = "_s"
            java.lang.String r6 = r2.f17252a     // Catch:{ all -> 0x07f3 }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x07f3 }
            if (r5 == 0) goto L_0x042a
            com.google.android.gms.measurement.internal.ev r5 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "_sno"
            com.google.android.gms.measurement.internal.ej r5 = r5.mo15792c(r6, r7)     // Catch:{ all -> 0x07f3 }
            if (r5 == 0) goto L_0x042a
            java.lang.Object r6 = r5.f17049e     // Catch:{ all -> 0x07f3 }
            boolean r6 = r6 instanceof java.lang.Long     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x042a
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r6 = r6.mo15343j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "_sno"
            java.lang.Object r5 = r5.f17049e     // Catch:{ all -> 0x07f3 }
            r6.mo15586a(r4, r7, r5)     // Catch:{ all -> 0x07f3 }
        L_0x042a:
            com.google.android.gms.measurement.internal.ev r5 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            long r5 = r5.mo15791c(r15)     // Catch:{ all -> 0x07f3 }
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 <= 0) goto L_0x044d
            com.google.android.gms.measurement.internal.av r7 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo15849i()     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4767r.m23924a(r15)     // Catch:{ all -> 0x07f3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x07f3 }
            r7.mo15860a(r8, r9, r5)     // Catch:{ all -> 0x07f3 }
        L_0x044d:
            com.google.android.gms.measurement.internal.c r5 = new com.google.android.gms.measurement.internal.c     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r7 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r2.f17254c     // Catch:{ all -> 0x07f3 }
            java.lang.String r10 = r2.f17252a     // Catch:{ all -> 0x07f3 }
            long r12 = r2.f17255d     // Catch:{ all -> 0x07f3 }
            r16 = 0
            r6 = r5
            r9 = r15
            r2 = 0
            r11 = r12
            r13 = r16
            r2 = r15
            r15 = r4
            r6.<init>(r7, r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r4 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r5.f16841b     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.d r4 = r4.mo15772a(r2, r6)     // Catch:{ all -> 0x07f3 }
            if (r4 != 0) goto L_0x04d6
            com.google.android.gms.measurement.internal.ev r4 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            long r6 = r4.mo15797f(r2)     // Catch:{ all -> 0x07f3 }
            r8 = 500(0x1f4, double:2.47E-321)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x04bc
            if (r0 == 0) goto L_0x04bc
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4767r.m23924a(r2)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.p r6 = r6.mo15344k()     // Catch:{ all -> 0x07f3 }
            java.lang.String r5 = r5.f16841b     // Catch:{ all -> 0x07f3 }
            java.lang.String r5 = r6.mo15841a(r5)     // Catch:{ all -> 0x07f3 }
            r6 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r0.mo15861a(r3, r4, r5, r6)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r6 = r0.mo15343j()     // Catch:{ all -> 0x07f3 }
            r8 = 8
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r2
            r6.mo15587a(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()
            r0.mo15803x()
            return
        L_0x04bc:
            com.google.android.gms.measurement.internal.d r0 = new com.google.android.gms.measurement.internal.d     // Catch:{ all -> 0x07f3 }
            java.lang.String r8 = r5.f16841b     // Catch:{ all -> 0x07f3 }
            r9 = 0
            r11 = 0
            long r13 = r5.f16842c     // Catch:{ all -> 0x07f3 }
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r6 = r0
            r7 = r2
            r6.<init>(r7, r8, r9, r11, r13, r15, r17, r18, r19, r20)     // Catch:{ all -> 0x07f3 }
            goto L_0x04e4
        L_0x04d6:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            long r6 = r4.f16932e     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.c r5 = r5.mo15401a(r0, r6)     // Catch:{ all -> 0x07f3 }
            long r6 = r5.f16842c     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.d r0 = r4.mo15475a(r6)     // Catch:{ all -> 0x07f3 }
        L_0x04e4:
            com.google.android.gms.measurement.internal.ev r2 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            r2.mo15779a(r0)     // Catch:{ all -> 0x07f3 }
            r25.m23438w()     // Catch:{ all -> 0x07f3 }
            r25.mo15553j()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.internal.C3266s.m14913a(r5)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.internal.C3266s.m14913a(r27)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r5.f16840a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.internal.C3266s.m14915a(r0)     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r5.f16840a     // Catch:{ all -> 0x07f3 }
            java.lang.String r2 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.common.internal.C3266s.m14923b(r0)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.internal.measurement.cw r2 = new com.google.android.gms.internal.measurement.cw     // Catch:{ all -> 0x07f3 }
            r2.<init>()     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x07f3 }
            r2.f15952a = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = "android"
            r2.f15960i = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            r2.f15966o = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r3.f17267d     // Catch:{ all -> 0x07f3 }
            r2.f15965n = r0     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r3.f17266c     // Catch:{ all -> 0x07f3 }
            r2.f15967p = r0     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f17273j     // Catch:{ all -> 0x07f3 }
            r8 = -2147483648(0xffffffff80000000, double:NaN)
            r0 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x052e
            r4 = r0
            goto L_0x0535
        L_0x052e:
            long r6 = r3.f17273j     // Catch:{ all -> 0x07f3 }
            int r4 = (int) r6     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07f3 }
        L_0x0535:
            r2.f15939C = r4     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f17268e     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r2.f15968q = r4     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f17265b     // Catch:{ all -> 0x07f3 }
            r2.f15976y = r4     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f17281r     // Catch:{ all -> 0x07f3 }
            r2.f15945I = r4     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f17269f     // Catch:{ all -> 0x07f3 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0551
            r4 = r0
            goto L_0x0557
        L_0x0551:
            long r6 = r3.f17269f     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
        L_0x0557:
            r2.f15973v = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.es r4 = r4.mo15335b()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r7 = com.google.android.gms.measurement.internal.C4756h.f17157as     // Catch:{ all -> 0x07f3 }
            boolean r4 = r4.mo15740d(r6, r7)     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x0573
            com.google.android.gms.measurement.internal.eh r4 = r25.mo15550g()     // Catch:{ all -> 0x07f3 }
            int[] r4 = r4.mo15574f()     // Catch:{ all -> 0x07f3 }
            r2.f15947K = r4     // Catch:{ all -> 0x07f3 }
        L_0x0573:
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ad r4 = r4.mo15336c()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            android.util.Pair r4 = r4.mo15262a(r6)     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x059c
            java.lang.Object r6 = r4.first     // Catch:{ all -> 0x07f3 }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x07f3 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x07f3 }
            if (r6 != 0) goto L_0x059c
            boolean r6 = r3.f17278o     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x05f9
            java.lang.Object r6 = r4.first     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x07f3 }
            r2.f15970s = r6     // Catch:{ all -> 0x07f3 }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x07f3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x07f3 }
            r2.f15971t = r4     // Catch:{ all -> 0x07f3 }
            goto L_0x05f9
        L_0x059c:
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo15353y()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            android.content.Context r6 = r6.mo15249n()     // Catch:{ all -> 0x07f3 }
            boolean r4 = r4.mo15375a(r6)     // Catch:{ all -> 0x07f3 }
            if (r4 != 0) goto L_0x05f9
            boolean r4 = r3.f17279p     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x05f9
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            android.content.Context r4 = r4.mo15249n()     // Catch:{ all -> 0x07f3 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "android_id"
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r6)     // Catch:{ all -> 0x07f3 }
            if (r4 != 0) goto L_0x05dc
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo15849i()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = "null secure ID. appId"
            java.lang.String r7 = r2.f15966o     // Catch:{ all -> 0x07f3 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4767r.m23924a(r7)     // Catch:{ all -> 0x07f3 }
            r4.mo15859a(r6, r7)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = "null"
            goto L_0x05f7
        L_0x05dc:
            boolean r6 = r4.isEmpty()     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x05f7
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r6 = r6.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r6 = r6.mo15849i()     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "empty secure ID. appId"
            java.lang.String r10 = r2.f15966o     // Catch:{ all -> 0x07f3 }
            java.lang.Object r10 = com.google.android.gms.measurement.internal.C4767r.m23924a(r10)     // Catch:{ all -> 0x07f3 }
            r6.mo15859a(r7, r10)     // Catch:{ all -> 0x07f3 }
        L_0x05f7:
            r2.f15940D = r4     // Catch:{ all -> 0x07f3 }
        L_0x05f9:
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo15353y()     // Catch:{ all -> 0x07f3 }
            r4.mo15395A()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ all -> 0x07f3 }
            r2.f15962k = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo15353y()     // Catch:{ all -> 0x07f3 }
            r4.mo15395A()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x07f3 }
            r2.f15961j = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo15353y()     // Catch:{ all -> 0x07f3 }
            long r6 = r4.mo15377t_()     // Catch:{ all -> 0x07f3 }
            int r4 = (int) r6     // Catch:{ all -> 0x07f3 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x07f3 }
            r2.f15964m = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.b r4 = r4.mo15353y()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r4.mo15376g()     // Catch:{ all -> 0x07f3 }
            r2.f15963l = r4     // Catch:{ all -> 0x07f3 }
            r2.f15969r = r0     // Catch:{ all -> 0x07f3 }
            r2.f15955d = r0     // Catch:{ all -> 0x07f3 }
            r2.f15956e = r0     // Catch:{ all -> 0x07f3 }
            r2.f15957f = r0     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f17275l     // Catch:{ all -> 0x07f3 }
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r2.f15942F = r4     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            boolean r4 = r4.mo15325C()     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x0650
            boolean r4 = com.google.android.gms.measurement.internal.C4744es.m23662w()     // Catch:{ all -> 0x07f3 }
            if (r4 == 0) goto L_0x0650
            r2.f15943G = r0     // Catch:{ all -> 0x07f3 }
        L_0x0650:
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.em r0 = r0.mo15788b(r4)     // Catch:{ all -> 0x07f3 }
            if (r0 != 0) goto L_0x06be
            com.google.android.gms.measurement.internal.em r0 = new com.google.android.gms.measurement.internal.em     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            r0.<init>(r4, r6)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ek r4 = r4.mo15343j()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r4.mo15601k()     // Catch:{ all -> 0x07f3 }
            r0.mo15616a(r4)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f17274k     // Catch:{ all -> 0x07f3 }
            r0.mo15631e(r4)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f17265b     // Catch:{ all -> 0x07f3 }
            r0.mo15620b(r4)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ad r4 = r4.mo15336c()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r4.mo15265b(r6)     // Catch:{ all -> 0x07f3 }
            r0.mo15628d(r4)     // Catch:{ all -> 0x07f3 }
            r0.mo15633f(r8)     // Catch:{ all -> 0x07f3 }
            r0.mo15615a(r8)     // Catch:{ all -> 0x07f3 }
            r0.mo15619b(r8)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f17266c     // Catch:{ all -> 0x07f3 }
            r0.mo15634f(r4)     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f17273j     // Catch:{ all -> 0x07f3 }
            r0.mo15623c(r6)     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = r3.f17267d     // Catch:{ all -> 0x07f3 }
            r0.mo15637g(r4)     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f17268e     // Catch:{ all -> 0x07f3 }
            r0.mo15627d(r6)     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f17269f     // Catch:{ all -> 0x07f3 }
            r0.mo15630e(r6)     // Catch:{ all -> 0x07f3 }
            boolean r4 = r3.f17271h     // Catch:{ all -> 0x07f3 }
            r0.mo15617a(r4)     // Catch:{ all -> 0x07f3 }
            long r6 = r3.f17275l     // Catch:{ all -> 0x07f3 }
            r0.mo15653o(r6)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r4 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            r4.mo15780a(r0)     // Catch:{ all -> 0x07f3 }
        L_0x06be:
            java.lang.String r4 = r0.mo15622c()     // Catch:{ all -> 0x07f3 }
            r2.f15972u = r4     // Catch:{ all -> 0x07f3 }
            java.lang.String r0 = r0.mo15635g()     // Catch:{ all -> 0x07f3 }
            r2.f15938B = r0     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = r3.f17264a     // Catch:{ all -> 0x07f3 }
            java.util.List r0 = r0.mo15775a(r3)     // Catch:{ all -> 0x07f3 }
            int r3 = r0.size()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.internal.measurement.cz[] r3 = new com.google.android.gms.internal.measurement.C4314cz[r3]     // Catch:{ all -> 0x07f3 }
            r2.f15954c = r3     // Catch:{ all -> 0x07f3 }
            r3 = 0
        L_0x06dd:
            int r4 = r0.size()     // Catch:{ all -> 0x07f3 }
            if (r3 >= r4) goto L_0x0716
            com.google.android.gms.internal.measurement.cz r4 = new com.google.android.gms.internal.measurement.cz     // Catch:{ all -> 0x07f3 }
            r4.<init>()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.internal.measurement.cz[] r6 = r2.f15954c     // Catch:{ all -> 0x07f3 }
            r6[r3] = r4     // Catch:{ all -> 0x07f3 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ej r6 = (com.google.android.gms.measurement.internal.C4735ej) r6     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r6.f17047c     // Catch:{ all -> 0x07f3 }
            r4.f15987b = r6     // Catch:{ all -> 0x07f3 }
            java.lang.Object r6 = r0.get(r3)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ej r6 = (com.google.android.gms.measurement.internal.C4735ej) r6     // Catch:{ all -> 0x07f3 }
            long r6 = r6.f17048d     // Catch:{ all -> 0x07f3 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07f3 }
            r4.f15986a = r6     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.eh r6 = r25.mo15550g()     // Catch:{ all -> 0x07f3 }
            java.lang.Object r7 = r0.get(r3)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ej r7 = (com.google.android.gms.measurement.internal.C4735ej) r7     // Catch:{ all -> 0x07f3 }
            java.lang.Object r7 = r7.f17049e     // Catch:{ all -> 0x07f3 }
            r6.mo15567a(r4, r7)     // Catch:{ all -> 0x07f3 }
            int r3 = r3 + 1
            goto L_0x06dd
        L_0x0716:
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ IOException -> 0x0784 }
            long r3 = r0.mo15770a(r2)     // Catch:{ IOException -> 0x0784 }
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.zzad r2 = r5.f16844e     // Catch:{ all -> 0x07f3 }
            if (r2 == 0) goto L_0x077a
            com.google.android.gms.measurement.internal.zzad r2 = r5.f16844e     // Catch:{ all -> 0x07f3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x07f3 }
        L_0x072c:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x0742
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = "_r"
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x07f3 }
            if (r6 == 0) goto L_0x072c
        L_0x0740:
            r2 = 1
            goto L_0x077b
        L_0x0742:
            com.google.android.gms.measurement.internal.aq r2 = r25.m23435s()     // Catch:{ all -> 0x07f3 }
            java.lang.String r6 = r5.f16840a     // Catch:{ all -> 0x07f3 }
            java.lang.String r7 = r5.f16841b     // Catch:{ all -> 0x07f3 }
            boolean r2 = r2.mo15303c(r6, r7)     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.ev r10 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            long r11 = r25.m23439x()     // Catch:{ all -> 0x07f3 }
            java.lang.String r13 = r5.f16840a     // Catch:{ all -> 0x07f3 }
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            com.google.android.gms.measurement.internal.ew r6 = r10.mo15773a(r11, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x07f3 }
            if (r2 == 0) goto L_0x077a
            long r6 = r6.f17103e     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r2 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.es r2 = r2.mo15335b()     // Catch:{ all -> 0x07f3 }
            java.lang.String r10 = r5.f16840a     // Catch:{ all -> 0x07f3 }
            int r2 = r2.mo15731a(r10)     // Catch:{ all -> 0x07f3 }
            long r10 = (long) r2     // Catch:{ all -> 0x07f3 }
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x077a
            goto L_0x0740
        L_0x077a:
            r2 = 0
        L_0x077b:
            boolean r0 = r0.mo15784a(r5, r3, r2)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x079a
            r1.f17020n = r8     // Catch:{ all -> 0x07f3 }
            goto L_0x079a
        L_0x0784:
            r0 = move-exception
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo15852u_()     // Catch:{ all -> 0x07f3 }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r2 = r2.f15966o     // Catch:{ all -> 0x07f3 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C4767r.m23924a(r2)     // Catch:{ all -> 0x07f3 }
            r3.mo15860a(r4, r2, r0)     // Catch:{ all -> 0x07f3 }
        L_0x079a:
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()     // Catch:{ all -> 0x07f3 }
            r0.mo15802w()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x07f3 }
            r2 = 2
            boolean r0 = r0.mo15846a(r2)     // Catch:{ all -> 0x07f3 }
            if (r0 == 0) goto L_0x07c7
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()     // Catch:{ all -> 0x07f3 }
            java.lang.String r2 = "Event recorded"
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x07f3 }
            com.google.android.gms.measurement.internal.p r3 = r3.mo15344k()     // Catch:{ all -> 0x07f3 }
            java.lang.String r3 = r3.mo15839a(r5)     // Catch:{ all -> 0x07f3 }
            r0.mo15859a(r2, r3)     // Catch:{ all -> 0x07f3 }
        L_0x07c7:
            com.google.android.gms.measurement.internal.ev r0 = r25.mo15546d()
            r0.mo15803x()
            r25.m23441z()
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()
            java.lang.String r2 = "Background event processing time, ms"
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r22
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.mo15859a(r2, r3)
            return
        L_0x07f3:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ev r2 = r25.mo15546d()
            r2.mo15803x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4726eb.m23433b(com.google.android.gms.measurement.internal.zzag, com.google.android.gms.measurement.internal.zzk):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C4738em m23434e(com.google.android.gms.measurement.internal.zzk r9) {
        /*
            r8 = this;
            r8.m23438w()
            r8.mo15553j()
            com.google.android.gms.common.internal.C3266s.m14913a(r9)
            java.lang.String r0 = r9.f17264a
            com.google.android.gms.common.internal.C3266s.m14915a(r0)
            com.google.android.gms.measurement.internal.ev r0 = r8.mo15546d()
            java.lang.String r1 = r9.f17264a
            com.google.android.gms.measurement.internal.em r0 = r0.mo15788b(r1)
            com.google.android.gms.measurement.internal.av r1 = r8.f17016j
            com.google.android.gms.measurement.internal.ad r1 = r1.mo15336c()
            java.lang.String r2 = r9.f17264a
            java.lang.String r1 = r1.mo15265b(r2)
            r2 = 1
            if (r0 != 0) goto L_0x0042
            com.google.android.gms.measurement.internal.em r0 = new com.google.android.gms.measurement.internal.em
            com.google.android.gms.measurement.internal.av r3 = r8.f17016j
            java.lang.String r4 = r9.f17264a
            r0.<init>(r3, r4)
            com.google.android.gms.measurement.internal.av r3 = r8.f17016j
            com.google.android.gms.measurement.internal.ek r3 = r3.mo15343j()
            java.lang.String r3 = r3.mo15601k()
            r0.mo15616a(r3)
            r0.mo15628d(r1)
        L_0x0040:
            r1 = 1
            goto L_0x005e
        L_0x0042:
            java.lang.String r3 = r0.mo15632f()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005d
            r0.mo15628d(r1)
            com.google.android.gms.measurement.internal.av r1 = r8.f17016j
            com.google.android.gms.measurement.internal.ek r1 = r1.mo15343j()
            java.lang.String r1 = r1.mo15601k()
            r0.mo15616a(r1)
            goto L_0x0040
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r3 = r9.f17265b
            java.lang.String r4 = r0.mo15626d()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0070
            java.lang.String r1 = r9.f17265b
            r0.mo15620b(r1)
            r1 = 1
        L_0x0070:
            java.lang.String r3 = r9.f17281r
            java.lang.String r4 = r0.mo15629e()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0082
            java.lang.String r1 = r9.f17281r
            r0.mo15624c(r1)
            r1 = 1
        L_0x0082:
            java.lang.String r3 = r9.f17274k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r9.f17274k
            java.lang.String r4 = r0.mo15635g()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x009c
            java.lang.String r1 = r9.f17274k
            r0.mo15631e(r1)
            r1 = 1
        L_0x009c:
            long r3 = r9.f17268e
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f17268e
            long r5 = r0.mo15649m()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.f17268e
            r0.mo15627d(r3)
            r1 = 1
        L_0x00b4:
            java.lang.String r3 = r9.f17266c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r3 = r9.f17266c
            java.lang.String r4 = r0.mo15643j()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r1 = r9.f17266c
            r0.mo15634f(r1)
            r1 = 1
        L_0x00ce:
            long r3 = r9.f17273j
            long r5 = r0.mo15645k()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00de
            long r3 = r9.f17273j
            r0.mo15623c(r3)
            r1 = 1
        L_0x00de:
            java.lang.String r3 = r9.f17267d
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = r9.f17267d
            java.lang.String r4 = r0.mo15647l()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f4
            java.lang.String r1 = r9.f17267d
            r0.mo15637g(r1)
            r1 = 1
        L_0x00f4:
            long r3 = r9.f17269f
            long r5 = r0.mo15651n()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0104
            long r3 = r9.f17269f
            r0.mo15630e(r3)
            r1 = 1
        L_0x0104:
            boolean r3 = r9.f17271h
            boolean r4 = r0.mo15654o()
            if (r3 == r4) goto L_0x0112
            boolean r1 = r9.f17271h
            r0.mo15617a(r1)
            r1 = 1
        L_0x0112:
            java.lang.String r3 = r9.f17270g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x012c
            java.lang.String r3 = r9.f17270g
            java.lang.String r4 = r0.mo15665z()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012c
            java.lang.String r1 = r9.f17270g
            r0.mo15640h(r1)
            r1 = 1
        L_0x012c:
            long r3 = r9.f17275l
            long r5 = r0.mo15611B()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013c
            long r3 = r9.f17275l
            r0.mo15653o(r3)
            r1 = 1
        L_0x013c:
            boolean r3 = r9.f17278o
            boolean r4 = r0.mo15612C()
            if (r3 == r4) goto L_0x014a
            boolean r1 = r9.f17278o
            r0.mo15621b(r1)
            r1 = 1
        L_0x014a:
            boolean r3 = r9.f17279p
            boolean r4 = r0.mo15613D()
            if (r3 == r4) goto L_0x0158
            boolean r9 = r9.f17279p
            r0.mo15625c(r9)
            r1 = 1
        L_0x0158:
            if (r1 == 0) goto L_0x0161
            com.google.android.gms.measurement.internal.ev r9 = r8.mo15546d()
            r9.mo15780a(r0)
        L_0x0161:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4726eb.m23434e(com.google.android.gms.measurement.internal.zzk):com.google.android.gms.measurement.internal.em");
    }

    /* renamed from: s */
    private final C4633aq m23435s() {
        m23432b((C4725ea) this.f17008b);
        return this.f17008b;
    }

    /* renamed from: t */
    private final C4618ab m23436t() {
        if (this.f17011e != null) {
            return this.f17011e;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    /* renamed from: v */
    private final C4721dx m23437v() {
        m23432b((C4725ea) this.f17012f);
        return this.f17012f;
    }

    /* renamed from: w */
    private final void m23438w() {
        this.f17016j.mo15252q().mo15239d();
    }

    /* renamed from: x */
    private final long m23439x() {
        long a = this.f17016j.mo15248m().mo11326a();
        C4620ad c = this.f17016j.mo15336c();
        c.mo15395A();
        c.mo15239d();
        long a2 = c.f16651g.mo15283a();
        if (a2 == 0) {
            a2 = 1 + ((long) c.mo15251p().mo15599h().nextInt(86400000));
            c.f16651g.mo15284a(a2);
        }
        return ((((a + a2) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: y */
    private final boolean m23440y() {
        m23438w();
        mo15553j();
        return mo15546d().mo15767E() || !TextUtils.isEmpty(mo15546d().mo15805z());
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01a3  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23441z() {
        /*
            r20 = this;
            r0 = r20
            r20.m23438w()
            r20.mo15553j()
            boolean r1 = r20.m23416C()
            if (r1 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.measurement.internal.es r1 = r1.mo15335b()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C4756h.f17156ar
            boolean r1 = r1.mo15734a(r2)
            if (r1 != 0) goto L_0x001d
            return
        L_0x001d:
            long r1 = r0.f17020n
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.common.util.e r1 = r1.mo15248m()
            long r1 = r1.mo11327b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.f17020n
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.measurement.internal.r r1 = r1.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1.mo15859a(r2, r3)
            com.google.android.gms.measurement.internal.ab r1 = r20.m23436t()
            r1.mo15259b()
            com.google.android.gms.measurement.internal.dx r1 = r20.m23437v()
            r1.mo15520f()
            return
        L_0x0060:
            r0.f17020n = r3
        L_0x0062:
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            boolean r1 = r1.mo15330H()
            if (r1 == 0) goto L_0x024c
            boolean r1 = r20.m23440y()
            if (r1 != 0) goto L_0x0072
            goto L_0x024c
        L_0x0072:
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.common.util.e r1 = r1.mo15248m()
            long r1 = r1.mo11326a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C4756h.f17119I
            java.lang.Object r5 = r5.mo15821b()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.ev r7 = r20.mo15546d()
            boolean r7 = r7.mo15768F()
            if (r7 != 0) goto L_0x00a3
            com.google.android.gms.measurement.internal.ev r7 = r20.mo15546d()
            boolean r7 = r7.mo15763A()
            if (r7 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r7 = 0
            goto L_0x00a4
        L_0x00a3:
            r7 = 1
        L_0x00a4:
            if (r7 == 0) goto L_0x00c4
            com.google.android.gms.measurement.internal.av r9 = r0.f17016j
            com.google.android.gms.measurement.internal.es r9 = r9.mo15335b()
            java.lang.String r9 = r9.mo15761v()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00c1
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00c1
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C4756h.f17114D
            goto L_0x00c6
        L_0x00c1:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C4756h.f17113C
            goto L_0x00c6
        L_0x00c4:
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r9 = com.google.android.gms.measurement.internal.C4756h.f17112B
        L_0x00c6:
            java.lang.Object r9 = r9.mo15821b()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            com.google.android.gms.measurement.internal.av r11 = r0.f17016j
            com.google.android.gms.measurement.internal.ad r11 = r11.mo15336c()
            com.google.android.gms.measurement.internal.ag r11 = r11.f16647c
            long r11 = r11.mo15283a()
            com.google.android.gms.measurement.internal.av r13 = r0.f17016j
            com.google.android.gms.measurement.internal.ad r13 = r13.mo15336c()
            com.google.android.gms.measurement.internal.ag r13 = r13.f16648d
            long r13 = r13.mo15283a()
            com.google.android.gms.measurement.internal.ev r15 = r20.mo15546d()
            r16 = r9
            long r8 = r15.mo15765C()
            com.google.android.gms.measurement.internal.ev r10 = r20.mo15546d()
            r18 = r5
            long r5 = r10.mo15766D()
            long r5 = java.lang.Math.max(r8, r5)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x010b
        L_0x0108:
            r8 = r3
            goto L_0x0181
        L_0x010b:
            r8 = 0
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r11 = r11 - r1
            long r8 = java.lang.Math.abs(r11)
            long r8 = r1 - r8
            long r13 = r13 - r1
            long r10 = java.lang.Math.abs(r13)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r5 + r18
            if (r7 == 0) goto L_0x0132
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0132
            long r10 = java.lang.Math.min(r5, r8)
            long r10 = r10 + r16
        L_0x0132:
            com.google.android.gms.measurement.internal.eh r7 = r20.mo15550g()
            r12 = r16
            boolean r7 = r7.mo15568a(r8, r12)
            if (r7 != 0) goto L_0x0140
            long r8 = r8 + r12
            goto L_0x0141
        L_0x0140:
            r8 = r10
        L_0x0141:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0181
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0181
            r5 = 0
        L_0x014a:
            r6 = 20
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C4756h.f17121K
            java.lang.Object r7 = r7.mo15821b()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10 = 0
            int r7 = java.lang.Math.max(r10, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x0108
            r6 = 1
            long r6 = r6 << r5
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r11 = com.google.android.gms.measurement.internal.C4756h.f17120J
            java.lang.Object r11 = r11.mo15821b()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            long r11 = r11 * r6
            long r8 = r8 + r11
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x017e
            goto L_0x0181
        L_0x017e:
            int r5 = r5 + 1
            goto L_0x014a
        L_0x0181:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01a3
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.measurement.internal.r r1 = r1.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r2 = "Next upload time is 0"
            r1.mo15858a(r2)
            com.google.android.gms.measurement.internal.ab r1 = r20.m23436t()
            r1.mo15259b()
            com.google.android.gms.measurement.internal.dx r1 = r20.m23437v()
            r1.mo15520f()
            return
        L_0x01a3:
            com.google.android.gms.measurement.internal.v r1 = r20.mo15544c()
            boolean r1 = r1.mo15863f()
            if (r1 != 0) goto L_0x01cb
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.measurement.internal.r r1 = r1.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r2 = "No network"
            r1.mo15858a(r2)
            com.google.android.gms.measurement.internal.ab r1 = r20.m23436t()
            r1.mo15258a()
            com.google.android.gms.measurement.internal.dx r1 = r20.m23437v()
            r1.mo15520f()
            return
        L_0x01cb:
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.measurement.internal.ad r1 = r1.mo15336c()
            com.google.android.gms.measurement.internal.ag r1 = r1.f16649e
            long r1 = r1.mo15283a()
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r5 = com.google.android.gms.measurement.internal.C4756h.f17189z
            java.lang.Object r5 = r5.mo15821b()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.eh r7 = r20.mo15550g()
            boolean r7 = r7.mo15568a(r1, r5)
            if (r7 != 0) goto L_0x01f6
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x01f6:
            com.google.android.gms.measurement.internal.ab r1 = r20.m23436t()
            r1.mo15259b()
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.common.util.e r1 = r1.mo15248m()
            long r1 = r1.mo11326a()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0231
            com.google.android.gms.measurement.internal.h$a<java.lang.Long> r1 = com.google.android.gms.measurement.internal.C4756h.f17115E
            java.lang.Object r1 = r1.mo15821b()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.measurement.internal.ad r1 = r1.mo15336c()
            com.google.android.gms.measurement.internal.ag r1 = r1.f16647c
            com.google.android.gms.measurement.internal.av r2 = r0.f17016j
            com.google.android.gms.common.util.e r2 = r2.mo15248m()
            long r2 = r2.mo11326a()
            r1.mo15284a(r2)
        L_0x0231:
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.measurement.internal.r r1 = r1.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r2 = "Upload scheduled in approximately ms"
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            r1.mo15859a(r2, r3)
            com.google.android.gms.measurement.internal.dx r1 = r20.m23437v()
            r1.mo15519a(r8)
            return
        L_0x024c:
            com.google.android.gms.measurement.internal.av r1 = r0.f17016j
            com.google.android.gms.measurement.internal.r r1 = r1.mo15253r()
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.mo15858a(r2)
            com.google.android.gms.measurement.internal.ab r1 = r20.m23436t()
            r1.mo15259b()
            com.google.android.gms.measurement.internal.dx r1 = r20.m23437v()
            r1.mo15520f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4726eb.m23441z():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo15527a() {
        this.f17016j.mo15252q().mo15239d();
        mo15546d().mo15764B();
        if (this.f17016j.mo15336c().f16647c.mo15283a() == 0) {
            this.f17016j.mo15336c().f16647c.mo15284a(this.f17016j.mo15248m().mo11326a());
        }
        m23441z();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15528a(int i, Throwable th, byte[] bArr, String str) {
        C4747ev d;
        m23438w();
        mo15553j();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.f17025s = false;
                m23414A();
                throw th2;
            }
        }
        List<Long> list = this.f17029w;
        this.f17029w = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.f17016j.mo15336c().f16647c.mo15284a(this.f17016j.mo15248m().mo11326a());
                this.f17016j.mo15336c().f16648d.mo15284a(0);
                m23441z();
                this.f17016j.mo15253r().mo15855x().mo15860a("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                mo15546d().mo15799f();
                try {
                    for (Long l : list) {
                        try {
                            d = mo15546d();
                            long longValue = l.longValue();
                            d.mo15239d();
                            d.mo15525k();
                            if (d.mo15804y().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            d.mo15253r().mo15852u_().mo15859a("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            if (this.f17030x == null || !this.f17030x.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    mo15546d().mo15802w();
                    mo15546d().mo15803x();
                    this.f17030x = null;
                    if (!mo15544c().mo15863f() || !m23440y()) {
                        this.f17031y = -1;
                        m23441z();
                    } else {
                        mo15554k();
                    }
                    this.f17020n = 0;
                } catch (Throwable th3) {
                    mo15546d().mo15803x();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                this.f17016j.mo15253r().mo15852u_().mo15859a("Database error while trying to delete uploaded bundles", e3);
                this.f17020n = this.f17016j.mo15248m().mo11327b();
                this.f17016j.mo15253r().mo15855x().mo15859a("Disable upload, time", Long.valueOf(this.f17020n));
            }
        } else {
            this.f17016j.mo15253r().mo15855x().mo15860a("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f17016j.mo15336c().f16648d.mo15284a(this.f17016j.mo15248m().mo11326a());
            if (i != 503) {
                if (i != 429) {
                    z = false;
                }
            }
            if (z) {
                this.f17016j.mo15336c().f16649e.mo15284a(this.f17016j.mo15248m().mo11326a());
            }
            if (this.f17016j.mo15335b().mo15745g(str)) {
                mo15546d().mo15782a(list);
            }
            m23441z();
        }
        this.f17025s = false;
        m23414A();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15529a(C4725ea eaVar) {
        this.f17022p++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15530a(zzag zzag, zzk zzk) {
        List<zzo> list;
        List<zzo> list2;
        List<zzo> list3;
        C4769t u_;
        String str;
        Object a;
        String c;
        Object obj;
        zzag zzag2 = zzag;
        zzk zzk2 = zzk;
        C3266s.m14913a(zzk);
        C3266s.m14915a(zzk2.f17264a);
        m23438w();
        mo15553j();
        String str2 = zzk2.f17264a;
        long j = zzag2.f17255d;
        if (mo15550g().mo15569a(zzag2, zzk2)) {
            if (!zzk2.f17271h) {
                m23434e(zzk2);
                return;
            }
            mo15546d().mo15799f();
            try {
                C4747ev d = mo15546d();
                C3266s.m14915a(str2);
                d.mo15239d();
                d.mo15525k();
                if (j < 0) {
                    d.mo15253r().mo15849i().mo15860a("Invalid time querying timed out conditional properties", C4767r.m23924a(str2), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = d.mo15778a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzo zzo : list) {
                    if (zzo != null) {
                        this.f17016j.mo15253r().mo15854w().mo15861a("User property timed out", zzo.f17282a, this.f17016j.mo15344k().mo15843c(zzo.f17284c.f17256a), zzo.f17284c.mo15877a());
                        if (zzo.f17288g != null) {
                            m23433b(new zzag(zzo.f17288g, j), zzk2);
                        }
                        mo15546d().mo15795e(str2, zzo.f17284c.f17256a);
                    }
                }
                C4747ev d2 = mo15546d();
                C3266s.m14915a(str2);
                d2.mo15239d();
                d2.mo15525k();
                if (j < 0) {
                    d2.mo15253r().mo15849i().mo15860a("Invalid time querying expired conditional properties", C4767r.m23924a(str2), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = d2.mo15778a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (zzo zzo2 : list2) {
                    if (zzo2 != null) {
                        this.f17016j.mo15253r().mo15854w().mo15861a("User property expired", zzo2.f17282a, this.f17016j.mo15344k().mo15843c(zzo2.f17284c.f17256a), zzo2.f17284c.mo15877a());
                        mo15546d().mo15790b(str2, zzo2.f17284c.f17256a);
                        if (zzo2.f17292k != null) {
                            arrayList.add(zzo2.f17292k);
                        }
                        mo15546d().mo15795e(str2, zzo2.f17284c.f17256a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    m23433b(new zzag((zzag) obj2, j), zzk2);
                }
                C4747ev d3 = mo15546d();
                String str3 = zzag2.f17252a;
                C3266s.m14915a(str2);
                C3266s.m14915a(str3);
                d3.mo15239d();
                d3.mo15525k();
                if (j < 0) {
                    d3.mo15253r().mo15849i().mo15861a("Invalid time querying triggered conditional properties", C4767r.m23924a(str2), d3.mo15250o().mo15841a(str3), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = d3.mo15778a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                for (zzo zzo3 : list3) {
                    if (zzo3 != null) {
                        zzfv zzfv = zzo3.f17284c;
                        C4735ej ejVar = r4;
                        C4735ej ejVar2 = new C4735ej(zzo3.f17282a, zzo3.f17283b, zzfv.f17256a, j, zzfv.mo15877a());
                        if (mo15546d().mo15785a(ejVar)) {
                            u_ = this.f17016j.mo15253r().mo15854w();
                            str = "User property triggered";
                            a = zzo3.f17282a;
                            c = this.f17016j.mo15344k().mo15843c(ejVar.f17047c);
                            obj = ejVar.f17049e;
                        } else {
                            u_ = this.f17016j.mo15253r().mo15852u_();
                            str = "Too many active user properties, ignoring";
                            a = C4767r.m23924a(zzo3.f17282a);
                            c = this.f17016j.mo15344k().mo15843c(ejVar.f17047c);
                            obj = ejVar.f17049e;
                        }
                        u_.mo15861a(str, a, c, obj);
                        if (zzo3.f17290i != null) {
                            arrayList3.add(zzo3.f17290i);
                        }
                        zzo3.f17284c = new zzfv(ejVar);
                        zzo3.f17286e = true;
                        mo15546d().mo15786a(zzo3);
                    }
                }
                m23433b(zzag, zzk);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList4.get(i2);
                    i2++;
                    m23433b(new zzag((zzag) obj3, j), zzk2);
                }
                mo15546d().mo15802w();
            } finally {
                mo15546d().mo15803x();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15531a(zzag zzag, String str) {
        zzag zzag2 = zzag;
        String str2 = str;
        C4738em b = mo15546d().mo15788b(str2);
        if (b == null || TextUtils.isEmpty(b.mo15643j())) {
            this.f17016j.mo15253r().mo15854w().mo15859a("No app data available; dropping event", str2);
            return;
        }
        Boolean b2 = m23431b(b);
        if (b2 == null) {
            if (!"_ui".equals(zzag2.f17252a)) {
                this.f17016j.mo15253r().mo15849i().mo15859a("Could not find package. appId", C4767r.m23924a(str));
            }
        } else if (!b2.booleanValue()) {
            this.f17016j.mo15253r().mo15852u_().mo15859a("App version does not match; dropping event. appId", C4767r.m23924a(str));
            return;
        }
        zzk zzk = r2;
        C4738em emVar = b;
        zzk zzk2 = new zzk(str, b.mo15626d(), b.mo15643j(), b.mo15645k(), b.mo15647l(), b.mo15649m(), b.mo15651n(), (String) null, b.mo15654o(), false, emVar.mo15635g(), emVar.mo15611B(), 0, 0, emVar.mo15612C(), emVar.mo15613D(), false, emVar.mo15629e());
        mo15530a(zzag2, zzk);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15532a(zzfv zzfv, zzk zzk) {
        m23438w();
        mo15553j();
        if (TextUtils.isEmpty(zzk.f17265b) && TextUtils.isEmpty(zzk.f17281r)) {
            return;
        }
        if (!zzk.f17271h) {
            m23434e(zzk);
            return;
        }
        int c = this.f17016j.mo15343j().mo15594c(zzfv.f17256a);
        if (c != 0) {
            this.f17016j.mo15343j();
            this.f17016j.mo15343j().mo15587a(zzk.f17264a, c, "_ev", C4736ek.m23527a(zzfv.f17256a, 24, true), zzfv.f17256a != null ? zzfv.f17256a.length() : 0);
            return;
        }
        int b = this.f17016j.mo15343j().mo15592b(zzfv.f17256a, zzfv.mo15877a());
        if (b != 0) {
            this.f17016j.mo15343j();
            String a = C4736ek.m23527a(zzfv.f17256a, 24, true);
            Object a2 = zzfv.mo15877a();
            this.f17016j.mo15343j().mo15587a(zzk.f17264a, b, "_ev", a, (a2 == null || (!(a2 instanceof String) && !(a2 instanceof CharSequence))) ? 0 : String.valueOf(a2).length());
            return;
        }
        Object c2 = this.f17016j.mo15343j().mo15595c(zzfv.f17256a, zzfv.mo15877a());
        if (c2 != null) {
            if (this.f17016j.mo15335b().mo15757q(zzk.f17264a) && "_sno".equals(zzfv.f17256a)) {
                long j = 0;
                C4735ej c3 = mo15546d().mo15792c(zzk.f17264a, "_sno");
                if (c3 == null || !(c3.f17049e instanceof Long)) {
                    C4697d a3 = mo15546d().mo15772a(zzk.f17264a, "_s");
                    if (a3 != null) {
                        j = a3.f16930c;
                        this.f17016j.mo15253r().mo15855x().mo15859a("Backfill the session number. Last used session number", Long.valueOf(j));
                    }
                } else {
                    j = ((Long) c3.f17049e).longValue();
                }
                c2 = Long.valueOf(j + 1);
            }
            C4735ej ejVar = new C4735ej(zzk.f17264a, zzfv.f17260e, zzfv.f17256a, zzfv.f17257b, c2);
            this.f17016j.mo15253r().mo15854w().mo15860a("Setting user property", this.f17016j.mo15344k().mo15843c(ejVar.f17047c), c2);
            mo15546d().mo15799f();
            try {
                m23434e(zzk);
                boolean a4 = mo15546d().mo15785a(ejVar);
                mo15546d().mo15802w();
                if (a4) {
                    this.f17016j.mo15253r().mo15854w().mo15860a("User property set", this.f17016j.mo15344k().mo15843c(ejVar.f17047c), ejVar.f17049e);
                } else {
                    this.f17016j.mo15253r().mo15852u_().mo15860a("Too many unique user properties are set. Ignoring user property", this.f17016j.mo15344k().mo15843c(ejVar.f17047c), ejVar.f17049e);
                    this.f17016j.mo15343j().mo15587a(zzk.f17264a, 9, (String) null, (String) null, 0);
                }
            } finally {
                mo15546d().mo15803x();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15533a(zzk zzk) {
        m23438w();
        mo15553j();
        C3266s.m14915a(zzk.f17264a);
        m23434e(zzk);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15534a(zzo zzo) {
        zzk a = m23421a(zzo.f17282a);
        if (a != null) {
            mo15535a(zzo, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15535a(zzo zzo, zzk zzk) {
        C4769t u_;
        String str;
        Object a;
        String c;
        Object a2;
        C4769t u_2;
        String str2;
        Object a3;
        String c2;
        Object obj;
        C3266s.m14913a(zzo);
        C3266s.m14915a(zzo.f17282a);
        C3266s.m14913a(zzo.f17283b);
        C3266s.m14913a(zzo.f17284c);
        C3266s.m14915a(zzo.f17284c.f17256a);
        m23438w();
        mo15553j();
        if (TextUtils.isEmpty(zzk.f17265b) && TextUtils.isEmpty(zzk.f17281r)) {
            return;
        }
        if (!zzk.f17271h) {
            m23434e(zzk);
            return;
        }
        zzo zzo2 = new zzo(zzo);
        boolean z = false;
        zzo2.f17286e = false;
        mo15546d().mo15799f();
        try {
            zzo d = mo15546d().mo15793d(zzo2.f17282a, zzo2.f17284c.f17256a);
            if (d != null && !d.f17283b.equals(zzo2.f17283b)) {
                this.f17016j.mo15253r().mo15849i().mo15861a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f17016j.mo15344k().mo15843c(zzo2.f17284c.f17256a), zzo2.f17283b, d.f17283b);
            }
            if (d != null && d.f17286e) {
                zzo2.f17283b = d.f17283b;
                zzo2.f17285d = d.f17285d;
                zzo2.f17289h = d.f17289h;
                zzo2.f17287f = d.f17287f;
                zzo2.f17290i = d.f17290i;
                zzo2.f17286e = d.f17286e;
                zzfv zzfv = new zzfv(zzo2.f17284c.f17256a, d.f17284c.f17257b, zzo2.f17284c.mo15877a(), d.f17284c.f17260e);
                zzo2.f17284c = zzfv;
            } else if (TextUtils.isEmpty(zzo2.f17287f)) {
                zzfv zzfv2 = new zzfv(zzo2.f17284c.f17256a, zzo2.f17285d, zzo2.f17284c.mo15877a(), zzo2.f17284c.f17260e);
                zzo2.f17284c = zzfv2;
                zzo2.f17286e = true;
                z = true;
            }
            if (zzo2.f17286e) {
                zzfv zzfv3 = zzo2.f17284c;
                C4735ej ejVar = new C4735ej(zzo2.f17282a, zzo2.f17283b, zzfv3.f17256a, zzfv3.f17257b, zzfv3.mo15877a());
                if (mo15546d().mo15785a(ejVar)) {
                    u_2 = this.f17016j.mo15253r().mo15854w();
                    str2 = "User property updated immediately";
                    a3 = zzo2.f17282a;
                    c2 = this.f17016j.mo15344k().mo15843c(ejVar.f17047c);
                    obj = ejVar.f17049e;
                } else {
                    u_2 = this.f17016j.mo15253r().mo15852u_();
                    str2 = "(2)Too many active user properties, ignoring";
                    a3 = C4767r.m23924a(zzo2.f17282a);
                    c2 = this.f17016j.mo15344k().mo15843c(ejVar.f17047c);
                    obj = ejVar.f17049e;
                }
                u_2.mo15861a(str2, a3, c2, obj);
                if (z && zzo2.f17290i != null) {
                    m23433b(new zzag(zzo2.f17290i, zzo2.f17285d), zzk);
                }
            }
            if (mo15546d().mo15786a(zzo2)) {
                u_ = this.f17016j.mo15253r().mo15854w();
                str = "Conditional property added";
                a = zzo2.f17282a;
                c = this.f17016j.mo15344k().mo15843c(zzo2.f17284c.f17256a);
                a2 = zzo2.f17284c.mo15877a();
            } else {
                u_ = this.f17016j.mo15253r().mo15852u_();
                str = "Too many conditional properties, ignoring";
                a = C4767r.m23924a(zzo2.f17282a);
                c = this.f17016j.mo15344k().mo15843c(zzo2.f17284c.f17256a);
                a2 = zzo2.f17284c.mo15877a();
            }
            u_.mo15861a(str, a, c, a2);
            mo15546d().mo15802w();
        } finally {
            mo15546d().mo15803x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15536a(Runnable runnable) {
        m23438w();
        if (this.f17021o == null) {
            this.f17021o = new ArrayList();
        }
        this.f17021o.add(runnable);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0136 A[Catch:{ all -> 0x017d, all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146 A[Catch:{ all -> 0x017d, all -> 0x000f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15537a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.m23438w()
            r6.mo15553j()
            com.google.android.gms.common.internal.C3266s.m14915a(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x000f }
            goto L_0x0012
        L_0x000f:
            r7 = move-exception
            goto L_0x0186
        L_0x0012:
            com.google.android.gms.measurement.internal.av r1 = r6.f17016j     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.r r1 = r1.mo15253r()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.t r1 = r1.mo15855x()     // Catch:{ all -> 0x000f }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x000f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x000f }
            r1.mo15859a(r2, r3)     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ev r1 = r6.mo15546d()     // Catch:{ all -> 0x000f }
            r1.mo15799f()     // Catch:{ all -> 0x000f }
            com.google.android.gms.measurement.internal.ev r1 = r6.mo15546d()     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.em r1 = r1.mo15788b(r7)     // Catch:{ all -> 0x017d }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r2) goto L_0x0042
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x0042
            if (r8 != r4) goto L_0x0046
        L_0x0042:
            if (r9 != 0) goto L_0x0046
            r2 = 1
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r1 != 0) goto L_0x005e
            com.google.android.gms.measurement.internal.av r8 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.r r8 = r8.mo15253r()     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.t r8 = r8.mo15849i()     // Catch:{ all -> 0x017d }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4767r.m23924a(r7)     // Catch:{ all -> 0x017d }
            r8.mo15859a(r9, r7)     // Catch:{ all -> 0x017d }
            goto L_0x0171
        L_0x005e:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00ce
            if (r8 != r5) goto L_0x0065
            goto L_0x00ce
        L_0x0065:
            com.google.android.gms.measurement.internal.av r10 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.common.util.e r10 = r10.mo15248m()     // Catch:{ all -> 0x017d }
            long r10 = r10.mo11326a()     // Catch:{ all -> 0x017d }
            r1.mo15639h(r10)     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.ev r10 = r6.mo15546d()     // Catch:{ all -> 0x017d }
            r10.mo15780a(r1)     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.av r10 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.r r10 = r10.mo15253r()     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.t r10 = r10.mo15855x()     // Catch:{ all -> 0x017d }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x017d }
            r10.mo15860a(r11, r1, r9)     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.aq r9 = r6.m23435s()     // Catch:{ all -> 0x017d }
            r9.mo15302c(r7)     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.av r7 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo15336c()     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.ag r7 = r7.f16648d     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.av r9 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.common.util.e r9 = r9.mo15248m()     // Catch:{ all -> 0x017d }
            long r9 = r9.mo11326a()     // Catch:{ all -> 0x017d }
            r7.mo15284a(r9)     // Catch:{ all -> 0x017d }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00b2
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r3 = 0
        L_0x00b2:
            if (r3 == 0) goto L_0x00c9
            com.google.android.gms.measurement.internal.av r7 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo15336c()     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.ag r7 = r7.f16649e     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.av r8 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.common.util.e r8 = r8.mo15248m()     // Catch:{ all -> 0x017d }
            long r8 = r8.mo11326a()     // Catch:{ all -> 0x017d }
            r7.mo15284a(r8)     // Catch:{ all -> 0x017d }
        L_0x00c9:
            r6.m23441z()     // Catch:{ all -> 0x017d }
            goto L_0x0171
        L_0x00ce:
            r9 = 0
            if (r11 == 0) goto L_0x00da
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x017d }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x017d }
            goto L_0x00db
        L_0x00da:
            r11 = r9
        L_0x00db:
            if (r11 == 0) goto L_0x00ea
            int r2 = r11.size()     // Catch:{ all -> 0x017d }
            if (r2 <= 0) goto L_0x00ea
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x017d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x017d }
            goto L_0x00eb
        L_0x00ea:
            r11 = r9
        L_0x00eb:
            if (r8 == r5) goto L_0x0107
            if (r8 != r4) goto L_0x00f0
            goto L_0x0107
        L_0x00f0:
            com.google.android.gms.measurement.internal.aq r9 = r6.m23435s()     // Catch:{ all -> 0x017d }
            boolean r9 = r9.mo15299a(r7, r10, r11)     // Catch:{ all -> 0x017d }
            if (r9 != 0) goto L_0x0120
            com.google.android.gms.measurement.internal.ev r7 = r6.mo15546d()     // Catch:{ all -> 0x000f }
        L_0x00fe:
            r7.mo15803x()     // Catch:{ all -> 0x000f }
            r6.f17024r = r0
            r6.m23414A()
            return
        L_0x0107:
            com.google.android.gms.measurement.internal.aq r11 = r6.m23435s()     // Catch:{ all -> 0x017d }
            com.google.android.gms.internal.measurement.cp r11 = r11.mo15297a(r7)     // Catch:{ all -> 0x017d }
            if (r11 != 0) goto L_0x0120
            com.google.android.gms.measurement.internal.aq r11 = r6.m23435s()     // Catch:{ all -> 0x017d }
            boolean r9 = r11.mo15299a(r7, r9, r9)     // Catch:{ all -> 0x017d }
            if (r9 != 0) goto L_0x0120
            com.google.android.gms.measurement.internal.ev r7 = r6.mo15546d()     // Catch:{ all -> 0x000f }
            goto L_0x00fe
        L_0x0120:
            com.google.android.gms.measurement.internal.av r9 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.common.util.e r9 = r9.mo15248m()     // Catch:{ all -> 0x017d }
            long r2 = r9.mo11326a()     // Catch:{ all -> 0x017d }
            r1.mo15636g(r2)     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.ev r9 = r6.mo15546d()     // Catch:{ all -> 0x017d }
            r9.mo15780a(r1)     // Catch:{ all -> 0x017d }
            if (r8 != r5) goto L_0x0146
            com.google.android.gms.measurement.internal.av r8 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.r r8 = r8.mo15253r()     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.t r8 = r8.mo15851k()     // Catch:{ all -> 0x017d }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.mo15859a(r9, r7)     // Catch:{ all -> 0x017d }
            goto L_0x015e
        L_0x0146:
            com.google.android.gms.measurement.internal.av r7 = r6.f17016j     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.r r7 = r7.mo15253r()     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.t r7 = r7.mo15855x()     // Catch:{ all -> 0x017d }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x017d }
            int r10 = r10.length     // Catch:{ all -> 0x017d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x017d }
            r7.mo15860a(r9, r8, r10)     // Catch:{ all -> 0x017d }
        L_0x015e:
            com.google.android.gms.measurement.internal.v r7 = r6.mo15544c()     // Catch:{ all -> 0x017d }
            boolean r7 = r7.mo15863f()     // Catch:{ all -> 0x017d }
            if (r7 == 0) goto L_0x00c9
            boolean r7 = r6.m23440y()     // Catch:{ all -> 0x017d }
            if (r7 == 0) goto L_0x00c9
            r6.mo15554k()     // Catch:{ all -> 0x017d }
        L_0x0171:
            com.google.android.gms.measurement.internal.ev r7 = r6.mo15546d()     // Catch:{ all -> 0x017d }
            r7.mo15802w()     // Catch:{ all -> 0x017d }
            com.google.android.gms.measurement.internal.ev r7 = r6.mo15546d()     // Catch:{ all -> 0x000f }
            goto L_0x00fe
        L_0x017d:
            r7 = move-exception
            com.google.android.gms.measurement.internal.ev r8 = r6.mo15546d()     // Catch:{ all -> 0x000f }
            r8.mo15803x()     // Catch:{ all -> 0x000f }
            throw r7     // Catch:{ all -> 0x000f }
        L_0x0186:
            r6.f17024r = r0
            r6.m23414A()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4726eb.mo15537a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo15538a(boolean z) {
        m23441z();
    }

    /* renamed from: b */
    public final C4744es mo15539b() {
        return this.f17016j.mo15335b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15540b(zzfv zzfv, zzk zzk) {
        m23438w();
        mo15553j();
        if (TextUtils.isEmpty(zzk.f17265b) && TextUtils.isEmpty(zzk.f17281r)) {
            return;
        }
        if (!zzk.f17271h) {
            m23434e(zzk);
            return;
        }
        this.f17016j.mo15253r().mo15854w().mo15859a("Removing user property", this.f17016j.mo15344k().mo15843c(zzfv.f17256a));
        mo15546d().mo15799f();
        try {
            m23434e(zzk);
            mo15546d().mo15790b(zzk.f17264a, zzfv.f17256a);
            mo15546d().mo15802w();
            this.f17016j.mo15253r().mo15854w().mo15859a("User property removed", this.f17016j.mo15344k().mo15843c(zzfv.f17256a));
        } finally {
            mo15546d().mo15803x();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15541b(zzk zzk) {
        if (this.f17029w != null) {
            this.f17030x = new ArrayList();
            this.f17030x.addAll(this.f17029w);
        }
        C4747ev d = mo15546d();
        String str = zzk.f17264a;
        C3266s.m14915a(str);
        d.mo15239d();
        d.mo15525k();
        try {
            SQLiteDatabase y = d.mo15804y();
            String[] strArr = {str};
            int delete = y.delete("apps", "app_id=?", strArr) + 0 + y.delete("events", "app_id=?", strArr) + y.delete("user_attributes", "app_id=?", strArr) + y.delete("conditional_properties", "app_id=?", strArr) + y.delete("raw_events", "app_id=?", strArr) + y.delete("raw_events_metadata", "app_id=?", strArr) + y.delete("queue", "app_id=?", strArr) + y.delete("audience_filter_values", "app_id=?", strArr) + y.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                d.mo15253r().mo15855x().mo15860a("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            d.mo15253r().mo15852u_().mo15860a("Error resetting analytics data. appId, error", C4767r.m23924a(str), e);
        }
        zzk a = m23420a(this.f17016j.mo15249n(), zzk.f17264a, zzk.f17265b, zzk.f17271h, zzk.f17278o, zzk.f17279p, zzk.f17276m, zzk.f17281r);
        if (!this.f17016j.mo15335b().mo15750j(zzk.f17264a) || zzk.f17271h) {
            mo15545c(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15542b(zzo zzo) {
        zzk a = m23421a(zzo.f17282a);
        if (a != null) {
            mo15543b(zzo, a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo15543b(zzo zzo, zzk zzk) {
        C3266s.m14913a(zzo);
        C3266s.m14915a(zzo.f17282a);
        C3266s.m14913a(zzo.f17284c);
        C3266s.m14915a(zzo.f17284c.f17256a);
        m23438w();
        mo15553j();
        if (TextUtils.isEmpty(zzk.f17265b) && TextUtils.isEmpty(zzk.f17281r)) {
            return;
        }
        if (!zzk.f17271h) {
            m23434e(zzk);
            return;
        }
        mo15546d().mo15799f();
        try {
            m23434e(zzk);
            zzo d = mo15546d().mo15793d(zzo.f17282a, zzo.f17284c.f17256a);
            if (d != null) {
                this.f17016j.mo15253r().mo15854w().mo15860a("Removing conditional user property", zzo.f17282a, this.f17016j.mo15344k().mo15843c(zzo.f17284c.f17256a));
                mo15546d().mo15795e(zzo.f17282a, zzo.f17284c.f17256a);
                if (d.f17286e) {
                    mo15546d().mo15790b(zzo.f17282a, zzo.f17284c.f17256a);
                }
                if (zzo.f17292k != null) {
                    Bundle bundle = null;
                    if (zzo.f17292k.f17253b != null) {
                        bundle = zzo.f17292k.f17253b.mo15868b();
                    }
                    Bundle bundle2 = bundle;
                    m23433b(this.f17016j.mo15343j().mo15582a(zzo.f17282a, zzo.f17292k.f17252a, bundle2, d.f17283b, zzo.f17292k.f17255d, true, false), zzk);
                }
            } else {
                this.f17016j.mo15253r().mo15849i().mo15860a("Conditional user property doesn't exist", C4767r.m23924a(zzo.f17282a), this.f17016j.mo15344k().mo15843c(zzo.f17284c.f17256a));
            }
            mo15546d().mo15802w();
        } finally {
            mo15546d().mo15803x();
        }
    }

    /* renamed from: c */
    public final C4771v mo15544c() {
        m23432b((C4725ea) this.f17009c);
        return this.f17009c;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0420 A[Catch:{ SQLiteException -> 0x0153, all -> 0x0449 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f2 A[Catch:{ SQLiteException -> 0x0153, all -> 0x0449 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15545c(com.google.android.gms.measurement.internal.zzk r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r18.m23438w()
            r18.mo15553j()
            com.google.android.gms.common.internal.C3266s.m14913a(r19)
            java.lang.String r0 = r2.f17264a
            com.google.android.gms.common.internal.C3266s.m14915a(r0)
            java.lang.String r0 = r2.f17265b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r2.f17281r
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            com.google.android.gms.measurement.internal.ev r0 = r18.mo15546d()
            java.lang.String r3 = r2.f17264a
            com.google.android.gms.measurement.internal.em r0 = r0.mo15788b(r3)
            r3 = 0
            if (r0 == 0) goto L_0x0056
            java.lang.String r5 = r0.mo15626d()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0056
            java.lang.String r5 = r2.f17265b
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0056
            r0.mo15636g(r3)
            com.google.android.gms.measurement.internal.ev r5 = r18.mo15546d()
            r5.mo15780a(r0)
            com.google.android.gms.measurement.internal.aq r0 = r18.m23435s()
            java.lang.String r5 = r2.f17264a
            r0.mo15305d(r5)
        L_0x0056:
            boolean r0 = r2.f17271h
            if (r0 != 0) goto L_0x005e
            r18.m23434e(r19)
            return
        L_0x005e:
            long r5 = r2.f17276m
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x006e
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j
            com.google.android.gms.common.util.e r0 = r0.mo15248m()
            long r5 = r0.mo11326a()
        L_0x006e:
            int r0 = r2.f17277n
            r13 = 0
            r14 = 1
            if (r0 == 0) goto L_0x0091
            if (r0 == r14) goto L_0x0091
            com.google.android.gms.measurement.internal.av r7 = r1.f17016j
            com.google.android.gms.measurement.internal.r r7 = r7.mo15253r()
            com.google.android.gms.measurement.internal.t r7 = r7.mo15849i()
            java.lang.String r8 = "Incorrect app type, assuming installed app. appId, appType"
            java.lang.String r9 = r2.f17264a
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4767r.m23924a(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7.mo15860a(r8, r9, r0)
            r15 = 0
            goto L_0x0092
        L_0x0091:
            r15 = r0
        L_0x0092:
            com.google.android.gms.measurement.internal.ev r0 = r18.mo15546d()
            r0.mo15799f()
            com.google.android.gms.measurement.internal.ev r0 = r18.mo15546d()     // Catch:{ all -> 0x0449 }
            java.lang.String r7 = r2.f17264a     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.em r0 = r0.mo15788b(r7)     // Catch:{ all -> 0x0449 }
            r16 = 0
            if (r0 == 0) goto L_0x0167
            com.google.android.gms.measurement.internal.av r7 = r1.f17016j     // Catch:{ all -> 0x0449 }
            r7.mo15343j()     // Catch:{ all -> 0x0449 }
            java.lang.String r7 = r2.f17265b     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = r0.mo15626d()     // Catch:{ all -> 0x0449 }
            java.lang.String r9 = r2.f17281r     // Catch:{ all -> 0x0449 }
            java.lang.String r10 = r0.mo15629e()     // Catch:{ all -> 0x0449 }
            boolean r7 = com.google.android.gms.measurement.internal.C4736ek.m23534a(r7, r8, r9, r10)     // Catch:{ all -> 0x0449 }
            if (r7 == 0) goto L_0x0167
            com.google.android.gms.measurement.internal.av r7 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo15253r()     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo15849i()     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r9 = r0.mo15618b()     // Catch:{ all -> 0x0449 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4767r.m23924a(r9)     // Catch:{ all -> 0x0449 }
            r7.mo15859a(r8, r9)     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.ev r7 = r18.mo15546d()     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = r0.mo15618b()     // Catch:{ all -> 0x0449 }
            r7.mo15525k()     // Catch:{ all -> 0x0449 }
            r7.mo15239d()     // Catch:{ all -> 0x0449 }
            com.google.android.gms.common.internal.C3266s.m14915a(r8)     // Catch:{ all -> 0x0449 }
            android.database.sqlite.SQLiteDatabase r0 = r7.mo15804y()     // Catch:{ SQLiteException -> 0x0153 }
            java.lang.String[] r9 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0153 }
            r9[r13] = r8     // Catch:{ SQLiteException -> 0x0153 }
            java.lang.String r10 = "events"
            java.lang.String r11 = "app_id=?"
            int r10 = r0.delete(r10, r11, r9)     // Catch:{ SQLiteException -> 0x0153 }
            int r10 = r10 + r13
            java.lang.String r11 = "user_attributes"
            java.lang.String r12 = "app_id=?"
            int r11 = r0.delete(r11, r12, r9)     // Catch:{ SQLiteException -> 0x0153 }
            int r10 = r10 + r11
            java.lang.String r11 = "conditional_properties"
            java.lang.String r12 = "app_id=?"
            int r11 = r0.delete(r11, r12, r9)     // Catch:{ SQLiteException -> 0x0153 }
            int r10 = r10 + r11
            java.lang.String r11 = "apps"
            java.lang.String r12 = "app_id=?"
            int r11 = r0.delete(r11, r12, r9)     // Catch:{ SQLiteException -> 0x0153 }
            int r10 = r10 + r11
            java.lang.String r11 = "raw_events"
            java.lang.String r12 = "app_id=?"
            int r11 = r0.delete(r11, r12, r9)     // Catch:{ SQLiteException -> 0x0153 }
            int r10 = r10 + r11
            java.lang.String r11 = "raw_events_metadata"
            java.lang.String r12 = "app_id=?"
            int r11 = r0.delete(r11, r12, r9)     // Catch:{ SQLiteException -> 0x0153 }
            int r10 = r10 + r11
            java.lang.String r11 = "event_filters"
            java.lang.String r12 = "app_id=?"
            int r11 = r0.delete(r11, r12, r9)     // Catch:{ SQLiteException -> 0x0153 }
            int r10 = r10 + r11
            java.lang.String r11 = "property_filters"
            java.lang.String r12 = "app_id=?"
            int r11 = r0.delete(r11, r12, r9)     // Catch:{ SQLiteException -> 0x0153 }
            int r10 = r10 + r11
            java.lang.String r11 = "audience_filter_values"
            java.lang.String r12 = "app_id=?"
            int r0 = r0.delete(r11, r12, r9)     // Catch:{ SQLiteException -> 0x0153 }
            int r10 = r10 + r0
            if (r10 <= 0) goto L_0x0165
            com.google.android.gms.measurement.internal.r r0 = r7.mo15253r()     // Catch:{ SQLiteException -> 0x0153 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()     // Catch:{ SQLiteException -> 0x0153 }
            java.lang.String r9 = "Deleted application data. app, records"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ SQLiteException -> 0x0153 }
            r0.mo15860a(r9, r8, r10)     // Catch:{ SQLiteException -> 0x0153 }
            goto L_0x0165
        L_0x0153:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r7 = r7.mo15253r()     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo15852u_()     // Catch:{ all -> 0x0449 }
            java.lang.String r9 = "Error deleting application data. appId, error"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4767r.m23924a(r8)     // Catch:{ all -> 0x0449 }
            r7.mo15860a(r9, r8, r0)     // Catch:{ all -> 0x0449 }
        L_0x0165:
            r0 = r16
        L_0x0167:
            if (r0 == 0) goto L_0x01d1
            long r7 = r0.mo15645k()     // Catch:{ all -> 0x0449 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x01a0
            long r7 = r0.mo15645k()     // Catch:{ all -> 0x0449 }
            long r9 = r2.f17273j     // Catch:{ all -> 0x0449 }
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x01d1
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x0449 }
            r7.<init>()     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_pv"
            java.lang.String r0 = r0.mo15643j()     // Catch:{ all -> 0x0449 }
            r7.putString(r8, r0)     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.zzag r0 = new com.google.android.gms.measurement.internal.zzag     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_au"
            com.google.android.gms.measurement.internal.zzad r9 = new com.google.android.gms.measurement.internal.zzad     // Catch:{ all -> 0x0449 }
            r9.<init>(r7)     // Catch:{ all -> 0x0449 }
            java.lang.String r10 = "auto"
            r7 = r0
            r11 = r5
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x0449 }
        L_0x019c:
            r1.mo15530a(r0, r2)     // Catch:{ all -> 0x0449 }
            goto L_0x01d1
        L_0x01a0:
            java.lang.String r7 = r0.mo15643j()     // Catch:{ all -> 0x0449 }
            if (r7 == 0) goto L_0x01d1
            java.lang.String r7 = r0.mo15643j()     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = r2.f17266c     // Catch:{ all -> 0x0449 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x0449 }
            if (r7 != 0) goto L_0x01d1
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x0449 }
            r7.<init>()     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_pv"
            java.lang.String r0 = r0.mo15643j()     // Catch:{ all -> 0x0449 }
            r7.putString(r8, r0)     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.zzag r0 = new com.google.android.gms.measurement.internal.zzag     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_au"
            com.google.android.gms.measurement.internal.zzad r9 = new com.google.android.gms.measurement.internal.zzad     // Catch:{ all -> 0x0449 }
            r9.<init>(r7)     // Catch:{ all -> 0x0449 }
            java.lang.String r10 = "auto"
            r7 = r0
            r11 = r5
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x0449 }
            goto L_0x019c
        L_0x01d1:
            r18.m23434e(r19)     // Catch:{ all -> 0x0449 }
            if (r15 != 0) goto L_0x01e3
            com.google.android.gms.measurement.internal.ev r0 = r18.mo15546d()     // Catch:{ all -> 0x0449 }
            java.lang.String r7 = r2.f17264a     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_f"
        L_0x01de:
            com.google.android.gms.measurement.internal.d r0 = r0.mo15772a(r7, r8)     // Catch:{ all -> 0x0449 }
            goto L_0x01f0
        L_0x01e3:
            if (r15 != r14) goto L_0x01ee
            com.google.android.gms.measurement.internal.ev r0 = r18.mo15546d()     // Catch:{ all -> 0x0449 }
            java.lang.String r7 = r2.f17264a     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_v"
            goto L_0x01de
        L_0x01ee:
            r0 = r16
        L_0x01f0:
            if (r0 != 0) goto L_0x0420
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r9 = r5 / r7
            r11 = 1
            long r9 = r9 + r11
            long r9 = r9 * r7
            if (r15 != 0) goto L_0x0377
            com.google.android.gms.measurement.internal.zzfv r0 = new com.google.android.gms.measurement.internal.zzfv     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_fot"
            java.lang.Long r15 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0449 }
            java.lang.String r17 = "auto"
            r7 = r0
            r9 = r5
            r13 = r11
            r11 = r15
            r12 = r17
            r7.<init>(r8, r9, r11, r12)     // Catch:{ all -> 0x0449 }
            r1.mo15532a(r0, r2)     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.es r0 = r0.mo15335b()     // Catch:{ all -> 0x0449 }
            java.lang.String r7 = r2.f17265b     // Catch:{ all -> 0x0449 }
            boolean r0 = r0.mo15754n(r7)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x0230
            r18.m23438w()     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.aj r0 = r0.mo15339f()     // Catch:{ all -> 0x0449 }
            java.lang.String r7 = r2.f17264a     // Catch:{ all -> 0x0449 }
            r0.mo15290a(r7)     // Catch:{ all -> 0x0449 }
        L_0x0230:
            r18.m23438w()     // Catch:{ all -> 0x0449 }
            r18.mo15553j()     // Catch:{ all -> 0x0449 }
            android.os.Bundle r15 = new android.os.Bundle     // Catch:{ all -> 0x0449 }
            r15.<init>()     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "_c"
            r15.putLong(r0, r13)     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "_r"
            r15.putLong(r0, r13)     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "_uwa"
            r15.putLong(r0, r3)     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "_pfo"
            r15.putLong(r0, r3)     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "_sys"
            r15.putLong(r0, r3)     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "_sysu"
            r15.putLong(r0, r3)     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.es r0 = r0.mo15335b()     // Catch:{ all -> 0x0449 }
            java.lang.String r7 = r2.f17264a     // Catch:{ all -> 0x0449 }
            boolean r0 = r0.mo15760t(r7)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x026c
            java.lang.String r0 = "_et"
            r15.putLong(r0, r13)     // Catch:{ all -> 0x0449 }
        L_0x026c:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.es r0 = r0.mo15335b()     // Catch:{ all -> 0x0449 }
            java.lang.String r7 = r2.f17264a     // Catch:{ all -> 0x0449 }
            boolean r0 = r0.mo15750j(r7)     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x0283
            boolean r0 = r2.f17280q     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x0283
            java.lang.String r0 = "_dac"
            r15.putLong(r0, r13)     // Catch:{ all -> 0x0449 }
        L_0x0283:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x0449 }
            android.content.Context r0 = r0.mo15249n()     // Catch:{ all -> 0x0449 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0449 }
            if (r0 != 0) goto L_0x02a6
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x0449 }
            java.lang.String r7 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r8 = r2.f17264a     // Catch:{ all -> 0x0449 }
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C4767r.m23924a(r8)     // Catch:{ all -> 0x0449 }
            r0.mo15859a(r7, r8)     // Catch:{ all -> 0x0449 }
            goto L_0x0343
        L_0x02a6:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ NameNotFoundException -> 0x02b8 }
            android.content.Context r0 = r0.mo15249n()     // Catch:{ NameNotFoundException -> 0x02b8 }
            com.google.android.gms.common.d.b r0 = com.google.android.gms.common.p123d.C3181c.m14658a(r0)     // Catch:{ NameNotFoundException -> 0x02b8 }
            java.lang.String r7 = r2.f17264a     // Catch:{ NameNotFoundException -> 0x02b8 }
            r8 = 0
            android.content.pm.PackageInfo r0 = r0.mo11129b(r7, r8)     // Catch:{ NameNotFoundException -> 0x02b8 }
            goto L_0x02d0
        L_0x02b8:
            r0 = move-exception
            com.google.android.gms.measurement.internal.av r7 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.r r7 = r7.mo15253r()     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.t r7 = r7.mo15852u_()     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r9 = r2.f17264a     // Catch:{ all -> 0x0449 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C4767r.m23924a(r9)     // Catch:{ all -> 0x0449 }
            r7.mo15860a(r8, r9, r0)     // Catch:{ all -> 0x0449 }
            r0 = r16
        L_0x02d0:
            if (r0 == 0) goto L_0x0301
            long r7 = r0.firstInstallTime     // Catch:{ all -> 0x0449 }
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x0301
            long r7 = r0.firstInstallTime     // Catch:{ all -> 0x0449 }
            long r9 = r0.lastUpdateTime     // Catch:{ all -> 0x0449 }
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x02e7
            java.lang.String r0 = "_uwa"
            r15.putLong(r0, r13)     // Catch:{ all -> 0x0449 }
            r0 = 0
            goto L_0x02e8
        L_0x02e7:
            r0 = 1
        L_0x02e8:
            com.google.android.gms.measurement.internal.zzfv r12 = new com.google.android.gms.measurement.internal.zzfv     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_fi"
            if (r0 == 0) goto L_0x02f0
            r9 = r13
            goto L_0x02f1
        L_0x02f0:
            r9 = r3
        L_0x02f1:
            java.lang.Long r11 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0449 }
            java.lang.String r0 = "auto"
            r7 = r12
            r9 = r5
            r3 = r12
            r12 = r0
            r7.<init>(r8, r9, r11, r12)     // Catch:{ all -> 0x0449 }
            r1.mo15532a(r3, r2)     // Catch:{ all -> 0x0449 }
        L_0x0301:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ NameNotFoundException -> 0x0313 }
            android.content.Context r0 = r0.mo15249n()     // Catch:{ NameNotFoundException -> 0x0313 }
            com.google.android.gms.common.d.b r0 = com.google.android.gms.common.p123d.C3181c.m14658a(r0)     // Catch:{ NameNotFoundException -> 0x0313 }
            java.lang.String r3 = r2.f17264a     // Catch:{ NameNotFoundException -> 0x0313 }
            r4 = 0
            android.content.pm.ApplicationInfo r0 = r0.mo11124a(r3, r4)     // Catch:{ NameNotFoundException -> 0x0313 }
            goto L_0x032b
        L_0x0313:
            r0 = move-exception
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.r r3 = r3.mo15253r()     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.t r3 = r3.mo15852u_()     // Catch:{ all -> 0x0449 }
            java.lang.String r4 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r7 = r2.f17264a     // Catch:{ all -> 0x0449 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4767r.m23924a(r7)     // Catch:{ all -> 0x0449 }
            r3.mo15860a(r4, r7, r0)     // Catch:{ all -> 0x0449 }
            r0 = r16
        L_0x032b:
            if (r0 == 0) goto L_0x0343
            int r3 = r0.flags     // Catch:{ all -> 0x0449 }
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0338
            java.lang.String r3 = "_sys"
            r15.putLong(r3, r13)     // Catch:{ all -> 0x0449 }
        L_0x0338:
            int r0 = r0.flags     // Catch:{ all -> 0x0449 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0343
            java.lang.String r0 = "_sysu"
            r15.putLong(r0, r13)     // Catch:{ all -> 0x0449 }
        L_0x0343:
            com.google.android.gms.measurement.internal.ev r0 = r18.mo15546d()     // Catch:{ all -> 0x0449 }
            java.lang.String r3 = r2.f17264a     // Catch:{ all -> 0x0449 }
            com.google.android.gms.common.internal.C3266s.m14915a(r3)     // Catch:{ all -> 0x0449 }
            r0.mo15239d()     // Catch:{ all -> 0x0449 }
            r0.mo15525k()     // Catch:{ all -> 0x0449 }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.mo15801h(r3, r4)     // Catch:{ all -> 0x0449 }
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0363
            java.lang.String r0 = "_pfo"
            r15.putLong(r0, r3)     // Catch:{ all -> 0x0449 }
        L_0x0363:
            com.google.android.gms.measurement.internal.zzag r0 = new com.google.android.gms.measurement.internal.zzag     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_f"
            com.google.android.gms.measurement.internal.zzad r9 = new com.google.android.gms.measurement.internal.zzad     // Catch:{ all -> 0x0449 }
            r9.<init>(r15)     // Catch:{ all -> 0x0449 }
            java.lang.String r10 = "auto"
            r7 = r0
            r11 = r5
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x0449 }
            r1.mo15530a(r0, r2)     // Catch:{ all -> 0x0449 }
            goto L_0x03df
        L_0x0377:
            r13 = r11
            r3 = 1
            if (r15 != r3) goto L_0x03df
            com.google.android.gms.measurement.internal.zzfv r0 = new com.google.android.gms.measurement.internal.zzfv     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_fvt"
            java.lang.Long r11 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0449 }
            java.lang.String r12 = "auto"
            r7 = r0
            r9 = r5
            r7.<init>(r8, r9, r11, r12)     // Catch:{ all -> 0x0449 }
            r1.mo15532a(r0, r2)     // Catch:{ all -> 0x0449 }
            r18.m23438w()     // Catch:{ all -> 0x0449 }
            r18.mo15553j()     // Catch:{ all -> 0x0449 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0449 }
            r0.<init>()     // Catch:{ all -> 0x0449 }
            java.lang.String r3 = "_c"
            r0.putLong(r3, r13)     // Catch:{ all -> 0x0449 }
            java.lang.String r3 = "_r"
            r0.putLong(r3, r13)     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.es r3 = r3.mo15335b()     // Catch:{ all -> 0x0449 }
            java.lang.String r4 = r2.f17264a     // Catch:{ all -> 0x0449 }
            boolean r3 = r3.mo15760t(r4)     // Catch:{ all -> 0x0449 }
            if (r3 == 0) goto L_0x03b5
            java.lang.String r3 = "_et"
            r0.putLong(r3, r13)     // Catch:{ all -> 0x0449 }
        L_0x03b5:
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.es r3 = r3.mo15335b()     // Catch:{ all -> 0x0449 }
            java.lang.String r4 = r2.f17264a     // Catch:{ all -> 0x0449 }
            boolean r3 = r3.mo15750j(r4)     // Catch:{ all -> 0x0449 }
            if (r3 == 0) goto L_0x03cc
            boolean r3 = r2.f17280q     // Catch:{ all -> 0x0449 }
            if (r3 == 0) goto L_0x03cc
            java.lang.String r3 = "_dac"
            r0.putLong(r3, r13)     // Catch:{ all -> 0x0449 }
        L_0x03cc:
            com.google.android.gms.measurement.internal.zzag r3 = new com.google.android.gms.measurement.internal.zzag     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_v"
            com.google.android.gms.measurement.internal.zzad r9 = new com.google.android.gms.measurement.internal.zzad     // Catch:{ all -> 0x0449 }
            r9.<init>(r0)     // Catch:{ all -> 0x0449 }
            java.lang.String r10 = "auto"
            r7 = r3
            r11 = r5
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x0449 }
            r1.mo15530a(r3, r2)     // Catch:{ all -> 0x0449 }
        L_0x03df:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.es r0 = r0.mo15335b()     // Catch:{ all -> 0x0449 }
            java.lang.String r3 = r2.f17264a     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.C4756h.f17153ao     // Catch:{ all -> 0x0449 }
            boolean r0 = r0.mo15740d(r3, r4)     // Catch:{ all -> 0x0449 }
            if (r0 != 0) goto L_0x043a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0449 }
            r0.<init>()     // Catch:{ all -> 0x0449 }
            java.lang.String r3 = "_et"
            r0.putLong(r3, r13)     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.es r3 = r3.mo15335b()     // Catch:{ all -> 0x0449 }
            java.lang.String r4 = r2.f17264a     // Catch:{ all -> 0x0449 }
            boolean r3 = r3.mo15760t(r4)     // Catch:{ all -> 0x0449 }
            if (r3 == 0) goto L_0x040c
            java.lang.String r3 = "_fr"
            r0.putLong(r3, r13)     // Catch:{ all -> 0x0449 }
        L_0x040c:
            com.google.android.gms.measurement.internal.zzag r3 = new com.google.android.gms.measurement.internal.zzag     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_e"
            com.google.android.gms.measurement.internal.zzad r9 = new com.google.android.gms.measurement.internal.zzad     // Catch:{ all -> 0x0449 }
            r9.<init>(r0)     // Catch:{ all -> 0x0449 }
            java.lang.String r10 = "auto"
            r7 = r3
            r11 = r5
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x0449 }
        L_0x041c:
            r1.mo15530a(r3, r2)     // Catch:{ all -> 0x0449 }
            goto L_0x043a
        L_0x0420:
            boolean r0 = r2.f17272i     // Catch:{ all -> 0x0449 }
            if (r0 == 0) goto L_0x043a
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x0449 }
            r0.<init>()     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.zzag r3 = new com.google.android.gms.measurement.internal.zzag     // Catch:{ all -> 0x0449 }
            java.lang.String r8 = "_cd"
            com.google.android.gms.measurement.internal.zzad r9 = new com.google.android.gms.measurement.internal.zzad     // Catch:{ all -> 0x0449 }
            r9.<init>(r0)     // Catch:{ all -> 0x0449 }
            java.lang.String r10 = "auto"
            r7 = r3
            r11 = r5
            r7.<init>(r8, r9, r10, r11)     // Catch:{ all -> 0x0449 }
            goto L_0x041c
        L_0x043a:
            com.google.android.gms.measurement.internal.ev r0 = r18.mo15546d()     // Catch:{ all -> 0x0449 }
            r0.mo15802w()     // Catch:{ all -> 0x0449 }
            com.google.android.gms.measurement.internal.ev r0 = r18.mo15546d()
            r0.mo15803x()
            return
        L_0x0449:
            r0 = move-exception
            com.google.android.gms.measurement.internal.ev r2 = r18.mo15546d()
            r2.mo15803x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4726eb.mo15545c(com.google.android.gms.measurement.internal.zzk):void");
    }

    /* renamed from: d */
    public final C4747ev mo15546d() {
        m23432b((C4725ea) this.f17010d);
        return this.f17010d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final String mo15547d(zzk zzk) {
        try {
            return (String) this.f17016j.mo15252q().mo15313a((Callable<V>) new C4731ef<V>(this, zzk)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.f17016j.mo15253r().mo15852u_().mo15860a("Failed to get app instance id. appId", C4767r.m23924a(zzk.f17264a), e);
            return null;
        }
    }

    /* renamed from: e */
    public final C4741ep mo15548e() {
        m23432b((C4725ea) this.f17013g);
        return this.f17013g;
    }

    /* renamed from: f */
    public final C4682cl mo15549f() {
        m23432b((C4725ea) this.f17015i);
        return this.f17015i;
    }

    /* renamed from: g */
    public final C4733eh mo15550g() {
        m23432b((C4725ea) this.f17014h);
        return this.f17014h;
    }

    /* renamed from: h */
    public final C4765p mo15551h() {
        return this.f17016j.mo15344k();
    }

    /* renamed from: i */
    public final C4736ek mo15552i() {
        return this.f17016j.mo15343j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final void mo15553j() {
        if (!this.f17017k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:77|78) */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r1.f17016j.mo15253r().mo15852u_().mo15860a("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.C4767r.m23924a(r5), r6);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0282 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15554k() {
        /*
            r17 = this;
            r1 = r17
            r17.m23438w()
            r17.mo15553j()
            r0 = 1
            r1.f17026t = r0
            r2 = 0
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x02bc }
            r3.mo15256u()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.cs r3 = r3.mo15352x()     // Catch:{ all -> 0x02bc }
            java.lang.Boolean r3 = r3.mo15455B()     // Catch:{ all -> 0x02bc }
            if (r3 != 0) goto L_0x0032
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15849i()     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "Upload data called on the client side before use of service was decided"
        L_0x0029:
            r0.mo15858a(r3)     // Catch:{ all -> 0x02bc }
        L_0x002c:
            r1.f17026t = r2
            r17.m23414A()
            return
        L_0x0032:
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x02bc }
            if (r3 == 0) goto L_0x0045
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "Upload called in the client side when service should be used"
            goto L_0x0029
        L_0x0045:
            long r3 = r1.f17020n     // Catch:{ all -> 0x02bc }
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0051
        L_0x004d:
            r17.m23441z()     // Catch:{ all -> 0x02bc }
            goto L_0x002c
        L_0x0051:
            r17.m23438w()     // Catch:{ all -> 0x02bc }
            java.util.List<java.lang.Long> r3 = r1.f17029w     // Catch:{ all -> 0x02bc }
            if (r3 == 0) goto L_0x005a
            r3 = 1
            goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 == 0) goto L_0x006a
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "Uploading requested multiple times"
            goto L_0x0029
        L_0x006a:
            com.google.android.gms.measurement.internal.v r3 = r17.mo15544c()     // Catch:{ all -> 0x02bc }
            boolean r3 = r3.mo15863f()     // Catch:{ all -> 0x02bc }
            if (r3 != 0) goto L_0x0084
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15855x()     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "Network not connected, ignoring upload request"
            r0.mo15858a(r3)     // Catch:{ all -> 0x02bc }
            goto L_0x004d
        L_0x0084:
            com.google.android.gms.measurement.internal.av r3 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.common.util.e r3 = r3.mo15248m()     // Catch:{ all -> 0x02bc }
            long r3 = r3.mo11326a()     // Catch:{ all -> 0x02bc }
            long r7 = com.google.android.gms.measurement.internal.C4744es.m23661k()     // Catch:{ all -> 0x02bc }
            r9 = 0
            long r7 = r3 - r7
            r9 = 0
            r1.m23427a(r9, r7)     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.av r7 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.ad r7 = r7.mo15336c()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.ag r7 = r7.f16647c     // Catch:{ all -> 0x02bc }
            long r7 = r7.mo15283a()     // Catch:{ all -> 0x02bc }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00c3
            com.google.android.gms.measurement.internal.av r5 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.r r5 = r5.mo15253r()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.t r5 = r5.mo15854w()     // Catch:{ all -> 0x02bc }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            r10 = 0
            long r7 = r3 - r7
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x02bc }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02bc }
            r5.mo15859a(r6, r7)     // Catch:{ all -> 0x02bc }
        L_0x00c3:
            com.google.android.gms.measurement.internal.ev r5 = r17.mo15546d()     // Catch:{ all -> 0x02bc }
            java.lang.String r5 = r5.mo15805z()     // Catch:{ all -> 0x02bc }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x02bc }
            r7 = -1
            if (r6 != 0) goto L_0x0297
            long r10 = r1.f17031y     // Catch:{ all -> 0x02bc }
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00e3
            com.google.android.gms.measurement.internal.ev r6 = r17.mo15546d()     // Catch:{ all -> 0x02bc }
            long r6 = r6.mo15769G()     // Catch:{ all -> 0x02bc }
            r1.f17031y = r6     // Catch:{ all -> 0x02bc }
        L_0x00e3:
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.es r6 = r6.mo15335b()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.C4756h.f17178o     // Catch:{ all -> 0x02bc }
            int r6 = r6.mo15735b(r5, r7)     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.av r7 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.es r7 = r7.mo15335b()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.h$a<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.C4756h.f17179p     // Catch:{ all -> 0x02bc }
            int r7 = r7.mo15735b(r5, r8)     // Catch:{ all -> 0x02bc }
            int r7 = java.lang.Math.max(r2, r7)     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.ev r8 = r17.mo15546d()     // Catch:{ all -> 0x02bc }
            java.util.List r6 = r8.mo15776a(r5, r6, r7)     // Catch:{ all -> 0x02bc }
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x02bc }
            if (r7 != 0) goto L_0x002c
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x02bc }
        L_0x0111:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x02bc }
            if (r8 == 0) goto L_0x012c
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x02bc }
            android.util.Pair r8 = (android.util.Pair) r8     // Catch:{ all -> 0x02bc }
            java.lang.Object r8 = r8.first     // Catch:{ all -> 0x02bc }
            com.google.android.gms.internal.measurement.cw r8 = (com.google.android.gms.internal.measurement.C4311cw) r8     // Catch:{ all -> 0x02bc }
            java.lang.String r10 = r8.f15970s     // Catch:{ all -> 0x02bc }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02bc }
            if (r10 != 0) goto L_0x0111
            java.lang.String r7 = r8.f15970s     // Catch:{ all -> 0x02bc }
            goto L_0x012d
        L_0x012c:
            r7 = r9
        L_0x012d:
            if (r7 == 0) goto L_0x0158
            r8 = 0
        L_0x0130:
            int r10 = r6.size()     // Catch:{ all -> 0x02bc }
            if (r8 >= r10) goto L_0x0158
            java.lang.Object r10 = r6.get(r8)     // Catch:{ all -> 0x02bc }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x02bc }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x02bc }
            com.google.android.gms.internal.measurement.cw r10 = (com.google.android.gms.internal.measurement.C4311cw) r10     // Catch:{ all -> 0x02bc }
            java.lang.String r11 = r10.f15970s     // Catch:{ all -> 0x02bc }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x02bc }
            if (r11 != 0) goto L_0x0155
            java.lang.String r10 = r10.f15970s     // Catch:{ all -> 0x02bc }
            boolean r10 = r10.equals(r7)     // Catch:{ all -> 0x02bc }
            if (r10 != 0) goto L_0x0155
            java.util.List r6 = r6.subList(r2, r8)     // Catch:{ all -> 0x02bc }
            goto L_0x0158
        L_0x0155:
            int r8 = r8 + 1
            goto L_0x0130
        L_0x0158:
            com.google.android.gms.internal.measurement.cv r7 = new com.google.android.gms.internal.measurement.cv     // Catch:{ all -> 0x02bc }
            r7.<init>()     // Catch:{ all -> 0x02bc }
            int r8 = r6.size()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.internal.measurement.cw[] r8 = new com.google.android.gms.internal.measurement.C4311cw[r8]     // Catch:{ all -> 0x02bc }
            r7.f15935a = r8     // Catch:{ all -> 0x02bc }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x02bc }
            int r10 = r6.size()     // Catch:{ all -> 0x02bc }
            r8.<init>(r10)     // Catch:{ all -> 0x02bc }
            boolean r10 = com.google.android.gms.measurement.internal.C4744es.m23662w()     // Catch:{ all -> 0x02bc }
            if (r10 == 0) goto L_0x0182
            com.google.android.gms.measurement.internal.av r10 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.es r10 = r10.mo15335b()     // Catch:{ all -> 0x02bc }
            boolean r10 = r10.mo15737c(r5)     // Catch:{ all -> 0x02bc }
            if (r10 == 0) goto L_0x0182
            r10 = 1
            goto L_0x0183
        L_0x0182:
            r10 = 0
        L_0x0183:
            r11 = 0
        L_0x0184:
            com.google.android.gms.internal.measurement.cw[] r12 = r7.f15935a     // Catch:{ all -> 0x02bc }
            int r12 = r12.length     // Catch:{ all -> 0x02bc }
            if (r11 >= r12) goto L_0x01dc
            com.google.android.gms.internal.measurement.cw[] r12 = r7.f15935a     // Catch:{ all -> 0x02bc }
            java.lang.Object r13 = r6.get(r11)     // Catch:{ all -> 0x02bc }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ all -> 0x02bc }
            java.lang.Object r13 = r13.first     // Catch:{ all -> 0x02bc }
            com.google.android.gms.internal.measurement.cw r13 = (com.google.android.gms.internal.measurement.C4311cw) r13     // Catch:{ all -> 0x02bc }
            r12[r11] = r13     // Catch:{ all -> 0x02bc }
            java.lang.Object r12 = r6.get(r11)     // Catch:{ all -> 0x02bc }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x02bc }
            java.lang.Object r12 = r12.second     // Catch:{ all -> 0x02bc }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x02bc }
            r8.add(r12)     // Catch:{ all -> 0x02bc }
            com.google.android.gms.internal.measurement.cw[] r12 = r7.f15935a     // Catch:{ all -> 0x02bc }
            r12 = r12[r11]     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.av r13 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.es r13 = r13.mo15335b()     // Catch:{ all -> 0x02bc }
            long r13 = r13.mo15742f()     // Catch:{ all -> 0x02bc }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x02bc }
            r12.f15969r = r13     // Catch:{ all -> 0x02bc }
            com.google.android.gms.internal.measurement.cw[] r12 = r7.f15935a     // Catch:{ all -> 0x02bc }
            r12 = r12[r11]     // Catch:{ all -> 0x02bc }
            java.lang.Long r13 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x02bc }
            r12.f15955d = r13     // Catch:{ all -> 0x02bc }
            com.google.android.gms.internal.measurement.cw[] r12 = r7.f15935a     // Catch:{ all -> 0x02bc }
            r12 = r12[r11]     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.av r13 = r1.f17016j     // Catch:{ all -> 0x02bc }
            r13.mo15256u()     // Catch:{ all -> 0x02bc }
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x02bc }
            r12.f15977z = r13     // Catch:{ all -> 0x02bc }
            if (r10 != 0) goto L_0x01d9
            com.google.android.gms.internal.measurement.cw[] r12 = r7.f15935a     // Catch:{ all -> 0x02bc }
            r12 = r12[r11]     // Catch:{ all -> 0x02bc }
            r12.f15943G = r9     // Catch:{ all -> 0x02bc }
        L_0x01d9:
            int r11 = r11 + 1
            goto L_0x0184
        L_0x01dc:
            com.google.android.gms.measurement.internal.av r6 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.r r6 = r6.mo15253r()     // Catch:{ all -> 0x02bc }
            r10 = 2
            boolean r6 = r6.mo15846a(r10)     // Catch:{ all -> 0x02bc }
            if (r6 == 0) goto L_0x01f1
            com.google.android.gms.measurement.internal.eh r6 = r17.mo15550g()     // Catch:{ all -> 0x02bc }
            java.lang.String r9 = r6.mo15572b(r7)     // Catch:{ all -> 0x02bc }
        L_0x01f1:
            com.google.android.gms.measurement.internal.eh r6 = r17.mo15550g()     // Catch:{ all -> 0x02bc }
            byte[] r14 = r6.mo15570a(r7)     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.h$a<java.lang.String> r6 = com.google.android.gms.measurement.internal.C4756h.f17188y     // Catch:{ all -> 0x02bc }
            java.lang.Object r6 = r6.mo15821b()     // Catch:{ all -> 0x02bc }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x02bc }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0282 }
            r13.<init>(r6)     // Catch:{ MalformedURLException -> 0x0282 }
            boolean r10 = r8.isEmpty()     // Catch:{ MalformedURLException -> 0x0282 }
            r10 = r10 ^ r0
            com.google.android.gms.common.internal.C3266s.m14923b(r10)     // Catch:{ MalformedURLException -> 0x0282 }
            java.util.List<java.lang.Long> r10 = r1.f17029w     // Catch:{ MalformedURLException -> 0x0282 }
            if (r10 == 0) goto L_0x0222
            com.google.android.gms.measurement.internal.av r8 = r1.f17016j     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.r r8 = r8.mo15253r()     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.t r8 = r8.mo15852u_()     // Catch:{ MalformedURLException -> 0x0282 }
            java.lang.String r10 = "Set uploading progress before finishing the previous upload"
            r8.mo15858a(r10)     // Catch:{ MalformedURLException -> 0x0282 }
            goto L_0x0229
        L_0x0222:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0282 }
            r10.<init>(r8)     // Catch:{ MalformedURLException -> 0x0282 }
            r1.f17029w = r10     // Catch:{ MalformedURLException -> 0x0282 }
        L_0x0229:
            com.google.android.gms.measurement.internal.av r8 = r1.f17016j     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.ad r8 = r8.mo15336c()     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.ag r8 = r8.f16648d     // Catch:{ MalformedURLException -> 0x0282 }
            r8.mo15284a(r3)     // Catch:{ MalformedURLException -> 0x0282 }
            java.lang.String r3 = "?"
            com.google.android.gms.internal.measurement.cw[] r4 = r7.f15935a     // Catch:{ MalformedURLException -> 0x0282 }
            int r4 = r4.length     // Catch:{ MalformedURLException -> 0x0282 }
            if (r4 <= 0) goto L_0x0241
            com.google.android.gms.internal.measurement.cw[] r3 = r7.f15935a     // Catch:{ MalformedURLException -> 0x0282 }
            r3 = r3[r2]     // Catch:{ MalformedURLException -> 0x0282 }
            java.lang.String r3 = r3.f15966o     // Catch:{ MalformedURLException -> 0x0282 }
        L_0x0241:
            com.google.android.gms.measurement.internal.av r4 = r1.f17016j     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo15253r()     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.t r4 = r4.mo15855x()     // Catch:{ MalformedURLException -> 0x0282 }
            java.lang.String r7 = "Uploading data. app, uncompressed size, data"
            int r8 = r14.length     // Catch:{ MalformedURLException -> 0x0282 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ MalformedURLException -> 0x0282 }
            r4.mo15861a(r7, r3, r8, r9)     // Catch:{ MalformedURLException -> 0x0282 }
            r1.f17025s = r0     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.v r11 = r17.mo15544c()     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.ed r0 = new com.google.android.gms.measurement.internal.ed     // Catch:{ MalformedURLException -> 0x0282 }
            r0.<init>(r1, r5)     // Catch:{ MalformedURLException -> 0x0282 }
            r11.mo15239d()     // Catch:{ MalformedURLException -> 0x0282 }
            r11.mo15525k()     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.common.internal.C3266s.m14913a(r13)     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.common.internal.C3266s.m14913a(r14)     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.common.internal.C3266s.m14913a(r0)     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.ar r3 = r11.mo15252q()     // Catch:{ MalformedURLException -> 0x0282 }
            com.google.android.gms.measurement.internal.aa r4 = new com.google.android.gms.measurement.internal.aa     // Catch:{ MalformedURLException -> 0x0282 }
            r15 = 0
            r10 = r4
            r12 = r5
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x0282 }
            r3.mo15316b(r4)     // Catch:{ MalformedURLException -> 0x0282 }
            goto L_0x002c
        L_0x0282:
            com.google.android.gms.measurement.internal.av r0 = r1.f17016j     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x02bc }
            java.lang.String r3 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4767r.m23924a(r5)     // Catch:{ all -> 0x02bc }
            r0.mo15860a(r3, r4, r6)     // Catch:{ all -> 0x02bc }
            goto L_0x002c
        L_0x0297:
            r1.f17031y = r7     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.ev r0 = r17.mo15546d()     // Catch:{ all -> 0x02bc }
            long r5 = com.google.android.gms.measurement.internal.C4744es.m23661k()     // Catch:{ all -> 0x02bc }
            r7 = 0
            long r3 = r3 - r5
            java.lang.String r0 = r0.mo15774a(r3)     // Catch:{ all -> 0x02bc }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02bc }
            if (r3 != 0) goto L_0x002c
            com.google.android.gms.measurement.internal.ev r3 = r17.mo15546d()     // Catch:{ all -> 0x02bc }
            com.google.android.gms.measurement.internal.em r0 = r3.mo15788b(r0)     // Catch:{ all -> 0x02bc }
            if (r0 == 0) goto L_0x002c
            r1.m23424a(r0)     // Catch:{ all -> 0x02bc }
            goto L_0x002c
        L_0x02bc:
            r0 = move-exception
            r1.f17026t = r2
            r17.m23414A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4726eb.mo15554k():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo15555l() {
        C4769t u_;
        String str;
        m23438w();
        mo15553j();
        if (!this.f17019m) {
            this.f17019m = true;
            m23438w();
            mo15553j();
            if ((this.f17016j.mo15335b().mo15734a(C4756h.f17156ar) || m23416C()) && m23415B()) {
                int a = m23417a(this.f17028v);
                int A = this.f17016j.mo15354z().mo15822A();
                m23438w();
                if (a > A) {
                    u_ = this.f17016j.mo15253r().mo15852u_();
                    str = "Panic: can't downgrade version. Previous, current version";
                } else if (a < A) {
                    if (m23425a(A, this.f17028v)) {
                        u_ = this.f17016j.mo15253r().mo15855x();
                        str = "Storage version upgraded. Previous, current version";
                    } else {
                        u_ = this.f17016j.mo15253r().mo15852u_();
                        str = "Storage version upgrade failed. Previous, current version";
                    }
                }
                u_.mo15860a(str, Integer.valueOf(a), Integer.valueOf(A));
            }
        }
        if (!this.f17018l && !this.f17016j.mo15335b().mo15734a(C4756h.f17156ar)) {
            this.f17016j.mo15253r().mo15853v().mo15858a("This instance being marked as an uploader");
            this.f17018l = true;
            m23441z();
        }
    }

    /* renamed from: m */
    public final C3300e mo15248m() {
        return this.f17016j.mo15248m();
    }

    /* renamed from: n */
    public final Context mo15249n() {
        return this.f17016j.mo15249n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final void mo15556o() {
        this.f17023q++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final C4638av mo15557p() {
        return this.f17016j;
    }

    /* renamed from: q */
    public final C4634ar mo15252q() {
        return this.f17016j.mo15252q();
    }

    /* renamed from: r */
    public final C4767r mo15253r() {
        return this.f17016j.mo15253r();
    }

    /* renamed from: u */
    public final C4742eq mo15256u() {
        return this.f17016j.mo15256u();
    }
}
