package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.C3044e;
import com.google.android.gms.common.api.C3046f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3150m;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p121b.C3172a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
public final class C2984e implements Runnable {

    /* renamed from: a */
    private static final C3172a f10513a = new C3172a("RevokeAccessOperation", new String[0]);

    /* renamed from: b */
    private final String f10514b;

    /* renamed from: c */
    private final C3150m f10515c = new C3150m(null);

    private C2984e(String str) {
        C3266s.m14915a(str);
        this.f10514b = str;
    }

    /* renamed from: a */
    public static C3044e<Status> m13918a(String str) {
        if (str == null) {
            return C3046f.m14077a(new Status(4), null);
        }
        C2984e eVar = new C2984e(str);
        new Thread(eVar).start();
        return eVar.f10515c;
    }

    public final void run() {
        C3172a aVar;
        String str;
        String str2;
        String str3;
        Status status = Status.f10572c;
        try {
            String valueOf = String.valueOf("https://accounts.google.com/o/oauth2/revoke?token=");
            String valueOf2 = String.valueOf(this.f10514b);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f10570a;
            } else {
                f10513a.mo11101d("Unable to revoke access!", new Object[0]);
            }
            C3172a aVar2 = f10513a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            aVar2.mo11097a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            aVar = f10513a;
            str2 = "IOException when revoking access: ";
            str3 = String.valueOf(e.toString());
            if (str3.length() == 0) {
                str = new String(str2);
                aVar.mo11101d(str, new Object[0]);
                this.f10515c.mo10876b(status);
            }
            str = str2.concat(str3);
            aVar.mo11101d(str, new Object[0]);
            this.f10515c.mo10876b(status);
        } catch (Exception e2) {
            aVar = f10513a;
            str2 = "Exception when revoking access: ";
            str3 = String.valueOf(e2.toString());
            if (str3.length() == 0) {
                str = new String(str2);
                aVar.mo11101d(str, new Object[0]);
                this.f10515c.mo10876b(status);
            }
            str = str2.concat(str3);
            aVar.mo11101d(str, new Object[0]);
            this.f10515c.mo10876b(status);
        }
        this.f10515c.mo10876b(status);
    }
}
