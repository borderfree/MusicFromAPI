package com.facebook.login;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.app.C0366g;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.C2189f;
import com.facebook.C2195g;
import com.facebook.C2199i;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1609b;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.common.C2179a.C2181b;
import com.facebook.common.C2179a.C2182c;
import com.facebook.common.C2179a.C2183d;
import com.facebook.common.C2179a.C2184e;
import com.facebook.devicerequests.p098a.C2186a;
import com.facebook.internal.C2232n;
import com.facebook.internal.C2258x;
import com.facebook.internal.C2258x.C2263c;
import com.facebook.internal.C2264y;
import com.facebook.internal.SmartLoginOption;
import com.facebook.login.LoginClient.Request;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceAuthDialog extends C0366g {

    /* renamed from: ae */
    private ProgressBar f7321ae;

    /* renamed from: af */
    private TextView f7322af;

    /* renamed from: ag */
    private TextView f7323ag;

    /* renamed from: ah */
    private DeviceAuthMethodHandler f7324ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public AtomicBoolean f7325ai = new AtomicBoolean();

    /* renamed from: aj */
    private volatile C2195g f7326aj;

    /* renamed from: ak */
    private volatile ScheduledFuture f7327ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public volatile RequestState f7328al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public Dialog f7329am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public boolean f7330an = false;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public boolean f7331ao = false;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public Request f7332ap = null;

    private static class RequestState implements Parcelable {
        public static final Creator<RequestState> CREATOR = new Creator<RequestState>() {
            /* renamed from: a */
            public RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            /* renamed from: a */
            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        };

        /* renamed from: a */
        private String f7344a;

        /* renamed from: b */
        private String f7345b;

        /* renamed from: c */
        private String f7346c;

        /* renamed from: d */
        private long f7347d;

        /* renamed from: e */
        private long f7348e;

        RequestState() {
        }

        protected RequestState(Parcel parcel) {
            this.f7345b = parcel.readString();
            this.f7346c = parcel.readString();
            this.f7347d = parcel.readLong();
            this.f7348e = parcel.readLong();
        }

        /* renamed from: a */
        public String mo7951a() {
            return this.f7344a;
        }

        /* renamed from: a */
        public void mo7952a(long j) {
            this.f7347d = j;
        }

        /* renamed from: a */
        public void mo7953a(String str) {
            this.f7345b = str;
            this.f7344a = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        /* renamed from: b */
        public String mo7954b() {
            return this.f7345b;
        }

        /* renamed from: b */
        public void mo7955b(long j) {
            this.f7348e = j;
        }

        /* renamed from: b */
        public void mo7956b(String str) {
            this.f7346c = str;
        }

        /* renamed from: c */
        public String mo7957c() {
            return this.f7346c;
        }

        /* renamed from: d */
        public long mo7958d() {
            return this.f7347d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public boolean mo7960e() {
            boolean z = false;
            if (this.f7348e == 0) {
                return false;
            }
            if ((new Date().getTime() - this.f7348e) - (this.f7347d * 1000) < 0) {
                z = true;
            }
            return z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f7345b);
            parcel.writeString(this.f7346c);
            parcel.writeLong(this.f7347d);
            parcel.writeLong(this.f7348e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10503a(FacebookException facebookException) {
        if (this.f7325ai.compareAndSet(false, true)) {
            if (this.f7328al != null) {
                C2186a.m10075c(this.f7328al.mo7954b());
            }
            this.f7324ah.mo7966a((Exception) facebookException);
            this.f7329am.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10504a(RequestState requestState) {
        this.f7328al = requestState;
        this.f7322af.setText(requestState.mo7954b());
        this.f7323ag.setCompoundDrawablesWithIntrinsicBounds(null, new BitmapDrawable(mo1320t(), C2186a.m10073b(requestState.mo7951a())), null, null);
        this.f7322af.setVisibility(0);
        this.f7321ae.setVisibility(8);
        if (!this.f7331ao && C2186a.m10072a(requestState.mo7954b())) {
            AppEventsLogger.m9940a(mo1316q()).mo7683a("fb_smart_login_service", (Double) null, (Bundle) null);
        }
        if (requestState.mo7960e()) {
            m10514at();
        } else {
            m10513as();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10510a(String str, C2263c cVar, String str2) {
        this.f7324ah.mo7967a(str2, C2189f.m10096j(), str, cVar.mo7887a(), cVar.mo7888b(), AccessTokenSource.DEVICE_AUTH, null, null);
        this.f7329am.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10511a(final String str, final C2263c cVar, final String str2, String str3) {
        String string = mo1320t().getString(C2183d.com_facebook_smart_login_confirmation_title);
        String string2 = mo1320t().getString(C2183d.com_facebook_smart_login_confirmation_continue_as);
        String string3 = mo1320t().getString(C2183d.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        Builder builder = new Builder(mo1316q());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.this.m10510a(str, cVar, str2);
            }
        }).setPositiveButton(string3, new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                DeviceAuthDialog.this.f7329am.setContentView(DeviceAuthDialog.this.m10527m(false));
                DeviceAuthDialog.this.mo7946a(DeviceAuthDialog.this.f7332ap);
            }
        });
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m10513as() {
        this.f7328al.mo7955b(new Date().getTime());
        this.f7326aj = m10515au().mo6585j();
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m10514at() {
        this.f7327ak = DeviceAuthMethodHandler.m10548c().schedule(new Runnable() {
            public void run() {
                DeviceAuthDialog.this.m10513as();
            }
        }, this.f7328al.mo7958d(), TimeUnit.SECONDS);
    }

    /* renamed from: au */
    private GraphRequest m10515au() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f7328al.mo7957c());
        GraphRequest graphRequest = new GraphRequest(null, "device/login_status", bundle, HttpMethod.POST, new C1609b() {
            /* renamed from: a */
            public void mo6589a(C2199i iVar) {
                if (!DeviceAuthDialog.this.f7325ai.get()) {
                    FacebookRequestError a = iVar.mo7795a();
                    if (a != null) {
                        int d = a.mo6556d();
                        if (d != 1349152) {
                            switch (d) {
                                case 1349172:
                                case 1349174:
                                    DeviceAuthDialog.this.m10514at();
                                    break;
                                case 1349173:
                                    break;
                                default:
                                    DeviceAuthDialog.this.m10503a(iVar.mo7795a().mo6561h());
                                    break;
                            }
                        }
                        DeviceAuthDialog.this.m10516av();
                        return;
                    }
                    try {
                        DeviceAuthDialog.this.m10520c(iVar.mo7796b().getString("access_token"));
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.m10503a(new FacebookException((Throwable) e));
                    }
                }
            }
        });
        return graphRequest;
    }

    /* access modifiers changed from: private */
    /* renamed from: av */
    public void m10516av() {
        if (this.f7325ai.compareAndSet(false, true)) {
            if (this.f7328al != null) {
                C2186a.m10075c(this.f7328al.mo7954b());
            }
            if (this.f7324ah != null) {
                this.f7324ah.mo7969f_();
            }
            this.f7329am.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m10520c(final String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        AccessToken accessToken = new AccessToken(str, C2189f.m10096j(), "0", null, null, null, null, null);
        GraphRequest graphRequest = new GraphRequest(accessToken, "me", bundle, HttpMethod.GET, new C1609b() {
            /* renamed from: a */
            public void mo6589a(C2199i iVar) {
                if (!DeviceAuthDialog.this.f7325ai.get()) {
                    if (iVar.mo7795a() != null) {
                        DeviceAuthDialog.this.m10503a(iVar.mo7795a().mo6561h());
                        return;
                    }
                    try {
                        JSONObject b = iVar.mo7796b();
                        String string = b.getString("id");
                        C2263c a = C2258x.m10359a(b);
                        String string2 = b.getString("name");
                        C2186a.m10075c(DeviceAuthDialog.this.f7328al.mo7954b());
                        if (!C2232n.m10235a(C2189f.m10096j()).mo7851e().contains(SmartLoginOption.RequireConfirm) || DeviceAuthDialog.this.f7331ao) {
                            DeviceAuthDialog.this.m10510a(string, a, str);
                            return;
                        }
                        DeviceAuthDialog.this.f7331ao = true;
                        DeviceAuthDialog.this.m10511a(string, a, str, string2);
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.m10503a(new FacebookException((Throwable) e));
                    }
                }
            }
        });
        graphRequest.mo6585j();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public View m10527m(boolean z) {
        View inflate = mo1318s().getLayoutInflater().inflate(z ? C2182c.com_facebook_smart_device_dialog_fragment : C2182c.com_facebook_device_auth_dialog_fragment, null);
        this.f7321ae = (ProgressBar) inflate.findViewById(C2181b.progress_bar);
        this.f7322af = (TextView) inflate.findViewById(C2181b.confirmation_code);
        ((Button) inflate.findViewById(C2181b.cancel_button)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                DeviceAuthDialog.this.m10516av();
            }
        });
        this.f7323ag = (TextView) inflate.findViewById(C2181b.com_facebook_device_auth_instructions);
        this.f7323ag.setText(Html.fromHtml(mo1219a(C2183d.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* renamed from: L */
    public void mo1202L() {
        this.f7330an = true;
        this.f7325ai.set(true);
        super.mo1202L();
        if (this.f7326aj != null) {
            this.f7326aj.cancel(true);
        }
        if (this.f7327ak != null) {
            this.f7327ak.cancel(true);
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo1217a(layoutInflater, viewGroup, bundle);
        this.f7324ah = (DeviceAuthMethodHandler) ((C2302b) ((FacebookActivity) mo1318s()).mo6548j()).mo1453c().mo8016g();
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                m10504a(requestState);
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo7946a(Request request) {
        this.f7332ap = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.mo8027a()));
        String g = request.mo8036g();
        if (g != null) {
            bundle.putString("redirect_uri", g);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C2264y.m10425b());
        sb.append("|");
        sb.append(C2264y.m10429c());
        bundle.putString("access_token", sb.toString());
        bundle.putString("device_info", C2186a.m10071a());
        GraphRequest graphRequest = new GraphRequest(null, "device/login", bundle, HttpMethod.POST, new C1609b() {
            /* renamed from: a */
            public void mo6589a(C2199i iVar) {
                if (!DeviceAuthDialog.this.f7330an) {
                    if (iVar.mo7795a() != null) {
                        DeviceAuthDialog.this.m10503a(iVar.mo7795a().mo6561h());
                        return;
                    }
                    JSONObject b = iVar.mo7796b();
                    RequestState requestState = new RequestState();
                    try {
                        requestState.mo7953a(b.getString("user_code"));
                        requestState.mo7956b(b.getString("code"));
                        requestState.mo7952a(b.getLong("interval"));
                        DeviceAuthDialog.this.m10504a(requestState);
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.m10503a(new FacebookException((Throwable) e));
                    }
                }
            }
        });
        graphRequest.mo6585j();
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        this.f7329am = new Dialog(mo1318s(), C2184e.com_facebook_auth_dialog);
        this.f7329am.setContentView(m10527m(C2186a.m10074b() && !this.f7331ao));
        return this.f7329am;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        if (this.f7328al != null) {
            bundle.putParcelable("request_state", this.f7328al);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f7330an) {
            m10516av();
        }
    }
}
