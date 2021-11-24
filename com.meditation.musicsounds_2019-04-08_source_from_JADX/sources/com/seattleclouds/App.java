package com.seattleclouds;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.multidex.C0218a;
import android.support.multidex.C0222b;
import android.support.p009v4.app.C0366g;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0767e;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import com.android.vending.expansion.zipfile.C1166a;
import com.android.vending.expansion.zipfile.C1167b;
import com.facebook.appevents.AppEventsLogger;
import com.google.android.gms.analytics.C2935b;
import com.google.android.gms.analytics.C2936c.C2938b;
import com.google.android.gms.analytics.C2940e;
import com.google.android.vending.expansion.downloader.impl.C4849d;
import com.google.android.vending.expansion.downloader.impl.C4852f;
import com.seattleclouds.C5451m.C5454c;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.ads.AdsManagerKeys;
import com.seattleclouds.ads.C5247b;
import com.seattleclouds.ads.C5260d;
import com.seattleclouds.ads.RemoveAdsActivity;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.billing.C5316c;
import com.seattleclouds.billing.C5319d;
import com.seattleclouds.gcm.AnnouncementActivity;
import com.seattleclouds.gcm.C5382a;
import com.seattleclouds.location.LocationDetectorActivity;
import com.seattleclouds.modules.p173k.C5770c;
import com.seattleclouds.modules.rateandreview.C6234a;
import com.seattleclouds.modules.savephoto.SavePhotoActivity;
import com.seattleclouds.modules.search.SearchActivity;
import com.seattleclouds.modules.voicerecord.VoiceRecordPickerActivity;
import com.seattleclouds.p159d.C5330c;
import com.seattleclouds.p161f.C5346b;
import com.seattleclouds.paypal.C6354a;
import com.seattleclouds.util.C6585ah;
import com.seattleclouds.util.C6585ah.C6587a;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6612h;
import com.seattleclouds.util.C6614j;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6639t;
import com.seattleclouds.util.C6640u;
import com.seattleclouds.util.HTTPUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import p194nl.siegmann.epublib.domain.TableOfContents;

public class App extends C0222b {

    /* renamed from: A */
    public static String f18468A = null;

    /* renamed from: B */
    public static String f18469B = null;

    /* renamed from: C */
    public static String f18470C = null;

    /* renamed from: D */
    public static String f18471D = null;

    /* renamed from: E */
    public static String f18472E = null;

    /* renamed from: F */
    public static boolean f18473F = false;

    /* renamed from: G */
    public static boolean f18474G = true;

    /* renamed from: H */
    public static boolean f18475H = false;

    /* renamed from: I */
    public static boolean f18476I = false;

    /* renamed from: J */
    public static boolean f18477J = false;

    /* renamed from: K */
    public static boolean f18478K = false;

    /* renamed from: L */
    public static boolean f18479L = false;

    /* renamed from: M */
    public static boolean f18480M = false;

    /* renamed from: N */
    public static boolean f18481N = false;

    /* renamed from: O */
    public static boolean f18482O = false;

    /* renamed from: P */
    public static String f18483P = null;

    /* renamed from: Q */
    public static String f18484Q = null;

    /* renamed from: R */
    public static boolean f18485R = false;

    /* renamed from: S */
    public static C6585ah f18486S = null;

    /* renamed from: T */
    public static C6585ah f18487T = null;

    /* renamed from: U */
    public static C6354a f18488U = null;

    /* renamed from: V */
    public static C5330c f18489V = null;

    /* renamed from: W */
    public static int[] f18490W = null;

    /* renamed from: X */
    public static C1167b f18491X = null;

    /* renamed from: Y */
    public static boolean f18492Y = false;

    /* renamed from: Z */
    private static boolean f18493Z = false;

    /* renamed from: a */
    public static String f18494a = "seattleclouds.com";

    /* renamed from: aa */
    private static Resources f18495aa = null;

    /* renamed from: ab */
    private static C5230aa f18496ab = null;

    /* renamed from: ac */
    private static C2940e f18497ac = null;

    /* renamed from: ad */
    private static App f18498ad = null;

    /* renamed from: ae */
    private static String f18499ae = null;

    /* renamed from: b */
    public static boolean f18500b = false;

    /* renamed from: c */
    public static C5227a f18501c = null;

    /* renamed from: d */
    public static String f18502d = null;

    /* renamed from: e */
    public static String f18503e = null;

    /* renamed from: f */
    public static String f18504f = null;

    /* renamed from: g */
    public static String f18505g = null;

    /* renamed from: h */
    public static String f18506h = null;

    /* renamed from: i */
    public static AssetManager f18507i = null;

    /* renamed from: j */
    public static String f18508j = null;

    /* renamed from: k */
    public static String f18509k = null;

    /* renamed from: l */
    public static boolean f18510l = false;

    /* renamed from: m */
    public static boolean f18511m = false;

    /* renamed from: n */
    public static boolean f18512n = false;

    /* renamed from: o */
    public static boolean f18513o = false;

    /* renamed from: p */
    public static boolean f18514p = false;

    /* renamed from: q */
    public static boolean f18515q = false;

    /* renamed from: r */
    public static String f18516r;

    /* renamed from: s */
    public static String f18517s;

    /* renamed from: t */
    public static String f18518t;

    /* renamed from: u */
    public static String f18519u;

    /* renamed from: v */
    public static String f18520v;

    /* renamed from: w */
    public static String f18521w;

    /* renamed from: x */
    public static String f18522x;

    /* renamed from: y */
    public static String f18523y;

    /* renamed from: z */
    public static String f18524z;

    /* renamed from: a */
    public static Intent m25602a(Context context, String str) {
        Class s = m25677s(str);
        if (s != null) {
            return new Intent(context, s);
        }
        return null;
    }

    /* renamed from: a */
    public static Intent m25603a(FragmentInfo fragmentInfo, Context context) {
        Intent intent = new Intent(context, SCPageFragmentActivity.class);
        intent.putExtra("ARG_PAGE_FRAGMENT_INFO", fragmentInfo);
        if (fragmentInfo != null) {
            intent.putExtra("PAGE_TRANSITION", fragmentInfo.mo16869b().getString("PAGE_TRANSITION"));
        }
        return intent;
    }

    /* renamed from: a */
    public static Intent m25604a(String str, Activity activity, boolean z) {
        Intent intent;
        String str2;
        String R;
        String b = C6598aq.m31941b(str);
        C5230aa aaVar = (C5230aa) f18501c.mo16902D().get(b);
        Intent intent2 = null;
        if (aaVar != null && aaVar.mo17118b() != null) {
            String b2 = aaVar.mo17118b();
            aaVar.mo17128c(C6598aq.m31939a(str));
            C6675z a = m25612a(aaVar);
            if (a != null) {
                intent2 = a.getPageIntent(activity, aaVar);
            }
            if (intent == null) {
                if (b2.equalsIgnoreCase("locationDetector")) {
                    intent = new Intent(activity, LocationDetectorActivity.class);
                    intent.putExtra("ARG_COORDINATE_FORMAT", aaVar.mo17020N());
                } else {
                    if (b2.equalsIgnoreCase("search")) {
                        intent = new Intent(activity, SearchActivity.class);
                        str2 = "ARG_INDEX_FILE_NAME";
                        R = "indexpage.plist";
                    } else if (b2.equalsIgnoreCase("savePhoto")) {
                        intent = new Intent(activity, SavePhotoActivity.class);
                        intent.putExtra("EXTRA_BOTTOM_TEXT", aaVar.mo17106ao());
                        intent.putExtra("EXTRA_LEFT_TEXT_PREFIXES", aaVar.mo17107ap());
                        str2 = "EXTRA_STORE_ID";
                        R = aaVar.mo17046a();
                    } else if (b2.equalsIgnoreCase("sendvoicerecord")) {
                        intent = new Intent(activity, VoiceRecordPickerActivity.class);
                        intent.putExtra("sendonly", true);
                        str2 = "emailToSend";
                        R = aaVar.mo17028R();
                    } else if (b2.equalsIgnoreCase("qrcodescanner")) {
                        intent = m25602a((Context) activity, "net.sourceforge.zbar.android.ZBarScanner");
                        if (intent != null) {
                            intent.putExtra("SCAN_MODE", "QR_CODE_MODE");
                            intent.putExtra("FAST_SCAN", true);
                        }
                    } else if (b2.equalsIgnoreCase("phonegap")) {
                        intent = m25602a((Context) activity, "com.seattleclouds.modules.phonegap.PhoneGapActivity");
                    }
                    intent.putExtra(str2, R);
                }
            }
            if (intent == null && z) {
                intent = m25630b(str, (Context) activity);
            }
            if (intent != null) {
                intent.putExtra("PAGE_ID", b);
                intent.putExtra("PAGE_STYLE", aaVar.mo17110as());
                intent.putExtra("PAGE_TRANSITION", aaVar.mo17149h());
            }
            return intent;
        } else if (z) {
            return m25630b(str, (Context) activity);
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public static Intent m25605a(String str, FragmentInfo fragmentInfo, Activity activity) {
        if (fragmentInfo == null || fragmentInfo.mo16867a().equals(C5346b.class.getName())) {
            return m25604a(str, activity, false);
        }
        return null;
    }

    /* renamed from: a */
    public static FragmentInfo m25606a(String str, Context context) {
        return m25609a(str, context, true, Boolean.valueOf(false));
    }

    /* renamed from: a */
    public static FragmentInfo m25607a(String str, Context context, Boolean bool) {
        return m25609a(str, context, true, bool);
    }

    /* renamed from: a */
    public static FragmentInfo m25608a(String str, Context context, boolean z) {
        return m25609a(str, context, z, Boolean.valueOf(false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0727, code lost:
        if (r5 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0739, code lost:
        if (r5 == null) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        if (r14 != false) goto L_0x00b3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.seattleclouds.FragmentInfo m25609a(java.lang.String r12, android.content.Context r13, boolean r14, java.lang.Boolean r15) {
        /*
            java.lang.String r0 = com.seattleclouds.util.C6598aq.m31941b(r12)
            com.seattleclouds.a r1 = f18501c
            java.util.Map r1 = r1.mo16902D()
            java.lang.Object r1 = r1.get(r0)
            com.seattleclouds.aa r1 = (com.seattleclouds.C5230aa) r1
            r2 = 0
            if (r1 == 0) goto L_0x0eea
            java.lang.String r3 = r1.mo17118b()
            if (r3 != 0) goto L_0x001b
            goto L_0x0eea
        L_0x001b:
            java.lang.String r3 = r1.mo17118b()
            com.seattleclouds.h r4 = new com.seattleclouds.h
            r4.<init>(r12, r3)
            java.util.HashMap r5 = com.seattleclouds.util.C6598aq.m31939a(r12)
            r1.mo17128c(r5)
            com.seattleclouds.z r5 = m25612a(r1)
            if (r5 == 0) goto L_0x0036
            com.seattleclouds.FragmentInfo r5 = r5.getPageFragmentInfo(r13, r1)
            goto L_0x0037
        L_0x0036:
            r5 = r2
        L_0x0037:
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x003d
            goto L_0x0d8a
        L_0x003d:
            boolean r8 = r1.mo17019M()
            if (r8 == 0) goto L_0x006d
            boolean r8 = com.seattleclouds.modules.loginregister.C5799d.m28556b()
            if (r8 != 0) goto L_0x006d
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "NEXT_PAGE_ID"
            r13.putString(r15, r0)
            com.seattleclouds.aa r15 = m25676s()
            java.lang.String r3 = "LOGIN_REGISTER_PAGE_STYLE"
            android.os.Bundle r15 = r15.mo17110as()
            r13.putBundle(r3, r15)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.loginregister.d> r15 = com.seattleclouds.modules.loginregister.C5799d.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x006d:
            boolean r8 = r1.mo17019M()
            if (r8 == 0) goto L_0x00a3
            boolean r8 = com.seattleclouds.modules.loginregister.C5799d.m28556b()
            if (r8 == 0) goto L_0x00a3
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x00a3
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "NEXT_PAGE_ID"
            r13.putString(r15, r0)
            com.seattleclouds.aa r15 = m25676s()
            java.lang.String r3 = "LOGIN_REGISTER_PAGE_STYLE"
            android.os.Bundle r15 = r15.mo17110as()
            r13.putBundle(r3, r15)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.loginregister.d> r15 = com.seattleclouds.modules.loginregister.C5799d.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x00a3:
            java.lang.String r15 = "html"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x00b9
            boolean r15 = r1.mo16999C()
            if (r15 != 0) goto L_0x00b9
            if (r14 == 0) goto L_0x0d8a
        L_0x00b3:
            com.seattleclouds.FragmentInfo r5 = m25672q(r12)
            goto L_0x0d8a
        L_0x00b9:
            boolean r15 = r1.mo16999C()
            if (r15 == 0) goto L_0x0112
            java.lang.String r15 = "rsspro"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 != 0) goto L_0x0112
            java.lang.String r15 = "rssprodetail"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 != 0) goto L_0x0112
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r3 = r1.mo17118b()
            java.lang.String r4 = "favorites"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x00fb
            java.lang.String r3 = "ARG_URL"
            java.lang.String r4 = r1.mo17046a()
            java.lang.String r4 = m25655h(r4)
            r15.putString(r3, r4)
            java.lang.String r3 = "jsonString"
            com.seattleclouds.modules.f.a r13 = com.seattleclouds.modules.p168f.C5614a.m27865a(r13)
            java.lang.String r13 = r13.mo18142e()
            r15.putString(r3, r13)
            goto L_0x0105
        L_0x00fb:
            java.lang.String r13 = "ARG_URL"
            r15.putString(r13, r12)
            java.lang.String r13 = "jsonString"
            r15.putString(r13, r2)
        L_0x0105:
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.e.a> r13 = com.seattleclouds.modules.p166e.C5577a.class
            java.lang.String r13 = r13.getName()
            r5.<init>(r13, r15)
            goto L_0x0d8a
        L_0x0112:
            java.lang.String r15 = "mosaic"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x013c
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "mosaicimages"
            java.util.ArrayList<com.seattleclouds.modules.mosaic.ImgMetadata> r3 = r1.f18742d
            r13.putParcelableArrayList(r15, r3)
            java.lang.String r15 = "mosaicAutoCaptionsEnabled"
            boolean r3 = r1.mo17102al()
            r13.putBoolean(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.mosaic.a> r15 = com.seattleclouds.modules.mosaic.C5870a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x013c:
            java.lang.String r15 = "feedback"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 != 0) goto L_0x0cc7
            java.lang.String r15 = "locationfinder"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x014e
            goto L_0x0cc7
        L_0x014e:
            java.lang.String r15 = "esignature"
            boolean r15 = r3.equals(r15)
            if (r15 == 0) goto L_0x0174
            boolean r13 = com.seattleclouds.appauth.C5279b.m26372a()
            if (r13 != 0) goto L_0x0162
            boolean r13 = com.seattleclouds.appauth.C5279b.m26381b()
            if (r13 == 0) goto L_0x0d8a
        L_0x0162:
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.esignature.g> r15 = com.seattleclouds.modules.esignature.C5607g.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0174:
            java.lang.String r15 = "map"
            boolean r15 = r1.mo17123b(r15)
            if (r15 == 0) goto L_0x0188
            java.util.ArrayList<com.seattleclouds.modules.feedback.LocationModel> r13 = r1.f18741c
            java.util.HashMap r15 = r1.mo17199x()
            com.seattleclouds.FragmentInfo r5 = com.seattleclouds.location.C5420f.m27113a(r13, r15)
            goto L_0x0d8a
        L_0x0188:
            java.lang.String r15 = "quiz"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x01cf
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageId"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            java.lang.String r15 = "quizTitle"
            java.lang.String r3 = r1.mo17111at()
            r13.putString(r15, r3)
            java.lang.String r15 = "quizBgImage"
            java.lang.String r3 = r1.mo17113av()
            r13.putString(r15, r3)
            java.lang.String r15 = "quizButtonsBgImage"
            java.lang.String r3 = r1.mo17114aw()
            r13.putString(r15, r3)
            java.lang.String r15 = "isQuizRandomize"
            boolean r3 = r1.mo17112au()
            r13.putBoolean(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.p.h> r15 = com.seattleclouds.modules.p181p.C6016h.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x01cf:
            java.lang.String r15 = "locationDetector"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x01f2
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_COORDINATE_FORMAT"
            int r3 = r1.mo17020N()
            r13.putInt(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.location.c> r15 = com.seattleclouds.location.C5402c.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x01f2:
            java.lang.String r15 = "calendar"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x025d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = f18523y
            r13.append(r15)
            java.lang.String r15 = "-"
            r13.append(r15)
            java.lang.String r15 = f18524z
            r13.append(r15)
            java.lang.String r15 = "-"
            r13.append(r15)
            java.lang.String r15 = r1.mo17046a()
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r3 = "storeId"
            r15.putString(r3, r13)
            java.lang.String r13 = "categories"
            java.util.ArrayList r3 = r1.mo17000D()
            r15.putStringArrayList(r13, r3)
            java.lang.String r13 = "categoryColors"
            java.util.ArrayList r3 = r1.mo17002E()
            r15.putIntegerArrayList(r13, r3)
            java.lang.String r13 = "syncedEventsResourceName"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r4 = ".json"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r15.putString(r13, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.calendar.a> r13 = com.seattleclouds.modules.calendar.C5498a.class
            java.lang.String r13 = r13.getName()
            r5.<init>(r13, r15)
            goto L_0x0d8a
        L_0x025d:
            java.lang.String r15 = "search"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x027e
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_INDEX_FILE_NAME"
            java.lang.String r3 = "indexpage.plist"
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.search.a> r15 = com.seattleclouds.modules.search.C6277a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x027e:
            java.lang.String r15 = "dynamicList"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x0330
            java.lang.String r13 = r1.mo17038W()
            android.net.Uri r15 = android.net.Uri.parse(r12)
            java.lang.String r3 = "configfileurl"
            java.lang.String r15 = r15.getQueryParameter(r3)
            boolean r3 = com.seattleclouds.util.C6592al.m31909b(r15)
            if (r3 != 0) goto L_0x029b
            r13 = r15
        L_0x029b:
            if (r13 != 0) goto L_0x02c0
            java.lang.String r13 = r1.mo17046a()
            java.lang.String r15 = r1.mo17046a()
            java.lang.String r3 = "."
            int r15 = r15.lastIndexOf(r3)
            java.lang.String r13 = r13.substring(r6, r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            java.lang.String r13 = ".xml"
            r15.append(r13)
            java.lang.String r13 = r15.toString()
        L_0x02c0:
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r3 = "CONFIG_RESOURCE_NAME_OR_URL"
            r15.putString(r3, r13)
            java.lang.String r13 = "LIST_ID"
            java.lang.String r3 = "root"
            r15.putString(r13, r3)
            java.util.HashMap r13 = r1.mo17199x()
            java.lang.String r3 = "enablelogoutbtn"
            boolean r13 = r13.containsKey(r3)
            if (r13 == 0) goto L_0x02fa
            java.util.HashMap r13 = r1.mo17199x()
            java.lang.String r3 = "enablelogoutbtn"
            java.lang.Object r13 = r13.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = r13.toString()
            java.lang.String r3 = "yes"
            boolean r13 = r13.equalsIgnoreCase(r3)
            if (r13 == 0) goto L_0x02fa
            java.lang.String r13 = "ENABLE_LOGOUT_BTN"
            r15.putBoolean(r13, r7)
        L_0x02fa:
            java.util.HashMap r13 = r1.mo17199x()
            java.lang.String r3 = "enablerefreshbtn"
            boolean r13 = r13.containsKey(r3)
            if (r13 == 0) goto L_0x0323
            java.util.HashMap r13 = r1.mo17199x()
            java.lang.String r3 = "enablerefreshbtn"
            java.lang.Object r13 = r13.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = r13.toString()
            java.lang.String r3 = "yes"
            boolean r13 = r13.equalsIgnoreCase(r3)
            if (r13 == 0) goto L_0x0323
            java.lang.String r13 = "ENABLE_REFRESH_BTN"
            r15.putBoolean(r13, r7)
        L_0x0323:
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.dynamiclist.c> r13 = com.seattleclouds.modules.dynamiclist.C5562c.class
            java.lang.String r13 = r13.getName()
            r5.<init>(r13, r15)
            goto L_0x0d8a
        L_0x0330:
            java.lang.String r15 = "quizquestion"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x034f
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_URL"
            r13.putString(r15, r12)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.q.a> r15 = com.seattleclouds.modules.p184q.C6192a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x034f:
            java.lang.String r15 = "quizresult"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x0392
            java.io.InputStream r13 = m25649e(r0)     // Catch:{ IOException -> 0x0389 }
            java.lang.String r13 = com.seattleclouds.util.C6613i.m31991b(r13)     // Catch:{ IOException -> 0x0389 }
            if (r13 == 0) goto L_0x0366
            java.lang.String r13 = com.seattleclouds.util.C6640u.m32088a(r13)     // Catch:{ IOException -> 0x0389 }
            goto L_0x0367
        L_0x0366:
            r13 = r2
        L_0x0367:
            if (r13 == 0) goto L_0x0d8a
            java.lang.String r15 = ""
            boolean r15 = r13.equalsIgnoreCase(r15)     // Catch:{ IOException -> 0x0389 }
            if (r15 != 0) goto L_0x0d8a
            android.os.Bundle r15 = new android.os.Bundle     // Catch:{ IOException -> 0x0389 }
            r15.<init>()     // Catch:{ IOException -> 0x0389 }
            java.lang.String r3 = "ARG_HTML_STRING"
            r15.putString(r3, r13)     // Catch:{ IOException -> 0x0389 }
            com.seattleclouds.FragmentInfo r13 = new com.seattleclouds.FragmentInfo     // Catch:{ IOException -> 0x0389 }
            java.lang.Class<com.seattleclouds.f.b> r3 = com.seattleclouds.p161f.C5346b.class
            java.lang.String r3 = r3.getName()     // Catch:{ IOException -> 0x0389 }
            r13.<init>(r3, r15)     // Catch:{ IOException -> 0x0389 }
        L_0x0386:
            r5 = r13
            goto L_0x0d8a
        L_0x0389:
            java.lang.String r13 = "App"
            java.lang.String r15 = "Error getting rawHtml"
            android.util.Log.e(r13, r15)
            goto L_0x0d8a
        L_0x0392:
            java.lang.String r15 = "rsspro"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x03c6
            java.lang.String r13 = "com.seattleclouds.modules.rsspro.RSSProFragment"
            java.lang.Class r13 = m25677s(r13)
            if (r13 == 0) goto L_0x03c1
            java.lang.String r15 = r1.mo17014K()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "ARG_URL"
            r3.putString(r4, r12)
            java.lang.String r4 = "FEED_URL_IDENTIFIER"
            r3.putString(r4, r15)
            com.seattleclouds.FragmentInfo r15 = new com.seattleclouds.FragmentInfo
            java.lang.String r13 = r13.getName()
            r15.<init>(r13, r3)
            r5 = r15
            goto L_0x0d8a
        L_0x03c1:
            com.seattleclouds.FragmentInfo r13 = m25672q(r12)
            goto L_0x0386
        L_0x03c6:
            java.lang.String r15 = "rssprodetail"
            boolean r15 = r3.equalsIgnoreCase(r15)
            if (r15 == 0) goto L_0x0434
            android.net.Uri r15 = android.net.Uri.parse(r12)
            java.lang.String r3 = r1.mo17034U()
            java.lang.String r4 = "itemparenturl"
            java.lang.String r15 = r15.getQueryParameter(r4)
            if (r15 == 0) goto L_0x03df
            goto L_0x03e0
        L_0x03df:
            r15 = r3
        L_0x03e0:
            com.seattleclouds.a r3 = f18501c
            org.json.JSONObject r3 = r3.mo16943d(r15)
            if (r3 == 0) goto L_0x042b
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r4 = "ARG_URL"
            r13.putString(r4, r12)
            java.lang.String r4 = "jsonString"
            r13.putString(r4, r2)
            java.lang.String r4 = "parentPageUrl"
            r13.putString(r4, r15)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.e.a> r4 = com.seattleclouds.modules.p166e.C5577a.class
            java.lang.String r4 = r4.getName()
            r5.<init>(r4, r13)
            com.seattleclouds.a r4 = f18501c     // Catch:{ JSONException -> 0x0428 }
            java.util.Map r4 = r4.mo16902D()     // Catch:{ JSONException -> 0x0428 }
            java.lang.Object r15 = r4.get(r15)     // Catch:{ JSONException -> 0x0428 }
            com.seattleclouds.aa r15 = (com.seattleclouds.C5230aa) r15     // Catch:{ JSONException -> 0x0428 }
            if (r15 == 0) goto L_0x0d8a
            boolean r15 = r15.mo17098aj()     // Catch:{ JSONException -> 0x0428 }
            if (r15 == 0) goto L_0x0d8a
            java.lang.String r15 = "baseURL"
            java.lang.String r4 = "baseURL"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ JSONException -> 0x0428 }
            r13.putString(r15, r3)     // Catch:{ JSONException -> 0x0428 }
            goto L_0x0d8a
        L_0x0428:
            goto L_0x0d8a
        L_0x042b:
            java.lang.String r15 = "Error parsing RSS"
            java.lang.String r3 = "Unable to access rss content from specified url"
            com.seattleclouds.util.C6620n.m32034a(r13, r15, r3)
            goto L_0x0d8a
        L_0x0434:
            java.lang.String r13 = "karaoke"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0469
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageId"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            java.lang.String r15 = "songFile"
            java.lang.String r3 = r1.mo17103am()
            r13.putString(r15, r3)
            java.lang.String r15 = "autoStart"
            boolean r3 = r1.mo17105an()
            r13.putBoolean(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.j.c> r15 = com.seattleclouds.modules.p172j.C5752c.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0469:
            java.lang.String r13 = "camera"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x04c9
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageId"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            java.lang.String r15 = "sendtoaddresses"
            java.util.ArrayList r3 = r1.mo17169n()
            r13.putStringArrayList(r15, r3)
            java.lang.String r15 = "welcomeimg"
            java.lang.String r3 = r1.mo17022O()
            r13.putString(r15, r3)
            java.util.HashMap r15 = r1.mo17199x()
            java.lang.String r3 = "allowSharingAndroid"
            boolean r15 = r15.containsKey(r3)
            if (r15 == 0) goto L_0x04b7
            java.util.HashMap r15 = r1.mo17199x()
            java.lang.String r3 = "allowSharingAndroid"
            java.lang.Object r15 = r15.get(r3)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r3 = "no"
            boolean r15 = r15.equalsIgnoreCase(r3)
            if (r15 == 0) goto L_0x04b7
            java.lang.String r15 = "allowSharingAndroid"
            r13.putBoolean(r15, r6)
            goto L_0x04bc
        L_0x04b7:
            java.lang.String r15 = "allowSharingAndroid"
            r13.putBoolean(r15, r7)
        L_0x04bc:
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.photoeffect.c> r15 = com.seattleclouds.modules.photoeffect.C6041c.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x04c9:
            java.lang.String r13 = "voicerecordlist"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0523
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "emailToSend"
            java.lang.String r3 = r1.mo17028R()
            r13.putString(r15, r3)
            java.lang.String r15 = "recordOnOpen"
            boolean r3 = r1.mo17094ah()
            r13.putBoolean(r15, r3)
            java.util.HashMap r15 = r1.mo17199x()
            java.lang.String r3 = "share"
            boolean r3 = r15.containsKey(r3)
            if (r3 == 0) goto L_0x0501
            java.lang.String r3 = "SHARE_OPTIONS"
            java.lang.String r4 = "share"
            java.lang.Object r4 = r15.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r13.putString(r3, r4)
        L_0x0501:
            java.lang.String r3 = "ftpHostname"
            boolean r3 = r15.containsKey(r3)
            if (r3 == 0) goto L_0x0516
            java.lang.String r3 = "FTP_HOSTNAME"
            java.lang.String r4 = "ftpHostname"
            java.lang.Object r15 = r15.get(r4)
            java.lang.String r15 = (java.lang.String) r15
            r13.putString(r3, r15)
        L_0x0516:
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.voicerecord.c> r15 = com.seattleclouds.modules.voicerecord.C6335c.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0523:
            java.lang.String r13 = "puzzle"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0551
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "imageName"
            java.lang.String r3 = r1.mo17030S()
            r13.putString(r15, r3)
            java.util.ArrayList r15 = r1.mo17064aJ()
            if (r15 == 0) goto L_0x0544
            java.lang.String r3 = "LEVELS_KEY"
            r13.putSerializable(r3, r15)
        L_0x0544:
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.puzzle.SCPuzzleGameFragment> r15 = com.seattleclouds.modules.puzzle.SCPuzzleGameFragment.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0551:
            java.lang.String r13 = "memogame"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0574
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "resources"
            java.util.ArrayList r3 = r1.mo17032T()
            r13.putStringArrayList(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.m.b> r15 = com.seattleclouds.modules.p175m.C5817b.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0574:
            java.lang.String r13 = "digitalsignature"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0597
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageId"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.signaturestamp.a> r15 = com.seattleclouds.modules.signaturestamp.C6282a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0597:
            java.lang.String r13 = "qrcodelist"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x05c8
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageid"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            java.lang.String r15 = "QRCODE_ENABLED"
            r13.putBoolean(r15, r7)
            java.lang.String r15 = "EMAIL_TO_SEND"
            java.lang.String r3 = r1.mo17028R()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.b.c> r15 = com.seattleclouds.modules.p163b.C5474c.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x05c8:
            java.lang.String r13 = "barcodescanner"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x05f9
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageid"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            java.lang.String r15 = "BARCODE_ENABLED"
            r13.putBoolean(r15, r7)
            java.lang.String r15 = "EMAIL_TO_SEND"
            java.lang.String r3 = r1.mo17028R()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.b.c> r15 = com.seattleclouds.modules.p163b.C5474c.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x05f9:
            java.lang.String r13 = "coupon"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 != 0) goto L_0x0cac
            java.lang.String r13 = "coupongps"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x060b
            goto L_0x0cac
        L_0x060b:
            java.lang.String r13 = "cameracover"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x063e
            java.lang.String r13 = "com.seattleclouds.modules.cameracover.CameraCoverFragment"
            java.lang.Class r13 = m25677s(r13)
            if (r13 == 0) goto L_0x03c1
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r3 = "EXTRA_CAMERA_COVERS_ARRAY"
            java.util.ArrayList r4 = r1.mo17036V()
            r15.putStringArrayList(r3, r4)
            java.lang.String r3 = "EMAIL_TO_SEND"
            java.lang.String r4 = r1.mo17028R()
            r15.putString(r3, r4)
            com.seattleclouds.FragmentInfo r3 = new com.seattleclouds.FragmentInfo
            java.lang.String r13 = r13.getName()
            r3.<init>(r13, r15)
        L_0x063b:
            r5 = r3
            goto L_0x0d8a
        L_0x063e:
            java.lang.String r13 = "fgallery"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x065f
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_IMAGES"
            java.util.ArrayList<com.seattleclouds.modules.mosaic.ImgMetadata> r3 = r1.f18742d
            r13.putParcelableArrayList(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.t.a> r15 = com.seattleclouds.modules.p187t.C6284a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x065f:
            java.lang.String r13 = "loyalty"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0682
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageid"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.l.a> r15 = com.seattleclouds.modules.p174l.C5773a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0682:
            java.lang.String r13 = "rateandreview"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x06a5
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageid"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.rateandreview.a> r15 = com.seattleclouds.modules.rateandreview.C6234a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x06a5:
            java.lang.String r13 = "epubreader"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x06ce
            java.lang.String r13 = "com.seattleclouds.modules.epubreader.ePubReaderFragment"
            java.lang.Class r13 = m25677s(r13)
            if (r13 == 0) goto L_0x03c1
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r3 = "epubfilepath"
            java.lang.String r4 = r1.mo17091ag()
            r15.putString(r3, r4)
            com.seattleclouds.FragmentInfo r3 = new com.seattleclouds.FragmentInfo
            java.lang.String r13 = r13.getName()
            r3.<init>(r13, r15)
            goto L_0x063b
        L_0x06ce:
            java.lang.String r13 = "imagelist"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x06fa
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "EMAIL_TO_SEND"
            java.lang.String r3 = r1.mo17028R()
            r13.putString(r15, r3)
            java.lang.String r15 = "PICTURE_ON_OPEN"
            boolean r3 = r1.mo17096ai()
            r13.putBoolean(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.i.a> r15 = com.seattleclouds.modules.p171i.C5734a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x06fa:
            java.lang.String r13 = "pollpage"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0719
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_URL"
            r13.putString(r15, r12)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.pollpage.a> r15 = com.seattleclouds.modules.pollpage.C6175a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0719:
            java.lang.String r13 = "pdfeditorreader"
            boolean r13 = r1.mo17123b(r13)
            if (r13 == 0) goto L_0x072b
            java.lang.String r13 = "com.seattleclouds.modules.pdfeditorreader.PDFReaderEditorFragment"
            com.seattleclouds.FragmentInfo r5 = m25610a(r13, r4)
            if (r5 != 0) goto L_0x0d8a
            goto L_0x00b3
        L_0x072b:
            java.lang.String r13 = "pdfreader"
            boolean r13 = r1.mo17123b(r13)
            if (r13 == 0) goto L_0x073d
            java.lang.String r13 = "com.seattleclouds.modules.pdfreader.PDFReaderFragment"
            com.seattleclouds.FragmentInfo r5 = m25610a(r13, r4)
            if (r5 != 0) goto L_0x0d8a
            goto L_0x00b3
        L_0x073d:
            java.lang.String r13 = "login"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x075c
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_PAGE_ID"
            r13.putString(r15, r0)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.k.a> r15 = com.seattleclouds.modules.p173k.C5763a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x075c:
            java.lang.String r13 = "loginregister"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0795
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = r1.mo17078aX()
            java.lang.String r3 = "IS_LOGIN_REGISTER_PAGE"
            r13.putBoolean(r3, r7)
            java.lang.String r3 = "NEXT_PAGE_ID"
            if (r15 != 0) goto L_0x0778
            java.lang.String r15 = ""
        L_0x0778:
            r13.putString(r3, r15)
            com.seattleclouds.aa r15 = m25676s()
            java.lang.String r3 = "LOGIN_REGISTER_PAGE_STYLE"
            android.os.Bundle r15 = r15.mo17110as()
            r13.putBundle(r3, r15)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.loginregister.d> r15 = com.seattleclouds.modules.loginregister.C5799d.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0795:
            java.lang.String r13 = "videolist"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x07d3
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "PAGE_ID_KEY"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            java.lang.String r15 = "PAGE_SUPPORT_NATIVE_ADS"
            boolean r3 = r1.mo17196v()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "PAGE_NATIVE_ADS_ROW_NUMBER"
            int r3 = r1.mo17197w()
            r13.putInt(r15, r3)
            java.lang.String r15 = "OPEN_PDF_OPTIONS_KEY"
            com.seattleclouds.modules.videolist.OpenPdfOptions r3 = r1.mo17071aQ()
            r13.putParcelable(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.videolist.b> r15 = com.seattleclouds.modules.videolist.C6304b.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x07d3:
            java.lang.String r13 = "scoreboard"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x07ff
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageid"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            java.lang.String r15 = "scbemail"
            java.lang.String r3 = r1.mo17055aA()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.s.d> r15 = com.seattleclouds.modules.p186s.C6258d.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x07ff:
            java.lang.String r13 = "purchase"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x083d
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_PRODUCT_ID"
            java.lang.String r3 = r1.mo17115ax()
            r13.putString(r15, r3)
            java.lang.String r15 = "ARG_PRODUCT_TYPE"
            java.lang.String r3 = r1.mo17116ay()
            r13.putString(r15, r3)
            java.lang.String r15 = "ARG_REDIRECT_URL"
            java.lang.String r3 = r1.mo17117az()
            r13.putString(r15, r3)
            boolean r15 = f18510l
            if (r15 == 0) goto L_0x0830
            java.lang.String r15 = "ARG_SIMULATION_MODE"
            r13.putBoolean(r15, r7)
        L_0x0830:
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.billing.c> r15 = com.seattleclouds.billing.C5316c.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x083d:
            java.lang.String r13 = "magazinestore"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0860
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_MAGAZINES_INFO"
            java.util.ArrayList r3 = r1.mo17056aB()
            r13.putParcelableArrayList(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.magazinestore.b> r15 = com.seattleclouds.modules.magazinestore.C5830b.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0860:
            java.lang.String r13 = "dropboxmedialist"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x089e
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "PAGE_ID_KEY"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            java.lang.String r15 = "PAGE_SUPPORT_NATIVE_ADS"
            boolean r3 = r1.mo17196v()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "PAGE_NATIVE_ADS_ROW_NUMBER"
            int r3 = r1.mo17197w()
            r13.putInt(r15, r3)
            java.lang.String r15 = "OPEN_PDF_OPTIONS_KEY"
            com.seattleclouds.modules.videolist.OpenPdfOptions r3 = r1.mo17071aQ()
            r13.putParcelable(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.dropbox.medialist.c> r15 = com.seattleclouds.modules.dropbox.medialist.C5537c.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x089e:
            java.lang.String r13 = "fusioncharts"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x08c6
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_URL"
            r13.putString(r15, r12)
            java.lang.String r15 = "PAGE_ID"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.g.b> r15 = com.seattleclouds.modules.p169g.C5678b.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x08c6:
            java.lang.String r13 = "pnTopicSubscription"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x090c
            android.net.Uri r13 = android.net.Uri.parse(r12)
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r3 = "ARG_NOTE"
            java.lang.String r4 = r1.mo17057aC()
            r15.putString(r3, r4)
            java.lang.String r3 = "ARG_SEARCH_ENABLED"
            boolean r4 = r1.mo17058aD()
            r15.putBoolean(r3, r4)
            java.lang.String r3 = "ARG_SEARCH_QUERY"
            java.lang.String r4 = "query"
            java.lang.String r4 = r13.getQueryParameter(r4)
            r15.putString(r3, r4)
            java.lang.String r3 = "ARG_GROUP_FILTER"
            java.lang.String r4 = "group"
            java.lang.String r13 = r13.getQueryParameter(r4)
            r15.putString(r3, r13)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.gcmtopics.b> r13 = com.seattleclouds.modules.gcmtopics.C5687b.class
            java.lang.String r13 = r13.getName()
            r5.<init>(r13, r15)
            goto L_0x0d8a
        L_0x090c:
            java.lang.String r13 = "messenger"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x092f
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_MAX_MESSAGE_LENGTH"
            int r3 = r1.mo17061aG()
            r13.putInt(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.messenger.f> r15 = com.seattleclouds.modules.messenger.C5859f.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x092f:
            java.lang.String r13 = "nearbylocations"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0985
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "PLACES_API_KEY"
            java.lang.String r3 = r1.mo17059aE()
            r13.putString(r15, r3)
            java.lang.String r15 = "PLACES_RADIUS"
            java.util.HashMap r3 = r1.mo17199x()
            java.lang.String r4 = "locationRadius"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r13.putString(r15, r3)
            java.lang.String r15 = "PLACES_KEYWORDS"
            java.util.HashMap r3 = r1.mo17199x()
            java.lang.String r4 = "locationKeywords"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r13.putString(r15, r3)
            java.lang.String r15 = "PLACES_CATEGORIES"
            java.util.HashMap r3 = r1.mo17199x()
            java.lang.String r4 = "locationCategories"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.n.a> r15 = com.seattleclouds.modules.p176n.C5883a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0985:
            java.lang.String r13 = "order"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x09ad
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageId"
            r13.putString(r15, r0)
            java.lang.String r15 = "ORDER_INFO"
            com.seattleclouds.modules.order.OrderConfigInfo r3 = r1.mo17060aF()
            r13.putParcelable(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.order.a> r15 = com.seattleclouds.modules.order.C5956a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x09ad:
            java.lang.String r13 = "productorder"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x09cc
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "PAGE_ID_KEY"
            r13.putString(r15, r0)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.o.f> r15 = com.seattleclouds.modules.p177o.C5922f.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x09cc:
            java.lang.String r13 = "bmicalculator"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0a2d
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            r15 = 0
        L_0x09da:
            java.util.ArrayList r3 = r1.mo17062aH()
            int r3 = r3.size()
            if (r15 >= r3) goto L_0x0a20
            java.util.ArrayList r3 = r1.mo17062aH()
            java.lang.Object r3 = r3.get(r15)
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.util.Set r4 = r3.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x09f6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0a1d
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            int r9 = r15 + 1
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object r5 = r3.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r13.putString(r8, r5)
            goto L_0x09f6
        L_0x0a1d:
            int r15 = r15 + 1
            goto L_0x09da
        L_0x0a20:
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.c.a> r15 = com.seattleclouds.modules.p164c.C5485a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0a2d:
            java.lang.String r13 = "nativetetris"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0a47
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.nativetetris.h> r15 = com.seattleclouds.modules.nativetetris.C5913h.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0a47:
            java.lang.String r13 = "locationLock"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0a90
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "PAGE_ID"
            r13.putString(r15, r0)
            java.lang.String r15 = "ARG_STORE_ID"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "LocationLock."
            r3.append(r4)
            java.lang.String r4 = f18523y
            r3.append(r4)
            java.lang.String r4 = "."
            r3.append(r4)
            java.lang.String r4 = f18524z
            r3.append(r4)
            java.lang.String r4 = "."
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.locationlock.a> r15 = com.seattleclouds.modules.locationlock.C5783a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0a90:
            java.lang.String r13 = "goaltrackercategory"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0aaa
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.goaltracker.b> r15 = com.seattleclouds.modules.goaltracker.C5695b.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0aaa:
            java.lang.String r13 = "goaltracker"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0ac4
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.goaltracker.e> r15 = com.seattleclouds.modules.goaltracker.C5717e.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0ac4:
            java.lang.String r13 = "slotmachine"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0ae7
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_CONFIG"
            android.os.Bundle r3 = r1.mo17067aM()
            r13.putBundle(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.u.a> r15 = com.seattleclouds.modules.p188u.C6292a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0ae7:
            java.lang.String r13 = "scandocument"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0b01
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.r.g> r15 = com.seattleclouds.modules.p185r.C6218g.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0b01:
            java.lang.String r13 = "favorites"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0b24
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "HEADER_IMAGE"
            java.lang.String r3 = r1.mo17153i()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.f.b> r15 = com.seattleclouds.modules.p168f.C5616b.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0b24:
            java.lang.String r13 = "fusionchartseditor"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0b4f
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "EDITED_PAGE_ID"
            java.util.HashMap r3 = r1.mo17199x()
            java.lang.String r4 = "pageUnderEdit"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.g.a> r15 = com.seattleclouds.modules.p169g.C5670a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0b4f:
            java.lang.String r13 = "announcements"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0b7a
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_TOPICS"
            java.util.HashMap r3 = r1.mo17199x()
            java.lang.String r4 = "topics"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.gcm.AnnouncementFragment> r15 = com.seattleclouds.gcm.AnnouncementFragment.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0b7a:
            java.lang.String r13 = "golfscorecard"
            boolean r13 = r3.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x0b99
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "PAGE_ID"
            r13.putString(r15, r0)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.h.a> r15 = com.seattleclouds.modules.p170h.C5720a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0b99:
            java.lang.String r13 = "defendant"
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0bb9
            java.lang.String r13 = "com.seattleclouds.modules.bonds.BBContainerFragment"
            java.lang.Class r13 = m25677s(r13)
            if (r13 == 0) goto L_0x03c1
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            com.seattleclouds.FragmentInfo r3 = new com.seattleclouds.FragmentInfo
            java.lang.String r13 = r13.getName()
            r3.<init>(r13, r15)
            goto L_0x063b
        L_0x0bb9:
            java.lang.String r13 = "podcast"
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0c12
            java.lang.String r13 = r1.mo17077aW()
            if (r13 == 0) goto L_0x0c12
            java.lang.String r13 = r1.mo17077aW()
            java.lang.String r15 = "SCPodcasts"
            boolean r13 = r13.equalsIgnoreCase(r15)
            if (r13 == 0) goto L_0x0c12
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_PODCAST_FEED_URL"
            java.lang.String r3 = r1.mo17075aU()
            r13.putString(r15, r3)
            java.lang.String r15 = "ARG_PODCAST_HEADER_IMG"
            java.lang.String r3 = r1.mo17074aT()
            r13.putString(r15, r3)
            java.lang.String r15 = "ARG_PODCAST_AUTO_REFRESH"
            boolean r3 = r1.mo17073aS()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "PAGE_SUPPORT_NATIVE_ADS"
            boolean r3 = r1.mo17196v()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "PAGE_NATIVE_ADS_ROW_NUMBER"
            int r3 = r1.mo17197w()
            r13.putInt(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.podcast.c> r15 = com.seattleclouds.modules.podcast.C6095c.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0c12:
            java.lang.String r13 = "multipodcast"
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0c6b
            java.lang.String r13 = r1.mo17077aW()
            if (r13 == 0) goto L_0x0c6b
            java.lang.String r13 = r1.mo17077aW()
            java.lang.String r15 = "SCPodcasts"
            boolean r13 = r13.equalsIgnoreCase(r15)
            if (r13 == 0) goto L_0x0c6b
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "ARG_PODCAST_FEED_URL_LIST"
            java.util.ArrayList r3 = r1.mo17076aV()
            r13.putStringArrayList(r15, r3)
            java.lang.String r15 = "ARG_PODCAST_HEADER_IMG"
            java.lang.String r3 = r1.mo17074aT()
            r13.putString(r15, r3)
            java.lang.String r15 = "ARG_PODCAST_AUTO_REFRESH"
            boolean r3 = r1.mo17073aS()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "PAGE_SUPPORT_NATIVE_ADS"
            boolean r3 = r1.mo17196v()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "PAGE_NATIVE_ADS_ROW_NUMBER"
            int r3 = r1.mo17197w()
            r13.putInt(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.podcast.a.b> r15 = com.seattleclouds.modules.podcast.p182a.C6076b.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0c6b:
            java.lang.String r13 = "widgetDemo"
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0c85
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.e.g> r13 = com.seattleclouds.p160e.C5341g.class
            java.lang.String r13 = r13.getName()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            r5.<init>(r13, r15)
            goto L_0x0d8a
        L_0x0c85:
            java.lang.String r13 = "peopledirectory"
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L_0x0d8a
            java.lang.String r13 = r1.mo17077aW()
            if (r13 == 0) goto L_0x0d8a
            java.lang.String r13 = r1.mo17077aW()
            java.lang.String r15 = "SCPeopleDirectory"
            boolean r13 = r13.equalsIgnoreCase(r15)
            if (r13 == 0) goto L_0x0d8a
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.peopledirectory.a> r13 = com.seattleclouds.modules.peopledirectory.C6024a.class
            java.lang.String r13 = r13.getName()
            r5.<init>(r13)
            goto L_0x0d8a
        L_0x0cac:
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageid"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.d.a> r15 = com.seattleclouds.modules.p165d.C5525a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
            goto L_0x0d8a
        L_0x0cc7:
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r15 = "pageid"
            java.lang.String r3 = r1.mo17046a()
            r13.putString(r15, r3)
            java.lang.String r15 = "headerimage"
            java.lang.String r3 = r1.mo17153i()
            r13.putString(r15, r3)
            java.lang.String r15 = "feedbackfields"
            java.util.ArrayList<com.seattleclouds.modules.feedback.Field> r3 = r1.f18675a
            r13.putParcelableArrayList(r15, r3)
            java.lang.String r15 = "sendtoaddress"
            java.lang.String r3 = r1.mo17166m()
            r13.putString(r15, r3)
            java.lang.String r15 = "sendtoaddresses"
            java.util.ArrayList r3 = r1.mo17169n()
            r13.putStringArrayList(r15, r3)
            java.lang.String r15 = "submitbutton"
            java.lang.String r3 = r1.mo17157j()
            r13.putString(r15, r3)
            java.lang.String r15 = "confirmmessage"
            java.lang.String r3 = r1.mo17163l()
            r13.putString(r15, r3)
            java.lang.String r15 = "slidetonextpage"
            java.lang.String r3 = r1.mo17099ak()
            r13.putString(r15, r3)
            java.lang.String r15 = "rightToLeft"
            boolean r3 = r1.mo17066aL()
            r13.putBoolean(r15, r3)
            android.net.Uri r15 = android.net.Uri.parse(r12)
            java.lang.String r3 = "lat"
            java.lang.String r3 = r15.getQueryParameter(r3)
            java.lang.String r4 = "long"
            java.lang.String r15 = r15.getQueryParameter(r4)
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r3 == 0) goto L_0x0d3e
            if (r15 == 0) goto L_0x0d3e
            double r8 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x0d3e }
            double r10 = java.lang.Double.parseDouble(r15)     // Catch:{ NumberFormatException -> 0x0d3e }
            r4 = r8
            goto L_0x0d3f
        L_0x0d3e:
            r10 = r4
        L_0x0d3f:
            java.lang.String r15 = "latitude"
            r13.putDouble(r15, r4)
            java.lang.String r15 = "longitude"
            r13.putDouble(r15, r10)
            java.lang.String r15 = "resultType"
            java.lang.String r3 = r1.mo17004F()
            r13.putString(r15, r3)
            java.lang.String r15 = "resultDistanceInMiles"
            boolean r3 = r1.mo17025P()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "showLocationPicker"
            boolean r3 = r1.mo17007G()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "autoFillEnabled"
            boolean r3 = r1.mo17011I()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "autoFillSaveOnly"
            boolean r3 = r1.mo17013J()
            r13.putBoolean(r15, r3)
            java.lang.String r15 = "clearFromData"
            boolean r3 = r1.mo17072aR()
            r13.putBoolean(r15, r3)
            com.seattleclouds.FragmentInfo r5 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.modules.feedback.a> r15 = com.seattleclouds.modules.feedback.C5633a.class
            java.lang.String r15 = r15.getName()
            r5.<init>(r15, r13)
        L_0x0d8a:
            if (r5 != 0) goto L_0x0d92
            if (r14 == 0) goto L_0x0d92
            com.seattleclouds.FragmentInfo r5 = m25672q(r12)
        L_0x0d92:
            if (r5 == 0) goto L_0x0dec
            java.lang.String r12 = r5.mo16867a()
            java.lang.Class<com.seattleclouds.f.b> r13 = com.seattleclouds.p161f.C5346b.class
            java.lang.String r13 = r13.getName()
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0dec
            java.util.HashMap r12 = r1.mo17199x()     // Catch:{ IllegalArgumentException -> 0x0dbf }
            java.lang.String r13 = "backgroundColor"
            java.lang.Object r12 = r12.get(r13)     // Catch:{ IllegalArgumentException -> 0x0dbf }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IllegalArgumentException -> 0x0dbf }
            boolean r13 = com.seattleclouds.util.C6592al.m31910c(r12)     // Catch:{ IllegalArgumentException -> 0x0dbf }
            if (r13 != 0) goto L_0x0dbf
            int r12 = android.graphics.Color.parseColor(r12)     // Catch:{ IllegalArgumentException -> 0x0dbf }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IllegalArgumentException -> 0x0dbf }
            r2 = r12
        L_0x0dbf:
            if (r2 == 0) goto L_0x0dce
            android.os.Bundle r12 = r5.mo16870c()
            java.lang.String r13 = "ARG_BACKGROUND_COLOR"
            int r14 = r2.intValue()
            r12.putInt(r13, r14)
        L_0x0dce:
            android.os.Bundle r12 = r5.mo16870c()
            java.lang.String r13 = "ARG_OPTIMIZE_ORIENTATION_CHANGE"
            com.seattleclouds.a r14 = f18501c
            boolean r14 = r14.mo16913O()
            r12.putBoolean(r13, r14)
            android.os.Bundle r12 = r5.mo16870c()
            java.lang.String r13 = "ARG_OPTIMIZE_APPEARANCE"
            com.seattleclouds.a r14 = f18501c
            boolean r14 = r14.mo16914P()
            r12.putBoolean(r13, r14)
        L_0x0dec:
            if (r5 == 0) goto L_0x0ee9
            android.os.Bundle r12 = r5.mo16870c()
            if (r12 == 0) goto L_0x0ee9
            android.os.Bundle r12 = r5.mo16870c()
            java.lang.String r13 = "PAGE_ID"
            r12.putString(r13, r0)
            android.os.Bundle r12 = r5.mo16870c()
            java.lang.String r13 = "PAGE_STYLE"
            android.os.Bundle r14 = r1.mo17110as()
            r12.putBundle(r13, r14)
            android.os.Bundle r12 = r5.mo16870c()
            java.lang.String r13 = "PAGE_TRANSITION"
            java.lang.String r14 = r1.mo17149h()
            r12.putString(r13, r14)
            java.util.ArrayList r12 = r1.mo17063aI()
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x0ee9
            boolean r12 = f18474G
            if (r12 == 0) goto L_0x0ed8
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = r1.mo17063aI()
            java.util.Iterator r13 = r13.iterator()
        L_0x0e32:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0e97
            java.lang.Object r14 = r13.next()
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.String r15 = "url"
            java.lang.Object r15 = r14.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L_0x0e32
            java.lang.String r2 = "relPath"
            java.lang.Object r2 = r14.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0e56
            java.lang.String r2 = com.seattleclouds.C6541q.m31633c(r15)
        L_0x0e56:
            android.net.Uri r15 = android.net.Uri.parse(r15)     // Catch:{ Exception -> 0x0e6f }
            java.lang.String r3 = "v"
            java.lang.String r15 = r15.getQueryParameter(r3)     // Catch:{ Exception -> 0x0e6f }
            long r3 = java.lang.Long.parseLong(r15)     // Catch:{ Exception -> 0x0e6f }
            boolean r15 = m25627a(r2, r3)     // Catch:{ Exception -> 0x0e6f }
            if (r15 != 0) goto L_0x0e8a
            r12.add(r14)     // Catch:{ Exception -> 0x0e6f }
            r15 = 1
            goto L_0x0e8b
        L_0x0e6f:
            r15 = move-exception
            java.lang.String r3 = "App"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "check resource exist, throw new exception:"
            r4.append(r8)
            java.lang.String r15 = r15.toString()
            r4.append(r15)
            java.lang.String r15 = r4.toString()
            android.util.Log.e(r3, r15)
        L_0x0e8a:
            r15 = 0
        L_0x0e8b:
            if (r15 != 0) goto L_0x0e32
            boolean r15 = m25669o(r2)
            if (r15 != 0) goto L_0x0e32
            r12.add(r14)
            goto L_0x0e32
        L_0x0e97:
            int r13 = r12.size()
            if (r13 <= 0) goto L_0x0ed7
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r14 = "ARG_HOSTED_RESOURCES"
            r13.putSerializable(r14, r12)
            java.lang.String r12 = "ARG_PAGE_FRAGMENT_INFO"
            r13.putParcelable(r12, r5)
            java.lang.String r12 = "PAGE_TRANSITION"
            java.lang.String r14 = r1.mo17149h()
            r13.putString(r12, r14)
            java.lang.String r12 = "ARG_CAN_BE_CANCELED"
            java.lang.String r14 = "(?i)tab[1-9]([0-9]+)?.html"
            boolean r14 = r0.matches(r14)
            if (r14 != 0) goto L_0x0ec8
            java.lang.String r14 = "index.html"
            boolean r14 = r0.equalsIgnoreCase(r14)
            if (r14 != 0) goto L_0x0ec8
            r6 = 1
        L_0x0ec8:
            r13.putBoolean(r12, r6)
            com.seattleclouds.FragmentInfo r12 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.q> r14 = com.seattleclouds.C6541q.class
            java.lang.String r14 = r14.getName()
            r12.<init>(r14, r13)
            return r12
        L_0x0ed7:
            return r5
        L_0x0ed8:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            com.seattleclouds.FragmentInfo r13 = new com.seattleclouds.FragmentInfo
            java.lang.Class<com.seattleclouds.q> r14 = com.seattleclouds.C6541q.class
            java.lang.String r14 = r14.getName()
            r13.<init>(r14, r12)
            return r13
        L_0x0ee9:
            return r5
        L_0x0eea:
            if (r14 == 0) goto L_0x0ef1
            com.seattleclouds.FragmentInfo r12 = m25672q(r12)
            return r12
        L_0x0ef1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.App.m25609a(java.lang.String, android.content.Context, boolean, java.lang.Boolean):com.seattleclouds.FragmentInfo");
    }

    /* renamed from: a */
    public static FragmentInfo m25610a(String str, C5387h hVar) {
        Class s = m25677s(str);
        if (s == null) {
            return null;
        }
        Method a = m25614a(s, "getFragmentInfo", (Class<?>[]) new Class[]{C5387h.class});
        if (a == null) {
            return null;
        }
        return (FragmentInfo) m25613a(a, (Object) null, hVar);
    }

    /* renamed from: a */
    public static FragmentInfo m25611a(String str, String str2) {
        Class s = m25677s(str);
        if (s == null) {
            return null;
        }
        Method a = m25614a(s, "getFragmentInfo", (Class<?>[]) new Class[]{String.class});
        if (a == null) {
            return null;
        }
        return (FragmentInfo) m25613a(a, (Object) null, str2);
    }

    /* renamed from: a */
    public static C6675z m25612a(C5230aa aaVar) {
        if (aaVar.mo17077aW() != null && "native".equals(aaVar.mo17124c())) {
            StringBuilder sb = new StringBuilder();
            sb.append("com.seattleclouds.modules.");
            sb.append(aaVar.mo17077aW().toLowerCase());
            sb.append(".ModuleDelegate");
            String sb2 = sb.toString();
            try {
                return (C6675z) Class.forName(sb2).newInstance();
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to load module delegate: ");
                sb3.append(sb2);
                Log.e("App", sb3.toString(), e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Object m25613a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m25614a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m25615a(String str, String str2, Class<?>... clsArr) {
        Class s = m25677s(str);
        if (s == null) {
            return null;
        }
        return m25614a(s, str2, clsArr);
    }

    /* renamed from: a */
    public static void m25616a(Activity activity) {
        if (f18501c.mo16929a()) {
            try {
                Method a = m25615a("com.seattleclouds.analytics.pyze.PyzeManager", "initPyzeInAppNotificationIfNeeded", (Class<?>[]) new Class[]{Activity.class});
                if (a != null) {
                    m25613a(a, (Object) null, activity);
                    return;
                }
                Log.e("App", "init Pyze with reflection can't find initPyzeInAppNotificationIfNeeded method");
            } catch (Exception e) {
                Log.e("App", "App Reflection init Pyze in app notifications throw exception:", e);
            }
        }
    }

    /* renamed from: a */
    public static void m25617a(Application application) {
        if (f18501c.mo16929a()) {
            try {
                Method a = m25615a("com.seattleclouds.analytics.pyze.PyzeManager", "initPyzeIfNeeded", (Class<?>[]) new Class[]{Application.class});
                if (a != null) {
                    m25613a(a, (Object) null, application);
                    return;
                }
                Log.e("App", "init Pyze with reflection can't find initPyzeIfNeeded method");
            } catch (Exception e) {
                Log.e("App", "App Reflection init Pyze throw exception:", e);
            }
        }
    }

    /* renamed from: a */
    public static void m25618a(Context context) {
        if (!f18501c.mo16937b()) {
            ((App) context.getApplicationContext()).m25636b(true);
        }
    }

    /* renamed from: a */
    public static void m25619a(FragmentInfo fragmentInfo, Activity activity) {
        activity.startActivity(m25603a(fragmentInfo, (Context) activity));
    }

    /* renamed from: a */
    public static void m25620a(FragmentInfo fragmentInfo, Fragment fragment) {
        C5388i a = C6561t.m31727a(fragment);
        if (a != null) {
            a.mo17649a(fragmentInfo);
            C5247b.m26193a(fragment.mo1318s(), fragmentInfo.mo16869b());
            return;
        }
        m25619a(fragmentInfo, (Activity) fragment.mo1318s());
    }

    /* renamed from: a */
    public static void m25621a(String str, Activity activity) {
        m25637b(m25655h(str), activity);
    }

    /* renamed from: a */
    public static void m25622a(String str, Fragment fragment) {
        m25638b(m25655h(str), fragment);
    }

    /* renamed from: a */
    public static void m25623a(boolean z) {
        if (z != f18493Z) {
            f18493Z = z;
            f18498ad.m25680u();
        }
    }

    /* renamed from: a */
    public static boolean m25624a() {
        return m25626a(f18516r);
    }

    /* renamed from: a */
    public static boolean m25625a(Fragment fragment) {
        C5388i a = C6561t.m31727a(fragment);
        if (a != null) {
            return a.mo17652d();
        }
        if (fragment.mo1318s() instanceof C5326d) {
            return false;
        }
        fragment.mo1318s().finish();
        return true;
    }

    /* renamed from: a */
    public static boolean m25626a(String str) {
        return str.matches("^((dev\\d*)|(test))\\..*\\..*$");
    }

    /* renamed from: a */
    public static boolean m25627a(String str, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(m25654h());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            return false;
        }
        boolean c = C6614j.m32007c(new Date(file.lastModified()), new Date(j));
        if (f18500b) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("localFile '");
            sb2.append(file.getName());
            sb2.append("' exists=>");
            sb2.append(c);
            Log.v("App", sb2.toString());
        }
        return c;
    }

    /* renamed from: a */
    private static boolean m25628a(String str, Activity activity, Fragment fragment) {
        int i;
        FragmentInfo fragmentInfo;
        Intent intent;
        Intent intent2;
        String substring;
        Uri a;
        Uri uri;
        String str2;
        String v = m25682v(str);
        if (v.startsWith("sendmail:")) {
            C6639t.m32085c(activity, v.replaceFirst(v.indexOf("sendmail://") != -1 ? "sendmail://" : "sendmail:", "").trim());
        } else if (v.startsWith("map://")) {
            C6639t.m32081a(activity, v.substring(6));
        } else if (v.startsWith("latlong://")) {
            C6639t.m32084b(activity, v.substring(10));
        } else {
            if (v.startsWith("google.streetview:")) {
                intent2 = new Intent("android.intent.action.VIEW");
            } else if (v.startsWith("sound://")) {
                String substring2 = v.substring(8);
                StringBuilder sb = new StringBuilder();
                sb.append("Playing audio file: ");
                sb.append(substring2);
                Log.v("App", sb.toString());
                f18486S.mo20575a(substring2);
            } else {
                if (v.startsWith("movie://")) {
                    String i2 = m25657i(v.substring(8));
                    if (!i2.startsWith(TableOfContents.DEFAULT_PATH_SEPARATOR)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                        sb2.append(i2);
                        i2 = sb2.toString();
                    }
                    intent = new Intent("android.intent.action.VIEW");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(f18508j);
                    sb3.append(i2);
                    substring = sb3.toString();
                } else if (v.startsWith("xaudio://")) {
                    intent = new Intent("android.intent.action.VIEW");
                    String substring3 = v.substring(9);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("xaudio url = ");
                    sb4.append(substring3);
                    Log.v("App", sb4.toString());
                    if (substring3.indexOf("://") == -1) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(m25659j());
                        sb5.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                        sb5.append(substring3);
                        File file = new File(sb5.toString());
                        if (file.exists()) {
                            uri = C6598aq.m31937a(file);
                            intent.setFlags(1);
                            str2 = "audio/*";
                            intent.setDataAndType(uri, str2);
                            C6639t.m32083a(activity, intent);
                        } else {
                            String i3 = m25657i(substring3);
                            if (!i3.startsWith(TableOfContents.DEFAULT_PATH_SEPARATOR)) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                                sb6.append(i3);
                                i3 = sb6.toString();
                            }
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(f18508j);
                            sb7.append(i3);
                            substring3 = sb7.toString();
                        }
                    }
                    uri = Uri.parse(substring3);
                    str2 = "audio/*";
                    intent.setDataAndType(uri, str2);
                    C6639t.m32083a(activity, intent);
                } else if (v.startsWith("xvideo://")) {
                    intent = new Intent("android.intent.action.VIEW");
                    substring = v.substring(9);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("xvideo url = ");
                    sb8.append(substring);
                    Log.v("App", sb8.toString());
                    if (substring.indexOf("://") == -1) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(m25659j());
                        sb9.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                        sb9.append(substring);
                        File file2 = new File(sb9.toString());
                        if (file2.exists()) {
                            a = C6598aq.m31937a(file2);
                            intent.setFlags(1);
                            str2 = "video/*";
                            intent.setDataAndType(uri, str2);
                            C6639t.m32083a(activity, intent);
                        } else {
                            String i4 = m25657i(substring);
                            if (!i4.startsWith(TableOfContents.DEFAULT_PATH_SEPARATOR)) {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                                sb10.append(i4);
                                i4 = sb10.toString();
                            }
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append(f18508j);
                            sb11.append(i4);
                            substring = sb11.toString();
                        }
                    }
                } else if (v.startsWith("external://")) {
                    v = v.substring(11);
                    if (v.indexOf("://") == -1) {
                        StringBuilder sb12 = new StringBuilder();
                        sb12.append("http://");
                        sb12.append(v);
                        v = sb12.toString();
                    }
                    intent2 = new Intent("android.intent.action.VIEW");
                } else if (v.startsWith("bgplayer-play://")) {
                    final String substring4 = v.substring(16);
                    StringBuilder sb13 = new StringBuilder();
                    sb13.append("Background player PLAY: ");
                    sb13.append(substring4);
                    Log.v("App", sb13.toString());
                    if (f18487T.mo20581f() == null || !f18487T.mo20581f().equalsIgnoreCase(substring4)) {
                        if (substring4.indexOf("://") != -1) {
                            if (C6612h.m31984a(activity)) {
                                C6587a aVar = new C6587a();
                                aVar.mo1448a(((C0767e) activity).mo1469g(), C6587a.f23301ae);
                                f18487T.mo20573a((C0366g) aVar);
                            } else {
                                Toast.makeText(activity, C5462k.scmediaplayer_no_connection, 0).show();
                            }
                        }
                        new Thread(new Runnable() {
                            public void run() {
                                App.f18487T.mo20574a(true);
                                final boolean b = App.f18487T.mo20577b(substring4);
                                App.f18487T.mo20574a(false);
                                C0366g h = App.f18487T.mo20583h();
                                if (h != null) {
                                    final C0367h s = h.mo1318s();
                                    if (s != null) {
                                        s.runOnUiThread(new Runnable() {
                                            public void run() {
                                                if (!b) {
                                                    Activity activity = s;
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(C5462k.scmediaplayer_not_load);
                                                    sb.append("\n");
                                                    sb.append(substring4);
                                                    Toast.makeText(activity, sb.toString(), 1).show();
                                                    App.f18487T.mo20578c();
                                                }
                                            }
                                        });
                                    }
                                    h.mo1453c();
                                }
                            }
                        }).start();
                    } else {
                        f18487T.mo20572a();
                    }
                } else if (v.startsWith("bgplayer-stop://")) {
                    String substring5 = v.substring(16);
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append("Background player STOP: ");
                    sb14.append(substring5);
                    Log.v("App", sb14.toString());
                    f18487T.mo20578c();
                } else if (v.startsWith("bgplayer-pause://")) {
                    String substring6 = v.substring(16);
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append("Background player PAUSE: ");
                    sb15.append(substring6);
                    Log.v("App", sb15.toString());
                    f18487T.mo20576b();
                } else if (v.startsWith("save://")) {
                    String substring7 = v.substring(7);
                    StringBuilder sb16 = new StringBuilder("?");
                    sb16.append(substring7);
                    Uri parse = Uri.parse(sb16.toString());
                    String str3 = parse.getQuery() != null ? parse.getQuery().toString() : "";
                    int indexOf = str3.indexOf("=", 0);
                    if (indexOf != -1) {
                        String substring8 = str3.substring(0, indexOf);
                        String substring9 = str3.substring(indexOf + 1, str3.length());
                        if (substring8 != null && !substring8.equalsIgnoreCase("") && substring9 != null && !substring9.equalsIgnoreCase("")) {
                            C6640u.m32089a(substring8, substring9);
                        }
                    }
                } else {
                    if (v.startsWith("lpforgotpassword://")) {
                        String substring10 = v.substring(19);
                        StringBuilder sb17 = new StringBuilder("?");
                        sb17.append(substring10);
                        String queryParameter = Uri.parse(sb17.toString()).getQueryParameter("pageid");
                        C5230aa aaVar = (C5230aa) f18501c.mo16902D().get(queryParameter);
                        if (aaVar == null || !aaVar.mo17118b().equals("login")) {
                            C6620n.m32034a((Context) activity, "ERROR", "Invalid request. Page id or type doesn't match a valid entry.");
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("pageId", queryParameter);
                            fragmentInfo = new FragmentInfo(C5770c.class.getName(), bundle);
                        }
                    } else if (v.startsWith("pay://")) {
                        f18488U = new C6354a(false, activity);
                        f18488U.mo19797a(v);
                    } else if (v.startsWith("addtocart://")) {
                        try {
                            f18489V.mo17516a(v, (Context) activity);
                        } catch (UnsupportedEncodingException e) {
                            Log.e("App", e.getMessage());
                        }
                    } else if (v.startsWith("removefromcart://")) {
                        f18489V.mo17519b(v, (Context) activity);
                    } else if (v.startsWith("local://")) {
                        String substring11 = v.substring(8);
                        if (!m25667n(substring11)) {
                            C6620n.m32028a((Context) activity, C5462k.error, C5462k.common_page_not_found);
                        } else if (fragment != null) {
                            m25622a(substring11, fragment);
                        } else {
                            m25621a(substring11, activity);
                        }
                    } else if (v.startsWith("ratings://")) {
                        C5230aa aaVar2 = (C5230aa) f18501c.mo16902D().get(v.substring(10));
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("pageid", aaVar2.mo17046a());
                        activity.startActivityForResult(m25603a(new FragmentInfo(C6234a.class.getName(), bundle2), (Context) activity), 57053);
                    } else if (v.startsWith("pushmessages:")) {
                        Intent intent3 = new Intent(activity, AnnouncementActivity.class);
                        intent3.setFlags(67108864);
                        activity.startActivity(intent3);
                    } else if (v.startsWith("ytube:")) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse(v.substring(6)));
                        C6639t.m32083a(activity, intent);
                    } else if (v.startsWith("buy://")) {
                        String[] split = v.substring(6).split(":");
                        Bundle bundle3 = new Bundle();
                        if (split.length > 0) {
                            bundle3.putString("ARG_PRODUCT_ID", split[0]);
                        }
                        if (split.length > 1) {
                            bundle3.putString("ARG_REDIRECT_URL", split[1]);
                        }
                        if (split.length > 2) {
                            bundle3.putString("ARG_PRODUCT_TYPE", split[2]);
                        }
                        if (f18510l) {
                            bundle3.putBoolean("ARG_SIMULATION_MODE", true);
                        }
                        fragmentInfo = new FragmentInfo(C5316c.class.getName(), bundle3);
                        if (fragment != null) {
                            m25620a(fragmentInfo, fragment);
                        }
                    } else if (!v.startsWith("removeads://")) {
                        return false;
                    } else {
                        if (C5260d.m26241a().mo17273c()) {
                            i = C5462k.remove_ads_your_bought;
                        } else if (AdsManagerKeys.m26119b().mo17236q().isEmpty()) {
                            i = C5462k.remove_ads_error_empty;
                        } else {
                            RemoveAdsActivity.m26153a(activity);
                        }
                        Toast.makeText(activity, i, 1).show();
                    }
                    m25619a(fragmentInfo, activity);
                }
                a = Uri.parse(substring);
                str2 = "video/*";
                intent.setDataAndType(uri, str2);
                C6639t.m32083a(activity, intent);
            }
            intent.setData(Uri.parse(v));
            C6639t.m32083a(activity, intent);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m25629a(String str, Fragment fragment, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("Processing URL: ");
        sb.append(str);
        Log.v("App", sb.toString());
        if (m25643c(str, fragment)) {
            return true;
        }
        m25640c((Context) fragment.mo1318s(), str);
        if (m25646d(str, fragment.mo1318s())) {
            return true;
        }
        C5230aa r = m25675r(str);
        if (r == null || ((!r.mo17118b().equals("search") && !r.mo17118b().equals("locationDetector")) || C6561t.m31727a(fragment) != null)) {
            FragmentInfo a = m25608a(str, (Context) fragment.mo1318s(), z);
            Intent a2 = m25605a(str, a, (Activity) fragment.mo1318s());
            if (a2 != null) {
                fragment.mo1318s().startActivity(a2);
            } else if (a == null) {
                return false;
            } else {
                m25620a(a, fragment);
            }
            return true;
        }
        Intent e = m25648e(str, fragment.mo1318s());
        if (e == null) {
            return false;
        }
        fragment.mo1318s().startActivity(e);
        return true;
    }

    /* renamed from: b */
    public static Intent m25630b(String str, Context context) {
        return m25603a(m25672q(str), context);
    }

    /* renamed from: b */
    public static String m25631b() {
        return m25632b(f18516r);
    }

    /* renamed from: b */
    public static String m25632b(String str) {
        int indexOf = str.indexOf(".");
        return indexOf > 0 ? str.substring(0, indexOf) : "";
    }

    /* renamed from: b */
    public static void m25633b(Context context) {
        if (f18481N) {
            System.currentTimeMillis();
            try {
                C4849d[] a = C4852f.m24274a(context).mo16039a();
                f18490W = new int[]{1, 1};
                if (a != null) {
                    for (int i = 0; i < a.length; i++) {
                        String str = a[i].f17460c;
                        int indexOf = str.indexOf(".") + 1;
                        f18490W[i] = Integer.parseInt(str.substring(indexOf, str.indexOf(".", indexOf)));
                    }
                    f18491X = C1166a.m6307b(context, f18490W[0], f18490W[1]);
                }
            } catch (Exception unused) {
                Log.e("App", "Could not load expansion files");
            }
        }
    }

    /* renamed from: b */
    public static void m25634b(Context context, String str) {
        C2940e d = m25645d(context);
        if (d != null) {
            d.mo10612a(str);
            d.mo10614a(new C2938b().mo10607a());
        }
    }

    /* renamed from: b */
    public static void m25635b(final Fragment fragment) {
        if (C6561t.m31727a(fragment) != null) {
            new Timer().schedule(new TimerTask() {
                public void run() {
                    if (fragment.mo1318s() != null) {
                        fragment.mo1318s().runOnUiThread(new Runnable() {
                            public void run() {
                                App.m25625a(fragment);
                            }
                        });
                    }
                }
            }, 500);
        } else if (!(fragment.mo1318s() instanceof C5326d) && fragment != null) {
            fragment.mo1318s().finish();
        }
    }

    /* renamed from: b */
    private synchronized void m25636b(boolean z) {
        SharedPreferences sharedPreferences = getSharedPreferences("RuntimeState", 0);
        if (f18510l) {
            f18524z = sharedPreferences.getString("currentAppId", f18524z);
        }
        f18493Z = sharedPreferences.getBoolean("appStarted", false);
        if (f18493Z || z) {
            m25633b((Context) this);
            C5298b.m26494a((Context) this);
        }
    }

    /* renamed from: b */
    public static boolean m25637b(String str, Activity activity) {
        StringBuilder sb = new StringBuilder();
        sb.append("Processing URL: ");
        sb.append(str);
        Log.v("App", sb.toString());
        if (m25642c(str, activity)) {
            return true;
        }
        m25640c((Context) activity, str);
        if (m25646d(str, activity)) {
            return true;
        }
        Intent e = m25648e(str, activity);
        if (e == null) {
            return false;
        }
        activity.startActivity(e);
        return true;
    }

    /* renamed from: b */
    public static boolean m25638b(String str, Fragment fragment) {
        return m25629a(str, fragment, true);
    }

    /* renamed from: c */
    public static InputStream m25639c(String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }
        if (f18510l || f18474G) {
            StringBuilder sb = new StringBuilder();
            sb.append(m25654h());
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(str);
            return new FileInputStream(new File(sb.toString()));
        } else if (!f18481N) {
            AssetManager assetManager = f18507i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Main/");
            sb2.append(str);
            return assetManager.open(sb2.toString());
        } else if (f18491X != null) {
            try {
                return f18491X.mo5662b(str);
            } catch (NullPointerException unused) {
                throw new FileNotFoundException("Error loading from expansion file");
            }
        } else {
            throw new FileNotFoundException("Expansion file not loaded");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r4 != null) goto L_0x0029;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m25640c(android.content.Context r3, java.lang.String r4) {
        /*
            com.google.android.gms.analytics.e r0 = m25645d(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.seattleclouds.aa r0 = m25675r(r4)
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = r0.mo17118b()
            java.lang.String r2 = "rsspro"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = r0.mo17118b()
            java.lang.String r2 = "rssprodetail"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x002d
            java.lang.String r4 = r0.mo17046a()
        L_0x0029:
            m25634b(r3, r4)
            goto L_0x0032
        L_0x002d:
            if (r0 != 0) goto L_0x0032
            if (r4 == 0) goto L_0x0032
            goto L_0x0029
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.App.m25640c(android.content.Context, java.lang.String):void");
    }

    /* renamed from: c */
    public static boolean m25641c(Context context) {
        if (!"".equalsIgnoreCase(f18522x) || context.getPackageName().equalsIgnoreCase("com.qbiki.seattleclouds")) {
            return !"".equalsIgnoreCase(f18522x) && f18470C.equalsIgnoreCase(f18522x);
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m25642c(String str, Activity activity) {
        return m25628a(str, activity, (Fragment) null);
    }

    /* renamed from: c */
    public static boolean m25643c(String str, Fragment fragment) {
        return m25628a(str, (Activity) fragment.mo1318s(), fragment);
    }

    /* renamed from: d */
    public static AssetFileDescriptor m25644d(String str) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }
        if (f18510l || f18474G) {
            StringBuilder sb = new StringBuilder();
            sb.append(m25654h());
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(str);
            File file = new File(sb.toString());
            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 805306368);
            try {
                AssetFileDescriptor assetFileDescriptor = new AssetFileDescriptor(open, 0, file.length());
                return assetFileDescriptor;
            } catch (IllegalArgumentException e) {
                open.close();
                throw e;
            }
        } else if (!f18481N) {
            AssetManager assetManager = f18507i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Main/");
            sb2.append(str);
            return assetManager.openFd(sb2.toString());
        } else if (f18491X != null) {
            try {
                return f18491X.mo5660a(str);
            } catch (NullPointerException unused) {
                throw new FileNotFoundException("Error loading from expansion file");
            }
        } else {
            throw new FileNotFoundException("Expansion file not loaded");
        }
    }

    /* renamed from: d */
    public static synchronized C2940e m25645d(Context context) {
        C2940e eVar;
        synchronized (App.class) {
            if (f18497ac == null && f18501c.mo16906H() != null && f18501c.mo16937b()) {
                C2935b a = C2935b.m13739a(context.getApplicationContext());
                a.mo10601a(60);
                f18497ac = a.mo10599a(f18501c.mo16906H());
                f18497ac.mo10615a(true);
            }
            eVar = f18497ac;
        }
        return eVar;
    }

    /* renamed from: d */
    public static boolean m25646d(String str, Activity activity) {
        C5230aa r = m25675r(str);
        if (r == null || r.mo17118b() == null || !r.mo17123b("sms")) {
            return false;
        }
        C6639t.m32082a(activity, r.mo17108aq(), r.mo17109ar());
        return true;
    }

    /* renamed from: e */
    public static Context m25647e() {
        return f18498ad.getApplicationContext();
    }

    /* renamed from: e */
    public static Intent m25648e(String str, Activity activity) {
        return m25604a(str, activity, true);
    }

    /* renamed from: e */
    public static InputStream m25649e(String str) {
        try {
            return m25639c(str);
        } catch (FileNotFoundException unused) {
            return null;
        } catch (IOException e) {
            Log.e("App", "getResourceStream error", e);
            return null;
        }
    }

    /* renamed from: f */
    public static AssetFileDescriptor m25650f(String str) {
        try {
            return m25644d(str);
        } catch (FileNotFoundException | IOException | IllegalArgumentException e) {
            Log.e("App", "getResourceAssetFileDescriptor error", e);
            return null;
        }
    }

    /* renamed from: f */
    public static Resources m25651f() {
        return f18495aa;
    }

    /* renamed from: g */
    public static InputStream m25652g(String str) {
        InputStream inputStream;
        if (str.contains("://")) {
            try {
                inputStream = HTTPUtil.m31756a(str);
            } catch (IOException e) {
                Log.i("App", "getResourceOrUrlStream error", e);
                return null;
            }
        } else {
            inputStream = m25649e(str);
        }
        return inputStream;
    }

    /* renamed from: g */
    public static String m25653g() {
        if (f18499ae == null) {
            f18499ae = f18498ad.getPackageName();
        }
        return f18499ae;
    }

    /* renamed from: h */
    public static String m25654h() {
        StringBuilder sb = new StringBuilder();
        sb.append(f18502d);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18523y);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18524z);
        return sb.toString();
    }

    /* renamed from: h */
    public static String m25655h(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (f18510l || f18474G) {
            sb.append("file://");
            str2 = m25654h();
        } else if (f18481N) {
            str2 = f18509k;
        } else {
            sb.append("file:///android_asset/");
            str2 = "Main";
        }
        sb.append(str2);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m25656i() {
        StringBuilder sb = new StringBuilder();
        sb.append(f18503e);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18523y);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18524z);
        return sb.toString();
    }

    /* renamed from: i */
    public static String m25657i(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (f18510l || f18474G) {
            str2 = m25654h();
        } else {
            if (!f18481N) {
                str2 = "Main";
            }
            sb.append(str);
            return sb.toString();
        }
        sb.append(str2);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: j */
    public static Drawable m25658j(String str) {
        InputStream e = m25649e(str);
        if (e == null) {
            return null;
        }
        Drawable createFromStream = Drawable.createFromStream(e, str);
        try {
            e.close();
            return createFromStream;
        } catch (IOException unused) {
            return createFromStream;
        }
    }

    /* renamed from: j */
    public static String m25659j() {
        StringBuilder sb = new StringBuilder();
        sb.append(f18504f);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18523y);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18524z);
        return sb.toString();
    }

    /* renamed from: k */
    public static BitmapDrawable m25660k(String str) {
        InputStream e = m25649e(str);
        if (e == null) {
            return null;
        }
        Options options = new Options();
        options.inScaled = false;
        options.inDensity = 160;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(f18495aa, BitmapFactory.decodeStream(e, null, options));
        try {
            e.close();
        } catch (IOException unused) {
        }
        return bitmapDrawable;
    }

    /* renamed from: k */
    public static String m25661k() {
        StringBuilder sb = new StringBuilder();
        sb.append(f18506h);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18523y);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18524z);
        return sb.toString();
    }

    /* renamed from: l */
    public static Typeface m25662l(String str) {
        Typeface typeface;
        Typeface typeface2 = null;
        if (!(str == null || str.trim().length() == 0)) {
            if (VERSION.SDK_INT == 8 && !str.toLowerCase(Locale.getDefault()).endsWith(".ttf")) {
                return null;
            }
            try {
                if (!f18510l) {
                    if (!f18474G) {
                        AssetManager assetManager = f18507i;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Main/");
                        sb.append(str);
                        typeface = Typeface.createFromAsset(assetManager, sb.toString());
                        typeface2 = typeface;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m25654h());
                sb2.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                sb2.append(str);
                typeface = Typeface.createFromFile(sb2.toString());
                typeface2 = typeface;
            } catch (Exception unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Clould not load font from resources: ");
                sb3.append(str);
                Log.w("App", sb3.toString());
            }
        }
        return typeface2;
    }

    /* renamed from: l */
    public static boolean m25663l() {
        boolean z;
        boolean z2;
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            z2 = true;
            z = true;
        } else {
            z2 = "mounted_ro".equals(externalStorageState);
            z = false;
        }
        return z2 && z;
    }

    /* renamed from: m */
    public static Typeface m25664m(String str) {
        if (str == null || str.trim().length() == 0) {
            return Typeface.DEFAULT;
        }
        Typeface l = m25662l(str);
        if (l == null) {
            l = Typeface.create(str, 0);
        }
        return l;
    }

    /* renamed from: m */
    public static String m25665m() {
        StringBuilder sb = new StringBuilder();
        sb.append(f18505g);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18523y);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18524z);
        return sb.toString();
    }

    /* renamed from: n */
    public static String m25666n() {
        StringBuilder sb = new StringBuilder();
        sb.append(f18505g);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18523y);
        return sb.toString();
    }

    /* renamed from: n */
    public static boolean m25667n(String str) {
        return m25649e(str) != null;
    }

    /* renamed from: o */
    public static String m25668o() {
        String str = "myapplications";
        if (f18522x == null || f18522x.equals("")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/_publishers/");
        sb.append(f18522x);
        return sb.toString();
    }

    /* renamed from: o */
    public static boolean m25669o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m25654h());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(str);
        return new File(sb.toString()).exists();
    }

    /* renamed from: p */
    public static FragmentInfo m25670p(String str) {
        return m25611a("com.seattleclouds.modules.pdfeditorreader.PDFReaderEditorFragment", str);
    }

    /* renamed from: p */
    public static String m25671p() {
        StringBuilder sb = new StringBuilder();
        sb.append(m25668o());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18523y);
        return sb.toString();
    }

    /* renamed from: q */
    public static FragmentInfo m25672q(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("ARG_URL", str);
        return new FragmentInfo(C5346b.class.getName(), bundle);
    }

    /* renamed from: q */
    public static String m25673q() {
        StringBuilder sb = new StringBuilder();
        sb.append(m25671p());
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(f18524z);
        return sb.toString();
    }

    /* renamed from: r */
    public static C5230aa m25674r() {
        f18496ab = f18501c.mo16950f("order");
        return f18496ab;
    }

    /* renamed from: r */
    public static C5230aa m25675r(String str) {
        if (str == null) {
            return null;
        }
        return (C5230aa) f18501c.mo16902D().get(C6598aq.m31941b(str));
    }

    /* renamed from: s */
    public static C5230aa m25676s() {
        return (C5230aa) f18501c.mo16902D().get(f18501c.mo16915Q().mo18507g());
    }

    /* renamed from: s */
    public static Class<?> m25677s(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: t */
    private String m25678t(String str) {
        return new String(Base64.decode(str, 2));
    }

    /* renamed from: t */
    public static synchronized void m25679t() {
        synchronized (App.class) {
            f18497ac = null;
        }
    }

    /* renamed from: u */
    private synchronized void m25680u() {
        Editor edit = getSharedPreferences("RuntimeState", 0).edit();
        if (f18510l) {
            edit.putString("currentAppId", f18524z);
        }
        edit.putBoolean("appStarted", f18493Z);
        edit.commit();
    }

    /* renamed from: u */
    private void m25681u(String str) {
        String str2 = "";
        if (m25626a(str)) {
            str2 = m25632b(str);
            str = str.substring(str2.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("push.");
        sb.append(str);
        f18518t = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("ams.");
        sb2.append(str);
        f18519u = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append("analytics.");
        sb3.append(str);
        f18520v = sb3.toString();
    }

    /* renamed from: v */
    private static String m25682v(String str) {
        int indexOf = str.indexOf("://");
        if (indexOf == -1) {
            return str;
        }
        int indexOf2 = str.indexOf("//", indexOf + 3);
        if (indexOf2 == -1 || str.charAt(indexOf2 - 1) == ':') {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, indexOf2));
        sb.append(":");
        sb.append(str.substring(indexOf2));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f18498ad = this;
        C0218a.m858a((Context) this);
    }

    /* renamed from: c */
    public void mo16843c() {
        SharedPreferences sharedPreferences = getSharedPreferences("LoginInfo", 0);
        f18523y = sharedPreferences.getString("username", "");
        f18469B = sharedPreferences.getString("password", "");
        f18473F = sharedPreferences.getBoolean("isAuthenticated", false);
        f18484Q = sharedPreferences.getString("adminuser", "");
        f18485R = sharedPreferences.getBoolean("allowLoginAs", false);
    }

    /* renamed from: d */
    public void mo16844d() {
        Editor edit = getSharedPreferences("LoginInfo", 0).edit();
        edit.putString("username", f18523y);
        edit.putString("password", f18469B);
        edit.putBoolean("isAuthenticated", f18473F);
        edit.putString("adminuser", f18484Q);
        edit.putBoolean("allowLoginAs", f18485R);
        edit.commit();
    }

    public void onCreate() {
        super.onCreate();
        f18498ad = this;
        f18501c = new C5227a();
        f18486S = new C6585ah(this);
        f18487T = new C6585ah(this);
        f18489V = new C5330c();
        f18495aa = getResources();
        f18516r = f18495aa.getString(C5462k.server_host_name);
        f18510l = f18495aa.getBoolean(C5454c.is_previewer);
        f18522x = f18495aa.getString(C5462k.publisher_id);
        f18523y = f18495aa.getString(C5462k.username);
        f18524z = f18495aa.getString(C5462k.app_id);
        String packageName = getPackageName();
        String trim = f18495aa.getString(C5462k.sc_api_key).trim();
        String string = f18495aa.getString(C5462k.previewer_publisher_id);
        if (!f18516r.equals(f18495aa.getString(C5462k.server_host_name)) || f18510l != f18495aa.getBoolean(C5454c.is_previewer) || !f18522x.equals(f18495aa.getString(C5462k.publisher_id)) || !f18523y.equals(f18495aa.getString(C5462k.username)) || !f18524z.equals(f18495aa.getString(C5462k.app_id)) || !packageName.equals(getPackageName()) || !trim.equals(f18495aa.getString(C5462k.sc_api_key).trim()) || !string.equals(f18495aa.getString(C5462k.previewer_publisher_id))) {
            Log.e("App", m25678t("QXBwIHNldHRpbmdzIGNvcnJ1cHRlZCwgZXhpdGluZy4uLg=="));
            System.exit(0);
        }
        f18517s = f18495aa.getString(C5462k.publisher_server_host_name);
        m25681u(f18516r);
        f18468A = f18495aa.getString(C5462k.app_name);
        f18470C = f18522x;
        f18471D = f18523y;
        f18472E = f18524z;
        if (string.equals("appmart")) {
            f18511m = true;
        }
        if (f18510l) {
            f18522x = string;
        }
        if (f18522x.equals("appmart")) {
            f18512n = true;
        }
        f18513o = f18495aa.getBoolean(C5454c.previewer_google_auth_enabled);
        f18514p = f18495aa.getBoolean(C5454c.previewer_facebook_auth_enabled);
        f18474G = f18495aa.getBoolean(C5454c.sync_enabled);
        if (f18510l) {
            f18474G = true;
        }
        f18483P = f18495aa.getString(C5462k.url_scheme);
        f18480M = f18495aa.getBoolean(C5454c.rotation_enabled);
        C5323c.m26638a(f18495aa.getBoolean(C5454c.app_licensing_enabled));
        C5323c.m26637a(f18495aa.getString(C5462k.app_licensing_public_key).trim());
        f18475H = f18495aa.getBoolean(C5454c.gcm_enabled);
        f18476I = f18495aa.getBoolean(C5454c.fcm_enabled);
        f18477J = (f18475H || f18476I) && f18495aa.getBoolean(C5454c.scm_enabled);
        f18478K = f18495aa.getBoolean(C5454c.firebase_enabled);
        f18481N = f18495aa.getBoolean(C5454c.apk_expansion_files_enabled);
        f18482O = f18495aa.getBoolean(C5454c.in_app_billing_enabled);
        StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append(getPackageName());
        sb.append(".internalfilecontentprovider");
        f18508j = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("content://");
        sb2.append(getPackageName());
        sb2.append(".apezprovider");
        f18509k = sb2.toString();
        f18507i = getAssets();
        f18521w = f18495aa.getString(C5462k.facebook_app_id);
        if (!TextUtils.isEmpty(f18521w) && !f18521w.equals("%facebook_app_id%")) {
            f18515q = true;
            AppEventsLogger.m9941a((Application) this);
        }
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(getFilesDir().getAbsolutePath());
            sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb3.append("resources");
            f18502d = sb3.toString();
            f18503e = getFilesDir().getAbsolutePath();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb4.append("/Android/data/");
            sb4.append(getPackageName());
            sb4.append("/files/");
            sb4.append("external_resources");
            f18504f = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(getFilesDir().getAbsolutePath());
            sb5.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb5.append("storage");
            f18505g = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb6.append("/Android/data/");
            sb6.append(getPackageName());
            sb6.append("/files/");
            sb6.append("external_storage");
            f18506h = sb6.toString();
            if ((getApplicationInfo().flags & 2) != 0) {
                f18500b = true;
            }
            try {
                if (f18510l) {
                    mo16843c();
                }
            } catch (Exception e) {
                Log.e("App", "onCreate: ", e);
            }
            C5382a.m26950b();
            C5268b.m26272a().mo17307a(getApplicationContext());
            C5268b.m26272a().mo17315c(trim);
            if (f18482O) {
                C5319d.m26606a(getApplicationContext(), C5323c.m26640b(), false, null);
            }
            m25636b(false);
        } catch (NullPointerException e2) {
            Log.e("App", "Could not configure app files directories. Most likely getFilesDir() returned null", e2);
            f18492Y = true;
        }
    }
}
