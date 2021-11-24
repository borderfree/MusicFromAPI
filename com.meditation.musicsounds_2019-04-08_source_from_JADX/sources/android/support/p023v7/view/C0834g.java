package android.support.p023v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.p009v4.view.C0592b;
import android.support.p009v4.view.C0609g;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.view.menu.C0861k;
import android.support.p023v7.widget.C1011ag;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.view.g */
public class C0834g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f2454a = {Context.class};

    /* renamed from: b */
    static final Class<?>[] f2455b = f2454a;

    /* renamed from: c */
    final Object[] f2456c;

    /* renamed from: d */
    final Object[] f2457d = this.f2456c;

    /* renamed from: e */
    Context f2458e;

    /* renamed from: f */
    private Object f2459f;

    /* renamed from: android.support.v7.view.g$a */
    private static class C0835a implements OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f2460a = {MenuItem.class};

        /* renamed from: b */
        private Object f2461b;

        /* renamed from: c */
        private Method f2462c;

        public C0835a(Object obj, String str) {
            this.f2461b = obj;
            Class cls = obj.getClass();
            try {
                this.f2462c = cls.getMethod(str, f2460a);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f2462c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f2462c.invoke(this.f2461b, new Object[]{menuItem})).booleanValue();
                }
                this.f2462c.invoke(this.f2461b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: android.support.v7.view.g$b */
    private class C0836b {

        /* renamed from: A */
        private String f2463A;

        /* renamed from: B */
        private String f2464B;

        /* renamed from: C */
        private CharSequence f2465C;

        /* renamed from: D */
        private CharSequence f2466D;

        /* renamed from: E */
        private ColorStateList f2467E = null;

        /* renamed from: F */
        private Mode f2468F = null;

        /* renamed from: a */
        C0592b f2469a;

        /* renamed from: c */
        private Menu f2471c;

        /* renamed from: d */
        private int f2472d;

        /* renamed from: e */
        private int f2473e;

        /* renamed from: f */
        private int f2474f;

        /* renamed from: g */
        private int f2475g;

        /* renamed from: h */
        private boolean f2476h;

        /* renamed from: i */
        private boolean f2477i;

        /* renamed from: j */
        private boolean f2478j;

        /* renamed from: k */
        private int f2479k;

        /* renamed from: l */
        private int f2480l;

        /* renamed from: m */
        private CharSequence f2481m;

        /* renamed from: n */
        private CharSequence f2482n;

        /* renamed from: o */
        private int f2483o;

        /* renamed from: p */
        private char f2484p;

        /* renamed from: q */
        private int f2485q;

        /* renamed from: r */
        private char f2486r;

        /* renamed from: s */
        private int f2487s;

        /* renamed from: t */
        private int f2488t;

        /* renamed from: u */
        private boolean f2489u;

        /* renamed from: v */
        private boolean f2490v;

        /* renamed from: w */
        private boolean f2491w;

        /* renamed from: x */
        private int f2492x;

        /* renamed from: y */
        private int f2493y;

        /* renamed from: z */
        private String f2494z;

        public C0836b(Menu menu) {
            this.f2471c = menu;
            mo3319a();
        }

        /* renamed from: a */
        private char m3960a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private <T> T m3961a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = C0834g.this.f2458e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }

        /* renamed from: a */
        private void m3962a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f2489u).setVisible(this.f2490v).setEnabled(this.f2491w).setCheckable(this.f2488t >= 1).setTitleCondensed(this.f2482n).setIcon(this.f2483o);
            if (this.f2492x >= 0) {
                menuItem.setShowAsAction(this.f2492x);
            }
            if (this.f2464B != null) {
                if (!C0834g.this.f2458e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0835a(C0834g.this.mo3316a(), this.f2464B));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0859j;
            if (z2) {
                C0859j jVar = (C0859j) menuItem;
            }
            if (this.f2488t >= 2) {
                if (z2) {
                    ((C0859j) menuItem).mo3557a(true);
                } else if (menuItem instanceof C0861k) {
                    ((C0861k) menuItem).mo3613a(true);
                }
            }
            if (this.f2494z != null) {
                menuItem.setActionView((View) m3961a(this.f2494z, C0834g.f2454a, C0834g.this.f2456c));
                z = true;
            }
            if (this.f2493y > 0) {
                if (!z) {
                    menuItem.setActionView(this.f2493y);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f2469a != null) {
                C0609g.m2749a(menuItem, this.f2469a);
            }
            C0609g.m2755a(menuItem, this.f2465C);
            C0609g.m2757b(menuItem, this.f2466D);
            C0609g.m2756b(menuItem, this.f2484p, this.f2485q);
            C0609g.m2752a(menuItem, this.f2486r, this.f2487s);
            if (this.f2468F != null) {
                C0609g.m2754a(menuItem, this.f2468F);
            }
            if (this.f2467E != null) {
                C0609g.m2753a(menuItem, this.f2467E);
            }
        }

        /* renamed from: a */
        public void mo3319a() {
            this.f2472d = 0;
            this.f2473e = 0;
            this.f2474f = 0;
            this.f2475g = 0;
            this.f2476h = true;
            this.f2477i = true;
        }

        /* renamed from: a */
        public void mo3320a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0834g.this.f2458e.obtainStyledAttributes(attributeSet, C0736j.MenuGroup);
            this.f2472d = obtainStyledAttributes.getResourceId(C0736j.MenuGroup_android_id, 0);
            this.f2473e = obtainStyledAttributes.getInt(C0736j.MenuGroup_android_menuCategory, 0);
            this.f2474f = obtainStyledAttributes.getInt(C0736j.MenuGroup_android_orderInCategory, 0);
            this.f2475g = obtainStyledAttributes.getInt(C0736j.MenuGroup_android_checkableBehavior, 0);
            this.f2476h = obtainStyledAttributes.getBoolean(C0736j.MenuGroup_android_visible, true);
            this.f2477i = obtainStyledAttributes.getBoolean(C0736j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo3321b() {
            this.f2478j = true;
            m3962a(this.f2471c.add(this.f2472d, this.f2479k, this.f2480l, this.f2481m));
        }

        /* renamed from: b */
        public void mo3322b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0834g.this.f2458e.obtainStyledAttributes(attributeSet, C0736j.MenuItem);
            this.f2479k = obtainStyledAttributes.getResourceId(C0736j.MenuItem_android_id, 0);
            this.f2480l = (obtainStyledAttributes.getInt(C0736j.MenuItem_android_menuCategory, this.f2473e) & -65536) | (obtainStyledAttributes.getInt(C0736j.MenuItem_android_orderInCategory, this.f2474f) & 65535);
            this.f2481m = obtainStyledAttributes.getText(C0736j.MenuItem_android_title);
            this.f2482n = obtainStyledAttributes.getText(C0736j.MenuItem_android_titleCondensed);
            this.f2483o = obtainStyledAttributes.getResourceId(C0736j.MenuItem_android_icon, 0);
            this.f2484p = m3960a(obtainStyledAttributes.getString(C0736j.MenuItem_android_alphabeticShortcut));
            this.f2485q = obtainStyledAttributes.getInt(C0736j.MenuItem_alphabeticModifiers, 4096);
            this.f2486r = m3960a(obtainStyledAttributes.getString(C0736j.MenuItem_android_numericShortcut));
            this.f2487s = obtainStyledAttributes.getInt(C0736j.MenuItem_numericModifiers, 4096);
            this.f2488t = obtainStyledAttributes.hasValue(C0736j.MenuItem_android_checkable) ? obtainStyledAttributes.getBoolean(C0736j.MenuItem_android_checkable, false) : this.f2475g;
            this.f2489u = obtainStyledAttributes.getBoolean(C0736j.MenuItem_android_checked, false);
            this.f2490v = obtainStyledAttributes.getBoolean(C0736j.MenuItem_android_visible, this.f2476h);
            this.f2491w = obtainStyledAttributes.getBoolean(C0736j.MenuItem_android_enabled, this.f2477i);
            this.f2492x = obtainStyledAttributes.getInt(C0736j.MenuItem_showAsAction, -1);
            this.f2464B = obtainStyledAttributes.getString(C0736j.MenuItem_android_onClick);
            this.f2493y = obtainStyledAttributes.getResourceId(C0736j.MenuItem_actionLayout, 0);
            this.f2494z = obtainStyledAttributes.getString(C0736j.MenuItem_actionViewClass);
            this.f2463A = obtainStyledAttributes.getString(C0736j.MenuItem_actionProviderClass);
            boolean z = this.f2463A != null;
            if (z && this.f2493y == 0 && this.f2494z == null) {
                this.f2469a = (C0592b) m3961a(this.f2463A, C0834g.f2455b, C0834g.this.f2457d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f2469a = null;
            }
            this.f2465C = obtainStyledAttributes.getText(C0736j.MenuItem_contentDescription);
            this.f2466D = obtainStyledAttributes.getText(C0736j.MenuItem_tooltipText);
            if (obtainStyledAttributes.hasValue(C0736j.MenuItem_iconTintMode)) {
                this.f2468F = C1011ag.m5518a(obtainStyledAttributes.getInt(C0736j.MenuItem_iconTintMode, -1), this.f2468F);
            } else {
                this.f2468F = null;
            }
            if (obtainStyledAttributes.hasValue(C0736j.MenuItem_iconTint)) {
                this.f2467E = obtainStyledAttributes.getColorStateList(C0736j.MenuItem_iconTint);
            } else {
                this.f2467E = null;
            }
            obtainStyledAttributes.recycle();
            this.f2478j = false;
        }

        /* renamed from: c */
        public SubMenu mo3323c() {
            this.f2478j = true;
            SubMenu addSubMenu = this.f2471c.addSubMenu(this.f2472d, this.f2479k, this.f2480l, this.f2481m);
            m3962a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo3324d() {
            return this.f2478j;
        }
    }

    public C0834g(Context context) {
        super(context);
        this.f2458e = context;
        this.f2456c = new Object[]{context};
    }

    /* renamed from: a */
    private Object m3957a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = m3957a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* renamed from: a */
    private void m3958a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0836b bVar = new C0836b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!z2) {
                        String name2 = xmlPullParser.getName();
                        if (!name2.equals("group")) {
                            if (!name2.equals("item")) {
                                if (!name2.equals("menu")) {
                                    str = name2;
                                    z2 = true;
                                    break;
                                } else {
                                    m3958a(xmlPullParser, attributeSet, bVar.mo3323c());
                                    break;
                                }
                            } else {
                                bVar.mo3322b(attributeSet);
                                break;
                            }
                        } else {
                            bVar.mo3320a(attributeSet);
                            break;
                        }
                    } else {
                        break;
                    }
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (!z2 || !name3.equals(str)) {
                        if (!name3.equals("group")) {
                            if (!name3.equals("item")) {
                                if (!name3.equals("menu")) {
                                    break;
                                } else {
                                    z = true;
                                    break;
                                }
                            } else if (!bVar.mo3324d()) {
                                if (bVar.f2469a != null && bVar.f2469a.mo2432e()) {
                                    bVar.mo3323c();
                                    break;
                                } else {
                                    bVar.mo3321b();
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            bVar.mo3319a();
                            break;
                        }
                    } else {
                        str = null;
                        z2 = false;
                        break;
                    }
            }
            i = xmlPullParser.next();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo3316a() {
        if (this.f2459f == null) {
            this.f2459f = m3957a(this.f2458e);
        }
        return this.f2459f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(int r3, android.view.Menu r4) {
        /*
            r2 = this;
            boolean r0 = r4 instanceof android.support.p009v4.p012b.p013a.C0427a
            if (r0 != 0) goto L_0x0008
            super.inflate(r3, r4)
            return
        L_0x0008:
            r0 = 0
            android.content.Context r1 = r2.f2458e     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.content.res.XmlResourceParser r3 = r1.getLayout(r3)     // Catch:{ XmlPullParserException -> 0x0034, IOException -> 0x002b }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0026, IOException -> 0x0023, all -> 0x0020 }
            r2.m3958a(r3, r0, r4)     // Catch:{ XmlPullParserException -> 0x0026, IOException -> 0x0023, all -> 0x0020 }
            if (r3 == 0) goto L_0x001f
            r3.close()
        L_0x001f:
            return
        L_0x0020:
            r4 = move-exception
            r0 = r3
            goto L_0x003d
        L_0x0023:
            r4 = move-exception
            r0 = r3
            goto L_0x002c
        L_0x0026:
            r4 = move-exception
            r0 = r3
            goto L_0x0035
        L_0x0029:
            r4 = move-exception
            goto L_0x003d
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x0034:
            r4 = move-exception
        L_0x0035:
            android.view.InflateException r3 = new android.view.InflateException     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "Error inflating menu XML"
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0029 }
            throw r3     // Catch:{ all -> 0x0029 }
        L_0x003d:
            if (r0 == 0) goto L_0x0042
            r0.close()
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.view.C0834g.inflate(int, android.view.Menu):void");
    }
}
