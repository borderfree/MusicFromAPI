package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzag;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

final class azx implements zzag {

    /* renamed from: a */
    private final ayw f13396a;

    /* renamed from: b */
    private final C3763nj f13397b;

    /* renamed from: c */
    private final /* synthetic */ azu f13398c;

    public azx(azu azu, ayw ayw, C3763nj njVar) {
        this.f13398c = azu;
        this.f13396a = ayw;
        this.f13397b = njVar;
    }

    public final void zzau(@Nullable String str) {
        if (str == null) {
            try {
                this.f13397b.mo13295a(new zzwe());
            } catch (IllegalStateException unused) {
            } catch (Throwable th) {
                this.f13396a.mo12638c();
                throw th;
            }
        } else {
            this.f13397b.mo13295a(new zzwe(str));
        }
        this.f13396a.mo12638c();
    }

    public final void zzd(JSONObject jSONObject) {
        try {
            this.f13397b.mo13296b(this.f13398c.f13386a.mo12648a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f13397b.mo13296b(e);
        } catch (Throwable th) {
            this.f13396a.mo12638c();
            throw th;
        }
        this.f13396a.mo12638c();
    }
}
