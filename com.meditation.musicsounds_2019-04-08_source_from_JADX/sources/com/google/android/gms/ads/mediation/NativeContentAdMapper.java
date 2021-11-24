package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAd.Image;
import java.util.List;

public class NativeContentAdMapper extends NativeAdMapper {

    /* renamed from: e */
    private String f10312e;

    /* renamed from: f */
    private List<Image> f10313f;

    /* renamed from: g */
    private String f10314g;

    /* renamed from: h */
    private Image f10315h;

    /* renamed from: i */
    private String f10316i;

    /* renamed from: j */
    private String f10317j;

    public final String getAdvertiser() {
        return this.f10317j;
    }

    public final String getBody() {
        return this.f10314g;
    }

    public final String getCallToAction() {
        return this.f10316i;
    }

    public final String getHeadline() {
        return this.f10312e;
    }

    public final List<Image> getImages() {
        return this.f10313f;
    }

    public final Image getLogo() {
        return this.f10315h;
    }

    public final void setAdvertiser(String str) {
        this.f10317j = str;
    }

    public final void setBody(String str) {
        this.f10314g = str;
    }

    public final void setCallToAction(String str) {
        this.f10316i = str;
    }

    public final void setHeadline(String str) {
        this.f10312e = str;
    }

    public final void setImages(List<Image> list) {
        this.f10313f = list;
    }

    public final void setLogo(Image image) {
        this.f10315h = image;
    }
}
