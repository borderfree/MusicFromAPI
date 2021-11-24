package com.facebook.ads.internal.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.p070l.C1718d;

/* renamed from: com.facebook.ads.internal.view.a */
public interface C1844a {

    /* renamed from: com.facebook.ads.internal.view.a$a */
    public interface C1845a {
        /* renamed from: a */
        void mo6643a(View view);

        /* renamed from: a */
        void mo6644a(View view, int i);

        /* renamed from: a */
        void mo6645a(String str);

        /* renamed from: a */
        void mo6646a(String str, C1718d dVar);

        /* renamed from: b */
        void mo6647b(String str);
    }

    /* renamed from: a */
    void mo6761a();

    /* renamed from: a */
    void mo6770a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity);

    /* renamed from: a */
    void mo6772a(Bundle bundle);

    /* renamed from: a */
    void mo6773a(boolean z);

    /* renamed from: b */
    void mo6774b(boolean z);

    void setListener(C1845a aVar);
}
