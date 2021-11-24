package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.C2199i;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C1609b;
import com.facebook.HttpMethod;
import com.facebook.common.C2179a.C2181b;
import com.facebook.common.C2179a.C2182c;
import com.facebook.common.C2179a.C2183d;
import com.facebook.common.C2179a.C2184e;
import com.facebook.devicerequests.p098a.C2186a;
import com.facebook.internal.C2264y;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceShareDialogFragment extends C0366g {

    /* renamed from: aj */
    private static ScheduledThreadPoolExecutor f7437aj;

    /* renamed from: ae */
    private ProgressBar f7438ae;

    /* renamed from: af */
    private TextView f7439af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public Dialog f7440ag;

    /* renamed from: ah */
    private volatile RequestState f7441ah;

    /* renamed from: ai */
    private volatile ScheduledFuture f7442ai;

    /* renamed from: ak */
    private ShareContent f7443ak;

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
        private String f7447a;

        /* renamed from: b */
        private long f7448b;

        RequestState() {
        }

        protected RequestState(Parcel parcel) {
            this.f7447a = parcel.readString();
            this.f7448b = parcel.readLong();
        }

        /* renamed from: a */
        public String mo8108a() {
            return this.f7447a;
        }

        /* renamed from: a */
        public void mo8109a(long j) {
            this.f7448b = j;
        }

        /* renamed from: a */
        public void mo8110a(String str) {
            this.f7447a = str;
        }

        /* renamed from: b */
        public long mo8111b() {
            return this.f7448b;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f7447a);
            parcel.writeLong(this.f7448b);
        }
    }

    /* renamed from: a */
    private void m10738a(int i, Intent intent) {
        if (this.f7441ah != null) {
            C2186a.m10075c(this.f7441ah.mo8108a());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(mo1316q(), facebookRequestError.mo6559f(), 0).show();
        }
        if (mo1326y()) {
            C0367h s = mo1318s();
            s.setResult(i, intent);
            s.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10739a(FacebookRequestError facebookRequestError) {
        m10743as();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m10738a(-1, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10740a(RequestState requestState) {
        this.f7441ah = requestState;
        this.f7439af.setText(requestState.mo8108a());
        this.f7439af.setVisibility(0);
        this.f7438ae.setVisibility(8);
        this.f7442ai = m10746av().schedule(new Runnable() {
            public void run() {
                DeviceShareDialogFragment.this.f7440ag.dismiss();
            }
        }, requestState.mo8111b(), TimeUnit.SECONDS);
    }

    /* renamed from: as */
    private void m10743as() {
        if (mo1326y()) {
            mo1322u().mo1536a().mo1412a((Fragment) this).mo1428c();
        }
    }

    /* renamed from: at */
    private Bundle m10744at() {
        ShareContent shareContent = this.f7443ak;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return C2350i.m10918a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return C2350i.m10919a((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* renamed from: au */
    private void m10745au() {
        Bundle at = m10744at();
        if (at == null || at.size() == 0) {
            m10739a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C2264y.m10425b());
        sb.append("|");
        sb.append(C2264y.m10429c());
        at.putString("access_token", sb.toString());
        at.putString("device_info", C2186a.m10071a());
        GraphRequest graphRequest = new GraphRequest(null, "device/share", at, HttpMethod.POST, new C1609b() {
            /* renamed from: a */
            public void mo6589a(C2199i iVar) {
                FacebookRequestError a = iVar.mo7795a();
                if (a != null) {
                    DeviceShareDialogFragment.this.m10739a(a);
                    return;
                }
                JSONObject b = iVar.mo7796b();
                RequestState requestState = new RequestState();
                try {
                    requestState.mo8110a(b.getString("user_code"));
                    requestState.mo8109a(b.getLong("expires_in"));
                    DeviceShareDialogFragment.this.m10740a(requestState);
                } catch (JSONException unused) {
                    DeviceShareDialogFragment.this.m10739a(new FacebookRequestError(0, "", "Malformed server response"));
                }
            }
        });
        graphRequest.mo6585j();
    }

    /* renamed from: av */
    private static synchronized ScheduledThreadPoolExecutor m10746av() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f7437aj == null) {
                f7437aj = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f7437aj;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo1217a(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            RequestState requestState = (RequestState) bundle.getParcelable("request_state");
            if (requestState != null) {
                m10740a(requestState);
            }
        }
        return a;
    }

    /* renamed from: a */
    public void mo8105a(ShareContent shareContent) {
        this.f7443ak = shareContent;
    }

    /* renamed from: c */
    public Dialog mo1452c(Bundle bundle) {
        this.f7440ag = new Dialog(mo1318s(), C2184e.com_facebook_auth_dialog);
        View inflate = mo1318s().getLayoutInflater().inflate(C2182c.com_facebook_device_auth_dialog_fragment, null);
        this.f7438ae = (ProgressBar) inflate.findViewById(C2181b.progress_bar);
        this.f7439af = (TextView) inflate.findViewById(C2181b.confirmation_code);
        ((Button) inflate.findViewById(C2181b.cancel_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                DeviceShareDialogFragment.this.f7440ag.dismiss();
            }
        });
        ((TextView) inflate.findViewById(C2181b.com_facebook_device_auth_instructions)).setText(Html.fromHtml(mo1219a(C2183d.com_facebook_device_auth_instructions)));
        this.f7440ag.setContentView(inflate);
        m10745au();
        return this.f7440ag;
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        super.mo1282e(bundle);
        if (this.f7441ah != null) {
            bundle.putParcelable("request_state", this.f7441ah);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f7442ai != null) {
            this.f7442ai.cancel(true);
        }
        m10738a(-1, new Intent());
    }
}
