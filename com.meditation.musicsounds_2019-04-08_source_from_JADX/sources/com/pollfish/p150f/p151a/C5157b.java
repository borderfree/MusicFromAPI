package com.pollfish.p150f.p151a;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.pollfish.constants.Position;
import com.pollfish.p148d.C5131a;
import com.pollfish.p150f.C5162b;
import com.pollfish.p150f.C5166c;
import java.lang.reflect.Field;

/* renamed from: com.pollfish.f.a.b */
public class C5157b {
    /* renamed from: a */
    public static int m25512a(Activity activity) {
        String str;
        StringBuilder sb;
        try {
            Rect rect = new Rect();
            View decorView = activity.getWindow().getDecorView();
            decorView.getWindowVisibleDisplayFrame(rect);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rect.bottom = ");
            sb2.append(rect.bottom);
            C5162b.m25518a("LayoutUtils", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("rect.height() = ");
            sb3.append(rect.height());
            C5162b.m25518a("LayoutUtils", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("rect.width() = ");
            sb4.append(rect.width());
            C5162b.m25518a("LayoutUtils", sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("rect.top = ");
            sb5.append(rect.top);
            C5162b.m25518a("LayoutUtils", sb5.toString());
            if (rect.top != 0) {
                return rect.top;
            }
            new Rect();
            try {
                Field declaredField = decorView.getClass().getDeclaredField("mFrameOffsets");
                declaredField.setAccessible(true);
                Rect rect2 = (Rect) declaredField.get(decorView);
                StringBuilder sb6 = new StringBuilder();
                sb6.append("insets.bottom = ");
                sb6.append(rect2.bottom);
                C5162b.m25518a("LayoutUtils", sb6.toString());
                StringBuilder sb7 = new StringBuilder();
                sb7.append("insets.height() = ");
                sb7.append(rect2.height());
                C5162b.m25518a("LayoutUtils", sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append("insets.width() = ");
                sb8.append(rect2.width());
                C5162b.m25518a("LayoutUtils", sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append("insets.top = ");
                sb9.append(rect2.top);
                C5162b.m25518a("LayoutUtils", sb9.toString());
                return rect2.top;
            } catch (NoSuchFieldException e) {
                str = "LayoutUtils";
                sb = new StringBuilder();
                sb.append("Trying to get insent - NoSuchFieldException: ");
                sb.append(e);
                C5162b.m25519b(str, sb.toString());
                return 0;
            } catch (IllegalAccessException e2) {
                str = "LayoutUtils";
                sb = new StringBuilder();
                sb.append("Trying to get insent - IllegalAccessException: ");
                sb.append(e2);
                C5162b.m25519b(str, sb.toString());
                return 0;
            } catch (Exception e3) {
                str = "LayoutUtils";
                sb = new StringBuilder();
                sb.append("Trying to get insent - Exception: ");
                sb.append(e3);
                C5162b.m25519b(str, sb.toString());
                return 0;
            }
        } catch (Exception unused) {
            C5162b.m25519b("LayoutUtils", "error while trying to get status height");
            return 0;
        }
    }

    /* renamed from: a */
    public static C5131a m25513a(Activity activity, ViewGroup viewGroup) {
        C5162b.m25518a("LayoutUtils", "getExistingOverlay");
        return m25515a((ViewGroup) activity.getWindow().getDecorView());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        com.pollfish.p150f.C5162b.m25518a("LayoutUtils", "found a child view with type ViewGroup");
        r5 = (android.view.ViewGroup) r4.getChildAt(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        r6 = "LayoutUtils";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r7 = new java.lang.StringBuilder();
        r7.append("initial view.getHeight(): ");
        r7.append(r5.getHeight());
        com.pollfish.p150f.C5162b.m25518a(r6, r7.toString());
        r7 = new java.lang.StringBuilder();
        r7.append("initialview.getWidth(): ");
        r7.append(r5.getWidth());
        com.pollfish.p150f.C5162b.m25518a("LayoutUtils", r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.pollfish.p148d.C5131a m25514a(android.app.Activity r21, com.pollfish.p145a.C5108c r22, boolean r23, com.pollfish.interfaces.C5174a.C5177c r24, com.pollfish.interfaces.C5174a.C5176b r25, com.pollfish.interfaces.PollfishSurveyCompletedListener r26, com.pollfish.interfaces.PollfishOpenedListener r27, com.pollfish.interfaces.PollfishClosedListener r28, com.pollfish.interfaces.PollfishUserNotEligibleListener r29, java.lang.String r30, int r31, java.lang.String r32, android.view.ViewGroup r33) {
        /*
            java.lang.String r0 = "LayoutUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "createLayout - shouldHide: "
            r1.append(r2)
            r2 = r23
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.pollfish.p150f.C5162b.m25518a(r0, r1)
            r1 = 0
            if (r22 != 0) goto L_0x001c
            return r1
        L_0x001c:
            java.lang.String r0 = "LayoutUtils"
            java.lang.String r3 = "For UNITY: false"
            com.pollfish.p150f.C5162b.m25518a(r0, r3)
            r3 = 0
            android.view.Window r0 = r21.getWindow()     // Catch:{ Exception -> 0x00bf }
            android.view.View r0 = r0.getDecorView()     // Catch:{ Exception -> 0x00bf }
            r4 = r0
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = "LayoutUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bc }
            r5.<init>()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r6 = "view: "
            r5.append(r6)     // Catch:{ Exception -> 0x00bc }
            r5.append(r1)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00bc }
            com.pollfish.p150f.C5162b.m25518a(r0, r5)     // Catch:{ Exception -> 0x00bc }
            if (r4 == 0) goto L_0x00b7
            java.lang.String r0 = "LayoutUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bc }
            r5.<init>()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r6 = "DecorView getChildCount(): "
            r5.append(r6)     // Catch:{ Exception -> 0x00bc }
            int r6 = r4.getChildCount()     // Catch:{ Exception -> 0x00bc }
            r5.append(r6)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00bc }
            com.pollfish.p150f.C5162b.m25518a(r0, r5)     // Catch:{ Exception -> 0x00bc }
            r0 = 0
        L_0x0062:
            int r5 = r4.getChildCount()     // Catch:{ Exception -> 0x00bc }
            if (r0 >= r5) goto L_0x00b7
            android.view.View r5 = r4.getChildAt(r0)     // Catch:{ Exception -> 0x00bc }
            boolean r5 = r5 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x00bc }
            if (r5 == 0) goto L_0x00b4
            java.lang.String r5 = "LayoutUtils"
            java.lang.String r6 = "found a child view with type ViewGroup"
            com.pollfish.p150f.C5162b.m25518a(r5, r6)     // Catch:{ Exception -> 0x00bc }
            android.view.View r5 = r4.getChildAt(r0)     // Catch:{ Exception -> 0x00bc }
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch:{ Exception -> 0x00bc }
            java.lang.String r6 = "LayoutUtils"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2 }
            r7.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r9 = "initial view.getHeight(): "
            r7.append(r9)     // Catch:{ Exception -> 0x00b2 }
            int r9 = r5.getHeight()     // Catch:{ Exception -> 0x00b2 }
            r7.append(r9)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00b2 }
            com.pollfish.p150f.C5162b.m25518a(r6, r7)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r6 = "LayoutUtils"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2 }
            r7.<init>()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r9 = "initialview.getWidth(): "
            r7.append(r9)     // Catch:{ Exception -> 0x00b2 }
            int r9 = r5.getWidth()     // Catch:{ Exception -> 0x00b2 }
            r7.append(r9)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00b2 }
            com.pollfish.p150f.C5162b.m25518a(r6, r7)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00b9
        L_0x00b2:
            r0 = move-exception
            goto L_0x00c2
        L_0x00b4:
            int r0 = r0 + 1
            goto L_0x0062
        L_0x00b7:
            r5 = r1
            r0 = 0
        L_0x00b9:
            r20 = r0
            goto L_0x00da
        L_0x00bc:
            r0 = move-exception
            r5 = r1
            goto L_0x00c2
        L_0x00bf:
            r0 = move-exception
            r4 = r1
            r5 = r4
        L_0x00c2:
            java.lang.String r6 = "LayoutUtils"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "Exception while trying to get view decor: "
            r7.append(r9)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.pollfish.p150f.C5162b.m25519b(r6, r0)
            r20 = 0
        L_0x00da:
            if (r5 != 0) goto L_0x010d
            java.lang.String r0 = "LayoutUtils"
            java.lang.String r6 = "did not find viewgroup as child of DecorView"
            com.pollfish.p150f.C5162b.m25518a(r0, r6)
            android.view.View r0 = r4.getChildAt(r3)     // Catch:{ ClassCastException -> 0x00f5, Exception -> 0x00e9 }
            r5 = r0
            goto L_0x010d
        L_0x00e9:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "LayoutUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Exception: "
            goto L_0x0100
        L_0x00f5:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "LayoutUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "ClassCastException: "
        L_0x0100:
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.pollfish.p150f.C5162b.m25519b(r0, r3)
        L_0x010d:
            if (r5 != 0) goto L_0x0111
            if (r33 == 0) goto L_0x0140
        L_0x0111:
            com.pollfish.f.a.a r0 = new com.pollfish.f.a.a
            r3 = r0
            com.pollfish.constants.Position r6 = r22.mo16613C()
            int r7 = r22.mo16614D()
            r4 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r17 = r31
            r18 = r32
            r19 = r33
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.pollfish.d.a r1 = r0.mo16794a()
            com.pollfish.p148d.C5131a.m25407a(r20)
        L_0x0140:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pollfish.p150f.p151a.C5157b.m25514a(android.app.Activity, com.pollfish.a.c, boolean, com.pollfish.interfaces.a$c, com.pollfish.interfaces.a$b, com.pollfish.interfaces.PollfishSurveyCompletedListener, com.pollfish.interfaces.PollfishOpenedListener, com.pollfish.interfaces.PollfishClosedListener, com.pollfish.interfaces.PollfishUserNotEligibleListener, java.lang.String, int, java.lang.String, android.view.ViewGroup):com.pollfish.d.a");
    }

    /* renamed from: a */
    public static C5131a m25515a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C5131a) {
                C5162b.m25518a("LayoutUtils", "child instanceof OverlayLayout");
                return (C5131a) childAt;
            }
            if (childAt instanceof ViewGroup) {
                C5131a a = m25515a((ViewGroup) childAt);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m25516a(final View view, Position position, final boolean z, int i, final OnClickListener onClickListener, int i2) {
        if (z) {
            view.setVisibility(0);
        }
        String a = C5166c.m25531a();
        boolean a2 = C5166c.m25538a(view);
        StringBuilder sb = new StringBuilder();
        sb.append("androidOS: ");
        sb.append(a);
        sb.append(" isHardwAccOn: ");
        sb.append(a2);
        C5162b.m25518a("LayoutUtils", sb.toString());
        if ((a2 || !a.equalsIgnoreCase("4.1.2")) && i2 != 1) {
            (z ? C5166c.m25529a(view, position, 0, (long) i) : C5166c.m25540b(view, position, 0, (long) i)).setAnimationListener(new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    if (!z) {
                        view.setVisibility(4);
                    }
                    view.setSoundEffectsEnabled(true);
                    new Handler().post(new Runnable() {
                        public void run() {
                            view.setOnClickListener(onClickListener);
                        }
                    });
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
            return;
        }
        AlphaAnimation alphaAnimation = z ? new AlphaAnimation(0.0f, 1.0f) : new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration((long) 700);
        if (!z) {
            alphaAnimation.setAnimationListener(new AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    view.setVisibility(4);
                    view.setOnClickListener(null);
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            });
        }
        view.startAnimation(alphaAnimation);
        new Handler().post(new Runnable() {
            public void run() {
                view.setOnClickListener(onClickListener);
            }
        });
    }

    /* renamed from: a */
    public static void m25517a(C5131a aVar) {
        C5162b.m25518a("LayoutUtils", "bringAppViewsToPriorOverlayState");
        try {
            ViewGroup viewGroup = (ViewGroup) aVar.getParent();
            if (viewGroup != null) {
                String str = (String) viewGroup.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("Overlay parent tag: ");
                sb.append(str);
                C5162b.m25518a("LayoutUtils", sb.toString());
                if (str == null || !str.equalsIgnoreCase("pollfish_user_layout")) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("rootOverlayView.getChildCount(): ");
                    sb2.append(viewGroup.getChildCount());
                    C5162b.m25518a("LayoutUtils", sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("rootOverlayView.getHeight(): ");
                    sb3.append(viewGroup.getHeight());
                    C5162b.m25518a("LayoutUtils", sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("rootOverlayView.getWidth(): ");
                    sb4.append(viewGroup.getWidth());
                    C5162b.m25518a("LayoutUtils", sb4.toString());
                    if (viewGroup2 != null) {
                        C5162b.m25518a("LayoutUtils", "removing Pollfish overlay view from app views hierarchy...");
                        viewGroup2.removeView(viewGroup);
                        if (viewGroup.getChildCount() > 1) {
                            viewGroup.removeView(aVar);
                            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                                View childAt = viewGroup.getChildAt(i);
                                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("rootOverlayView lp.leftMargin: ");
                                sb5.append(marginLayoutParams.leftMargin);
                                sb5.append(" lp.topMargin: ");
                                sb5.append(marginLayoutParams.topMargin);
                                sb5.append(" lp.bottomMargin: ");
                                sb5.append(marginLayoutParams.bottomMargin);
                                sb5.append(" lp.rightMargin: ");
                                sb5.append(marginLayoutParams.rightMargin);
                                C5162b.m25518a("LayoutUtils", sb5.toString());
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("tempView.getTop(): ");
                                sb6.append(childAt.getTop());
                                sb6.append("tempView.getBottom(): ");
                                sb6.append(childAt.getBottom());
                                C5162b.m25518a("LayoutUtils", sb6.toString());
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("tempView.getHeight(): ");
                                sb7.append(childAt.getHeight());
                                sb7.append("tempView.getWidth(): ");
                                sb7.append(childAt.getWidth());
                                C5162b.m25518a("LayoutUtils", sb7.toString());
                                if (childAt != null) {
                                    String str2 = (String) childAt.getTag();
                                    if (str2 != null && str2.equalsIgnoreCase("pollfish_prior_overlay")) {
                                        C5162b.m25518a("LayoutUtils", "Found previous original app view - reordering view tree");
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append("Previous original app view index in hierarchy: ");
                                        sb8.append(C5131a.m25420j());
                                        C5162b.m25518a("LayoutUtils", sb8.toString());
                                        viewGroup.removeAllViews();
                                        viewGroup2.addView(childAt, C5131a.m25420j());
                                        viewGroup2.removeView(viewGroup);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                C5162b.m25518a("LayoutUtils", "Prior user layout was used.");
                viewGroup.removeView(aVar);
            }
        } catch (Exception e) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(" Error while bringAppViewsToPriorOverlayState: ");
            sb9.append(e);
            C5162b.m25519b("LayoutUtils", sb9.toString());
        }
    }
}
