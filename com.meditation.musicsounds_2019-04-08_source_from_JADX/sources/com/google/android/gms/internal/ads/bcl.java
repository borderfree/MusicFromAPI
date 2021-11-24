package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C3464ci
public final class bcl extends bbm {

    /* renamed from: a */
    private final UnifiedNativeAdMapper f13575a;

    public bcl(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.f13575a = unifiedNativeAdMapper;
    }

    /* renamed from: a */
    public final String mo12754a() {
        return this.f13575a.getHeadline();
    }

    /* renamed from: a */
    public final void mo12755a(C3323b bVar) {
        this.f13575a.handleClick((View) C3327d.m15137a(bVar));
    }

    /* renamed from: a */
    public final void mo12756a(C3323b bVar, C3323b bVar2, C3323b bVar3) {
        this.f13575a.trackViews((View) C3327d.m15137a(bVar), (HashMap) C3327d.m15137a(bVar2), (HashMap) C3327d.m15137a(bVar3));
    }

    /* renamed from: b */
    public final List mo12757b() {
        List<Image> images = this.f13575a.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (Image image : images) {
                arrayList.add(new arp(image.getDrawable(), image.getUri(), image.getScale()));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo12758b(C3323b bVar) {
        this.f13575a.untrackView((View) C3327d.m15137a(bVar));
    }

    /* renamed from: c */
    public final String mo12759c() {
        return this.f13575a.getBody();
    }

    /* renamed from: d */
    public final asy mo12760d() {
        Image icon = this.f13575a.getIcon();
        if (icon != null) {
            return new arp(icon.getDrawable(), icon.getUri(), icon.getScale());
        }
        return null;
    }

    /* renamed from: e */
    public final String mo12761e() {
        return this.f13575a.getCallToAction();
    }

    /* renamed from: f */
    public final String mo12762f() {
        return this.f13575a.getAdvertiser();
    }

    /* renamed from: g */
    public final double mo12763g() {
        if (this.f13575a.getStarRating() != null) {
            return this.f13575a.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: h */
    public final String mo12764h() {
        return this.f13575a.getStore();
    }

    /* renamed from: i */
    public final String mo12765i() {
        return this.f13575a.getPrice();
    }

    /* renamed from: j */
    public final aos mo12766j() {
        if (this.f13575a.getVideoController() != null) {
            return this.f13575a.getVideoController().zzbc();
        }
        return null;
    }

    /* renamed from: k */
    public final asu mo12767k() {
        return null;
    }

    /* renamed from: l */
    public final C3323b mo12768l() {
        View adChoicesContent = this.f13575a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return C3327d.m15136a(adChoicesContent);
    }

    /* renamed from: m */
    public final C3323b mo12769m() {
        View zzvy = this.f13575a.zzvy();
        if (zzvy == null) {
            return null;
        }
        return C3327d.m15136a(zzvy);
    }

    /* renamed from: n */
    public final C3323b mo12770n() {
        Object zzbh = this.f13575a.zzbh();
        if (zzbh == null) {
            return null;
        }
        return C3327d.m15136a(zzbh);
    }

    /* renamed from: o */
    public final Bundle mo12771o() {
        return this.f13575a.getExtras();
    }

    /* renamed from: p */
    public final boolean mo12772p() {
        return this.f13575a.getOverrideImpressionRecording();
    }

    /* renamed from: q */
    public final boolean mo12773q() {
        return this.f13575a.getOverrideClickHandling();
    }

    /* renamed from: r */
    public final void mo12774r() {
        this.f13575a.recordImpression();
    }
}
