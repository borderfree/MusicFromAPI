package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C4791a;
import com.google.android.gms.tasks.C4796f;
import com.google.android.gms.tasks.C4797g;
import com.google.android.gms.tasks.C4800i;
import com.google.firebase.C4890b;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.slf4j.Marker;

/* renamed from: com.google.firebase.iid.ar */
final class C4940ar implements C4949b {

    /* renamed from: a */
    private final C4890b f17736a;

    /* renamed from: b */
    private final C4962o f17737b;

    /* renamed from: c */
    private final C4968u f17738c;

    /* renamed from: d */
    private final Executor f17739d;

    C4940ar(C4890b bVar, C4962o oVar, Executor executor) {
        this(bVar, oVar, executor, new C4968u(bVar.mo16095a(), oVar));
    }

    private C4940ar(C4890b bVar, C4962o oVar, Executor executor, C4968u uVar) {
        this.f17736a = bVar;
        this.f17737b = oVar;
        this.f17738c = uVar;
        this.f17739d = executor;
    }

    /* renamed from: a */
    private final <T> C4796f<Void> m24566a(C4796f<T> fVar) {
        return fVar.mo15917a(C4932aj.m24560a(), (C4791a<TResult, TContinuationResult>) new C4942at<TResult,TContinuationResult>(this));
    }

    /* renamed from: a */
    private final C4796f<Bundle> m24567a(String str, String str2, String str3, Bundle bundle) {
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        bundle.putString("gmp_app_id", this.f17736a.mo16098c().mo16108a());
        bundle.putString("gmsv", Integer.toString(this.f17737b.mo16239d()));
        bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
        bundle.putString("app_ver", this.f17737b.mo16237b());
        bundle.putString("app_ver_name", this.f17737b.mo16238c());
        bundle.putString("cliv", "fiid-12451000");
        C4797g gVar = new C4797g();
        this.f17739d.execute(new C4941as(this, bundle, gVar));
        return gVar.mo15929a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static String m24568a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: b */
    private final C4796f<String> m24570b(C4796f<Bundle> fVar) {
        return fVar.mo15917a(this.f17739d, (C4791a<TResult, TContinuationResult>) new C4943au<TResult,TContinuationResult>(this));
    }

    /* renamed from: a */
    public final C4796f<Void> mo16200a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("iid-operation", "delete");
        bundle.putString("delete", "1");
        return m24566a(m24570b(m24567a(str, Marker.ANY_MARKER, Marker.ANY_MARKER, bundle)));
    }

    /* renamed from: a */
    public final C4796f<Void> mo16201a(String str, String str2) {
        return C4800i.m24062a(null);
    }

    /* renamed from: a */
    public final C4796f<Void> mo16202a(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m24566a(m24570b(m24567a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: a */
    public final C4796f<String> mo16203a(String str, String str2, String str3, String str4) {
        return m24570b(m24567a(str, str3, str4, new Bundle()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo16204a(Bundle bundle, C4797g gVar) {
        try {
            gVar.mo15931a(this.f17738c.mo16242a(bundle));
        } catch (IOException e) {
            gVar.mo15930a((Exception) e);
        }
    }

    /* renamed from: a */
    public final boolean mo16205a() {
        return true;
    }

    /* renamed from: b */
    public final C4796f<Void> mo16206b(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        String str4 = "gcm.topic";
        String valueOf = String.valueOf("/topics/");
        String valueOf2 = String.valueOf(str3);
        bundle.putString(str4, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        bundle.putString("delete", "1");
        String valueOf3 = String.valueOf("/topics/");
        String valueOf4 = String.valueOf(str3);
        return m24566a(m24570b(m24567a(str, str2, valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3), bundle)));
    }

    /* renamed from: b */
    public final boolean mo16207b() {
        return this.f17737b.mo16236a() != 0;
    }
}
