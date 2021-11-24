package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.C2980a;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.C3020a.C3024d.C3029e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements C3029e, ReflectedParcelable {
    public static final Creator<GoogleSignInOptions> CREATOR = new C2977e();

    /* renamed from: a */
    public static final Scope f10465a = new Scope("profile");

    /* renamed from: b */
    public static final Scope f10466b = new Scope("email");

    /* renamed from: c */
    public static final Scope f10467c = new Scope("openid");

    /* renamed from: d */
    public static final Scope f10468d = new Scope("https://www.googleapis.com/auth/games_lite");

    /* renamed from: e */
    public static final Scope f10469e = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: f */
    public static final GoogleSignInOptions f10470f = new C2972a().mo10694a().mo10696b().mo10697c();

    /* renamed from: g */
    public static final GoogleSignInOptions f10471g = new C2972a().mo10695a(f10468d, new Scope[0]).mo10697c();

    /* renamed from: r */
    private static Comparator<Scope> f10472r = new C2976d();

    /* renamed from: h */
    private final int f10473h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final ArrayList<Scope> f10474i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Account f10475j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f10476k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final boolean f10477l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final boolean f10478m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f10479n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f10480o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> f10481p;

    /* renamed from: q */
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> f10482q;

    /* renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    public static final class C2972a {

        /* renamed from: a */
        private Set<Scope> f10483a = new HashSet();

        /* renamed from: b */
        private boolean f10484b;

        /* renamed from: c */
        private boolean f10485c;

        /* renamed from: d */
        private boolean f10486d;

        /* renamed from: e */
        private String f10487e;

        /* renamed from: f */
        private Account f10488f;

        /* renamed from: g */
        private String f10489g;

        /* renamed from: h */
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> f10490h = new HashMap();

        public C2972a() {
        }

        public C2972a(GoogleSignInOptions googleSignInOptions) {
            C3266s.m14913a(googleSignInOptions);
            this.f10483a = new HashSet(googleSignInOptions.f10474i);
            this.f10484b = googleSignInOptions.f10477l;
            this.f10485c = googleSignInOptions.f10478m;
            this.f10486d = googleSignInOptions.f10476k;
            this.f10487e = googleSignInOptions.f10479n;
            this.f10488f = googleSignInOptions.f10475j;
            this.f10489g = googleSignInOptions.f10480o;
            this.f10490h = GoogleSignInOptions.m13867b((List<GoogleSignInOptionsExtensionParcelable>) googleSignInOptions.f10481p);
        }

        /* renamed from: a */
        public final C2972a mo10694a() {
            this.f10483a.add(GoogleSignInOptions.f10467c);
            return this;
        }

        /* renamed from: a */
        public final C2972a mo10695a(Scope scope, Scope... scopeArr) {
            this.f10483a.add(scope);
            this.f10483a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        /* renamed from: b */
        public final C2972a mo10696b() {
            this.f10483a.add(GoogleSignInOptions.f10465a);
            return this;
        }

        /* renamed from: c */
        public final GoogleSignInOptions mo10697c() {
            if (this.f10483a.contains(GoogleSignInOptions.f10469e) && this.f10483a.contains(GoogleSignInOptions.f10468d)) {
                this.f10483a.remove(GoogleSignInOptions.f10468d);
            }
            if (this.f10486d && (this.f10488f == null || !this.f10483a.isEmpty())) {
                mo10694a();
            }
            GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList(this.f10483a), this.f10488f, this.f10486d, this.f10484b, this.f10485c, this.f10487e, this.f10489g, this.f10490h, null);
            return googleSignInOptions;
        }
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, m13867b((List<GoogleSignInOptionsExtensionParcelable>) arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.f10473h = i;
        this.f10474i = arrayList;
        this.f10475j = account;
        this.f10476k = z;
        this.f10477l = z2;
        this.f10478m = z3;
        this.f10479n = str;
        this.f10480o = str2;
        this.f10481p = new ArrayList<>(map.values());
        this.f10482q = map;
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, C2976d dVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map);
    }

    /* renamed from: a */
    public static GoogleSignInOptions m13864a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", null);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(3, new ArrayList<>(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap<Integer,GoogleSignInOptionsExtensionParcelable>());
        return googleSignInOptions;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> m13867b(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.mo10710a()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    /* renamed from: i */
    private final JSONObject m13875i() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f10474i, f10472r);
            ArrayList arrayList = this.f10474i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((Scope) obj).mo10786a());
            }
            jSONObject.put("scopes", jSONArray);
            if (this.f10475j != null) {
                jSONObject.put("accountName", this.f10475j.name);
            }
            jSONObject.put("idTokenRequested", this.f10476k);
            jSONObject.put("forceCodeForRefreshToken", this.f10478m);
            jSONObject.put("serverAuthRequested", this.f10477l);
            if (!TextUtils.isEmpty(this.f10479n)) {
                jSONObject.put("serverClientId", this.f10479n);
            }
            if (!TextUtils.isEmpty(this.f10480o)) {
                jSONObject.put("hostedDomain", this.f10480o);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public ArrayList<Scope> mo10683a() {
        return new ArrayList<>(this.f10474i);
    }

    /* renamed from: b */
    public Account mo10684b() {
        return this.f10475j;
    }

    /* renamed from: c */
    public boolean mo10685c() {
        return this.f10476k;
    }

    /* renamed from: d */
    public boolean mo10686d() {
        return this.f10477l;
    }

    /* renamed from: e */
    public boolean mo10687e() {
        return this.f10478m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r3.f10475j.equals(r4.mo10684b()) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r3.f10479n.equals(r4.mo10689f()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.f10481p     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 > 0) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.f10481p     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0085
        L_0x0018:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f10474i     // Catch:{ ClassCastException -> 0x0085 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.mo10683a()     // Catch:{ ClassCastException -> 0x0085 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f10474i     // Catch:{ ClassCastException -> 0x0085 }
            java.util.ArrayList r2 = r4.mo10683a()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0085
        L_0x0035:
            android.accounts.Account r1 = r3.f10475j     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo10684b()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != 0) goto L_0x0085
            goto L_0x004c
        L_0x0040:
            android.accounts.Account r1 = r3.f10475j     // Catch:{ ClassCastException -> 0x0085 }
            android.accounts.Account r2 = r4.mo10684b()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x004c:
            java.lang.String r1 = r3.f10479n     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r4.mo10689f()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
            goto L_0x006b
        L_0x005f:
            java.lang.String r1 = r3.f10479n     // Catch:{ ClassCastException -> 0x0085 }
            java.lang.String r2 = r4.mo10689f()     // Catch:{ ClassCastException -> 0x0085 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 == 0) goto L_0x0085
        L_0x006b:
            boolean r1 = r3.f10478m     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.mo10687e()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f10476k     // Catch:{ ClassCastException -> 0x0085 }
            boolean r2 = r4.mo10685c()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r2) goto L_0x0085
            boolean r1 = r3.f10477l     // Catch:{ ClassCastException -> 0x0085 }
            boolean r4 = r4.mo10686d()     // Catch:{ ClassCastException -> 0x0085 }
            if (r1 != r4) goto L_0x0085
            r4 = 1
            return r4
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public String mo10689f() {
        return this.f10479n;
    }

    /* renamed from: g */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo10690g() {
        return this.f10481p;
    }

    /* renamed from: h */
    public final String mo10691h() {
        return m13875i().toString();
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f10474i;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Scope) obj).mo10786a());
        }
        Collections.sort(arrayList);
        return new C2980a().mo10718a((Object) arrayList).mo10718a((Object) this.f10475j).mo10718a((Object) this.f10479n).mo10719a(this.f10478m).mo10719a(this.f10476k).mo10719a(this.f10477l).mo10717a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3267a.m14955a(parcel);
        C3267a.m14960a(parcel, 1, this.f10473h);
        C3267a.m14980c(parcel, 2, mo10683a(), false);
        C3267a.m14964a(parcel, 3, (Parcelable) mo10684b(), i, false);
        C3267a.m14971a(parcel, 4, mo10685c());
        C3267a.m14971a(parcel, 5, mo10686d());
        C3267a.m14971a(parcel, 6, mo10687e());
        C3267a.m14968a(parcel, 7, mo10689f(), false);
        C3267a.m14968a(parcel, 8, this.f10480o, false);
        C3267a.m14980c(parcel, 9, mo10690g(), false);
        C3267a.m14956a(parcel, a);
    }
}
