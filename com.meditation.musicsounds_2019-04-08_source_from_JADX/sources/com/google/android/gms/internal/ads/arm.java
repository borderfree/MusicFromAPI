package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import java.lang.ref.WeakReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class arm implements OnClickListener {

    /* renamed from: a */
    String f12971a;

    /* renamed from: b */
    Long f12972b;

    /* renamed from: c */
    WeakReference<View> f12973c;

    /* renamed from: d */
    private final C3442bn f12974d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public aur f12975e;

    /* renamed from: f */
    private zzv f12976f;

    public arm(C3442bn bnVar) {
        this.f12974d = bnVar;
    }

    /* renamed from: c */
    private final void m17000c() {
        this.f12971a = null;
        this.f12972b = null;
        if (this.f12973c != null) {
            View view = (View) this.f12973c.get();
            this.f12973c = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
            }
        }
    }

    /* renamed from: a */
    public final aur mo12349a() {
        return this.f12975e;
    }

    /* renamed from: a */
    public final void mo12350a(aur aur) {
        this.f12975e = aur;
        if (this.f12976f != null) {
            this.f12974d.mo12820b("/unconfirmedClick", this.f12976f);
        }
        this.f12976f = new arn(this);
        this.f12974d.mo12817a("/unconfirmedClick", this.f12976f);
    }

    /* renamed from: b */
    public final void mo12351b() {
        if (this.f12975e != null && this.f12972b != null) {
            m17000c();
            try {
                this.f12975e.mo12517a();
            } catch (RemoteException e) {
                C3731me.m19177d("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onClick(View view) {
        if (this.f12973c != null && this.f12973c.get() == view) {
            if (!(this.f12971a == null || this.f12972b == null)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f12971a);
                    jSONObject.put("time_interval", zzbv.zzer().mo11326a() - this.f12972b.longValue());
                    jSONObject.put("messageType", "onePointFiveClick");
                    this.f12974d.mo12818a("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e) {
                    C3643iy.m19173b("Unable to dispatch sendMessageToNativeJs event", e);
                }
            }
            m17000c();
        }
    }
}
