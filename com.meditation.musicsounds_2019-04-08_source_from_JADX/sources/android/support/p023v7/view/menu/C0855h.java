package android.support.p023v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p012b.p013a.C0427a;
import android.support.p023v7.p024a.C0726a.C0728b;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.h */
public class C0855h implements C0427a {

    /* renamed from: d */
    private static final int[] f2625d = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    CharSequence f2626a;

    /* renamed from: b */
    Drawable f2627b;

    /* renamed from: c */
    View f2628c;

    /* renamed from: e */
    private final Context f2629e;

    /* renamed from: f */
    private final Resources f2630f;

    /* renamed from: g */
    private boolean f2631g;

    /* renamed from: h */
    private boolean f2632h;

    /* renamed from: i */
    private C0856a f2633i;

    /* renamed from: j */
    private ArrayList<C0859j> f2634j;

    /* renamed from: k */
    private ArrayList<C0859j> f2635k;

    /* renamed from: l */
    private boolean f2636l;

    /* renamed from: m */
    private ArrayList<C0859j> f2637m;

    /* renamed from: n */
    private ArrayList<C0859j> f2638n;

    /* renamed from: o */
    private boolean f2639o;

    /* renamed from: p */
    private int f2640p = 0;

    /* renamed from: q */
    private ContextMenuInfo f2641q;

    /* renamed from: r */
    private boolean f2642r = false;

    /* renamed from: s */
    private boolean f2643s = false;

    /* renamed from: t */
    private boolean f2644t = false;

    /* renamed from: u */
    private boolean f2645u = false;

    /* renamed from: v */
    private boolean f2646v = false;

    /* renamed from: w */
    private ArrayList<C0859j> f2647w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<C0871o>> f2648x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0859j f2649y;

    /* renamed from: z */
    private boolean f2650z;

    /* renamed from: android.support.v7.view.menu.h$a */
    public interface C0856a {
        /* renamed from: a */
        void mo639a(C0855h hVar);

        /* renamed from: a */
        boolean mo640a(C0855h hVar, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.h$b */
    public interface C0857b {
        /* renamed from: a */
        boolean mo3368a(C0859j jVar);
    }

    public C0855h(Context context) {
        this.f2629e = context;
        this.f2630f = context.getResources();
        this.f2634j = new ArrayList<>();
        this.f2635k = new ArrayList<>();
        this.f2636l = true;
        this.f2637m = new ArrayList<>();
        this.f2638n = new ArrayList<>();
        this.f2639o = true;
        m4090e(true);
    }

    /* renamed from: a */
    private static int m4083a(ArrayList<C0859j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0859j) arrayList.get(size)).mo3561c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C0859j m4084a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        C0859j jVar = new C0859j(this, i, i2, i3, i4, charSequence, i5);
        return jVar;
    }

    /* renamed from: a */
    private void m4085a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d = mo3515d();
        if (view != null) {
            this.f2628c = view;
            this.f2626a = null;
            this.f2627b = null;
        } else {
            if (i > 0) {
                this.f2626a = d.getText(i);
            } else if (charSequence != null) {
                this.f2626a = charSequence;
            }
            if (i2 > 0) {
                this.f2627b = C0452b.m2059a(mo3519e(), i2);
            } else if (drawable != null) {
                this.f2627b = drawable;
            }
            this.f2628c = null;
        }
        mo359a(false);
    }

    /* renamed from: a */
    private void m4086a(int i, boolean z) {
        if (i >= 0 && i < this.f2634j.size()) {
            this.f2634j.remove(i);
            if (z) {
                mo359a(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m4087a(C0881u uVar, C0871o oVar) {
        boolean z = false;
        if (this.f2648x.isEmpty()) {
            return false;
        }
        if (oVar != null) {
            z = oVar.mo328a(uVar);
        }
        Iterator it = this.f2648x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0871o oVar2 = (C0871o) weakReference.get();
            if (oVar2 == null) {
                this.f2648x.remove(weakReference);
            } else if (!z) {
                z = oVar2.mo328a(uVar);
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m4088d(boolean z) {
        if (!this.f2648x.isEmpty()) {
            mo3523g();
            Iterator it = this.f2648x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0871o oVar = (C0871o) weakReference.get();
                if (oVar == null) {
                    this.f2648x.remove(weakReference);
                } else {
                    oVar.mo325a(z);
                }
            }
            mo3525h();
        }
    }

    /* renamed from: e */
    private void m4089e(Bundle bundle) {
        if (!this.f2648x.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f2648x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0871o oVar = (C0871o) weakReference.get();
                if (oVar == null) {
                    this.f2648x.remove(weakReference);
                } else {
                    int b = oVar.mo329b();
                    if (b > 0) {
                        Parcelable c = oVar.mo334c();
                        if (c != null) {
                            sparseArray.put(b, c);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: e */
    private void m4090e(boolean z) {
        boolean z2 = true;
        if (!z || this.f2630f.getConfiguration().keyboard == 1 || !this.f2630f.getBoolean(C0728b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            z2 = false;
        }
        this.f2632h = z2;
    }

    /* renamed from: f */
    private static int m4091f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 < 0 || i2 >= f2625d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (i & 65535) | (f2625d[i2] << 16);
    }

    /* renamed from: f */
    private void m4092f(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f2648x.isEmpty()) {
            Iterator it = this.f2648x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0871o oVar = (C0871o) weakReference.get();
                if (oVar == null) {
                    this.f2648x.remove(weakReference);
                } else {
                    int b = oVar.mo329b();
                    if (b > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(b);
                        if (parcelable != null) {
                            oVar.mo319a(parcelable);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo3475a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C0859j) this.f2634j.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: a */
    public C0855h mo3476a(int i) {
        this.f2640p = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0855h mo3477a(Drawable drawable) {
        m4085a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0855h mo3478a(View view) {
        m4085a(0, null, 0, null, view);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0855h mo3479a(CharSequence charSequence) {
        m4085a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0859j mo3480a(int i, KeyEvent keyEvent) {
        ArrayList<C0859j> arrayList = this.f2647w;
        arrayList.clear();
        mo3489a((List<C0859j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0859j) arrayList.get(0);
        }
        boolean b = mo3506b();
        for (int i2 = 0; i2 < size; i2++) {
            C0859j jVar = (C0859j) arrayList.get(i2);
            char alphabeticShortcut = b ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
            if ((alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) || (b && alphabeticShortcut == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo3481a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m4091f(i3);
        C0859j a = m4084a(i, i2, i3, f, charSequence, this.f2640p);
        if (this.f2641q != null) {
            a.mo3556a(this.f2641q);
        }
        this.f2634j.add(m4083a(this.f2634j, f), a);
        mo359a(true);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo3482a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: a */
    public void mo3483a(Bundle bundle) {
        m4089e(bundle);
    }

    /* renamed from: a */
    public void mo3484a(C0856a aVar) {
        this.f2633i = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3485a(C0859j jVar) {
        this.f2636l = true;
        mo359a(true);
    }

    /* renamed from: a */
    public void mo3486a(C0871o oVar) {
        mo3487a(oVar, this.f2629e);
    }

    /* renamed from: a */
    public void mo3487a(C0871o oVar, Context context) {
        this.f2648x.add(new WeakReference(oVar));
        oVar.mo316a(context, this);
        this.f2639o = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3488a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2634j.size();
        mo3523g();
        for (int i = 0; i < size; i++) {
            C0859j jVar = (C0859j) this.f2634j.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo3568g() && jVar.isCheckable()) {
                jVar.mo3559b(jVar == menuItem);
            }
        }
        mo3525h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3489a(List<C0859j> list, int i, KeyEvent keyEvent) {
        boolean b = mo3506b();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f2634j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0859j jVar = (C0859j) this.f2634j.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0855h) jVar.getSubMenu()).mo3489a(list, i, keyEvent);
                }
                char alphabeticShortcut = b ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & 69647) == ((b ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b && alphabeticShortcut == 8 && i == 67)) && jVar.isEnabled())) {
                    list.add(jVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo359a(boolean z) {
        if (!this.f2642r) {
            if (z) {
                this.f2636l = true;
                this.f2639o = true;
            }
            m4088d(z);
            return;
        }
        this.f2643s = true;
        if (z) {
            this.f2644t = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3490a(C0855h hVar, MenuItem menuItem) {
        return this.f2633i != null && this.f2633i.mo640a(hVar, menuItem);
    }

    /* renamed from: a */
    public boolean mo3491a(MenuItem menuItem, int i) {
        return mo3492a(menuItem, (C0871o) null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3492a(android.view.MenuItem r7, android.support.p023v7.view.menu.C0871o r8, int r9) {
        /*
            r6 = this;
            android.support.v7.view.menu.j r7 = (android.support.p023v7.view.menu.C0859j) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.mo3560b()
            android.support.v4.view.b r2 = r7.mo1745a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo2432e()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            boolean r5 = r7.mo3592n()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.mo3505b(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.mo3505b(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            android.support.v7.view.menu.u r9 = new android.support.v7.view.menu.u
            android.content.Context r0 = r6.mo3519e()
            r9.<init>(r0, r6, r7)
            r7.mo3555a(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            android.support.v7.view.menu.u r7 = (android.support.p023v7.view.menu.C0881u) r7
            if (r4 == 0) goto L_0x0063
            r2.mo2427a(r7)
        L_0x0063:
            boolean r7 = r6.m4087a(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.view.menu.C0855h.mo3492a(android.view.MenuItem, android.support.v7.view.menu.o, int):boolean");
    }

    public MenuItem add(int i) {
        return mo3481a(0, 0, 0, this.f2630f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo3481a(i, i2, i3, this.f2630f.getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo3481a(i, i2, i3, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo3481a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f2629e.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f2630f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f2630f.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0859j jVar = (C0859j) mo3481a(i, i2, i3, charSequence);
        C0881u uVar = new C0881u(this.f2629e, this, jVar);
        jVar.mo3555a(uVar);
        return uVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public int mo3501b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0859j) this.f2634j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo3502b(Bundle bundle) {
        m4092f(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3503b(C0859j jVar) {
        this.f2639o = true;
        mo359a(true);
    }

    /* renamed from: b */
    public void mo3504b(C0871o oVar) {
        Iterator it = this.f2648x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0871o oVar2 = (C0871o) weakReference.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.f2648x.remove(weakReference);
            }
        }
    }

    /* renamed from: b */
    public final void mo3505b(boolean z) {
        if (!this.f2646v) {
            this.f2646v = true;
            Iterator it = this.f2648x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0871o oVar = (C0871o) weakReference.get();
                if (oVar == null) {
                    this.f2648x.remove(weakReference);
                } else {
                    oVar.mo321a(this, z);
                }
            }
            this.f2646v = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3506b() {
        return this.f2631g;
    }

    /* renamed from: c */
    public int mo3507c(int i) {
        return mo3475a(i, 0);
    }

    /* renamed from: c */
    public void mo3508c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0881u) item.getSubMenu()).mo3508c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo3482a(), sparseArray);
        }
    }

    /* renamed from: c */
    public void mo3509c(boolean z) {
        this.f2650z = z;
    }

    /* renamed from: c */
    public boolean mo3510c() {
        return this.f2632h;
    }

    /* renamed from: c */
    public boolean mo3511c(C0859j jVar) {
        boolean z = false;
        if (this.f2648x.isEmpty()) {
            return false;
        }
        mo3523g();
        Iterator it = this.f2648x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0871o oVar = (C0871o) weakReference.get();
            if (oVar == null) {
                this.f2648x.remove(weakReference);
            } else {
                z = oVar.mo327a(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo3525h();
        if (z) {
            this.f2649y = jVar;
        }
        return z;
    }

    public void clear() {
        if (this.f2649y != null) {
            mo3518d(this.f2649y);
        }
        this.f2634j.clear();
        mo359a(true);
    }

    public void clearHeader() {
        this.f2627b = null;
        this.f2626a = null;
        this.f2628c = null;
        mo359a(false);
    }

    public void close() {
        mo3505b(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Resources mo3515d() {
        return this.f2630f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0855h mo3516d(int i) {
        m4085a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: d */
    public void mo3517d(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo3482a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0881u) item.getSubMenu()).mo3517d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: d */
    public boolean mo3518d(C0859j jVar) {
        boolean z = false;
        if (!this.f2648x.isEmpty() && this.f2649y == jVar) {
            mo3523g();
            Iterator it = this.f2648x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0871o oVar = (C0871o) weakReference.get();
                if (oVar == null) {
                    this.f2648x.remove(weakReference);
                } else {
                    z = oVar.mo333b(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo3525h();
            if (z) {
                this.f2649y = null;
            }
        }
        return z;
    }

    /* renamed from: e */
    public Context mo3519e() {
        return this.f2629e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0855h mo3520e(int i) {
        m4085a(0, null, i, null, null);
        return this;
    }

    /* renamed from: f */
    public void mo3521f() {
        if (this.f2633i != null) {
            this.f2633i.mo639a(this);
        }
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0859j jVar = (C0859j) this.f2634j.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu()) {
                MenuItem findItem = jVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public void mo3523g() {
        if (!this.f2642r) {
            this.f2642r = true;
            this.f2643s = false;
            this.f2644t = false;
        }
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f2634j.get(i);
    }

    /* renamed from: h */
    public void mo3525h() {
        this.f2642r = false;
        if (this.f2643s) {
            this.f2643s = false;
            mo359a(this.f2644t);
        }
    }

    public boolean hasVisibleItems() {
        if (this.f2650z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0859j) this.f2634j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public ArrayList<C0859j> mo3527i() {
        if (!this.f2636l) {
            return this.f2635k;
        }
        this.f2635k.clear();
        int size = this.f2634j.size();
        for (int i = 0; i < size; i++) {
            C0859j jVar = (C0859j) this.f2634j.get(i);
            if (jVar.isVisible()) {
                this.f2635k.add(jVar);
            }
        }
        this.f2636l = false;
        this.f2639o = true;
        return this.f2635k;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo3480a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public void mo3529j() {
        ArrayList i = mo3527i();
        if (this.f2639o) {
            Iterator it = this.f2648x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0871o oVar = (C0871o) weakReference.get();
                if (oVar == null) {
                    this.f2648x.remove(weakReference);
                } else {
                    z |= oVar.mo326a();
                }
            }
            if (z) {
                this.f2637m.clear();
                this.f2638n.clear();
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0859j jVar = (C0859j) i.get(i2);
                    (jVar.mo3588j() ? this.f2637m : this.f2638n).add(jVar);
                }
            } else {
                this.f2637m.clear();
                this.f2638n.clear();
                this.f2638n.addAll(mo3527i());
            }
            this.f2639o = false;
        }
    }

    /* renamed from: k */
    public ArrayList<C0859j> mo3530k() {
        mo3529j();
        return this.f2637m;
    }

    /* renamed from: l */
    public ArrayList<C0859j> mo3531l() {
        mo3529j();
        return this.f2638n;
    }

    /* renamed from: m */
    public CharSequence mo3532m() {
        return this.f2626a;
    }

    /* renamed from: n */
    public Drawable mo3533n() {
        return this.f2627b;
    }

    /* renamed from: o */
    public View mo3534o() {
        return this.f2628c;
    }

    /* renamed from: p */
    public C0855h mo3535p() {
        return this;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo3491a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0859j a = mo3480a(i, keyEvent);
        boolean a2 = a != null ? mo3491a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo3505b(true);
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo3538q() {
        return this.f2645u;
    }

    /* renamed from: r */
    public C0859j mo3539r() {
        return this.f2649y;
    }

    public void removeGroup(int i) {
        int c = mo3507c(i);
        if (c >= 0) {
            int size = this.f2634j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0859j) this.f2634j.get(c)).getGroupId() != i) {
                    mo359a(true);
                } else {
                    m4086a(c, false);
                    i2 = i3;
                }
            }
            mo359a(true);
        }
    }

    public void removeItem(int i) {
        m4086a(mo3501b(i), true);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f2634j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0859j jVar = (C0859j) this.f2634j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo3557a(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f2634j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0859j jVar = (C0859j) this.f2634j.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f2634j.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0859j jVar = (C0859j) this.f2634j.get(i2);
            if (jVar.getGroupId() == i && jVar.mo3562c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo359a(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f2631g = z;
        mo359a(false);
    }

    public int size() {
        return this.f2634j.size();
    }
}
