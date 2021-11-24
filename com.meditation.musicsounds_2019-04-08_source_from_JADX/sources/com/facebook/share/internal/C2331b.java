package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.b */
public class C2331b {
    /* renamed from: a */
    private static Bundle m10772a(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C2258x.m10377a(bundle, "com.facebook.platform.extra.LINK", shareContent.mo8186h());
        C2258x.m10378a(bundle, "com.facebook.platform.extra.PLACE", shareContent.mo8188j());
        C2258x.m10378a(bundle, "com.facebook.platform.extra.REF", shareContent.mo8190l());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List i = shareContent.mo8187i();
        if (!C2258x.m10393a((Collection<T>) i)) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(i));
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle m10773a(ShareLinkContent shareLinkContent, boolean z) {
        Bundle a = m10772a((ShareContent) shareLinkContent, z);
        C2258x.m10378a(a, "com.facebook.platform.extra.TITLE", shareLinkContent.mo8210b());
        C2258x.m10378a(a, "com.facebook.platform.extra.DESCRIPTION", shareLinkContent.mo8209a());
        C2258x.m10377a(a, "com.facebook.platform.extra.IMAGE", shareLinkContent.mo8211c());
        return a;
    }

    /* renamed from: a */
    private static Bundle m10774a(ShareOpenGraphContent shareOpenGraphContent, JSONObject jSONObject, boolean z) {
        Bundle a = m10772a((ShareContent) shareOpenGraphContent, z);
        C2258x.m10378a(a, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.mo8289b());
        C2258x.m10378a(a, "com.facebook.platform.extra.ACTION_TYPE", shareOpenGraphContent.mo8288a().mo8278a());
        C2258x.m10378a(a, "com.facebook.platform.extra.ACTION", jSONObject.toString());
        return a;
    }

    /* renamed from: a */
    private static Bundle m10775a(SharePhotoContent sharePhotoContent, List<String> list, boolean z) {
        Bundle a = m10772a((ShareContent) sharePhotoContent, z);
        a.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(list));
        return a;
    }

    /* renamed from: a */
    private static Bundle m10776a(ShareVideoContent shareVideoContent, boolean z) {
        return null;
    }

    /* renamed from: a */
    public static Bundle m10777a(UUID uuid, ShareContent shareContent, boolean z) {
        C2264y.m10422a((Object) shareContent, "shareContent");
        C2264y.m10422a((Object) uuid, "callId");
        if (shareContent instanceof ShareLinkContent) {
            return m10773a((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            return m10775a(sharePhotoContent, C2342h.m10891a(sharePhotoContent, uuid), z);
        } else if (shareContent instanceof ShareVideoContent) {
            return m10776a((ShareVideoContent) shareContent, z);
        } else {
            if (!(shareContent instanceof ShareOpenGraphContent)) {
                return null;
            }
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            try {
                return m10774a(shareOpenGraphContent, C2342h.m10894a(uuid, shareOpenGraphContent), z);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
                sb.append(e.getMessage());
                throw new FacebookException(sb.toString());
            }
        }
    }
}
