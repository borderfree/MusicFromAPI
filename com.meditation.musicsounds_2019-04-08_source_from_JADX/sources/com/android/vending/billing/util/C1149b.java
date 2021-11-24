package com.android.vending.billing.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.vending.billing.IInAppBillingService;
import com.android.vending.billing.IInAppBillingService.C1146a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.android.vending.billing.util.b */
public class C1149b {

    /* renamed from: a */
    boolean f4147a = false;

    /* renamed from: b */
    String f4148b = "IabHelper";

    /* renamed from: c */
    boolean f4149c = false;

    /* renamed from: d */
    boolean f4150d = false;

    /* renamed from: e */
    boolean f4151e = false;

    /* renamed from: f */
    boolean f4152f = false;

    /* renamed from: g */
    String f4153g = "";

    /* renamed from: h */
    Context f4154h;

    /* renamed from: i */
    IInAppBillingService f4155i;

    /* renamed from: j */
    ServiceConnection f4156j;

    /* renamed from: k */
    int f4157k;

    /* renamed from: l */
    String f4158l;

    /* renamed from: m */
    String f4159m = null;

    /* renamed from: n */
    C1158c f4160n;

    /* renamed from: com.android.vending.billing.util.b$a */
    public interface C1156a {
        /* renamed from: a */
        void mo5626a(C1163e eVar, C1161c cVar);
    }

    /* renamed from: com.android.vending.billing.util.b$b */
    public interface C1157b {
        /* renamed from: a */
        void mo5627a(List<C1163e> list, List<C1161c> list2);
    }

    /* renamed from: com.android.vending.billing.util.b$c */
    public interface C1158c {
        /* renamed from: a */
        void mo5628a(C1161c cVar, C1163e eVar);
    }

    /* renamed from: com.android.vending.billing.util.b$d */
    public interface C1159d {
        /* renamed from: a */
        void mo5629a(C1161c cVar);
    }

    /* renamed from: com.android.vending.billing.util.b$e */
    public interface C1160e {
        /* renamed from: a */
        void mo5630a(C1161c cVar, C1162d dVar);
    }

    public C1149b(Context context, String str) {
        this.f4154h = context.getApplicationContext();
        this.f4159m = str;
        mo5616c("IAB helper created.");
    }

    /* renamed from: a */
    public static String m6254a(int i) {
        StringBuilder sb;
        String str;
        String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split(TableOfContents.DEFAULT_PATH_SEPARATOR);
        String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split(TableOfContents.DEFAULT_PATH_SEPARATOR);
        if (i <= -1000) {
            int i2 = -1000 - i;
            if (i2 >= 0 && i2 < split2.length) {
                return split2[i2];
            }
            sb = new StringBuilder();
            sb.append(String.valueOf(i));
            str = ":Unknown IAB Helper Error";
        } else if (i >= 0 && i < split.length) {
            return split[i];
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(i));
            str = ":Unknown";
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    private void m6255c() {
        if (this.f4150d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5596a(Intent intent) {
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            mo5617d("Intent with no response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            mo5617d("Unexpected type for intent response code.");
            mo5617d(obj.getClass().getName());
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected type for intent response code: ");
            sb.append(obj.getClass().getName());
            throw new RuntimeException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5597a(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            mo5616c("Bundle with null response code, assuming OK (known issue)");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            if (obj instanceof Long) {
                return (int) ((Long) obj).longValue();
            }
            mo5617d("Unexpected type for bundle response code.");
            mo5617d(obj.getClass().getName());
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected type for bundle response code: ");
            sb.append(obj.getClass().getName());
            throw new RuntimeException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5598a(C1162d dVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Querying owned items, item type: ");
        sb.append(str);
        mo5616c(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Package name: ");
        sb2.append(this.f4154h.getPackageName());
        mo5616c(sb2.toString());
        int i = 0;
        String str2 = null;
        boolean z = false;
        while (true) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Calling getPurchases with continuation token: ");
            sb3.append(str2);
            mo5616c(sb3.toString());
            Bundle a = this.f4155i.mo5589a(3, this.f4154h.getPackageName(), str, str2);
            int a2 = mo5597a(a);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Owned items response: ");
            sb4.append(String.valueOf(a2));
            mo5616c(sb4.toString());
            if (a2 != 0) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("getPurchases() failed: ");
                sb5.append(m6254a(a2));
                mo5616c(sb5.toString());
                return a2;
            } else if (!a.containsKey("INAPP_PURCHASE_ITEM_LIST") || !a.containsKey("INAPP_PURCHASE_DATA_LIST") || !a.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                mo5617d("Bundle returned from getPurchases() doesn't contain required fields.");
            } else {
                ArrayList stringArrayList = a.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = a.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = a.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z2 = z;
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str3 = (String) stringArrayList2.get(i2);
                    String str4 = (String) stringArrayList3.get(i2);
                    String str5 = (String) stringArrayList.get(i2);
                    if (C1164f.m6299a(this.f4159m, str3, str4)) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("Sku is owned: ");
                        sb6.append(str5);
                        mo5616c(sb6.toString());
                        C1163e eVar = new C1163e(str, str3, str4);
                        if (TextUtils.isEmpty(eVar.mo5645c())) {
                            mo5618e("BUG: empty/null token!");
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("Purchase data: ");
                            sb7.append(str3);
                            mo5616c(sb7.toString());
                        }
                        dVar.mo5638a(eVar);
                    } else {
                        mo5618e("Purchase signature verification **FAILED**. Not adding item.");
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("   Purchase data: ");
                        sb8.append(str3);
                        mo5616c(sb8.toString());
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("   Signature: ");
                        sb9.append(str4);
                        mo5616c(sb9.toString());
                        z2 = true;
                    }
                }
                str2 = a.getString("INAPP_CONTINUATION_TOKEN");
                StringBuilder sb10 = new StringBuilder();
                sb10.append("Continuation token: ");
                sb10.append(str2);
                mo5616c(sb10.toString());
                if (TextUtils.isEmpty(str2)) {
                    if (z2) {
                        i = -1003;
                    }
                    return i;
                }
                z = z2;
            }
        }
        mo5617d("Bundle returned from getPurchases() doesn't contain required fields.");
        return -1002;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5599a(String str, C1162d dVar, List<String> list) {
        mo5616c("Querying SKU details.");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(dVar.mo5642d(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            mo5616c("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
        Bundle skuDetails = this.f4155i.getSkuDetails(3, this.f4154h.getPackageName(), str, bundle);
        if (!skuDetails.containsKey("DETAILS_LIST")) {
            int a = mo5597a(skuDetails);
            if (a != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("getSkuDetails() failed: ");
                sb.append(m6254a(a));
                mo5616c(sb.toString());
                return a;
            }
            mo5617d("getSkuDetails() returned a bundle with neither an error nor a detail list.");
            return -1002;
        }
        Iterator it = skuDetails.getStringArrayList("DETAILS_LIST").iterator();
        while (it.hasNext()) {
            C1165g gVar = new C1165g(str, (String) it.next());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Got sku details: ");
            sb2.append(gVar);
            mo5616c(sb2.toString());
            dVar.mo5639a(gVar);
        }
        return 0;
    }

    /* renamed from: a */
    public C1162d mo5600a(boolean z, List<String> list) {
        return mo5601a(z, list, null);
    }

    /* renamed from: a */
    public C1162d mo5601a(boolean z, List<String> list, List<String> list2) {
        m6255c();
        mo5609a("queryInventory");
        try {
            C1162d dVar = new C1162d();
            int a = mo5598a(dVar, "inapp");
            if (a == 0) {
                if (z) {
                    int a2 = mo5599a("inapp", dVar, list);
                    if (a2 != 0) {
                        throw new IabException(a2, "Error refreshing inventory (querying prices of items).");
                    }
                }
                if (this.f4151e) {
                    int a3 = mo5598a(dVar, "subs");
                    if (a3 != 0) {
                        throw new IabException(a3, "Error refreshing inventory (querying owned subscriptions).");
                    } else if (z) {
                        int a4 = mo5599a("subs", dVar, list);
                        if (a4 != 0) {
                            throw new IabException(a4, "Error refreshing inventory (querying prices of subscriptions).");
                        }
                    }
                }
                return dVar;
            }
            throw new IabException(a, "Error refreshing inventory (querying owned items).");
        } catch (RemoteException e) {
            throw new IabException(-1001, "Remote exception while refreshing inventory.", e);
        } catch (JSONException e2) {
            throw new IabException(-1002, "Error parsing JSON response while refreshing inventory.", e2);
        }
    }

    /* renamed from: a */
    public void mo5602a() {
        mo5616c("Disposing.");
        this.f4149c = false;
        if (this.f4156j != null) {
            mo5616c("Unbinding from service.");
            if (this.f4154h != null) {
                this.f4154h.unbindService(this.f4156j);
            }
        }
        this.f4150d = true;
        this.f4154h = null;
        this.f4156j = null;
        this.f4155i = null;
        this.f4160n = null;
    }

    /* renamed from: a */
    public void mo5603a(Activity activity, String str, int i, C1158c cVar, String str2) {
        mo5604a(activity, str, "inapp", i, cVar, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00fc, code lost:
        if (r14 == null) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00fe, code lost:
        r14.mo5628a(r10, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0126, code lost:
        if (r14 == null) goto L_0x0129;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5604a(android.app.Activity r10, java.lang.String r11, java.lang.String r12, int r13, com.android.vending.billing.util.C1149b.C1158c r14, java.lang.String r15) {
        /*
            r9 = this;
            r9.m6255c()
            java.lang.String r0 = "launchPurchaseFlow"
            r9.mo5609a(r0)
            java.lang.String r0 = "launchPurchaseFlow"
            r9.mo5615b(r0)
            java.lang.String r0 = "subs"
            boolean r0 = r12.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002c
            boolean r0 = r9.f4151e
            if (r0 != 0) goto L_0x002c
            com.android.vending.billing.util.c r10 = new com.android.vending.billing.util.c
            r11 = -1009(0xfffffffffffffc0f, float:NaN)
            java.lang.String r12 = "Subscriptions are not available."
            r10.<init>(r11, r12)
            r9.mo5614b()
            if (r14 == 0) goto L_0x002b
            r14.mo5628a(r10, r1)
        L_0x002b:
            return
        L_0x002c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r0.<init>()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r2 = "Constructing buy intent for "
            r0.append(r2)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r0.append(r11)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r2 = ", item type: "
            r0.append(r2)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r0.append(r12)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r0 = r0.toString()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r9.mo5616c(r0)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            com.android.vending.billing.IInAppBillingService r2 = r9.f4155i     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r3 = 3
            android.content.Context r0 = r9.f4154h     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r4 = r0.getPackageName()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r5 = r11
            r6 = r12
            r7 = r15
            android.os.Bundle r15 = r2.mo5590a(r3, r4, r5, r6, r7)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            int r0 = r9.mo5597a(r15)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            if (r0 == 0) goto L_0x0086
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r10.<init>()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r12 = "Unable to buy item, Error response: "
            r10.append(r12)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r12 = m6254a(r0)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r10.append(r12)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r10 = r10.toString()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r9.mo5617d(r10)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r9.mo5614b()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            com.android.vending.billing.util.c r10 = new com.android.vending.billing.util.c     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r12 = "Unable to buy item"
            r10.<init>(r0, r12)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            if (r14 == 0) goto L_0x0085
            r14.mo5628a(r10, r1)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
        L_0x0085:
            return
        L_0x0086:
            java.lang.String r0 = "BUY_INTENT"
            android.os.Parcelable r15 = r15.getParcelable(r0)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            android.app.PendingIntent r15 = (android.app.PendingIntent) r15     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r0.<init>()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r2 = "Launching buy intent for "
            r0.append(r2)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r0.append(r11)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r2 = ". Request code: "
            r0.append(r2)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r0.append(r13)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.String r0 = r0.toString()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r9.mo5616c(r0)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r9.f4157k = r13     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r9.f4160n = r14     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r9.f4158l = r12     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            android.content.IntentSender r3 = r15.getIntentSender()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r5.<init>()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r12 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            int r6 = r15.intValue()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            int r7 = r15.intValue()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            int r8 = r12.intValue()     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            r2 = r10
            r4 = r13
            r2.startIntentSenderForResult(r3, r4, r5, r6, r7, r8)     // Catch:{ SendIntentException -> 0x0102, RemoteException -> 0x00d8 }
            goto L_0x0129
        L_0x00d8:
            r10 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "RemoteException while launching purchase flow for sku "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r9.mo5617d(r11)
            r10.printStackTrace()
            r9.mo5614b()
            com.android.vending.billing.util.c r10 = new com.android.vending.billing.util.c
            r11 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.String r12 = "Remote exception while starting purchase flow"
            r10.<init>(r11, r12)
            if (r14 == 0) goto L_0x0129
        L_0x00fe:
            r14.mo5628a(r10, r1)
            goto L_0x0129
        L_0x0102:
            r10 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "SendIntentException while launching purchase flow for sku "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r9.mo5617d(r11)
            r10.printStackTrace()
            r9.mo5614b()
            com.android.vending.billing.util.c r10 = new com.android.vending.billing.util.c
            r11 = -1004(0xfffffffffffffc14, float:NaN)
            java.lang.String r12 = "Failed to send intent."
            r10.<init>(r11, r12)
            if (r14 == 0) goto L_0x0129
            goto L_0x00fe
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vending.billing.util.C1149b.mo5604a(android.app.Activity, java.lang.String, java.lang.String, int, com.android.vending.billing.util.b$c, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo5605a(final C1159d dVar) {
        m6255c();
        if (!this.f4149c) {
            mo5616c("Starting in-app billing setup.");
            this.f4156j = new ServiceConnection() {
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    if (!C1149b.this.f4150d) {
                        C1149b.this.mo5616c("Billing service connected.");
                        C1149b.this.f4155i = C1146a.m6240a(iBinder);
                        String packageName = C1149b.this.f4154h.getPackageName();
                        try {
                            C1149b.this.mo5616c("Checking for in-app billing 3 support.");
                            int a = C1149b.this.f4155i.mo5588a(3, packageName, "inapp");
                            if (a != 0) {
                                if (dVar != null) {
                                    dVar.mo5629a(new C1161c(a, "Error checking for billing v3 support."));
                                }
                                C1149b.this.f4151e = false;
                                return;
                            }
                            C1149b bVar = C1149b.this;
                            StringBuilder sb = new StringBuilder();
                            sb.append("In-app billing version 3 supported for ");
                            sb.append(packageName);
                            bVar.mo5616c(sb.toString());
                            int a2 = C1149b.this.f4155i.mo5588a(3, packageName, "subs");
                            if (a2 == 0) {
                                C1149b.this.mo5616c("Subscriptions AVAILABLE.");
                                C1149b.this.f4151e = true;
                            } else {
                                C1149b bVar2 = C1149b.this;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Subscriptions NOT AVAILABLE. Response: ");
                                sb2.append(a2);
                                bVar2.mo5616c(sb2.toString());
                            }
                            C1149b.this.f4149c = true;
                            if (dVar != null) {
                                dVar.mo5629a(new C1161c(0, "Setup successful."));
                            }
                        } catch (RemoteException e) {
                            if (dVar != null) {
                                dVar.mo5629a(new C1161c(-1001, "RemoteException while setting up in-app billing."));
                            }
                            e.printStackTrace();
                        }
                    }
                }

                public void onServiceDisconnected(ComponentName componentName) {
                    C1149b.this.mo5616c("Billing service disconnected.");
                    C1149b.this.f4155i = null;
                }
            };
            try {
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                if (!this.f4154h.getPackageManager().queryIntentServices(intent, 0).isEmpty()) {
                    this.f4154h.bindService(intent, this.f4156j, 1);
                } else if (dVar != null) {
                    dVar.mo5629a(new C1161c(3, "Billing service unavailable on device."));
                }
            } catch (NullPointerException e) {
                Log.e("IabHelper", "Billing service unavailable on device : ", e);
                if (dVar != null) {
                    dVar.mo5629a(new C1161c(3, "Billing service unavailable on device."));
                }
            }
        } else {
            throw new IllegalStateException("IAB helper is already set up.");
        }
    }

    /* renamed from: a */
    public void mo5606a(C1160e eVar) {
        mo5612a(true, null, eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5607a(C1163e eVar) {
        m6255c();
        mo5609a("consume");
        if (eVar.f4184a.equals("inapp")) {
            try {
                String c = eVar.mo5645c();
                String b = eVar.mo5644b();
                if (c == null || c.equals("")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't consume ");
                    sb.append(b);
                    sb.append(". No token.");
                    mo5617d(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PurchaseInfo is missing token for sku: ");
                    sb2.append(b);
                    sb2.append(" ");
                    sb2.append(eVar);
                    throw new IabException(-1007, sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Consuming sku: ");
                sb3.append(b);
                sb3.append(", token: ");
                sb3.append(c);
                mo5616c(sb3.toString());
                int b2 = this.f4155i.mo5591b(3, this.f4154h.getPackageName(), c);
                if (b2 == 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Successfully consumed sku: ");
                    sb4.append(b);
                    mo5616c(sb4.toString());
                    return;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Error consuming consuming sku ");
                sb5.append(b);
                sb5.append(". ");
                sb5.append(m6254a(b2));
                mo5616c(sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Error consuming sku ");
                sb6.append(b);
                throw new IabException(b2, sb6.toString());
            } catch (RemoteException e) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Remote exception while consuming. PurchaseInfo: ");
                sb7.append(eVar);
                throw new IabException(-1001, sb7.toString(), e);
            }
        } else {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Items of type '");
            sb8.append(eVar.f4184a);
            sb8.append("' can't be consumed.");
            throw new IabException(-1010, sb8.toString());
        }
    }

    /* renamed from: a */
    public void mo5608a(C1163e eVar, C1156a aVar) {
        m6255c();
        mo5609a("consume");
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar);
        mo5610a((List<C1163e>) arrayList, aVar, (C1157b) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5609a(String str) {
        if (!this.f4149c) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal state for operation (");
            sb.append(str);
            sb.append("): IAB helper is not set up.");
            mo5617d(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("IAB helper is not set up. Can't perform operation: ");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5610a(List<C1163e> list, C1156a aVar, C1157b bVar) {
        final Handler handler = new Handler();
        mo5615b("consume");
        final List<C1163e> list2 = list;
        final C1156a aVar2 = aVar;
        final C1157b bVar2 = bVar;
        C11533 r0 = new Runnable() {
            public void run() {
                final ArrayList arrayList = new ArrayList();
                for (C1163e eVar : list2) {
                    try {
                        C1149b.this.mo5607a(eVar);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Successful consume of sku ");
                        sb.append(eVar.mo5644b());
                        arrayList.add(new C1161c(0, sb.toString()));
                    } catch (IabException e) {
                        arrayList.add(e.getResult());
                    }
                }
                C1149b.this.mo5614b();
                if (!C1149b.this.f4150d && aVar2 != null) {
                    handler.post(new Runnable() {
                        public void run() {
                            aVar2.mo5626a((C1163e) list2.get(0), (C1161c) arrayList.get(0));
                        }
                    });
                }
                if (!C1149b.this.f4150d && bVar2 != null) {
                    handler.post(new Runnable() {
                        public void run() {
                            bVar2.mo5627a(list2, arrayList);
                        }
                    });
                }
            }
        };
        new Thread(r0).start();
    }

    /* renamed from: a */
    public void mo5611a(boolean z) {
        m6255c();
        this.f4147a = z;
    }

    /* renamed from: a */
    public void mo5612a(boolean z, List<String> list, C1160e eVar) {
        final Handler handler = new Handler();
        m6255c();
        mo5609a("queryInventory");
        mo5615b("refresh inventory");
        final boolean z2 = z;
        final List<String> list2 = list;
        final C1160e eVar2 = eVar;
        C11512 r0 = new Runnable() {
            public void run() {
                final C1162d dVar;
                final C1161c cVar = new C1161c(0, "Inventory refresh successful.");
                try {
                    dVar = C1149b.this.mo5600a(z2, list2);
                } catch (IabException e) {
                    cVar = e.getResult();
                    dVar = null;
                }
                C1149b.this.mo5614b();
                if (!C1149b.this.f4150d && eVar2 != null) {
                    handler.post(new Runnable() {
                        public void run() {
                            eVar2.mo5630a(cVar, dVar);
                        }
                    });
                }
            }
        };
        new Thread(r0).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01a1, code lost:
        if (r7.f4160n != null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01d3, code lost:
        if (r7.f4160n != null) goto L_0x0176;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5613a(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            int r0 = r7.f4157k
            r1 = 0
            if (r8 == r0) goto L_0x0006
            return r1
        L_0x0006:
            r7.m6255c()
            java.lang.String r8 = "handleActivityResult"
            r7.mo5609a(r8)
            r7.mo5614b()
            r8 = -1002(0xfffffffffffffc16, float:NaN)
            r0 = 1
            r2 = 0
            if (r10 != 0) goto L_0x002d
            java.lang.String r9 = "Null data in IAB activity result."
            r7.mo5617d(r9)
            com.android.vending.billing.util.c r9 = new com.android.vending.billing.util.c
            java.lang.String r10 = "Null data in IAB result"
            r9.<init>(r8, r10)
            com.android.vending.billing.util.b$c r8 = r7.f4160n
            if (r8 == 0) goto L_0x002c
            com.android.vending.billing.util.b$c r8 = r7.f4160n
            r8.mo5628a(r9, r2)
        L_0x002c:
            return r0
        L_0x002d:
            int r3 = r7.mo5596a(r10)
            java.lang.String r4 = "INAPP_PURCHASE_DATA"
            java.lang.String r4 = r10.getStringExtra(r4)
            java.lang.String r5 = "INAPP_DATA_SIGNATURE"
            java.lang.String r5 = r10.getStringExtra(r5)
            r6 = -1
            if (r9 != r6) goto L_0x0151
            if (r3 != 0) goto L_0x0151
            java.lang.String r9 = "Successful resultcode from purchase activity."
            r7.mo5616c(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "Purchase data: "
            r9.append(r3)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            r7.mo5616c(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "Data signature: "
            r9.append(r3)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r7.mo5616c(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "Extras: "
            r9.append(r3)
            android.os.Bundle r3 = r10.getExtras()
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r7.mo5616c(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r3 = "Expected item type: "
            r9.append(r3)
            java.lang.String r3 = r7.f4158l
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            r7.mo5616c(r9)
            if (r4 == 0) goto L_0x011d
            if (r5 != 0) goto L_0x00a3
            goto L_0x011d
        L_0x00a3:
            com.android.vending.billing.util.e r9 = new com.android.vending.billing.util.e     // Catch:{ JSONException -> 0x0103 }
            java.lang.String r10 = r7.f4158l     // Catch:{ JSONException -> 0x0103 }
            r9.<init>(r10, r4, r5)     // Catch:{ JSONException -> 0x0103 }
            java.lang.String r10 = r9.mo5644b()     // Catch:{ JSONException -> 0x0103 }
            java.lang.String r3 = r7.f4159m     // Catch:{ JSONException -> 0x0103 }
            boolean r3 = com.android.vending.billing.util.C1164f.m6299a(r3, r4, r5)     // Catch:{ JSONException -> 0x0103 }
            if (r3 != 0) goto L_0x00ec
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0103 }
            r1.<init>()     // Catch:{ JSONException -> 0x0103 }
            java.lang.String r3 = "Purchase signature verification FAILED for sku "
            r1.append(r3)     // Catch:{ JSONException -> 0x0103 }
            r1.append(r10)     // Catch:{ JSONException -> 0x0103 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0103 }
            r7.mo5617d(r1)     // Catch:{ JSONException -> 0x0103 }
            com.android.vending.billing.util.c r1 = new com.android.vending.billing.util.c     // Catch:{ JSONException -> 0x0103 }
            r3 = -1003(0xfffffffffffffc15, float:NaN)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0103 }
            r4.<init>()     // Catch:{ JSONException -> 0x0103 }
            java.lang.String r5 = "Signature verification failed for sku "
            r4.append(r5)     // Catch:{ JSONException -> 0x0103 }
            r4.append(r10)     // Catch:{ JSONException -> 0x0103 }
            java.lang.String r10 = r4.toString()     // Catch:{ JSONException -> 0x0103 }
            r1.<init>(r3, r10)     // Catch:{ JSONException -> 0x0103 }
            com.android.vending.billing.util.b$c r10 = r7.f4160n     // Catch:{ JSONException -> 0x0103 }
            if (r10 == 0) goto L_0x00eb
            com.android.vending.billing.util.b$c r10 = r7.f4160n     // Catch:{ JSONException -> 0x0103 }
            r10.mo5628a(r1, r9)     // Catch:{ JSONException -> 0x0103 }
        L_0x00eb:
            return r0
        L_0x00ec:
            java.lang.String r10 = "Purchase signature successfully verified."
            r7.mo5616c(r10)     // Catch:{ JSONException -> 0x0103 }
            com.android.vending.billing.util.b$c r8 = r7.f4160n
            if (r8 == 0) goto L_0x01d6
            com.android.vending.billing.util.b$c r8 = r7.f4160n
            com.android.vending.billing.util.c r10 = new com.android.vending.billing.util.c
            java.lang.String r2 = "Success"
            r10.<init>(r1, r2)
            r8.mo5628a(r10, r9)
            goto L_0x01d6
        L_0x0103:
            r9 = move-exception
            java.lang.String r10 = "Failed to parse purchase data."
            r7.mo5617d(r10)
            r9.printStackTrace()
            com.android.vending.billing.util.c r9 = new com.android.vending.billing.util.c
            java.lang.String r10 = "Failed to parse purchase data."
            r9.<init>(r8, r10)
            com.android.vending.billing.util.b$c r8 = r7.f4160n
            if (r8 == 0) goto L_0x011c
            com.android.vending.billing.util.b$c r8 = r7.f4160n
            r8.mo5628a(r9, r2)
        L_0x011c:
            return r0
        L_0x011d:
            java.lang.String r8 = "BUG: either purchaseData or dataSignature is null."
            r7.mo5617d(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Extras: "
            r8.append(r9)
            android.os.Bundle r9 = r10.getExtras()
            java.lang.String r9 = r9.toString()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.mo5616c(r8)
            com.android.vending.billing.util.c r8 = new com.android.vending.billing.util.c
            r9 = -1008(0xfffffffffffffc10, float:NaN)
            java.lang.String r10 = "IAB returned null purchaseData or dataSignature"
            r8.<init>(r9, r10)
            com.android.vending.billing.util.b$c r9 = r7.f4160n
            if (r9 == 0) goto L_0x0150
            com.android.vending.billing.util.b$c r9 = r7.f4160n
            r9.mo5628a(r8, r2)
        L_0x0150:
            return r0
        L_0x0151:
            if (r9 != r6) goto L_0x017c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Result code was OK but in-app billing response was not OK: "
            r8.append(r9)
            java.lang.String r9 = m6254a(r3)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.mo5616c(r8)
            com.android.vending.billing.util.b$c r8 = r7.f4160n
            if (r8 == 0) goto L_0x01d6
            com.android.vending.billing.util.c r8 = new com.android.vending.billing.util.c
            java.lang.String r9 = "Problem purchashing item."
            r8.<init>(r3, r9)
        L_0x0176:
            com.android.vending.billing.util.b$c r9 = r7.f4160n
            r9.mo5628a(r8, r2)
            goto L_0x01d6
        L_0x017c:
            if (r9 != 0) goto L_0x01a4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Purchase canceled - Response: "
            r8.append(r9)
            java.lang.String r9 = m6254a(r3)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.mo5616c(r8)
            com.android.vending.billing.util.c r8 = new com.android.vending.billing.util.c
            r9 = -1005(0xfffffffffffffc13, float:NaN)
            java.lang.String r10 = "User canceled."
            r8.<init>(r9, r10)
            com.android.vending.billing.util.b$c r9 = r7.f4160n
            if (r9 == 0) goto L_0x01d6
        L_0x01a3:
            goto L_0x0176
        L_0x01a4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Purchase failed. Result code: "
            r8.append(r10)
            java.lang.String r9 = java.lang.Integer.toString(r9)
            r8.append(r9)
            java.lang.String r9 = ". Response: "
            r8.append(r9)
            java.lang.String r9 = m6254a(r3)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.mo5617d(r8)
            com.android.vending.billing.util.c r8 = new com.android.vending.billing.util.c
            r9 = -1006(0xfffffffffffffc12, float:NaN)
            java.lang.String r10 = "Unknown purchase response."
            r8.<init>(r9, r10)
            com.android.vending.billing.util.b$c r9 = r7.f4160n
            if (r9 == 0) goto L_0x01d6
            goto L_0x01a3
        L_0x01d6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vending.billing.util.C1149b.mo5613a(int, int, android.content.Intent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5614b() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ending async operation: ");
        sb.append(this.f4153g);
        mo5616c(sb.toString());
        this.f4153g = "";
        this.f4152f = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5615b(String str) {
        if (!this.f4152f) {
            this.f4153g = str;
            this.f4152f = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Starting async operation: ");
            sb.append(str);
            mo5616c(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't start async operation (");
        sb2.append(str);
        sb2.append(") because another async operation(");
        sb2.append(this.f4153g);
        sb2.append(") is in progress.");
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5616c(String str) {
        if (this.f4147a) {
            Log.d(this.f4148b, str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5617d(String str) {
        String str2 = this.f4148b;
        StringBuilder sb = new StringBuilder();
        sb.append("In-app billing error: ");
        sb.append(str);
        Log.e(str2, sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5618e(String str) {
        String str2 = this.f4148b;
        StringBuilder sb = new StringBuilder();
        sb.append("In-app billing warning: ");
        sb.append(str);
        Log.w(str2, sb.toString());
    }
}
