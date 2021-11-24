package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C3464ci
public final class bbt extends bbj {

    /* renamed from: a */
    private final NativeContentAdMapper f13541a;

    public bbt(NativeContentAdMapper nativeContentAdMapper) {
        this.f13541a = nativeContentAdMapper;
    }

    /* renamed from: a */
    public final String mo12735a() {
        return this.f13541a.getHeadline();
    }

    /* renamed from: a */
    public final void mo12736a(C3323b bVar) {
        this.f13541a.handleClick((View) C3327d.m15137a(bVar));
    }

    /* renamed from: a */
    public final void mo12737a(C3323b bVar, C3323b bVar2, C3323b bVar3) {
        this.f13541a.trackViews((View) C3327d.m15137a(bVar), (HashMap) C3327d.m15137a(bVar2), (HashMap) C3327d.m15137a(bVar3));
    }

    /* renamed from: b */
    public final List mo12738b() {
        List<Image> images = this.f13541a.getImages();
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
    public final void mo12739b(C3323b bVar) {
        this.f13541a.trackView((View) C3327d.m15137a(bVar));
    }

    /* renamed from: c */
    public final String mo12740c() {
        return this.f13541a.getBody();
    }

    /* renamed from: c */
    public final void mo12741c(C3323b bVar) {
        this.f13541a.untrackView((View) C3327d.m15137a(bVar));
    }

    /* renamed from: d */
    public final asy mo12742d() {
        Image logo = this.f13541a.getLogo();
        if (logo != null) {
            return new arp(logo.getDrawable(), logo.getUri(), logo.getScale());
        }
        return null;
    }

    /* renamed from: e */
    public final String mo12743e() {
        return this.f13541a.getCallToAction();
    }

    /* renamed from: f */
    public final String mo12744f() {
        return this.f13541a.getAdvertiser();
    }

    /* renamed from: g */
    public final void mo12745g() {
        this.f13541a.recordImpression();
    }

    /* renamed from: h */
    public final boolean mo12746h() {
        return this.f13541a.getOverrideImpressionRecording();
    }

    /* renamed from: i */
    public final boolean mo12747i() {
        return this.f13541a.getOverrideClickHandling();
    }

    /* renamed from: j */
    public final Bundle mo12748j() {
        return this.f13541a.getExtras();
    }

    /* renamed from: k */
    public final C3323b mo12749k() {
        View adChoicesContent = this.f13541a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return C3327d.m15136a(adChoicesContent);
    }

    /* renamed from: l */
    public final aos mo12750l() {
        if (this.f13541a.getVideoController() != null) {
            return this.f13541a.getVideoController().zzbc();
        }
        return null;
    }

    /* renamed from: m */
    public final asu mo12751m() {
        return null;
    }

    /* renamed from: n */
    public final C3323b mo12752n() {
        View zzvy = this.f13541a.zzvy();
        if (zzvy == null) {
            return null;
        }
        return C3327d.m15136a(zzvy);
    }

    /* renamed from: o */
    public final C3323b mo12753o() {
        return null;
    }
}
