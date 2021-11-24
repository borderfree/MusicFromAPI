package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.C3464ci;
import java.util.Map;

@C3464ci
public class NativeAdMapper {

    /* renamed from: a */
    protected boolean f10297a;

    /* renamed from: b */
    protected boolean f10298b;

    /* renamed from: c */
    protected Bundle f10299c = new Bundle();

    /* renamed from: d */
    protected View f10300d;

    /* renamed from: e */
    private View f10301e;

    /* renamed from: f */
    private VideoController f10302f;

    /* renamed from: g */
    private boolean f10303g;

    public View getAdChoicesContent() {
        return this.f10300d;
    }

    public final Bundle getExtras() {
        return this.f10299c;
    }

    public final boolean getOverrideClickHandling() {
        return this.f10298b;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f10297a;
    }

    public final VideoController getVideoController() {
        return this.f10302f;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.f10303g;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.f10300d = view;
    }

    public final void setExtras(Bundle bundle) {
        this.f10299c = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.f10303g = z;
    }

    public void setMediaView(View view) {
        this.f10301e = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.f10298b = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.f10297a = z;
    }

    @Deprecated
    public void trackView(View view) {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void zza(VideoController videoController) {
        this.f10302f = videoController;
    }

    public final View zzvy() {
        return this.f10301e;
    }
}
