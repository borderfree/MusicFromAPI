package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public class NativeAppInstallAdMapper extends NativeAdMapper {

    /* renamed from: e */
    private String f10304e;

    /* renamed from: f */
    private List<Image> f10305f;

    /* renamed from: g */
    private String f10306g;

    /* renamed from: h */
    private Image f10307h;

    /* renamed from: i */
    private String f10308i;

    /* renamed from: j */
    private double f10309j;

    /* renamed from: k */
    private String f10310k;

    /* renamed from: l */
    private String f10311l;

    public final String getBody() {
        return this.f10306g;
    }

    public final String getCallToAction() {
        return this.f10308i;
    }

    public final String getHeadline() {
        return this.f10304e;
    }

    public final Image getIcon() {
        return this.f10307h;
    }

    public final List<Image> getImages() {
        return this.f10305f;
    }

    public final String getPrice() {
        return this.f10311l;
    }

    public final double getStarRating() {
        return this.f10309j;
    }

    public final String getStore() {
        return this.f10310k;
    }

    public final void setBody(String str) {
        this.f10306g = str;
    }

    public final void setCallToAction(String str) {
        this.f10308i = str;
    }

    public final void setHeadline(String str) {
        this.f10304e = str;
    }

    public final void setIcon(Image image) {
        this.f10307h = image;
    }

    public final void setImages(List<Image> list) {
        this.f10305f = list;
    }

    public final void setPrice(String str) {
        this.f10311l = str;
    }

    public final void setStarRating(double d) {
        this.f10309j = d;
    }

    public final void setStore(String str) {
        this.f10310k = str;
    }
}
