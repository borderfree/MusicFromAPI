package com.facebook.share.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.C2189f;
import com.facebook.FacebookException;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2264y;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.List;
import java.util.Locale;

/* renamed from: com.facebook.share.internal.g */
public class C2338g {

    /* renamed from: a */
    private static C2340a f7464a;

    /* renamed from: b */
    private static C2340a f7465b;

    /* renamed from: com.facebook.share.internal.g$a */
    private static class C2340a {

        /* renamed from: a */
        private boolean f7466a;

        private C2340a() {
            this.f7466a = false;
        }

        /* renamed from: a */
        public void mo8136a(ShareCameraEffectContent shareCameraEffectContent) {
            C2338g.m10843b(shareCameraEffectContent, this);
        }

        /* renamed from: a */
        public void mo8137a(ShareLinkContent shareLinkContent) {
            C2338g.m10845b(shareLinkContent, this);
        }

        /* renamed from: a */
        public void mo8138a(ShareMedia shareMedia) {
            C2338g.m10824a(shareMedia, this);
        }

        /* renamed from: a */
        public void mo8139a(ShareMediaContent shareMediaContent) {
            C2338g.m10846b(shareMediaContent, this);
        }

        /* renamed from: a */
        public void mo8140a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
            C2338g.m10847b(shareMessengerGenericTemplateContent);
        }

        /* renamed from: a */
        public void mo8141a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
            C2338g.m10848b(shareMessengerMediaTemplateContent);
        }

        /* renamed from: a */
        public void mo8142a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
            C2338g.m10849b(shareMessengerOpenGraphMusicTemplateContent);
        }

        /* renamed from: a */
        public void mo8143a(ShareOpenGraphAction shareOpenGraphAction) {
            C2338g.m10850b(shareOpenGraphAction, this);
        }

        /* renamed from: a */
        public void mo8144a(ShareOpenGraphContent shareOpenGraphContent) {
            this.f7466a = true;
            C2338g.m10851b(shareOpenGraphContent, this);
        }

        /* renamed from: a */
        public void mo8145a(ShareOpenGraphObject shareOpenGraphObject) {
            C2338g.m10852b(shareOpenGraphObject, this);
        }

        /* renamed from: a */
        public void mo8146a(ShareOpenGraphValueContainer shareOpenGraphValueContainer, boolean z) {
            C2338g.m10853b(shareOpenGraphValueContainer, this, z);
        }

        /* renamed from: a */
        public void mo8147a(SharePhoto sharePhoto) {
            C2338g.m10859d(sharePhoto, this);
        }

        /* renamed from: a */
        public void mo8148a(SharePhotoContent sharePhotoContent) {
            C2338g.m10855b(sharePhotoContent, this);
        }

        /* renamed from: a */
        public void mo8149a(ShareVideo shareVideo) {
            C2338g.m10856b(shareVideo, this);
        }

        /* renamed from: a */
        public void mo8150a(ShareVideoContent shareVideoContent) {
            C2338g.m10857b(shareVideoContent, this);
        }

        /* renamed from: a */
        public boolean mo8151a() {
            return this.f7466a;
        }
    }

    /* renamed from: com.facebook.share.internal.g$b */
    private static class C2341b extends C2340a {
        private C2341b() {
            super();
        }

        /* renamed from: a */
        public void mo8139a(ShareMediaContent shareMediaContent) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        /* renamed from: a */
        public void mo8147a(SharePhoto sharePhoto) {
            C2338g.m10860e(sharePhoto, this);
        }

        /* renamed from: a */
        public void mo8150a(ShareVideoContent shareVideoContent) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    /* renamed from: a */
    private static C2340a m10819a() {
        if (f7465b == null) {
            f7465b = new C2340a();
        }
        return f7465b;
    }

    /* renamed from: a */
    public static void m10821a(ShareContent shareContent) {
        m10822a(shareContent, m10819a());
    }

    /* renamed from: a */
    private static void m10822a(ShareContent shareContent, C2340a aVar) {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if (shareContent instanceof ShareLinkContent) {
            aVar.mo8137a((ShareLinkContent) shareContent);
        } else if (shareContent instanceof SharePhotoContent) {
            aVar.mo8148a((SharePhotoContent) shareContent);
        } else if (shareContent instanceof ShareVideoContent) {
            aVar.mo8150a((ShareVideoContent) shareContent);
        } else if (shareContent instanceof ShareOpenGraphContent) {
            aVar.mo8144a((ShareOpenGraphContent) shareContent);
        } else if (shareContent instanceof ShareMediaContent) {
            aVar.mo8139a((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            aVar.mo8136a((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareMessengerOpenGraphMusicTemplateContent) {
            aVar.mo8142a((ShareMessengerOpenGraphMusicTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerMediaTemplateContent) {
            aVar.mo8141a((ShareMessengerMediaTemplateContent) shareContent);
        } else if (shareContent instanceof ShareMessengerGenericTemplateContent) {
            aVar.mo8140a((ShareMessengerGenericTemplateContent) shareContent);
        }
    }

    /* renamed from: a */
    public static void m10824a(ShareMedia shareMedia, C2340a aVar) {
        if (shareMedia instanceof SharePhoto) {
            aVar.mo8147a((SharePhoto) shareMedia);
        } else if (shareMedia instanceof ShareVideo) {
            aVar.mo8149a((ShareVideo) shareMedia);
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", new Object[]{shareMedia.getClass().getSimpleName()}));
        }
    }

    /* renamed from: a */
    private static void m10826a(ShareMessengerActionButton shareMessengerActionButton) {
        if (shareMessengerActionButton != null) {
            if (!C2258x.m10392a(shareMessengerActionButton.mo8234a())) {
                if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
                    m10830a((ShareMessengerURLActionButton) shareMessengerActionButton);
                }
                return;
            }
            throw new FacebookException("Must specify title for ShareMessengerActionButton");
        }
    }

    /* renamed from: a */
    private static void m10830a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.mo8269b() == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    /* renamed from: a */
    private static void m10835a(SharePhoto sharePhoto) {
        if (sharePhoto != null) {
            Bitmap c = sharePhoto.mo8305c();
            Uri d = sharePhoto.mo8306d();
            if (c == null && d == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new FacebookException("Cannot share a null SharePhoto");
    }

    /* renamed from: a */
    private static void m10840a(Object obj, C2340a aVar) {
        if (obj instanceof ShareOpenGraphObject) {
            aVar.mo8145a((ShareOpenGraphObject) obj);
        } else if (obj instanceof SharePhoto) {
            aVar.mo8147a((SharePhoto) obj);
        }
    }

    /* renamed from: a */
    private static void m10841a(String str, boolean z) {
        if (z) {
            String[] split = str.split(":");
            if (split.length >= 2) {
                int length = split.length;
                int i = 0;
                while (i < length) {
                    if (!split[i].isEmpty()) {
                        i++;
                    } else {
                        throw new FacebookException("Invalid key found in Open Graph dictionary: %s", str);
                    }
                }
                return;
            }
            throw new FacebookException("Open Graph keys must be namespaced: %s", str);
        }
    }

    /* renamed from: b */
    private static C2340a m10842b() {
        if (f7464a == null) {
            f7464a = new C2341b();
        }
        return f7464a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10843b(ShareCameraEffectContent shareCameraEffectContent, C2340a aVar) {
        if (C2258x.m10392a(shareCameraEffectContent.mo8179a())) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    /* renamed from: b */
    public static void m10844b(ShareContent shareContent) {
        m10822a(shareContent, m10842b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10845b(ShareLinkContent shareLinkContent, C2340a aVar) {
        Uri c = shareLinkContent.mo8211c();
        if (c != null && !C2258x.m10399b(c)) {
            throw new FacebookException("Image Url must be an http:// or https:// url");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10846b(ShareMediaContent shareMediaContent, C2340a aVar) {
        List<ShareMedia> a = shareMediaContent.mo8229a();
        if (a == null || a.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        } else if (a.size() <= 6) {
            for (ShareMedia a2 : a) {
                aVar.mo8138a(a2);
            }
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", new Object[]{Integer.valueOf(6)}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10847b(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (C2258x.m10392a(shareMessengerGenericTemplateContent.mo8189k())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
        } else if (shareMessengerGenericTemplateContent.mo8239c() == null) {
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        } else if (!C2258x.m10392a(shareMessengerGenericTemplateContent.mo8239c().mo8244a())) {
            m10826a(shareMessengerGenericTemplateContent.mo8239c().mo8249e());
        } else {
            throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10848b(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (C2258x.m10392a(shareMessengerMediaTemplateContent.mo8189k())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
        } else if (shareMessengerMediaTemplateContent.mo8257c() != null || !C2258x.m10392a(shareMessengerMediaTemplateContent.mo8256b())) {
            m10826a(shareMessengerMediaTemplateContent.mo8258d());
        } else {
            throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10849b(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        if (C2258x.m10392a(shareMessengerOpenGraphMusicTemplateContent.mo8189k())) {
            throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        } else if (shareMessengerOpenGraphMusicTemplateContent.mo8263a() != null) {
            m10826a(shareMessengerOpenGraphMusicTemplateContent.mo8264b());
        } else {
            throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10850b(ShareOpenGraphAction shareOpenGraphAction, C2340a aVar) {
        if (shareOpenGraphAction == null) {
            throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
        } else if (!C2258x.m10392a(shareOpenGraphAction.mo8278a())) {
            aVar.mo8146a(shareOpenGraphAction, false);
        } else {
            throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10851b(ShareOpenGraphContent shareOpenGraphContent, C2340a aVar) {
        aVar.mo8143a(shareOpenGraphContent.mo8288a());
        String b = shareOpenGraphContent.mo8289b();
        if (C2258x.m10392a(b)) {
            throw new FacebookException("Must specify a previewPropertyName.");
        } else if (shareOpenGraphContent.mo8288a().mo8298a(b) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Property \"");
            sb.append(b);
            sb.append("\" was not found on the action. The name of the preview property must match the name of an action property.");
            throw new FacebookException(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10852b(ShareOpenGraphObject shareOpenGraphObject, C2340a aVar) {
        if (shareOpenGraphObject != null) {
            aVar.mo8146a(shareOpenGraphObject, true);
            return;
        }
        throw new FacebookException("Cannot share a null ShareOpenGraphObject");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10853b(ShareOpenGraphValueContainer shareOpenGraphValueContainer, C2340a aVar, boolean z) {
        for (String str : shareOpenGraphValueContainer.mo8301c()) {
            m10841a(str, z);
            Object a = shareOpenGraphValueContainer.mo8298a(str);
            if (a instanceof List) {
                for (Object next : (List) a) {
                    if (next != null) {
                        m10840a(next, aVar);
                    } else {
                        throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                }
                continue;
            } else {
                m10840a(a, aVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10855b(SharePhotoContent sharePhotoContent, C2340a aVar) {
        List<SharePhoto> a = sharePhotoContent.mo8322a();
        if (a == null || a.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        } else if (a.size() <= 6) {
            for (SharePhoto a2 : a) {
                aVar.mo8147a(a2);
            }
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[]{Integer.valueOf(6)}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10856b(ShareVideo shareVideo, C2340a aVar) {
        if (shareVideo != null) {
            Uri c = shareVideo.mo8332c();
            if (c == null) {
                throw new FacebookException("ShareVideo does not have a LocalUrl specified");
            } else if (!C2258x.m10403c(c) && !C2258x.m10407d(c)) {
                throw new FacebookException("ShareVideo must reference a video that is on the device");
            }
        } else {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m10857b(ShareVideoContent shareVideoContent, C2340a aVar) {
        aVar.mo8149a(shareVideoContent.mo8344d());
        SharePhoto c = shareVideoContent.mo8343c();
        if (c != null) {
            aVar.mo8147a(c);
        }
    }

    /* renamed from: c */
    private static void m10858c(SharePhoto sharePhoto, C2340a aVar) {
        m10835a(sharePhoto);
        Bitmap c = sharePhoto.mo8305c();
        Uri d = sharePhoto.mo8306d();
        if (c == null && C2258x.m10399b(d) && !aVar.mo8151a()) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m10859d(SharePhoto sharePhoto, C2340a aVar) {
        m10858c(sharePhoto, aVar);
        if (sharePhoto.mo8305c() != null || !C2258x.m10399b(sharePhoto.mo8306d())) {
            C2264y.m10432d(C2189f.m10092f());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m10860e(SharePhoto sharePhoto, C2340a aVar) {
        m10835a(sharePhoto);
    }
}
