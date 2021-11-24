package com.pollfish.p148d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.pollfish.constants.C5130a;
import com.pollfish.constants.Position;
import com.pollfish.interfaces.C5174a.C5176b;
import com.pollfish.interfaces.C5174a.C5177c;
import com.pollfish.interfaces.C5181b;
import com.pollfish.interfaces.PollfishClosedListener;
import com.pollfish.interfaces.PollfishOpenedListener;
import com.pollfish.interfaces.PollfishSurveyCompletedListener;
import com.pollfish.interfaces.PollfishUserNotEligibleListener;
import com.pollfish.p145a.C5106b;
import com.pollfish.p145a.C5108c;
import com.pollfish.p147c.C5115d;
import com.pollfish.p147c.C5116e;
import com.pollfish.p150f.C5148a;
import com.pollfish.p150f.C5162b;
import com.pollfish.p150f.C5166c;
import com.pollfish.p150f.p151a.C5157b;
import com.pollfish.p153g.C5169c;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.pollfish.d.a */
public class C5131a extends RelativeLayout {

    /* renamed from: a */
    private static int f18327a = 0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static boolean f18328i = false;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static String f18329m = null;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static int f18330n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static String f18331o;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Activity f18332b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5106b f18333c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Button f18334d;

    /* renamed from: e */
    private Button f18335e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C5169c f18336f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5108c f18337g;

    /* renamed from: h */
    private C5130a f18338h;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f18339j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C5177c f18340k;

    /* renamed from: l */
    private C5176b f18341l;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f18342p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f18343q = 0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public PollfishSurveyCompletedListener f18344r;

    /* renamed from: s */
    private PollfishOpenedListener f18345s;

    /* renamed from: t */
    private PollfishClosedListener f18346t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public PollfishUserNotEligibleListener f18347u;

    /* renamed from: v */
    private Point f18348v = null;

    /* renamed from: w */
    private int f18349w = 1;

    /* renamed from: x */
    private int f18350x = 1;

    /* renamed from: com.pollfish.d.a$a */
    private class C5146a implements OnClickListener {
        private C5146a() {
        }

        public void onClick(View view) {
            try {
                if (C5131a.this.f18334d.getVisibility() == 0) {
                    if (C5131a.this.f18336f != null && !C5131a.f18328i) {
                        C5131a.this.mo16741c();
                    }
                    if (!C5131a.this.f18337g.mo16612B()) {
                        C5131a.this.m25414d(true);
                    } else {
                        C5131a.this.m25414d(false);
                    }
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("IndicatorClickListener e: ");
                sb.append(e);
                C5162b.m25519b("OverlayLayout", sb.toString());
            }
        }
    }

    public C5131a(Context context, Activity activity, C5108c cVar, boolean z, C5177c cVar2, C5176b bVar, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, String str, int i, String str2) {
        super(context);
        C5162b.m25518a("OverlayLayout", "new OverlayLayout()");
        f18328i = z;
        removeAllViews();
        mo16737a(false);
        f18329m = str;
        f18330n = i;
        f18331o = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("serverToConnect: ");
        sb.append(f18329m);
        C5162b.m25518a("OverlayLayout", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("request_uuid: ");
        sb2.append(f18331o);
        C5162b.m25518a("OverlayLayout", sb2.toString());
        this.f18344r = pollfishSurveyCompletedListener;
        this.f18345s = pollfishOpenedListener;
        this.f18346t = pollfishClosedListener;
        this.f18347u = pollfishUserNotEligibleListener;
        this.f18334d = null;
        this.f18335e = null;
        this.f18339j = false;
        this.f18332b = activity;
        this.f18333c = null;
        this.f18340k = cVar2;
        this.f18341l = bVar;
        this.f18337g = cVar;
        if (this.f18337g != null) {
            this.f18348v = this.f18337g.mo16648u();
        }
        this.f18338h = C5130a.NOTHING_SHOWN;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("pollfishViewStatus: ");
        sb3.append(this.f18338h);
        C5162b.m25518a("OverlayLayout", sb3.toString());
        new Handler().post(new Runnable() {
            public void run() {
                C5131a.this.mo16733a();
            }
        });
    }

    /* renamed from: a */
    public static void m25407a(int i) {
        f18327a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m25414d(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("hideIndicator(");
        sb.append(z);
        sb.append(")");
        C5162b.m25518a("OverlayLayout", sb.toString());
        if (this.f18334d != null) {
            if (!z) {
                this.f18334d.setOnClickListener(null);
                this.f18334d.setVisibility(4);
            } else if (this.f18334d.getVisibility() == 0) {
                C5157b.m25516a(this.f18334d, this.f18337g.mo16613C(), false, 1000, null, 0);
            }
            requestLayout();
        }
    }

    /* renamed from: j */
    public static int m25420j() {
        return f18327a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0159 A[Catch:{ Exception -> 0x02a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0251 A[Catch:{ Exception -> 0x02a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25428o() {
        /*
            r15 = this;
            java.lang.String r0 = "OverlayLayout"
            java.lang.String r1 = "createIndicator()"
            com.pollfish.p150f.C5162b.m25518a(r0, r1)
            android.widget.Button r0 = new android.widget.Button
            android.app.Activity r1 = r15.f18332b
            r0.<init>(r1)
            r15.f18334d = r0
            android.widget.Button r0 = r15.f18334d
            r1 = 22234(0x56da, float:3.1156E-41)
            r0.setId(r1)
            r0 = 0
            android.app.Activity r1 = r15.f18332b     // Catch:{ Exception -> 0x02a9 }
            int r1 = com.pollfish.p150f.p151a.C5157b.m25512a(r1)     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r2 = "OverlayLayout"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a9 }
            r3.<init>()     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r4 = "MIDDLE statusBarHeight: "
            r3.append(r4)     // Catch:{ Exception -> 0x02a9 }
            r3.append(r1)     // Catch:{ Exception -> 0x02a9 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x02a9 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ Exception -> 0x02a9 }
            android.app.Activity r2 = r15.f18332b     // Catch:{ Exception -> 0x02a9 }
            android.view.Window r2 = r2.getWindow()     // Catch:{ Exception -> 0x02a9 }
            android.view.WindowManager$LayoutParams r2 = r2.getAttributes()     // Catch:{ Exception -> 0x02a9 }
            int r2 = r2.flags     // Catch:{ Exception -> 0x02a9 }
            r2 = r2 & 1024(0x400, float:1.435E-42)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0048
            r2 = 1
            goto L_0x0049
        L_0x0048:
            r2 = 0
        L_0x0049:
            if (r2 == 0) goto L_0x004c
            r1 = 0
        L_0x004c:
            r2 = 2
            int[] r5 = new int[r2]     // Catch:{ Exception -> 0x02a9 }
            com.pollfish.a.b r6 = r15.f18333c     // Catch:{ Exception -> 0x02a9 }
            android.app.Activity r7 = r15.f18332b     // Catch:{ Exception -> 0x02a9 }
            com.pollfish.a.c r8 = r15.f18337g     // Catch:{ Exception -> 0x02a9 }
            com.pollfish.constants.Position r8 = r8.mo16613C()     // Catch:{ Exception -> 0x02a9 }
            android.graphics.drawable.Drawable r6 = r6.mo16591a(r7, r8, r5)     // Catch:{ Exception -> 0x02a9 }
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x02a6 }
            r8 = r5[r4]     // Catch:{ Exception -> 0x02a6 }
            android.app.Activity r9 = r15.f18332b     // Catch:{ Exception -> 0x02a6 }
            android.content.Context r9 = r9.getApplicationContext()     // Catch:{ Exception -> 0x02a6 }
            int r8 = com.pollfish.p150f.C5166c.m25526a(r8, r9)     // Catch:{ Exception -> 0x02a6 }
            r9 = r5[r3]     // Catch:{ Exception -> 0x02a6 }
            android.app.Activity r10 = r15.f18332b     // Catch:{ Exception -> 0x02a6 }
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ Exception -> 0x02a6 }
            int r9 = com.pollfish.p150f.C5166c.m25526a(r9, r10)     // Catch:{ Exception -> 0x02a6 }
            r7.<init>(r8, r9)     // Catch:{ Exception -> 0x02a6 }
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r9.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r10 = "createIndicator - statusBarHeight: "
            r9.append(r10)     // Catch:{ Exception -> 0x02a4 }
            r9.append(r1)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r8, r9)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r9.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r10 = "createIndicator - getWidth(): "
            r9.append(r10)     // Catch:{ Exception -> 0x02a4 }
            int r10 = r15.getWidth()     // Catch:{ Exception -> 0x02a4 }
            r9.append(r10)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r8, r9)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r9.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r10 = "createIndicator - panelWidth: "
            r9.append(r10)     // Catch:{ Exception -> 0x02a4 }
            int r10 = r15.f18349w     // Catch:{ Exception -> 0x02a4 }
            r9.append(r10)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r8, r9)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r9.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r10 = "createIndicator - getHeight(): "
            r9.append(r10)     // Catch:{ Exception -> 0x02a4 }
            int r10 = r15.getHeight()     // Catch:{ Exception -> 0x02a4 }
            r9.append(r10)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r8, r9)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r9.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r10 = "createIndicator - panelHeight: "
            r9.append(r10)     // Catch:{ Exception -> 0x02a4 }
            int r10 = r15.f18350x     // Catch:{ Exception -> 0x02a4 }
            r9.append(r10)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r8, r9)     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.a.c r8 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r8 = r8.mo16613C()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r9 = com.pollfish.constants.Position.BOTTOM_LEFT     // Catch:{ Exception -> 0x02a4 }
            r10 = 100
            if (r8 == r9) goto L_0x0133
            com.pollfish.a.c r8 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r8 = r8.mo16613C()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r9 = com.pollfish.constants.Position.TOP_LEFT     // Catch:{ Exception -> 0x02a4 }
            if (r8 == r9) goto L_0x0133
            com.pollfish.a.c r8 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r8 = r8.mo16613C()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r9 = com.pollfish.constants.Position.MIDDLE_LEFT     // Catch:{ Exception -> 0x02a4 }
            if (r8 != r9) goto L_0x0115
            goto L_0x0133
        L_0x0115:
            r8 = 11
            r7.addRule(r8)     // Catch:{ Exception -> 0x02a4 }
            int r8 = r15.getWidth()     // Catch:{ Exception -> 0x02a4 }
            int r9 = r15.f18349w     // Catch:{ Exception -> 0x02a4 }
            int r8 = r8 - r9
            if (r8 <= 0) goto L_0x0138
            com.pollfish.a.b r8 = r15.f18333c     // Catch:{ Exception -> 0x02a4 }
            int r8 = r8.mo16602h()     // Catch:{ Exception -> 0x02a4 }
            if (r8 != r10) goto L_0x0138
            int r8 = r15.getWidth()     // Catch:{ Exception -> 0x02a4 }
            int r9 = r15.f18349w     // Catch:{ Exception -> 0x02a4 }
            int r8 = r8 - r9
            goto L_0x0139
        L_0x0133:
            r8 = 9
            r7.addRule(r8)     // Catch:{ Exception -> 0x02a4 }
        L_0x0138:
            r8 = 0
        L_0x0139:
            java.lang.String r9 = "OverlayLayout"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r11.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r12 = "Pollfish Panel rightMargin: "
            r11.append(r12)     // Catch:{ Exception -> 0x02a4 }
            r11.append(r8)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r9, r11)     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.a.c r9 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r9 = r9.mo16613C()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r11 = com.pollfish.constants.Position.BOTTOM_LEFT     // Catch:{ Exception -> 0x02a4 }
            if (r9 == r11) goto L_0x0244
            com.pollfish.a.c r9 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r9 = r9.mo16613C()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r11 = com.pollfish.constants.Position.BOTTOM_RIGHT     // Catch:{ Exception -> 0x02a4 }
            if (r9 != r11) goto L_0x0165
            goto L_0x0244
        L_0x0165:
            com.pollfish.a.c r9 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r9 = r9.mo16613C()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r10 = com.pollfish.constants.Position.TOP_LEFT     // Catch:{ Exception -> 0x02a4 }
            r11 = 10
            if (r9 == r10) goto L_0x022f
            com.pollfish.a.c r9 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r9 = r9.mo16613C()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.constants.Position r10 = com.pollfish.constants.Position.TOP_RIGHT     // Catch:{ Exception -> 0x02a4 }
            if (r9 != r10) goto L_0x017d
            goto L_0x022f
        L_0x017d:
            java.lang.String r9 = "OverlayLayout"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r10.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r12 = "MIDDLE getHeight(): "
            r10.append(r12)     // Catch:{ Exception -> 0x02a4 }
            int r12 = r15.getHeight()     // Catch:{ Exception -> 0x02a4 }
            r10.append(r12)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = "OverlayLayout"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r10.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r12 = "MIDDLE dimensions[1]: "
            r10.append(r12)     // Catch:{ Exception -> 0x02a4 }
            r12 = r5[r3]     // Catch:{ Exception -> 0x02a4 }
            r10.append(r12)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = "OverlayLayout"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r10.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r12 = "MIDDLE (int) Utilities.convertDpToPixel(pollfishParamsObj.getIndicatorPadding(),activity.getApplicationContext()): "
            r10.append(r12)     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.a.c r12 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            int r12 = r12.mo16614D()     // Catch:{ Exception -> 0x02a4 }
            float r12 = (float) r12     // Catch:{ Exception -> 0x02a4 }
            android.app.Activity r13 = r15.f18332b     // Catch:{ Exception -> 0x02a4 }
            android.content.Context r13 = r13.getApplicationContext()     // Catch:{ Exception -> 0x02a4 }
            float r12 = com.pollfish.p150f.C5166c.m25525a(r12, r13)     // Catch:{ Exception -> 0x02a4 }
            int r12 = (int) r12     // Catch:{ Exception -> 0x02a4 }
            r10.append(r12)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = "OverlayLayout"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r10.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r12 = "MIDDLE position: "
            r10.append(r12)     // Catch:{ Exception -> 0x02a4 }
            int r12 = r15.getHeight()     // Catch:{ Exception -> 0x02a4 }
            int r12 = r12 / r2
            r13 = r5[r3]     // Catch:{ Exception -> 0x02a4 }
            int r13 = r13 / r2
            int r12 = r12 - r13
            com.pollfish.a.c r13 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            int r13 = r13.mo16614D()     // Catch:{ Exception -> 0x02a4 }
            float r13 = (float) r13     // Catch:{ Exception -> 0x02a4 }
            android.app.Activity r14 = r15.f18332b     // Catch:{ Exception -> 0x02a4 }
            android.content.Context r14 = r14.getApplicationContext()     // Catch:{ Exception -> 0x02a4 }
            float r13 = com.pollfish.p150f.C5166c.m25525a(r13, r14)     // Catch:{ Exception -> 0x02a4 }
            int r13 = (int) r13     // Catch:{ Exception -> 0x02a4 }
            int r12 = r12 + r13
            r10.append(r12)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x02a4 }
            r7.addRule(r11)     // Catch:{ Exception -> 0x02a4 }
            int r9 = r15.getHeight()     // Catch:{ Exception -> 0x02a4 }
            int r9 = r9 - r1
            int r9 = r9 / r2
            int r1 = r1 + r9
            r3 = r5[r3]     // Catch:{ Exception -> 0x02a4 }
            int r3 = r3 / r2
            int r1 = r1 - r3
            com.pollfish.a.c r2 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            int r2 = r2.mo16614D()     // Catch:{ Exception -> 0x02a4 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x02a4 }
            android.app.Activity r3 = r15.f18332b     // Catch:{ Exception -> 0x02a4 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ Exception -> 0x02a4 }
            float r2 = com.pollfish.p150f.C5166c.m25525a(r2, r3)     // Catch:{ Exception -> 0x02a4 }
        L_0x0228:
            int r2 = (int) r2     // Catch:{ Exception -> 0x02a4 }
            int r1 = r1 + r2
            r7.setMargins(r4, r1, r8, r4)     // Catch:{ Exception -> 0x02a4 }
            goto L_0x02c4
        L_0x022f:
            r7.addRule(r11)     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.a.c r2 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            int r2 = r2.mo16614D()     // Catch:{ Exception -> 0x02a4 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x02a4 }
            android.app.Activity r3 = r15.f18332b     // Catch:{ Exception -> 0x02a4 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ Exception -> 0x02a4 }
            float r2 = com.pollfish.p150f.C5166c.m25525a(r2, r3)     // Catch:{ Exception -> 0x02a4 }
            goto L_0x0228
        L_0x0244:
            r2 = 12
            r7.addRule(r2)     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.a.b r2 = r15.f18333c     // Catch:{ Exception -> 0x02a4 }
            int r2 = r2.mo16603i()     // Catch:{ Exception -> 0x02a4 }
            if (r2 != r10) goto L_0x0276
            int r2 = r15.getHeight()     // Catch:{ Exception -> 0x02a4 }
            int r2 = r2 - r1
            int r3 = r15.f18350x     // Catch:{ Exception -> 0x02a4 }
            int r2 = r2 - r3
            if (r2 >= 0) goto L_0x0277
            java.lang.String r3 = "OverlayLayout"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r5.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = "Pollfish Panel bottomMargin: "
            r5.append(r9)     // Catch:{ Exception -> 0x02a4 }
            r5.append(r2)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r2 = " <0 changing to zero"
            r5.append(r2)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r3, r2)     // Catch:{ Exception -> 0x02a4 }
        L_0x0276:
            r2 = 0
        L_0x0277:
            java.lang.String r3 = "OverlayLayout"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02a4 }
            r5.<init>()     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r9 = "Pollfish Panel bottomMargin: "
            r5.append(r9)     // Catch:{ Exception -> 0x02a4 }
            r5.append(r2)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.p150f.C5162b.m25518a(r3, r5)     // Catch:{ Exception -> 0x02a4 }
            com.pollfish.a.c r3 = r15.f18337g     // Catch:{ Exception -> 0x02a4 }
            int r3 = r3.mo16614D()     // Catch:{ Exception -> 0x02a4 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x02a4 }
            android.app.Activity r5 = r15.f18332b     // Catch:{ Exception -> 0x02a4 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Exception -> 0x02a4 }
            float r3 = com.pollfish.p150f.C5166c.m25525a(r3, r5)     // Catch:{ Exception -> 0x02a4 }
            int r3 = (int) r3     // Catch:{ Exception -> 0x02a4 }
            int r2 = r2 + r3
            r7.setMargins(r4, r1, r8, r2)     // Catch:{ Exception -> 0x02a4 }
            goto L_0x02c4
        L_0x02a4:
            r1 = move-exception
            goto L_0x02ac
        L_0x02a6:
            r1 = move-exception
            r7 = r0
            goto L_0x02ac
        L_0x02a9:
            r1 = move-exception
            r6 = r0
            r7 = r6
        L_0x02ac:
            java.lang.String r2 = "OverlayLayout"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "create indicator exception: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.pollfish.p150f.C5162b.m25519b(r2, r1)
            r15.f18334d = r0
        L_0x02c4:
            if (r6 == 0) goto L_0x032c
            android.widget.Button r0 = r15.f18334d
            r1 = 4
            if (r0 == 0) goto L_0x030a
            android.widget.Button r0 = r15.f18334d     // Catch:{ NoSuchMethodError -> 0x02e9, Exception -> 0x02d1 }
            r0.setBackground(r6)     // Catch:{ NoSuchMethodError -> 0x02e9, Exception -> 0x02d1 }
            goto L_0x0305
        L_0x02d1:
            r0 = move-exception
            java.lang.String r2 = "OverlayLayout"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "create indicator exception: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.pollfish.p150f.C5162b.m25520c(r2, r0)
            goto L_0x0305
        L_0x02e9:
            r0 = move-exception
            java.lang.String r2 = "OverlayLayout"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "create indicator exception: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.pollfish.p150f.C5162b.m25520c(r2, r0)
            android.widget.Button r0 = r15.f18334d
            r0.setBackgroundDrawable(r6)
        L_0x0305:
            android.widget.Button r0 = r15.f18334d
            r0.setVisibility(r1)
        L_0x030a:
            android.widget.Button r0 = r15.f18334d
            if (r0 == 0) goto L_0x032c
            if (r7 != 0) goto L_0x0311
            goto L_0x032c
        L_0x0311:
            android.widget.Button r0 = r15.f18334d
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x031f
            android.widget.Button r0 = r15.f18334d
            r15.addView(r0, r7)
            goto L_0x0326
        L_0x031f:
            java.lang.String r0 = "OverlayLayout"
            java.lang.String r2 = "indicator view has already a parent view"
            com.pollfish.p150f.C5162b.m25520c(r0, r2)
        L_0x0326:
            android.widget.Button r0 = r15.f18334d
            r0.setVisibility(r1)
        L_0x032c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p148d.C5131a.m25428o():void");
    }

    /* renamed from: a */
    public void mo16733a() {
        C5162b.m25518a("OverlayLayout", "addPollfishIndicatorAndPanel()");
        if (this.f18337g != null) {
            try {
                if (this.f18336f == null) {
                    mo16744e();
                } else {
                    C5162b.m25518a("OverlayLayout", "addPollfishIndicatorAndPanel(): pollFishPanel not null - do not create");
                }
            } catch (Exception unused) {
                this.f18336f = null;
                C5162b.m25519b("OverlayLayout", "failed to create pollfish Panel");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x01b7 A[Catch:{ Exception -> 0x0278 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01e8 A[Catch:{ Exception -> 0x0278 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16734a(com.pollfish.p145a.C5106b r8) {
        /*
            r7 = this;
            java.lang.String r0 = "OverlayLayout"
            java.lang.String r1 = "proceedPanel()"
            com.pollfish.p150f.C5162b.m25518a(r0, r1)
            com.pollfish.a.c r0 = r7.f18337g
            if (r0 == 0) goto L_0x028f
            if (r8 == 0) goto L_0x028f
            r7.f18333c = r8
            r0 = 100
            android.app.Activity r1 = r7.f18332b     // Catch:{ Exception -> 0x0055 }
            int r1 = com.pollfish.p150f.p151a.C5157b.m25512a(r1)     // Catch:{ Exception -> 0x0055 }
            int r2 = r8.mo16602h()     // Catch:{ Exception -> 0x0055 }
            android.graphics.Point r3 = r7.f18348v     // Catch:{ Exception -> 0x0055 }
            int r3 = r3.x     // Catch:{ Exception -> 0x0055 }
            int r2 = r2 * r3
            int r2 = r2 / r0
            r7.f18349w = r2     // Catch:{ Exception -> 0x0055 }
            int r2 = r8.mo16603i()     // Catch:{ Exception -> 0x0055 }
            android.graphics.Point r3 = r7.f18348v     // Catch:{ Exception -> 0x0055 }
            int r3 = r3.y     // Catch:{ Exception -> 0x0055 }
            int r3 = r3 - r1
            int r2 = r2 * r3
            int r2 = r2 / r0
            r7.f18350x = r2     // Catch:{ Exception -> 0x0055 }
            java.lang.String r1 = "OverlayLayout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0055 }
            r2.<init>()     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = "Panel width: "
            r2.append(r3)     // Catch:{ Exception -> 0x0055 }
            int r3 = r7.f18349w     // Catch:{ Exception -> 0x0055 }
            r2.append(r3)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = " height: "
            r2.append(r3)     // Catch:{ Exception -> 0x0055 }
            int r3 = r7.f18350x     // Catch:{ Exception -> 0x0055 }
            r2.append(r3)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0055 }
            com.pollfish.p150f.C5162b.m25518a(r1, r2)     // Catch:{ Exception -> 0x0055 }
            goto L_0x005c
        L_0x0055:
            java.lang.String r1 = "OverlayLayout"
            java.lang.String r2 = "Error while calculating panel size"
            com.pollfish.p150f.C5162b.m25519b(r1, r2)
        L_0x005c:
            com.pollfish.a.c r1 = r7.f18337g
            boolean r1 = r1.mo16612B()
            if (r1 != 0) goto L_0x0073
            android.widget.Button r1 = r7.f18334d
            if (r1 != 0) goto L_0x006c
            r7.m25428o()
            goto L_0x0073
        L_0x006c:
            java.lang.String r1 = "OverlayLayout"
            java.lang.String r2 = "addPollfishIndicatorAndPanel(): indicator not null - do not create"
            com.pollfish.p150f.C5162b.m25518a(r1, r2)
        L_0x0073:
            android.app.Activity r1 = r7.f18332b     // Catch:{ Exception -> 0x0278 }
            int r1 = com.pollfish.p150f.p151a.C5157b.m25512a(r1)     // Catch:{ Exception -> 0x0278 }
            int r2 = r8.mo16602h()     // Catch:{ Exception -> 0x0278 }
            android.graphics.Point r3 = r7.f18348v     // Catch:{ Exception -> 0x0278 }
            int r3 = r3.x     // Catch:{ Exception -> 0x0278 }
            int r2 = r2 * r3
            int r2 = r2 / r0
            r7.f18349w = r2     // Catch:{ Exception -> 0x0278 }
            int r2 = r8.mo16603i()     // Catch:{ Exception -> 0x0278 }
            android.graphics.Point r3 = r7.f18348v     // Catch:{ Exception -> 0x0278 }
            int r3 = r3.y     // Catch:{ Exception -> 0x0278 }
            int r3 = r3 - r1
            int r2 = r2 * r3
            int r2 = r2 / r0
            r7.f18350x = r2     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "OverlayLayout"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r3.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r4 = "Panel width: "
            r3.append(r4)     // Catch:{ Exception -> 0x0278 }
            int r4 = r7.f18349w     // Catch:{ Exception -> 0x0278 }
            r3.append(r4)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r4 = " height: "
            r3.append(r4)     // Catch:{ Exception -> 0x0278 }
            int r4 = r7.f18350x     // Catch:{ Exception -> 0x0278 }
            r3.append(r4)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ Exception -> 0x0278 }
            com.pollfish.g.c r2 = r7.f18336f     // Catch:{ Exception -> 0x0278 }
            if (r2 == 0) goto L_0x0270
            java.lang.String r2 = "OverlayLayout"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r3.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r4 = "statusBarHeight:"
            r3.append(r4)     // Catch:{ Exception -> 0x0278 }
            r3.append(r1)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r2, r3)     // Catch:{ Exception -> 0x0278 }
            android.app.Activity r2 = r7.f18332b     // Catch:{ Exception -> 0x0278 }
            android.view.Window r2 = r2.getWindow()     // Catch:{ Exception -> 0x0278 }
            android.view.WindowManager$LayoutParams r2 = r2.getAttributes()     // Catch:{ Exception -> 0x0278 }
            int r2 = r2.flags     // Catch:{ Exception -> 0x0278 }
            r2 = r2 & 1024(0x400, float:1.435E-42)
            r3 = 0
            if (r2 == 0) goto L_0x00e3
            r2 = 1
            goto L_0x00e4
        L_0x00e3:
            r2 = 0
        L_0x00e4:
            if (r2 == 0) goto L_0x00e7
            r1 = 0
        L_0x00e7:
            java.lang.String r4 = "OverlayLayout"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r5.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r6 = "app is on fullScreen (status bar visible): "
            r5.append(r6)     // Catch:{ Exception -> 0x0278 }
            r5.append(r2)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r4, r2)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "OverlayLayout"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r4.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r5 = "getWidth(): "
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            int r5 = r7.getWidth()     // Catch:{ Exception -> 0x0278 }
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r5 = "OverlayLayout getHeight(): "
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            int r5 = r7.getHeight()     // Catch:{ Exception -> 0x0278 }
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r2, r4)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r2 = "OverlayLayout"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r4.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r5 = "Pollfish Panel panelWidth: "
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            int r5 = r7.f18349w     // Catch:{ Exception -> 0x0278 }
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r5 = " panelHeight: "
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            int r5 = r7.f18350x     // Catch:{ Exception -> 0x0278 }
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r2, r4)     // Catch:{ Exception -> 0x0278 }
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x0278 }
            int r4 = r7.f18349w     // Catch:{ Exception -> 0x0278 }
            int r5 = r7.f18350x     // Catch:{ Exception -> 0x0278 }
            r2.<init>(r4, r5)     // Catch:{ Exception -> 0x0278 }
            com.pollfish.a.c r4 = r7.f18337g     // Catch:{ Exception -> 0x0278 }
            com.pollfish.constants.Position r4 = r4.mo16613C()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.constants.Position r5 = com.pollfish.constants.Position.TOP_RIGHT     // Catch:{ Exception -> 0x0278 }
            if (r4 == r5) goto L_0x0173
            com.pollfish.a.c r4 = r7.f18337g     // Catch:{ Exception -> 0x0278 }
            com.pollfish.constants.Position r4 = r4.mo16613C()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.constants.Position r5 = com.pollfish.constants.Position.BOTTOM_RIGHT     // Catch:{ Exception -> 0x0278 }
            if (r4 == r5) goto L_0x0173
            com.pollfish.a.c r4 = r7.f18337g     // Catch:{ Exception -> 0x0278 }
            com.pollfish.constants.Position r4 = r4.mo16613C()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.constants.Position r5 = com.pollfish.constants.Position.MIDDLE_RIGHT     // Catch:{ Exception -> 0x0278 }
            if (r4 != r5) goto L_0x016d
            goto L_0x0173
        L_0x016d:
            r3 = 9
            r2.addRule(r3)     // Catch:{ Exception -> 0x0278 }
            goto L_0x0193
        L_0x0173:
            r4 = 11
            r2.addRule(r4)     // Catch:{ Exception -> 0x0278 }
            int r4 = r7.getWidth()     // Catch:{ Exception -> 0x0278 }
            int r5 = r7.f18349w     // Catch:{ Exception -> 0x0278 }
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x0193
            int r4 = r8.mo16602h()     // Catch:{ Exception -> 0x0278 }
            if (r4 != r0) goto L_0x0191
            int r3 = r7.getWidth()     // Catch:{ Exception -> 0x0278 }
            int r4 = r7.f18349w     // Catch:{ Exception -> 0x0278 }
            int r3 = r3 - r4
            r2.rightMargin = r3     // Catch:{ Exception -> 0x0278 }
            goto L_0x0193
        L_0x0191:
            r2.rightMargin = r3     // Catch:{ Exception -> 0x0278 }
        L_0x0193:
            java.lang.String r3 = "OverlayLayout"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r4.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r5 = "Pollfish Panel panelObj.getHeight_percentage(): "
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            int r5 = r8.mo16603i()     // Catch:{ Exception -> 0x0278 }
            r4.append(r5)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r3, r4)     // Catch:{ Exception -> 0x0278 }
            int r3 = r7.getHeight()     // Catch:{ Exception -> 0x0278 }
            int r3 = r3 - r1
            int r4 = r7.f18350x     // Catch:{ Exception -> 0x0278 }
            int r3 = r3 - r4
            if (r3 <= 0) goto L_0x01e8
            int r8 = r8.mo16603i()     // Catch:{ Exception -> 0x0278 }
            if (r8 != r0) goto L_0x01c0
            r2.topMargin = r1     // Catch:{ Exception -> 0x0278 }
            goto L_0x01cf
        L_0x01c0:
            int r8 = r7.getHeight()     // Catch:{ Exception -> 0x0278 }
            int r8 = r8 - r1
            int r8 = r8 / 2
            int r8 = r8 + r1
            int r0 = r7.f18350x     // Catch:{ Exception -> 0x0278 }
            int r0 = r0 / 2
            int r8 = r8 - r0
            r2.topMargin = r8     // Catch:{ Exception -> 0x0278 }
        L_0x01cf:
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r0.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "Pollfish Panel params.topMargin: "
            r0.append(r3)     // Catch:{ Exception -> 0x0278 }
            int r3 = r2.topMargin     // Catch:{ Exception -> 0x0278 }
            r0.append(r3)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r8, r0)     // Catch:{ Exception -> 0x0278 }
            goto L_0x01ed
        L_0x01e8:
            r8 = 12
            r2.addRule(r8)     // Catch:{ Exception -> 0x0278 }
        L_0x01ed:
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r0.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "getHeight(): "
            r0.append(r3)     // Catch:{ Exception -> 0x0278 }
            int r3 = r7.getHeight()     // Catch:{ Exception -> 0x0278 }
            r0.append(r3)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r8, r0)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r0.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "screenSize.y: "
            r0.append(r3)     // Catch:{ Exception -> 0x0278 }
            android.graphics.Point r3 = r7.f18348v     // Catch:{ Exception -> 0x0278 }
            int r3 = r3.y     // Catch:{ Exception -> 0x0278 }
            r0.append(r3)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r8, r0)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r0.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r3 = "statusBarHeight: "
            r0.append(r3)     // Catch:{ Exception -> 0x0278 }
            r0.append(r1)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r8, r0)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r0.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r1 = "panelHeight: "
            r0.append(r1)     // Catch:{ Exception -> 0x0278 }
            int r1 = r7.f18350x     // Catch:{ Exception -> 0x0278 }
            r0.append(r1)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r8, r0)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r8 = "OverlayLayout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0278 }
            r0.<init>()     // Catch:{ Exception -> 0x0278 }
            java.lang.String r1 = "params.topMargin: "
            r0.append(r1)     // Catch:{ Exception -> 0x0278 }
            int r1 = r2.topMargin     // Catch:{ Exception -> 0x0278 }
            r0.append(r1)     // Catch:{ Exception -> 0x0278 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0278 }
            com.pollfish.p150f.C5162b.m25518a(r8, r0)     // Catch:{ Exception -> 0x0278 }
            com.pollfish.g.c r8 = r7.f18336f     // Catch:{ Exception -> 0x0278 }
            r7.addView(r8, r2)     // Catch:{ Exception -> 0x0278 }
            r7.mo16745f()     // Catch:{ Exception -> 0x0278 }
            goto L_0x028f
        L_0x0270:
            java.lang.String r8 = "OverlayLayout"
            java.lang.String r0 = "pollFishPanel == null"
            com.pollfish.p150f.C5162b.m25518a(r8, r0)     // Catch:{ Exception -> 0x0278 }
            goto L_0x028f
        L_0x0278:
            r8 = move-exception
            java.lang.String r0 = "OverlayLayout"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "error: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.pollfish.p150f.C5162b.m25519b(r0, r8)
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p148d.C5131a.mo16734a(com.pollfish.a.b):void");
    }

    /* renamed from: a */
    public void mo16735a(Map map) {
        StringBuilder sb = new StringBuilder();
        sb.append("setAttributesMap: ");
        sb.append(map.toString());
        C5162b.m25518a("OverlayLayout", sb.toString());
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(map);
            hashMap.put("attributes", jSONObject);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("attrObject.toString():  ");
            sb2.append(jSONObject.toString());
            C5162b.m25518a("OverlayLayout", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("sentToServer with url:  ");
            sb3.append(f18329m);
            sb3.append("/device/set/attributes");
            C5162b.m25518a("OverlayLayout", sb3.toString());
            mo16736a(new JSONObject(hashMap));
        } catch (Exception e) {
            Log.e("PollFish", "Something is wrong with your attributes. Please follow suggested guidelines");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("error while parsing sentToServer from javascript : ");
            sb4.append(e);
            C5162b.m25519b("OverlayLayout", sb4.toString());
        }
    }

    /* renamed from: a */
    public void mo16736a(final JSONObject jSONObject) {
        post(new Runnable() {
            public void run() {
                String str = "OverlayLayout";
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("checkIfPollfishParamsObjReady(");
                    sb.append(jSONObject.toString());
                    sb.append(")");
                    C5162b.m25518a(str, sb.toString());
                    if (C5131a.this.f18337g.mo16620J() == null) {
                        C5162b.m25518a("OverlayLayout", "pollfishParamsObj == null create timer!!");
                        final Timer timer = new Timer();
                        timer.schedule(new TimerTask() {
                            public void run() {
                                C5131a.this.f18343q = C5131a.this.f18343q + 1;
                                StringBuilder sb = new StringBuilder();
                                sb.append("checkIfPollfishParamsObjReady: wait a liitle to check if pollfishParamsObj.getAdvertising_id() becomes !=null  - pollfishParamsObjTimerTimes: ");
                                sb.append(C5131a.this.f18343q);
                                C5162b.m25518a("OverlayLayout", sb.toString());
                                try {
                                    if (C5131a.this.f18337g.mo16620J() != null || C5131a.this.f18343q > 14) {
                                        timer.cancel();
                                        C5131a.this.f18343q = 0;
                                        if (C5131a.this.f18337g.mo16620J() != null) {
                                            C5162b.m25518a("OverlayLayout", "advertising ID retrieved - cancelling timer - sending attributes");
                                            C5131a.this.postDelayed(new Runnable() {
                                                public void run() {
                                                    C5162b.m25518a("OverlayLayout", "delayed  - sending attributes");
                                                    C5108c c = C5131a.this.f18337g;
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(C5131a.f18329m);
                                                    sb.append("/v2");
                                                    sb.append("/device/set/attributes");
                                                    C5116e eVar = new C5116e(c, sb.toString(), C5131a.f18330n, C5131a.f18331o, jSONObject, C5131a.this.f18340k, C5131a.this.f18332b, false, null, null, null);
                                                    eVar.mo16699c(new Void[0]);
                                                }
                                            }, (long) 2000);
                                            return;
                                        }
                                        C5162b.m25519b("OverlayLayout", "null advertising ID - cancelling timer");
                                    }
                                } catch (Exception e) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("paramsObjTime: e: ");
                                    sb2.append(e);
                                    C5162b.m25519b("OverlayLayout", sb2.toString());
                                    timer.cancel();
                                    C5131a.this.f18343q = 0;
                                }
                            }
                        }, (long) 200, (long) 500);
                        return;
                    }
                    C5162b.m25518a("OverlayLayout", "pollfishParamsObj != null");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("pollfishParamsObj: ");
                    sb2.append(C5131a.this.f18337g);
                    C5162b.m25518a("OverlayLayout", sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("pollfishParamsObj getAdvertising_id():");
                    sb3.append(C5131a.this.f18337g.mo16620J());
                    C5162b.m25518a("OverlayLayout", sb3.toString());
                    C5108c c = C5131a.this.f18337g;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(C5131a.f18329m);
                    sb4.append("/v2");
                    sb4.append("/device/set/attributes");
                    C5116e eVar = new C5116e(c, sb4.toString(), C5131a.f18330n, C5131a.f18331o, jSONObject, C5131a.this.f18340k, C5131a.this.f18332b, true, null, null, null);
                    eVar.mo16699c(new Void[0]);
                } catch (Exception e) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("exception while waiting for pollfihs parms object:");
                    sb5.append(e);
                    C5162b.m25519b("OverlayLayout", sb5.toString());
                }
            }
        });
    }

    /* renamed from: a */
    public void mo16737a(boolean z) {
        C5162b.m25518a("OverlayLayout", "hidePanelAndIndicator()");
        try {
            mo16738a(false, z);
            m25414d(false);
            this.f18338h = C5130a.NOTHING_SHOWN;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("error while trying to hide panel and indicator: ");
            sb.append(e);
            C5162b.m25519b("OverlayLayout", sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16738a(boolean r16, boolean r17) {
        /*
            r15 = this;
            r0 = r15
            java.lang.String r1 = "OverlayLayout"
            java.lang.String r2 = "hidePanel()"
            com.pollfish.p150f.C5162b.m25518a(r1, r2)
            com.pollfish.a.b r1 = r0.f18333c
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.pollfish.a.c r1 = r0.f18337g
            if (r1 == 0) goto L_0x0046
            if (r17 == 0) goto L_0x0046
            com.pollfish.c.e r1 = new com.pollfish.c.e
            com.pollfish.a.c r4 = r0.f18337g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = f18329m
            r3.append(r5)
            java.lang.String r5 = "/v2"
            r3.append(r5)
            java.lang.String r5 = "/device/set/survey/hidden"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            int r6 = f18330n
            java.lang.String r7 = f18331o
            r8 = 0
            com.pollfish.interfaces.a$c r9 = r0.f18340k
            android.app.Activity r10 = r0.f18332b
            r11 = 0
            r12 = 0
            com.pollfish.a.b r13 = r0.f18333c
            r14 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Void[] r3 = new java.lang.Void[r2]
            r1.mo16699c(r3)
        L_0x0046:
            r15.setFocusableInTouchMode(r2)
            com.pollfish.g.c r1 = r0.f18336f
            if (r1 == 0) goto L_0x0108
            com.pollfish.constants.a r1 = r0.f18338h
            com.pollfish.constants.a r3 = com.pollfish.constants.C5130a.PANEL_OPEN
            if (r1 == r3) goto L_0x0055
            goto L_0x0108
        L_0x0055:
            android.widget.Button r1 = r0.f18335e
            if (r1 == 0) goto L_0x005f
            android.widget.Button r1 = r0.f18335e
            r3 = 0
            r1.setOnClickListener(r3)
        L_0x005f:
            com.pollfish.g.c r1 = r0.f18336f
            if (r1 == 0) goto L_0x0108
            com.pollfish.constants.a r1 = com.pollfish.constants.C5130a.NOTHING_SHOWN
            r0.f18338h = r1
            java.lang.String r1 = "OverlayLayout"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "pollfishViewStatus: "
            r3.append(r4)
            com.pollfish.constants.a r4 = r0.f18338h
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.pollfish.p150f.C5162b.m25518a(r1, r3)
            com.pollfish.a.c r1 = r0.f18337g
            boolean r1 = r1.mo16612B()
            if (r1 == 0) goto L_0x008b
            r15.m25414d(r2)
            goto L_0x00b6
        L_0x008b:
            com.pollfish.a.b r1 = r0.f18333c
            if (r1 == 0) goto L_0x00b6
            java.lang.String r1 = "OverlayLayout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "panelObj.isPollfishCompleted(): "
            r2.append(r3)
            com.pollfish.a.b r3 = r0.f18333c
            boolean r3 = r3.mo16600f()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.pollfish.p150f.C5162b.m25518a(r1, r2)
            com.pollfish.a.b r1 = r0.f18333c
            boolean r1 = r1.mo16600f()
            if (r1 != 0) goto L_0x00b6
            r15.mo16739b()
        L_0x00b6:
            android.app.Activity r1 = r0.f18332b
            boolean r1 = r1 instanceof com.pollfish.interfaces.PollfishClosedListener
            if (r1 == 0) goto L_0x00c4
            android.app.Activity r1 = r0.f18332b
            com.pollfish.interfaces.PollfishClosedListener r1 = (com.pollfish.interfaces.PollfishClosedListener) r1
        L_0x00c0:
            r1.onPollfishClosed()
            goto L_0x00d2
        L_0x00c4:
            com.pollfish.interfaces.PollfishClosedListener r1 = r0.f18346t
            if (r1 == 0) goto L_0x00d2
            java.lang.String r1 = "OverlayLayout"
            java.lang.String r2 = "pollfishClosedListenerExt!=null"
            com.pollfish.p150f.C5162b.m25518a(r1, r2)
            com.pollfish.interfaces.PollfishClosedListener r1 = r0.f18346t
            goto L_0x00c0
        L_0x00d2:
            r1 = 4
            if (r16 != 0) goto L_0x00e3
            com.pollfish.g.c r2 = r0.f18336f
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x00fb
            com.pollfish.g.c r2 = r0.f18336f
            r2.setVisibility(r1)
            goto L_0x00fb
        L_0x00e3:
            com.pollfish.g.c r2 = r0.f18336f
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x00fb
            com.pollfish.g.c r3 = r0.f18336f
            com.pollfish.a.c r2 = r0.f18337g
            com.pollfish.constants.Position r4 = r2.mo16613C()
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 0
            com.pollfish.p150f.p151a.C5157b.m25516a(r3, r4, r5, r6, r7, r8)
        L_0x00fb:
            android.widget.Button r2 = r0.f18335e
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0108
            android.widget.Button r2 = r0.f18335e
            r2.setVisibility(r1)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p148d.C5131a.mo16738a(boolean, boolean):void");
    }

    /* renamed from: b */
    public void mo16739b() {
        C5162b.m25518a("OverlayLayout", "showIndicator()");
        if (this.f18333c != null && !this.f18333c.mo16600f()) {
            if (this.f18337g.mo16612B()) {
                mo16741c();
            }
            if (this.f18334d != null) {
                if ((this.f18336f == null || this.f18338h != C5130a.PANEL_OPEN || this.f18338h == C5130a.INDICATOR_SHOWN) && !f18328i) {
                    try {
                        C5157b.m25516a(this.f18334d, this.f18337g.mo16613C(), true, 1000, new C5146a(), 0);
                        this.f18338h = C5130a.INDICATOR_SHOWN;
                        StringBuilder sb = new StringBuilder();
                        sb.append("pollfishViewStatus: ");
                        sb.append(this.f18338h);
                        C5162b.m25518a("OverlayLayout", sb.toString());
                        this.f18334d.bringToFront();
                        ((View) this.f18334d.getParent()).requestLayout();
                        ((View) this.f18334d.getParent()).invalidate();
                    } catch (Exception e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("animateView e: ");
                        sb2.append(e);
                        C5162b.m25519b("OverlayLayout", sb2.toString());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public void mo16740b(boolean z) {
        f18328i = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0143 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0144  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16741c() {
        /*
            r14 = this;
            java.lang.String r0 = "OverlayLayout"
            java.lang.String r1 = "showPanel()"
            com.pollfish.p150f.C5162b.m25518a(r0, r1)
            com.pollfish.a.b r0 = r14.f18333c
            r1 = 0
            if (r0 == 0) goto L_0x0043
            com.pollfish.a.c r0 = r14.f18337g
            if (r0 == 0) goto L_0x0043
            com.pollfish.c.e r0 = new com.pollfish.c.e
            com.pollfish.a.c r3 = r14.f18337g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = f18329m
            r2.append(r4)
            java.lang.String r4 = "/v2"
            r2.append(r4)
            java.lang.String r4 = "/device/set/survey/viewed"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            int r5 = f18330n
            java.lang.String r6 = f18331o
            r7 = 0
            com.pollfish.interfaces.a$c r8 = r14.f18340k
            android.app.Activity r9 = r14.f18332b
            r10 = 0
            r11 = 0
            com.pollfish.a.b r12 = r14.f18333c
            r13 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Void[] r2 = new java.lang.Void[r1]
            r0.mo16699c(r2)
        L_0x0043:
            com.pollfish.a.c r0 = r14.f18337g
            boolean r0 = r0.mo16612B()
            r2 = 1
            if (r0 != 0) goto L_0x0050
            r14.m25414d(r2)
            goto L_0x0053
        L_0x0050:
            r14.m25414d(r1)
        L_0x0053:
            com.pollfish.g.c r0 = r14.f18336f
            if (r0 == 0) goto L_0x005e
            com.pollfish.constants.a r0 = r14.f18338h
            com.pollfish.constants.a r3 = com.pollfish.constants.C5130a.PANEL_OPEN
            if (r0 != r3) goto L_0x005e
            return
        L_0x005e:
            com.pollfish.constants.a r0 = com.pollfish.constants.C5130a.PANEL_OPEN
            r14.f18338h = r0
            java.lang.String r0 = "OverlayLayout"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "pollfishViewStatus: "
            r3.append(r4)
            com.pollfish.constants.a r4 = r14.f18338h
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.pollfish.p150f.C5162b.m25518a(r0, r3)
            com.pollfish.a.b r0 = r14.f18333c
            if (r0 == 0) goto L_0x0264
            com.pollfish.a.b r0 = r14.f18333c
            boolean r0 = r0.mo16600f()
            if (r0 == 0) goto L_0x0088
            goto L_0x0264
        L_0x0088:
            android.app.Activity r0 = r14.f18332b
            boolean r0 = r0 instanceof com.pollfish.interfaces.PollfishOpenedListener
            if (r0 == 0) goto L_0x0096
            android.app.Activity r0 = r14.f18332b
            com.pollfish.interfaces.PollfishOpenedListener r0 = (com.pollfish.interfaces.PollfishOpenedListener) r0
        L_0x0092:
            r0.onPollfishOpened()
            goto L_0x00a4
        L_0x0096:
            com.pollfish.interfaces.PollfishOpenedListener r0 = r14.f18345s
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = "OverlayLayout"
            java.lang.String r3 = "pollfishOpenedListenerExt!=null"
            com.pollfish.p150f.C5162b.m25518a(r0, r3)
            com.pollfish.interfaces.PollfishOpenedListener r0 = r14.f18345s
            goto L_0x0092
        L_0x00a4:
            android.widget.Button r0 = r14.f18335e
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "OverlayLayout"
            java.lang.String r3 = "add semi-trasparent view"
            com.pollfish.p150f.C5162b.m25518a(r0, r3)
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r3 = -1
            r0.<init>(r3, r3)
            android.widget.Button r3 = new android.widget.Button
            android.app.Activity r4 = r14.f18332b
            r3.<init>(r4)
            r14.f18335e = r3
            android.widget.Button r3 = r14.f18335e
            r4 = 44434(0xad92, float:6.2265E-41)
            r3.setId(r4)
            android.widget.Button r3 = r14.f18335e     // Catch:{ IllegalArgumentException -> 0x00f2 }
            com.pollfish.a.b r4 = r14.f18333c     // Catch:{ IllegalArgumentException -> 0x00f2 }
            java.lang.String r4 = r4.mo16605k()     // Catch:{ IllegalArgumentException -> 0x00f2 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ IllegalArgumentException -> 0x00f2 }
            r3.setBackgroundColor(r4)     // Catch:{ IllegalArgumentException -> 0x00f2 }
            java.lang.String r3 = "OverlayLayout"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00f2 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x00f2 }
            java.lang.String r5 = "semiTrasparentView.setBackgroundColor: "
            r4.append(r5)     // Catch:{ IllegalArgumentException -> 0x00f2 }
            com.pollfish.a.b r5 = r14.f18333c     // Catch:{ IllegalArgumentException -> 0x00f2 }
            java.lang.String r5 = r5.mo16605k()     // Catch:{ IllegalArgumentException -> 0x00f2 }
            r4.append(r5)     // Catch:{ IllegalArgumentException -> 0x00f2 }
            java.lang.String r4 = r4.toString()     // Catch:{ IllegalArgumentException -> 0x00f2 }
            com.pollfish.p150f.C5162b.m25518a(r3, r4)     // Catch:{ IllegalArgumentException -> 0x00f2 }
            goto L_0x0114
        L_0x00f2:
            r3 = move-exception
            java.lang.String r4 = "OverlayLayout"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "semiTrasparentView.setBackgroundColor e: "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.pollfish.p150f.C5162b.m25519b(r4, r3)
            android.widget.Button r3 = r14.f18335e
            java.lang.String r4 = "#55000000"
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setBackgroundColor(r4)
        L_0x0114:
            java.lang.String r3 = "OverlayLayout"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "pollFishPanel.getId(): "
            r4.append(r5)
            com.pollfish.g.c r5 = r14.f18336f
            int r5 = r5.getId()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.pollfish.p150f.C5162b.m25518a(r3, r4)
            android.widget.Button r3 = r14.f18335e
            r14.addView(r3, r0)
        L_0x0135:
            android.widget.Button r0 = r14.f18335e
            com.pollfish.d.a$2 r3 = new com.pollfish.d.a$2
            r3.<init>()
            r0.setOnClickListener(r3)
            boolean r0 = f18328i
            if (r0 == 0) goto L_0x0144
            return
        L_0x0144:
            r14.setFocusableInTouchMode(r2)
            r14.requestFocus()
            com.pollfish.g.c r3 = r14.f18336f     // Catch:{ Exception -> 0x0177 }
            com.pollfish.a.c r0 = r14.f18337g     // Catch:{ Exception -> 0x0177 }
            com.pollfish.constants.Position r4 = r0.mo16613C()     // Catch:{ Exception -> 0x0177 }
            r5 = 1
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 0
            com.pollfish.p150f.p151a.C5157b.m25516a(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r0 = "OverlayLayout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0177 }
            r2.<init>()     // Catch:{ Exception -> 0x0177 }
            java.lang.String r3 = "pollFishPanel.getVisibility()"
            r2.append(r3)     // Catch:{ Exception -> 0x0177 }
            com.pollfish.g.c r3 = r14.f18336f     // Catch:{ Exception -> 0x0177 }
            int r3 = r3.getVisibility()     // Catch:{ Exception -> 0x0177 }
            r2.append(r3)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0177 }
            com.pollfish.p150f.C5162b.m25518a(r0, r2)     // Catch:{ Exception -> 0x0177 }
            goto L_0x01a0
        L_0x0177:
            r0 = move-exception
            java.lang.String r2 = "OverlayLayout"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "animateView e: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.pollfish.p150f.C5162b.m25519b(r2, r0)
            com.pollfish.g.c r0 = r14.f18336f
            if (r0 == 0) goto L_0x0197
            com.pollfish.g.c r0 = r14.f18336f
            r0.setVisibility(r1)
        L_0x0197:
            android.widget.Button r0 = r14.f18335e
            if (r0 == 0) goto L_0x01a0
            android.widget.Button r0 = r14.f18335e
            r0.setVisibility(r1)
        L_0x01a0:
            android.widget.Button r0 = r14.f18335e
            if (r0 == 0) goto L_0x01b2
            android.widget.Button r0 = r14.f18335e
            int r0 = r0.getVisibility()
            r2 = 4
            if (r0 != r2) goto L_0x01b2
            android.widget.Button r0 = r14.f18335e
            r0.setVisibility(r1)
        L_0x01b2:
            com.pollfish.g.c r0 = r14.f18336f
            r0.bringToFront()
            com.pollfish.g.c r0 = r14.f18336f     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1 = 1106247680(0x41f00000, float:30.0)
            r0.setTranslationZ(r1)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            android.widget.Button r0 = r14.f18335e     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1 = 0
            r0.setTranslationZ(r1)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r0 = "OverlayLayout"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1.<init>()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r2 = "pollFishPanel.getTranslationZ(): "
            r1.append(r2)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            com.pollfish.g.c r2 = r14.f18336f     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            float r2 = r2.getTranslationZ()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1.append(r2)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r1 = r1.toString()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            com.pollfish.p150f.C5162b.m25518a(r0, r1)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r0 = "OverlayLayout"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1.<init>()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r2 = "semiTrasparentView.getTranslationZ(): "
            r1.append(r2)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            android.widget.Button r2 = r14.f18335e     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            float r2 = r2.getTranslationZ()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1.append(r2)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r1 = r1.toString()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            com.pollfish.p150f.C5162b.m25518a(r0, r1)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r0 = "OverlayLayout"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1.<init>()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r2 = "pollFishPanel.getElevation(): "
            r1.append(r2)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            com.pollfish.g.c r2 = r14.f18336f     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            float r2 = r2.getElevation()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1.append(r2)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r1 = r1.toString()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            com.pollfish.p150f.C5162b.m25518a(r0, r1)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r0 = "OverlayLayout"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1.<init>()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r2 = "semiTrasparentView.getElevation(): "
            r1.append(r2)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            android.widget.Button r2 = r14.f18335e     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            float r2 = r2.getElevation()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            r1.append(r2)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            java.lang.String r1 = r1.toString()     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            com.pollfish.p150f.C5162b.m25518a(r0, r1)     // Catch:{ NoSuchMethodError -> 0x024d, Exception -> 0x0235 }
            goto L_0x0264
        L_0x0235:
            r0 = move-exception
            java.lang.String r1 = "OverlayLayout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Trying to set elevation - Exception: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.pollfish.p150f.C5162b.m25519b(r1, r0)
            goto L_0x0264
        L_0x024d:
            r0 = move-exception
            java.lang.String r1 = "OverlayLayout"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Trying to set elevation - NoSuchMethodError: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.pollfish.p150f.C5162b.m25520c(r1, r0)
        L_0x0264:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p148d.C5131a.mo16741c():void");
    }

    /* renamed from: c */
    public boolean mo16742c(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("isPollfishPanelOpen(): ");
        sb.append(this.f18338h);
        C5162b.m25518a("OverlayLayout", sb.toString());
        if (this.f18338h != C5130a.PANEL_OPEN) {
            return false;
        }
        if (z) {
            C5162b.m25518a("OverlayLayout", "Panel is open -> closing!");
            try {
                mo16738a(true, true);
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("isPollfishPanelOpen() exception: ");
                sb2.append(e);
                C5162b.m25519b("OverlayLayout", sb2.toString());
            }
        }
        C5162b.m25518a("OverlayLayout", "Panel is open");
        return true;
    }

    /* renamed from: d */
    public void mo16743d() {
        String str;
        StringBuilder sb;
        String str2;
        C5162b.m25518a("OverlayLayout", "showPollfishOnStartup()");
        if (this.f18333c == null) {
            C5162b.m25518a("OverlayLayout", "panelObj == null");
        } else if (this.f18337g.mo16612B()) {
            C5162b.m25518a("OverlayLayout", "showPollfishOnStartup(): show Panel call in custom mode");
            try {
                if (this.f18338h != C5130a.PANEL_OPEN && this.f18338h != C5130a.INDICATOR_SHOWN) {
                    mo16741c();
                }
            } catch (Exception e) {
                e = e;
                str2 = "OverlayLayout";
                sb = new StringBuilder();
                str = "showPollfishOnStartup() error: ";
                sb.append(str);
                sb.append(e);
                C5162b.m25519b(str2, sb.toString());
            }
        } else {
            try {
                C5162b.m25518a("OverlayLayout", "showPollfishOnStartup(): show on server mode");
                if (this.f18333c.mo16599e() == 0 && this.f18338h != C5130a.INDICATOR_SHOWN && this.f18338h != C5130a.PANEL_OPEN) {
                    mo16739b();
                } else if (this.f18338h != C5130a.PANEL_OPEN && this.f18338h != C5130a.INDICATOR_SHOWN) {
                    mo16741c();
                }
            } catch (Exception e2) {
                e = e2;
                str2 = "OverlayLayout";
                sb = new StringBuilder();
                str = "showPollfishOnStartup error: ";
                sb.append(str);
                sb.append(e);
                C5162b.m25519b(str2, sb.toString());
            }
        }
    }

    /* renamed from: e */
    public void mo16744e() {
        C5162b.m25518a("OverlayLayout", "createPollfishPanel()");
        this.f18336f = new C5169c(this.f18332b, new C5181b() {
            /* renamed from: a */
            public void mo16752a() {
                Runnable r0;
                Activity d;
                C5162b.m25518a("OverlayLayout", "webViewLoaded()");
                C5131a.this.f18339j = true;
                try {
                    if (!C5131a.f18328i) {
                        r0 = new Runnable() {
                            public void run() {
                                C5131a.this.mo16743d();
                            }
                        };
                        d = C5131a.this.f18332b;
                    } else {
                        r0 = new Runnable() {
                            public void run() {
                                C5131a.this.mo16737a(true);
                            }
                        };
                        d = C5131a.this.f18332b;
                    }
                    C5166c.m25536a((Context) d, r0, 0);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("webViewLoaded() error: ");
                    sb.append(e);
                    C5162b.m25518a("OverlayLayout", sb.toString());
                }
            }

            /* renamed from: a */
            public void mo16753a(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("openWebsite(");
                sb.append(str);
                sb.append(")");
                C5162b.m25518a("OverlayLayout", sb.toString());
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("http://");
                    sb2.append(str);
                    str = sb2.toString();
                }
                try {
                    C5131a.this.f18332b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception e) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("openWebsite error: ");
                    sb3.append(e);
                    C5162b.m25519b("OverlayLayout", sb3.toString());
                }
            }

            /* renamed from: a */
            public void mo16754a(String str, String str2) {
                String str3 = str;
                String str4 = str2;
                StringBuilder sb = new StringBuilder();
                sb.append("sentDataOfUserConsentToServer with url:  ");
                sb.append(C5131a.f18329m);
                sb.append(str);
                C5162b.m25518a("OverlayLayout", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("allowedDataBinaryStr:  ");
                sb2.append(str4);
                C5162b.m25518a("OverlayLayout", sb2.toString());
                if (str4 != null && str2.length() == 4) {
                    C5108c c = C5131a.this.f18337g;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(C5131a.f18329m);
                    sb3.append(str);
                    C5116e eVar = new C5116e(c, sb3.toString(), C5131a.f18330n, C5131a.f18331o, null, C5131a.this.f18340k, C5131a.this.f18332b, false, null, null, str2);
                    eVar.mo16699c(new Void[0]);
                }
            }

            /* renamed from: a */
            public void mo16755a(String str, String str2, String str3) {
                boolean z;
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                StringBuilder sb = new StringBuilder();
                sb.append("sentToServer with url:  ");
                sb.append(C5131a.f18329m);
                sb.append(str4);
                sb.append(" and save at queue: ");
                sb.append(str6);
                C5162b.m25518a("OverlayLayout", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("jsonParams:  ");
                sb2.append(str5);
                C5162b.m25518a("OverlayLayout", sb2.toString());
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (str6 != null) {
                        try {
                            z = Boolean.valueOf(str3).booleanValue();
                        } catch (Exception e) {
                            String str7 = "OverlayLayout";
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("while converting saveAtQueue:  ");
                            sb3.append(e);
                            C5162b.m25519b(str7, sb3.toString());
                        }
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("tempSaveAtQueue:  ");
                        sb4.append(z);
                        C5162b.m25518a("OverlayLayout", sb4.toString());
                        C5108c c = C5131a.this.f18337g;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(C5131a.f18329m);
                        sb5.append(str4);
                        C5116e eVar = new C5116e(c, sb5.toString(), C5131a.f18330n, C5131a.f18331o, jSONObject, C5131a.this.f18340k, C5131a.this.f18332b, z, null, null, null);
                        eVar.mo16699c(new Void[0]);
                    }
                    z = false;
                    StringBuilder sb42 = new StringBuilder();
                    sb42.append("tempSaveAtQueue:  ");
                    sb42.append(z);
                    C5162b.m25518a("OverlayLayout", sb42.toString());
                    C5108c c2 = C5131a.this.f18337g;
                    StringBuilder sb52 = new StringBuilder();
                    sb52.append(C5131a.f18329m);
                    sb52.append(str4);
                    C5116e eVar2 = new C5116e(c2, sb52.toString(), C5131a.f18330n, C5131a.f18331o, jSONObject, C5131a.this.f18340k, C5131a.this.f18332b, z, null, null, null);
                    eVar2.mo16699c(new Void[0]);
                } catch (Exception e2) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("error while parsing sentToServer from javascript : ");
                    sb6.append(e2);
                    C5162b.m25519b("OverlayLayout", sb6.toString());
                }
            }

            /* renamed from: b */
            public void mo16756b() {
                C5162b.m25518a("OverlayLayout", "closePanel()");
                C5166c.m25536a((Context) C5131a.this.f18332b, (Runnable) new Runnable() {
                    public void run() {
                        try {
                            C5131a.this.mo16738a(true, true);
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("closePanel() error: ");
                            sb.append(e);
                            C5162b.m25519b("OverlayLayout", sb.toString());
                        }
                    }
                }, 0);
            }

            /* renamed from: c */
            public void mo16757c() {
                PollfishSurveyCompletedListener f;
                boolean m;
                int n;
                StringBuilder sb = new StringBuilder();
                sb.append("setSurveyCompleted() short survey: ");
                sb.append(C5131a.this.f18333c.mo16607m());
                sb.append(" panelObj.getSurveyPrice():");
                sb.append(C5131a.this.f18333c.mo16608n());
                C5162b.m25518a("OverlayLayout", sb.toString());
                try {
                    if (C5131a.this.f18332b instanceof PollfishSurveyCompletedListener) {
                        f = (PollfishSurveyCompletedListener) C5131a.this.f18332b;
                        m = C5131a.this.f18333c.mo16607m();
                        n = C5131a.this.f18333c.mo16608n();
                    } else {
                        if (C5131a.this.f18344r != null) {
                            C5162b.m25518a("OverlayLayout", "pollfishSurveyCompletedListenerExt!=null");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("short survey: ");
                            sb2.append(C5131a.this.f18333c.mo16607m());
                            sb2.append(" panelObj.getSurveyPrice():");
                            sb2.append(C5131a.this.f18333c.mo16608n());
                            C5162b.m25518a("OverlayLayout", sb2.toString());
                            f = C5131a.this.f18344r;
                            m = C5131a.this.f18333c.mo16607m();
                            n = C5131a.this.f18333c.mo16608n();
                        }
                        C5131a.this.f18333c.mo16594a(true);
                    }
                    f.onPollfishSurveyCompleted(m, n);
                    C5131a.this.f18333c.mo16594a(true);
                } catch (Exception e) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error while setting  project e: ");
                    sb3.append(e);
                    C5162b.m25519b("OverlayLayout", sb3.toString());
                }
            }

            /* renamed from: d */
            public void mo16758d() {
                C5162b.m25518a("OverlayLayout", "ClearQueueTask()");
                new C5115d(C5131a.this.f18332b).execute(new Void[0]);
            }

            /* renamed from: e */
            public String mo16759e() {
                C5162b.m25518a("OverlayLayout", "getFromServer()");
                return C5131a.this.f18333c != null ? C5131a.this.f18333c.mo16604j() : "";
            }

            /* renamed from: f */
            public void mo16760f() {
                PollfishUserNotEligibleListener g;
                C5162b.m25518a("OverlayLayout", "userNotEligible()");
                try {
                    if (C5131a.this.f18332b instanceof PollfishUserNotEligibleListener) {
                        g = (PollfishUserNotEligibleListener) C5131a.this.f18332b;
                    } else {
                        if (C5131a.this.f18347u != null) {
                            C5162b.m25518a("OverlayLayout", "pollfishUserNotEligibleListenerExt!=null");
                            g = C5131a.this.f18347u;
                        }
                        C5131a.this.f18333c.mo16594a(true);
                    }
                    g.onUserNotEligible();
                    C5131a.this.f18333c.mo16594a(true);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error while userNotEligible e: ");
                    sb.append(e);
                    C5162b.m25519b("OverlayLayout", sb.toString());
                }
            }

            /* renamed from: g */
            public String mo16761g() {
                C5162b.m25518a("OverlayLayout", "getDeviceInfo()");
                if (C5131a.this.f18337g == null) {
                    return "";
                }
                boolean z = false;
                int i = (C5131a.this.f18337g.mo16613C() == Position.TOP_RIGHT || C5131a.this.f18337g.mo16613C() == Position.BOTTOM_RIGHT || C5131a.this.f18337g.mo16613C() == Position.MIDDLE_RIGHT) ? 1 : 0;
                if (C5131a.this.f18333c != null) {
                    z = C5131a.this.f18333c.mo16606l();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getDeviceInfo(): response: {\"version\": \"");
                sb.append(C5131a.this.f18337g.mo16635h());
                sb.append("\", \"language\": \"");
                sb.append(C5131a.this.f18337g.mo16636i());
                sb.append("\", \"host\": \"");
                sb.append(C5131a.f18329m);
                sb.append("\", \"position\" : \"");
                sb.append(i);
                sb.append("\", \"hasaccepted\" : \"");
                sb.append(z);
                sb.append("\"}");
                C5162b.m25518a("OverlayLayout", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("{\"version\": \"");
                sb2.append(C5131a.this.f18337g.mo16635h());
                sb2.append("\", \"language\": \"");
                sb2.append(C5131a.this.f18337g.mo16636i());
                sb2.append("\", \"host\": \"");
                sb2.append(C5131a.f18329m);
                sb2.append("\", \"position\" : \"");
                sb2.append(i);
                sb2.append("\", \"hasaccepted\" : \"");
                sb2.append(z);
                sb2.append("\"}");
                return sb2.toString();
            }

            /* renamed from: h */
            public void mo16762h() {
                C5162b.m25518a("OverlayLayout", "closeAndNoShow()");
                try {
                    C5131a.this.f18333c.mo16594a(true);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error while no thanks e: ");
                    sb.append(e);
                    C5162b.m25519b("OverlayLayout", sb.toString());
                }
                C5166c.m25536a((Context) C5131a.this.f18332b, (Runnable) new Runnable() {
                    public void run() {
                        try {
                            C5131a.this.mo16738a(true, false);
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("closePanel() error: ");
                            sb.append(e);
                            C5162b.m25519b("OverlayLayout", sb.toString());
                        }
                    }
                }, 0);
            }
        });
        this.f18336f.setId(3333332);
        this.f18336f.setVisibility(4);
    }

    /* renamed from: f */
    public void mo16745f() {
        post(new Runnable() {
            public void run() {
                try {
                    C5162b.m25518a("OverlayLayout", "check if files/assets exist!!");
                    if (C5131a.this.mo16746g() == null) {
                        C5162b.m25518a("OverlayLayout", "check if files/assets exist- create timer!!");
                        final Timer timer = new Timer();
                        timer.schedule(new TimerTask() {
                            public void run() {
                                C5131a.this.f18342p = C5131a.this.f18342p + 1;
                                StringBuilder sb = new StringBuilder();
                                sb.append("timer: wait a liitlecheck if files/assets exist!! numTimes: ");
                                sb.append(C5131a.this.f18342p);
                                C5162b.m25518a("OverlayLayout", sb.toString());
                                try {
                                    if (C5131a.this.mo16746g() != null || C5131a.this.f18342p > 100) {
                                        timer.cancel();
                                        C5131a.this.f18342p = 0;
                                    }
                                } catch (Exception e) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("timer: e: ");
                                    sb2.append(e);
                                    C5162b.m25519b("OverlayLayout", sb2.toString());
                                    timer.cancel();
                                    C5131a.this.f18342p = 0;
                                }
                            }
                        }, (long) 0, (long) 500);
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("exception while writing webviewcontent in cache:");
                    sb.append(e);
                    C5162b.m25519b("OverlayLayout", sb.toString());
                }
            }
        });
    }

    /* renamed from: g */
    public HashMap mo16746g() {
        C5162b.m25518a("OverlayLayout", "checkTasksAndContinueLoadPanel");
        final HashMap b = this.f18341l.mo16785b();
        if (b != null) {
            C5162b.m25518a("OverlayLayout", " all tasks set ");
            if (b.size() == 0) {
                C5162b.m25518a("OverlayLayout", "check if files/assets exist-> proceed!!");
                try {
                    C5162b.m25518a("OverlayLayout", "call pollFishPanel.loadContent()");
                    C5166c.m25536a((Context) this.f18332b, (Runnable) new Runnable() {
                        public void run() {
                            if (C5131a.this.f18336f != null && C5131a.this.f18333c != null) {
                                try {
                                    C5131a.this.f18336f.mo16808a(C5131a.this.f18333c.mo16598d());
                                } catch (Exception e) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("e: ");
                                    sb.append(e);
                                    C5162b.m25519b("OverlayLayout", sb.toString());
                                }
                            }
                        }
                    }, 0);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("checkTasksAndContinueLoadPanel() error: ");
                    sb.append(e);
                    C5162b.m25518a("OverlayLayout", sb.toString());
                }
            } else {
                C5162b.m25518a("OverlayLayout", "check if files/assets exist - You have to replace strings before showing webview!");
                if (!f18328i) {
                    C5166c.m25536a((Context) this.f18332b, (Runnable) new Runnable() {
                        public void run() {
                            if (C5131a.this.f18336f != null && C5131a.this.f18333c != null) {
                                try {
                                    if (C5131a.this.f18336f != null && C5131a.this.f18333c != null) {
                                        C5131a.this.f18336f.mo16809a(b, C5131a.this.f18333c.mo16598d());
                                    }
                                } catch (Exception e) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("e: ");
                                    sb.append(e);
                                    C5162b.m25519b("OverlayLayout", sb.toString());
                                }
                            }
                        }
                    }, 0);
                } else {
                    mo16737a(true);
                }
            }
        } else {
            C5162b.m25518a("OverlayLayout", "not all tasks set so far, check in a while!");
        }
        return b;
    }

    /* renamed from: h */
    public void mo16747h() {
        C5162b.m25518a("OverlayLayout", "hidePollfishManually() - manualy by the user");
        Log.w("PollFish", "Developer called hide Pollfish");
        String str = "OverlayLayout";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("before hide pollfishViewStatus: ");
            sb.append(this.f18338h);
            C5162b.m25518a(str, sb.toString());
            C5148a.f18370a = true;
            mo16740b(true);
            mo16737a(true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("after hide pollfishViewStatus: ");
            sb2.append(this.f18338h);
            C5162b.m25518a("OverlayLayout", sb2.toString());
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception while hidePollfish(): ");
            sb3.append(e);
            C5162b.m25519b("OverlayLayout", sb3.toString());
        }
    }

    /* renamed from: i */
    public void mo16748i() {
        C5162b.m25518a("OverlayLayout", "showPollfishManually() - manualy by the user");
        Log.w("PollFish", "Developer called show Pollfish");
        C5148a.f18370a = false;
        mo16740b(false);
        if (this.f18339j) {
            String str = "OverlayLayout";
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("before show pollfishViewStatus: ");
                sb.append(this.f18338h);
                C5162b.m25518a(str, sb.toString());
                mo16743d();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("after show pollfishViewStatus: ");
                sb2.append(this.f18338h);
                C5162b.m25518a("OverlayLayout", sb2.toString());
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Exception while showPollfish(): ");
                sb3.append(e);
                C5162b.m25519b("OverlayLayout", sb3.toString());
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f18336f != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onKeyDown: ");
            sb.append(i);
            sb.append(" pollfishViewStatus: ");
            sb.append(this.f18338h);
            C5162b.m25518a("OverlayLayout", sb.toString());
            if (this.f18338h == C5130a.PANEL_OPEN) {
                try {
                    setFocusableInTouchMode(true);
                    requestFocus();
                    mo16738a(true, true);
                    return true;
                } catch (Exception e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onKeyDown: ");
                    sb2.append(e);
                    C5162b.m25519b("OverlayLayout", sb2.toString());
                }
            }
        }
        return false;
    }
}
