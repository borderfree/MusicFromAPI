package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.mf */
public final class C3732mf implements C3722lw {

    /* renamed from: a */
    private final String f14448a;

    public C3732mf() {
        this(null);
    }

    public C3732mf(String str) {
        this.f14448a = str;
    }

    /* renamed from: a */
    public final void mo13140a(String str) {
        String message;
        StringBuilder sb;
        String str2;
        HttpURLConnection httpURLConnection;
        String str3 = "Pinging URL: ";
        try {
            String valueOf = String.valueOf(str);
            C3731me.m19172b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            ane.m16645a();
            C3719lt.m19115a(true, httpURLConnection, this.f14448a);
            C3723lx lxVar = new C3723lx();
            lxVar.mo13240a(httpURLConnection, (byte[]) null);
            int responseCode = httpURLConnection.getResponseCode();
            lxVar.mo13239a(httpURLConnection, responseCode);
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(str);
                C3731me.m19178e(sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message).length());
            str2 = "Error while parsing ping URL: ";
            sb.append(str2);
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C3731me.m19178e(sb.toString());
        } catch (IOException e2) {
            message = e2.getMessage();
            sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            str2 = "Error while pinging URL: ";
            sb.append(str2);
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C3731me.m19178e(sb.toString());
        } catch (RuntimeException e3) {
            message = e3.getMessage();
            sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            str2 = "Error while pinging URL: ";
            sb.append(str2);
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C3731me.m19178e(sb.toString());
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
