package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.C2185d;
import com.facebook.C2189f;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1609b;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C2201a;
import com.facebook.internal.C2241s;
import com.facebook.internal.C2241s.C2243a;
import com.facebook.internal.C2244t;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2258x.C2262b;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.C2200a;
import com.facebook.share.C2319a.C2320a;
import com.facebook.share.internal.C2335e.C2336a;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.h */
public final class C2342h {
    /* renamed from: a */
    public static Bundle m10880a(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        if (shareCameraEffectContent != null) {
            CameraEffectTextures c = shareCameraEffectContent.mo8181c();
            if (c != null) {
                Bundle bundle = new Bundle();
                ArrayList arrayList = new ArrayList();
                for (String str : c.mo8168a()) {
                    C2243a a = m10885a(uuid, c.mo8169b(str), c.mo8167a(str));
                    arrayList.add(a);
                    bundle.putString(str, a.mo7870a());
                }
                C2241s.m10277a((Collection<C2243a>) arrayList);
                return bundle;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Pair<String, String> m10881a(String str) {
        String str2;
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            int i = indexOf + 1;
            if (str.length() > i) {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
                return new Pair<>(str2, str);
            }
        }
        str2 = null;
        return new Pair<>(str2, str);
    }

    /* renamed from: a */
    public static GraphRequest m10882a(AccessToken accessToken, Uri uri, C1609b bVar) {
        if (C2258x.m10407d(uri)) {
            return m10883a(accessToken, new File(uri.getPath()), bVar);
        }
        if (C2258x.m10403c(uri)) {
            ParcelableResourceWithMimeType parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            GraphRequest graphRequest = new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, bVar);
            return graphRequest;
        }
        throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
    }

    /* renamed from: a */
    public static GraphRequest m10883a(AccessToken accessToken, File file, C1609b bVar) {
        ParcelableResourceWithMimeType parcelableResourceWithMimeType = new ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        GraphRequest graphRequest = new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, bVar);
        return graphRequest;
    }

    /* renamed from: a */
    private static C2201a m10884a(int i, int i2, Intent intent) {
        UUID b = C2244t.m10308b(intent);
        if (b == null) {
            return null;
        }
        return C2201a.m10143a(b, i);
    }

    /* renamed from: a */
    private static C2243a m10885a(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return C2241s.m10269a(uuid, bitmap);
        }
        if (uri != null) {
            return C2241s.m10270a(uuid, uri);
        }
        return null;
    }

    /* renamed from: a */
    public static C2337f m10887a(final C2185d<C2320a> dVar) {
        return new C2337f(dVar) {
            /* renamed from: a */
            public void mo8133a(C2201a aVar) {
                C2342h.m10903b(dVar);
            }

            /* renamed from: a */
            public void mo8134a(C2201a aVar, Bundle bundle) {
                if (bundle != null) {
                    String a = C2342h.m10888a(bundle);
                    if (a == null || "post".equalsIgnoreCase(a)) {
                        C2342h.m10898a(dVar, C2342h.m10902b(bundle));
                    } else if ("cancel".equalsIgnoreCase(a)) {
                        C2342h.m10903b(dVar);
                    } else {
                        C2342h.m10897a(dVar, new FacebookException("UnknownError"));
                    }
                }
            }

            /* renamed from: a */
            public void mo8135a(C2201a aVar, FacebookException facebookException) {
                C2342h.m10897a(dVar, facebookException);
            }
        };
    }

    /* renamed from: a */
    public static String m10888a(Bundle bundle) {
        return bundle.getString(bundle.containsKey("completionGesture") ? "completionGesture" : "com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    /* renamed from: a */
    public static String m10889a(ShareVideoContent shareVideoContent, UUID uuid) {
        if (shareVideoContent == null || shareVideoContent.mo8344d() == null) {
            return null;
        }
        C2243a a = C2241s.m10270a(uuid, shareVideoContent.mo8344d().mo8332c());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a);
        C2241s.m10277a((Collection<C2243a>) arrayList);
        return a.mo7870a();
    }

    /* renamed from: a */
    public static List<Bundle> m10890a(ShareMediaContent shareMediaContent, final UUID uuid) {
        if (shareMediaContent != null) {
            List a = shareMediaContent.mo8229a();
            if (a != null) {
                final ArrayList arrayList = new ArrayList();
                List<Bundle> a2 = C2258x.m10373a(a, (C2262b<T, K>) new C2262b<ShareMedia, Bundle>() {
                    /* renamed from: a */
                    public Bundle mo7886a(ShareMedia shareMedia) {
                        C2243a a = C2342h.m10901b(uuid, shareMedia);
                        arrayList.add(a);
                        Bundle bundle = new Bundle();
                        bundle.putString("type", shareMedia.mo8224b().name());
                        bundle.putString("uri", a.mo7870a());
                        return bundle;
                    }
                });
                C2241s.m10277a((Collection<C2243a>) arrayList);
                return a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<String> m10891a(SharePhotoContent sharePhotoContent, final UUID uuid) {
        if (sharePhotoContent != null) {
            List a = sharePhotoContent.mo8322a();
            if (a != null) {
                List a2 = C2258x.m10373a(a, (C2262b<T, K>) new C2262b<SharePhoto, C2243a>() {
                    /* renamed from: a */
                    public C2243a mo7886a(SharePhoto sharePhoto) {
                        return C2342h.m10901b(uuid, sharePhoto);
                    }
                });
                List<String> a3 = C2258x.m10373a(a2, (C2262b<T, K>) new C2262b<C2243a, String>() {
                    /* renamed from: a */
                    public String mo7886a(C2243a aVar) {
                        return aVar.mo7870a();
                    }
                });
                C2241s.m10277a((Collection<C2243a>) a2);
                return a3;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static JSONArray m10892a(JSONArray jSONArray, boolean z) {
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m10892a((JSONArray) obj, z);
            } else if (obj instanceof JSONObject) {
                obj = m10895a((JSONObject) obj, z);
            }
            jSONArray2.put(obj);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public static JSONObject m10893a(ShareOpenGraphContent shareOpenGraphContent) {
        return C2335e.m10813a(shareOpenGraphContent.mo8288a(), (C2336a) new C2336a() {
            /* renamed from: a */
            public JSONObject mo8132a(SharePhoto sharePhoto) {
                Uri d = sharePhoto.mo8306d();
                if (C2258x.m10399b(d)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("url", d.toString());
                        return jSONObject;
                    } catch (JSONException e) {
                        throw new FacebookException("Unable to attach images", (Throwable) e);
                    }
                } else {
                    throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
                }
            }
        });
    }

    /* renamed from: a */
    public static JSONObject m10894a(final UUID uuid, ShareOpenGraphContent shareOpenGraphContent) {
        ShareOpenGraphAction a = shareOpenGraphContent.mo8288a();
        final ArrayList arrayList = new ArrayList();
        JSONObject a2 = C2335e.m10813a(a, (C2336a) new C2336a() {
            /* renamed from: a */
            public JSONObject mo8132a(SharePhoto sharePhoto) {
                C2243a a = C2342h.m10901b(uuid, sharePhoto);
                if (a == null) {
                    return null;
                }
                arrayList.add(a);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", a.mo7870a());
                    if (sharePhoto.mo8307e()) {
                        jSONObject.put("user_generated", true);
                    }
                    return jSONObject;
                } catch (JSONException e) {
                    throw new FacebookException("Unable to attach images", (Throwable) e);
                }
            }
        });
        C2241s.m10277a((Collection<C2243a>) arrayList);
        if (shareOpenGraphContent.mo8188j() != null && C2258x.m10392a(a2.optString("place"))) {
            a2.put("place", shareOpenGraphContent.mo8188j());
        }
        if (shareOpenGraphContent.mo8187i() != null) {
            JSONArray optJSONArray = a2.optJSONArray("tags");
            Set hashSet = optJSONArray == null ? new HashSet() : C2258x.m10396b(optJSONArray);
            for (String add : shareOpenGraphContent.mo8187i()) {
                hashSet.add(add);
            }
            a2.put("tags", new JSONArray(hashSet));
        }
        return a2;
    }

    /* renamed from: a */
    public static JSONObject m10895a(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONArray names = jSONObject.names();
            for (int i = 0; i < names.length(); i++) {
                String string = names.getString(i);
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = m10895a((JSONObject) obj, true);
                } else if (obj instanceof JSONArray) {
                    obj = m10892a((JSONArray) obj, true);
                }
                Pair a = m10881a(string);
                String str = (String) a.first;
                String str2 = (String) a.second;
                if (!z) {
                    if (str != null && str.equals("fb")) {
                    }
                    jSONObject2.put(str2, obj);
                } else if (str == null || !str.equals("fbsdk")) {
                    if (str != null) {
                        if (!str.equals("og")) {
                            jSONObject3.put(str2, obj);
                        }
                    }
                    jSONObject2.put(str2, obj);
                }
                jSONObject2.put(string, obj);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("data", jSONObject3);
            }
            return jSONObject2;
        } catch (JSONException unused) {
            throw new FacebookException("Failed to create json object from share content");
        }
    }

    /* renamed from: a */
    public static void m10896a(final int i) {
        CallbackManagerImpl.m10136a(i, new C2200a() {
            /* renamed from: a */
            public boolean mo7800a(int i, Intent intent) {
                return C2342h.m10900a(i, i, intent, C2342h.m10887a(null));
            }
        });
    }

    /* renamed from: a */
    static void m10897a(C2185d<C2320a> dVar, FacebookException facebookException) {
        m10899a("error", facebookException.getMessage());
        if (dVar != null) {
            dVar.mo7743a(facebookException);
        }
    }

    /* renamed from: a */
    static void m10898a(C2185d<C2320a> dVar, String str) {
        m10899a("succeeded", (String) null);
        if (dVar != null) {
            dVar.mo7744a(new C2320a(str));
        }
    }

    /* renamed from: a */
    private static void m10899a(String str, String str2) {
        AppEventsLogger a = AppEventsLogger.m9940a(C2189f.m10092f());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        a.mo7683a("fb_share_dialog_result", (Double) null, bundle);
    }

    /* renamed from: a */
    public static boolean m10900a(int i, int i2, Intent intent, C2337f fVar) {
        C2201a a = m10884a(i, i2, intent);
        if (a == null) {
            return false;
        }
        C2241s.m10278a(a.mo7810c());
        if (fVar == null) {
            return true;
        }
        FacebookException a2 = C2244t.m10298a(C2244t.m10319g(intent));
        if (a2 == null) {
            fVar.mo8134a(a, C2244t.m10315e(intent));
        } else if (a2 instanceof FacebookOperationCanceledException) {
            fVar.mo8133a(a);
        } else {
            fVar.mo8135a(a, a2);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C2243a m10901b(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap = null;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.mo8305c();
            uri = sharePhoto.mo8306d();
        } else {
            uri = shareMedia instanceof ShareVideo ? ((ShareVideo) shareMedia).mo8332c() : null;
        }
        return m10885a(uuid, uri, bitmap);
    }

    /* renamed from: b */
    public static String m10902b(Bundle bundle) {
        String str = bundle.containsKey("postId") ? "postId" : bundle.containsKey("com.facebook.platform.extra.POST_ID") ? "com.facebook.platform.extra.POST_ID" : "post_id";
        return bundle.getString(str);
    }

    /* renamed from: b */
    static void m10903b(C2185d<C2320a> dVar) {
        m10899a("cancelled", (String) null);
        if (dVar != null) {
            dVar.mo7742a();
        }
    }
}
