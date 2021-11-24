package android.support.p009v4.app;

import android.support.p009v4.p019g.C0494e;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.c */
final class C0360c extends C0396q implements C0390g {

    /* renamed from: a */
    final C0377m f1030a;

    /* renamed from: b */
    ArrayList<C0361a> f1031b = new ArrayList<>();

    /* renamed from: c */
    int f1032c;

    /* renamed from: d */
    int f1033d;

    /* renamed from: e */
    int f1034e;

    /* renamed from: f */
    int f1035f;

    /* renamed from: g */
    int f1036g;

    /* renamed from: h */
    int f1037h;

    /* renamed from: i */
    boolean f1038i;

    /* renamed from: j */
    boolean f1039j = true;

    /* renamed from: k */
    String f1040k;

    /* renamed from: l */
    boolean f1041l;

    /* renamed from: m */
    int f1042m = -1;

    /* renamed from: n */
    int f1043n;

    /* renamed from: o */
    CharSequence f1044o;

    /* renamed from: p */
    int f1045p;

    /* renamed from: q */
    CharSequence f1046q;

    /* renamed from: r */
    ArrayList<String> f1047r;

    /* renamed from: s */
    ArrayList<String> f1048s;

    /* renamed from: t */
    boolean f1049t = false;

    /* renamed from: u */
    ArrayList<Runnable> f1050u;

    /* renamed from: android.support.v4.app.c$a */
    static final class C0361a {

        /* renamed from: a */
        int f1051a;

        /* renamed from: b */
        Fragment f1052b;

        /* renamed from: c */
        int f1053c;

        /* renamed from: d */
        int f1054d;

        /* renamed from: e */
        int f1055e;

        /* renamed from: f */
        int f1056f;

        C0361a() {
        }

        C0361a(int i, Fragment fragment) {
            this.f1051a = i;
            this.f1052b = fragment;
        }
    }

    public C0360c(C0377m mVar) {
        this.f1030a = mVar;
    }

    /* renamed from: a */
    private void m1494a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from");
            sb.append(" instance state.");
            throw new IllegalStateException(sb.toString());
        }
        fragment.f908B = this.f1030a;
        if (str != null) {
            if (fragment.f916J == null || str.equals(fragment.f916J)) {
                fragment.f916J = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.f916J);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            } else if (fragment.f914H == 0 || fragment.f914H == i) {
                fragment.f914H = i;
                fragment.f915I = i;
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(": was ");
                sb4.append(fragment.f914H);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            }
        }
        mo1416a(new C0361a(i2, fragment));
    }

    /* renamed from: b */
    private static boolean m1495b(C0361a aVar) {
        Fragment fragment = aVar.f1052b;
        return fragment != null && fragment.f947u && fragment.f925S != null && !fragment.f918L && !fragment.f917K && fragment.mo1262aq();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1404a(boolean z) {
        if (!this.f1041l) {
            if (C0377m.f1099a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                PrintWriter printWriter = new PrintWriter(new C0494e("FragmentManager"));
                mo1417a("  ", (FileDescriptor) null, printWriter, (String[]) null);
                printWriter.close();
            }
            this.f1041l = true;
            this.f1042m = this.f1038i ? this.f1030a.mo1560a(this) : -1;
            this.f1030a.mo1572a((C0390g) this, z);
            return this.f1042m;
        }
        throw new IllegalStateException("commit already called");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo1405a(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f1031b.size()) {
            C0361a aVar = (C0361a) this.f1031b.get(i);
            switch (aVar.f1051a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f1052b);
                    break;
                case 2:
                    Fragment fragment3 = aVar.f1052b;
                    int i2 = fragment3.f915I;
                    Fragment fragment4 = fragment2;
                    int i3 = i;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment5 = (Fragment) arrayList.get(size);
                        if (fragment5.f915I == i2) {
                            if (fragment5 == fragment3) {
                                z = true;
                            } else {
                                if (fragment5 == fragment4) {
                                    this.f1031b.add(i3, new C0361a(9, fragment5));
                                    i3++;
                                    fragment4 = null;
                                }
                                C0361a aVar2 = new C0361a(3, fragment5);
                                aVar2.f1053c = aVar.f1053c;
                                aVar2.f1055e = aVar.f1055e;
                                aVar2.f1054d = aVar.f1054d;
                                aVar2.f1056f = aVar.f1056f;
                                this.f1031b.add(i3, aVar2);
                                arrayList.remove(fragment5);
                                i3++;
                            }
                        }
                    }
                    if (z) {
                        this.f1031b.remove(i3);
                        i3--;
                    } else {
                        aVar.f1051a = 1;
                        arrayList.add(fragment3);
                    }
                    i = i3;
                    fragment2 = fragment4;
                    break;
                case 3:
                case 6:
                    arrayList.remove(aVar.f1052b);
                    if (aVar.f1052b != fragment2) {
                        break;
                    } else {
                        this.f1031b.add(i, new C0361a(9, aVar.f1052b));
                        i++;
                        fragment2 = null;
                        break;
                    }
                case 8:
                    this.f1031b.add(i, new C0361a(9, fragment2));
                    i++;
                    fragment2 = aVar.f1052b;
                    break;
            }
            i++;
        }
        return fragment2;
    }

    /* renamed from: a */
    public C0396q mo1406a() {
        if (!this.f1038i) {
            this.f1039j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: a */
    public C0396q mo1407a(int i) {
        this.f1036g = i;
        return this;
    }

    /* renamed from: a */
    public C0396q mo1408a(int i, int i2) {
        return mo1409a(i, i2, 0, 0);
    }

    /* renamed from: a */
    public C0396q mo1409a(int i, int i2, int i3, int i4) {
        this.f1032c = i;
        this.f1033d = i2;
        this.f1034e = i3;
        this.f1035f = i4;
        return this;
    }

    /* renamed from: a */
    public C0396q mo1410a(int i, Fragment fragment) {
        m1494a(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: a */
    public C0396q mo1411a(int i, Fragment fragment, String str) {
        m1494a(i, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0396q mo1412a(Fragment fragment) {
        mo1416a(new C0361a(3, fragment));
        return this;
    }

    /* renamed from: a */
    public C0396q mo1413a(Fragment fragment, String str) {
        m1494a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0396q mo1414a(String str) {
        if (this.f1039j) {
            this.f1038i = true;
            this.f1040k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1415a(C0339b bVar) {
        for (int i = 0; i < this.f1031b.size(); i++) {
            C0361a aVar = (C0361a) this.f1031b.get(i);
            if (m1495b(aVar)) {
                aVar.f1052b.mo1236a(bVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1416a(C0361a aVar) {
        this.f1031b.add(aVar);
        aVar.f1053c = this.f1032c;
        aVar.f1054d = this.f1033d;
        aVar.f1055e = this.f1034e;
        aVar.f1056f = this.f1035f;
    }

    /* renamed from: a */
    public void mo1417a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo1418a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo1418a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1040k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1042m);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1041l);
            if (this.f1036g != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1036g));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1037h));
            }
            if (!(this.f1032c == 0 && this.f1033d == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1032c));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1033d));
            }
            if (!(this.f1034e == 0 && this.f1035f == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1034e));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1035f));
            }
            if (!(this.f1043n == 0 && this.f1044o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1043n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1044o);
            }
            if (!(this.f1045p == 0 && this.f1046q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1045p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1046q);
            }
        }
        if (!this.f1031b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            sb.toString();
            int size = this.f1031b.size();
            for (int i = 0; i < size; i++) {
                C0361a aVar = (C0361a) this.f1031b.get(i);
                switch (aVar.f1051a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("cmd=");
                        sb2.append(aVar.f1051a);
                        str2 = sb2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1052b);
                if (z) {
                    if (!(aVar.f1053c == 0 && aVar.f1054d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1053c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1054d));
                    }
                    if (aVar.f1055e != 0 || aVar.f1056f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1055e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1056f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1419a(ArrayList<C0360c> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1031b.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C0361a aVar = (C0361a) this.f1031b.get(i4);
            int i5 = aVar.f1052b != null ? aVar.f1052b.f915I : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0360c cVar = (C0360c) arrayList.get(i6);
                    int size2 = cVar.f1031b.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        C0361a aVar2 = (C0361a) cVar.f1031b.get(i7);
                        if ((aVar2.f1052b != null ? aVar2.f1052b.f915I : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1420a(ArrayList<C0360c> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0377m.f1099a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f1038i) {
            this.f1030a.mo1583b(this);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo1421b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int i = 0; i < this.f1031b.size(); i++) {
            C0361a aVar = (C0361a) this.f1031b.get(i);
            int i2 = aVar.f1051a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f1052b;
                            break;
                    }
                }
                arrayList.add(aVar.f1052b);
            }
            arrayList.remove(aVar.f1052b);
        }
        return fragment;
    }

    /* renamed from: b */
    public C0396q mo1422b(int i, Fragment fragment) {
        return mo1423b(i, fragment, null);
    }

    /* renamed from: b */
    public C0396q mo1423b(int i, Fragment fragment, String str) {
        if (i != 0) {
            m1494a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: b */
    public C0396q mo1424b(Fragment fragment) {
        mo1416a(new C0361a(4, fragment));
        return this;
    }

    /* renamed from: b */
    public void mo1425b() {
        if (this.f1050u != null) {
            int size = this.f1050u.size();
            for (int i = 0; i < size; i++) {
                ((Runnable) this.f1050u.get(i)).run();
            }
            this.f1050u = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1426b(int i) {
        if (this.f1038i) {
            if (C0377m.f1099a) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            int size = this.f1031b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0361a aVar = (C0361a) this.f1031b.get(i2);
                if (aVar.f1052b != null) {
                    aVar.f1052b.f907A += i;
                    if (C0377m.f1099a) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f1052b);
                        sb2.append(" to ");
                        sb2.append(aVar.f1052b.f907A);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1427b(boolean z) {
        for (int size = this.f1031b.size() - 1; size >= 0; size--) {
            C0361a aVar = (C0361a) this.f1031b.get(size);
            Fragment fragment = aVar.f1052b;
            if (fragment != null) {
                fragment.mo1221a(C0377m.m1690d(this.f1036g), this.f1037h);
            }
            int i = aVar.f1051a;
            if (i != 1) {
                switch (i) {
                    case 3:
                        fragment.mo1267b(aVar.f1055e);
                        this.f1030a.mo1570a(fragment, false);
                        break;
                    case 4:
                        fragment.mo1267b(aVar.f1055e);
                        this.f1030a.mo1611k(fragment);
                        break;
                    case 5:
                        fragment.mo1267b(aVar.f1056f);
                        this.f1030a.mo1609j(fragment);
                        break;
                    case 6:
                        fragment.mo1267b(aVar.f1055e);
                        this.f1030a.mo1615m(fragment);
                        break;
                    case 7:
                        fragment.mo1267b(aVar.f1056f);
                        this.f1030a.mo1613l(fragment);
                        break;
                    case 8:
                        this.f1030a.mo1623p(null);
                        break;
                    case 9:
                        this.f1030a.mo1623p(fragment);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown cmd: ");
                        sb.append(aVar.f1051a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                fragment.mo1267b(aVar.f1056f);
                this.f1030a.mo1607i(fragment);
            }
            if (!(this.f1049t || aVar.f1051a == 3 || fragment == null)) {
                this.f1030a.mo1598f(fragment);
            }
        }
        if (!this.f1049t && z) {
            this.f1030a.mo1563a(this.f1030a.f1117l, true);
        }
    }

    /* renamed from: c */
    public int mo1428c() {
        return mo1404a(false);
    }

    /* renamed from: c */
    public C0396q mo1429c(Fragment fragment) {
        mo1416a(new C0361a(5, fragment));
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo1430c(int i) {
        int size = this.f1031b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0361a aVar = (C0361a) this.f1031b.get(i2);
            int i3 = aVar.f1052b != null ? aVar.f1052b.f915I : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public int mo1431d() {
        return mo1404a(true);
    }

    /* renamed from: d */
    public C0396q mo1432d(Fragment fragment) {
        mo1416a(new C0361a(6, fragment));
        return this;
    }

    /* renamed from: e */
    public C0396q mo1433e(Fragment fragment) {
        mo1416a(new C0361a(7, fragment));
        return this;
    }

    /* renamed from: e */
    public void mo1434e() {
        mo1406a();
        this.f1030a.mo1584b((C0390g) this, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo1435f() {
        int size = this.f1031b.size();
        for (int i = 0; i < size; i++) {
            C0361a aVar = (C0361a) this.f1031b.get(i);
            Fragment fragment = aVar.f1052b;
            if (fragment != null) {
                fragment.mo1221a(this.f1036g, this.f1037h);
            }
            int i2 = aVar.f1051a;
            if (i2 != 1) {
                switch (i2) {
                    case 3:
                        fragment.mo1267b(aVar.f1054d);
                        this.f1030a.mo1607i(fragment);
                        break;
                    case 4:
                        fragment.mo1267b(aVar.f1054d);
                        this.f1030a.mo1609j(fragment);
                        break;
                    case 5:
                        fragment.mo1267b(aVar.f1053c);
                        this.f1030a.mo1611k(fragment);
                        break;
                    case 6:
                        fragment.mo1267b(aVar.f1054d);
                        this.f1030a.mo1613l(fragment);
                        break;
                    case 7:
                        fragment.mo1267b(aVar.f1053c);
                        this.f1030a.mo1615m(fragment);
                        break;
                    case 8:
                        this.f1030a.mo1623p(fragment);
                        break;
                    case 9:
                        this.f1030a.mo1623p(null);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown cmd: ");
                        sb.append(aVar.f1051a);
                        throw new IllegalArgumentException(sb.toString());
                }
            } else {
                fragment.mo1267b(aVar.f1053c);
                this.f1030a.mo1570a(fragment, false);
            }
            if (!(this.f1049t || aVar.f1051a == 1 || fragment == null)) {
                this.f1030a.mo1598f(fragment);
            }
        }
        if (!this.f1049t) {
            this.f1030a.mo1563a(this.f1030a.f1117l, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo1436g() {
        for (int i = 0; i < this.f1031b.size(); i++) {
            if (m1495b((C0361a) this.f1031b.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public String mo1437h() {
        return this.f1040k;
    }

    /* renamed from: i */
    public boolean mo1438i() {
        return this.f1031b.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1042m >= 0) {
            sb.append(" #");
            sb.append(this.f1042m);
        }
        if (this.f1040k != null) {
            sb.append(" ");
            sb.append(this.f1040k);
        }
        sb.append("}");
        return sb.toString();
    }
}
