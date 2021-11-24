package com.seattleclouds;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.support.p023v7.app.C0751a;
import android.support.p023v7.app.C0765d.C0766a;
import android.support.p023v7.app.C0767e;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.gms.common.C3177d;
import com.google.android.vending.expansion.downloader.C4822b;
import com.google.android.vending.expansion.downloader.C4827c;
import com.google.android.vending.expansion.downloader.C4831d;
import com.google.android.vending.expansion.downloader.C4832e;
import com.google.android.vending.expansion.downloader.C4833f;
import com.google.android.vending.expansion.downloader.C4834g;
import com.google.android.vending.expansion.downloader.DownloadProgressInfo;
import com.google.android.vending.licensing.C4860a;
import com.google.android.vending.licensing.C4866e;
import com.google.android.vending.licensing.C4870f;
import com.google.android.vending.licensing.C4877m;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.ads.C5247b;
import com.seattleclouds.ads.C5260d;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.expansion.ExpansionFilesDownloaderService;
import com.seattleclouds.gcm.C5382a;
import com.seattleclouds.mbfx.C5469b;
import com.seattleclouds.p157b.C5299a;
import com.seattleclouds.p157b.C5302b;
import com.seattleclouds.p157b.C5303c;
import com.seattleclouds.p157b.C5304d;
import com.seattleclouds.p157b.C5306e;
import com.seattleclouds.previewer.PreviewerActivity;
import com.seattleclouds.scm.C6559a;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6620n;
import java.util.HashMap;

public class AppStarterActivity extends C6348n {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C4870f f18531n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C4866e f18532o;

    /* renamed from: p */
    private ProgressDialog f18533p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Handler f18534q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Context f18535r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C4834g f18536s;

    /* renamed from: t */
    private C4832e f18537t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C4833f f18538u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public ProgressDialog f18539v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f18540w = false;

    /* renamed from: com.seattleclouds.AppStarterActivity$a */
    private class C5210a implements C4870f {
        private C5210a() {
        }

        /* renamed from: a */
        private void m25741a(final boolean z) {
            if (AppStarterActivity.this.f18534q != null) {
                AppStarterActivity.this.f18534q.post(new Runnable() {
                    public void run() {
                        AppStarterActivity.this.m25706c(z);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo15997a(int i) {
            if (!AppStarterActivity.this.isFinishing()) {
                m25741a(true);
            }
        }

        /* renamed from: b */
        public void mo15998b(int i) {
            if (!AppStarterActivity.this.isFinishing()) {
                m25741a(false);
            }
        }

        /* renamed from: c */
        public void mo15999c(int i) {
            if (!AppStarterActivity.this.isFinishing()) {
                m25741a(false);
            }
        }
    }

    /* renamed from: a */
    public static Intent m25685a(Context context) {
        Class cls = TabsAppActivity.class;
        if (App.f18501c.mo16938c() == 2) {
            cls = SimpleAppActivity.class;
        } else if (App.f18501c.mo16938c() == 4) {
            cls = SCTabsAppActivity.class;
        } else if (App.f18501c.mo16938c() == 5) {
            cls = ActionBarTabsAppActivity.class;
        } else if (App.f18501c.mo16938c() == 6) {
            cls = SCNavigationDrawerAppActivity.class;
        }
        return new Intent(context, cls);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[SYNTHETIC, Splitter:B:15:0x002a] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0031 A[SYNTHETIC, Splitter:B:22:0x0031] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m25686a(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            android.content.res.AssetManager r1 = com.seattleclouds.App.f18507i     // Catch:{ IOException -> 0x002e, all -> 0x0027 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x002e, all -> 0x0027 }
            r2.<init>()     // Catch:{ IOException -> 0x002e, all -> 0x0027 }
            java.lang.String r3 = "Main/"
            r2.append(r3)     // Catch:{ IOException -> 0x002e, all -> 0x0027 }
            r2.append(r5)     // Catch:{ IOException -> 0x002e, all -> 0x0027 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x002e, all -> 0x0027 }
            java.io.InputStream r1 = r1.open(r2)     // Catch:{ IOException -> 0x002e, all -> 0x0027 }
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r1, r5)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            return r5
        L_0x0022:
            r5 = move-exception
            r0 = r1
            goto L_0x0028
        L_0x0025:
            goto L_0x002f
        L_0x0027:
            r5 = move-exception
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            throw r5
        L_0x002e:
            r1 = r0
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.AppStarterActivity.m25686a(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private void m25691a(int i, int i2) {
        m25698a(getString(i), getString(i2));
    }

    /* renamed from: a */
    public static void m25692a(Activity activity) {
        activity.startActivity(m25685a(App.m25647e()));
    }

    /* renamed from: a */
    public static void m25693a(Activity activity, String str) {
        Intent intent = new Intent(activity, AppStarterActivity.class);
        intent.putExtra("startedInApp", true);
        intent.putExtra("startedTemplateId", str);
        activity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25697a(IllegalArgumentException illegalArgumentException) {
        Log.e("AppStarterActivity", "Invalid Application Licensing Public Key", illegalArgumentException);
        if (this.f18533p != null) {
            this.f18533p.dismiss();
        }
        C6620n.m32029a((Context) this, C5462k.licensing_error, C5462k.licensing_invalid_public_key, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                AppStarterActivity.this.finish();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25698a(String str, String str2) {
        C6620n.m32036a((Context) this, str, str2, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AppStarterActivity.this.finish();
            }
        }, (OnCancelListener) null);
    }

    /* renamed from: b */
    public static void m25701b(Activity activity) {
        Intent a = m25685a((Context) activity);
        a.addFlags(67108864);
        activity.startActivity(a);
    }

    /* renamed from: b */
    private static void m25702b(Activity activity, String str) {
        Intent a = m25685a((Context) activity);
        a.addFlags(67108864);
        a.putExtra(str, true);
        activity.startActivity(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25704b(String str) {
        if (!isFinishing()) {
            Log.v("AppStarterActivity", "Syncing resources...");
            if (str == null) {
                C5304d dVar = new C5304d(this);
                dVar.mo17418a((C6608d) new C6608d() {
                    /* renamed from: a */
                    public void mo16855a(Object obj) {
                        if (obj instanceof HashMap) {
                            HashMap hashMap = (HashMap) obj;
                            String str = (String) hashMap.get("mustExitReason");
                            String str2 = (String) hashMap.get("migrationButtonText");
                            String str3 = (String) hashMap.get("cancelButtonText");
                            final String str4 = (String) hashMap.get("migrationPageUrl");
                            if (!(str == null || str4 == null)) {
                                C6620n.m32039a(AppStarterActivity.this, AppStarterActivity.this.getResources().getString(C5462k.error), str, new OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        AppStarterActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                                        dialogInterface.dismiss();
                                        AppStarterActivity.this.finish();
                                    }
                                }, str2, null, null, new OnClickListener() {
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.dismiss();
                                        AppStarterActivity.this.finish();
                                    }
                                }, str3, false);
                            }
                            return;
                        }
                        String str5 = (String) obj;
                        if (str5 != null) {
                            C6620n.m32032a((Context) AppStarterActivity.this, C5462k.error, str5, (OnClickListener) new OnClickListener() {
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                    AppStarterActivity.this.finish();
                                }
                            });
                        } else {
                            AppStarterActivity.this.m25727v();
                        }
                    }
                });
                dVar.execute(new String[0]);
            } else {
                C5306e eVar = new C5306e(this, str);
                eVar.mo17429a((C6608d) new C6608d() {
                    /* renamed from: a */
                    public void mo16855a(Object obj) {
                        AppStarterActivity.this.m25727v();
                    }
                });
                eVar.execute(new String[0]);
            }
        }
    }

    /* renamed from: c */
    public static void m25705c(Activity activity) {
        Intent intent = new Intent(activity, AppStarterActivity.class);
        intent.putExtra("startedInApp", true);
        activity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25706c(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("License check successful: ");
        sb.append(z);
        Log.i("AppStarterActivity", sb.toString());
        if (this.f18533p != null) {
            this.f18533p.dismiss();
        }
        if (z) {
            m25729x();
        } else {
            new C0766a(this).mo3047a(C5462k.licensing_error).mo3060b(C5462k.licensing_app_not_licensed).mo3048a(C5462k.licensing_buy, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http://market.android.com/details?id=");
                    sb.append(AppStarterActivity.this.getPackageName());
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
                    intent.setFlags(268435456);
                    AppStarterActivity.this.startActivity(intent);
                    AppStarterActivity.this.finish();
                }
            }).mo3061b(C5462k.licensing_quit, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    AppStarterActivity.this.finish();
                }
            }).mo3065b().show();
        }
    }

    /* renamed from: d */
    public static void m25709d(Activity activity) {
        m25702b(activity, "restart");
    }

    /* renamed from: e */
    public static void m25710e(Activity activity) {
        m25702b(activity, "finishApp");
    }

    @TargetApi(9)
    /* renamed from: m */
    private void m25720m() {
        setRequestedOrientation((VERSION.SDK_INT < 9 || !App.f18480M) ? 1 : 7);
    }

    /* renamed from: n */
    private void m25721n() {
        if (App.f18491X == null) {
            App.m25633b(this.f18535r);
        }
        String str = "Default.png";
        ImageView imageView = (ImageView) findViewById(C5458g.splashScreenImage);
        Drawable j = App.m25658j(str);
        if (!App.f18510l && j == null) {
            j = m25686a(str);
        }
        if (j != null) {
            imageView.setImageDrawable(j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m25722q() {
        App.m25633b(this.f18535r);
        if (App.f18474G) {
            m25726u();
        } else {
            m25704b((String) null);
        }
    }

    /* renamed from: r */
    private void m25723r() {
        Intent intent = new Intent(this, AppStarterActivity.class);
        intent.setFlags(335544320);
        Intent intent2 = getIntent();
        intent.setAction(intent2.getAction());
        if (intent2.getCategories() != null) {
            for (String addCategory : intent2.getCategories()) {
                intent.addCategory(addCategory);
            }
        }
        try {
            if (C4822b.m24121a((Context) this, PendingIntent.getActivity(this, 0, intent, 134217728), ExpansionFilesDownloaderService.class) != 0) {
                m25724s();
            } else {
                m25722q();
            }
        } catch (NameNotFoundException unused) {
            Log.e("AppStarterActivity", "Package not found!");
        }
    }

    /* renamed from: s */
    private void m25724s() {
        if (!isFinishing()) {
            this.f18540w = false;
            this.f18539v = new ProgressDialog(this);
            this.f18539v.setProgressStyle(1);
            this.f18539v.setMessage(getString(C5462k.expansion_files_downloading));
            this.f18539v.setCancelable(true);
            this.f18539v.getWindow().clearFlags(2);
            this.f18539v.setOnCancelListener(new OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    if (AppStarterActivity.this.f18538u != null) {
                        AppStarterActivity.this.f18538u.mo15968a();
                    }
                }
            });
            this.f18537t = new C4832e() {
                /* renamed from: a */
                public void mo15959a(int i) {
                    String string = AppStarterActivity.this.getString(C4831d.m24149a(i));
                    if (i != 7) {
                        if (i == 12) {
                            return;
                        }
                        if (i != 18) {
                            switch (i) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                    return;
                                case 5:
                                    if (!AppStarterActivity.this.f18540w) {
                                        AppStarterActivity.this.f18540w = true;
                                        AppStarterActivity.this.f18539v.dismiss();
                                        AppStarterActivity.this.m25722q();
                                        return;
                                    }
                                    return;
                                default:
                                    if (!AppStarterActivity.this.f18540w) {
                                        AppStarterActivity.this.f18540w = true;
                                        AppStarterActivity.this.f18539v.dismiss();
                                        AppStarterActivity.this.m25698a(AppStarterActivity.this.getString(C5462k.warning), string);
                                        return;
                                    }
                                    return;
                            }
                        }
                    }
                    if (!AppStarterActivity.this.f18540w) {
                        AppStarterActivity.this.f18540w = true;
                        AppStarterActivity.this.f18539v.dismiss();
                        AppStarterActivity.this.m25725t();
                    }
                }

                /* renamed from: a */
                public void mo15960a(Messenger messenger) {
                    AppStarterActivity.this.f18538u = C4827c.m24136a(messenger);
                    AppStarterActivity.this.f18538u.mo15970a(AppStarterActivity.this.f18536s.mo15962a());
                }

                /* renamed from: a */
                public void mo15961a(DownloadProgressInfo downloadProgressInfo) {
                    AppStarterActivity.this.f18539v.setProgress((int) ((downloadProgressInfo.f17368b * 100) / downloadProgressInfo.f17367a));
                }
            };
            this.f18536s = C4822b.m24124a(this.f18537t, ExpansionFilesDownloaderService.class);
            this.f18539v.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m25725t() {
        C0766a aVar = new C0766a(this);
        aVar.mo3047a(C5462k.warning);
        aVar.mo3060b(C5462k.expansion_files_download_stoppped);
        aVar.mo3055a((CharSequence) getString(C5462k.continue_str), (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AppStarterActivity.this.f18540w = false;
                AppStarterActivity.this.f18539v.show();
                AppStarterActivity.this.f18538u.mo15972c();
            }
        });
        aVar.mo3061b(C5462k.cancel, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AppStarterActivity.this.f18540w = true;
                AppStarterActivity.this.finish();
            }
        });
        aVar.mo3056a(false);
        aVar.mo3065b().show();
    }

    /* renamed from: u */
    private void m25726u() {
        if (!isFinishing()) {
            Log.v("AppStarterActivity", "Initializing resources...");
            C5302b bVar = new C5302b(this);
            bVar.mo17404a((C6608d) new C6608d() {
                /* renamed from: a */
                public void mo16855a(Object obj) {
                    AppStarterActivity.this.m25704b((String) null);
                }
            });
            bVar.execute(new String[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m25727v() {
        if (!isFinishing()) {
            Log.v("AppStarterActivity", "Parsing app config file...");
            C5303c cVar = new C5303c(this);
            cVar.mo17411a((C6608d) new C6608d() {
                /* renamed from: a */
                public void mo16855a(Object obj) {
                    AppStarterActivity.this.m25728w();
                }
            });
            cVar.execute(new String[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m25728w() {
        if (App.f18510l || !C5323c.m26639a()) {
            m25729x();
        } else if (C5323c.m26640b() == null) {
            m25697a(new IllegalArgumentException("Application Licensing Public Key cannot be null"));
        } else {
            this.f18533p = new ProgressDialog(this.f18535r);
            this.f18533p.setMessage(getResources().getString(C5462k.licensing_checking_license_message));
            this.f18533p.setCancelable(false);
            this.f18533p.getWindow().clearFlags(2);
            this.f18533p.show();
            new Thread(new Runnable() {
                public void run() {
                    if (AppStarterActivity.this.f18531n == null) {
                        AppStarterActivity.this.f18531n = new C5210a();
                    }
                    try {
                        if (AppStarterActivity.this.f18532o == null) {
                            AppStarterActivity.this.f18532o = new C4866e(AppStarterActivity.this.f18535r, new C4877m(AppStarterActivity.this.f18535r, new C4860a(C5323c.m26641c(), AppStarterActivity.this.getPackageName(), C5323c.m26636a(AppStarterActivity.this.f18535r))), C5323c.m26640b());
                        }
                        AppStarterActivity.this.f18532o.mo16068a(AppStarterActivity.this.f18531n);
                    } catch (IllegalArgumentException e) {
                        AppStarterActivity.this.runOnUiThread(new Runnable() {
                            public void run() {
                                AppStarterActivity.this.m25697a(e);
                            }
                        });
                    }
                }
            }).start();
        }
    }

    /* renamed from: x */
    private void m25729x() {
        if (!isFinishing()) {
            if (!App.m25667n("sc_external_storage_resources.xml")) {
                m25730y();
                return;
            }
            Log.v("AppStarterActivity", "Downloading external resources...");
            C5299a aVar = new C5299a(this);
            aVar.mo17393a((C6608d) new C6608d() {
                /* renamed from: a */
                public void mo16855a(Object obj) {
                    AppStarterActivity.this.m25730y();
                }
            });
            aVar.execute(new String[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m25730y() {
        if (!isFinishing()) {
            if (App.f18511m || App.f18512n) {
                mo16850b(this.f18535r);
            }
            App.m25679t();
            m25731z();
            C5469b.m27267d();
            Bundle extras = getIntent().getExtras();
            if (extras == null || extras.getBoolean("startMainActivity", true)) {
                m25692a((Activity) this);
            }
            App.m25623a(true);
            if (!C5260d.m26241a().mo17273c()) {
                C5247b.m26195b(this.f18535r);
            }
            App.m25617a(getApplication());
            finish();
        }
    }

    /* renamed from: z */
    private void m25731z() {
        if (!App.f18510l) {
            if (C6559a.m31717c(this) && App.f18477J) {
                C6559a.m31715a(this);
            } else if (App.f18475H || App.f18476I) {
                C5382a.m26947a();
            }
        }
    }

    /* renamed from: b */
    public void mo16850b(Context context) {
        if (C3177d.m14629a().mo11106a(context) == 0) {
            App.f18479L = true;
            return;
        }
        App.f18479L = false;
        Log.d("AppStarterActivity", "Google Play Services available=> false (not found)");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        requestWindowFeature(1);
        super.onCreate(bundle);
        C0751a i = mo3083i();
        if (i != null) {
            i.mo3003d();
        }
        if (App.f18492Y) {
            C6620n.m32029a((Context) this, C5462k.error, C5462k.error_system_try_reinstall, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    AppStarterActivity.this.finish();
                }
            });
            return;
        }
        this.f18535r = this;
        this.f18534q = new Handler();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            z = extras.getBoolean("startedInApp");
            str = extras.getString("startedTemplateId");
        } else {
            str = null;
            z = false;
        }
        if (!App.f18510l || z) {
            m25720m();
            setContentView(C5460i.app_starter);
            m25721n();
            if (App.f18510l) {
                m25704b(str);
                C5268b.m26272a().mo17307a(getApplicationContext());
            } else if (!App.f18481N) {
                m25722q();
            } else if (!Environment.getExternalStorageState().equals("mounted")) {
                m25691a(C5462k.warning, C5462k.appstart_no_external_storage);
            } else if (TextUtils.isEmpty(C5323c.m26640b())) {
                m25697a(new IllegalArgumentException("Application Licensing Public Key cannot be null or empty"));
            } else if (!C6569aa.m31796a() || C6569aa.m31797a((Context) this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                m25723r();
            } else {
                C6569aa.m31795a((C0767e) this, 1001, "android.permission.WRITE_EXTERNAL_STORAGE", new int[]{C5462k.expansion_files_permission_rationale_write_external_storage, C5462k.expansion_files_write_external_storage_permission_required_toast});
            }
        } else {
            App.m25617a(getApplication());
            startActivity(new Intent(this, PreviewerActivity.class));
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f18532o != null) {
            this.f18532o.mo16067a();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 1001) {
            return;
        }
        if (!C6569aa.m31801a(strArr, iArr, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                public void run() {
                    C6570a.m31804a(false, C5462k.expansion_files_write_external_storage_permission_denied).mo1448a(AppStarterActivity.this.mo1469g(), "permissionDialog");
                }
            }, 300);
            return;
        }
        Toast.makeText(this, C5462k.common_permission_granted, 0).show();
        m25723r();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (this.f18536s != null) {
            this.f18536s.mo15963a(this);
        }
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (this.f18536s != null) {
            this.f18536s.mo15964b(this);
        }
        super.onStop();
    }
}
