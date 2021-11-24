package com.seattleclouds.modules.dynamiclist;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.view.C0609g;
import android.support.p009v4.view.C0609g.C0614d;
import android.support.p023v7.widget.SearchView;
import android.support.p023v7.widget.SearchView.C0973c;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ListView;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6671x;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.p169g.C5678b;
import com.seattleclouds.p158c.C5324a;
import com.seattleclouds.p158c.C5325b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6603au;
import com.seattleclouds.util.C6611g;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6620n.C6628a;
import com.seattleclouds.util.C6639t;
import com.seattleclouds.util.HTTPUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.http.client.utils.URLEncodedUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.dynamiclist.c */
public class C5562c extends C6671x implements C0973c {
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public static String f19809ae;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static String f19810i;

    /* renamed from: aA */
    private int f19811aA = 0;

    /* renamed from: aB */
    private boolean f19812aB = false;
    /* access modifiers changed from: private */

    /* renamed from: aC */
    public boolean f19813aC = false;

    /* renamed from: aD */
    private boolean f19814aD = false;

    /* renamed from: aE */
    private boolean f19815aE = false;

    /* renamed from: aF */
    private boolean f19816aF = false;
    /* access modifiers changed from: private */

    /* renamed from: aG */
    public boolean f19817aG = false;

    /* renamed from: aH */
    private String f19818aH = "";

    /* renamed from: aI */
    private String f19819aI = "";
    /* access modifiers changed from: private */

    /* renamed from: af */
    public String f19820af = null;

    /* renamed from: ag */
    private String f19821ag = "root";

    /* renamed from: ah */
    private String f19822ah = null;

    /* renamed from: ai */
    private String f19823ai = "SEPARATOR_STYLE_SINGLE_LINE";

    /* renamed from: aj */
    private String f19824aj;

    /* renamed from: ak */
    private boolean f19825ak = false;

    /* renamed from: al */
    private boolean f19826al = false;

    /* renamed from: am */
    private String f19827am = "starts";

    /* renamed from: an */
    private List<C5573d> f19828an = new ArrayList();

    /* renamed from: ao */
    private List<C5573d> f19829ao = new ArrayList();

    /* renamed from: ap */
    private List<String> f19830ap = new ArrayList();

    /* renamed from: aq */
    private SparseIntArray f19831aq = new SparseIntArray();

    /* renamed from: ar */
    private HashMap<String, C5556a> f19832ar = new HashMap<>();

    /* renamed from: as */
    private C5557b f19833as;

    /* renamed from: at */
    private C5557b f19834at;

    /* renamed from: au */
    private ListView f19835au;
    /* access modifiers changed from: private */

    /* renamed from: av */
    public View f19836av;
    /* access modifiers changed from: private */

    /* renamed from: aw */
    public View f19837aw;
    /* access modifiers changed from: private */

    /* renamed from: ax */
    public MenuItem f19838ax;
    /* access modifiers changed from: private */

    /* renamed from: ay */
    public SearchView f19839ay;

    /* renamed from: az */
    private int f19840az = 0;

    /* renamed from: com.seattleclouds.modules.dynamiclist.c$a */
    private class C5570a extends AsyncTask<String, Void, String> {
        private C5570a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            String str;
            String str2;
            String str3;
            if (strArr != null) {
                try {
                    if (strArr.length >= 2) {
                        try {
                            String str4 = strArr[0];
                            String str5 = strArr[1];
                            if (!C6592al.m31909b(str4)) {
                                if (!C6592al.m31909b(str5)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(str4);
                                    sb.append(":");
                                    sb.append(str5);
                                    String encodeToString = Base64.encodeToString(sb.toString().getBytes(), 2);
                                    HashMap hashMap = new HashMap();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Basic ");
                                    sb2.append(encodeToString);
                                    hashMap.put("Authorization", sb2.toString());
                                    str3 = HTTPUtil.m31763a(C5562c.this.f19820af, hashMap, true, true);
                                    return str3;
                                }
                            }
                            return "401 - UNAUTHORIZED";
                        } catch (IOException e) {
                            if (e.getMessage().equals("401 - UNAUTHORIZED")) {
                                return "401 - UNAUTHORIZED";
                            }
                            Log.e("DynamicListFragment", e.getMessage());
                            str3 = null;
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    str2 = "DynamicListFragment";
                    str = e2.getMessage();
                    Log.e(str2, str);
                    return null;
                } catch (IllegalStateException e3) {
                    str2 = "DynamicListFragment";
                    str = e3.getMessage();
                    Log.e(str2, str);
                    return null;
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            C0367h s;
            int i;
            String str2;
            String str3;
            String str4;
            if (C6592al.m31909b(str)) {
                C5562c.this.f19837aw.setVisibility(0);
                C5562c.this.f19836av.setVisibility(8);
                if (App.f18510l) {
                    s = C5562c.this.mo1318s();
                    i = C5462k.error;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not load configuration file: ");
                    sb.append(C5562c.this.f19820af);
                    sb.append(".");
                    str2 = sb.toString();
                } else {
                    s = C5562c.this.mo1318s();
                    i = C5462k.error;
                    str2 = "Could not load configuration file.";
                }
                C6620n.m32031a((Context) s, i, str2);
                return;
            } else if (str.equals("401 - UNAUTHORIZED")) {
                C5562c.this.f19817aG = false;
                C5562c.this.mo20721d();
                C5562c.this.f19837aw.setVisibility(8);
                C5562c.this.f19836av.setVisibility(8);
                try {
                    C0367h s2 = C5562c.this.mo1318s();
                    String string = C5562c.this.mo1320t().getString(C5462k.error);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("You must log in to area ");
                    sb2.append(new URL(C5562c.this.f19820af).getHost());
                    C6620n.m32041a((Context) s2, string, sb2.toString(), true, C5562c.this.mo1320t().getString(C5462k.f19438OK), (C6628a) new C6628a() {
                        /* renamed from: a */
                        public void mo18027a() {
                            C0367h s;
                            int i;
                            String str;
                            if (App.f18510l) {
                                s = C5562c.this.mo1318s();
                                i = C5462k.error;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Could not load configuration file: ");
                                sb.append(C5562c.this.f19820af);
                                sb.append(".");
                                str = sb.toString();
                            } else {
                                s = C5562c.this.mo1318s();
                                i = C5462k.error;
                                str = "Could not load configuration file.";
                            }
                            C6620n.m32031a((Context) s, i, str);
                            C5562c.this.f19837aw.setVisibility(0);
                            C5562c.this.f19836av.setVisibility(8);
                        }

                        /* renamed from: a */
                        public void mo18028a(String str, String str2) {
                            C5562c.this.f19837aw.setVisibility(8);
                            C5562c.this.f19836av.setVisibility(0);
                            C5562c.this.m27659a(str, str2);
                        }
                    });
                    return;
                } catch (NotFoundException e) {
                    str4 = "DynamicListFragment";
                    str3 = e.getMessage();
                } catch (MalformedURLException e2) {
                    str4 = "DynamicListFragment";
                    str3 = e2.getMessage();
                }
            } else {
                C5562c.this.f19817aG = true;
                C5562c.this.mo20721d();
                C5562c.this.f19837aw.setVisibility(8);
                C5562c.this.f19836av.setVisibility(8);
                C5562c.f19810i = str;
                C5562c.f19809ae = C5562c.this.f19820af;
                new C5572b().execute(new Void[0]);
                return;
            }
            Log.e(str4, str3);
        }
    }

    /* renamed from: com.seattleclouds.modules.dynamiclist.c$b */
    private class C5572b extends AsyncTask<Void, String, String> {
        private C5572b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            if (C5562c.this.mo1318s() == null) {
                return null;
            }
            C5562c.this.f19813aC = true;
            return C5562c.this.m27663as();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            C5562c.this.f19813aC = false;
            C5562c.this.m27680f(str);
        }
    }

    /* renamed from: a */
    private String m27656a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        this.f19832ar.put(attributeValue, new C5556a(attributeValue, xmlPullParser.getAttributeValue(null, "parent")));
        return attributeValue;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27659a(String str, String str2) {
        this.f19837aw.setVisibility(8);
        this.f19836av.setVisibility(0);
        new C5570a().execute(new String[]{str, str2});
    }

    /* renamed from: a */
    private void m27660a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        int i;
        for (Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            C5556a aVar = (C5556a) this.f19832ar.get(str);
            C5556a aVar2 = (C5556a) this.f19832ar.get((String) entry.getValue());
            if (aVar != null) {
                aVar.mo17963a(aVar2);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            String str2 = (String) entry2.getKey();
            C5556a aVar3 = (C5556a) this.f19832ar.get(str2);
            C5556a aVar4 = (C5556a) this.f19832ar.get((String) entry2.getValue());
            if (aVar3 != null) {
                aVar3.mo17966b(aVar4);
            }
        }
        if (this.f19832ar != null && this.f19832ar.size() > 0) {
            for (C5573d dVar : this.f19828an) {
                if (dVar.mo18050h() == 5) {
                    C5556a aVar5 = null;
                    if (dVar.mo18038b() != null) {
                        aVar5 = (C5556a) this.f19832ar.get(dVar.mo18038b());
                    }
                    if (aVar5 != null && aVar5.mo17980l().equalsIgnoreCase("image")) {
                        i = 6;
                    } else if (aVar5 != null && aVar5.mo17980l().equalsIgnoreCase("subtitle")) {
                        i = 7;
                    } else if (aVar5 != null && aVar5.mo17980l().equalsIgnoreCase("style2")) {
                        i = 8;
                    }
                    dVar.mo18039c(i);
                }
            }
        }
    }

    /* renamed from: a */
    private String[] m27662a(XmlPullParser xmlPullParser, String str) {
        String str2;
        StringBuilder sb;
        String xmlPullParserException;
        String[] strArr = null;
        if (!C6592al.m31909b(str)) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "name");
            String str3 = "";
            while (true) {
                try {
                    int next = xmlPullParser.next();
                    if (next == 3 && "item".compareTo(xmlPullParser.getName()) == 0) {
                        break;
                    } else if (next == 4) {
                        str3 = xmlPullParser.getText();
                    }
                } catch (XmlPullParserException e) {
                    str2 = "DynamicListFragment";
                    sb = new StringBuilder();
                    sb.append("parseStyleItem: ");
                    xmlPullParserException = e.toString();
                    r8 = e;
                    sb.append(xmlPullParserException);
                    Log.e(str2, sb.toString(), r8);
                    return null;
                } catch (IOException e2) {
                    str2 = "DynamicListFragment";
                    sb = new StringBuilder();
                    sb.append("parseStyleItem: ");
                    xmlPullParserException = e2.toString();
                    r8 = e2;
                    sb.append(xmlPullParserException);
                    Log.e(str2, sb.toString(), r8);
                    return null;
                }
            }
            ((C5556a) this.f19832ar.get(str)).mo17964a(attributeValue, str3);
            if ((attributeValue.equalsIgnoreCase("textAppearance") || attributeValue.equalsIgnoreCase("detailTextAppearance")) && !C6592al.m31909b(str3)) {
                String replace = str3.replace("@style/", "");
                strArr = new String[3];
                strArr[0] = attributeValue.equalsIgnoreCase("textAppearance") ? "text" : "detailText";
                strArr[1] = str;
                strArr[2] = replace;
            }
        }
        return strArr;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r8 = r6;
     */
    /* renamed from: as */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m27663as() {
        /*
            r11 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = ""
            org.xmlpull.v1.XmlPullParser r2 = android.util.Xml.newPullParser()
            r3 = 1
            java.io.StringReader r4 = new java.io.StringReader     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r5 = r11.m27664at()     // Catch:{ Exception -> 0x00e2 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00e2 }
            r2.setInput(r4)     // Catch:{ Exception -> 0x00e2 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            int r6 = r2.getEventType()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r7 = 0
            r8 = r1
            r1 = r0
            r0 = 0
        L_0x0027:
            if (r6 == r3) goto L_0x00bc
            if (r0 != 0) goto L_0x00bc
            if (r6 == 0) goto L_0x00b6
            switch(r6) {
                case 2: goto L_0x0055;
                case 3: goto L_0x0032;
                default: goto L_0x0030;
            }     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
        L_0x0030:
            goto L_0x00b6
        L_0x0032:
            java.lang.String r6 = r2.getName()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r9 = "list"
            boolean r9 = r6.equalsIgnoreCase(r9)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x0049
            java.lang.String r6 = r11.f19821ag     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            boolean r6 = r1.equals(r6)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r6 == 0) goto L_0x00b6
            r0 = 1
            goto L_0x00b6
        L_0x0049:
            java.lang.String r9 = "style"
            boolean r6 = r6.equalsIgnoreCase(r9)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r6 == 0) goto L_0x00b6
            java.lang.String r6 = ""
        L_0x0053:
            r8 = r6
            goto L_0x00b6
        L_0x0055:
            java.lang.String r6 = r2.getName()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r9 = "list"
            boolean r9 = r6.equalsIgnoreCase(r9)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x0066
            java.lang.String r1 = r11.m27667b(r2)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            goto L_0x00b6
        L_0x0066:
            java.lang.String r9 = "section"
            boolean r9 = r6.equalsIgnoreCase(r9)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x0072
            r11.m27672c(r2)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            goto L_0x00b6
        L_0x0072:
            java.lang.String r9 = "item"
            boolean r9 = r6.equalsIgnoreCase(r9)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x00a9
            boolean r6 = com.seattleclouds.util.C6592al.m31909b(r8)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r6 != 0) goto L_0x00a5
            java.lang.String[] r6 = r11.m27662a(r2, r8)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r6 == 0) goto L_0x00b6
            int r9 = r6.length     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r10 = 3
            if (r9 != r10) goto L_0x00b6
            r9 = r6[r7]     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r10 = "text"
            boolean r9 = r9.equalsIgnoreCase(r10)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r10 = 2
            if (r9 == 0) goto L_0x009d
            r9 = r6[r3]     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r6 = r6[r10]     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r4.put(r9, r6)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            goto L_0x00b6
        L_0x009d:
            r9 = r6[r3]     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r6 = r6[r10]     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r5.put(r9, r6)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            goto L_0x00b6
        L_0x00a5:
            r11.m27675d(r2)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            goto L_0x00b6
        L_0x00a9:
            java.lang.String r9 = "style"
            boolean r6 = r6.equalsIgnoreCase(r9)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r6 == 0) goto L_0x00b6
            java.lang.String r6 = r11.m27656a(r2)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            goto L_0x0053
        L_0x00b6:
            int r6 = r2.next()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            goto L_0x0027
        L_0x00bc:
            r11.m27660a(r4, r5)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r0 != 0) goto L_0x00da
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "List with id \""
            r0.append(r1)
            java.lang.String r1 = r11.f19821ag
            r0.append(r1)
            java.lang.String r1 = "\" not found."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x00da:
            r0 = 0
            return r0
        L_0x00dc:
            r0 = move-exception
            goto L_0x0175
        L_0x00df:
            r0 = move-exception
            goto L_0x0192
        L_0x00e2:
            r0 = move-exception
            java.lang.String r1 = "DynamicListFragment"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r4 = "Error parsing config file: \""
            r2.append(r4)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r4 = r11.f19820af     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r2.append(r4)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r4 = "\": "
            r2.append(r4)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r2.append(r0)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            android.util.Log.e(r1, r2, r0)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r1 = r11.f19820af     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r0 = r0.getMessage()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r2 = "401 - UNAUTHORIZED"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r0 == 0) goto L_0x0114
            java.lang.String r0 = "NEED_AUTHORIZATION"
            return r0
        L_0x0114:
            java.lang.String r0 = r11.f19820af     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r2 = "file://"
            boolean r0 = r0.contains(r2)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "/"
            int r0 = r1.lastIndexOf(r0)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            int r0 = r0 + r3
            java.lang.String r1 = r1.substring(r0)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            goto L_0x0157
        L_0x012a:
            java.lang.String r0 = r11.f19820af     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r2 = "://"
            boolean r0 = r0.contains(r2)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r0 == 0) goto L_0x0157
            android.support.v4.app.h r0 = r11.mo1318s()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r2 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r2)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            android.net.NetworkInfo r2 = r0.getActiveNetworkInfo()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r2 == 0) goto L_0x0150
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            boolean r0 = r0.isConnected()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r0 != 0) goto L_0x0157
        L_0x0150:
            int r0 = com.seattleclouds.C5451m.C5462k.common_no_network     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r0 = r11.mo1219a(r0)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            return r0
        L_0x0157:
            boolean r0 = com.seattleclouds.App.f18510l     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            if (r0 == 0) goto L_0x0172
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r2 = "Could not load configuration file: "
            r0.append(r2)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            r0.append(r1)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r1 = "."
            r0.append(r1)     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x00df, IOException -> 0x00dc }
            return r0
        L_0x0172:
            java.lang.String r0 = "Could not load configuration file."
            return r0
        L_0x0175:
            java.lang.String r1 = "DynamicListFragment"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parseConfigFile: "
            r2.append(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2, r0)
            java.lang.String r0 = "Error parsing configuration file (IO exception)."
            return r0
        L_0x0192:
            java.lang.String r1 = "DynamicListFragment"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "parseConfigFile: "
            r2.append(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r1, r2, r0)
            java.lang.String r0 = "Error parsing configuration file (parser exception)."
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.dynamiclist.C5562c.m27663as():java.lang.String");
    }

    /* renamed from: at */
    private String m27664at() {
        if (f19809ae == null || !f19809ae.equals(this.f19820af)) {
            f19810i = null;
            this.f19814aD = true;
        }
        if (f19810i == null) {
            f19810i = C6613i.m31991b(mo18016c(this.f19820af));
            f19809ae = this.f19820af;
        }
        return f19810i;
    }

    /* renamed from: au */
    private void m27665au() {
        if (App.f18501c.mo16946e().mo17688g() && this.f19839ay != null) {
            this.f19839ay.mo4608a((CharSequence) "", true);
            C0609g.m2758b(this.f19838ax);
        }
    }

    /* renamed from: b */
    private String m27666b(String str, String str2) {
        StringBuilder sb;
        if (C6592al.m31909b(str2)) {
            return str;
        }
        try {
            if (URLEncodedUtils.parse(new URI(str), "UTF-8").size() > 0) {
                sb = new StringBuilder();
                sb.append(str);
                sb.append("&lcid=");
                sb.append(str2);
            } else {
                sb = new StringBuilder();
                sb.append(str);
                sb.append("?lcid=");
                sb.append(str2);
            }
            str = sb.toString();
        } catch (URISyntaxException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ERROR: ");
            sb2.append(e.getLocalizedMessage());
            Log.d("DynamicListFragment", sb2.toString(), e);
        }
        return str;
    }

    /* renamed from: b */
    private String m27667b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        if (attributeValue.equals(this.f19821ag)) {
            this.f19824aj = xmlPullParser.getAttributeValue(null, "style");
            if (this.f19824aj == null) {
                this.f19824aj = "plain";
            }
            this.f19823ai = xmlPullParser.getAttributeValue(null, "separatorStyle");
            this.f19823ai = (C6592al.m31909b(this.f19823ai) || !this.f19823ai.equalsIgnoreCase("none")) ? "SEPARATOR_STYLE_SINGLE_LINE" : "SEPARATOR_STYLE_NONE";
            this.f19822ah = xmlPullParser.getAttributeValue(null, "title");
            this.f19825ak = "true".equals(xmlPullParser.getAttributeValue(null, "sectionIndex"));
            this.f19826al = "true".equals(xmlPullParser.getAttributeValue(null, "textSearch"));
            this.f19827am = xmlPullParser.getAttributeValue(null, "searchType");
            if (this.f19827am == null) {
                this.f19827am = "starts";
            }
        } else {
            C6603au.m31952a(xmlPullParser);
        }
        return attributeValue;
    }

    @TargetApi(11)
    /* renamed from: b */
    private void m27668b(boolean z) {
        this.f19835au.setFastScrollEnabled(z);
        if (VERSION.SDK_INT >= 11) {
            this.f19835au.setFastScrollAlwaysVisible(z);
            this.f19835au.setPadding(this.f19840az, this.f19835au.getPaddingTop(), z ? this.f19811aA : this.f19840az, this.f19835au.getPaddingBottom());
        }
    }

    /* renamed from: c */
    private void m27672c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "title");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "style");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "image");
        int size = this.f19830ap.size();
        this.f19831aq.put(size, this.f19828an.size());
        this.f19830ap.add(attributeValue);
        Integer valueOf = Integer.valueOf(0);
        if (!C6592al.m31909b(attributeValue2)) {
            valueOf = Integer.valueOf(1);
        }
        if (attributeValue != null && !attributeValue.equals("")) {
            this.f19828an.add(new C5573d().mo18039c(valueOf.intValue()).mo18040c(attributeValue).mo18034a(size).mo18048g(attributeValue3).mo18037b(attributeValue2));
        } else if (this.f19824aj.equals("grouped") && this.f19828an.size() != 0) {
            this.f19828an.add(new C5573d().mo18039c(valueOf.intValue()).mo18040c("").mo18034a(size).mo18048g(attributeValue3).mo18037b(attributeValue2));
        }
    }

    /* renamed from: d */
    private void m27675d(XmlPullParser xmlPullParser) {
        int i;
        int i2;
        C5573d dVar = new C5573d();
        if (this.f19830ap.size() > 0) {
            int size = this.f19830ap.size() - 1;
            dVar.mo18034a(size);
            dVar.mo18035a((String) this.f19830ap.get(size));
            String attributeValue = xmlPullParser.getAttributeValue(null, "text");
            if (attributeValue != null) {
                dVar.mo18040c(attributeValue.replaceAll("\\\\n", "\n"));
            }
            try {
                i = Integer.parseInt(xmlPullParser.getAttributeValue(null, "detailTextLines"));
            } catch (Exception unused) {
                i = 1;
            }
            if (i < 0) {
                i = 1;
            }
            dVar.mo18036b(i);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "detailText");
            if (attributeValue2 != null) {
                dVar.mo18042d(attributeValue2.replaceAll("\\\\n", "\n"));
            }
            dVar.mo18037b(xmlPullParser.getAttributeValue(null, "style"));
            if (dVar.mo18038b() != null && !dVar.mo18038b().equalsIgnoreCase("default")) {
                if (dVar.mo18038b().equals("style1") || dVar.mo18038b().equals("style2") || dVar.mo18038b().equals("subtitle")) {
                    dVar.mo18039c(3);
                } else {
                    if (dVar.mo18038b().equals("image")) {
                        i2 = 6;
                    } else if (dVar.mo18038b().length() > 0) {
                        i2 = 5;
                    }
                    dVar.mo18039c(i2);
                }
            }
            dVar.mo18048g(xmlPullParser.getAttributeValue(null, "image"));
            dVar.mo18044e(xmlPullParser.getAttributeValue(null, "action"));
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "actionParam");
            if (attributeValue3 == null || attributeValue3.trim().length() == 0) {
                attributeValue3 = (dVar.mo18043d() == null || dVar.mo18043d().equals("")) ? dVar.mo18041c() : dVar.mo18043d();
            }
            dVar.mo18046f(attributeValue3);
            this.f19828an.add(dVar);
        }
    }

    /* renamed from: e */
    private void m27678e() {
        this.f19836av.setVisibility(8);
        this.f19835au.setVisibility(0);
        this.f19835au.setAdapter(this.f19833as);
        if (this.f19823ai.equals("SEPARATOR_STYLE_NONE")) {
            this.f19835au.setDivider(null);
            this.f19835au.setDividerHeight(0);
        }
        if (this.f19832ar != null && this.f19832ar.size() > 0) {
            this.f19835au.setSelector(C5457f.item_overlay_bg_hover);
            this.f19835au.setDrawSelectorOnTop(true);
        }
        m27668b(this.f19825ak);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m27680f(String str) {
        if (mo1318s() == null) {
            Log.w("DynamicListFragment", "activity is null");
        } else if (C6592al.m31909b(str) || !str.equals("NEED_AUTHORIZATION")) {
            if (str != null) {
                C6620n.m32036a((Context) mo1318s(), mo1219a(C5462k.error), str, (OnClickListener) new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        App.m25625a((Fragment) C5562c.this);
                    }
                }, (OnCancelListener) new OnCancelListener() {
                    public void onCancel(DialogInterface dialogInterface) {
                        App.m25625a((Fragment) C5562c.this);
                    }
                });
            }
            if (this.f19822ah != null && this.f19822ah.length() > 0) {
                mo20720b(this.f19822ah);
            }
            C5557b bVar = new C5557b(mo1318s(), this.f19828an, (String[]) this.f19830ap.toArray(new String[this.f19830ap.size()]), this.f19831aq, this.f19832ar);
            this.f19833as = bVar;
            C5557b bVar2 = new C5557b(mo1318s(), this.f19829ao, null, null, null);
            this.f19834at = bVar2;
            this.f19817aG = true;
            mo20721d();
            m27678e();
        } else {
            C5324a b = new C5325b().mo17479b();
            if (b.mo17470d()) {
                m27659a(b.mo17465b(), b.mo17463a());
            } else {
                m27659a("", "");
            }
        }
    }

    /* renamed from: g */
    private void m27682g(String str) {
        this.f19829ao.clear();
        String lowerCase = str.toLowerCase(Locale.getDefault());
        if (this.f19827am.equals("starts")) {
            for (C5573d dVar : this.f19828an) {
                if (dVar.mo18050h() != 0 && dVar.mo18041c().toLowerCase(Locale.getDefault()).startsWith(lowerCase)) {
                    this.f19829ao.add(dVar);
                }
            }
            return;
        }
        for (C5573d dVar2 : this.f19828an) {
            if (dVar2.mo18050h() != 0 && dVar2.mo18041c().toLowerCase(Locale.getDefault()).contains(lowerCase)) {
                this.f19829ao.add(dVar2);
            }
        }
    }

    /* renamed from: h */
    private HashMap<String, String> m27683h(String str) {
        String str2;
        HashMap<String, String> hashMap = new HashMap<>(2);
        int indexOf = str.indexOf("?");
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            str2 = str.substring(indexOf + 1);
            str = substring;
        } else {
            str2 = null;
        }
        String str3 = "pageID";
        if (str == null) {
            str = "";
        }
        hashMap.put(str3, str);
        if (!C6592al.m31909b(str2)) {
            int indexOf2 = str2.indexOf("=");
            if (indexOf2 >= 0) {
                String substring2 = str2.substring(indexOf2 + 1);
                String str4 = "actionParam";
                if (substring2 == null) {
                    substring2 = "";
                }
                hashMap.put(str4, substring2);
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    private void m27684i(String str) {
        HashMap h = m27683h(str);
        String str2 = (String) h.get("pageID");
        String str3 = (String) h.get("actionParam");
        if (App.m25675r(str2) == null) {
            C6620n.m32031a((Context) mo1318s(), C5462k.error, mo1318s().getResources().getString(C5462k.dynamic_list_couldnt_open_page));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("ARG_URL", App.m25655h(str2));
        bundle.putString("PAGE_ID", str2);
        String str4 = "ACTION_PARAMS";
        if (str3 == null) {
            str3 = "";
        }
        bundle.putString(str4, str3);
        mo1230a(App.m25603a(new FragmentInfo(C5678b.class.getName(), bundle), (Context) mo1318s()));
    }

    /* renamed from: j */
    private void m27685j(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("lcid");
        if (!C6592al.m31909b(queryParameter)) {
            this.f19818aH = queryParameter;
            return;
        }
        C5230aa aaVar = (C5230aa) App.f18501c.mo16902D().get(this.f19819aI);
        if (aaVar.mo17199x().get("global_lcid") != null) {
            this.f19818aH = (String) aaVar.mo17199x().get("global_lcid");
            return;
        }
        if (Boolean.parseBoolean((String) aaVar.mo17199x().get("global_detectPlatformLanguage"))) {
            this.f19818aH = C5574e.m27723a((Activity) mo1318s());
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        if (this.f19814aD) {
            f19810i = null;
            f19809ae = null;
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C0367h s;
        float f;
        View inflate = layoutInflater.inflate(C5460i.dynamic_list, viewGroup, false);
        this.f19835au = (ListView) inflate.findViewById(16908298);
        this.f19836av = inflate.findViewById(C5458g.loadingView);
        this.f19837aw = inflate.findViewById(16908292);
        if (VERSION.SDK_INT >= 11) {
            this.f19840az = C6619m.m32014a(mo1318s(), 14.0f);
            this.f19835au.setPadding(this.f19840az, this.f19835au.getPaddingTop(), this.f19840az, this.f19835au.getPaddingBottom());
            if (VERSION.SDK_INT < 22) {
                s = mo1318s();
                f = 32.0f;
            } else {
                s = mo1318s();
                f = 20.0f;
            }
            this.f19811aA = C6619m.m32014a(s, f);
        }
        this.f19835au.setVisibility(8);
        this.f19837aw.setVisibility(8);
        this.f19836av.setVisibility(8);
        this.f19835au.setOnTouchListener(new OnTouchListener() {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (C5562c.this.f19839ay != null) {
                    C5562c.this.f19839ay.clearFocus();
                }
                return false;
            }
        });
        if (this.f19833as != null) {
            m27678e();
        } else {
            new Timer().schedule(new TimerTask() {
                public void run() {
                    C5562c.this.mo1318s().runOnUiThread(new Runnable() {
                        public void run() {
                            if (C5562c.this.f19813aC) {
                                C5562c.this.f19836av.setVisibility(0);
                            }
                        }
                    });
                }
            }, 250);
            new C5572b().execute(new Void[0]);
        }
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f19820af = m.getString("CONFIG_RESOURCE_NAME_OR_URL");
            this.f19821ag = m.getString("LIST_ID");
            this.f19815aE = m.getBoolean("ENABLE_LOGOUT_BTN", false);
            this.f19816aF = m.getBoolean("ENABLE_REFRESH_BTN", false);
            this.f19819aI = m.getString("PAGE_ID");
        }
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        super.mo1239a(menu);
        this.f19838ax.setVisible(this.f19826al);
        MenuItem findItem = menu.findItem(C5458g.dynamic_list_menu_log_out);
        MenuItem findItem2 = menu.findItem(C5458g.dynamic_list_menu_log_in);
        if (this.f19815aE) {
            findItem.setVisible(this.f19817aG);
            findItem.setEnabled(this.f19817aG);
            findItem2.setVisible(!this.f19817aG);
            findItem2.setEnabled(!this.f19817aG);
        } else {
            findItem.setVisible(false);
            findItem.setEnabled(false);
            findItem2.setVisible(false);
            findItem2.setEnabled(false);
        }
        MenuItem findItem3 = menu.findItem(C5458g.dynamic_list_menu_refresh);
        findItem3.setVisible(this.f19816aF);
        findItem3.setEnabled(this.f19816aF);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.dynamic_list_menu, menu);
        this.f19838ax = menu.findItem(C5458g.search);
        this.f19838ax.setIcon(C6611g.m31973a(mo1316q(), C5457f.ic_search_material));
        if (this.f19826al) {
            if (C6619m.m32024f(mo1318s())) {
                this.f19838ax.setShowAsAction(2);
            }
            this.f19839ay = (SearchView) C0609g.m2751a(this.f19838ax);
            this.f19839ay.setQueryHint(mo1219a(C5462k.dynamic_list_search_hint));
            this.f19839ay.setOnQueryTextListener(this);
            this.f19839ay.setIconifiedByDefault(!C6619m.m32024f(mo1318s()));
            this.f19839ay.setImeOptions(6);
            this.f19839ay.setOnQueryTextFocusChangeListener(new OnFocusChangeListener() {
                public void onFocusChange(View view, boolean z) {
                    if (!z && TextUtils.getTrimmedLength(C5562c.this.f19839ay.getQuery()) == 0) {
                        C0609g.m2758b(C5562c.this.f19838ax);
                    }
                }
            });
            C0609g.m2750a(this.f19838ax, (C0614d) new C0614d() {
                /* renamed from: a */
                public boolean mo2452a(MenuItem menuItem) {
                    return true;
                }

                /* renamed from: b */
                public boolean mo2453b(MenuItem menuItem) {
                    C5562c.this.f19839ay.mo4608a((CharSequence) "", true);
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f19837aw.setVisibility(8);
    }

    /* renamed from: a */
    public void mo1692a(ListView listView, View view, int i, long j) {
        Intent intent;
        Uri parse;
        String str;
        super.mo1692a(listView, view, i, j);
        C5573d dVar = (C5573d) (this.f19812aB ? this.f19829ao : this.f19828an).get(i);
        String e = dVar.mo18045e();
        String f = dVar.mo18047f();
        if (e != null && f != null) {
            if (e.equalsIgnoreCase("list")) {
                m27665au();
                Bundle bundle = new Bundle();
                bundle.putString("CONFIG_RESOURCE_NAME_OR_URL", this.f19820af);
                bundle.putString("LIST_ID", f);
                App.m25620a(new FragmentInfo(C5562c.class.getName(), bundle), (Fragment) this);
                return;
            }
            if (e.equalsIgnoreCase("tel")) {
                try {
                    str = URLEncoder.encode(f, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    str = "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("tel:");
                sb.append(str);
                intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
            } else if (e.equalsIgnoreCase("mailto")) {
                C6639t.m32085c(mo1318s(), f);
                return;
            } else if (e.equalsIgnoreCase("map")) {
                C6639t.m32081a((Activity) mo1318s(), f);
                return;
            } else if (e.equalsIgnoreCase("open")) {
                if (!f.contains("://") || f.contains("configfileurl")) {
                    m27665au();
                    App.m25638b(App.m25655h(m27666b(f, this.f19818aH)), (Fragment) this);
                    return;
                }
                intent = new Intent("android.intent.action.VIEW", Uri.parse(f));
            } else if (e.equalsIgnoreCase("video")) {
                String trim = f.trim();
                if (trim.length() != 0) {
                    intent = new Intent("android.intent.action.VIEW");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(App.m25659j());
                    sb2.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                    sb2.append(trim);
                    String sb3 = sb2.toString();
                    if (new File(sb3).exists()) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Playing external video: ");
                        sb4.append(sb3);
                        Log.v("DynamicListFragment", sb4.toString());
                        parse = Uri.parse(sb3);
                    } else {
                        if (trim.indexOf("://") == -1) {
                            String i2 = App.m25657i(trim);
                            if (!i2.startsWith(TableOfContents.DEFAULT_PATH_SEPARATOR)) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                                sb5.append(i2);
                                i2 = sb5.toString();
                            }
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(App.f18508j);
                            sb6.append(i2);
                            trim = sb6.toString();
                        }
                        parse = Uri.parse(trim);
                    }
                    intent.setDataAndType(parse, "video/*");
                } else {
                    return;
                }
            } else if (e.equalsIgnoreCase("fusioncharts")) {
                m27684i(f);
                return;
            } else {
                return;
            }
            C6639t.m32083a((Activity) mo1318s(), intent);
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.dynamic_list_menu_log_in) {
            m27659a("", "");
            return true;
        } else if (itemId == C5458g.dynamic_list_menu_log_out) {
            this.f19817aG = false;
            mo20721d();
            this.f19837aw.setVisibility(0);
            this.f19835au.setVisibility(8);
            f19810i = null;
            f19809ae = null;
            C5325b bVar = new C5325b();
            bVar.mo17480b(this.f19820af);
            bVar.mo17474a(this.f19820af, (Context) mo1318s());
            this.f19828an.clear();
            this.f19830ap.clear();
            return true;
        } else if (itemId != C5458g.dynamic_list_menu_refresh) {
            return super.mo1245a(menuItem);
        } else {
            this.f19836av.setVisibility(0);
            this.f19837aw.setVisibility(8);
            this.f19835au.setVisibility(8);
            this.f19828an.clear();
            this.f19830ap.clear();
            new C5572b().execute(new Void[0]);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo4687a(String str) {
        this.f19839ay.clearFocus();
        return true;
    }

    /* renamed from: a_ */
    public boolean mo4688a_(String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            this.f19812aB = false;
            this.f19835au.setAdapter(this.f19833as);
            m27668b(this.f19825ak);
        } else {
            this.f19812aB = true;
            m27682g(trim);
            this.f19834at.mo17995a(this.f19829ao);
            this.f19835au.setAdapter(this.f19834at);
            m27668b(false);
        }
        return true;
    }

    /* renamed from: c */
    public InputStream mo18016c(String str) {
        if (!str.contains("://")) {
            return App.m25649e(str);
        }
        m27685j(str);
        String b = m27666b(str, this.f19818aH);
        this.f19820af = b;
        return HTTPUtil.m31759a(b, true, true);
    }
}
