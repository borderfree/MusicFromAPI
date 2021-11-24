package com.pollfish.p150f.p151a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.pollfish.constants.Position;
import com.pollfish.interfaces.C5174a.C5176b;
import com.pollfish.interfaces.C5174a.C5177c;
import com.pollfish.interfaces.PollfishClosedListener;
import com.pollfish.interfaces.PollfishOpenedListener;
import com.pollfish.interfaces.PollfishSurveyCompletedListener;
import com.pollfish.interfaces.PollfishUserNotEligibleListener;
import com.pollfish.p145a.C5108c;

@SuppressLint({"InlinedApi"})
/* renamed from: com.pollfish.f.a.a */
public class C5156a {

    /* renamed from: a */
    protected static int f18412a = -1;

    /* renamed from: b */
    protected static int f18413b = -1;

    /* renamed from: c */
    private Activity f18414c;

    /* renamed from: d */
    private View f18415d;

    /* renamed from: e */
    private Position f18416e;

    /* renamed from: f */
    private int f18417f;

    /* renamed from: g */
    private C5108c f18418g;

    /* renamed from: h */
    private boolean f18419h;

    /* renamed from: i */
    private C5177c f18420i;

    /* renamed from: j */
    private C5176b f18421j;

    /* renamed from: k */
    private PollfishSurveyCompletedListener f18422k;

    /* renamed from: l */
    private PollfishOpenedListener f18423l;

    /* renamed from: m */
    private PollfishClosedListener f18424m;

    /* renamed from: n */
    private PollfishUserNotEligibleListener f18425n;

    /* renamed from: o */
    private String f18426o;

    /* renamed from: p */
    private int f18427p;

    /* renamed from: q */
    private String f18428q;

    /* renamed from: r */
    private ViewGroup f18429r;

    public C5156a(Activity activity, View view, Position position, int i, C5108c cVar, boolean z, C5177c cVar2, C5176b bVar, PollfishSurveyCompletedListener pollfishSurveyCompletedListener, PollfishOpenedListener pollfishOpenedListener, PollfishClosedListener pollfishClosedListener, PollfishUserNotEligibleListener pollfishUserNotEligibleListener, String str, int i2, String str2, ViewGroup viewGroup) {
        this.f18414c = activity;
        this.f18415d = view;
        this.f18416e = position;
        this.f18417f = i;
        this.f18418g = cVar;
        this.f18419h = z;
        this.f18420i = cVar2;
        this.f18421j = bVar;
        this.f18422k = pollfishSurveyCompletedListener;
        this.f18423l = pollfishOpenedListener;
        this.f18424m = pollfishClosedListener;
        this.f18425n = pollfishUserNotEligibleListener;
        this.f18426o = str;
        this.f18427p = i2;
        this.f18428q = str2;
        this.f18429r = viewGroup;
    }

    /* renamed from: a */
    public static void m25509a(int i) {
        f18413b = i;
    }

    /* renamed from: b */
    public static int m25510b() {
        return f18413b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        com.pollfish.p150f.C5162b.m25519b("LayoutRearranger", "StackOverflowError");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x03cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x03cd, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("error: ");
        r3.append(r0);
        com.pollfish.p150f.C5162b.m25519b("LayoutRearranger", r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0451, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x017a A[Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x020a A[Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x021b A[Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x028d A[Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[ExcHandler: StackOverflowError (unused java.lang.StackOverflowError), SYNTHETIC, Splitter:B:5:0x001c] */
    @android.annotation.SuppressLint({"InlinedApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.pollfish.p148d.C5131a mo16794a() {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r2 = "reOrdering app views..."
            com.pollfish.p150f.C5162b.m25518a(r0, r2)
            android.view.ViewGroup r0 = r1.f18429r     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r2 = 12
            r3 = -1
            if (r0 != 0) goto L_0x03e4
            android.widget.RelativeLayout r4 = new android.widget.RelativeLayout     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            android.app.Activity r0 = r1.f18414c     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r4.<init>(r0)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            java.lang.String r0 = "pollfish_after_overlay"
            r4.setTag(r0)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            android.app.Activity r0 = r1.f18414c     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.WindowManager r0 = r0.getWindowManager()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r5 = r0.getRotation()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.app.Activity r0 = r1.f18414c     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r0 = r0.orientation     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r6 = 2
            r7 = 1
            r8 = 0
            if (r0 != r6) goto L_0x003d
            r6 = 1
            goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            android.app.Activity r0 = r1.f18414c     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            android.app.Activity r10 = r1.f18414c     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            android.app.Activity r11 = r1.f18414c     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            java.lang.Class r11 = r11.getClass()     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = r11.getName()     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            r9.<init>(r10, r11)     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r0 = r0.getActivityInfo(r9, r10)     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = "LayoutRearranger"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            r10.<init>()     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = "info.configChanges: "
            r10.append(r11)     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            int r11 = r0.configChanges     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            r10.append(r11)     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = r10.toString()     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = "LayoutRearranger"
            java.lang.String r10 = " ActivityInfo.CONFIG_SCREEN_SIZE: 1024"
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            int r0 = r0.configChanges     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r9 = "ActivityInfo.CONFIG_SCREEN_SIZE ON"
            com.pollfish.p150f.C5162b.m25518a(r0, r9)     // Catch:{ NameNotFoundException -> 0x00a5, Exception -> 0x008d, StackOverflowError -> 0x03c3 }
            r0 = 1
            goto L_0x00bb
        L_0x008d:
            r0 = move-exception
            java.lang.String r9 = "LayoutRearranger"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = "Exception: "
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.append(r0)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
        L_0x00a1:
            com.pollfish.p150f.C5162b.m25519b(r9, r0)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            goto L_0x00ba
        L_0x00a5:
            r0 = move-exception
            java.lang.String r9 = "LayoutRearranger"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = "PackageManager.NameNotFoundException: "
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.append(r0)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            goto L_0x00a1
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            java.lang.String r9 = "LayoutRearranger"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = "rotation: "
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.append(r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r5 = r10.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r9, r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r5 = "LayoutRearranger"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = "isLand: "
            r9.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.append(r6)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r5, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r5 = "LayoutRearranger"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = "screenMaskON: "
            r9.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.append(r0)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r5, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r5 = "LayoutRearranger"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = "currOrientation: "
            r9.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r10 = f18413b     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r5, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r5 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.ViewParent r5 = r5.getParent()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = "LayoutRearranger"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = "v.getWidth(): "
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r11 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r11 = r11.getWidth()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = " v.getHeight():"
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r11 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r11 = r11.getHeight()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = "LayoutRearranger"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = "v.getWidth(): "
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r11 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r11 = r11.getWidth()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = " v.getHeight():"
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r11 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r11 = r11.getHeight()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = "LayoutRearranger"
            java.lang.String r10 = "Not for Unity"
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r6 != 0) goto L_0x018a
            android.view.View r9 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r9 = r9.getWidth()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r10 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r10 = r10.getHeight()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r9 <= r10) goto L_0x018a
            if (r0 != 0) goto L_0x019c
        L_0x018a:
            if (r6 != r7) goto L_0x01a6
            android.view.View r9 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r9 = r9.getWidth()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r10 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r10 = r10.getHeight()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r9 >= r10) goto L_0x01a6
            if (r0 == 0) goto L_0x01a6
        L_0x019c:
            java.lang.String r9 = "LayoutRearranger"
            java.lang.String r10 = "((isLand==0)&& (v.getWidth()>v.getHeight()) && screenMaskON)"
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9 = 0
            r10 = 0
            goto L_0x01b9
        L_0x01a6:
            java.lang.String r9 = "LayoutRearranger"
            java.lang.String r10 = "!!!!((isLand==0)&& (v.getWidth()>v.getHeight()))"
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r9 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r9 = r9.getWidth()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r10 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r10 = r10.getHeight()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
        L_0x01b9:
            java.lang.String r11 = "LayoutRearranger"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r12.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r13 = "currentViewWidth: "
            r12.append(r13)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r12.append(r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r13 = " currentViewHeight: "
            r12.append(r13)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r12.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r11, r12)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = "LayoutRearranger"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r12.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r13 = "v.getTop(): "
            r12.append(r13)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r13 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r13 = r13.getTop()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r12.append(r13)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r13 = "v.getBottom(): "
            r12.append(r13)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r13 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r13 = r13.getBottom()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r12.append(r13)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r11, r12)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r11 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r5.removeView(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r11 = f18412a     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r11 != r3) goto L_0x021b
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r9 = "First re-arangement"
            com.pollfish.p150f.C5162b.m25518a(r0, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r0.<init>(r3, r3)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r5.addView(r4, r0)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            goto L_0x0289
        L_0x021b:
            int r11 = m25510b()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r6 == r11) goto L_0x022d
            if (r0 == 0) goto L_0x022d
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r9 = "(isLand != currOrientation) && (screenMaskON)"
            com.pollfish.p150f.C5162b.m25518a(r0, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r0 = 0
            r9 = 0
            goto L_0x025b
        L_0x022d:
            int r0 = m25510b()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r6 != r0) goto L_0x0259
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r11 = "(isLand == currOrientation)"
            com.pollfish.p150f.C5162b.m25518a(r0, r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r6 != r7) goto L_0x0259
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r11 = "isLand == 1"
            com.pollfish.p150f.C5162b.m25518a(r0, r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r9 >= r10) goto L_0x0259
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r9 = "(currentViewWidth > currentViewHeight) "
            com.pollfish.p150f.C5162b.m25518a(r0, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r0 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r0 = r0.getHeight()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r9 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r9 = r9.getWidth()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            goto L_0x025b
        L_0x0259:
            r0 = r9
            r9 = r10
        L_0x025b:
            java.lang.String r10 = "LayoutRearranger"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r11.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r12 = "Adding parent of overlay in decorview in position: "
            r11.append(r12)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r12 = f18412a     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r11.append(r12)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r10, r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10 = 10
            if (r0 <= r10) goto L_0x027f
            if (r9 <= r10) goto L_0x027f
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.<init>(r0, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            goto L_0x0284
        L_0x027f:
            android.widget.RelativeLayout$LayoutParams r10 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.<init>(r3, r3)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
        L_0x0284:
            int r0 = f18412a     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r5.addView(r4, r0, r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
        L_0x0289:
            int r0 = f18412a     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r0 != r3) goto L_0x030a
            java.lang.String r0 = "LayoutRearranger"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = "root.getChildCount(): "
            r9.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r10 = r5.getChildCount()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r0, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
        L_0x02a7:
            int r0 = r5.getChildCount()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r8 >= r0) goto L_0x030a
            android.view.View r0 = r5.getChildAt(r8)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.Object r0 = r0.getTag()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = "LayoutRearranger"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r11 = "Child with tag: "
            r10.append(r11)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r10.append(r0)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r9, r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r0 == 0) goto L_0x0307
            java.lang.String r9 = "pollfish_after_overlay"
            boolean r0 = r0.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            if (r0 == 0) goto L_0x0307
            java.lang.String r0 = "LayoutRearranger"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = "Found original child position: "
            r9.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.append(r8)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r0, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            f18412a = r8     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r0 = "LayoutRearranger"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r10 = "Found parent of overlay layout at position: "
            r9.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r10 = f18412a     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r9.append(r10)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r0, r9)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
        L_0x0307:
            int r8 = r8 + 1
            goto L_0x02a7
        L_0x030a:
            m25509a(r6)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r0 = "LayoutRearranger"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r5.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r6 = "set currOrientation to isLand value: "
            r5.append(r6)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r6 = m25510b()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r5.append(r6)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r0, r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r0 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r5.<init>(r3, r3)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r4.addView(r0, r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r0.<init>(r3, r3)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r0.addRule(r2)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.d.a r2 = new com.pollfish.d.a     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r5 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.content.Context r9 = r5.getContext()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.app.Activity r10 = r1.f18414c     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.a.c r11 = r1.f18418g     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            boolean r12 = r1.f18419h     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.interfaces.a$c r13 = r1.f18420i     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.interfaces.a$b r14 = r1.f18421j     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.interfaces.PollfishSurveyCompletedListener r15 = r1.f18422k     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.interfaces.PollfishOpenedListener r5 = r1.f18423l     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.interfaces.PollfishClosedListener r6 = r1.f18424m     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.interfaces.PollfishUserNotEligibleListener r8 = r1.f18425n     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r7 = r1.f18426o     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r3 = r1.f18427p     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r22 = r0
            java.lang.String r0 = r1.f18428q     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r18 = r8
            r8 = r2
            r16 = r5
            r17 = r6
            r19 = r7
            r20 = r3
            r21 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r3 = -1
            r0.<init>(r3, r3)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r2.setLayoutParams(r0)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            android.view.View r0 = r1.f18415d     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r3 = "pollfish_prior_overlay"
            r0.setTag(r3)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r0 = "LayoutRearranger"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r3.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r5 = "overlayParentViewPosition: "
            r3.append(r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r5 = f18412a     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r3.append(r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r0, r3)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r0 = r22
            r4.addView(r2, r0)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r0 = "LayoutRearranger"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r3.<init>()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r5 = "root.getWidth(): "
            r3.append(r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r5 = r4.getWidth()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r3.append(r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r5 = " root.getHeight():"
            r3.append(r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            int r5 = r4.getHeight()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r3.append(r5)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            com.pollfish.p150f.C5162b.m25518a(r0, r3)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            r3 = 1
            r4.setFocusable(r3)     // Catch:{ Exception -> 0x03cc, StackOverflowError -> 0x03c3 }
            return r2
        L_0x03c3:
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r2 = "StackOverflowError"
            com.pollfish.p150f.C5162b.m25519b(r0, r2)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            goto L_0x0450
        L_0x03cc:
            r0 = move-exception
            java.lang.String r2 = "LayoutRearranger"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r3.<init>()     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            java.lang.String r4 = "error: "
            r3.append(r4)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r3.append(r0)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            java.lang.String r0 = r3.toString()     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            com.pollfish.p150f.C5162b.m25519b(r2, r0)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            goto L_0x0450
        L_0x03e4:
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r3 = "User provided a layout"
            com.pollfish.p150f.C5162b.m25518a(r0, r3)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            com.pollfish.d.a r0 = new com.pollfish.d.a     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            android.view.View r3 = r1.f18415d     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            android.content.Context r5 = r3.getContext()     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            android.app.Activity r6 = r1.f18414c     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            com.pollfish.a.c r7 = r1.f18418g     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            boolean r8 = r1.f18419h     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            com.pollfish.interfaces.a$c r9 = r1.f18420i     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            com.pollfish.interfaces.a$b r10 = r1.f18421j     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            com.pollfish.interfaces.PollfishSurveyCompletedListener r11 = r1.f18422k     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            com.pollfish.interfaces.PollfishOpenedListener r12 = r1.f18423l     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            com.pollfish.interfaces.PollfishClosedListener r13 = r1.f18424m     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            com.pollfish.interfaces.PollfishUserNotEligibleListener r14 = r1.f18425n     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            java.lang.String r15 = r1.f18426o     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            int r3 = r1.f18427p     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            java.lang.String r4 = r1.f18428q     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r17 = r4
            r4 = r0
            r16 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r4 = -1
            r3.<init>(r4, r4)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r3.addRule(r2)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r2.<init>(r4, r4)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r0.setLayoutParams(r2)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            android.view.ViewGroup r2 = r1.f18429r     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            java.lang.String r4 = "pollfish_user_layout"
            r2.setTag(r4)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            android.view.ViewGroup r2 = r1.f18429r     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            r2.addView(r0, r3)     // Catch:{ StackOverflowError -> 0x0439, Exception -> 0x0431 }
            return r0
        L_0x0431:
            java.lang.String r0 = "LayoutRearranger"
            java.lang.String r2 = "Exception: 3"
            com.pollfish.p150f.C5162b.m25519b(r0, r2)
            goto L_0x0450
        L_0x0439:
            r0 = move-exception
            java.lang.String r2 = "LayoutRearranger"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "StackOverflowError:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.pollfish.p150f.C5162b.m25519b(r2, r0)
        L_0x0450:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p150f.p151a.C5156a.mo16794a():com.pollfish.d.a");
    }
}
