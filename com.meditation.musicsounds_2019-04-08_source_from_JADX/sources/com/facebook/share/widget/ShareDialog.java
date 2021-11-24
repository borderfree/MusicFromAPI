package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.C2201a;
import com.facebook.internal.C2217f;
import com.facebook.internal.C2218g;
import com.facebook.internal.C2218g.C2219a;
import com.facebook.internal.C2220h;
import com.facebook.internal.C2241s;
import com.facebook.internal.C2241s.C2243a;
import com.facebook.internal.C2258x;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.share.C2319a;
import com.facebook.share.C2319a.C2320a;
import com.facebook.share.internal.C2331b;
import com.facebook.share.internal.C2334d;
import com.facebook.share.internal.C2338g;
import com.facebook.share.internal.C2342h;
import com.facebook.share.internal.C2350i;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto.C2375a;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent.C2377a;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public final class ShareDialog extends C2220h<ShareContent, C2320a> implements C2319a {

    /* renamed from: b */
    private static final String f7551b = "ShareDialog";

    /* renamed from: c */
    private static final int f7552c = RequestCodeOffset.Share.toRequestCode();

    /* renamed from: d */
    private boolean f7553d = false;

    /* renamed from: e */
    private boolean f7554e = true;

    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$a */
    private class C2382a extends C2221a {
        private C2382a() {
            super();
        }

        /* renamed from: a */
        public C2201a mo7837a(final ShareContent shareContent) {
            C2338g.m10821a(shareContent);
            final C2201a d = ShareDialog.this.mo7836d();
            final boolean e = ShareDialog.this.mo8350e();
            C2218g.m10179a(d, (C2219a) new C2219a() {
                /* renamed from: a */
                public Bundle mo7830a() {
                    return C2334d.m10810a(d.mo7810c(), shareContent, e);
                }

                /* renamed from: b */
                public Bundle mo7831b() {
                    return C2331b.m10777a(d.mo7810c(), shareContent, e);
                }
            }, ShareDialog.m11112e(shareContent.getClass()));
            return d;
        }

        /* renamed from: a */
        public Object mo7838a() {
            return Mode.NATIVE;
        }

        /* renamed from: a */
        public boolean mo7839a(ShareContent shareContent, boolean z) {
            return (shareContent instanceof ShareCameraEffectContent) && ShareDialog.m11110c(shareContent.getClass());
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$b */
    private class C2384b extends C2221a {
        private C2384b() {
            super();
        }

        /* renamed from: a */
        public C2201a mo7837a(ShareContent shareContent) {
            Bundle bundle;
            ShareDialog.this.m11102a(ShareDialog.this.mo7834b(), shareContent, Mode.FEED);
            C2201a d = ShareDialog.this.mo7836d();
            if (shareContent instanceof ShareLinkContent) {
                ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
                C2338g.m10844b((ShareContent) shareLinkContent);
                bundle = C2350i.m10921b(shareLinkContent);
            } else {
                bundle = C2350i.m10916a((ShareFeedContent) shareContent);
            }
            C2218g.m10181a(d, "feed", bundle);
            return d;
        }

        /* renamed from: a */
        public Object mo7838a() {
            return Mode.FEED;
        }

        /* renamed from: a */
        public boolean mo7839a(ShareContent shareContent, boolean z) {
            return (shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent);
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$c */
    private class C2385c extends C2221a {
        private C2385c() {
            super();
        }

        /* renamed from: a */
        public C2201a mo7837a(final ShareContent shareContent) {
            ShareDialog.this.m11102a(ShareDialog.this.mo7834b(), shareContent, Mode.NATIVE);
            C2338g.m10821a(shareContent);
            final C2201a d = ShareDialog.this.mo7836d();
            final boolean e = ShareDialog.this.mo8350e();
            C2218g.m10179a(d, (C2219a) new C2219a() {
                /* renamed from: a */
                public Bundle mo7830a() {
                    return C2334d.m10810a(d.mo7810c(), shareContent, e);
                }

                /* renamed from: b */
                public Bundle mo7831b() {
                    return C2331b.m10777a(d.mo7810c(), shareContent, e);
                }
            }, ShareDialog.m11112e(shareContent.getClass()));
            return d;
        }

        /* renamed from: a */
        public Object mo7838a() {
            return Mode.NATIVE;
        }

        /* renamed from: a */
        public boolean mo7839a(ShareContent shareContent, boolean z) {
            boolean z2;
            if (shareContent == null || (shareContent instanceof ShareCameraEffectContent)) {
                return false;
            }
            if (!z) {
                z2 = shareContent.mo8191m() != null ? C2218g.m10182a((C2217f) ShareDialogFeature.HASHTAG) : true;
                if ((shareContent instanceof ShareLinkContent) && !C2258x.m10392a(((ShareLinkContent) shareContent).mo8212d())) {
                    z2 &= C2218g.m10182a((C2217f) ShareDialogFeature.LINK_SHARE_QUOTES);
                }
            } else {
                z2 = true;
            }
            return z2 && ShareDialog.m11110c(shareContent.getClass());
        }
    }

    /* renamed from: com.facebook.share.widget.ShareDialog$d */
    private class C2387d extends C2221a {
        private C2387d() {
            super();
        }

        /* renamed from: a */
        private SharePhotoContent m11136a(SharePhotoContent sharePhotoContent, UUID uuid) {
            C2377a a = new C2377a().mo8193a(sharePhotoContent);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < sharePhotoContent.mo8322a().size(); i++) {
                SharePhoto sharePhoto = (SharePhoto) sharePhotoContent.mo8322a().get(i);
                Bitmap c = sharePhoto.mo8305c();
                if (c != null) {
                    C2243a a2 = C2241s.m10269a(uuid, c);
                    sharePhoto = new C2375a().mo8228a(sharePhoto).mo8315a(Uri.parse(a2.mo7870a())).mo8314a((Bitmap) null).mo8321c();
                    arrayList2.add(a2);
                }
                arrayList.add(sharePhoto);
            }
            a.mo8331c(arrayList);
            C2241s.m10277a((Collection<C2243a>) arrayList2);
            return a.mo8329a();
        }

        /* renamed from: b */
        private String m11137b(ShareContent shareContent) {
            if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof SharePhotoContent)) {
                return "share";
            }
            if (shareContent instanceof ShareOpenGraphContent) {
                return "share_open_graph";
            }
            return null;
        }

        /* renamed from: a */
        public C2201a mo7837a(ShareContent shareContent) {
            ShareDialog.this.m11102a(ShareDialog.this.mo7834b(), shareContent, Mode.WEB);
            C2201a d = ShareDialog.this.mo7836d();
            C2338g.m10844b(shareContent);
            Bundle bundle = shareContent instanceof ShareLinkContent ? C2350i.m10918a((ShareLinkContent) shareContent) : shareContent instanceof SharePhotoContent ? C2350i.m10920a(m11136a((SharePhotoContent) shareContent, d.mo7810c())) : C2350i.m10919a((ShareOpenGraphContent) shareContent);
            C2218g.m10181a(d, m11137b(shareContent), bundle);
            return d;
        }

        /* renamed from: a */
        public Object mo7838a() {
            return Mode.WEB;
        }

        /* renamed from: a */
        public boolean mo7839a(ShareContent shareContent, boolean z) {
            return shareContent != null && ShareDialog.m11108b(shareContent);
        }
    }

    public ShareDialog(Activity activity) {
        super(activity, f7552c);
        C2342h.m10896a(f7552c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11102a(Context context, ShareContent shareContent, Mode mode) {
        String str;
        if (this.f7554e) {
            mode = Mode.AUTOMATIC;
        }
        switch (mode) {
            case AUTOMATIC:
                str = "automatic";
                break;
            case WEB:
                str = "web";
                break;
            case NATIVE:
                str = "native";
                break;
            default:
                str = "unknown";
                break;
        }
        C2217f e = m11112e(shareContent.getClass());
        String str2 = e == ShareDialogFeature.SHARE_DIALOG ? "status" : e == ShareDialogFeature.PHOTOS ? "photo" : e == ShareDialogFeature.VIDEO ? "video" : e == OpenGraphActionDialogFeature.OG_ACTION_DIALOG ? "open_graph" : "unknown";
        AppEventsLogger a = AppEventsLogger.m9940a(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_show", str);
        bundle.putString("fb_share_dialog_content_type", str2);
        a.mo7683a("fb_share_dialog_show", (Double) null, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m11108b(ShareContent shareContent) {
        if (!m11111d(shareContent.getClass())) {
            return false;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            try {
                C2342h.m10893a((ShareOpenGraphContent) shareContent);
            } catch (Exception e) {
                Log.d(f7551b, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", e);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m11110c(Class<? extends ShareContent> cls) {
        C2217f e = m11112e(cls);
        return e != null && C2218g.m10182a(e);
    }

    /* renamed from: d */
    private static boolean m11111d(Class<? extends ShareContent> cls) {
        AccessToken a = AccessToken.m7985a();
        boolean z = a != null && !a.mo6529j();
        if (ShareLinkContent.class.isAssignableFrom(cls) || ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return true;
        }
        return SharePhotoContent.class.isAssignableFrom(cls) && z;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C2217f m11112e(Class<? extends ShareContent> cls) {
        if (ShareLinkContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (SharePhotoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (ShareVideoContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        }
        if (ShareMediaContent.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        if (ShareCameraEffectContent.class.isAssignableFrom(cls)) {
            return CameraEffectFeature.SHARE_CAMERA_EFFECT;
        }
        return null;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.facebook.share.widget.ShareDialog$Mode, code=java.lang.Object, for r3v0, types: [com.facebook.share.widget.ShareDialog$Mode, java.lang.Object] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8349a(com.facebook.share.model.ShareContent r2, java.lang.Object r3) {
        /*
            r1 = this;
            com.facebook.share.widget.ShareDialog$Mode r0 = com.facebook.share.widget.ShareDialog.Mode.AUTOMATIC
            if (r3 != r0) goto L_0x0006
            r0 = 1
            goto L_0x0007
        L_0x0006:
            r0 = 0
        L_0x0007:
            r1.f7554e = r0
            boolean r0 = r1.f7554e
            if (r0 == 0) goto L_0x000f
            java.lang.Object r3 = f7169a
        L_0x000f:
            r1.mo7833a(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.ShareDialog.mo8349a(com.facebook.share.model.ShareContent, com.facebook.share.widget.ShareDialog$Mode):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public List<C2221a> mo7835c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2385c());
        arrayList.add(new C2384b());
        arrayList.add(new C2387d());
        arrayList.add(new C2382a());
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C2201a mo7836d() {
        return new C2201a(mo7832a());
    }

    /* renamed from: e */
    public boolean mo8350e() {
        return this.f7553d;
    }
}
