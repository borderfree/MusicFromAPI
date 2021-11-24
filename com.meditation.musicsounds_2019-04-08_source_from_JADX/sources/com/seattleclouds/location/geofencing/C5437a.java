package com.seattleclouds.location.geofencing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.support.p009v4.app.C0345a;
import android.support.p009v4.app.C0419y.C0424d;
import android.util.Log;
import com.google.android.gms.common.C3177d;
import com.google.android.gms.location.C4515b;
import com.google.android.gms.location.C4518d;
import com.google.android.gms.location.C4522h;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest.C4512a;
import com.google.android.gms.tasks.C4794d;
import com.google.android.gms.tasks.C4795e;
import com.google.android.gms.tasks.C4796f;
import com.seattleclouds.App;
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.location.LocationProvidersChangedBroadcastReceiver;
import com.seattleclouds.util.C6595ao;
import com.seattleclouds.util.C6645y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.seattleclouds.location.geofencing.a */
public class C5437a {

    /* renamed from: a */
    public static final String f19402a = "com.seattleclouds.location.geofencing.a";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Map<String, C5450c> f19403e;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static String f19404i;

    /* renamed from: b */
    private C4518d f19405b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public PendingIntent f19406c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f19407d;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f19408f;

    /* renamed from: g */
    private boolean f19409g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f19410h;

    /* renamed from: j */
    private boolean f19411j;

    /* renamed from: com.seattleclouds.location.geofencing.a$a */
    private static class C5447a extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        private C5448b f19421a;

        public C5447a(C5448b bVar) {
            this.f19421a = bVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
            r8 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            r1 = com.seattleclouds.location.geofencing.C5437a.f19402a;
            r2 = new java.lang.StringBuilder();
            r3 = "Error parsing config file: ";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0089, code lost:
            r2.append(r3);
            r2.append(r8);
            android.util.Log.e(r1, r2.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0096, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
            r8 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0098, code lost:
            r1 = com.seattleclouds.location.geofencing.C5437a.f19402a;
            r2 = new java.lang.StringBuilder();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
            r3 = "Error loading config file: ";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a2, code lost:
            r8 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
            r1 = com.seattleclouds.location.geofencing.C5437a.f19402a;
            r2 = new java.lang.StringBuilder();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0097 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x000d] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a2 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:1:0x000d] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.Void... r8) {
            /*
                r7 = this;
                java.lang.String r8 = "Loading geofences..."
                com.seattleclouds.location.geofencing.C5437a.m27197c(r8)
                java.util.HashMap r8 = new java.util.HashMap
                r8.<init>()
                r0 = 0
                java.lang.String r1 = "geofencingConfig.json"
                java.io.InputStream r1 = com.seattleclouds.App.m25649e(r1)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.String r1 = com.seattleclouds.util.C6613i.m31991b(r1)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.String r2 = com.seattleclouds.util.C6592al.m31912e(r1)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                com.seattleclouds.location.geofencing.C5437a.f19404i = r2     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                r2.<init>()     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.String r3 = "New config hash: "
                r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.String r3 = com.seattleclouds.location.geofencing.C5437a.f19404i     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.String r2 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                com.seattleclouds.location.geofencing.C5437a.m27197c(r2)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                r2.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.String r1 = "items"
                org.json.JSONArray r1 = r2.getJSONArray(r1)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                r2 = 0
            L_0x0040:
                int r3 = r1.length()     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                if (r2 >= r3) goto L_0x0079
                org.json.JSONObject r3 = r1.getJSONObject(r2)     // Catch:{ JSONException -> 0x004f, IllegalArgumentException -> 0x00a2, IOException -> 0x0097 }
                com.seattleclouds.location.geofencing.c r3 = com.seattleclouds.location.geofencing.C5450c.m27234a(r3)     // Catch:{ JSONException -> 0x004f, IllegalArgumentException -> 0x00a2, IOException -> 0x0097 }
                goto L_0x0067
            L_0x004f:
                r3 = move-exception
                java.lang.String r4 = com.seattleclouds.location.geofencing.C5437a.f19402a     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                r5.<init>()     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.String r6 = "Error parsing geofence: "
                r5.append(r6)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.String r5 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                android.util.Log.w(r4, r5, r3)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                r3 = r0
            L_0x0067:
                if (r3 == 0) goto L_0x0076
                boolean r4 = r3.mo17767k()     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                if (r4 == 0) goto L_0x0076
                java.lang.String r4 = r3.mo17755a()     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                r8.put(r4, r3)     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
            L_0x0076:
                int r2 = r2 + 1
                goto L_0x0040
            L_0x0079:
                com.seattleclouds.location.geofencing.C5437a.f19403e = r8     // Catch:{ IllegalArgumentException -> 0x00a2, IOException -> 0x0097, JSONException -> 0x007f }
                java.lang.String r8 = "ok"
                return r8
            L_0x007f:
                r8 = move-exception
                java.lang.String r1 = com.seattleclouds.location.geofencing.C5437a.f19402a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Error parsing config file: "
            L_0x0089:
                r2.append(r3)
                r2.append(r8)
                java.lang.String r8 = r2.toString()
                android.util.Log.e(r1, r8)
                return r0
            L_0x0097:
                r8 = move-exception
                java.lang.String r1 = com.seattleclouds.location.geofencing.C5437a.f19402a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
            L_0x009f:
                java.lang.String r3 = "Error loading config file: "
                goto L_0x0089
            L_0x00a2:
                r8 = move-exception
                java.lang.String r1 = com.seattleclouds.location.geofencing.C5437a.f19402a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                goto L_0x009f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.location.geofencing.C5437a.C5447a.doInBackground(java.lang.Void[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            this.f19421a.mo17741a(str != null ? 0 : 1, C5437a.f19403e);
        }
    }

    /* renamed from: com.seattleclouds.location.geofencing.a$b */
    public interface C5448b {
        /* renamed from: a */
        void mo17741a(int i, Map<String, C5450c> map);
    }

    public C5437a(Context context) {
        this.f19407d = context;
        this.f19408f = 3;
    }

    /* renamed from: a */
    public static Boolean m27181a(Context context) {
        return Boolean.valueOf(context.getSharedPreferences(m27201e(), 0).getBoolean("geofenceAvailable", true));
    }

    /* renamed from: a */
    public static void m27185a(Context context, Boolean bool) {
        Editor edit = context.getSharedPreferences(m27201e(), 0).edit();
        edit.putBoolean("geofenceAvailable", bool.booleanValue());
        edit.apply();
    }

    /* renamed from: a */
    public static void m27186a(C5448b bVar) {
        m27190a(false, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27189a(List<C4515b> list, PendingIntent pendingIntent, C4795e<Void> eVar, C4794d dVar) {
        if (list.size() > 0) {
            GeofencingRequest a = new C4512a().mo14955a(list).mo14953a(1).mo14956a();
            if (C0345a.m2065b(this.f19407d, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                m27193b(this.f19407d);
                m27209k();
                return;
            }
            this.f19405b.mo14979a(a, pendingIntent).mo15916a(eVar).mo15915a(dVar);
        } else {
            m27208j();
        }
    }

    /* renamed from: a */
    public static void m27190a(boolean z, C5448b bVar) {
        if (z || f19403e == null) {
            new C5447a(bVar).execute(new Void[0]);
        } else {
            bVar.mo17741a(0, f19403e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public List<C4515b> m27192b(Map<String, C5450c> map) {
        ArrayList arrayList = new ArrayList();
        for (C5450c l : map.values()) {
            arrayList.add(l.mo17768l());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m27193b(Context context) {
        Intent intent = new Intent(context, AppStarterActivity.class);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 0);
        intent.setFlags(268435456);
        C0424d dVar = new C0424d(context, "geo_fence");
        dVar.mo1713a(C5457f.ic_notif_warning);
        dVar.mo1717a(activity);
        dVar.mo1730b(true);
        dVar.mo1723a((CharSequence) context.getString(C5462k.geofences_permission_location_notif_title));
        String string = context.getString(C5462k.geofences_permission_location_notif_text);
        Object[] objArr = new Object[1];
        objArr[0] = App.f18468A == null ? "App" : App.f18468A;
        dVar.mo1729b((CharSequence) String.format(string, objArr));
        C6645y.m32098a(1, dVar.mo1712a(), "geo_fence");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m27197c(String str) {
    }

    /* renamed from: c */
    private boolean m27198c(Context context) {
        C3177d a = C3177d.m14629a();
        int a2 = a.mo11106a(context);
        if (a2 == 0) {
            return true;
        }
        if (a.mo11114a(a2)) {
            if (context instanceof Activity) {
                a.mo11107a((Activity) context, a2, 9000).show();
            } else {
                a.mo11113a(this.f19407d, a2);
            }
        }
        return false;
    }

    /* renamed from: e */
    private static String m27201e() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.seattleclouds.location.geofencing.GeofenceManager.");
        sb.append(App.f18522x);
        sb.append(".");
        sb.append(App.f18523y);
        sb.append(".");
        sb.append(App.f18524z);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Geofence Mananger prefs name: ");
        sb3.append(sb2);
        m27197c(sb3.toString());
        return sb2;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m27204f() {
        C4796f a;
        C4794d r1;
        this.f19406c = m27205g();
        if (this.f19408f == 1) {
            m27197c("ACTION_REGISTER_GEOFENCES");
            a = this.f19405b.mo14978a(this.f19406c).mo15916a((C4795e<? super TResult>) new C4795e<Void>() {
                /* renamed from: a */
                public void mo15914a(Void voidR) {
                    C5437a.m27197c("removeGeofences SUCCESS");
                    C5437a.this.m27209k();
                    C5437a.this.m27189a(C5437a.this.m27192b(C5437a.f19403e), C5437a.this.f19406c, new C4795e<Void>() {
                        /* renamed from: a */
                        public void mo15914a(Void voidR) {
                            C5437a.m27197c("addGeofences SUCCESS");
                            C5437a.this.m27208j();
                            C5437a.m27185a(C5437a.this.f19407d, Boolean.valueOf(true));
                        }
                    }, new C4794d() {
                        /* renamed from: a */
                        public void mo15913a(Exception exc) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("addGeofences FAILURE: ");
                            sb.append(exc.getMessage());
                            C5437a.m27197c(sb.toString());
                        }
                    });
                }
            });
            r1 = new C4794d() {
                /* renamed from: a */
                public void mo15913a(Exception exc) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeGeofences FAILURE: ");
                    sb.append(exc.getMessage());
                    C5437a.m27197c(sb.toString());
                }
            };
        } else if (this.f19408f == 2) {
            m27197c("ACTION_REMOVE_GEOFENCES");
            a = this.f19405b.mo14978a(this.f19406c).mo15916a((C4795e<? super TResult>) new C4795e<Void>() {
                /* renamed from: a */
                public void mo15914a(Void voidR) {
                    C5437a.this.m27209k();
                    C5437a.m27197c("removeGeofences SUCCESS");
                }
            });
            r1 = new C4794d() {
                /* renamed from: a */
                public void mo15913a(Exception exc) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("removeGeofences FAILURE: ");
                    sb.append(exc.getMessage());
                    C5437a.m27197c(sb.toString());
                }
            };
        } else {
            if (this.f19408f == 0) {
                m27197c("ACTION_RESTORE_GEOFECES");
                m27189a(m27192b(f19403e), this.f19406c, new C4795e<Void>() {
                    /* renamed from: a */
                    public void mo15914a(Void voidR) {
                        C5437a.m27197c("addGeofences SUCCESS");
                        C5437a.m27185a(C5437a.this.f19407d, Boolean.valueOf(true));
                    }
                }, new C4794d() {
                    /* renamed from: a */
                    public void mo15913a(Exception exc) {
                        C5437a.m27197c("addGeofences FAILURE");
                    }
                });
            } else if (this.f19408f == 3) {
                m27197c("ACTION_ONLY_CONNECT");
            }
            C6595ao.m31929a(this.f19407d, "Start geofence service", Boolean.valueOf(false));
        }
        a.mo15915a(r1);
        C6595ao.m31929a(this.f19407d, "Start geofence service", Boolean.valueOf(false));
    }

    /* renamed from: g */
    private PendingIntent m27205g() {
        Intent intent = new Intent(this.f19407d, ReceiveTransitionBroadcastReceiver.class);
        intent.setAction(ReceiveTransitionBroadcastReceiver.f19399b);
        return PendingIntent.getBroadcast(this.f19407d, 0, intent, 134217728);
    }

    /* renamed from: h */
    private void m27206h() {
        SharedPreferences sharedPreferences = this.f19407d.getSharedPreferences(m27201e(), 0);
        this.f19410h = sharedPreferences.getString("configHash", "");
        this.f19411j = sharedPreferences.getBoolean("geofencesRegistered", false);
    }

    /* renamed from: i */
    private void m27207i() {
        Editor edit = this.f19407d.getSharedPreferences(m27201e(), 0).edit();
        edit.putString("configHash", this.f19410h);
        edit.putBoolean("geofencesRegistered", this.f19411j);
        edit.commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m27208j() {
        this.f19411j = true;
        this.f19410h = f19404i;
        m27207i();
        m27197c("Geofence refreshing process finished");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m27209k() {
        this.f19411j = false;
        this.f19410h = "";
        m27207i();
        m27197c("Geofence removing process finished");
    }

    /* renamed from: l */
    private void m27210l() {
        ComponentName componentName = new ComponentName(this.f19407d, LocationProvidersChangedBroadcastReceiver.class);
        PackageManager packageManager = this.f19407d.getPackageManager();
        if (packageManager.getComponentEnabledSetting(componentName) == 2) {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        }
    }

    /* renamed from: m */
    private void m27211m() {
        ComponentName componentName = new ComponentName(this.f19407d, LocationProvidersChangedBroadcastReceiver.class);
        PackageManager packageManager = this.f19407d.getPackageManager();
        if (packageManager.getComponentEnabledSetting(componentName) == 1) {
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        }
    }

    /* renamed from: a */
    public void mo17742a() {
        if (!App.f18501c.mo16908J() && !this.f19411j) {
            m27211m();
            m27197c("Geofencing disabled, there are NO registered geofences => Do nothing");
        } else if (App.f18501c.mo16908J() || !this.f19411j) {
            m27210l();
            m27190a(true, (C5448b) new C5448b() {
                /* renamed from: a */
                public void mo17741a(int i, Map<String, C5450c> map) {
                    String str;
                    if (i == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Geofences loaded from config: ");
                        sb.append(Arrays.toString(map.values().toArray()));
                        C5437a.m27197c(sb.toString());
                        if (!C5437a.this.f19410h.equals(C5437a.f19404i)) {
                            C5437a.m27197c("Geofences configuration has changed => refreshing");
                            C5437a.this.f19408f = 1;
                            C5437a.this.m27204f();
                        }
                        str = "Geofences configuration has NOT changed => do nothing";
                    } else {
                        str = "Geofences failed to load. Nothing to refresh";
                    }
                    C5437a.m27197c(str);
                    C5437a.this.m27204f();
                }
            });
        } else {
            m27211m();
            m27197c("Geofencing disabled, there are registered geofences => Remove all currently registered geofences");
            this.f19408f = 2;
            m27204f();
        }
    }

    /* renamed from: a */
    public void mo17743a(boolean z) {
        if (m27198c(this.f19407d)) {
            m27206h();
            this.f19405b = C4522h.m22613a(App.m25647e());
            if (!z) {
                this.f19408f = 0;
            }
            mo17742a();
            return;
        }
        m27211m();
    }

    /* renamed from: a */
    public boolean mo17744a(int i, int i2, Intent intent) {
        m27197c("Processing activity result...");
        if (i != 9000) {
            return false;
        }
        if (C3177d.m14629a().mo11106a(this.f19407d) == 0) {
            mo17742a();
        } else {
            Log.w(f19402a, this.f19407d.getString(C5462k.no_resolution));
        }
        return true;
    }

    /* renamed from: b */
    public void mo17745b(boolean z) {
        this.f19409g = z;
    }

    /* renamed from: b */
    public boolean mo17746b() {
        return this.f19409g;
    }
}
