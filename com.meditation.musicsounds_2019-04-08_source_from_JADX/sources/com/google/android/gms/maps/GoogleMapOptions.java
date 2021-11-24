package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.C3261q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.maps.C4593h.C4594a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CameraPosition.C4600a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.p133a.C4560h;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleMapOptions> CREATOR = new C4596j();

    /* renamed from: a */
    private Boolean f16543a;

    /* renamed from: b */
    private Boolean f16544b;

    /* renamed from: c */
    private int f16545c = -1;

    /* renamed from: d */
    private CameraPosition f16546d;

    /* renamed from: e */
    private Boolean f16547e;

    /* renamed from: f */
    private Boolean f16548f;

    /* renamed from: g */
    private Boolean f16549g;

    /* renamed from: h */
    private Boolean f16550h;

    /* renamed from: i */
    private Boolean f16551i;

    /* renamed from: j */
    private Boolean f16552j;

    /* renamed from: k */
    private Boolean f16553k;

    /* renamed from: l */
    private Boolean f16554l;

    /* renamed from: m */
    private Boolean f16555m;

    /* renamed from: n */
    private Float f16556n = null;

    /* renamed from: o */
    private Float f16557o = null;

    /* renamed from: p */
    private LatLngBounds f16558p = null;

    public GoogleMapOptions() {
    }

    GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds) {
        this.f16543a = C4560h.m22749a(b);
        this.f16544b = C4560h.m22749a(b2);
        this.f16545c = i;
        this.f16546d = cameraPosition;
        this.f16547e = C4560h.m22749a(b3);
        this.f16548f = C4560h.m22749a(b4);
        this.f16549g = C4560h.m22749a(b5);
        this.f16550h = C4560h.m22749a(b6);
        this.f16551i = C4560h.m22749a(b7);
        this.f16552j = C4560h.m22749a(b8);
        this.f16553k = C4560h.m22749a(b9);
        this.f16554l = C4560h.m22749a(b10);
        this.f16555m = C4560h.m22749a(b11);
        this.f16556n = f;
        this.f16557o = f2;
        this.f16558p = latLngBounds;
    }

    /* renamed from: a */
    public static GoogleMapOptions m22629a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C4594a.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(C4594a.MapAttrs_mapType)) {
            googleMapOptions.mo15012a(obtainAttributes.getInt(C4594a.MapAttrs_mapType, -1));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_zOrderOnTop)) {
            googleMapOptions.mo15015a(obtainAttributes.getBoolean(C4594a.MapAttrs_zOrderOnTop, false));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_useViewLifecycle)) {
            googleMapOptions.mo15017b(obtainAttributes.getBoolean(C4594a.MapAttrs_useViewLifecycle, false));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_uiCompass)) {
            googleMapOptions.mo15021d(obtainAttributes.getBoolean(C4594a.MapAttrs_uiCompass, true));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_uiRotateGestures)) {
            googleMapOptions.mo15027h(obtainAttributes.getBoolean(C4594a.MapAttrs_uiRotateGestures, true));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_uiScrollGestures)) {
            googleMapOptions.mo15023e(obtainAttributes.getBoolean(C4594a.MapAttrs_uiScrollGestures, true));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_uiTiltGestures)) {
            googleMapOptions.mo15026g(obtainAttributes.getBoolean(C4594a.MapAttrs_uiTiltGestures, true));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_uiZoomGestures)) {
            googleMapOptions.mo15025f(obtainAttributes.getBoolean(C4594a.MapAttrs_uiZoomGestures, true));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_uiZoomControls)) {
            googleMapOptions.mo15019c(obtainAttributes.getBoolean(C4594a.MapAttrs_uiZoomControls, true));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_liteMode)) {
            googleMapOptions.mo15028i(obtainAttributes.getBoolean(C4594a.MapAttrs_liteMode, false));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_uiMapToolbar)) {
            googleMapOptions.mo15029j(obtainAttributes.getBoolean(C4594a.MapAttrs_uiMapToolbar, true));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_ambientEnabled)) {
            googleMapOptions.mo15030k(obtainAttributes.getBoolean(C4594a.MapAttrs_ambientEnabled, false));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.mo15011a(obtainAttributes.getFloat(C4594a.MapAttrs_cameraMinZoomPreference, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_cameraMinZoomPreference)) {
            googleMapOptions.mo15016b(obtainAttributes.getFloat(C4594a.MapAttrs_cameraMaxZoomPreference, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.mo15014a(m22630b(context, attributeSet));
        googleMapOptions.mo15013a(m22631c(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* renamed from: b */
    public static LatLngBounds m22630b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C4594a.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(C4594a.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes.getFloat(C4594a.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(C4594a.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes.getFloat(C4594a.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(C4594a.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes.getFloat(C4594a.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(C4594a.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes.getFloat(C4594a.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    /* renamed from: c */
    public static CameraPosition m22631c(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C4594a.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(C4594a.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(C4594a.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(C4594a.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(C4594a.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        C4600a a = CameraPosition.m22832a();
        a.mo15139a(latLng);
        if (obtainAttributes.hasValue(C4594a.MapAttrs_cameraZoom)) {
            a.mo15138a(obtainAttributes.getFloat(C4594a.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_cameraBearing)) {
            a.mo15142c(obtainAttributes.getFloat(C4594a.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(C4594a.MapAttrs_cameraTilt)) {
            a.mo15141b(obtainAttributes.getFloat(C4594a.MapAttrs_cameraTilt, 0.0f));
        }
        obtainAttributes.recycle();
        return a.mo15140a();
    }

    /* renamed from: a */
    public final int mo15010a() {
        return this.f16545c;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo15011a(float f) {
        this.f16556n = Float.valueOf(f);
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo15012a(int i) {
        this.f16545c = i;
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo15013a(CameraPosition cameraPosition) {
        this.f16546d = cameraPosition;
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo15014a(LatLngBounds latLngBounds) {
        this.f16558p = latLngBounds;
        return this;
    }

    /* renamed from: a */
    public final GoogleMapOptions mo15015a(boolean z) {
        this.f16543a = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final GoogleMapOptions mo15016b(float f) {
        this.f16557o = Float.valueOf(f);
        return this;
    }

    /* renamed from: b */
    public final GoogleMapOptions mo15017b(boolean z) {
        this.f16544b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final CameraPosition mo15018b() {
        return this.f16546d;
    }

    /* renamed from: c */
    public final GoogleMapOptions mo15019c(boolean z) {
        this.f16547e = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final Float mo15020c() {
        return this.f16556n;
    }

    /* renamed from: d */
    public final GoogleMapOptions mo15021d(boolean z) {
        this.f16548f = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: d */
    public final Float mo15022d() {
        return this.f16557o;
    }

    /* renamed from: e */
    public final GoogleMapOptions mo15023e(boolean z) {
        this.f16549g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: e */
    public final LatLngBounds mo15024e() {
        return this.f16558p;
    }

    /* renamed from: f */
    public final GoogleMapOptions mo15025f(boolean z) {
        this.f16550h = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: g */
    public final GoogleMapOptions mo15026g(boolean z) {
        this.f16551i = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: h */
    public final GoogleMapOptions mo15027h(boolean z) {
        this.f16552j = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: i */
    public final GoogleMapOptions mo15028i(boolean z) {
        this.f16553k = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: j */
    public final GoogleMapOptions mo15029j(boolean z) {
        this.f16554l = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: k */
    public final GoogleMapOptions mo15030k(boolean z) {
        this.f16555m = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return C3261q.m14905a((Object) this).mo11288a("MapType", Integer.valueOf(this.f16545c)).mo11288a("LiteMode", this.f16553k).mo11288a("Camera", this.f16546d).mo11288a("CompassEnabled", this.f16548f).mo11288a("ZoomControlsEnabled", this.f16547e).mo11288a("ScrollGesturesEnabled", this.f16549g).mo11288a("ZoomGesturesEnabled", this.f16550h).mo11288a("TiltGesturesEnabled", this.f16551i).mo11288a("RotateGesturesEnabled", this.f16552j).mo11288a("MapToolbarEnabled", this.f16554l).mo11288a("AmbientEnabled", this.f16555m).mo11288a("MinZoomPreference", this.f16556n).mo11288a("MaxZoomPreference", this.f16557o).mo11288a("LatLngBoundsForCameraTarget", this.f16558p).mo11288a("ZOrderOnTop", this.f16543a).mo11288a("UseViewLifecycleInFragment", this.f16544b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14957a(parcel, 2, C4560h.m22748a(this.f16543a));
        C3267a.m14957a(parcel, 3, C4560h.m22748a(this.f16544b));
        C3267a.m14960a(parcel, 4, mo15010a());
        C3267a.m14964a(parcel, 5, (Parcelable) mo15018b(), i, false);
        C3267a.m14957a(parcel, 6, C4560h.m22748a(this.f16547e));
        C3267a.m14957a(parcel, 7, C4560h.m22748a(this.f16548f));
        C3267a.m14957a(parcel, 8, C4560h.m22748a(this.f16549g));
        C3267a.m14957a(parcel, 9, C4560h.m22748a(this.f16550h));
        C3267a.m14957a(parcel, 10, C4560h.m22748a(this.f16551i));
        C3267a.m14957a(parcel, 11, C4560h.m22748a(this.f16552j));
        C3267a.m14957a(parcel, 12, C4560h.m22748a(this.f16553k));
        C3267a.m14957a(parcel, 14, C4560h.m22748a(this.f16554l));
        C3267a.m14957a(parcel, 15, C4560h.m22748a(this.f16555m));
        C3267a.m14966a(parcel, 16, mo15020c(), false);
        C3267a.m14966a(parcel, 17, mo15022d(), false);
        C3267a.m14964a(parcel, 18, (Parcelable) mo15024e(), i, false);
        C3267a.m14956a(parcel, a);
    }
}
