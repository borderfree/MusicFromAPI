package com.facebook.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p009v4.content.C0456d;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.internal.adapters.C1663d;
import com.facebook.ads.internal.adapters.C1670h;
import com.facebook.ads.internal.adapters.p059a.C1650g;
import com.facebook.ads.internal.adapters.p059a.C1655j;
import com.facebook.ads.internal.adapters.p059a.C1656k;
import com.facebook.ads.internal.p064f.C1684a;
import com.facebook.ads.internal.p069k.C1713a;
import com.facebook.ads.internal.p070l.C1714a;
import com.facebook.ads.internal.p070l.C1716b;
import com.facebook.ads.internal.p070l.C1718d;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p072o.C1729d;
import com.facebook.ads.internal.p077s.p078a.C1788d;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.p077s.p081d.C1831a;
import com.facebook.ads.internal.p077s.p081d.C1832b;
import com.facebook.ads.internal.settings.C1835a.C1836a;
import com.facebook.ads.internal.view.C1844a;
import com.facebook.ads.internal.view.C1844a.C1845a;
import com.facebook.ads.internal.view.C1863b;
import com.facebook.ads.internal.view.C1927d;
import com.facebook.ads.internal.view.C1949e;
import com.facebook.ads.internal.view.C1986g;
import com.facebook.ads.internal.view.C2114j;
import com.facebook.ads.internal.view.C2127m;
import com.facebook.ads.internal.view.p084a.C1850b;
import com.facebook.ads.internal.view.p086c.C1894c;
import com.facebook.ads.internal.view.p089d.p090a.C1941f;
import com.facebook.ads.internal.view.p093g.p095b.C2040z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AudienceNetworkActivity extends Activity {

    /* renamed from: a */
    private final List<C1619a> f5260a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public RelativeLayout f5261b;

    /* renamed from: c */
    private int f5262c = -1;

    /* renamed from: d */
    private String f5263d;

    /* renamed from: e */
    private C1836a f5264e;

    /* renamed from: f */
    private long f5265f;

    /* renamed from: g */
    private long f5266g;

    /* renamed from: h */
    private int f5267h;

    /* renamed from: i */
    private C1844a f5268i;

    /* renamed from: j */
    private C1850b f5269j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1894c f5270k;

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$a */
    public interface C1619a {
        /* renamed from: a */
        boolean mo6642a();
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$b */
    private static class C1620b implements C1845a {

        /* renamed from: a */
        final WeakReference<AudienceNetworkActivity> f5272a;

        private C1620b(AudienceNetworkActivity audienceNetworkActivity) {
            this.f5272a = new WeakReference<>(audienceNetworkActivity);
        }

        /* renamed from: a */
        public void mo6643a(View view) {
            if (this.f5272a.get() != null) {
                ((AudienceNetworkActivity) this.f5272a.get()).f5261b.addView(view);
            }
        }

        /* renamed from: a */
        public void mo6644a(View view, int i) {
            if (this.f5272a.get() != null) {
                ((AudienceNetworkActivity) this.f5272a.get()).f5261b.addView(view, i);
            }
        }

        /* renamed from: a */
        public void mo6645a(String str) {
            if (this.f5272a.get() != null) {
                ((AudienceNetworkActivity) this.f5272a.get()).m8135b(str);
            }
        }

        /* renamed from: a */
        public void mo6646a(String str, C1718d dVar) {
            if (this.f5272a.get() != null) {
                ((AudienceNetworkActivity) this.f5272a.get()).m8132a(str, dVar);
            }
        }

        /* renamed from: b */
        public void mo6647b(String str) {
            if (this.f5272a.get() != null) {
                ((AudienceNetworkActivity) this.f5272a.get()).m8131a(str);
            }
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$c */
    private static class C1621c {

        /* renamed from: a */
        private final AudienceNetworkActivity f5273a;

        /* renamed from: b */
        private final Intent f5274b;

        /* renamed from: c */
        private final C1728c f5275c;

        private C1621c(AudienceNetworkActivity audienceNetworkActivity, Intent intent, C1728c cVar) {
            this.f5273a = audienceNetworkActivity;
            this.f5274b = intent;
            this.f5275c = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1844a m8144a() {
            C1986g gVar = new C1986g(this.f5273a, this.f5275c, m8162i(), m8161h() ? new C1684a(this.f5273a) : null, new C1620b());
            return gVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1844a m8145a(RelativeLayout relativeLayout) {
            C2127m mVar = new C2127m(this.f5273a, this.f5275c, new C1620b());
            mVar.mo7665a((View) relativeLayout);
            mVar.mo7664a(this.f5274b.getIntExtra("video_time_polling_interval", 200));
            return mVar;
        }

        /* renamed from: a */
        private boolean m8148a(C1656k kVar) {
            C1655j j = kVar.mo6755e().mo6688j();
            return j != null && !j.mo6747g();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C1844a m8149b() {
            C1844a a = C1670h.m8372a(this.f5274b.getStringExtra("uniqueId"));
            if (a == null) {
                return null;
            }
            a.setListener(new C1620b());
            return a;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C1844a m8151c() {
            return new C1863b(this.f5273a, this.f5275c, new C1620b());
        }

        /* JADX WARNING: type inference failed for: r0v3 */
        /* JADX WARNING: type inference failed for: r0v6, types: [com.facebook.ads.internal.view.i] */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.facebook.ads.internal.view.C1844a m8153d() {
            /*
                r8 = this;
                android.content.Intent r0 = r8.f5274b
                java.lang.String r1 = "rewardedVideoAdDataBundle"
                java.io.Serializable r0 = r0.getSerializableExtra(r1)
                r6 = r0
                com.facebook.ads.internal.adapters.a.k r6 = (com.facebook.ads.internal.adapters.p059a.C1656k) r6
                boolean r0 = r8.m8148a(r6)
                r1 = 0
                if (r0 == 0) goto L_0x0023
                com.facebook.ads.internal.view.i r0 = new com.facebook.ads.internal.view.i
                com.facebook.ads.AudienceNetworkActivity r2 = r8.f5273a
                com.facebook.ads.internal.o.c r3 = r8.f5275c
                com.facebook.ads.AudienceNetworkActivity$e r4 = new com.facebook.ads.AudienceNetworkActivity$e
                com.facebook.ads.AudienceNetworkActivity r5 = r8.f5273a
                r4.<init>()
                r0.<init>(r2, r3, r4, r6)
                goto L_0x003b
            L_0x0023:
                com.facebook.ads.internal.view.j r0 = new com.facebook.ads.internal.view.j
                com.facebook.ads.AudienceNetworkActivity r2 = r8.f5273a
                com.facebook.ads.internal.o.c r3 = r8.f5275c
                com.facebook.ads.internal.view.g.a r4 = new com.facebook.ads.internal.view.g.a
                com.facebook.ads.AudienceNetworkActivity r5 = r8.f5273a
                r4.<init>(r5)
                com.facebook.ads.AudienceNetworkActivity$e r5 = new com.facebook.ads.AudienceNetworkActivity$e
                com.facebook.ads.AudienceNetworkActivity r7 = r8.f5273a
                r5.<init>()
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6)
            L_0x003b:
                com.facebook.ads.internal.view.a r0 = (com.facebook.ads.internal.view.C1844a) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.AudienceNetworkActivity.C1621c.m8153d():com.facebook.ads.internal.view.a");
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public C1844a m8155e() {
            return new C1927d(this.f5273a, this.f5275c, new C1620b());
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public C1844a m8157f() {
            return new C1941f(this.f5273a, this.f5275c, m8161h() ? new C1684a(this.f5273a) : null, new C1620b());
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C1844a m8159g() {
            return new C1949e(this.f5273a, m8162i(), this.f5275c, new C1620b());
        }

        /* renamed from: h */
        private boolean m8161h() {
            return this.f5274b.getBooleanExtra("useCache", false);
        }

        /* renamed from: i */
        private C1650g m8162i() {
            return (C1650g) this.f5274b.getSerializableExtra("ad_data_bundle");
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$d */
    private class C1622d implements OnLongClickListener {
        private C1622d() {
        }

        public boolean onLongClick(View view) {
            if (!(AudienceNetworkActivity.this.f5270k == null || AudienceNetworkActivity.this.f5261b == null)) {
                AudienceNetworkActivity.this.f5270k.setBounds(0, 0, AudienceNetworkActivity.this.f5261b.getWidth(), AudienceNetworkActivity.this.f5261b.getHeight());
                AudienceNetworkActivity.this.f5270k.mo7227a(!AudienceNetworkActivity.this.f5270k.mo7228a());
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.AudienceNetworkActivity$e */
    private static class C1623e extends C1620b {
        private C1623e(AudienceNetworkActivity audienceNetworkActivity) {
            super();
        }

        /* renamed from: a */
        public void mo6645a(String str) {
            if (this.f5272a.get() != null) {
                ((AudienceNetworkActivity) this.f5272a.get()).m8135b(str);
                String a = C2040z.REWARDED_VIDEO_END_ACTIVITY.mo7487a();
                String a2 = C2040z.REWARDED_VIDEO_ERROR.mo7487a();
                if (str.equals(a) || str.equals(a2)) {
                    ((AudienceNetworkActivity) this.f5272a.get()).finish();
                }
            }
        }
    }

    /* renamed from: a */
    private C1844a m8125a() {
        C1621c cVar = new C1621c(getIntent(), C1729d.m8662a((Context) this));
        if (this.f5264e == null) {
            return null;
        }
        switch (this.f5264e) {
            case FULL_SCREEN_VIDEO:
                return cVar.m8145a(this.f5261b);
            case REWARDED_VIDEO:
                return cVar.m8153d();
            case INTERSTITIAL_WEB_VIEW:
                return cVar.m8155e();
            case BROWSER:
                return cVar.m8151c();
            case INTERSTITIAL_OLD_NATIVE_VIDEO:
                return cVar.m8149b();
            case INTERSTITIAL_NATIVE_VIDEO:
                return cVar.m8144a();
            case INTERSTITIAL_NATIVE_IMAGE:
                return cVar.m8159g();
            case INTERSTITIAL_NATIVE_CAROUSEL:
                return cVar.m8157f();
            default:
                return null;
        }
    }

    /* renamed from: a */
    private void m8127a(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.f5262c = bundle.getInt("predefinedOrientationKey", -1);
            this.f5263d = bundle.getString("uniqueId");
            this.f5264e = (C1836a) bundle.getSerializable("viewType");
            return;
        }
        this.f5262c = intent.getIntExtra("predefinedOrientationKey", -1);
        this.f5263d = intent.getStringExtra("uniqueId");
        this.f5264e = (C1836a) intent.getSerializableExtra("viewType");
        this.f5267h = intent.getIntExtra("skipAfterSeconds", 0) * 1000;
    }

    /* renamed from: a */
    private void m8128a(Intent intent, boolean z) {
        if (C1713a.m8570b(this) && this.f5264e != C1836a.BROWSER) {
            this.f5270k = new C1894c();
            this.f5270k.mo7226a(intent.getStringExtra("placementId"));
            this.f5270k.mo7230b(getPackageName());
            long longExtra = intent.getLongExtra("requestTime", 0);
            if (longExtra != 0) {
                this.f5270k.mo7225a(longExtra);
            }
            TextView textView = new TextView(this);
            textView.setText("Debug");
            textView.setTextColor(-1);
            C1808r.m8932a((View) textView, Color.argb(160, 0, 0, 0));
            textView.setPadding(5, 5, 5, 5);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.addRule(12, -1);
            layoutParams.addRule(11, -1);
            textView.setLayoutParams(layoutParams);
            C1622d dVar = new C1622d();
            textView.setOnLongClickListener(dVar);
            if (z) {
                this.f5261b.addView(textView);
            } else {
                this.f5261b.setOnLongClickListener(dVar);
            }
            this.f5261b.getOverlay().add(this.f5270k);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8131a(String str) {
        if (this.f5269j == null) {
            C1850b bVar = new C1850b(getApplicationContext(), C1729d.m8662a((Context) this), this.f5268i, new C1620b(), str);
            this.f5269j = bVar;
            this.f5269j.setLayoutParams(new LayoutParams(-1, -1));
        }
        C1808r.m8934a((ViewGroup) this.f5261b);
        this.f5261b.addView(this.f5269j);
        this.f5269j.mo7129a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8132a(String str, C1718d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(this.f5263d);
        Intent intent = new Intent(sb.toString());
        intent.putExtra("event", dVar);
        C0456d.m2097a((Context) this).mo1845a(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8135b(String str) {
        if ("com.facebook.ads.adreporting.FINISH_AD_REPORTING_FLOW".equals(str)) {
            finish();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(this.f5263d);
        C0456d.m2097a((Context) this).mo1845a(new Intent(sb.toString()));
    }

    /* renamed from: a */
    public void mo6631a(C1619a aVar) {
        this.f5260a.add(aVar);
    }

    /* renamed from: b */
    public void mo6632b(C1619a aVar) {
        this.f5260a.remove(aVar);
    }

    public void finish() {
        if (!isFinishing()) {
            m8135b(this.f5264e == C1836a.REWARDED_VIDEO ? C2040z.REWARDED_VIDEO_CLOSED.mo7487a() : "com.facebook.ads.interstitial.dismissed");
            super.finish();
        }
    }

    public void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f5266g += currentTimeMillis - this.f5265f;
        this.f5265f = currentTimeMillis;
        if (this.f5266g > ((long) this.f5267h)) {
            boolean z = false;
            for (C1619a a : this.f5260a) {
                if (a.mo6642a()) {
                    z = true;
                }
            }
            if (!z) {
                super.onBackPressed();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (this.f5268i instanceof C1663d) {
            ((C1663d) this.f5268i).mo6771a(configuration);
        } else if (this.f5268i instanceof C2114j) {
            ((C2114j) this.f5268i).onConfigurationChanged(configuration);
        }
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C1788d.m8879a();
            boolean z = true;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            this.f5261b = new RelativeLayout(this);
            C1808r.m8932a((View) this.f5261b, -16777216);
            setContentView(this.f5261b, new LayoutParams(-1, -1));
            Intent intent = getIntent();
            m8127a(intent, bundle);
            this.f5268i = m8125a();
            if (this.f5268i == null) {
                C1716b.m8601a(C1714a.m8600a(null, "Unable to infer viewType from intent or savedInstanceState"));
                m8135b("com.facebook.ads.interstitial.error");
                finish();
                return;
            }
            this.f5268i.mo6770a(intent, bundle, this);
            m8135b("com.facebook.ads.interstitial.displayed");
            this.f5265f = System.currentTimeMillis();
            if (this.f5264e != C1836a.INTERSTITIAL_WEB_VIEW) {
                z = false;
            }
            m8128a(intent, z);
        } catch (Exception e) {
            C1831a.m8998a((Context) this, "an_activity", C1832b.f5985L, e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            m8135b(this.f5264e == C1836a.REWARDED_VIDEO ? C2040z.REWARDED_VIDEO_ACTIVITY_DESTROYED.mo7487a() : "com.facebook.ads.interstitial.activity_destroyed");
            if (this.f5261b != null) {
                this.f5261b.removeAllViews();
            }
            if (this.f5268i != null) {
                C1670h.m8373a(this.f5268i);
                this.f5268i.mo6761a();
                this.f5268i = null;
            }
            if (this.f5270k != null && C1713a.m8570b(this)) {
                this.f5270k.mo7229b();
            }
            if (this.f5269j != null) {
                this.f5269j.mo7130b();
            }
        } catch (Exception e) {
            C1831a.m8998a((Context) this, "an_activity", C1832b.f5986M, e);
        }
        super.onDestroy();
    }

    public void onPause() {
        this.f5266g += System.currentTimeMillis() - this.f5265f;
        if (this.f5268i != null) {
            this.f5268i.mo6773a(false);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f5265f = System.currentTimeMillis();
        if (this.f5268i != null) {
            this.f5268i.mo6774b(false);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f5268i != null) {
            this.f5268i.mo6772a(bundle);
        }
        bundle.putInt("predefinedOrientationKey", this.f5262c);
        bundle.putString("uniqueId", this.f5263d);
        bundle.putSerializable("viewType", this.f5264e);
    }

    public void onStart() {
        super.onStart();
        if (this.f5262c != -1) {
            try {
                setRequestedOrientation(this.f5262c);
            } catch (IllegalStateException unused) {
            }
        }
    }
}
