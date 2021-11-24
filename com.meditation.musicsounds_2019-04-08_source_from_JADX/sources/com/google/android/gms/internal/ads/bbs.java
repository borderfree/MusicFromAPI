package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C3464ci
public final class bbs extends bbg {

    /* renamed from: a */
    private final NativeAppInstallAdMapper f13540a;

    public bbs(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.f13540a = nativeAppInstallAdMapper;
    }

    /* renamed from: a */
    public final String mo12713a() {
        return this.f13540a.getHeadline();
    }

    /* renamed from: a */
    public final void mo12714a(C3323b bVar) {
        this.f13540a.handleClick((View) C3327d.m15137a(bVar));
    }

    /* renamed from: a */
    public final void mo12715a(C3323b bVar, C3323b bVar2, C3323b bVar3) {
        this.f13540a.trackViews((View) C3327d.m15137a(bVar), (HashMap) C3327d.m15137a(bVar2), (HashMap) C3327d.m15137a(bVar3));
    }

    /* renamed from: b */
    public final List mo12716b() {
        List<Image> images = this.f13540a.getImages();
        if (images == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Image image : images) {
            arrayList.add(new arp(image.getDrawable(), image.getUri(), image.getScale()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo12717b(C3323b bVar) {
        this.f13540a.trackView((View) C3327d.m15137a(bVar));
    }

    /* renamed from: c */
    public final String mo12718c() {
        return this.f13540a.getBody();
    }

    /* renamed from: c */
    public final void mo12719c(C3323b bVar) {
        this.f13540a.untrackView((View) C3327d.m15137a(bVar));
    }

    /* renamed from: d */
    public final asy mo12720d() {
        Image icon = this.f13540a.getIcon();
        if (icon != null) {
            return new arp(icon.getDrawable(), icon.getUri(), icon.getScale());
        }
        return null;
    }

    /* renamed from: e */
    public final String mo12721e() {
        return this.f13540a.getCallToAction();
    }

    /* renamed from: f */
    public final double mo12722f() {
        return this.f13540a.getStarRating();
    }

    /* renamed from: g */
    public final String mo12723g() {
        return this.f13540a.getStore();
    }

    /* renamed from: h */
    public final String mo12724h() {
        return this.f13540a.getPrice();
    }

    /* renamed from: i */
    public final void mo12725i() {
        this.f13540a.recordImpression();
    }

    /* renamed from: j */
    public final boolean mo12726j() {
        return this.f13540a.getOverrideImpressionRecording();
    }

    /* renamed from: k */
    public final boolean mo12727k() {
        return this.f13540a.getOverrideClickHandling();
    }

    /* renamed from: l */
    public final Bundle mo12728l() {
        return this.f13540a.getExtras();
    }

    /* renamed from: m */
    public final aos mo12729m() {
        if (this.f13540a.getVideoController() != null) {
            return this.f13540a.getVideoController().zzbc();
        }
        return null;
    }

    /* renamed from: n */
    public final C3323b mo12730n() {
        View adChoicesContent = this.f13540a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return C3327d.m15136a(adChoicesContent);
    }

    /* renamed from: o */
    public final asu mo12731o() {
        return null;
    }

    /* renamed from: p */
    public final C3323b mo12732p() {
        View zzvy = this.f13540a.zzvy();
        if (zzvy == null) {
            return null;
        }
        return C3327d.m15136a(zzvy);
    }

    /* renamed from: q */
    public final C3323b mo12733q() {
        return null;
    }
}
