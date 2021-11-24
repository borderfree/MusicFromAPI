package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.C2258x;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.c */
public class C2332c {

    /* renamed from: a */
    public static final Pattern f7459a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* renamed from: com.facebook.share.internal.c$1 */
    static /* synthetic */ class C23331 {

        /* renamed from: b */
        static final /* synthetic */ int[] f7461b = new int[ImageAspectRatio.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f7462c = new int[MediaType.values().length];

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003a */
        static {
            /*
                com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType[] r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7462c = r0
                r0 = 1
                int[] r1 = f7462c     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType r2 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio[] r1 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f7461b = r1
                int[] r1 = f7461b     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio r2 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.SQUARE     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio[] r1 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f7460a = r1
                int[] r1 = f7460a     // Catch:{ NoSuchFieldError -> 0x003a }
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio r2 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioCompact     // Catch:{ NoSuchFieldError -> 0x003a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003a }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x003a }
            L_0x003a:
                int[] r0 = f7460a     // Catch:{ NoSuchFieldError -> 0x0045 }
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio r1 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioTall     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C2332c.C23331.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m10778a(Uri uri) {
        String host = uri.getHost();
        return (C2258x.m10392a(host) || !f7459a.matcher(host).matches()) ? "IMAGE" : "uri";
    }

    /* renamed from: a */
    private static String m10779a(ImageAspectRatio imageAspectRatio) {
        return imageAspectRatio == null ? "horizontal" : C23331.f7461b[imageAspectRatio.ordinal()] != 1 ? "horizontal" : "square";
    }

    /* renamed from: a */
    private static String m10780a(MediaType mediaType) {
        return mediaType == null ? "image" : C23331.f7462c[mediaType.ordinal()] != 1 ? "image" : "video";
    }

    /* renamed from: a */
    private static String m10781a(WebviewHeightRatio webviewHeightRatio) {
        if (webviewHeightRatio == null) {
            return "full";
        }
        switch (webviewHeightRatio) {
            case WebviewHeightRatioCompact:
                return "compact";
            case WebviewHeightRatioTall:
                return "tall";
            default:
                return "full";
        }
    }

    /* renamed from: a */
    private static String m10782a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.mo8273f()) {
            return "hide";
        }
        return null;
    }

    /* renamed from: a */
    private static JSONObject m10783a(ShareMessengerActionButton shareMessengerActionButton) {
        return m10784a(shareMessengerActionButton, false);
    }

    /* renamed from: a */
    private static JSONObject m10784a(ShareMessengerActionButton shareMessengerActionButton, boolean z) {
        if (shareMessengerActionButton instanceof ShareMessengerURLActionButton) {
            return m10789a((ShareMessengerURLActionButton) shareMessengerActionButton, z);
        }
        return null;
    }

    /* renamed from: a */
    private static JSONObject m10785a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.mo8237a()).put("image_aspect_ratio", m10779a(shareMessengerGenericTemplateContent.mo8238b())).put("elements", new JSONArray().put(m10786a(shareMessengerGenericTemplateContent.mo8239c())))));
    }

    /* renamed from: a */
    private static JSONObject m10786a(ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) {
        JSONObject put = new JSONObject().put("title", shareMessengerGenericTemplateElement.mo8244a()).put("subtitle", shareMessengerGenericTemplateElement.mo8245b()).put("image_url", C2258x.m10364a(shareMessengerGenericTemplateElement.mo8246c()));
        if (shareMessengerGenericTemplateElement.mo8249e() != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m10783a(shareMessengerGenericTemplateElement.mo8249e()));
            put.put("buttons", jSONArray);
        }
        if (shareMessengerGenericTemplateElement.mo8247d() != null) {
            put.put("default_action", m10784a(shareMessengerGenericTemplateElement.mo8247d(), true));
        }
        return put;
    }

    /* renamed from: a */
    private static JSONObject m10787a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "media").put("elements", new JSONArray().put(m10796b(shareMessengerMediaTemplateContent)))));
    }

    /* renamed from: a */
    private static JSONObject m10788a(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        return new JSONObject().put("attachment", new JSONObject().put("type", "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", new JSONArray().put(m10797b(shareMessengerOpenGraphMusicTemplateContent)))));
    }

    /* renamed from: a */
    private static JSONObject m10789a(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) {
        return new JSONObject().put("type", "web_url").put("title", z ? null : shareMessengerURLActionButton.mo8234a()).put("url", C2258x.m10364a(shareMessengerURLActionButton.mo8269b())).put("webview_height_ratio", m10781a(shareMessengerURLActionButton.mo8272e())).put("messenger_extensions", shareMessengerURLActionButton.mo8270c()).put("fallback_url", C2258x.m10364a(shareMessengerURLActionButton.mo8271d())).put("webview_share_button", m10782a(shareMessengerURLActionButton));
    }

    /* renamed from: a */
    private static void m10790a(Bundle bundle, ShareMessengerActionButton shareMessengerActionButton, boolean z) {
        if (shareMessengerActionButton != null && (shareMessengerActionButton instanceof ShareMessengerURLActionButton)) {
            m10795a(bundle, (ShareMessengerURLActionButton) shareMessengerActionButton, z);
        }
    }

    /* renamed from: a */
    public static void m10791a(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        m10792a(bundle, shareMessengerGenericTemplateContent.mo8239c());
        C2258x.m10389a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) m10785a(shareMessengerGenericTemplateContent));
    }

    /* renamed from: a */
    private static void m10792a(Bundle bundle, ShareMessengerGenericTemplateElement shareMessengerGenericTemplateElement) {
        ShareMessengerActionButton d;
        boolean z;
        if (shareMessengerGenericTemplateElement.mo8249e() != null) {
            d = shareMessengerGenericTemplateElement.mo8249e();
            z = false;
        } else {
            if (shareMessengerGenericTemplateElement.mo8247d() != null) {
                d = shareMessengerGenericTemplateElement.mo8247d();
                z = true;
            }
            C2258x.m10377a(bundle, "IMAGE", shareMessengerGenericTemplateElement.mo8246c());
            C2258x.m10378a(bundle, "PREVIEW_TYPE", "DEFAULT");
            C2258x.m10378a(bundle, "TITLE", shareMessengerGenericTemplateElement.mo8244a());
            C2258x.m10378a(bundle, "SUBTITLE", shareMessengerGenericTemplateElement.mo8245b());
        }
        m10790a(bundle, d, z);
        C2258x.m10377a(bundle, "IMAGE", shareMessengerGenericTemplateElement.mo8246c());
        C2258x.m10378a(bundle, "PREVIEW_TYPE", "DEFAULT");
        C2258x.m10378a(bundle, "TITLE", shareMessengerGenericTemplateElement.mo8244a());
        C2258x.m10378a(bundle, "SUBTITLE", shareMessengerGenericTemplateElement.mo8245b());
    }

    /* renamed from: a */
    public static void m10793a(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        m10798b(bundle, shareMessengerMediaTemplateContent);
        C2258x.m10389a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) m10787a(shareMessengerMediaTemplateContent));
    }

    /* renamed from: a */
    public static void m10794a(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        m10799b(bundle, shareMessengerOpenGraphMusicTemplateContent);
        C2258x.m10389a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) m10788a(shareMessengerOpenGraphMusicTemplateContent));
    }

    /* renamed from: a */
    private static void m10795a(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) {
        String str;
        if (z) {
            str = C2258x.m10364a(shareMessengerURLActionButton.mo8269b());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(shareMessengerURLActionButton.mo8234a());
            sb.append(" - ");
            sb.append(C2258x.m10364a(shareMessengerURLActionButton.mo8269b()));
            str = sb.toString();
        }
        C2258x.m10378a(bundle, "TARGET_DISPLAY", str);
        C2258x.m10377a(bundle, "ITEM_URL", shareMessengerURLActionButton.mo8269b());
    }

    /* renamed from: b */
    private static JSONObject m10796b(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.mo8256b()).put("url", C2258x.m10364a(shareMessengerMediaTemplateContent.mo8257c())).put("media_type", m10780a(shareMessengerMediaTemplateContent.mo8255a()));
        if (shareMessengerMediaTemplateContent.mo8258d() != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m10783a(shareMessengerMediaTemplateContent.mo8258d()));
            put.put("buttons", jSONArray);
        }
        return put;
    }

    /* renamed from: b */
    private static JSONObject m10797b(ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        JSONObject put = new JSONObject().put("url", C2258x.m10364a(shareMessengerOpenGraphMusicTemplateContent.mo8263a()));
        if (shareMessengerOpenGraphMusicTemplateContent.mo8264b() != null) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(m10783a(shareMessengerOpenGraphMusicTemplateContent.mo8264b()));
            put.put("buttons", jSONArray);
        }
        return put;
    }

    /* renamed from: b */
    private static void m10798b(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        m10790a(bundle, shareMessengerMediaTemplateContent.mo8258d(), false);
        C2258x.m10378a(bundle, "PREVIEW_TYPE", "DEFAULT");
        C2258x.m10378a(bundle, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.mo8256b());
        if (shareMessengerMediaTemplateContent.mo8257c() != null) {
            C2258x.m10377a(bundle, m10778a(shareMessengerMediaTemplateContent.mo8257c()), shareMessengerMediaTemplateContent.mo8257c());
        }
        C2258x.m10378a(bundle, "type", m10780a(shareMessengerMediaTemplateContent.mo8255a()));
    }

    /* renamed from: b */
    private static void m10799b(Bundle bundle, ShareMessengerOpenGraphMusicTemplateContent shareMessengerOpenGraphMusicTemplateContent) {
        m10790a(bundle, shareMessengerOpenGraphMusicTemplateContent.mo8264b(), false);
        C2258x.m10378a(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
        C2258x.m10377a(bundle, "OPEN_GRAPH_URL", shareMessengerOpenGraphMusicTemplateContent.mo8263a());
    }
}
