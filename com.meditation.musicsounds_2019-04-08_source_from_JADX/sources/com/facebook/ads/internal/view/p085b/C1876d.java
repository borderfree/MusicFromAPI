package com.facebook.ads.internal.view.p085b;

import android.text.TextUtils;

/* renamed from: com.facebook.ads.internal.view.b.d */
public class C1876d {

    /* renamed from: a */
    private final C1878f f6175a;

    /* renamed from: b */
    private boolean f6176b = true;

    public C1876d(C1878f fVar) {
        this.f6175a = fVar;
    }

    /* renamed from: a */
    private static long m9147a(String str, String str2) {
        String substring = str.substring(str2.length());
        if (TextUtils.isEmpty(substring)) {
            return -1;
        }
        try {
            Long valueOf = Long.valueOf(Long.parseLong(substring));
            return valueOf.longValue() < 0 ? -1 : valueOf.longValue();
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public void mo7168a() {
        if (this.f6176b) {
            if (this.f6175a.canGoBack() || this.f6175a.canGoForward()) {
                this.f6176b = false;
            } else {
                this.f6175a.mo7174a("void((function() {try {  if (!window.performance || !window.performance.timing || !document ||       !document.body || document.body.scrollHeight <= 0 ||       !document.body.children || document.body.children.length < 1) {    return;  }  var nvtiming__an_t = window.performance.timing;  if (nvtiming__an_t.responseEnd > 0) {    console.log('ANNavResponseEnd:'+nvtiming__an_t.responseEnd);  }  if (nvtiming__an_t.domContentLoadedEventStart > 0) {    console.log('ANNavDomContentLoaded:' + nvtiming__an_t.domContentLoadedEventStart);  }  if (nvtiming__an_t.loadEventEnd > 0) {    console.log('ANNavLoadEventEnd:' + nvtiming__an_t.loadEventEnd);  }} catch(err) {  console.log('an_navigation_timing_error:' + err.message);}})());");
            }
        }
    }

    /* renamed from: a */
    public void mo7169a(String str) {
        if (this.f6176b) {
            if (str.startsWith("ANNavResponseEnd:")) {
                this.f6175a.mo7173a(m9147a(str, "ANNavResponseEnd:"));
            } else if (str.startsWith("ANNavDomContentLoaded:")) {
                this.f6175a.mo7175b(m9147a(str, "ANNavDomContentLoaded:"));
            } else if (str.startsWith("ANNavLoadEventEnd:")) {
                this.f6175a.mo7176c(m9147a(str, "ANNavLoadEventEnd:"));
            }
        }
    }

    /* renamed from: a */
    public void mo7170a(boolean z) {
        this.f6176b = z;
    }
}
