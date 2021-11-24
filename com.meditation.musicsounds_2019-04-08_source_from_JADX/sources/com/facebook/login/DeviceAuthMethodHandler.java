package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Creator<DeviceAuthMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        /* renamed from: a */
        public DeviceAuthMethodHandler[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    };

    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f7349c;

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: b */
    private void m10547b(Request request) {
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.mo1448a(this.f7381b.mo8007b().mo1469g(), "login_with_facebook");
        deviceAuthDialog.mo7946a(request);
    }

    /* renamed from: c */
    public static synchronized ScheduledThreadPoolExecutor m10548c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f7349c == null) {
                f7349c = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f7349c;
        }
        return scheduledThreadPoolExecutor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo7933a() {
        return "device_auth";
    }

    /* renamed from: a */
    public void mo7966a(Exception exc) {
        this.f7381b.mo8003a(Result.m10621a(this.f7381b.mo8010c(), null, exc.getMessage()));
    }

    /* renamed from: a */
    public void mo7967a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, AccessTokenSource accessTokenSource, Date date, Date date2) {
        AccessToken accessToken = new AccessToken(str, str2, str3, collection, collection2, accessTokenSource, date, date2);
        this.f7381b.mo8003a(Result.m10619a(this.f7381b.mo8010c(), accessToken));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7936a(Request request) {
        m10547b(request);
        return true;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f_ */
    public void mo7969f_() {
        this.f7381b.mo8003a(Result.m10620a(this.f7381b.mo8010c(), "User canceled log in."));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
