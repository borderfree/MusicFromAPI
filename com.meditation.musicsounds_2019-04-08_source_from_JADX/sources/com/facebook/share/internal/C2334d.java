package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.d */
public class C2334d {
    /* renamed from: a */
    private static Bundle m10800a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z) {
        Bundle a = m10801a((ShareContent) shareCameraEffectContent, z);
        C2258x.m10378a(a, "effect_id", shareCameraEffectContent.mo8179a());
        if (bundle != null) {
            a.putBundle("effect_textures", bundle);
        }
        try {
            JSONObject a2 = C2326a.m10767a(shareCameraEffectContent.mo8180b());
            if (a2 != null) {
                C2258x.m10378a(a, "effect_arguments", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to create a JSON Object from the provided CameraEffectArguments: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m10801a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C2258x.m10377a(bundle, "LINK", shareContent.mo8186h());
        C2258x.m10378a(bundle, "PLACE", shareContent.mo8188j());
        C2258x.m10378a(bundle, "PAGE", shareContent.mo8189k());
        C2258x.m10378a(bundle, "REF", shareContent.mo8190l());
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List i = shareContent.mo8187i();
        if (!C2258x.m10393a((Collection<T>) i)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList(i));
        }
        ShareHashtag m = shareContent.mo8191m();
        if (m != null) {
            C2258x.m10378a(bundle, "HASHTAG", m.mo8198a());
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m10802a(ShareLinkContent shareLinkContent, boolean z) {
        Bundle a = m10801a((ShareContent) shareLinkContent, z);
        C2258x.m10378a(a, "TITLE", shareLinkContent.mo8210b());
        C2258x.m10378a(a, "DESCRIPTION", shareLinkContent.mo8209a());
        C2258x.m10377a(a, "IMAGE", shareLinkContent.mo8211c());
        C2258x.m10378a(a, "QUOTE", shareLinkContent.mo8212d());
        C2258x.m10377a(a, "MESSENGER_LINK", shareLinkContent.mo8186h());
        C2258x.m10377a(a, "TARGET_DISPLAY", shareLinkContent.mo8186h());
        return a;
    }

    /* renamed from: a */
    private static Bundle m10803a(ShareMediaContent shareMediaContent, List<Bundle> list, boolean z) {
        Bundle a = m10801a((ShareContent) shareMediaContent, z);
        a.putParcelableArrayList("MEDIA", new ArrayList(list));
        return a;
    }

    /* renamed from: a */
    private static Bundle m10804a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent, boolean z) {
        Bundle a = m10801a((ShareContent) shareMessengerGenericTemplateContent, z);
        try {
            C2332c.m10791a(a, shareMessengerGenericTemplateContent);
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m10805a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent, boolean z) {
        Bundle a = m10801a((ShareContent) shareMessengerMediaTemplateContent, z);
        try {
            C2332c.m10793a(a, shareMessengerMediaTemplateContent);
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m10806a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent, boolean z) {
        Bundle a = m10801a((ShareContent) shareMessengerOpenGraphMusicTemplateContent, z);
        try {
            C2332c.m10794a(a, shareMessengerOpenGraphMusicTemplateContent);
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    /* renamed from: a */
    private static Bundle m10807a(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle a = m10801a((ShareContent) shareOpenGraphContent, z);
        C2258x.m10378a(a, "PREVIEW_PROPERTY_NAME", (String) C2342h.m10881a(shareOpenGraphContent.mo8289b()).second);
        C2258x.m10378a(a, "ACTION_TYPE", shareOpenGraphContent.mo8288a().mo8278a());
        C2258x.m10378a(a, "ACTION", jSONObject.toString());
        return a;
    }

    /* renamed from: a */
    private static Bundle m10808a(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        Bundle a = m10801a((ShareContent) sharePhotoContent, z);
        a.putStringArrayList("PHOTOS", new ArrayList(list));
        return a;
    }

    /* renamed from: a */
    private static Bundle m10809a(ShareVideoContent shareVideoContent, String str, boolean z) {
        Bundle a = m10801a((ShareContent) shareVideoContent, z);
        C2258x.m10378a(a, "TITLE", shareVideoContent.mo8342b());
        C2258x.m10378a(a, "DESCRIPTION", shareVideoContent.mo8341a());
        C2258x.m10378a(a, "VIDEO", str);
        return a;
    }

    /* renamed from: a */
    public static Bundle m10810a(UUID uuid, ShareContent shareContent, boolean z) {
        C2264y.m10422a((Object) shareContent, "shareContent");
        C2264y.m10422a((Object) uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            return m10802a((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            return m10808a(sharePhotoContent, C2342h.m10891a(sharePhotoContent, uuid), z);
        } else if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            return m10809a(shareVideoContent, C2342h.m10889a(shareVideoContent, uuid), z);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                return m10807a(shareOpenGraphContent, C2342h.m10895a(C2342h.m10894a(uuid, shareOpenGraphContent), false), z);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                sb.append(e.getMessage());
                throw new FacebookException(sb.toString());
            }
        } else if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            return m10803a(shareMediaContent, C2342h.m10890a(shareMediaContent, uuid), z);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            return m10800a(shareCameraEffectContent, C2342h.m10880a(shareCameraEffectContent, uuid), z);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            return m10804a((ShareMessengerGenericTemplateContent) shareContent, z);
        } else {
            if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
                return m10806a((ShareMessengerOpenGraphMusicTemplateContent) shareContent, z);
            }
            if (shareContent instanceof ShareMessengerMediaTemplateContent) {
                return m10805a((ShareMessengerMediaTemplateContent) shareContent, z);
            }
            return null;
        }
    }
}
