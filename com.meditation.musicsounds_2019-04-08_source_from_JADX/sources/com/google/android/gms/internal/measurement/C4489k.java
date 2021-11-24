package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.k */
public final class C4489k extends C4497s {

    /* renamed from: a */
    private static boolean f16346a;

    /* renamed from: b */
    private Info f16347b;

    /* renamed from: c */
    private final C4285bx f16348c;

    /* renamed from: d */
    private String f16349d;

    /* renamed from: e */
    private boolean f16350e = false;

    /* renamed from: f */
    private final Object f16351f = new Object();

    C4489k(C4499u uVar) {
        super(uVar);
        this.f16348c = new C4285bx(uVar.mo14844c());
    }

    /* renamed from: a */
    private static String m22285a(String str) {
        MessageDigest b = C4286by.m21138b("MD5");
        if (b == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, b.digest(str.getBytes()))});
    }

    /* renamed from: a */
    private final boolean m22286a(Info info, Info info2) {
        String str = null;
        CharSequence id = info2 == null ? null : info2.getId();
        if (TextUtils.isEmpty(id)) {
            return true;
        }
        String b = mo14835r().mo14136b();
        synchronized (this.f16351f) {
            if (!this.f16350e) {
                this.f16349d = m22289f();
                this.f16350e = true;
            } else if (TextUtils.isEmpty(this.f16349d)) {
                if (info != null) {
                    str = info.getId();
                }
                if (str == null) {
                    String valueOf = String.valueOf(id);
                    String valueOf2 = String.valueOf(b);
                    boolean g = m22290g(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                    return g;
                }
                String valueOf3 = String.valueOf(str);
                String valueOf4 = String.valueOf(b);
                this.f16349d = m22285a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            }
            String valueOf5 = String.valueOf(id);
            String valueOf6 = String.valueOf(b);
            String a = m22285a(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5));
            if (TextUtils.isEmpty(a)) {
                return false;
            }
            if (a.equals(this.f16349d)) {
                return true;
            }
            if (!TextUtils.isEmpty(this.f16349d)) {
                mo14811b("Resetting the client id because Advertising Id changed.");
                b = mo14835r().mo14137c();
                mo14808a("New client Id", b);
            }
            String valueOf7 = String.valueOf(id);
            String valueOf8 = String.valueOf(b);
            boolean g2 = m22290g(valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7));
            return g2;
        }
    }

    /* renamed from: d */
    private final synchronized Info m22287d() {
        if (this.f16348c.mo14210a(1000)) {
            this.f16348c.mo14209a();
            Info e = m22288e();
            if (!m22286a(this.f16347b, e)) {
                mo14823f("Failed to reset client id on adid change. Not using adid");
                e = new Info("", false);
            }
            this.f16347b = e;
        }
        return this.f16347b;
    }

    /* renamed from: e */
    private final Info m22288e() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(mo14826i());
        } catch (IllegalStateException unused) {
            mo14821e("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
            return null;
        } catch (Exception e) {
            if (!f16346a) {
                f16346a = true;
                mo14819d("Error getting advertiser id", e);
            }
            return null;
        }
    }

    /* renamed from: f */
    private final String m22289f() {
        String str = null;
        try {
            FileInputStream openFileInput = mo14826i().openFileInput("gaClientIdData");
            byte[] bArr = new byte[128];
            int read = openFileInput.read(bArr, 0, 128);
            if (openFileInput.available() > 0) {
                mo14821e("Hash file seems corrupted, deleting it.");
                openFileInput.close();
                mo14826i().deleteFile("gaClientIdData");
                return null;
            } else if (read <= 0) {
                mo14811b("Hash file is empty.");
                openFileInput.close();
                return null;
            } else {
                String str2 = new String(bArr, 0, read);
                try {
                    openFileInput.close();
                } catch (FileNotFoundException unused) {
                } catch (IOException e) {
                    e = e;
                    str = str2;
                    mo14819d("Error reading Hash file, deleting it", e);
                    mo14826i().deleteFile("gaClientIdData");
                    return str;
                }
                return str2;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        } catch (IOException e2) {
            e = e2;
            mo14819d("Error reading Hash file, deleting it", e);
            mo14826i().deleteFile("gaClientIdData");
            return str;
        }
    }

    /* renamed from: g */
    private final boolean m22290g(String str) {
        try {
            String a = m22285a(str);
            mo14811b("Storing hashed adid.");
            FileOutputStream openFileOutput = mo14826i().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(a.getBytes());
            openFileOutput.close();
            this.f16349d = a;
            return true;
        } catch (IOException e) {
            mo14822e("Error creating hash file", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10611a() {
    }

    /* renamed from: b */
    public final boolean mo14791b() {
        mo14840x();
        Info d = m22287d();
        return d != null && !d.isLimitAdTrackingEnabled();
    }

    /* renamed from: c */
    public final String mo14792c() {
        mo14840x();
        Info d = m22287d();
        String id = d != null ? d.getId() : null;
        if (TextUtils.isEmpty(id)) {
            return null;
        }
        return id;
    }
}
