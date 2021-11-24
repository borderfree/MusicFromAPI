package com.facebook.devicerequests.p098a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.C2189f;
import com.facebook.internal.C2232n;
import com.facebook.internal.SmartLoginOption;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C5032b;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C5039b;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.devicerequests.a.a */
public class C2186a {

    /* renamed from: a */
    private static HashMap<String, RegistrationListener> f7100a = new HashMap<>();

    /* renamed from: a */
    public static String m10071a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static boolean m10072a(String str) {
        if (m10074b()) {
            return m10076d(str);
        }
        return false;
    }

    /* renamed from: b */
    public static Bitmap m10073b(String str) {
        EnumMap enumMap = new EnumMap(EncodeHintType.class);
        enumMap.put(EncodeHintType.MARGIN, Integer.valueOf(2));
        try {
            C5039b a = new C5032b().mo16368a(str, BarcodeFormat.QR_CODE, 200, 200, enumMap);
            int c = a.mo16432c();
            int b = a.mo16430b();
            int[] iArr = new int[(c * b)];
            for (int i = 0; i < c; i++) {
                int i2 = i * b;
                for (int i3 = 0; i3 < b; i3++) {
                    iArr[i2 + i3] = a.mo16429a(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(b, c, Config.ARGB_8888);
            try {
                createBitmap.setPixels(iArr, 0, b, 0, 0, b, c);
                return createBitmap;
            } catch (WriterException unused) {
                return createBitmap;
            }
        } catch (WriterException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m10074b() {
        return VERSION.SDK_INT >= 16 && C2232n.m10235a(C2189f.m10096j()).mo7851e().contains(SmartLoginOption.Enabled);
    }

    /* renamed from: c */
    public static void m10075c(String str) {
        m10077e(str);
    }

    @TargetApi(16)
    /* renamed from: d */
    private static boolean m10076d(final String str) {
        if (f7100a.containsKey(str)) {
            return true;
        }
        final String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{"android", C2189f.m10094h().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(format);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) C2189f.m10092f().getSystemService("servicediscovery");
        C21871 r4 = new RegistrationListener() {
            public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
                C2186a.m10075c(str);
            }

            public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
                if (!format.equals(nsdServiceInfo.getServiceName())) {
                    C2186a.m10075c(str);
                }
            }

            public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            }

            public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            }
        };
        f7100a.put(str, r4);
        nsdManager.registerService(nsdServiceInfo, 1, r4);
        return true;
    }

    @TargetApi(16)
    /* renamed from: e */
    private static void m10077e(String str) {
        RegistrationListener registrationListener = (RegistrationListener) f7100a.get(str);
        if (registrationListener != null) {
            ((NsdManager) C2189f.m10092f().getSystemService("servicediscovery")).unregisterService(registrationListener);
            f7100a.remove(str);
        }
    }
}
