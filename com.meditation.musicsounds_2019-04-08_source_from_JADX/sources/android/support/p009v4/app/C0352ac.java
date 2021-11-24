package android.support.p009v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.Set;

/* renamed from: android.support.v4.app.ac */
public final class C0352ac {

    /* renamed from: a */
    private final String f1018a;

    /* renamed from: b */
    private final CharSequence f1019b;

    /* renamed from: c */
    private final CharSequence[] f1020c;

    /* renamed from: d */
    private final boolean f1021d;

    /* renamed from: e */
    private final Bundle f1022e;

    /* renamed from: f */
    private final Set<String> f1023f;

    /* renamed from: a */
    static RemoteInput m1468a(C0352ac acVar) {
        return new Builder(acVar.mo1382a()).setLabel(acVar.mo1383b()).setChoices(acVar.mo1384c()).setAllowFreeFormInput(acVar.mo1387f()).addExtras(acVar.mo1388g()).build();
    }

    /* renamed from: a */
    static RemoteInput[] m1469a(C0352ac[] acVarArr) {
        if (acVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[acVarArr.length];
        for (int i = 0; i < acVarArr.length; i++) {
            remoteInputArr[i] = m1468a(acVarArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: a */
    public String mo1382a() {
        return this.f1018a;
    }

    /* renamed from: b */
    public CharSequence mo1383b() {
        return this.f1019b;
    }

    /* renamed from: c */
    public CharSequence[] mo1384c() {
        return this.f1020c;
    }

    /* renamed from: d */
    public Set<String> mo1385d() {
        return this.f1023f;
    }

    /* renamed from: e */
    public boolean mo1386e() {
        return !mo1387f() && (mo1384c() == null || mo1384c().length == 0) && mo1385d() != null && !mo1385d().isEmpty();
    }

    /* renamed from: f */
    public boolean mo1387f() {
        return this.f1021d;
    }

    /* renamed from: g */
    public Bundle mo1388g() {
        return this.f1022e;
    }
}
