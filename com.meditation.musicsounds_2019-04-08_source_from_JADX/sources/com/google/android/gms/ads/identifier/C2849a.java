package com.google.android.gms.ads.identifier;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.identifier.a */
final class C2849a extends Thread {

    /* renamed from: a */
    private final /* synthetic */ Map f9922a;

    C2849a(AdvertisingIdClient advertisingIdClient, Map map) {
        this.f9922a = map;
    }

    public final void run() {
        String str;
        String message;
        StringBuilder sb;
        String str2;
        HttpURLConnection httpURLConnection;
        new zzc();
        Map map = this.f9922a;
        Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        for (String str3 : map.keySet()) {
            buildUpon.appendQueryParameter(str3, (String) map.get(str3));
        }
        String uri = buildUpon.build().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 65);
                sb2.append("Received non-success response code ");
                sb2.append(responseCode);
                sb2.append(" from pinging URL: ");
                sb2.append(uri);
                Log.w("HttpUrlPinger", sb2.toString());
            }
            httpURLConnection.disconnect();
        } catch (IndexOutOfBoundsException e) {
            str = "HttpUrlPinger";
            message = e.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 32 + String.valueOf(message).length());
            str2 = "Error while parsing ping URL: ";
            r1 = e;
            sb.append(str2);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            Log.w(str, sb.toString(), r1);
        } catch (IOException | RuntimeException e2) {
            str = "HttpUrlPinger";
            message = e2.getMessage();
            sb = new StringBuilder(String.valueOf(uri).length() + 27 + String.valueOf(message).length());
            str2 = "Error while pinging URL: ";
            r1 = e2;
            sb.append(str2);
            sb.append(uri);
            sb.append(". ");
            sb.append(message);
            Log.w(str, sb.toString(), r1);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
