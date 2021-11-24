package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.z */
final class C4973z implements Runnable {

    /* renamed from: a */
    private final long f17804a;

    /* renamed from: b */
    private final WakeLock f17805b = ((PowerManager) mo16254a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: c */
    private final FirebaseInstanceId f17806c;

    /* renamed from: d */
    private final C4962o f17807d;

    /* renamed from: e */
    private final C4925ac f17808e;

    C4973z(FirebaseInstanceId firebaseInstanceId, C4962o oVar, C4925ac acVar, long j) {
        this.f17806c = firebaseInstanceId;
        this.f17807d = oVar;
        this.f17808e = acVar;
        this.f17804a = j;
        this.f17805b.setReferenceCounted(false);
    }

    /* renamed from: c */
    private final boolean m24682c() {
        try {
            if (!this.f17806c.mo16168k()) {
                this.f17806c.mo16169l();
            }
            return true;
        } catch (IOException e) {
            String str = "FirebaseInstanceId";
            String str2 = "Build channel failed: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m24683d() {
        C4972y f = this.f17806c.mo16164f();
        if (f != null && !f.mo16253b(this.f17807d.mo16237b())) {
            return true;
        }
        try {
            String g = this.f17806c.mo16165g();
            if (g == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if (f == null || (f != null && !g.equals(f.f17801a))) {
                Context a = mo16254a();
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", g);
                C4970w.m24664b(a, intent);
                C4970w.m24662a(a, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
            }
            return true;
        } catch (IOException | SecurityException e) {
            String str = "FirebaseInstanceId";
            String str2 = "Token retrieval failed: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Context mo16254a() {
        return this.f17806c.mo16158b().mo16095a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo16255b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo16254a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void run() {
        FirebaseInstanceId firebaseInstanceId;
        this.f17805b.acquire();
        try {
            this.f17806c.mo16157a(true);
            if (!this.f17806c.mo16167j()) {
                firebaseInstanceId = this.f17806c;
            } else {
                if (!mo16255b()) {
                    new C4923aa(this).mo16179a();
                } else if (!m24682c() || !m24683d() || !this.f17808e.mo16185a(this.f17806c)) {
                    this.f17806c.mo16153a(this.f17804a);
                } else {
                    firebaseInstanceId = this.f17806c;
                }
            }
            firebaseInstanceId.mo16157a(false);
        } finally {
            this.f17805b.release();
        }
    }
}
