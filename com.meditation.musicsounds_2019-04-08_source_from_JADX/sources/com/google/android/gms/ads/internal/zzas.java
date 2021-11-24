package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ars;
import com.google.android.gms.internal.ads.asy;
import com.google.android.gms.internal.ads.asz;
import com.google.android.gms.internal.ads.bbe;
import com.google.android.gms.internal.ads.bbi;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class zzas {
    /* renamed from: a */
    static zzv<C3832py> m13640a(bbe bbe, bbi bbi, zzac zzac) {
        return new C2907n(bbe, zzac, bbi);
    }

    /* renamed from: a */
    private static asy m13641a(Object obj) {
        if (obj instanceof IBinder) {
            return asz.m17237a((IBinder) obj);
        }
        return null;
    }

    /* renamed from: a */
    private static String m13642a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            C3643iy.m19178e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        String valueOf2 = String.valueOf(encodeToString);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: a */
    private static String m13643a(asy asy) {
        if (asy == null) {
            C3643iy.m19178e("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri b = asy.mo12355b();
            if (b != null) {
                return b.toString();
            }
        } catch (RemoteException unused) {
            C3643iy.m19178e("Unable to get image uri. Trying data uri next");
        }
        return m13648b(asy);
    }

    /* renamed from: a */
    private static JSONObject m13644a(Bundle bundle, String str) {
        String valueOf;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String str3 = (String) keys.next();
                if (bundle.containsKey(str3)) {
                    if ("image".equals(jSONObject2.getString(str3))) {
                        Object obj = bundle.get(str3);
                        if (obj instanceof Bitmap) {
                            valueOf = m13642a((Bitmap) obj);
                        } else {
                            str2 = "Invalid type. An image type extra should return a bitmap";
                            C3643iy.m19178e(str2);
                        }
                    } else if (bundle.get(str3) instanceof Bitmap) {
                        str2 = "Invalid asset type. Bitmap should be returned only for image type";
                        C3643iy.m19178e(str2);
                    } else {
                        valueOf = String.valueOf(bundle.get(str3));
                    }
                    jSONObject.put(str3, valueOf);
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    static final /* synthetic */ void m13645a(arq arq, String str, C3832py pyVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", arq.mo12357a());
            jSONObject.put("body", arq.mo12362c());
            jSONObject.put("call_to_action", arq.mo12365e());
            jSONObject.put("price", arq.mo12368h());
            jSONObject.put("star_rating", String.valueOf(arq.mo12366f()));
            jSONObject.put("store", arq.mo12367g());
            jSONObject.put("icon", m13643a(arq.mo12364d()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b = arq.mo12360b();
            if (b != null) {
                for (Object a : b) {
                    jSONArray.put(m13643a(m13641a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", m13644a(arq.mo12374n(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            pyVar.mo12596b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            C3643iy.m19175c("Exception occurred when loading assets", e);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m13646a(ars ars, String str, C3832py pyVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", ars.mo12381a());
            jSONObject.put("body", ars.mo12387e());
            jSONObject.put("call_to_action", ars.mo12389g());
            jSONObject.put("advertiser", ars.mo12390h());
            jSONObject.put("logo", m13643a(ars.mo12388f()));
            JSONArray jSONArray = new JSONArray();
            List<Object> b = ars.mo12360b();
            if (b != null) {
                for (Object a : b) {
                    jSONArray.put(m13643a(m13641a(a)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", m13644a(ars.mo12393n(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            pyVar.mo12596b("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            C3643iy.m19175c("Exception occurred when loading assets", e);
        }
    }

    /* renamed from: b */
    private static String m13648b(asy asy) {
        try {
            C3323b a = asy.mo12354a();
            if (a == null) {
                C3643iy.m19178e("Drawable is null. Returning empty string");
                return "";
            }
            Drawable drawable = (Drawable) C3327d.m15137a(a);
            if (drawable instanceof BitmapDrawable) {
                return m13642a(((BitmapDrawable) drawable).getBitmap());
            }
            C3643iy.m19178e("Drawable is not an instance of BitmapDrawable. Returning empty string");
            return "";
        } catch (RemoteException unused) {
            C3643iy.m19178e("Unable to get drawable. Returning empty string");
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m13649b(C3832py pyVar) {
        OnClickListener onClickListener = pyVar.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(pyVar.getView());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zza(com.google.android.gms.internal.ads.C3832py r25, com.google.android.gms.internal.ads.baj r26, java.util.concurrent.CountDownLatch r27) {
        /*
            r0 = r25
            r1 = r26
            r7 = r27
            r8 = 0
            android.view.View r2 = r25.getView()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r2 != 0) goto L_0x0014
            java.lang.String r0 = "AdWebView is null"
        L_0x000f:
            com.google.android.gms.internal.ads.C3643iy.m19178e(r0)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            goto L_0x0132
        L_0x0014:
            r3 = 4
            r2.setVisibility(r3)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bab r2 = r1.f13474b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.util.List<java.lang.String> r2 = r2.f13419r     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r2 == 0) goto L_0x0123
            boolean r3 = r2.isEmpty()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r3 == 0) goto L_0x0026
            goto L_0x0123
        L_0x0026:
            java.lang.String r3 = "/nativeExpressAssetsLoaded"
            com.google.android.gms.ads.internal.l r4 = new com.google.android.gms.ads.internal.l     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r0.mo13488a(r3, r4)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r3 = "/nativeExpressAssetsLoadingFailed"
            com.google.android.gms.ads.internal.m r4 = new com.google.android.gms.ads.internal.m     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r0.mo13488a(r3, r4)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bav r3 = r1.f13475c     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bbe r3 = r3.mo12703h()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bav r4 = r1.f13475c     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bbi r4 = r4.mo12704i()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r5 = "2"
            boolean r5 = r2.contains(r5)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r6 = 0
            if (r5 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.arq r2 = new com.google.android.gms.internal.ads.arq     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r10 = r3.mo12713a()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.util.List r11 = r3.mo12716b()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r12 = r3.mo12718c()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.asy r13 = r3.mo12720d()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r14 = r3.mo12721e()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            double r15 = r3.mo12722f()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r17 = r3.mo12723g()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r18 = r3.mo12724h()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r19 = 0
            android.os.Bundle r20 = r3.mo12728l()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r21 = 0
            com.google.android.gms.dynamic.b r4 = r3.mo12732p()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r4 == 0) goto L_0x008c
            com.google.android.gms.dynamic.b r4 = r3.mo12732p()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.Object r4 = com.google.android.gms.dynamic.C3327d.m15137a(r4)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r6 = r4
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
        L_0x008c:
            r22 = r6
            com.google.android.gms.dynamic.b r23 = r3.mo12733q()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r24 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bab r3 = r1.f13474b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r3 = r3.f13418q     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.rf r4 = r25.mo13527t()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.ads.internal.j r5 = new com.google.android.gms.ads.internal.j     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
        L_0x00a5:
            r4.mo13541a(r5)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            goto L_0x0100
        L_0x00a9:
            java.lang.String r3 = "1"
            boolean r2 = r2.contains(r3)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r2 == 0) goto L_0x011f
            if (r4 == 0) goto L_0x011f
            com.google.android.gms.internal.ads.ars r2 = new com.google.android.gms.internal.ads.ars     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r10 = r4.mo12735a()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.util.List r11 = r4.mo12738b()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r12 = r4.mo12740c()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.asy r13 = r4.mo12742d()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r14 = r4.mo12743e()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r15 = r4.mo12744f()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r16 = 0
            android.os.Bundle r17 = r4.mo12748j()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r18 = 0
            com.google.android.gms.dynamic.b r3 = r4.mo12752n()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r3 == 0) goto L_0x00e6
            com.google.android.gms.dynamic.b r3 = r4.mo12752n()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.Object r3 = com.google.android.gms.dynamic.C3327d.m15137a(r3)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r6 = r3
            android.view.View r6 = (android.view.View) r6     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
        L_0x00e6:
            r19 = r6
            com.google.android.gms.dynamic.b r20 = r4.mo12753o()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r21 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bab r3 = r1.f13474b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r3 = r3.f13418q     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.rf r4 = r25.mo13527t()     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.ads.internal.k r5 = new com.google.android.gms.ads.internal.k     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            r5.<init>(r2, r3, r0)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            goto L_0x00a5
        L_0x0100:
            com.google.android.gms.internal.ads.bab r2 = r1.f13474b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r3 = r2.f13416o     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            com.google.android.gms.internal.ads.bab r1 = r1.f13474b     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            java.lang.String r2 = r1.f13417p     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            if (r2 == 0) goto L_0x0115
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r1 = r25
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
            goto L_0x011c
        L_0x0115:
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "UTF-8"
            r0.loadData(r3, r1, r2)     // Catch:{ RemoteException -> 0x012c, RuntimeException -> 0x0127 }
        L_0x011c:
            r0 = 1
            r8 = 1
            goto L_0x0132
        L_0x011f:
            java.lang.String r0 = "No matching template id and mapper"
            goto L_0x000f
        L_0x0123:
            java.lang.String r0 = "No template ids present in mediation response"
            goto L_0x000f
        L_0x0127:
            r0 = move-exception
            r27.countDown()
            throw r0
        L_0x012c:
            r0 = move-exception
            java.lang.String r1 = "Unable to invoke load assets"
            com.google.android.gms.internal.ads.C3643iy.m19175c(r1, r0)
        L_0x0132:
            if (r8 != 0) goto L_0x0137
            r27.countDown()
        L_0x0137:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzas.zza(com.google.android.gms.internal.ads.py, com.google.android.gms.internal.ads.baj, java.util.concurrent.CountDownLatch):boolean");
    }

    public static View zze(C3622id idVar) {
        if (idVar == null) {
            C3643iy.m19174c("AdState is null");
            return null;
        } else if (zzf(idVar) && idVar.f14135b != null) {
            return idVar.f14135b.getView();
        } else {
            try {
                C3323b a = idVar.f14149p != null ? idVar.f14149p.mo12685a() : null;
                if (a != null) {
                    return (View) C3327d.m15137a(a);
                }
                C3643iy.m19178e("View in mediation adapter is null.");
                return null;
            } catch (RemoteException e) {
                C3643iy.m19175c("Could not get View from mediation adapter.", e);
                return null;
            }
        }
    }

    public static boolean zzf(C3622id idVar) {
        return (idVar == null || !idVar.f14147n || idVar.f14148o == null || idVar.f14148o.f13416o == null) ? false : true;
    }
}
