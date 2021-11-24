package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2258x.C2262b;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.i */
public class C2350i {
    /* renamed from: a */
    public static Bundle m10916a(ShareFeedContent shareFeedContent) {
        Bundle bundle = new Bundle();
        C2258x.m10378a(bundle, "to", shareFeedContent.mo8118a());
        C2258x.m10378a(bundle, "link", shareFeedContent.mo8119b());
        C2258x.m10378a(bundle, "picture", shareFeedContent.mo8124f());
        C2258x.m10378a(bundle, "source", shareFeedContent.mo8125g());
        C2258x.m10378a(bundle, "name", shareFeedContent.mo8120c());
        C2258x.m10378a(bundle, "caption", shareFeedContent.mo8121d());
        C2258x.m10378a(bundle, "description", shareFeedContent.mo8123e());
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m10917a(ShareContent shareContent) {
        Bundle bundle = new Bundle();
        ShareHashtag m = shareContent.mo8191m();
        if (m != null) {
            C2258x.m10378a(bundle, "hashtag", m.mo8198a());
        }
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m10918a(ShareLinkContent shareLinkContent) {
        Bundle a = m10917a((ShareContent) shareLinkContent);
        C2258x.m10377a(a, "href", shareLinkContent.mo8186h());
        C2258x.m10378a(a, "quote", shareLinkContent.mo8212d());
        return a;
    }

    /* renamed from: a */
    public static Bundle m10919a(ShareOpenGraphContent shareOpenGraphContent) {
        Bundle a = m10917a((ShareContent) shareOpenGraphContent);
        C2258x.m10378a(a, "action_type", shareOpenGraphContent.mo8288a().mo8278a());
        try {
            JSONObject a2 = C2342h.m10895a(C2342h.m10893a(shareOpenGraphContent), false);
            if (a2 != null) {
                C2258x.m10378a(a, "action_properties", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            throw new FacebookException("Unable to serialize the ShareOpenGraphContent to JSON", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static Bundle m10920a(SharePhotoContent sharePhotoContent) {
        Bundle a = m10917a((ShareContent) sharePhotoContent);
        String[] strArr = new String[sharePhotoContent.mo8322a().size()];
        C2258x.m10373a(sharePhotoContent.mo8322a(), (C2262b<T, K>) new C2262b<SharePhoto, String>() {
            /* renamed from: a */
            public String mo7886a(SharePhoto sharePhoto) {
                return sharePhoto.mo8306d().toString();
            }
        }).toArray(strArr);
        a.putStringArray("media", strArr);
        return a;
    }

    /* renamed from: b */
    public static Bundle m10921b(ShareLinkContent shareLinkContent) {
        Bundle bundle = new Bundle();
        C2258x.m10378a(bundle, "name", shareLinkContent.mo8210b());
        C2258x.m10378a(bundle, "description", shareLinkContent.mo8209a());
        C2258x.m10378a(bundle, "link", C2258x.m10364a(shareLinkContent.mo8186h()));
        C2258x.m10378a(bundle, "picture", C2258x.m10364a(shareLinkContent.mo8211c()));
        C2258x.m10378a(bundle, "quote", shareLinkContent.mo8212d());
        if (shareLinkContent.mo8191m() != null) {
            C2258x.m10378a(bundle, "hashtag", shareLinkContent.mo8191m().mo8198a());
        }
        return bundle;
    }
}
