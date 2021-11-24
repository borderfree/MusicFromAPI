package android.support.p009v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.j */
public class C0372j {

    /* renamed from: a */
    private final C0373k<?> f1089a;

    private C0372j(C0373k<?> kVar) {
        this.f1089a = kVar;
    }

    /* renamed from: a */
    public static C0372j m1589a(C0373k<?> kVar) {
        return new C0372j(kVar);
    }

    /* renamed from: a */
    public Fragment mo1502a(String str) {
        return this.f1089a.f1093d.mo1578b(str);
    }

    /* renamed from: a */
    public C0374l mo1503a() {
        return this.f1089a.mo1531i();
    }

    /* renamed from: a */
    public View mo1504a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1089a.f1093d.onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: a */
    public void mo1505a(Configuration configuration) {
        this.f1089a.f1093d.mo1564a(configuration);
    }

    /* renamed from: a */
    public void mo1506a(Parcelable parcelable, C0393n nVar) {
        this.f1089a.f1093d.mo1565a(parcelable, nVar);
    }

    /* renamed from: a */
    public void mo1507a(Fragment fragment) {
        this.f1089a.f1093d.mo1571a((C0373k) this.f1089a, (C0371i) this.f1089a, fragment);
    }

    /* renamed from: a */
    public void mo1508a(boolean z) {
        this.f1089a.f1093d.mo1573a(z);
    }

    /* renamed from: a */
    public boolean mo1509a(Menu menu) {
        return this.f1089a.f1093d.mo1574a(menu);
    }

    /* renamed from: a */
    public boolean mo1510a(Menu menu, MenuInflater menuInflater) {
        return this.f1089a.f1093d.mo1575a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo1511a(MenuItem menuItem) {
        return this.f1089a.f1093d.mo1576a(menuItem);
    }

    /* renamed from: b */
    public void mo1512b() {
        this.f1089a.f1093d.mo1616n();
    }

    /* renamed from: b */
    public void mo1513b(Menu menu) {
        this.f1089a.f1093d.mo1585b(menu);
    }

    /* renamed from: b */
    public void mo1514b(boolean z) {
        this.f1089a.f1093d.mo1586b(z);
    }

    /* renamed from: b */
    public boolean mo1515b(MenuItem menuItem) {
        return this.f1089a.f1093d.mo1588b(menuItem);
    }

    /* renamed from: c */
    public Parcelable mo1516c() {
        return this.f1089a.f1093d.mo1614m();
    }

    /* renamed from: d */
    public C0393n mo1517d() {
        return this.f1089a.f1093d.mo1610k();
    }

    /* renamed from: e */
    public void mo1518e() {
        this.f1089a.f1093d.mo1619o();
    }

    /* renamed from: f */
    public void mo1519f() {
        this.f1089a.f1093d.mo1622p();
    }

    /* renamed from: g */
    public void mo1520g() {
        this.f1089a.f1093d.mo1624q();
    }

    /* renamed from: h */
    public void mo1521h() {
        this.f1089a.f1093d.mo1625r();
    }

    /* renamed from: i */
    public void mo1522i() {
        this.f1089a.f1093d.mo1626s();
    }

    /* renamed from: j */
    public void mo1523j() {
        this.f1089a.f1093d.mo1627t();
    }

    /* renamed from: k */
    public void mo1524k() {
        this.f1089a.f1093d.mo1629u();
    }

    /* renamed from: l */
    public void mo1525l() {
        this.f1089a.f1093d.mo1631w();
    }

    /* renamed from: m */
    public void mo1526m() {
        this.f1089a.f1093d.mo1632x();
    }

    /* renamed from: n */
    public boolean mo1527n() {
        return this.f1089a.f1093d.mo1605h();
    }
}
