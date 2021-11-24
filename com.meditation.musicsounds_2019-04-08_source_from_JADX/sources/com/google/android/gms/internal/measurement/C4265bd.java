package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.bd */
final class C4265bd implements C4252ar<C4266be> {

    /* renamed from: a */
    private final C4499u f15787a;

    /* renamed from: b */
    private final C4266be f15788b = new C4266be();

    public C4265bd(C4499u uVar) {
        this.f15787a = uVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C4250ap mo14144a() {
        return this.f15788b;
    }

    /* renamed from: a */
    public final void mo14145a(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.f15788b.f15792d = i;
        } else {
            this.f15787a.mo14846e().mo14819d("Int xml configuration name not recognized", str);
        }
    }

    /* renamed from: a */
    public final void mo14146a(String str, String str2) {
    }

    /* renamed from: a */
    public final void mo14147a(String str, boolean z) {
        if ("ga_dryRun".equals(str)) {
            this.f15788b.f15793e = z ? 1 : 0;
            return;
        }
        this.f15787a.mo14846e().mo14819d("Bool xml configuration name not recognized", str);
    }

    /* renamed from: b */
    public final void mo14148b(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.f15788b.f15789a = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.f15788b.f15790b = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.f15788b.f15791c = str2;
        } else {
            this.f15787a.mo14846e().mo14819d("String xml configuration name not recognized", str);
        }
    }
}
