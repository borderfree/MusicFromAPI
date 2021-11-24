package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.internal.ads.C3464ci;
import java.util.List;
import java.util.Map;

@C3464ci
public class UnifiedNativeAdMapper {

    /* renamed from: a */
    private String f10318a;

    /* renamed from: b */
    private List<Image> f10319b;

    /* renamed from: c */
    private String f10320c;

    /* renamed from: d */
    private Image f10321d;

    /* renamed from: e */
    private String f10322e;

    /* renamed from: f */
    private String f10323f;

    /* renamed from: g */
    private Double f10324g;

    /* renamed from: h */
    private String f10325h;

    /* renamed from: i */
    private String f10326i;

    /* renamed from: j */
    private VideoController f10327j;

    /* renamed from: k */
    private boolean f10328k;

    /* renamed from: l */
    private View f10329l;

    /* renamed from: m */
    private View f10330m;

    /* renamed from: n */
    private Object f10331n;

    /* renamed from: o */
    private Bundle f10332o = new Bundle();

    /* renamed from: p */
    private boolean f10333p;

    /* renamed from: q */
    private boolean f10334q;

    public View getAdChoicesContent() {
        return this.f10329l;
    }

    public final String getAdvertiser() {
        return this.f10323f;
    }

    public final String getBody() {
        return this.f10320c;
    }

    public final String getCallToAction() {
        return this.f10322e;
    }

    public final Bundle getExtras() {
        return this.f10332o;
    }

    public final String getHeadline() {
        return this.f10318a;
    }

    public final Image getIcon() {
        return this.f10321d;
    }

    public final List<Image> getImages() {
        return this.f10319b;
    }

    public final boolean getOverrideClickHandling() {
        return this.f10334q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f10333p;
    }

    public final String getPrice() {
        return this.f10326i;
    }

    public final Double getStarRating() {
        return this.f10324g;
    }

    public final String getStore() {
        return this.f10325h;
    }

    public final VideoController getVideoController() {
        return this.f10327j;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.f10328k;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.f10329l = view;
    }

    public final void setAdvertiser(String str) {
        this.f10323f = str;
    }

    public final void setBody(String str) {
        this.f10320c = str;
    }

    public final void setCallToAction(String str) {
        this.f10322e = str;
    }

    public final void setExtras(Bundle bundle) {
        this.f10332o = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.f10328k = z;
    }

    public final void setHeadline(String str) {
        this.f10318a = str;
    }

    public final void setIcon(Image image) {
        this.f10321d = image;
    }

    public final void setImages(List<Image> list) {
        this.f10319b = list;
    }

    public void setMediaView(View view) {
        this.f10330m = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f10334q = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f10333p = z;
    }

    public final void setPrice(String str) {
        this.f10326i = str;
    }

    public final void setStarRating(Double d) {
        this.f10324g = d;
    }

    public final void setStore(String str) {
        this.f10325h = str;
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void zza(VideoController videoController) {
        this.f10327j = videoController;
    }

    public final Object zzbh() {
        return this.f10331n;
    }

    public final void zzl(Object obj) {
        this.f10331n = obj;
    }

    public final View zzvy() {
        return this.f10330m;
    }
}
