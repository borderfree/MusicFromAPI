package com.seattleclouds.modules.feedback;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.content.C0456d;
import android.support.p023v7.app.C0765d.C0766a;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.ads.AdNativeManager;
import com.seattleclouds.ads.AdNativeManager.NativeAdsAlignmentType;
import com.seattleclouds.location.C5395a;
import com.seattleclouds.location.C5415d;
import com.seattleclouds.location.C5415d.C5416a;
import com.seattleclouds.location.C5417e;
import com.seattleclouds.location.C5420f;
import com.seattleclouds.location.C5431g;
import com.seattleclouds.mbfx.C5467a;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6638s;
import com.seattleclouds.util.p192a.C6567c;
import com.seattleclouds.util.p192a.C6568d;
import com.seattleclouds.widget.C6669a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.apache.commons.p198io.C6730b;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.feedback.a */
public class C5633a extends C6557s implements C6568d {

    /* renamed from: b */
    private static final String f20029b;

    /* renamed from: c */
    private static ArrayList<String> f20030c = new ArrayList<>();

    /* renamed from: a */
    C5667a f20031a;

    /* renamed from: aA */
    private JSONObject f20032aA;

    /* renamed from: aB */
    private JSONObject f20033aB;

    /* renamed from: aC */
    private JSONObject f20034aC;

    /* renamed from: aD */
    private JSONObject f20035aD;

    /* renamed from: aE */
    private JSONObject f20036aE;

    /* renamed from: aF */
    private SharedPreferences f20037aF;
    /* access modifiers changed from: private */

    /* renamed from: aG */
    public C5431g f20038aG;
    /* access modifiers changed from: private */

    /* renamed from: aH */
    public Location f20039aH = new Location("code");

    /* renamed from: aI */
    private C5395a f20040aI;
    /* access modifiers changed from: private */

    /* renamed from: aJ */
    public C5230aa f20041aJ;

    /* renamed from: aK */
    private String f20042aK = null;

    /* renamed from: aL */
    private String f20043aL = null;

    /* renamed from: aM */
    private String f20044aM = "any";

    /* renamed from: aN */
    private String f20045aN = "any";

    /* renamed from: aO */
    private int f20046aO = 0;
    /* access modifiers changed from: private */

    /* renamed from: aP */
    public double f20047aP = 0.0d;
    /* access modifiers changed from: private */

    /* renamed from: aQ */
    public double f20048aQ = 0.0d;

    /* renamed from: aR */
    private View f20049aR = null;

    /* renamed from: aS */
    private boolean f20050aS = false;
    /* access modifiers changed from: private */

    /* renamed from: aT */
    public String f20051aT;
    /* access modifiers changed from: private */

    /* renamed from: aU */
    public boolean f20052aU;

    /* renamed from: aV */
    private boolean f20053aV;
    /* access modifiers changed from: private */

    /* renamed from: aW */
    public volatile boolean f20054aW = false;
    /* access modifiers changed from: private */

    /* renamed from: aX */
    public boolean f20055aX = false;

    /* renamed from: aY */
    private boolean f20056aY;
    /* access modifiers changed from: private */

    /* renamed from: aZ */
    public boolean f20057aZ = false;

    /* renamed from: ae */
    private String f20058ae;

    /* renamed from: af */
    private String f20059af;

    /* renamed from: ag */
    private ArrayList<String> f20060ag;

    /* renamed from: ah */
    private String f20061ah;

    /* renamed from: ai */
    private String f20062ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public String f20063aj;

    /* renamed from: ak */
    private double f20064ak;

    /* renamed from: al */
    private double f20065al;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public boolean f20066am = false;

    /* renamed from: an */
    private String f20067an;

    /* renamed from: ao */
    private boolean f20068ao = true;

    /* renamed from: ap */
    private boolean f20069ap;

    /* renamed from: aq */
    private boolean f20070aq = false;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public boolean f20071ar = false;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public boolean f20072as = false;
    /* access modifiers changed from: private */

    /* renamed from: at */
    public LinearLayout f20073at;

    /* renamed from: au */
    private Bundle f20074au;

    /* renamed from: av */
    private int f20075av = 0;

    /* renamed from: aw */
    private ProgressDialog f20076aw = null;

    /* renamed from: ax */
    private JSONObject f20077ax;

    /* renamed from: ay */
    private JSONObject f20078ay;

    /* renamed from: az */
    private JSONObject f20079az;
    /* access modifiers changed from: private */

    /* renamed from: ba */
    public boolean f20080ba = false;
    /* access modifiers changed from: private */

    /* renamed from: bb */
    public boolean f20081bb = false;
    /* access modifiers changed from: private */

    /* renamed from: bc */
    public C5416a f20082bc = null;

    /* renamed from: bd */
    private TextWatcher f20083bd = null;

    /* renamed from: be */
    private int f20084be = 0;

    /* renamed from: d */
    private LinearLayout f20085d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public PickerView f20086e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<Field> f20087f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public CharSequence[] f20088g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public SparseBooleanArray f20089h;

    /* renamed from: i */
    private List<LinearLayout> f20090i;

    /* renamed from: com.seattleclouds.modules.feedback.a$a */
    private class C5667a extends BroadcastReceiver {
        private C5667a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("com.seattleclouds.modules.baidumap.BaiduUtil.action.getLocation")) {
                Bundle extras = intent.getExtras();
                String string = extras.getString("received_address");
                double d = extras.getDouble("received_latitude");
                double d2 = extras.getDouble("received_longitute");
                Location location = new Location("");
                location.setLatitude(d);
                location.setLongitude(d2);
                C5633a.this.f20047aP = d;
                C5633a.this.f20048aQ = d2;
                C5633a.this.m27943a(string, location);
                StringBuilder sb = new StringBuilder();
                sb.append("Baidu LocationListener");
                sb.append(C5415d.m27092a(location.getLatitude(), location.getLongitude(), 0));
                Log.d("FeedbackActivity", sb.toString());
            }
        }
    }

    /* renamed from: com.seattleclouds.modules.feedback.a$b */
    final class C5668b extends AsyncTask<String, Integer, String> {

        /* renamed from: b */
        private final String f20147b = C5633a.this.f20041aJ.mo16996B();

        /* renamed from: c */
        private final Activity f20148c;

        /* renamed from: d */
        private ProgressDialog f20149d;

        /* renamed from: e */
        private C6608d f20150e = null;

        public C5668b(Activity activity) {
            this.f20148c = activity;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            StringBuilder sb;
            String str;
            double d;
            double d2;
            String str2 = "";
            C5633a.this.f20041aJ.f18741c = new ArrayList<>();
            XmlPullParser newPullParser = Xml.newPullParser();
            try {
                LocationModel locationModel = null;
                newPullParser.setInput(this.f20147b.indexOf(TableOfContents.DEFAULT_PATH_SEPARATOR) == -1 ? App.m25639c(this.f20147b) : new URL(this.f20147b).openStream(), null);
                boolean z = false;
                for (int eventType = newPullParser.getEventType(); eventType != 1 && !z; eventType = newPullParser.next()) {
                    if (eventType != 0) {
                        switch (eventType) {
                            case 2:
                                if (!newPullParser.getName().equalsIgnoreCase("location")) {
                                    break;
                                } else {
                                    locationModel = new LocationModel();
                                    break;
                                }
                            case 3:
                                String name = newPullParser.getName();
                                if (!name.equalsIgnoreCase("location")) {
                                    if (!name.equalsIgnoreCase("name")) {
                                        if (!name.equalsIgnoreCase("latitude")) {
                                            if (!name.equalsIgnoreCase("longitude")) {
                                                if (!name.equalsIgnoreCase("country")) {
                                                    if (!name.equalsIgnoreCase("state")) {
                                                        if (!name.equalsIgnoreCase("city")) {
                                                            if (!name.equalsIgnoreCase("address")) {
                                                                if (!name.equalsIgnoreCase("postal_code")) {
                                                                    if (!name.equalsIgnoreCase("type")) {
                                                                        if (!name.equalsIgnoreCase("imageurl")) {
                                                                            if (!name.equalsIgnoreCase("target")) {
                                                                                if (!name.equalsIgnoreCase("description")) {
                                                                                    if (!name.equalsIgnoreCase("document")) {
                                                                                        break;
                                                                                    } else {
                                                                                        z = true;
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    locationModel.f19991l = str2.trim();
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                locationModel.f19988i = str2.trim();
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            locationModel.f19990k = str2.trim();
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        locationModel.f19989j = str2.trim();
                                                                        break;
                                                                    }
                                                                } else {
                                                                    locationModel.f19987h = str2.trim();
                                                                    break;
                                                                }
                                                            } else {
                                                                locationModel.f19986g = str2.trim();
                                                                break;
                                                            }
                                                        } else {
                                                            locationModel.f19985f = str2.trim();
                                                            break;
                                                        }
                                                    } else {
                                                        locationModel.f19984e = str2.trim();
                                                        break;
                                                    }
                                                } else {
                                                    locationModel.f19983d = str2.trim();
                                                    break;
                                                }
                                            } else {
                                                try {
                                                    d = Double.parseDouble(str2.trim());
                                                } catch (NumberFormatException unused) {
                                                    d = 0.0d;
                                                }
                                                locationModel.f19982c = d;
                                                break;
                                            }
                                        } else {
                                            try {
                                                d2 = Double.parseDouble(str2.trim());
                                            } catch (NumberFormatException unused2) {
                                                d2 = 0.0d;
                                            }
                                            locationModel.f19981b = d2;
                                            break;
                                        }
                                    } else {
                                        locationModel.f19980a = str2.trim();
                                        break;
                                    }
                                } else {
                                    C5633a.this.f20041aJ.f18741c.add(locationModel);
                                    break;
                                }
                            case 4:
                                str2 = newPullParser.getText();
                                break;
                        }
                    }
                }
            } catch (XmlPullParserException e) {
                e = e;
                str = "ParseLocationsAsyncTask";
                sb = new StringBuilder();
                sb.append("doFindLocationParsing: ");
                sb.append(e);
                Log.e(str, sb.toString(), e);
                return "ok";
            } catch (FileNotFoundException e2) {
                e = e2;
                str = "ParseLocationsAsyncTask";
                sb = new StringBuilder();
                sb.append("doFindLocationParsing: ");
                sb.append(e);
                Log.e(str, sb.toString(), e);
                return "ok";
            } catch (IOException e3) {
                e = e3;
                str = "ParseLocationsAsyncTask";
                sb = new StringBuilder();
                sb.append("doFindLocationParsing: ");
                sb.append(e);
                Log.e(str, sb.toString(), e);
                return "ok";
            }
            return "ok";
        }

        /* renamed from: a */
        public void mo18258a(C6608d dVar) {
            this.f20150e = dVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            this.f20149d.dismiss();
            if (this.f20150e != null) {
                this.f20150e.mo16855a(null);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            super.onCancelled();
            this.f20149d.dismiss();
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            this.f20149d = new ProgressDialog(this.f20148c);
            this.f20149d.setMessage("Searching...");
            this.f20149d.setCancelable(false);
            this.f20149d.getWindow().clearFlags(2);
            this.f20149d.show();
            super.onPreExecute();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append("/Feedback/");
        f20029b = sb.toString();
    }

    /* renamed from: a */
    private BasicNameValuePair m27939a(PickerView pickerView) {
        String str;
        StringBuilder sb;
        String str2 = "";
        String str3 = "";
        boolean z = false;
        if (pickerView.f20005k == 0 || pickerView.f20005k == 1 || pickerView.f20005k == 5 || pickerView.f20005k == 16 || pickerView.f20005k == 11 || pickerView.f20005k == 6 || pickerView.f20005k == 7 || pickerView.f20005k == 8 || pickerView.f20005k == 10) {
            str2 = pickerView.f20006l.f19968c;
            str3 = pickerView.f19996b.getText().toString();
            if (pickerView.f20005k == 10) {
                z = true;
            }
        } else if (pickerView.f20005k == 2) {
            str2 = pickerView.f20006l.f19968c;
            if (pickerView.f20008n == 0.0d && pickerView.f20009o == 0.0d) {
                pickerView.f20008n = this.f20039aH.getLatitude();
                pickerView.f20009o = this.f20039aH.getLongitude();
            }
            if (this.f20055aX || (!this.f20057aZ && !this.f20080ba)) {
                sb = new StringBuilder();
                sb.append(pickerView.f19996b.getText().toString());
                sb.append(" <a href=\"http://maps.google.com/maps?q=");
                sb.append(pickerView.f20008n);
                sb.append(",");
                sb.append(pickerView.f20009o);
                str = "\">VIEW MAP</a>";
            } else {
                sb = new StringBuilder();
                sb.append(pickerView.f19996b.getText().toString());
                sb.append(" <a href=\"http://api.map.baidu.com/marker?location=");
                sb.append(pickerView.f20008n);
                sb.append(",");
                sb.append(pickerView.f20009o);
                sb.append("&title=");
                sb.append(pickerView.f19996b.getText().toString());
                sb.append("&content=");
                sb.append(pickerView.f19996b.getText().toString());
                str = "&output=html\">VIEW MAP</a>";
            }
            sb.append(str);
            str3 = sb.toString();
        } else if (pickerView.f20005k == 3 || pickerView.f20005k == 4 || pickerView.f20005k == 9 || pickerView.f20005k == 17) {
            str2 = pickerView.f20006l.f19968c;
            if (pickerView.f20007m == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<img src=\"http://");
                sb2.append(App.f18516r);
                sb2.append("/formimages/default.png\">");
                str3 = sb2.toString();
            } else {
                String uuid = UUID.randomUUID().toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("http://");
                sb3.append(App.f18516r);
                sb3.append("/saveformimage.ashx?uuid=");
                sb3.append(uuid);
                sb3.append("&username=");
                sb3.append(App.f18523y);
                sb3.append("&appid=");
                sb3.append(App.f18524z);
                sb3.append("&publisherid=");
                sb3.append(App.f18522x);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("<a href=\"http://");
                sb5.append(App.f18516r);
                sb5.append("/formimages/");
                sb5.append(uuid);
                sb5.append(".png\"><img src=\"http://");
                sb5.append(App.f18516r);
                sb5.append("/formimages/");
                sb5.append(uuid);
                sb5.append(".png\" style='max-width:500px;height:auto;'></a>");
                str3 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("tempPV.imageUri = ");
                sb6.append(pickerView.f20007m);
                Log.v("FeedbackActivity", sb6.toString());
                ByteArrayEntity byteArrayEntity = new ByteArrayEntity(C6613i.m31990a(mo1318s().getContentResolver().openInputStream(pickerView.f20007m)));
                HttpPost httpPost = new HttpPost(sb4);
                httpPost.setEntity(byteArrayEntity);
                m27951aB();
                C6567c.m31787a(httpPost, new C6568d() {
                    /* renamed from: a */
                    public void mo18224a(HttpResponse httpResponse) {
                        C5633a.this.m27952aC();
                        String a = C6567c.m31786a(httpResponse);
                        if (a == null || !a.equalsIgnoreCase("ok")) {
                            C6620n.m32034a((Context) C5633a.this.mo1318s(), "Error uploading image", a);
                        }
                    }

                    /* renamed from: b */
                    public void mo1450b() {
                        C5633a.this.m27952aC();
                        C6620n.m32034a((Context) C5633a.this.mo1318s(), "ERROR", "Server is NOT responding.");
                    }
                });
            }
        } else if (pickerView.f20005k == 15) {
            str2 = pickerView.f20006l.f19968c;
            VoiceRecordPickerView voiceRecordPickerView = (VoiceRecordPickerView) pickerView;
            if (voiceRecordPickerView.getRecordPath() != null) {
                String recordName = voiceRecordPickerView.getRecordName();
                String substring = recordName.substring(recordName.lastIndexOf(46) + 1);
                StringBuilder sb7 = new StringBuilder();
                sb7.append(UUID.randomUUID().toString());
                sb7.append(".");
                sb7.append(substring);
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append("<a href=\"http://");
                sb9.append(App.f18516r);
                sb9.append("/formrecords/");
                sb9.append(sb8);
                sb9.append("\">");
                String sb10 = sb9.toString();
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb10);
                sb11.append(recordName);
                sb11.append(" </a>");
                str3 = sb11.toString();
                StringBuilder sb12 = new StringBuilder();
                sb12.append("http://");
                sb12.append(App.f18516r);
                sb12.append("/saveformvoicerecord.ashx?uuid=");
                sb12.append(sb8);
                sb12.append("&username=");
                sb12.append(App.f18523y);
                sb12.append("&appid=");
                sb12.append(App.f18524z);
                sb12.append("&publisherid=");
                sb12.append(App.f18522x);
                String sb13 = sb12.toString();
                ByteArrayEntity byteArrayEntity2 = new ByteArrayEntity(C6613i.m31990a(new FileInputStream(voiceRecordPickerView.getRecordPath())));
                HttpPost httpPost2 = new HttpPost(sb13);
                httpPost2.setEntity(byteArrayEntity2);
                m27951aB();
                C6567c.m31787a(httpPost2, new C6568d() {
                    /* renamed from: a */
                    public void mo18224a(HttpResponse httpResponse) {
                        C5633a.this.m27952aC();
                        String a = C6567c.m31786a(httpResponse);
                        if (a == null || !a.equalsIgnoreCase("ok")) {
                            C6620n.m32034a((Context) C5633a.this.mo1318s(), "Error uploading voice record", a);
                        }
                    }

                    /* renamed from: b */
                    public void mo1450b() {
                        C5633a.this.m27952aC();
                        C6620n.m32034a((Context) C5633a.this.mo1318s(), "ERROR", "Server is NOT responding.");
                    }
                });
            } else {
                str3 = "";
            }
        }
        StringBuilder sb14 = new StringBuilder();
        sb14.append(str2);
        sb14.append(z ? ":lb" : ":");
        return new BasicNameValuePair(sb14.toString(), str3);
    }

    /* renamed from: a */
    private void m27940a(Location location) {
        if (this.f20038aG != null && this.f20066am) {
            this.f20038aG.mo17731b();
        }
        this.f20039aH = location;
        m27962b(this.f20039aH);
    }

    /* renamed from: a */
    private void m27941a(PickerView pickerView, Uri uri, String str, Uri uri2, boolean z) {
        final String str2 = str;
        final Uri uri3 = uri;
        final boolean z2 = z;
        final Uri uri4 = uri2;
        final PickerView pickerView2 = pickerView;
        C56626 r1 = new Runnable() {
            public void run() {
                if (str2 != null) {
                    final Bitmap a = C6638s.m32070a(str2, C6638s.m32067a(uri3, 220, (Activity) C5633a.this.mo1318s()));
                    if (a != null) {
                        final boolean z = z2 && C5633a.this.m27947a(str2, uri4.getPath());
                        C0367h s = C5633a.this.mo1318s();
                        if (s != null) {
                            s.runOnUiThread(new Runnable() {
                                public void run() {
                                    pickerView2.f19999e.setImageBitmap(a);
                                    pickerView2.f20007m = z ? uri4 : uri3;
                                }
                            });
                        }
                    }
                }
            }
        };
        new Thread(r1).start();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27943a(String str, Location location) {
        if (mo1193C()) {
            for (int i = 0; i < this.f20073at.getChildCount(); i++) {
                View childAt = this.f20073at.getChildAt(i);
                if (childAt.getClass().equals(PickerView.class)) {
                    PickerView pickerView = (PickerView) childAt;
                    if (pickerView.f20005k == 2) {
                        pickerView.f19996b.setText(str);
                        pickerView.f20008n = location.getLatitude();
                        pickerView.f20009o = location.getLongitude();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m27947a(String str, String str2) {
        int b = C6638s.m32075b(str);
        if (b != 0) {
            Bitmap bitmap = null;
            try {
                CompressFormat compressFormat = C6638s.m32079c(str) ? CompressFormat.PNG : CompressFormat.JPEG;
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                if (decodeFile != null) {
                    try {
                        bitmap = C6638s.m32065a(decodeFile, b);
                        boolean a = C6638s.m32074a(bitmap, compressFormat, str2);
                        C6638s.m32073a(bitmap);
                        return a;
                    } catch (OutOfMemoryError unused) {
                        bitmap = decodeFile;
                        C6638s.m32073a(bitmap);
                        return C6638s.m32071a(str, str2).booleanValue();
                    }
                }
            } catch (OutOfMemoryError unused2) {
                C6638s.m32073a(bitmap);
                return C6638s.m32071a(str, str2).booleanValue();
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m27948a(ArrayList<Field> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Field) it.next()).mo18163b().equalsIgnoreCase("location")) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: aA */
    public void m27950aA() {
        FragmentInfo a;
        boolean z;
        for (int i = 0; i < this.f20073at.getChildCount(); i++) {
            if (this.f20073at.getChildAt(i) instanceof PickerView) {
                PickerView pickerView = (PickerView) this.f20073at.getChildAt(i);
                if (pickerView.f20005k == 2) {
                    this.f20047aP = this.f20039aH.getLatitude();
                    this.f20048aQ = this.f20039aH.getLongitude();
                    pickerView.f20008n = this.f20047aP;
                    pickerView.f20009o = this.f20048aQ;
                    if (!TextUtils.isEmpty(pickerView.f19996b.getText())) {
                        this.f20043aL = pickerView.f19996b.getText().toString().toLowerCase(Locale.getDefault());
                    }
                } else if (pickerView.f20005k == 5 || pickerView.f20005k == 11) {
                    this.f20042aK = pickerView.f19996b.getText().toString().toLowerCase(Locale.getDefault());
                } else if (pickerView.f20005k == 7) {
                    if (pickerView.f20006l.f19966a.equalsIgnoreCase("field2")) {
                        this.f20044aM = pickerView.f19996b.getText().toString().toLowerCase(Locale.getDefault());
                    }
                    if (pickerView.f20006l.f19966a.equalsIgnoreCase("field4")) {
                        this.f20045aN = pickerView.f19996b.getText().toString().toLowerCase(Locale.getDefault());
                        if (!this.f20045aN.equalsIgnoreCase("any")) {
                            try {
                                this.f20046aO = Integer.parseInt(this.f20045aN.trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                        this.f20046aO = 0;
                    }
                }
            }
        }
        this.f20042aK = C6592al.m31910c(this.f20042aK) ? null : this.f20042aK.trim().toLowerCase(Locale.getDefault());
        String[] strArr = new String[0];
        if (this.f20042aK != null) {
            strArr = this.f20042aK.split("[ ]+");
        }
        ArrayList arrayList = new ArrayList();
        if (!(this.f20041aJ.f18741c == null || this.f20041aJ.f18741c.size() == 0)) {
            Iterator it = this.f20041aJ.f18741c.iterator();
            while (it.hasNext()) {
                LocationModel locationModel = (LocationModel) it.next();
                locationModel.f19994o = C5415d.m27090a(this.f20047aP, this.f20048aQ, locationModel.f19981b, locationModel.f19982c, this.f20068ao);
                if (this.f20046aO == 0 || locationModel.f19994o <= ((double) this.f20046aO)) {
                    if (this.f20042aK != null) {
                        String lowerCase = locationModel.f19980a.trim().toLowerCase(Locale.getDefault());
                        boolean contains = lowerCase.contains(this.f20042aK);
                        if (!contains) {
                            String[] split = lowerCase.split("[ ]+");
                            int length = strArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    break;
                                }
                                String str = strArr[i2];
                                for (String equals : split) {
                                    if (equals.equals(str)) {
                                        contains = true;
                                        break;
                                    }
                                }
                                i2++;
                            }
                        }
                        if (!contains) {
                        }
                    }
                    if (this.f20043aL != null) {
                        this.f20043aL = C6592al.m31913f(this.f20043aL);
                        String f = C6592al.m31913f(locationModel.f19983d.trim().toLowerCase(Locale.getDefault()));
                        String f2 = C6592al.m31913f(locationModel.f19984e.trim().toLowerCase(Locale.getDefault()));
                        String f3 = C6592al.m31913f(locationModel.f19985f.trim().toLowerCase(Locale.getDefault()));
                        String f4 = C6592al.m31913f(locationModel.f19986g.trim().toLowerCase(Locale.getDefault()));
                        String f5 = C6592al.m31913f(locationModel.f19987h.trim().toLowerCase(Locale.getDefault()));
                        boolean contains2 = f.contains(this.f20043aL);
                        boolean contains3 = f2.contains(this.f20043aL);
                        boolean contains4 = f3.contains(this.f20043aL);
                        boolean contains5 = f4.contains(this.f20043aL);
                        boolean contains6 = f5.contains(this.f20043aL);
                        if (this.f20082bc != null) {
                            C5416a aVar = this.f20082bc;
                            if (!TextUtils.isEmpty(C5416a.m27097b())) {
                                C5416a aVar2 = this.f20082bc;
                                z = C6592al.m31913f(C5416a.m27097b().trim().toLowerCase()).contains(f3);
                                if (!z && !contains2 && !contains3 && !contains4 && !contains5 && !contains6 && !this.f20045aN.equals("any")) {
                                }
                            }
                        }
                        z = false;
                    }
                    String[] split2 = locationModel.f19989j.split(",");
                    this.f20044aM = this.f20044aM.replace(" ", "");
                    int i3 = 0;
                    boolean z2 = false;
                    while (true) {
                        if (i3 >= split2.length) {
                            break;
                        }
                        String replace = split2[i3].replace(" ", "");
                        if (this.f20044aM == null || this.f20044aM.equalsIgnoreCase("") || this.f20044aM.equalsIgnoreCase("any") || replace.equalsIgnoreCase(this.f20044aM)) {
                            z2 = false;
                        } else {
                            i3++;
                            z2 = true;
                        }
                    }
                    z2 = false;
                    if (!z2) {
                        arrayList.add(locationModel);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            C0766a aVar3 = new C0766a(mo1318s());
            aVar3.mo3060b(C5462k.location_finder_no_locations).mo3056a(true).mo3055a((CharSequence) "OK", (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            aVar3.mo3065b().show();
            return;
        }
        Collections.sort(arrayList);
        int H = this.f20041aJ.mo17008H();
        ArrayList<LocationModel> arrayList2 = arrayList.size() <= H ? new ArrayList<>(arrayList) : new ArrayList<>(arrayList.subList(0, H));
        StringBuilder sb = new StringBuilder();
        sb.append("locationfinder:name=");
        sb.append(this.f20042aK);
        sb.append(",type=");
        sb.append(this.f20044aM);
        sb.append(",lat=");
        sb.append(this.f20047aP);
        sb.append(",lon=");
        sb.append(this.f20048aQ);
        String sb2 = sb.toString();
        C5230aa aaVar = new C5230aa(sb2);
        aaVar.mo17050a("locationslist");
        aaVar.f18741c = arrayList2;
        App.f18501c.mo16902D().put(sb2, aaVar);
        if (this.f20067an.equalsIgnoreCase("list")) {
            a = C5417e.m27098a(aaVar.f18741c, this.f20068ao);
        } else if (this.f20067an.equalsIgnoreCase("map")) {
            a = C5420f.m27112a(aaVar.f18741c);
        } else {
            return;
        }
        App.m25620a(a, (Fragment) this);
    }

    /* renamed from: aB */
    private synchronized void m27951aB() {
        this.f20075av++;
        StringBuilder sb = new StringBuilder();
        sb.append("showProgressDialog: ");
        sb.append(this.f20075av);
        Log.v("FeedbackActivity", sb.toString());
        if (this.f20075av == 1) {
            this.f20076aw = new ProgressDialog(mo1318s());
            this.f20076aw.setProgressStyle(0);
            this.f20076aw.setMessage(mo1219a(C5462k.feedback_submitting_message));
            this.f20076aw.setCancelable(false);
            this.f20076aw.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aC */
    public synchronized void m27952aC() {
        this.f20075av--;
        if (this.f20075av < 0) {
            this.f20075av = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("dismissProgressDialog: ");
        sb.append(this.f20075av);
        Log.v("FeedbackActivity", sb.toString());
        if (this.f20075av == 0 && this.f20076aw != null) {
            this.f20076aw.dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: aD */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27953aD() {
        /*
            r5 = this;
            boolean r0 = r5.f20057aZ
            r1 = 0
            if (r0 == 0) goto L_0x005d
            boolean r0 = r5.f20057aZ
            if (r0 == 0) goto L_0x000d
            boolean r0 = r5.f20055aX
            if (r0 != 0) goto L_0x005d
        L_0x000d:
            boolean r0 = r5.f20080ba
            if (r0 == 0) goto L_0x0016
            boolean r0 = r5.f20055aX
            if (r0 == 0) goto L_0x0016
            goto L_0x005d
        L_0x0016:
            com.seattleclouds.modules.feedback.a$a r0 = new com.seattleclouds.modules.feedback.a$a
            r2 = 0
            r0.<init>()
            r5.f20031a = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            java.lang.String r3 = "com.seattleclouds.modules.baidumap.BaiduUtil.action.getLocation"
            r0.<init>(r3)
            android.support.v4.app.h r3 = r5.mo1318s()
            com.seattleclouds.modules.feedback.a$a r4 = r5.f20031a
            r3.registerReceiver(r4, r0)
            r0 = 1
            java.lang.String r3 = "com.seattleclouds.modules.baidumap.BaiduUtil.BaiduLocationService"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0038 }
            r5.f20081bb = r0     // Catch:{ ClassNotFoundException -> 0x0039 }
            goto L_0x0048
        L_0x0038:
            r3 = r2
        L_0x0039:
            r5.f20081bb = r1
            android.support.v4.app.h r1 = r5.mo1318s()
            int r2 = com.seattleclouds.C5451m.C5462k.feedback_baidu_module_not_available_toast
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r2, r0)
            r0.show()
        L_0x0048:
            boolean r0 = r5.f20081bb
            if (r0 == 0) goto L_0x0078
            android.content.Intent r0 = new android.content.Intent
            android.support.v4.app.h r1 = r5.mo1318s()
            r0.<init>(r1, r3)
            android.support.v4.app.h r1 = r5.mo1318s()
            r1.startService(r0)
            goto L_0x0078
        L_0x005d:
            com.seattleclouds.location.g r0 = r5.f20038aG
            if (r0 != 0) goto L_0x0078
            com.seattleclouds.location.g r0 = new com.seattleclouds.location.g
            android.support.v4.app.h r2 = r5.mo1318s()
            com.seattleclouds.modules.feedback.a$13 r3 = new com.seattleclouds.modules.feedback.a$13
            r3.<init>(r1)
            r0.<init>(r2, r3)
            r5.f20038aG = r0
            com.seattleclouds.location.g r0 = r5.f20038aG
            r1 = 2000(0x7d0, double:9.88E-321)
            r0.mo17728a(r1)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.feedback.C5633a.m27953aD():void");
    }

    /* renamed from: aE */
    private void m27954aE() {
        Drawable j = App.m25658j(this.f20058ae);
        if (j != null) {
            C6669a aVar = new C6669a(mo1318s());
            aVar.setLayoutParams(new LayoutParams(-1, -2));
            aVar.setImageDrawable(j);
            this.f20073at.addView(aVar);
            this.f20084be = 1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aF */
    public void m27955aF() {
        boolean z;
        Class cls;
        try {
            cls = Class.forName("com.seattleclouds.modules.baidumap.BaiduUtil.BaiduLocationService");
            z = false;
        } catch (ClassNotFoundException e) {
            z = true;
            StringBuilder sb = new StringBuilder();
            sb.append("StopBaiduLocationRequestService: ");
            sb.append(e.getMessage());
            Log.e("FeedbackActivity", sb.toString());
            cls = null;
        }
        if (!z) {
            mo1318s().stopService(new Intent(mo1318s(), cls));
        }
    }

    /* renamed from: aG */
    private void m27956aG() {
        try {
            mo1318s().unregisterReceiver(this.f20031a);
        } catch (IllegalArgumentException e) {
            Log.e("FeedbackActivity", e.getMessage());
        }
        try {
            C0456d.m2097a((Context) mo1318s()).mo1843a((BroadcastReceiver) this.f20031a);
        } catch (IllegalArgumentException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("UnregisterBaiduLocationReceiver exception:");
            sb.append(e2.getMessage());
            Log.e("FeedbackActivity", sb.toString());
        }
    }

    /* renamed from: aH */
    private TextWatcher m27957aH() {
        C564419 r0 = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (C5633a.this.f20082bc != null) {
                    C5633a.this.f20082bc;
                    if (!C5416a.m27096a().equals(charSequence.toString())) {
                        C5633a.this.f20082bc = null;
                    }
                }
            }
        };
        this.f20083bd = r0;
        return r0;
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v40, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v42, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v44 */
    /* JADX WARNING: type inference failed for: r8v34, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v48, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r3v49 */
    /* JADX WARNING: type inference failed for: r3v50 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String[], java.lang.String]
      uses: [java.lang.Object, java.lang.CharSequence, ?[int, boolean, OBJECT, ARRAY, byte, short, char], ?[], ?[OBJECT, ARRAY][]]
      mth insns count: 455
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: as */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27958as() {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            android.widget.LinearLayout r2 = r14.f20073at
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L_0x0492
            android.widget.LinearLayout r2 = r14.f20073at
            android.view.View r2 = r2.getChildAt(r1)
            boolean r2 = r2 instanceof com.seattleclouds.modules.feedback.PickerView
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0290
            android.widget.LinearLayout r2 = r14.f20073at
            android.view.View r2 = r2.getChildAt(r1)
            com.seattleclouds.modules.feedback.PickerView r2 = (com.seattleclouds.modules.feedback.PickerView) r2
            int r5 = r2.f20005k
            r6 = 11
            if (r5 == r6) goto L_0x0250
            r6 = 16
            if (r5 == r6) goto L_0x0211
            switch(r5) {
                case 5: goto L_0x01b9;
                case 6: goto L_0x0161;
                case 7: goto L_0x00fd;
                case 8: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x048e
        L_0x002d:
            org.json.JSONObject r5 = r14.f20036aE     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r6 = "{}"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ JSONException -> 0x00f4 }
            if (r5 != 0) goto L_0x005e
            org.json.JSONObject r5 = r14.f20036aE     // Catch:{ JSONException -> 0x00f4 }
            com.seattleclouds.modules.feedback.Field r6 = r2.f20006l     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r6 = r6.f19968c     // Catch:{ JSONException -> 0x00f4 }
            boolean r5 = r5.has(r6)     // Catch:{ JSONException -> 0x00f4 }
            if (r5 == 0) goto L_0x005e
            org.json.JSONObject r5 = r14.f20036aE     // Catch:{ JSONException -> 0x00f4 }
            com.seattleclouds.modules.feedback.Field r6 = r2.f20006l     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r6 = r6.f19968c     // Catch:{ JSONException -> 0x00f4 }
            boolean r5 = r5.isNull(r6)     // Catch:{ JSONException -> 0x00f4 }
            if (r5 != 0) goto L_0x005e
            org.json.JSONObject r5 = r14.f20036aE     // Catch:{ JSONException -> 0x00f4 }
            com.seattleclouds.modules.feedback.Field r6 = r2.f20006l     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r6 = r6.f19968c     // Catch:{ JSONException -> 0x00f4 }
            org.json.JSONObject r5 = r5.getJSONObject(r6)     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x005f
        L_0x005e:
            r5 = r3
        L_0x005f:
            if (r5 == 0) goto L_0x048e
            java.lang.String r6 = ""
            java.lang.String r7 = "itemMLValue"
            boolean r7 = r5.has(r7)     // Catch:{ JSONException -> 0x00f4 }
            if (r7 == 0) goto L_0x007f
            java.lang.String r7 = "itemMLValue"
            boolean r7 = r5.isNull(r7)     // Catch:{ JSONException -> 0x00f4 }
            if (r7 != 0) goto L_0x007f
            java.lang.String r3 = "itemMLValue"
            java.lang.String r3 = r5.getString(r3)     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r7 = ","
            java.lang.String[] r3 = r3.split(r7)     // Catch:{ JSONException -> 0x00f4 }
        L_0x007f:
            java.lang.String r7 = "refValue"
            boolean r7 = r5.has(r7)     // Catch:{ JSONException -> 0x00f4 }
            if (r7 == 0) goto L_0x0095
            java.lang.String r7 = "refValue"
            boolean r7 = r5.isNull(r7)     // Catch:{ JSONException -> 0x00f4 }
            if (r7 != 0) goto L_0x0095
            java.lang.String r6 = "refValue"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ JSONException -> 0x00f4 }
        L_0x0095:
            com.seattleclouds.modules.feedback.Field r5 = r2.f20006l     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r5 = r5.f19978m     // Catch:{ JSONException -> 0x00f4 }
            if (r5 == 0) goto L_0x00a9
            com.seattleclouds.modules.feedback.Field r5 = r2.f20006l     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r5 = r5.f19978m     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r7 = ""
            boolean r5 = r5.equalsIgnoreCase(r7)     // Catch:{ JSONException -> 0x00f4 }
            if (r5 != 0) goto L_0x00a9
            r5 = 1
            goto L_0x00aa
        L_0x00a9:
            r5 = 0
        L_0x00aa:
            if (r6 == 0) goto L_0x00b5
            java.lang.String r7 = ""
            boolean r6 = r6.equalsIgnoreCase(r7)     // Catch:{ JSONException -> 0x00f4 }
            if (r6 != 0) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            if (r5 != 0) goto L_0x048e
            if (r4 != 0) goto L_0x048e
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x00f4 }
            java.util.Map r4 = r4.mo18176h()     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r5 = "list"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ JSONException -> 0x00f4 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ JSONException -> 0x00f4 }
            int r5 = r4.size()     // Catch:{ JSONException -> 0x00f4 }
            if (r5 <= 0) goto L_0x048e
            if (r3 == 0) goto L_0x048e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ JSONException -> 0x00f4 }
            r5.<init>()     // Catch:{ JSONException -> 0x00f4 }
            int r6 = r3.length     // Catch:{ JSONException -> 0x00f4 }
            r7 = 0
        L_0x00d7:
            if (r7 >= r6) goto L_0x00e7
            r8 = r3[r7]     // Catch:{ JSONException -> 0x00f4 }
            boolean r9 = r4.contains(r8)     // Catch:{ JSONException -> 0x00f4 }
            if (r9 == 0) goto L_0x00e4
            r5.add(r8)     // Catch:{ JSONException -> 0x00f4 }
        L_0x00e4:
            int r7 = r7 + 1
            goto L_0x00d7
        L_0x00e7:
            android.widget.EditText r3 = r2.f19996b     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r4 = ", "
            java.lang.String r4 = android.text.TextUtils.join(r4, r5)     // Catch:{ JSONException -> 0x00f4 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x00f4 }
            goto L_0x048e
        L_0x00f4:
            java.lang.String r3 = "FeedbackActivity"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x01f7
        L_0x00fd:
            org.json.JSONObject r4 = r14.f20035aD     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r5 = "{}"
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch:{ JSONException -> 0x0158 }
            if (r4 != 0) goto L_0x012e
            org.json.JSONObject r4 = r14.f20035aD     // Catch:{ JSONException -> 0x0158 }
            com.seattleclouds.modules.feedback.Field r5 = r2.f20006l     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r5 = r5.f19968c     // Catch:{ JSONException -> 0x0158 }
            boolean r4 = r4.has(r5)     // Catch:{ JSONException -> 0x0158 }
            if (r4 == 0) goto L_0x012e
            org.json.JSONObject r4 = r14.f20035aD     // Catch:{ JSONException -> 0x0158 }
            com.seattleclouds.modules.feedback.Field r5 = r2.f20006l     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r5 = r5.f19968c     // Catch:{ JSONException -> 0x0158 }
            boolean r4 = r4.isNull(r5)     // Catch:{ JSONException -> 0x0158 }
            if (r4 != 0) goto L_0x012e
            org.json.JSONObject r4 = r14.f20035aD     // Catch:{ JSONException -> 0x0158 }
            com.seattleclouds.modules.feedback.Field r5 = r2.f20006l     // Catch:{ JSONException -> 0x0158 }
            java.lang.String r5 = r5.f19968c     // Catch:{ JSONException -> 0x0158 }
            org.json.JSONObject r4 = r4.getJSONObject(r5)     // Catch:{ JSONException -> 0x0158 }
            goto L_0x012f
        L_0x012e:
            r4 = r3
        L_0x012f:
            if (r4 == 0) goto L_0x048e
            java.lang.String r5 = "itemLValue"
            boolean r5 = r4.has(r5)     // Catch:{ JSONException -> 0x0158 }
            if (r5 == 0) goto L_0x0147
            java.lang.String r5 = "itemLValue"
            boolean r5 = r4.isNull(r5)     // Catch:{ JSONException -> 0x0158 }
            if (r5 != 0) goto L_0x0147
            java.lang.String r3 = "itemLValue"
            java.lang.String r3 = r4.getString(r3)     // Catch:{ JSONException -> 0x0158 }
        L_0x0147:
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x0158 }
            java.util.List<java.lang.String> r4 = r4.f19971f     // Catch:{ JSONException -> 0x0158 }
            boolean r4 = r4.contains(r3)     // Catch:{ JSONException -> 0x0158 }
            if (r4 == 0) goto L_0x048e
            android.widget.EditText r4 = r2.f19996b     // Catch:{ JSONException -> 0x0158 }
            r4.setText(r3)     // Catch:{ JSONException -> 0x0158 }
            goto L_0x048e
        L_0x0158:
            java.lang.String r3 = "FeedbackActivity"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x01f7
        L_0x0161:
            org.json.JSONObject r3 = r14.f20034aC     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r4 = "{}"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch:{ JSONException -> 0x0198 }
            if (r3 != 0) goto L_0x048e
            org.json.JSONObject r3 = r14.f20034aC     // Catch:{ JSONException -> 0x0198 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x0198 }
            boolean r3 = r3.has(r4)     // Catch:{ JSONException -> 0x0198 }
            if (r3 == 0) goto L_0x048e
            org.json.JSONObject r3 = r14.f20034aC     // Catch:{ JSONException -> 0x0198 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x0198 }
            boolean r3 = r3.isNull(r4)     // Catch:{ JSONException -> 0x0198 }
            if (r3 != 0) goto L_0x048e
            android.widget.EditText r3 = r2.f19996b     // Catch:{ JSONException -> 0x0198 }
            org.json.JSONObject r4 = r14.f20034aC     // Catch:{ JSONException -> 0x0198 }
            com.seattleclouds.modules.feedback.Field r5 = r2.f20006l     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r5 = r5.f19968c     // Catch:{ JSONException -> 0x0198 }
            java.lang.String r4 = r4.getString(r5)     // Catch:{ JSONException -> 0x0198 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x0198 }
            goto L_0x048e
        L_0x0198:
            java.lang.String r3 = "FeedbackActivity"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x019f:
            java.lang.String r5 = " JSON : "
            r4.append(r5)
            com.seattleclouds.modules.feedback.Field r2 = r2.f20006l
            java.lang.String r2 = r2.f19968c
            r4.append(r2)
            java.lang.String r2 = " no such mapping"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.e(r3, r2)
            goto L_0x048e
        L_0x01b9:
            org.json.JSONObject r3 = r14.f20079az     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r4 = "{}"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch:{ JSONException -> 0x01f0 }
            if (r3 != 0) goto L_0x048e
            org.json.JSONObject r3 = r14.f20079az     // Catch:{ JSONException -> 0x01f0 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x01f0 }
            boolean r3 = r3.has(r4)     // Catch:{ JSONException -> 0x01f0 }
            if (r3 == 0) goto L_0x048e
            org.json.JSONObject r3 = r14.f20079az     // Catch:{ JSONException -> 0x01f0 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x01f0 }
            boolean r3 = r3.isNull(r4)     // Catch:{ JSONException -> 0x01f0 }
            if (r3 != 0) goto L_0x048e
            android.widget.EditText r3 = r2.f19996b     // Catch:{ JSONException -> 0x01f0 }
            org.json.JSONObject r4 = r14.f20079az     // Catch:{ JSONException -> 0x01f0 }
            com.seattleclouds.modules.feedback.Field r5 = r2.f20006l     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r5 = r5.f19968c     // Catch:{ JSONException -> 0x01f0 }
            java.lang.String r4 = r4.getString(r5)     // Catch:{ JSONException -> 0x01f0 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x01f0 }
            goto L_0x048e
        L_0x01f0:
            java.lang.String r3 = "FeedbackActivity"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x01f7:
            java.lang.String r5 = " JSON : "
            r4.append(r5)
            com.seattleclouds.modules.feedback.Field r2 = r2.f20006l
            java.lang.String r2 = r2.f19968c
            r4.append(r2)
            java.lang.String r2 = " no such mapping"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.d(r3, r2)
            goto L_0x048e
        L_0x0211:
            org.json.JSONObject r3 = r14.f20032aA     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r4 = "{}"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch:{ JSONException -> 0x0248 }
            if (r3 != 0) goto L_0x048e
            org.json.JSONObject r3 = r14.f20032aA     // Catch:{ JSONException -> 0x0248 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x0248 }
            boolean r3 = r3.has(r4)     // Catch:{ JSONException -> 0x0248 }
            if (r3 == 0) goto L_0x048e
            org.json.JSONObject r3 = r14.f20032aA     // Catch:{ JSONException -> 0x0248 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x0248 }
            boolean r3 = r3.isNull(r4)     // Catch:{ JSONException -> 0x0248 }
            if (r3 != 0) goto L_0x048e
            android.widget.EditText r3 = r2.f19996b     // Catch:{ JSONException -> 0x0248 }
            org.json.JSONObject r4 = r14.f20032aA     // Catch:{ JSONException -> 0x0248 }
            com.seattleclouds.modules.feedback.Field r5 = r2.f20006l     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r5 = r5.f19968c     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r4 = r4.getString(r5)     // Catch:{ JSONException -> 0x0248 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x0248 }
            goto L_0x048e
        L_0x0248:
            java.lang.String r3 = "FeedbackActivity"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x01f7
        L_0x0250:
            org.json.JSONObject r3 = r14.f20033aB     // Catch:{ JSONException -> 0x0287 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0287 }
            java.lang.String r4 = "{}"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch:{ JSONException -> 0x0287 }
            if (r3 != 0) goto L_0x048e
            org.json.JSONObject r3 = r14.f20033aB     // Catch:{ JSONException -> 0x0287 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x0287 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x0287 }
            boolean r3 = r3.has(r4)     // Catch:{ JSONException -> 0x0287 }
            if (r3 == 0) goto L_0x048e
            org.json.JSONObject r3 = r14.f20033aB     // Catch:{ JSONException -> 0x0287 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x0287 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x0287 }
            boolean r3 = r3.isNull(r4)     // Catch:{ JSONException -> 0x0287 }
            if (r3 != 0) goto L_0x048e
            android.widget.EditText r3 = r2.f19996b     // Catch:{ JSONException -> 0x0287 }
            org.json.JSONObject r4 = r14.f20033aB     // Catch:{ JSONException -> 0x0287 }
            com.seattleclouds.modules.feedback.Field r5 = r2.f20006l     // Catch:{ JSONException -> 0x0287 }
            java.lang.String r5 = r5.f19968c     // Catch:{ JSONException -> 0x0287 }
            java.lang.String r4 = r4.getString(r5)     // Catch:{ JSONException -> 0x0287 }
            r3.setText(r4)     // Catch:{ JSONException -> 0x0287 }
            goto L_0x048e
        L_0x0287:
            java.lang.String r3 = "FeedbackActivity"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x019f
        L_0x0290:
            android.widget.LinearLayout r2 = r14.f20073at
            android.view.View r2 = r2.getChildAt(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.Class<android.widget.LinearLayout> r5 = android.widget.LinearLayout.class
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x048e
            android.widget.LinearLayout r2 = r14.f20073at
            android.view.View r2 = r2.getChildAt(r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r5 = 0
        L_0x02ab:
            int r6 = r2.getChildCount()
            if (r5 >= r6) goto L_0x048e
            android.view.View r6 = r2.getChildAt(r5)
            boolean r6 = r6 instanceof com.seattleclouds.modules.feedback.PickerView
            if (r6 == 0) goto L_0x048a
            android.view.View r6 = r2.getChildAt(r5)
            com.seattleclouds.modules.feedback.PickerView r6 = (com.seattleclouds.modules.feedback.PickerView) r6
            int r7 = r6.f20005k
            switch(r7) {
                case 7: goto L_0x03f3;
                case 8: goto L_0x02c6;
                default: goto L_0x02c4;
            }
        L_0x02c4:
            goto L_0x048a
        L_0x02c6:
            org.json.JSONObject r7 = r14.f20036aE
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "{}"
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 != 0) goto L_0x048a
            org.json.JSONObject r7 = r14.f20036aE
            com.seattleclouds.modules.feedback.Field r8 = r6.f20006l
            java.lang.String r8 = r8.f19968c
            boolean r7 = r7.has(r8)
            if (r7 == 0) goto L_0x048a
            org.json.JSONObject r7 = r14.f20036aE
            com.seattleclouds.modules.feedback.Field r8 = r6.f20006l
            java.lang.String r8 = r8.f19968c
            boolean r7 = r7.isNull(r8)
            if (r7 != 0) goto L_0x048a
            org.json.JSONObject r7 = r14.f20036aE     // Catch:{ JSONException -> 0x03ea }
            com.seattleclouds.modules.feedback.Field r8 = r6.f20006l     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r8 = r8.f19968c     // Catch:{ JSONException -> 0x03ea }
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            java.lang.String r10 = "itemMLValue"
            boolean r10 = r7.has(r10)     // Catch:{ JSONException -> 0x03ea }
            if (r10 == 0) goto L_0x0317
            java.lang.String r10 = "itemMLValue"
            boolean r10 = r7.isNull(r10)     // Catch:{ JSONException -> 0x03ea }
            if (r10 != 0) goto L_0x0317
            java.lang.String r10 = "itemMLValue"
            java.lang.String r10 = r7.getString(r10)     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r11 = ","
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ JSONException -> 0x03ea }
            goto L_0x0318
        L_0x0317:
            r10 = r3
        L_0x0318:
            java.lang.String r11 = "refValue"
            boolean r11 = r7.has(r11)     // Catch:{ JSONException -> 0x03ea }
            if (r11 == 0) goto L_0x032e
            java.lang.String r11 = "refValue"
            boolean r11 = r7.isNull(r11)     // Catch:{ JSONException -> 0x03ea }
            if (r11 != 0) goto L_0x032e
            java.lang.String r8 = "refValue"
            java.lang.String r8 = r7.getString(r8)     // Catch:{ JSONException -> 0x03ea }
        L_0x032e:
            java.lang.String r11 = "refLabel"
            boolean r11 = r7.has(r11)     // Catch:{ JSONException -> 0x03ea }
            if (r11 == 0) goto L_0x0344
            java.lang.String r11 = "refLabel"
            boolean r11 = r7.isNull(r11)     // Catch:{ JSONException -> 0x03ea }
            if (r11 != 0) goto L_0x0344
            java.lang.String r9 = "refLabel"
            java.lang.String r9 = r7.getString(r9)     // Catch:{ JSONException -> 0x03ea }
        L_0x0344:
            com.seattleclouds.modules.feedback.Field r7 = r6.f20006l     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r7 = r7.f19978m     // Catch:{ JSONException -> 0x03ea }
            if (r7 == 0) goto L_0x0358
            com.seattleclouds.modules.feedback.Field r7 = r6.f20006l     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r7 = r7.f19978m     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r11 = ""
            boolean r7 = r7.equalsIgnoreCase(r11)     // Catch:{ JSONException -> 0x03ea }
            if (r7 != 0) goto L_0x0358
            r7 = 1
            goto L_0x0359
        L_0x0358:
            r7 = 0
        L_0x0359:
            if (r8 == 0) goto L_0x0365
            java.lang.String r11 = ""
            boolean r11 = r8.equalsIgnoreCase(r11)     // Catch:{ JSONException -> 0x03ea }
            if (r11 != 0) goto L_0x0365
            r11 = 1
            goto L_0x0366
        L_0x0365:
            r11 = 0
        L_0x0366:
            if (r7 == 0) goto L_0x048a
            if (r11 == 0) goto L_0x048a
            r7 = 0
        L_0x036b:
            int r11 = r2.getChildCount()     // Catch:{ JSONException -> 0x03ea }
            if (r7 >= r11) goto L_0x039d
            android.view.View r11 = r2.getChildAt(r7)     // Catch:{ JSONException -> 0x03ea }
            boolean r11 = r11 instanceof com.seattleclouds.modules.feedback.PickerView     // Catch:{ JSONException -> 0x03ea }
            if (r11 == 0) goto L_0x039a
            android.view.View r11 = r2.getChildAt(r7)     // Catch:{ JSONException -> 0x03ea }
            com.seattleclouds.modules.feedback.PickerView r11 = (com.seattleclouds.modules.feedback.PickerView) r11     // Catch:{ JSONException -> 0x03ea }
            com.seattleclouds.modules.feedback.Field r11 = r11.f20006l     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r12 = r11.f19977l     // Catch:{ JSONException -> 0x03ea }
            if (r12 == 0) goto L_0x039a
            java.lang.String r12 = r11.f19977l     // Catch:{ JSONException -> 0x03ea }
            com.seattleclouds.modules.feedback.Field r13 = r6.f20006l     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r13 = r13.f19966a     // Catch:{ JSONException -> 0x03ea }
            boolean r12 = r12.equalsIgnoreCase(r13)     // Catch:{ JSONException -> 0x03ea }
            if (r12 == 0) goto L_0x039a
            java.lang.String r12 = r11.f19968c     // Catch:{ JSONException -> 0x03ea }
            boolean r12 = r12.equalsIgnoreCase(r9)     // Catch:{ JSONException -> 0x03ea }
            if (r12 == 0) goto L_0x039a
            goto L_0x039e
        L_0x039a:
            int r7 = r7 + 1
            goto L_0x036b
        L_0x039d:
            r11 = r3
        L_0x039e:
            if (r11 == 0) goto L_0x048a
            java.util.List r7 = r11.mo18170e()     // Catch:{ JSONException -> 0x03ea }
            if (r7 == 0) goto L_0x048a
            boolean r7 = r7.contains(r8)     // Catch:{ JSONException -> 0x03ea }
            if (r7 == 0) goto L_0x048a
            com.seattleclouds.modules.feedback.Field r7 = r6.f20006l     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r7 = r7.f19978m     // Catch:{ JSONException -> 0x03ea }
            boolean r7 = r8.equalsIgnoreCase(r7)     // Catch:{ JSONException -> 0x03ea }
            if (r7 == 0) goto L_0x048a
            com.seattleclouds.modules.feedback.Field r7 = r6.f20006l     // Catch:{ JSONException -> 0x03ea }
            java.util.Map r7 = r7.mo18176h()     // Catch:{ JSONException -> 0x03ea }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ JSONException -> 0x03ea }
            java.util.List r7 = (java.util.List) r7     // Catch:{ JSONException -> 0x03ea }
            if (r7 == 0) goto L_0x048a
            if (r10 == 0) goto L_0x048a
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ JSONException -> 0x03ea }
            r8.<init>()     // Catch:{ JSONException -> 0x03ea }
            int r9 = r10.length     // Catch:{ JSONException -> 0x03ea }
            r11 = 0
        L_0x03cd:
            if (r11 >= r9) goto L_0x03dd
            r12 = r10[r11]     // Catch:{ JSONException -> 0x03ea }
            boolean r13 = r7.contains(r12)     // Catch:{ JSONException -> 0x03ea }
            if (r13 == 0) goto L_0x03da
            r8.add(r12)     // Catch:{ JSONException -> 0x03ea }
        L_0x03da:
            int r11 = r11 + 1
            goto L_0x03cd
        L_0x03dd:
            android.widget.EditText r7 = r6.f19996b     // Catch:{ JSONException -> 0x03ea }
            java.lang.String r9 = ", "
            java.lang.String r8 = android.text.TextUtils.join(r9, r8)     // Catch:{ JSONException -> 0x03ea }
            r7.setText(r8)     // Catch:{ JSONException -> 0x03ea }
            goto L_0x048a
        L_0x03ea:
            java.lang.String r7 = "FeedbackActivity"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            goto L_0x0472
        L_0x03f3:
            org.json.JSONObject r7 = r14.f20035aD
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "{}"
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 != 0) goto L_0x048a
            org.json.JSONObject r7 = r14.f20035aD
            com.seattleclouds.modules.feedback.Field r8 = r6.f20006l
            java.lang.String r8 = r8.f19968c
            boolean r7 = r7.has(r8)
            if (r7 == 0) goto L_0x048a
            org.json.JSONObject r7 = r14.f20035aD
            com.seattleclouds.modules.feedback.Field r8 = r6.f20006l
            java.lang.String r8 = r8.f19968c
            boolean r7 = r7.isNull(r8)
            if (r7 != 0) goto L_0x048a
            org.json.JSONObject r7 = r14.f20035aD     // Catch:{ JSONException -> 0x046b }
            com.seattleclouds.modules.feedback.Field r8 = r6.f20006l     // Catch:{ JSONException -> 0x046b }
            java.lang.String r8 = r8.f19968c     // Catch:{ JSONException -> 0x046b }
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch:{ JSONException -> 0x046b }
            java.lang.String r8 = "itemLValue"
            boolean r8 = r7.isNull(r8)     // Catch:{ JSONException -> 0x046b }
            if (r8 != 0) goto L_0x0432
            java.lang.String r8 = "itemLValue"
            java.lang.String r7 = r7.getString(r8)     // Catch:{ JSONException -> 0x046b }
            goto L_0x0433
        L_0x0432:
            r7 = r3
        L_0x0433:
            com.seattleclouds.modules.feedback.Field r8 = r6.f20006l     // Catch:{ JSONException -> 0x046b }
            java.util.List<java.lang.String> r8 = r8.f19971f     // Catch:{ JSONException -> 0x046b }
            boolean r8 = r8.contains(r7)     // Catch:{ JSONException -> 0x046b }
            if (r8 == 0) goto L_0x048a
            android.widget.EditText r8 = r6.f19996b     // Catch:{ JSONException -> 0x046b }
            r8.setText(r7)     // Catch:{ JSONException -> 0x046b }
            r8 = 0
        L_0x0443:
            int r9 = r2.getChildCount()     // Catch:{ JSONException -> 0x046b }
            if (r8 >= r9) goto L_0x048a
            android.view.View r9 = r2.getChildAt(r8)     // Catch:{ JSONException -> 0x046b }
            boolean r9 = r9 instanceof com.seattleclouds.modules.feedback.PickerView     // Catch:{ JSONException -> 0x046b }
            if (r9 == 0) goto L_0x0468
            android.view.View r9 = r2.getChildAt(r8)     // Catch:{ JSONException -> 0x046b }
            com.seattleclouds.modules.feedback.PickerView r9 = (com.seattleclouds.modules.feedback.PickerView) r9     // Catch:{ JSONException -> 0x046b }
            com.seattleclouds.modules.feedback.Field r10 = r9.f20006l     // Catch:{ JSONException -> 0x046b }
            java.lang.String r10 = r10.f19967b     // Catch:{ JSONException -> 0x046b }
            java.lang.String r11 = "multilist"
            boolean r10 = r10.equalsIgnoreCase(r11)     // Catch:{ JSONException -> 0x046b }
            if (r10 == 0) goto L_0x0468
            com.seattleclouds.modules.feedback.Field r8 = r9.f20006l     // Catch:{ JSONException -> 0x046b }
            r8.f19978m = r7     // Catch:{ JSONException -> 0x046b }
            goto L_0x048a
        L_0x0468:
            int r8 = r8 + 1
            goto L_0x0443
        L_0x046b:
            java.lang.String r7 = "FeedbackActivity"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
        L_0x0472:
            java.lang.String r9 = " JSON : "
            r8.append(r9)
            com.seattleclouds.modules.feedback.Field r6 = r6.f20006l
            java.lang.String r6 = r6.f19968c
            r8.append(r6)
            java.lang.String r6 = " no such mapping"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.d(r7, r6)
        L_0x048a:
            int r5 = r5 + 1
            goto L_0x02ab
        L_0x048e:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0492:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.feedback.C5633a.m27958as():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m27959at() {
        /*
            r12 = this;
            org.json.JSONObject r0 = r12.f20078ay
            if (r0 != 0) goto L_0x000b
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r12.f20078ay = r0
        L_0x000b:
            r0 = 0
            r1 = 0
        L_0x000d:
            android.widget.LinearLayout r2 = r12.f20073at
            int r2 = r2.getChildCount()
            if (r1 >= r2) goto L_0x0204
            android.widget.LinearLayout r2 = r12.f20073at
            android.view.View r2 = r2.getChildAt(r1)
            boolean r2 = r2 instanceof com.seattleclouds.modules.feedback.PickerView
            if (r2 == 0) goto L_0x011b
            android.widget.LinearLayout r2 = r12.f20073at
            android.view.View r2 = r2.getChildAt(r1)
            com.seattleclouds.modules.feedback.PickerView r2 = (com.seattleclouds.modules.feedback.PickerView) r2
            int r3 = r2.f20005k
            r4 = 11
            if (r3 == r4) goto L_0x00ff
            r4 = 16
            if (r3 == r4) goto L_0x00df
            switch(r3) {
                case 5: goto L_0x00bb;
                case 6: goto L_0x009f;
                case 7: goto L_0x006e;
                case 8: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0200
        L_0x0036:
            com.seattleclouds.modules.feedback.Field r3 = r2.f20006l
            java.lang.String r3 = r3.f19968c
            if (r3 == 0) goto L_0x0200
            android.widget.EditText r3 = r2.f19996b     // Catch:{ JSONException -> 0x0069 }
            android.text.Editable r3 = r3.getText()     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r3 = r3.toString()     // Catch:{ JSONException -> 0x0069 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0069 }
            r4.<init>()     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r5 = "refLabel"
            java.lang.String r6 = ""
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r5 = "refValue"
            java.lang.String r6 = ""
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r5 = "itemMLValue"
            r4.put(r5, r3)     // Catch:{ JSONException -> 0x0069 }
            org.json.JSONObject r3 = r12.f20036aE     // Catch:{ JSONException -> 0x0069 }
            com.seattleclouds.modules.feedback.Field r2 = r2.f20006l     // Catch:{ JSONException -> 0x0069 }
            java.lang.String r2 = r2.f19968c     // Catch:{ JSONException -> 0x0069 }
            r3.put(r2, r4)     // Catch:{ JSONException -> 0x0069 }
            goto L_0x0200
        L_0x0069:
            java.lang.String r2 = "FeedbackActivity"
            java.lang.String r3 = " JSON : save error"
            goto L_0x00da
        L_0x006e:
            com.seattleclouds.modules.feedback.Field r3 = r2.f20006l
            java.lang.String r3 = r3.f19968c
            if (r3 == 0) goto L_0x0200
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
            r3.<init>()     // Catch:{ JSONException -> 0x009a }
            java.lang.String r4 = "refID"
            java.lang.String r5 = ""
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r4 = "itemLValue"
            android.widget.EditText r5 = r2.f19996b     // Catch:{ JSONException -> 0x009a }
            android.text.Editable r5 = r5.getText()     // Catch:{ JSONException -> 0x009a }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x009a }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x009a }
            org.json.JSONObject r4 = r12.f20035aD     // Catch:{ JSONException -> 0x009a }
            com.seattleclouds.modules.feedback.Field r2 = r2.f20006l     // Catch:{ JSONException -> 0x009a }
            java.lang.String r2 = r2.f19968c     // Catch:{ JSONException -> 0x009a }
            r4.put(r2, r3)     // Catch:{ JSONException -> 0x009a }
            goto L_0x0200
        L_0x009a:
            java.lang.String r2 = "FeedbackActivity"
            java.lang.String r3 = " JSON : list save error"
            goto L_0x00da
        L_0x009f:
            com.seattleclouds.modules.feedback.Field r3 = r2.f20006l
            java.lang.String r3 = r3.f19968c
            if (r3 == 0) goto L_0x0200
            org.json.JSONObject r3 = r12.f20034aC     // Catch:{ JSONException -> 0x00b6 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x00b6 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x00b6 }
            android.widget.EditText r2 = r2.f19996b     // Catch:{ JSONException -> 0x00b6 }
            android.text.Editable r2 = r2.getText()     // Catch:{ JSONException -> 0x00b6 }
            r3.put(r4, r2)     // Catch:{ JSONException -> 0x00b6 }
            goto L_0x0200
        L_0x00b6:
            java.lang.String r2 = "FeedbackActivity"
            java.lang.String r3 = " JSON : email save error"
            goto L_0x00da
        L_0x00bb:
            com.seattleclouds.modules.feedback.Field r3 = r2.f20006l
            java.lang.String r3 = r3.f19968c
            if (r3 == 0) goto L_0x0200
            org.json.JSONObject r3 = r12.f20079az     // Catch:{ JSONException -> 0x00d6 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x00d6 }
            android.widget.EditText r2 = r2.f19996b     // Catch:{ JSONException -> 0x00d6 }
            android.text.Editable r2 = r2.getText()     // Catch:{ JSONException -> 0x00d6 }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x00d6 }
            r3.put(r4, r2)     // Catch:{ JSONException -> 0x00d6 }
            goto L_0x0200
        L_0x00d6:
            java.lang.String r2 = "FeedbackActivity"
            java.lang.String r3 = " JSON :  text save error"
        L_0x00da:
            android.util.Log.e(r2, r3)
            goto L_0x0200
        L_0x00df:
            com.seattleclouds.modules.feedback.Field r3 = r2.f20006l
            java.lang.String r3 = r3.f19968c
            if (r3 == 0) goto L_0x0200
            org.json.JSONObject r3 = r12.f20032aA     // Catch:{ JSONException -> 0x00fa }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x00fa }
            android.widget.EditText r2 = r2.f19996b     // Catch:{ JSONException -> 0x00fa }
            android.text.Editable r2 = r2.getText()     // Catch:{ JSONException -> 0x00fa }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x00fa }
            r3.put(r4, r2)     // Catch:{ JSONException -> 0x00fa }
            goto L_0x0200
        L_0x00fa:
            java.lang.String r2 = "FeedbackActivity"
            java.lang.String r3 = " JSON : number save error"
            goto L_0x00da
        L_0x00ff:
            com.seattleclouds.modules.feedback.Field r3 = r2.f20006l
            java.lang.String r3 = r3.f19968c
            if (r3 == 0) goto L_0x0200
            org.json.JSONObject r3 = r12.f20033aB     // Catch:{ JSONException -> 0x0116 }
            com.seattleclouds.modules.feedback.Field r4 = r2.f20006l     // Catch:{ JSONException -> 0x0116 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x0116 }
            android.widget.EditText r2 = r2.f19996b     // Catch:{ JSONException -> 0x0116 }
            android.text.Editable r2 = r2.getText()     // Catch:{ JSONException -> 0x0116 }
            r3.put(r4, r2)     // Catch:{ JSONException -> 0x0116 }
            goto L_0x0200
        L_0x0116:
            java.lang.String r2 = "FeedbackActivity"
            java.lang.String r3 = " JSON :  multilinetext save error"
            goto L_0x00da
        L_0x011b:
            android.widget.LinearLayout r2 = r12.f20073at
            android.view.View r2 = r2.getChildAt(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.Class<android.widget.LinearLayout> r3 = android.widget.LinearLayout.class
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0200
            android.widget.LinearLayout r2 = r12.f20073at
            android.view.View r2 = r2.getChildAt(r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 0
        L_0x0136:
            int r4 = r2.getChildCount()
            if (r3 >= r4) goto L_0x0200
            android.view.View r4 = r2.getChildAt(r3)
            boolean r4 = r4 instanceof com.seattleclouds.modules.feedback.PickerView
            if (r4 == 0) goto L_0x01fc
            android.view.View r4 = r2.getChildAt(r3)
            com.seattleclouds.modules.feedback.PickerView r4 = (com.seattleclouds.modules.feedback.PickerView) r4
            int r5 = r4.f20005k
            switch(r5) {
                case 7: goto L_0x01c3;
                case 8: goto L_0x0151;
                default: goto L_0x014f;
            }
        L_0x014f:
            goto L_0x01fc
        L_0x0151:
            com.seattleclouds.modules.feedback.Field r5 = r4.f20006l
            java.lang.String r5 = r5.f19968c
            if (r5 == 0) goto L_0x01fc
            java.lang.String r5 = ""
            com.seattleclouds.modules.feedback.Field r6 = r4.f20006l     // Catch:{ JSONException -> 0x01be }
            java.lang.String r6 = r6.f19978m     // Catch:{ JSONException -> 0x01be }
            android.widget.EditText r7 = r4.f19996b     // Catch:{ JSONException -> 0x01be }
            android.text.Editable r7 = r7.getText()     // Catch:{ JSONException -> 0x01be }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x01be }
            com.seattleclouds.modules.feedback.Field r8 = r4.f20006l     // Catch:{ JSONException -> 0x01be }
            java.lang.String r8 = r8.f19966a     // Catch:{ JSONException -> 0x01be }
            if (r6 == 0) goto L_0x019e
            java.lang.String r9 = ""
            boolean r9 = r6.equalsIgnoreCase(r9)     // Catch:{ JSONException -> 0x01be }
            if (r9 != 0) goto L_0x019e
            r9 = 0
        L_0x0176:
            int r10 = r2.getChildCount()     // Catch:{ JSONException -> 0x01be }
            if (r9 >= r10) goto L_0x01a0
            android.view.View r10 = r2.getChildAt(r9)     // Catch:{ JSONException -> 0x01be }
            boolean r10 = r10 instanceof com.seattleclouds.modules.feedback.PickerView     // Catch:{ JSONException -> 0x01be }
            if (r10 == 0) goto L_0x019b
            android.view.View r10 = r2.getChildAt(r9)     // Catch:{ JSONException -> 0x01be }
            com.seattleclouds.modules.feedback.PickerView r10 = (com.seattleclouds.modules.feedback.PickerView) r10     // Catch:{ JSONException -> 0x01be }
            com.seattleclouds.modules.feedback.Field r10 = r10.f20006l     // Catch:{ JSONException -> 0x01be }
            java.lang.String r11 = r10.f19977l     // Catch:{ JSONException -> 0x01be }
            if (r11 == 0) goto L_0x019b
            java.lang.String r11 = r10.f19977l     // Catch:{ JSONException -> 0x01be }
            boolean r11 = r11.equalsIgnoreCase(r8)     // Catch:{ JSONException -> 0x01be }
            if (r11 == 0) goto L_0x019b
            java.lang.String r5 = r10.f19968c     // Catch:{ JSONException -> 0x01be }
            goto L_0x01a0
        L_0x019b:
            int r9 = r9 + 1
            goto L_0x0176
        L_0x019e:
            java.lang.String r6 = ""
        L_0x01a0:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01be }
            r8.<init>()     // Catch:{ JSONException -> 0x01be }
            java.lang.String r9 = "refLabel"
            r8.put(r9, r5)     // Catch:{ JSONException -> 0x01be }
            java.lang.String r5 = "refValue"
            r8.put(r5, r6)     // Catch:{ JSONException -> 0x01be }
            java.lang.String r5 = "itemMLValue"
            r8.put(r5, r7)     // Catch:{ JSONException -> 0x01be }
            org.json.JSONObject r5 = r12.f20036aE     // Catch:{ JSONException -> 0x01be }
            com.seattleclouds.modules.feedback.Field r4 = r4.f20006l     // Catch:{ JSONException -> 0x01be }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x01be }
            r5.put(r4, r8)     // Catch:{ JSONException -> 0x01be }
            goto L_0x01fc
        L_0x01be:
            java.lang.String r4 = "FeedbackActivity"
            java.lang.String r5 = " JSON : save error"
            goto L_0x01f9
        L_0x01c3:
            com.seattleclouds.modules.feedback.Field r5 = r4.f20006l
            java.lang.String r5 = r5.f19968c
            if (r5 == 0) goto L_0x01fc
            com.seattleclouds.modules.feedback.Field r5 = r4.f20006l     // Catch:{ JSONException -> 0x01f5 }
            java.lang.String r5 = r5.f19977l     // Catch:{ JSONException -> 0x01f5 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01f5 }
            r6.<init>()     // Catch:{ JSONException -> 0x01f5 }
            java.lang.String r7 = "refID"
            if (r5 == 0) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            java.lang.String r5 = ""
        L_0x01d9:
            r6.put(r7, r5)     // Catch:{ JSONException -> 0x01f5 }
            java.lang.String r5 = "itemLValue"
            android.widget.EditText r7 = r4.f19996b     // Catch:{ JSONException -> 0x01f5 }
            android.text.Editable r7 = r7.getText()     // Catch:{ JSONException -> 0x01f5 }
            java.lang.String r7 = r7.toString()     // Catch:{ JSONException -> 0x01f5 }
            r6.put(r5, r7)     // Catch:{ JSONException -> 0x01f5 }
            org.json.JSONObject r5 = r12.f20035aD     // Catch:{ JSONException -> 0x01f5 }
            com.seattleclouds.modules.feedback.Field r4 = r4.f20006l     // Catch:{ JSONException -> 0x01f5 }
            java.lang.String r4 = r4.f19968c     // Catch:{ JSONException -> 0x01f5 }
            r5.put(r4, r6)     // Catch:{ JSONException -> 0x01f5 }
            goto L_0x01fc
        L_0x01f5:
            java.lang.String r4 = "FeedbackActivity"
            java.lang.String r5 = " list save error"
        L_0x01f9:
            android.util.Log.e(r4, r5)
        L_0x01fc:
            int r3 = r3 + 1
            goto L_0x0136
        L_0x0200:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0204:
            org.json.JSONObject r0 = r12.f20034aC     // Catch:{ JSONException -> 0x0212 }
            if (r0 == 0) goto L_0x0219
            org.json.JSONObject r0 = r12.f20078ay     // Catch:{ JSONException -> 0x0212 }
            java.lang.String r1 = "email"
            org.json.JSONObject r2 = r12.f20034aC     // Catch:{ JSONException -> 0x0212 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0212 }
            goto L_0x0219
        L_0x0212:
            java.lang.String r0 = "FeedbackActivity"
            java.lang.String r1 = " JSON email: save error"
            android.util.Log.e(r0, r1)
        L_0x0219:
            org.json.JSONObject r0 = r12.f20079az     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x022e
            org.json.JSONObject r0 = r12.f20078ay     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r1 = "text"
            org.json.JSONObject r2 = r12.f20079az     // Catch:{ JSONException -> 0x0227 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0227 }
            goto L_0x022e
        L_0x0227:
            java.lang.String r0 = "FeedbackActivity"
            java.lang.String r1 = " JSON text: save error"
            android.util.Log.e(r0, r1)
        L_0x022e:
            org.json.JSONObject r0 = r12.f20032aA     // Catch:{ JSONException -> 0x023c }
            if (r0 == 0) goto L_0x0243
            org.json.JSONObject r0 = r12.f20078ay     // Catch:{ JSONException -> 0x023c }
            java.lang.String r1 = "number"
            org.json.JSONObject r2 = r12.f20032aA     // Catch:{ JSONException -> 0x023c }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x023c }
            goto L_0x0243
        L_0x023c:
            java.lang.String r0 = "FeedbackActivity"
            java.lang.String r1 = " JSON number: save error"
            android.util.Log.e(r0, r1)
        L_0x0243:
            org.json.JSONObject r0 = r12.f20033aB     // Catch:{ JSONException -> 0x0251 }
            if (r0 == 0) goto L_0x0258
            org.json.JSONObject r0 = r12.f20078ay     // Catch:{ JSONException -> 0x0251 }
            java.lang.String r1 = "multilinetext"
            org.json.JSONObject r2 = r12.f20033aB     // Catch:{ JSONException -> 0x0251 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0251 }
            goto L_0x0258
        L_0x0251:
            java.lang.String r0 = "FeedbackActivity"
            java.lang.String r1 = " JSON multilinetext:  save error"
            android.util.Log.e(r0, r1)
        L_0x0258:
            org.json.JSONObject r0 = r12.f20035aD     // Catch:{ JSONException -> 0x0266 }
            if (r0 == 0) goto L_0x026d
            org.json.JSONObject r0 = r12.f20078ay     // Catch:{ JSONException -> 0x0266 }
            java.lang.String r1 = "list"
            org.json.JSONObject r2 = r12.f20035aD     // Catch:{ JSONException -> 0x0266 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0266 }
            goto L_0x026d
        L_0x0266:
            java.lang.String r0 = "FeedbackActivity"
            java.lang.String r1 = " JSON list: save error"
            android.util.Log.e(r0, r1)
        L_0x026d:
            org.json.JSONObject r0 = r12.f20036aE     // Catch:{ JSONException -> 0x027b }
            if (r0 == 0) goto L_0x0282
            org.json.JSONObject r0 = r12.f20078ay     // Catch:{ JSONException -> 0x027b }
            java.lang.String r1 = "multilist"
            org.json.JSONObject r2 = r12.f20036aE     // Catch:{ JSONException -> 0x027b }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x027b }
            goto L_0x0282
        L_0x027b:
            java.lang.String r0 = "FeedbackActivity"
            java.lang.String r1 = " JSON multilist: save error"
            android.util.Log.e(r0, r1)
        L_0x0282:
            org.json.JSONObject r0 = r12.f20078ay
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences r1 = r12.f20037aF
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "jsonSavedData_AutoFill"
            r1.putString(r2, r0)
            r1.apply()
            boolean r1 = r12.f20071ar
            if (r1 == 0) goto L_0x02c2
            java.lang.String r1 = r12.f20062ai
            if (r1 == 0) goto L_0x02c2
            java.lang.String r1 = r12.f20062ai
            java.lang.String r2 = ""
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L_0x02c2
            java.lang.String r1 = ""
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x02c2
            java.lang.String r1 = "{}"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x02c2
            android.support.v4.app.h r0 = r12.mo1318s()
            r1 = 0
            java.lang.String r2 = r12.f20062ai
            com.seattleclouds.util.C6620n.m32034a(r0, r1, r2)
        L_0x02c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.feedback.C5633a.m27959at():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m27960az() {
        BasicNameValuePair basicNameValuePair;
        for (int i = 0; i < this.f20073at.getChildCount(); i++) {
            if (this.f20073at.getChildAt(i) instanceof PickerView) {
                PickerView pickerView = (PickerView) this.f20073at.getChildAt(i);
                if (!pickerView.mo18192a()) {
                    C6620n.m32034a((Context) mo1318s(), "Error", pickerView.getRequirementMessage());
                    return;
                }
            }
        }
        ArrayList arrayList = new ArrayList(4);
        for (int i2 = 0; i2 < this.f20060ag.size(); i2++) {
            if (i2 == 0) {
                basicNameValuePair = new BasicNameValuePair("sendtoaddress", (String) this.f20060ag.get(i2));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("sendtoaddress");
                sb.append(i2);
                basicNameValuePair = new BasicNameValuePair(sb.toString(), (String) this.f20060ag.get(i2));
            }
            arrayList.add(basicNameValuePair);
        }
        arrayList.add(new BasicNameValuePair("publisherid", App.f18522x));
        arrayList.add(new BasicNameValuePair("username", App.f18523y));
        arrayList.add(new BasicNameValuePair("appid", App.f18524z));
        arrayList.add(new BasicNameValuePair("pageid", this.f20059af));
        int i3 = 0;
        while (i3 < this.f20073at.getChildCount()) {
            try {
                if (this.f20073at.getChildAt(i3) instanceof PickerView) {
                    arrayList.add(m27939a((PickerView) this.f20073at.getChildAt(i3)));
                } else if (this.f20073at.getChildAt(i3).getClass().equals(LinearLayout.class)) {
                    LinearLayout linearLayout = (LinearLayout) this.f20073at.getChildAt(i3);
                    for (int i4 = 0; i4 < linearLayout.getChildCount(); i4++) {
                        if (linearLayout.getChildAt(i4) instanceof PickerView) {
                            arrayList.add(m27939a((PickerView) linearLayout.getChildAt(i4)));
                        }
                    }
                }
                i3++;
            } catch (FileNotFoundException | UnsupportedEncodingException unused) {
            } catch (IOException unused2) {
                C0367h s = mo1318s();
                Toast.makeText(s, !C6619m.m32026h(s) ? C5462k.common_no_network : C5462k.common_network_error, 1).show();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http://");
        sb2.append(App.f18516r);
        sb2.append("/sendnativeform.ashx");
        HttpPost httpPost = new HttpPost(sb2.toString());
        httpPost.setEntity(new UrlEncodedFormEntity(arrayList, "UTF-8"));
        m27951aB();
        C6567c.m31787a(httpPost, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m27962b(final Location location) {
        if (this.f20040aI == null) {
            this.f20040aI = new C5395a(mo1318s(), new C6608d() {
                /* renamed from: a */
                public void mo16855a(Object obj) {
                    if (obj != null && (obj instanceof String)) {
                        C5633a.this.m27943a((String) obj, location);
                    } else if (obj != null && (obj instanceof C5416a)) {
                        C5633a.this.f20082bc = (C5416a) obj;
                        C5633a.this.m27943a(C5416a.m27096a(), location);
                    } else {
                        return;
                    }
                    C5633a.this.f20047aP = C5633a.this.f20039aH.getLatitude();
                    C5633a.this.f20048aQ = C5633a.this.f20039aH.getLongitude();
                }
            });
        }
        this.f20040aI.mo17704a(location, true);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01b8, code lost:
        if (r10.getClass().equals(java.lang.String.class) != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01fd, code lost:
        if (r10.getClass().equals(java.lang.String.class) != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x022c, code lost:
        if (r10.getClass().equals(java.lang.String.class) != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x025d, code lost:
        if (r10.getClass().equals(java.lang.String.class) != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x028e, code lost:
        if (r10.getClass().equals(java.lang.String.class) != false) goto L_0x01ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0549  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m27967c() {
        /*
            r13 = this;
            android.widget.LinearLayout r0 = r13.f20073at
            r0.removeAllViews()
            r13.m27954aE()
            java.util.ArrayList<com.seattleclouds.modules.feedback.Field> r0 = r13.f20087f
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x0010:
            boolean r3 = r0.hasNext()
            r4 = 7
            r5 = 11
            r6 = 13
            r7 = 5
            r8 = 2
            r9 = 1
            if (r3 == 0) goto L_0x04de
            java.lang.Object r3 = r0.next()
            com.seattleclouds.modules.feedback.Field r3 = (com.seattleclouds.modules.feedback.Field) r3
            org.json.JSONObject r10 = r13.f20077ax
            java.lang.String r11 = r3.mo18172f()
            java.lang.Object r10 = com.seattleclouds.mbfx.C5467a.m27252a(r10, r11)
            java.lang.String r11 = r3.f19967b
            java.lang.String r12 = "date"
            boolean r11 = r11.equalsIgnoreCase(r12)
            if (r11 == 0) goto L_0x00ac
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r4.<init>(r5, r3, r1)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r11 = r2.get(r9)
            r6.append(r11)
            java.lang.String r11 = "-"
            r6.append(r11)
            int r7 = r2.get(r7)
            r6.append(r7)
            java.lang.String r7 = "-"
            r6.append(r7)
            int r2 = r2.get(r8)
            int r2 = r2 + r9
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.widget.EditText r6 = r4.f19996b
            if (r10 == 0) goto L_0x008c
            java.lang.Class r7 = r10.getClass()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008c
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
        L_0x008c:
            r6.setText(r2)
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r6 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r6)
            java.lang.String r2 = r3.f19976k
            r4.f20011q = r2
            android.widget.Button r2 = r4.f19998d
            com.seattleclouds.modules.feedback.a$12 r3 = new com.seattleclouds.modules.feedback.a$12
            r3.<init>(r4)
        L_0x00a1:
            r2.setOnClickListener(r3)
        L_0x00a4:
            android.widget.LinearLayout r2 = r13.f20073at
            r2.addView(r4)
        L_0x00a9:
            r2 = r5
            goto L_0x0010
        L_0x00ac:
            java.lang.String r11 = r3.f19967b
            java.lang.String r12 = "time"
            boolean r11 = r11.equalsIgnoreCase(r12)
            if (r11 == 0) goto L_0x0107
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r4.<init>(r5, r3, r9)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            android.widget.EditText r6 = r4.f19996b
            if (r10 == 0) goto L_0x00e1
            java.lang.Class r7 = r10.getClass()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00e1
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x00f1
        L_0x00e1:
            android.support.v4.app.h r7 = r13.mo1318s()
            java.text.DateFormat r7 = android.text.format.DateFormat.getTimeFormat(r7)
            java.util.Date r2 = r2.getTime()
            java.lang.String r10 = r7.format(r2)
        L_0x00f1:
            r6.setText(r10)
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r6 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r6)
            java.lang.String r2 = r3.f19976k
            r4.f20011q = r2
            android.widget.Button r2 = r4.f19998d
            com.seattleclouds.modules.feedback.a$20 r3 = new com.seattleclouds.modules.feedback.a$20
            r3.<init>(r4)
            goto L_0x00a1
        L_0x0107:
            java.lang.String r11 = r3.f19967b
            java.lang.String r12 = "saveoption"
            boolean r11 = r11.equalsIgnoreCase(r12)
            if (r11 == 0) goto L_0x012e
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r4.<init>(r5, r3, r6)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r3 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r3)
            goto L_0x00a4
        L_0x012e:
            java.lang.String r6 = r3.f19967b
            java.lang.String r11 = "location"
            boolean r6 = r6.equalsIgnoreCase(r11)
            r11 = 8
            if (r6 == 0) goto L_0x018c
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r4.<init>(r5, r3, r8)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.EditText r2 = r4.f19996b
            if (r10 == 0) goto L_0x0161
            java.lang.Class r6 = r10.getClass()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0161
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0163
        L_0x0161:
            java.lang.String r10 = ""
        L_0x0163:
            r2.setText(r10)
            android.widget.EditText r2 = r4.f19996b
            android.text.TextWatcher r6 = r13.m27957aH()
            r2.addTextChangedListener(r6)
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r6 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r6)
            java.lang.String r2 = r3.f19976k
            r4.f20011q = r2
            boolean r2 = r13.f20069ap
            if (r2 != 0) goto L_0x0183
            android.widget.Button r2 = r4.f19998d
            r2.setVisibility(r11)
        L_0x0183:
            android.widget.Button r2 = r4.f19998d
            com.seattleclouds.modules.feedback.a$21 r3 = new com.seattleclouds.modules.feedback.a$21
            r3.<init>(r4)
            goto L_0x00a1
        L_0x018c:
            java.lang.String r6 = r3.f19967b
            java.lang.String r8 = "text"
            boolean r6 = r6.equalsIgnoreCase(r8)
            if (r6 == 0) goto L_0x01cf
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r4.<init>(r5, r3, r7)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.EditText r2 = r4.f19996b
            if (r10 == 0) goto L_0x01bd
            java.lang.Class r6 = r10.getClass()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01bd
        L_0x01ba:
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x01bf
        L_0x01bd:
            java.lang.String r10 = ""
        L_0x01bf:
            r2.setText(r10)
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r6 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r6)
            java.lang.String r2 = r3.f19976k
            r4.f20011q = r2
            goto L_0x00a4
        L_0x01cf:
            java.lang.String r6 = r3.f19967b
            java.lang.String r7 = "number"
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0200
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r6 = 16
            r4.<init>(r5, r3, r6)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.EditText r2 = r4.f19996b
            if (r10 == 0) goto L_0x01bd
            java.lang.Class r6 = r10.getClass()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01bd
            goto L_0x01ba
        L_0x0200:
            java.lang.String r6 = r3.f19967b
            java.lang.String r7 = "multilinetext"
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x022f
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r6 = r13.mo1318s()
            r4.<init>(r6, r3, r5)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.EditText r2 = r4.f19996b
            if (r10 == 0) goto L_0x01bd
            java.lang.Class r6 = r10.getClass()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01bd
            goto L_0x01ba
        L_0x022f:
            java.lang.String r5 = r3.f19967b
            java.lang.String r6 = "label"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0261
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r6 = 10
            r4.<init>(r5, r3, r6)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.EditText r2 = r4.f19996b
            if (r10 == 0) goto L_0x01bd
            java.lang.Class r6 = r10.getClass()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01bd
            goto L_0x01ba
        L_0x0261:
            java.lang.String r5 = r3.f19967b
            java.lang.String r6 = "email"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0292
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r6 = 6
            r4.<init>(r5, r3, r6)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.EditText r2 = r4.f19996b
            if (r10 == 0) goto L_0x01bd
            java.lang.Class r6 = r10.getClass()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01bd
            goto L_0x01ba
        L_0x0292:
            java.lang.String r5 = r3.f19967b
            java.lang.String r6 = "image"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x02c9
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r6 = 3
            r4.<init>(r5, r3, r6)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r6 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r6)
            java.lang.String r2 = r3.f19974i
            java.lang.String r2 = com.seattleclouds.mbfx.C5467a.m27253a(r2)
            r4.f20010p = r2
            android.widget.Button r2 = r4.f19998d
            com.seattleclouds.modules.feedback.a$22 r3 = new com.seattleclouds.modules.feedback.a$22
            r3.<init>(r4)
            goto L_0x00a1
        L_0x02c9:
            java.lang.String r5 = r3.f19967b
            java.lang.String r6 = "camera"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0300
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r6 = 4
            r4.<init>(r5, r3, r6)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            java.lang.String r2 = r3.f19974i
            java.lang.String r2 = com.seattleclouds.mbfx.C5467a.m27253a(r2)
            r4.f20010p = r2
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r3 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r3)
            android.widget.Button r2 = r4.f19998d
            com.seattleclouds.modules.feedback.a$23 r3 = new com.seattleclouds.modules.feedback.a$23
            r3.<init>(r4)
            goto L_0x00a1
        L_0x0300:
            java.lang.String r5 = r3.f19967b
            java.lang.String r6 = "signature"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0338
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r6 = 9
            r4.<init>(r5, r3, r6)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r6 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r6)
            java.lang.String r2 = r3.f19974i
            java.lang.String r2 = com.seattleclouds.mbfx.C5467a.m27253a(r2)
            r4.f20010p = r2
            android.widget.Button r2 = r4.f19998d
            com.seattleclouds.modules.feedback.a$24 r3 = new com.seattleclouds.modules.feedback.a$24
            r3.<init>(r4)
            goto L_0x00a1
        L_0x0338:
            java.lang.String r5 = r3.f19967b
            java.lang.String r6 = "list"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x0406
            com.seattleclouds.modules.feedback.PickerView r5 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r6 = r13.mo1318s()
            r5.<init>(r6, r3, r4)
            int r4 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.setViewId(r2)
            r5.f20006l = r3
            android.widget.TextView r2 = r5.f19995a
            android.os.Bundle r6 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r6)
            android.widget.EditText r2 = r5.f19996b
            if (r10 == 0) goto L_0x0370
            java.lang.Class r6 = r10.getClass()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0370
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0372
        L_0x0370:
            java.lang.String r10 = ""
        L_0x0372:
            r2.setText(r10)
            java.lang.String r2 = r3.f19976k
            r5.f20011q = r2
            android.widget.Button r2 = r5.f19998d
            com.seattleclouds.modules.feedback.a$25 r6 = new com.seattleclouds.modules.feedback.a$25
            r6.<init>(r5, r3)
            r2.setOnClickListener(r6)
            com.seattleclouds.modules.feedback.Field r2 = r5.f20006l
            java.lang.String r2 = r2.f19977l
            if (r2 == 0) goto L_0x03fe
            com.seattleclouds.modules.feedback.Field r2 = r5.f20006l
            java.lang.String r2 = r2.f19977l
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x03fe
            com.seattleclouds.modules.feedback.Field r2 = r5.f20006l
            java.lang.String r2 = r2.f19977l
            if (r2 == 0) goto L_0x03d0
            int r6 = r2.length()
            if (r6 <= 0) goto L_0x03d0
            java.util.ArrayList<com.seattleclouds.modules.feedback.Field> r6 = r13.f20087f
            java.util.Iterator r6 = r6.iterator()
        L_0x03a5:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x03d0
            java.lang.Object r7 = r6.next()
            com.seattleclouds.modules.feedback.Field r7 = (com.seattleclouds.modules.feedback.Field) r7
            java.lang.String r8 = r7.f19966a
            boolean r8 = r8.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x03a5
            java.util.List r2 = r3.mo18170e()
            if (r2 == 0) goto L_0x03cc
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x03cc
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x03ce
        L_0x03cc:
            java.lang.String r2 = ""
        L_0x03ce:
            r7.f19978m = r2
        L_0x03d0:
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.support.v4.app.h r3 = r13.mo1318s()
            r2.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r7 = -2
            r3.<init>(r6, r7)
            r2.setLayoutParams(r3)
            r3 = 48
            r2.setGravity(r3)
            r2.setOrientation(r9)
            int r3 = com.seattleclouds.C5451m.C5458g.list_w_reference
            r2.setId(r3)
            r2.addView(r5)
            android.os.Bundle r3 = r13.f20074au
            com.seattleclouds.util.C6593am.m31914a(r2, r3)
            java.util.List<android.widget.LinearLayout> r3 = r13.f20090i
            r3.add(r2)
            goto L_0x0403
        L_0x03fe:
            android.widget.LinearLayout r2 = r13.f20073at
            r2.addView(r5)
        L_0x0403:
            r2 = r4
            goto L_0x0010
        L_0x0406:
            java.lang.String r4 = r3.f19967b
            java.lang.String r5 = "multilist"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x0476
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r4.<init>(r5, r3, r11)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.EditText r2 = r4.f19996b
            if (r10 == 0) goto L_0x0437
            java.lang.Class r6 = r10.getClass()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0437
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0439
        L_0x0437:
            java.lang.String r10 = ""
        L_0x0439:
            r2.setText(r10)
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r6 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r6)
            java.lang.String r2 = r3.f19976k
            r4.f20011q = r2
            android.widget.Button r2 = r4.f19998d
            com.seattleclouds.modules.feedback.a$26 r6 = new com.seattleclouds.modules.feedback.a$26
            r6.<init>(r4, r3)
            r2.setOnClickListener(r6)
            java.util.List<android.widget.LinearLayout> r2 = r13.f20090i
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x00a4
            java.lang.String r2 = r3.f19978m
            if (r2 == 0) goto L_0x00a4
            java.util.List<android.widget.LinearLayout> r2 = r13.f20090i
            java.util.List<android.widget.LinearLayout> r3 = r13.f20090i
            int r3 = r3.size()
            int r3 = r3 - r9
            java.lang.Object r2 = r2.get(r3)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r2.addView(r4)
            android.widget.LinearLayout r3 = r13.f20073at
            r3.addView(r2)
            goto L_0x00a9
        L_0x0476:
            java.lang.String r4 = r3.f19967b
            java.lang.String r5 = "voicerecord"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x04a6
            com.seattleclouds.modules.feedback.VoiceRecordPickerView r4 = new com.seattleclouds.modules.feedback.VoiceRecordPickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r6 = 15
            r4.<init>(r5, r3, r6)
            int r3 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            android.widget.Button r2 = r4.f19998d
            com.seattleclouds.modules.feedback.a$2 r5 = new com.seattleclouds.modules.feedback.a$2
            r5.<init>(r4)
            r2.setOnClickListener(r5)
            android.widget.LinearLayout r2 = r13.f20073at
            r2.addView(r4)
            r2 = r3
            goto L_0x0010
        L_0x04a6:
            java.lang.String r4 = r3.f19967b
            java.lang.String r5 = "pictureselection"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x0010
            com.seattleclouds.modules.feedback.PickerView r4 = new com.seattleclouds.modules.feedback.PickerView
            android.support.v4.app.h r5 = r13.mo1318s()
            r6 = 17
            r4.<init>(r5, r3, r6)
            int r5 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setViewId(r2)
            r4.f20006l = r3
            android.widget.TextView r2 = r4.f19995a
            android.os.Bundle r6 = r13.f20074au
            com.seattleclouds.util.C6593am.m31915a(r2, r6)
            java.lang.String r2 = r3.f19974i
            java.lang.String r2 = com.seattleclouds.mbfx.C5467a.m27253a(r2)
            r4.f20010p = r2
            android.widget.Button r2 = r4.f19998d
            com.seattleclouds.modules.feedback.a$3 r3 = new com.seattleclouds.modules.feedback.a$3
            r3.<init>(r4)
            goto L_0x00a1
        L_0x04de:
            r13.m27974e()
            r0 = 0
        L_0x04e2:
            android.widget.LinearLayout r2 = r13.f20073at
            int r2 = r2.getChildCount()
            if (r0 >= r2) goto L_0x05ba
            android.widget.LinearLayout r2 = r13.f20073at
            android.view.View r2 = r2.getChildAt(r0)
            boolean r2 = r2 instanceof com.seattleclouds.modules.feedback.PickerView
            if (r2 != 0) goto L_0x0508
            android.widget.LinearLayout r2 = r13.f20073at
            android.view.View r2 = r2.getChildAt(r0)
            java.lang.Class r2 = r2.getClass()
            java.lang.Class<android.widget.LinearLayout> r3 = android.widget.LinearLayout.class
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0508
            goto L_0x05b6
        L_0x0508:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.widget.LinearLayout r3 = r13.f20073at
            android.view.View r3 = r3.getChildAt(r0)
            int r3 = r3.getId()
            int r10 = com.seattleclouds.C5451m.C5458g.list_w_reference
            if (r3 != r10) goto L_0x0537
            android.widget.LinearLayout r3 = r13.f20073at
            android.view.View r3 = r3.getChildAt(r0)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            int r10 = r3.getChildCount()
            if (r10 < r8) goto L_0x0542
            android.view.View r10 = r3.getChildAt(r1)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r2.add(r10)
            android.view.View r3 = r3.getChildAt(r9)
            goto L_0x053d
        L_0x0537:
            android.widget.LinearLayout r3 = r13.f20073at
            android.view.View r3 = r3.getChildAt(r0)
        L_0x053d:
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.add(r3)
        L_0x0542:
            r3 = 0
        L_0x0543:
            int r10 = r2.size()
            if (r3 >= r10) goto L_0x05b6
            java.lang.Object r10 = r2.get(r3)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            boolean r11 = r10 instanceof com.seattleclouds.modules.feedback.PickerView
            if (r11 == 0) goto L_0x05b3
            com.seattleclouds.modules.feedback.PickerView r10 = (com.seattleclouds.modules.feedback.PickerView) r10
            int r11 = r10.f20005k
            if (r11 != r8) goto L_0x0572
            android.location.Location r11 = r13.f20039aH
            double r11 = r11.getLatitude()
            r13.f20047aP = r11
            android.location.Location r11 = r13.f20039aH
            double r11 = r11.getLongitude()
            r13.f20048aQ = r11
            double r11 = r13.f20047aP
            r10.f20008n = r11
            double r11 = r13.f20048aQ
            r10.f20009o = r11
            goto L_0x05b3
        L_0x0572:
            int r11 = r10.f20005k
            if (r11 == r7) goto L_0x05a7
            int r11 = r10.f20005k
            if (r11 != r5) goto L_0x057b
            goto L_0x05a7
        L_0x057b:
            int r11 = r10.f20005k
            if (r11 != r6) goto L_0x059f
            com.seattleclouds.modules.feedback.Field r11 = r10.f20006l
            java.lang.String r11 = r11.f19967b
            java.lang.String r12 = "saveoption"
            boolean r11 = r11.equalsIgnoreCase(r12)
            if (r11 == 0) goto L_0x05b3
            com.seattleclouds.modules.feedback.Field r11 = r10.f20006l
            java.lang.String r11 = r11.f19969d
            java.lang.String r12 = "yes"
            boolean r11 = r11.equalsIgnoreCase(r12)
            r10.setSwithPosition(r11)
            boolean r10 = r10.getSwithPosition()
            r13.f20072as = r10
            goto L_0x05b3
        L_0x059f:
            int r11 = r10.f20005k
            if (r11 != r4) goto L_0x05a4
            goto L_0x05b3
        L_0x05a4:
            int r10 = r10.f20005k
            goto L_0x05b3
        L_0x05a7:
            android.widget.EditText r10 = r10.f19996b
            android.text.Editable r10 = r10.getText()
            java.lang.String r10 = r10.toString()
            r13.f20042aK = r10
        L_0x05b3:
            int r3 = r3 + 1
            goto L_0x0543
        L_0x05b6:
            int r0 = r0 + 1
            goto L_0x04e2
        L_0x05ba:
            boolean r0 = r13.f20050aS
            if (r0 == 0) goto L_0x05f1
            android.support.v4.app.h r0 = r13.mo1318s()
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            int r2 = com.seattleclouds.C5451m.C5460i.feedbacksubmitbutton
            android.widget.LinearLayout r3 = r13.f20073at
            android.view.View r0 = r0.inflate(r2, r3, r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.f20085d = r0
            android.widget.LinearLayout r0 = r13.f20085d
            int r1 = com.seattleclouds.C5451m.C5458g.submitBtn
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            java.lang.String r1 = r13.f20061ah
            r0.setText(r1)
            com.seattleclouds.modules.feedback.a$4 r1 = new com.seattleclouds.modules.feedback.a$4
            r1.<init>()
        L_0x05e6:
            r0.setOnClickListener(r1)
            android.widget.LinearLayout r0 = r13.f20073at
            android.widget.LinearLayout r1 = r13.f20085d
            r0.addView(r1)
            goto L_0x061a
        L_0x05f1:
            android.support.v4.app.h r0 = r13.mo1318s()
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            int r2 = com.seattleclouds.C5451m.C5460i.feedbacksubmitbutton
            android.widget.LinearLayout r3 = r13.f20073at
            android.view.View r0 = r0.inflate(r2, r3, r1)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.f20085d = r0
            android.widget.LinearLayout r0 = r13.f20085d
            int r1 = com.seattleclouds.C5451m.C5458g.submitBtn
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Button r0 = (android.widget.Button) r0
            java.lang.String r1 = r13.f20061ah
            r0.setText(r1)
            com.seattleclouds.modules.feedback.a$5 r1 = new com.seattleclouds.modules.feedback.a$5
            r1.<init>()
            goto L_0x05e6
        L_0x061a:
            r13.m27972d()
            boolean r0 = r13.f20070aq
            if (r0 == 0) goto L_0x0636
            org.json.JSONObject r0 = r13.f20078ay
            if (r0 == 0) goto L_0x0636
            org.json.JSONObject r0 = r13.f20078ay
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "{}"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L_0x0636
            r13.m27958as()
        L_0x0636:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.feedback.C5633a.m27967c():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27968c(String str) {
        StringBuilder sb;
        String str2;
        int i = 0;
        for (int i2 = 0; i2 < this.f20073at.getChildCount(); i2++) {
            if (this.f20073at.getChildAt(i2) instanceof PickerView) {
                PickerView pickerView = (PickerView) this.f20073at.getChildAt(i2);
                if (!pickerView.mo18192a()) {
                    C6620n.m32034a((Context) mo1318s(), "Error", pickerView.getRequirementMessage());
                    return;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        while (i < this.f20073at.getChildCount()) {
            try {
                if (this.f20073at.getChildAt(i) instanceof PickerView) {
                    PickerView pickerView2 = (PickerView) this.f20073at.getChildAt(i);
                    String str3 = "";
                    String str4 = "";
                    if (!(pickerView2.f20005k == 0 || pickerView2.f20005k == 1 || pickerView2.f20005k == 5 || pickerView2.f20005k == 16 || pickerView2.f20005k == 11 || pickerView2.f20005k == 6 || pickerView2.f20005k == 7)) {
                        if (pickerView2.f20005k != 8) {
                            if (pickerView2.f20005k == 2) {
                                str3 = pickerView2.f20006l.mo18174g();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(pickerView2.f19996b.getText().toString());
                                sb2.append(" <a href=\"http://maps.google.com/maps?q=");
                                sb2.append(pickerView2.f20008n);
                                sb2.append(",");
                                sb2.append(pickerView2.f20009o);
                                sb2.append("\">VIEW MAP</a>");
                                str4 = sb2.toString();
                            } else if ((pickerView2.f20005k == 3 || pickerView2.f20005k == 4 || pickerView2.f20005k == 9) && pickerView2.f20007m != null) {
                                String a = C5467a.m27253a(pickerView2.f20006l.f19974i);
                                if (a == null || a.equalsIgnoreCase("")) {
                                    C6620n.m32034a((Context) mo1318s(), "ERROR", "Invalid Upload Image target URL.");
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("tempPV.imageUri = ");
                                    sb3.append(pickerView2.f20007m);
                                    Log.v("FeedbackActivity", sb3.toString());
                                    ByteArrayEntity byteArrayEntity = new ByteArrayEntity(C6613i.m31990a(mo1318s().getContentResolver().openInputStream(pickerView2.f20007m)));
                                    HttpPost httpPost = new HttpPost(a);
                                    httpPost.setEntity(byteArrayEntity);
                                    m27951aB();
                                    C6567c.m31787a(httpPost, new C6568d() {
                                        /* renamed from: a */
                                        public void mo18224a(HttpResponse httpResponse) {
                                            C0367h s;
                                            String str;
                                            C5633a.this.m27952aC();
                                            String a = C6567c.m31786a(httpResponse);
                                            if (!a.equalsIgnoreCase("ok")) {
                                                s = C5633a.this.mo1318s();
                                                str = "Error uploading image";
                                            } else {
                                                s = C5633a.this.mo1318s();
                                                str = "New image uploaded successfully!";
                                            }
                                            C6620n.m32034a((Context) s, str, a);
                                        }

                                        /* renamed from: b */
                                        public void mo1450b() {
                                            C5633a.this.m27952aC();
                                            C6620n.m32034a((Context) C5633a.this.mo1318s(), "ERROR", "Server is NOT responding.");
                                        }
                                    });
                                }
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            sb4.append(":");
                            arrayList.add(new BasicNameValuePair(sb4.toString(), str4));
                        }
                    }
                    str3 = pickerView2.f20006l.mo18174g();
                    str4 = pickerView2.f19996b.getText().toString();
                    StringBuilder sb42 = new StringBuilder();
                    sb42.append(str3);
                    sb42.append(":");
                    arrayList.add(new BasicNameValuePair(sb42.toString(), str4));
                }
                i++;
            } catch (UnsupportedEncodingException e) {
                e = e;
                str2 = "FeedbackActivity";
                sb = new StringBuilder();
                sb.append("submitFeedback: ");
                sb.append(e);
                Log.e(str2, sb.toString(), e);
            } catch (FileNotFoundException e2) {
                e = e2;
                str2 = "FeedbackActivity";
                sb = new StringBuilder();
                sb.append("submitFeedback: ");
                sb.append(e);
                Log.e(str2, sb.toString(), e);
            } catch (IOException e3) {
                e = e3;
                str2 = "FeedbackActivity";
                sb = new StringBuilder();
                sb.append("submitFeedback: ");
                sb.append(e);
                Log.e(str2, sb.toString(), e);
            } catch (Exception e4) {
                e = e4;
                str2 = "FeedbackActivity";
                sb = new StringBuilder();
                sb.append("submitFeedback: ");
                sb.append(e);
                Log.e(str2, sb.toString(), e);
            }
        }
        HttpPost httpPost2 = new HttpPost(str);
        httpPost2.setEntity(new UrlEncodedFormEntity(arrayList));
        m27951aB();
        C6567c.m31787a(httpPost2, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public File m27971d(String str) {
        File file = new File(f20029b);
        file.mkdirs();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".jpg");
        return new File(file, sb.toString());
    }

    /* renamed from: d */
    private void m27972d() {
        LinearLayout a = AdNativeManager.m26108a((Activity) mo1318s(), this.f20041aJ);
        if (a != null) {
            a.setLayoutParams(new LayoutParams(-1, C6619m.m32014a(mo1318s(), (float) App.f18501c.mo16931aa())));
            if (AdNativeManager.m26109a(this.f20041aJ) == NativeAdsAlignmentType.NATIVE_ADS_BOTTOM) {
                this.f20085d.addView(a);
            } else {
                this.f20073at.addView(a, this.f20084be);
            }
            AdNativeManager.m26111a((Activity) mo1318s(), a, App.f18501c.mo16931aa());
        }
    }

    /* renamed from: e */
    private void m27974e() {
        this.f20037aF = mo1318s().getSharedPreferences("com.seattleclouds.modules.feedback.savedDataPreferences", 0);
        String string = this.f20037aF.getString("jsonSavedData_AutoFill", "");
        if (!string.equalsIgnoreCase("")) {
            try {
                this.f20078ay = new JSONObject(string);
            } catch (JSONException unused) {
                Log.e("FeedbackActivity", "JSON: load pref.");
            }
        }
        this.f20079az = new JSONObject();
        this.f20032aA = new JSONObject();
        this.f20033aB = new JSONObject();
        this.f20034aC = new JSONObject();
        this.f20035aD = new JSONObject();
        this.f20036aE = new JSONObject();
        if (this.f20078ay != null) {
            try {
                if (this.f20078ay.has("text") && !this.f20078ay.isNull("text")) {
                    this.f20079az = this.f20078ay.getJSONObject("text");
                }
            } catch (JSONException unused2) {
                Log.e("FeedbackActivity", "JSON text: unable to initiate saved data for one of field types");
            }
            try {
                if (this.f20078ay.has("number") && !this.f20078ay.isNull("number")) {
                    this.f20032aA = this.f20078ay.getJSONObject("number");
                }
            } catch (JSONException unused3) {
                Log.e("FeedbackActivity", "JSON number:  unable to initiate saved data for one of field types");
            }
            try {
                if (this.f20078ay.has("multilinetext") && !this.f20078ay.isNull("multilinetext")) {
                    this.f20033aB = this.f20078ay.getJSONObject("multilinetext");
                }
            } catch (JSONException unused4) {
                Log.e("FeedbackActivity", "JSON multilinetext: unable to initiate saved data for one of field types");
            }
            try {
                if (this.f20078ay.has("email") && !this.f20078ay.isNull("email")) {
                    this.f20034aC = this.f20078ay.getJSONObject("email");
                }
            } catch (JSONException unused5) {
                Log.e("FeedbackActivity", "JSON email: unable to initiate saved data for one of field types");
            }
            try {
                if (this.f20078ay.has("list") && !this.f20078ay.isNull("list")) {
                    this.f20035aD = this.f20078ay.getJSONObject("list");
                }
            } catch (JSONException unused6) {
                Log.e("FeedbackActivity", "JSON list: unable to initiate saved data for one of field types");
            }
            try {
                if (this.f20078ay.has("multilist") && !this.f20078ay.isNull("multilist")) {
                    this.f20036aE = this.f20078ay.getJSONObject("multilist");
                }
            } catch (JSONException unused7) {
                Log.e("FeedbackActivity", "JSON multilist: unable to initiate saved data for one of field types");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m27975e(int i) {
        if (C6569aa.m31796a()) {
            switch (i) {
                case 32:
                    if (mo1318s() == null) {
                        return true;
                    }
                    boolean z = C0452b.m2065b((Context) mo1318s(), "android.permission.READ_EXTERNAL_STORAGE") == 0;
                    if (!z) {
                        if (this.f20054aW) {
                            return true;
                        }
                        this.f20054aW = true;
                        C6569aa.m31791a((Fragment) this, 32, "android.permission.READ_EXTERNAL_STORAGE", new int[]{C5462k.feedback_permission_storage_read_rational, C5462k.feedback_permission_storage_read_required_toast});
                    }
                    return !z;
                case 33:
                    boolean a = C6569aa.m31798a(mo1316q(), C6569aa.f23244c);
                    if (!a) {
                        if (this.f20054aW) {
                            return true;
                        }
                        this.f20054aW = true;
                        C6569aa.m31792a((Fragment) this, 33, C6569aa.f23244c, new int[]{C5462k.feedback_permission_location_rational, C5462k.feedback_permission_location_required_toast});
                    }
                    return !a;
                case 34:
                    if (mo1318s() == null) {
                        return true;
                    }
                    boolean z2 = C0452b.m2065b((Context) mo1318s(), "android.permission.RECORD_AUDIO") == 0;
                    if (!z2) {
                        if (this.f20054aW || mo1318s() == null) {
                            return true;
                        }
                        this.f20054aW = true;
                        C6569aa.m31791a((Fragment) this, 34, "android.permission.RECORD_AUDIO", new int[]{C5462k.feedback_permission_microphone_rational, C5462k.feedback_permission_microphone_required_toast});
                    }
                    return !z2;
                case 35:
                    boolean a2 = C6569aa.m31798a(mo1316q(), C6569aa.f23242a);
                    if (!a2) {
                        if (this.f20054aW) {
                            return true;
                        }
                        this.f20054aW = true;
                        C6569aa.m31792a((Fragment) this, 35, C6569aa.f23242a, new int[]{C5462k.feedback_permission_camera_and_storage_rational, C5462k.feedback_permission_location_required_toast});
                    }
                    return !a2;
            }
        }
        return false;
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        this.f20076aw = null;
        if (this.f20053aV) {
            Iterator it = f20030c.iterator();
            while (it.hasNext()) {
                C6730b.m32467d(new File((String) it.next()));
            }
            f20030c.clear();
        }
        if (this.f20056aY) {
            return;
        }
        if ((this.f20057aZ || this.f20080ba) && !this.f20055aX) {
            m27956aG();
            m27955aF();
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20049aR = layoutInflater.inflate(C5460i.feedback, viewGroup, false);
        this.f20049aR.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    View findFocus = C5633a.this.mo1199I().findFocus();
                    if (findFocus instanceof EditText) {
                        Rect rect = new Rect();
                        findFocus.getGlobalVisibleRect(rect);
                        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                            findFocus.clearFocus();
                            ((InputMethodManager) C5633a.this.mo1318s().getSystemService("input_method")).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
                        }
                    }
                }
                return false;
            }
        });
        mo18225c(bundle);
        return this.f20049aR;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        String str;
        Uri uri;
        Uri uri2;
        String str2;
        PickerView pickerView;
        boolean z;
        C5633a aVar;
        super.mo1222a(i, i2, intent);
        if (i == 1301) {
            this.f20054aW = false;
            if (!m27975e(32) && i2 == -1) {
                Uri data = intent.getData();
                String a = C6598aq.m31938a(mo1316q(), data);
                if (a == null) {
                    a = data.getPath();
                } else {
                    data = Uri.fromFile(new File(a));
                }
                Uri uri3 = data;
                String str3 = a;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f20086e.f20006l.f19966a);
                sb.append(1301);
                m27941a(this.f20086e, uri3, str3, Uri.fromFile(m27971d(sb.toString())), true);
            }
        } else {
            if (i == 1302) {
                this.f20054aW = false;
                if (!m27975e(35) && i2 == -1) {
                    uri = Uri.fromFile(m27971d(this.f20086e.f20006l.f19966a));
                    pickerView = this.f20086e;
                    str2 = uri.getPath();
                    z = false;
                    aVar = this;
                    uri2 = uri;
                }
            } else if (i == 1300) {
                if (i2 == -1) {
                    String string = intent.getExtras().getString("address");
                    this.f20086e.f19996b.removeTextChangedListener(null);
                    this.f20086e.f19996b.setText(string);
                    this.f20086e.f19996b.addTextChangedListener(m27957aH());
                    this.f20086e.f20008n = intent.getExtras().getDouble("latitude");
                    this.f20086e.f20009o = intent.getExtras().getDouble("longitude");
                    String string2 = intent.getExtras().getString("city");
                    this.f20039aH.setLatitude(this.f20086e.f20008n);
                    this.f20039aH.setLongitude(this.f20086e.f20009o);
                    this.f20039aH.setProvider(string);
                    this.f20082bc = new C5416a(string, string2);
                }
            } else if (i == 1303) {
                if (i2 == -1) {
                    String string3 = intent.getExtras().getString("ARG_IMAGE_PATH");
                    String a2 = C6613i.m31987a(string3, "SignatureStamp", mo1318s());
                    if (a2 != null) {
                        this.f20086e.f19999e.setImageBitmap(BitmapFactory.decodeFile(string3));
                        this.f20086e.f20007m = Uri.fromFile(new File(a2));
                    }
                }
            } else if (i == 1304) {
                this.f20054aW = false;
                if (!m27975e(35) && i2 == -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f20086e.f20006l.f19966a);
                    sb2.append(1304);
                    File d = m27971d(sb2.toString());
                    if (intent == null || intent.getData() == null) {
                        Uri fromFile = Uri.fromFile(d);
                        str = fromFile.getPath();
                        uri2 = fromFile;
                        uri = uri2;
                    } else {
                        Uri data2 = intent.getData();
                        str = C6598aq.m31938a(mo1316q(), data2);
                        if (str == null) {
                            str = data2.getPath();
                        } else {
                            data2 = Uri.fromFile(new File(str));
                        }
                        uri = Uri.fromFile(d);
                        uri2 = data2;
                    }
                    str2 = str;
                    pickerView = this.f20086e;
                    z = true;
                    aVar = this;
                }
            } else if (i == 2 && (this.f20086e instanceof VoiceRecordPickerView) && i2 == -1) {
                VoiceRecordPickerView voiceRecordPickerView = (VoiceRecordPickerView) this.f20086e;
                if (voiceRecordPickerView.getRecordPath() != null) {
                    C6730b.m32467d(new File(voiceRecordPickerView.getRecordPath()));
                }
                String string4 = intent.getExtras().getString("recordName");
                String string5 = intent.getExtras().getString("filePath");
                voiceRecordPickerView.setRecordName(string4);
                voiceRecordPickerView.setRecordPath(string5);
                f20030c.add(string5);
            }
            aVar.m27941a(pickerView, uri2, str2, uri, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r5.equals("android.permission.READ_EXTERNAL_STORAGE") != false) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1224a(int r5, java.lang.String[] r6, int[] r7) {
        /*
            r4 = this;
            r0 = 400(0x190, double:1.976E-321)
            r2 = 0
            switch(r5) {
                case 32: goto L_0x00c1;
                case 33: goto L_0x0097;
                case 34: goto L_0x0008;
                case 35: goto L_0x0031;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x00ea
        L_0x0008:
            java.lang.String r5 = "android.permission.RECORD_AUDIO"
            boolean r5 = com.seattleclouds.util.C6569aa.m31801a(r6, r7, r5)
            if (r5 != 0) goto L_0x0022
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.myLooper()
            r5.<init>(r3)
            com.seattleclouds.modules.feedback.a$17 r3 = new com.seattleclouds.modules.feedback.a$17
            r3.<init>()
            r5.postDelayed(r3, r0)
            goto L_0x0031
        L_0x0022:
            r4.f20054aW = r2
            android.support.v4.app.h r5 = r4.mo1318s()
            int r3 = com.seattleclouds.C5451m.C5462k.common_permission_granted
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r3, r2)
            r5.show()
        L_0x0031:
            java.lang.String[] r5 = com.seattleclouds.util.C6569aa.f23242a
            java.lang.String r5 = com.seattleclouds.util.C6569aa.m31803b(r6, r7, r5)
            if (r5 == 0) goto L_0x0087
            int r6 = r5.hashCode()
            r7 = -406040016(0xffffffffe7cc5230, float:-1.9297577E24)
            r3 = -1
            if (r6 == r7) goto L_0x0062
            r7 = 463403621(0x1b9efa65, float:2.630072E-22)
            if (r6 == r7) goto L_0x0058
            r7 = 1365911975(0x516a29a7, float:6.2857572E10)
            if (r6 == r7) goto L_0x004e
            goto L_0x006b
        L_0x004e:
            java.lang.String r6 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x006b
            r2 = 1
            goto L_0x006c
        L_0x0058:
            java.lang.String r6 = "android.permission.CAMERA"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x006b
            r2 = 2
            goto L_0x006c
        L_0x0062:
            java.lang.String r6 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r2 = -1
        L_0x006c:
            switch(r2) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0073;
                case 2: goto L_0x0070;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x0075
        L_0x0070:
            int r3 = com.seattleclouds.C5451m.C5462k.feedback_permission_camera_denied
            goto L_0x0075
        L_0x0073:
            int r3 = com.seattleclouds.C5451m.C5462k.feedback_permission_storage_read_denied
        L_0x0075:
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.myLooper()
            r5.<init>(r6)
            com.seattleclouds.modules.feedback.a$18 r6 = new com.seattleclouds.modules.feedback.a$18
            r6.<init>(r3)
            r5.postDelayed(r6, r0)
            goto L_0x00ea
        L_0x0087:
            r4.f20054aW = r2
            android.support.v4.app.h r5 = r4.mo1318s()
            int r6 = com.seattleclouds.C5451m.C5462k.common_permission_granted
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r2)
            r5.show()
            goto L_0x00ea
        L_0x0097:
            java.lang.String[] r5 = com.seattleclouds.util.C6569aa.f23244c
            boolean r5 = com.seattleclouds.util.C6569aa.m31802a(r6, r7, r5)
            if (r5 != 0) goto L_0x00b1
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.myLooper()
            r5.<init>(r6)
            com.seattleclouds.modules.feedback.a$16 r6 = new com.seattleclouds.modules.feedback.a$16
            r6.<init>()
            r5.postDelayed(r6, r0)
            goto L_0x00c0
        L_0x00b1:
            r4.f20054aW = r2
            android.support.v4.app.h r5 = r4.mo1318s()
            int r6 = com.seattleclouds.C5451m.C5462k.common_permission_granted
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r2)
            r5.show()
        L_0x00c0:
            return
        L_0x00c1:
            java.lang.String r5 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r5 = com.seattleclouds.util.C6569aa.m31801a(r6, r7, r5)
            if (r5 != 0) goto L_0x00db
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.myLooper()
            r5.<init>(r6)
            com.seattleclouds.modules.feedback.a$15 r6 = new com.seattleclouds.modules.feedback.a$15
            r6.<init>()
            r5.postDelayed(r6, r0)
            goto L_0x00ea
        L_0x00db:
            r4.f20054aW = r2
            android.support.v4.app.h r5 = r4.mo1318s()
            int r6 = com.seattleclouds.C5451m.C5462k.common_permission_granted
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r2)
            r5.show()
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.feedback.C5633a.mo1224a(int, java.lang.String[], int[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0155, code lost:
        if (r8.getBoolean("useCurrentLocation") != false) goto L_0x0149;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1234a(android.os.Bundle r8) {
        /*
            r7 = this;
            boolean r0 = com.seattleclouds.App.f18479L
            r7.f20055aX = r0
            boolean r0 = com.seattleclouds.App.f18512n
            r7.f20057aZ = r0
            boolean r0 = com.seattleclouds.App.f18511m
            r7.f20080ba = r0
            if (r8 == 0) goto L_0x0017
            java.lang.String r0 = "PERMISSION_DIALOG_OPEN_KEY"
            r1 = 0
            boolean r0 = r8.getBoolean(r0, r1)
            r7.f20054aW = r0
        L_0x0017:
            android.os.Bundle r0 = r7.mo1307m()
            r1 = 1
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            if (r0 == 0) goto L_0x00e2
            java.lang.String r4 = "feedbackfields"
            java.util.ArrayList r4 = r0.getParcelableArrayList(r4)
            r7.f20087f = r4
            java.lang.String r4 = "headerimage"
            java.lang.String r4 = r0.getString(r4)
            r7.f20058ae = r4
            java.lang.String r4 = "pageid"
            java.lang.String r4 = r0.getString(r4)
            r7.f20059af = r4
            java.lang.String r4 = "sendtoaddresses"
            java.util.ArrayList r4 = r0.getStringArrayList(r4)
            r7.f20060ag = r4
            java.lang.String r4 = "submitbutton"
            java.lang.String r4 = r0.getString(r4)
            r7.f20061ah = r4
            java.lang.String r4 = "confirmmessage"
            java.lang.String r4 = r0.getString(r4)
            r7.f20062ai = r4
            java.lang.String r4 = "latitude"
            double r4 = r0.getDouble(r4, r2)
            r7.f20064ak = r4
            java.lang.String r4 = "longitude"
            double r4 = r0.getDouble(r4, r2)
            r7.f20065al = r4
            java.lang.String r4 = "resultType"
            java.lang.String r4 = r0.getString(r4)
            r7.f20067an = r4
            java.lang.String r4 = "resultDistanceInMiles"
            boolean r4 = r0.getBoolean(r4)
            r7.f20068ao = r4
            java.lang.String r4 = "showLocationPicker"
            boolean r4 = r0.getBoolean(r4)
            r7.f20069ap = r4
            java.lang.String r4 = "autoFillEnabled"
            boolean r4 = r0.getBoolean(r4)
            r7.f20070aq = r4
            java.lang.String r4 = "autoFillSaveOnly"
            boolean r4 = r0.getBoolean(r4)
            r7.f20071ar = r4
            java.lang.String r4 = "isOnlyEnterData"
            boolean r4 = r0.getBoolean(r4)
            r7.f20050aS = r4
            java.lang.String r4 = "slidetonextpage"
            java.lang.String r4 = r0.getString(r4)
            r7.f20063aj = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r7.f20090i = r4
            java.lang.String r4 = "PAGE_STYLE"
            android.os.Bundle r4 = r0.getBundle(r4)
            r7.f20074au = r4
            java.lang.String r4 = "clearFromData"
            boolean r4 = r0.getBoolean(r4)
            r7.f20052aU = r4
            java.util.ArrayList<com.seattleclouds.modules.feedback.Field> r4 = r7.f20087f
            boolean r4 = r7.m27948a(r4)
            r4 = r4 ^ r1
            r7.f20056aY = r4
            java.lang.String r4 = "jsonstring"
            java.lang.String r0 = r0.getString(r4)
            if (r0 == 0) goto L_0x00e2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00cb }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x00cb }
            r7.f20077ax = r4     // Catch:{ JSONException -> 0x00cb }
            goto L_0x00e2
        L_0x00cb:
            r0 = move-exception
            java.lang.String r4 = "FeedbackActivity"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Extract json from EXTRA: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.e(r4, r0)
        L_0x00e2:
            com.seattleclouds.a r0 = com.seattleclouds.App.f18501c
            java.util.Map r0 = r0.mo16902D()
            java.lang.String r4 = r7.f20059af
            java.lang.Object r0 = r0.get(r4)
            com.seattleclouds.aa r0 = (com.seattleclouds.C5230aa) r0
            r7.f20041aJ = r0
            com.seattleclouds.aa r0 = r7.f20041aJ
            if (r0 != 0) goto L_0x010d
            android.support.v4.app.h r0 = r7.mo1318s()
            com.seattleclouds.App.m25618a(r0)
            com.seattleclouds.a r0 = com.seattleclouds.App.f18501c
            java.util.Map r0 = r0.mo16902D()
            java.lang.String r4 = r7.f20059af
            java.lang.Object r0 = r0.get(r4)
            com.seattleclouds.aa r0 = (com.seattleclouds.C5230aa) r0
            r7.f20041aJ = r0
        L_0x010d:
            com.seattleclouds.aa r0 = r7.f20041aJ
            java.lang.String r0 = r0.mo17203z()
            if (r0 == 0) goto L_0x0121
            java.lang.String r4 = ""
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x0121
            java.lang.String r0 = com.seattleclouds.mbfx.C5467a.m27253a(r0)
        L_0x0121:
            r7.f20051aT = r0
            boolean r0 = r7.f20056aY
            if (r0 != 0) goto L_0x0158
            if (r8 != 0) goto L_0x014f
            double r4 = r7.f20064ak
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0149
            double r4 = r7.f20065al
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0149
            android.location.Location r0 = r7.f20039aH
            double r2 = r7.f20064ak
            r0.setLatitude(r2)
            android.location.Location r0 = r7.f20039aH
            double r2 = r7.f20065al
            r0.setLongitude(r2)
            android.location.Location r0 = r7.f20039aH
            r7.m27940a(r0)
            goto L_0x0158
        L_0x0149:
            r7.f20066am = r1
            r7.m27953aD()
            goto L_0x0158
        L_0x014f:
            java.lang.String r0 = "useCurrentLocation"
            boolean r0 = r8.getBoolean(r0)
            if (r0 == 0) goto L_0x0158
            goto L_0x0149
        L_0x0158:
            r7.f20053aV = r1
            super.mo1234a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.feedback.C5633a.mo1234a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public void mo18224a(HttpResponse httpResponse) {
        m27952aC();
        String a = C6567c.m31786a(httpResponse);
        if (a == null || !a.equalsIgnoreCase("ok")) {
            if (!C6619m.m32026h(mo1318s())) {
                Toast.makeText(mo1318s(), C5462k.common_no_network, 1).show();
            } else {
                C6620n.m32034a((Context) mo1318s(), "ERROR", a);
            }
        } else if (this.f20063aj == null || this.f20063aj.trim().length() == 0) {
            if (!C6592al.m31909b(this.f20062ai)) {
                C6620n.m32034a((Context) mo1318s(), (String) null, this.f20062ai);
            }
            if (this.f20052aU) {
                m27967c();
            }
        } else if (!C6592al.m31909b(this.f20062ai)) {
            C6620n.m32035a((Context) mo1318s(), (String) null, this.f20062ai, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    if (!App.m25625a((Fragment) C5633a.this) && C5633a.this.f20052aU) {
                        C5633a.this.m27967c();
                    }
                    App.m25621a(C5633a.this.f20063aj, (Activity) C5633a.this.mo1318s());
                }
            });
        } else {
            if (!App.m25625a((Fragment) this) && this.f20052aU) {
                m27967c();
            }
            App.m25621a(this.f20063aj, (Activity) mo1318s());
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (this.f20038aG != null && this.f20066am) {
            if (!z) {
                this.f20038aG.mo17731b();
                View currentFocus = mo1318s().getWindow().getCurrentFocus();
                if (currentFocus != null && (currentFocus instanceof EditText)) {
                    ((InputMethodManager) mo1318s().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            } else if (!C6569aa.m31796a() || (mo1318s().mo1469g().mo1535a("permissionDialog") == null && !this.f20054aW && !m27975e(33))) {
                this.f20038aG.mo17730a();
            }
        }
    }

    /* renamed from: b */
    public void mo1450b() {
        m27952aC();
        C6620n.m32034a((Context) mo1318s(), "ERROR", "Server is NOT responding.");
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public void mo18225c(Bundle bundle) {
        Bundle m = mo1307m();
        if (m != null && m.getBoolean("rightToLeft") && VERSION.SDK_INT >= 17) {
            this.f20049aR.setLayoutDirection(1);
        }
        this.f20073at = (LinearLayout) this.f20049aR.findViewById(C5458g.feedbackLL);
        C6593am.m31914a((View) this.f20073at, this.f20074au);
        m27967c();
        if (bundle != null) {
            String string = bundle.getString("PV_FIELD_ID");
            if (!TextUtils.isEmpty(string)) {
                for (int i = 0; i < this.f20073at.getChildCount(); i++) {
                    View childAt = this.f20073at.getChildAt(i);
                    if (childAt.getClass().equals(PickerView.class)) {
                        PickerView pickerView = (PickerView) childAt;
                        if (string.equals(pickerView.f20006l.f19966a)) {
                            this.f20086e = pickerView;
                            return;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo18226c(View view) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putBoolean("useCurrentLocation", this.f20066am);
        this.f20053aV = false;
        if (!(this.f20086e == null || this.f20086e.f20006l == null)) {
            bundle.putString("PV_FIELD_ID", this.f20086e.f20006l.f19966a);
        }
        super.mo1282e(bundle);
        bundle.putBoolean("PERMISSION_DIALOG_OPEN_KEY", this.f20054aW);
    }
}
