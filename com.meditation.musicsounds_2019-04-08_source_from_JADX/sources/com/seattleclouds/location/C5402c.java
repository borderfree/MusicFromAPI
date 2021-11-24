package com.seattleclouds.location;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.view.C0599c;
import android.support.p023v7.widget.SearchView;
import android.support.p023v7.widget.SearchView.C0973c;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.maps.C4544a;
import com.google.android.gms.maps.C4579b;
import com.google.android.gms.maps.C4580c;
import com.google.android.gms.maps.C4580c.C4583c;
import com.google.android.gms.maps.C4588d;
import com.google.android.gms.maps.C4588d.C4589a;
import com.google.android.gms.maps.C4590e;
import com.google.android.gms.maps.C4591f;
import com.google.android.gms.maps.C4595i;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.C6672y;
import com.seattleclouds.location.C5415d.C5416a;
import com.seattleclouds.location.C5431g.C5433b;
import com.seattleclouds.util.C6569aa;
import com.seattleclouds.util.C6569aa.C6570a;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6611g;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.widget.TouchableWrapper;
import com.seattleclouds.widget.TouchableWrapper.C6668a;

/* renamed from: com.seattleclouds.location.c */
public class C5402c extends C6672y implements C0973c {

    /* renamed from: a */
    protected boolean f19308a = false;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C0599c f19309ae;

    /* renamed from: af */
    private C5395a f19310af;

    /* renamed from: ag */
    private C5395a f19311ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public long f19312ah = 0;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public LatLng f19313ai = new LatLng(0.0d, 0.0d);
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public LatLng f19314aj = new LatLng(0.0d, 0.0d);
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public boolean f19315ak = true;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public boolean f19316al = false;

    /* renamed from: am */
    private boolean f19317am = false;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public C5416a f19318an = null;

    /* renamed from: b */
    protected boolean f19319b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4580c f19320c;

    /* renamed from: d */
    private TouchableWrapper f19321d;

    /* renamed from: e */
    private TextView f19322e;

    /* renamed from: f */
    private TextView f19323f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f19324g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public SearchView f19325h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f19326i = 0;

    /* renamed from: com.seattleclouds.location.c$a */
    private class C5413a implements C4588d {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C4589a f19338b;

        /* renamed from: c */
        private C5431g f19339c;

        private C5413a() {
        }

        /* renamed from: a */
        public void mo15125a() {
            this.f19338b = null;
            if (this.f19339c != null) {
                this.f19339c.mo17731b();
            }
        }

        /* renamed from: a */
        public void mo15126a(C4589a aVar) {
            this.f19338b = aVar;
            if (C5402c.this.mo1318s() != null) {
                if (this.f19339c == null) {
                    this.f19339c = new C5431g(C5402c.this.mo1318s(), new C5433b() {
                        /* renamed from: a */
                        public void mo17721a(Location location) {
                            C4580c a;
                            C4544a a2;
                            super.mo17721a(location);
                            if (C5413a.this.f19338b != null) {
                                C5413a.this.f19338b.mo15127a(location);
                            }
                            if (C5402c.this.f19308a) {
                                if (C5402c.this.f19319b) {
                                    a = C5402c.this.f19320c;
                                    a2 = C4579b.m22787a(new LatLng(location.getLatitude(), location.getLongitude()), 16.0f);
                                } else {
                                    a = C5402c.this.f19320c;
                                    a2 = C4579b.m22786a(new LatLng(location.getLatitude(), location.getLongitude()));
                                }
                                a.mo15109b(a2);
                            }
                        }
                    });
                    this.f19339c.mo17728a(500);
                }
                this.f19339c.mo17730a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public LatLng m27047a(Location location) {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m27052as() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f19326i = m.getInt("ARG_COORDINATE_FORMAT", this.f19326i);
        }
        C4595i h = this.f19320c.mo15115h();
        h.mo15130a(true);
        this.f19314aj = this.f19320c.mo15096a().f16582a;
        mo17711a(this.f19314aj);
        if (this.f19317am) {
            this.f19308a = false;
            this.f19319b = false;
            double d = m.getDouble("latitude", 1000.0d);
            double d2 = m.getDouble("longitude", 1000.0d);
            if (!(d == 1000.0d || d2 == 1000.0d)) {
                this.f19320c.mo15109b(C4579b.m22787a(new LatLng(d, d2), 16.0f));
            }
        } else {
            this.f19308a = true;
            this.f19319b = true;
        }
        if (this.f19308a) {
            this.f19320c.mo15106a((C4588d) new C5413a());
        }
        this.f19320c.mo15107a(true);
        h.mo15131b(true);
        this.f19320c.mo15102a((C4583c) new C4583c() {
            /* renamed from: a */
            public void mo15121a(CameraPosition cameraPosition) {
                if (!C5402c.this.f19314aj.equals(cameraPosition.f16582a)) {
                    C5402c.this.f19314aj = cameraPosition.f16582a;
                    C5402c.this.mo17711a(C5402c.this.f19314aj);
                    if (System.currentTimeMillis() - C5402c.this.f19312ah > 500) {
                        C5402c.this.f19312ah = System.currentTimeMillis();
                        C5402c.this.mo17712b(C5402c.this.f19314aj);
                    }
                }
            }
        });
        this.f19321d.setListener(new C6668a() {
            /* renamed from: a */
            public boolean mo17718a(MotionEvent motionEvent) {
                C5402c.this.f19309ae.mo2438a(motionEvent);
                if (motionEvent.getAction() == 1) {
                    C5402c.this.mo17712b(C5402c.this.f19314aj);
                }
                return false;
            }
        });
        this.f19309ae = new C0599c(mo1318s(), new SimpleOnGestureListener() {
            public boolean onDown(MotionEvent motionEvent) {
                C5402c.this.f19319b = false;
                C5402c.this.f19315ak = true;
                C5402c.this.f19325h.clearFocus();
                return false;
            }

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!C5402c.this.f19308a) {
                    return false;
                }
                if (Math.abs(f) > 10.0f || Math.abs(f2) > 10.0f) {
                    C5402c.this.f19308a = false;
                }
                return false;
            }
        });
    }

    /* renamed from: at */
    private View m27053at() {
        this.f19325h = new SearchView(((C6348n) mo1318s()).mo3083i().mo3005e());
        this.f19325h.setIconifiedByDefault(!C6619m.m32024f(mo1318s()));
        this.f19325h.setQueryHint(mo1219a(C5462k.location_detector_search_hint));
        this.f19325h.setOnQueryTextListener(this);
        this.f19325h.setOnQueryTextFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    C5402c cVar = C5402c.this;
                    C5402c.this.f19308a = false;
                    cVar.f19319b = false;
                }
            }
        });
        if (mo1318s() instanceof LocationDetectorActivity) {
            this.f19325h.setSearchableInfo(((SearchManager) mo1318s().getSystemService("search")).getSearchableInfo(mo1318s().getComponentName()));
        }
        return this.f19325h;
    }

    /* renamed from: az */
    private boolean m27054az() {
        if (!C6569aa.m31796a()) {
            return false;
        }
        boolean z = C0452b.m2065b((Context) mo1318s(), "android.permission.ACCESS_COARSE_LOCATION") == 0;
        if (!z) {
            this.f19316al = true;
            C6569aa.m31791a((Fragment) this, 33, "android.permission.ACCESS_COARSE_LOCATION", new int[]{C5462k.location_detector_permission_location_rational, C5462k.location_detector_permission_location_required_toast});
        }
        return !z;
    }

    /* renamed from: c */
    private InputMethodManager m27057c() {
        C0367h s = mo1318s();
        if (s != null) {
            return (InputMethodManager) s.getSystemService("input_method");
        }
        return null;
    }

    /* renamed from: d */
    private void m27059d() {
        ((Button) mo1199I().findViewById(C5458g.done_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                String str;
                if (C5402c.this.f19320c != null) {
                    LatLng latLng = C5402c.this.f19320c.mo15096a().f16582a;
                    Intent intent = new Intent();
                    intent.putExtra("address", C5402c.this.f19324g.getText().toString());
                    intent.putExtra("latitude", latLng.f16590a);
                    intent.putExtra("longitude", latLng.f16591b);
                    String str2 = "city";
                    C5402c.this.f19318an;
                    if (C5416a.m27097b() != null) {
                        C5402c.this.f19318an;
                        str = C5416a.m27097b();
                    } else {
                        str = "";
                    }
                    intent.putExtra(str2, str);
                    C5402c.this.mo1318s().setResult(-1, intent);
                    C5402c.this.mo1318s().finish();
                }
            }
        });
        ((Button) mo1199I().findViewById(C5458g.cancel_button)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                C5402c.this.mo1318s().setResult(0, null);
                C5402c.this.mo1318s().finish();
            }
        });
    }

    /* renamed from: e */
    private void m27062e() {
        if (this.f19320c == null && mo1199I() != null) {
            ((MapView) mo1199I().findViewById(C5458g.map)).mo15035a((C4591f) new C4591f() {
                /* renamed from: a */
                public void mo15128a(C4580c cVar) {
                    if (C5402c.this.mo1318s() != null) {
                        C5402c.this.f19320c = cVar;
                        C4590e.m22824a(C5402c.this.mo1318s());
                        C5402c.this.m27052as();
                    }
                }
            });
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (!C6569aa.m31796a() || (mo1318s().mo1469g().mo1535a("permissionDialog") == null && !this.f19316al && !m27054az())) {
            m27062e();
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C5460i.fragment_location_detector, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17710a(double d, double d2) {
        this.f19322e.setText(C5415d.m27093a(d, this.f19326i));
        this.f19323f.setText(C5415d.m27093a(d2, this.f19326i));
    }

    /* renamed from: a */
    public void mo1224a(int i, String[] strArr, int[] iArr) {
        if (!C6569aa.m31801a(strArr, iArr, "android.permission.ACCESS_COARSE_LOCATION")) {
            new Handler(Looper.myLooper()).postDelayed(new Runnable() {
                public void run() {
                    C6570a.m31804a(false, C5462k.location_detector_permission_location_denied).mo1448a(C5402c.this.mo1318s().mo1469g(), "permissionDialog");
                    C5402c.this.f19316al = false;
                }
            }, 400);
            return;
        }
        Toast.makeText(mo1318s(), C5462k.common_permission_granted, 0).show();
        this.f19316al = false;
        m27062e();
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        MenuItem add = menu.add(C5462k.common_search);
        add.setIcon(C6611g.m31973a(mo1316q(), C5457f.ic_search_material));
        add.setShowAsAction(10);
        add.setActionView(m27053at());
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f19321d = (TouchableWrapper) view.findViewById(C5458g.touchable_map_wrapper);
        this.f19322e = (TextView) view.findViewById(C5458g.latitude);
        this.f19323f = (TextView) view.findViewById(C5458g.longitude);
        this.f19324g = (TextView) view.findViewById(C5458g.address);
        this.f19324g.setText("");
        Bundle m = mo1307m();
        if (m != null) {
            this.f19317am = m.getBoolean("ARG_PICKER_MODE_ENABLED");
        }
        if (this.f19317am) {
            view.findViewById(C5458g.button_container).setVisibility(0);
            m27059d();
        }
        mo17711a(this.f19314aj);
        if (bundle != null) {
            this.f19316al = bundle.getBoolean("PERMISSION_REQUEST_KEY");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17711a(LatLng latLng) {
        mo17710a(latLng.f16590a, latLng.f16591b);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        Window window;
        int i;
        super.mo17454a(z);
        if (z) {
            window = mo1318s().getWindow();
            i = 32;
        } else {
            window = mo1318s().getWindow();
            i = 16;
        }
        window.setSoftInputMode(i);
    }

    /* renamed from: a */
    public boolean mo4687a(String str) {
        mo17713c(str);
        return true;
    }

    /* renamed from: a_ */
    public boolean mo4688a_(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17712b(LatLng latLng) {
        if (this.f19315ak && !this.f19313ai.equals(latLng)) {
            this.f19313ai = latLng;
            if (this.f19310af == null) {
                this.f19310af = new C5395a(mo1318s(), new C6608d() {
                    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
                        if (r5 == null) goto L_0x0013;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
                        if (r5 == null) goto L_0x0013;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
                        if (r5 == null) goto L_0x0013;
                     */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void mo16855a(java.lang.Object r5) {
                        /*
                            r4 = this;
                            if (r5 == 0) goto L_0x0037
                            boolean r0 = r5 instanceof com.seattleclouds.location.C5415d.C5416a
                            if (r0 == 0) goto L_0x0037
                            com.seattleclouds.location.d$a r5 = (com.seattleclouds.location.C5415d.C5416a) r5
                            com.seattleclouds.location.c r0 = com.seattleclouds.location.C5402c.this
                            r0.f19318an = r5
                            java.lang.String r5 = com.seattleclouds.location.C5415d.C5416a.m27096a()
                            if (r5 != 0) goto L_0x002d
                        L_0x0013:
                            com.seattleclouds.location.c r5 = com.seattleclouds.location.C5402c.this
                            com.google.android.gms.maps.model.LatLng r5 = r5.f19313ai
                            double r0 = r5.f16590a
                            com.seattleclouds.location.c r5 = com.seattleclouds.location.C5402c.this
                            com.google.android.gms.maps.model.LatLng r5 = r5.f19313ai
                            double r2 = r5.f16591b
                            com.seattleclouds.location.c r5 = com.seattleclouds.location.C5402c.this
                            int r5 = r5.f19326i
                            java.lang.String r5 = com.seattleclouds.location.C5415d.m27092a(r0, r2, r5)
                        L_0x002d:
                            com.seattleclouds.location.c r0 = com.seattleclouds.location.C5402c.this
                            android.widget.TextView r0 = r0.f19324g
                            r0.setText(r5)
                            goto L_0x0047
                        L_0x0037:
                            if (r5 == 0) goto L_0x0042
                            boolean r0 = r5 instanceof java.lang.String
                            if (r0 == 0) goto L_0x0042
                            java.lang.String r5 = (java.lang.String) r5
                            if (r5 != 0) goto L_0x002d
                            goto L_0x0013
                        L_0x0042:
                            java.lang.String r5 = (java.lang.String) r5
                            if (r5 != 0) goto L_0x002d
                            goto L_0x0013
                        L_0x0047:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.location.C5402c.C54118.mo16855a(java.lang.Object):void");
                    }
                });
            }
            this.f19310af.mo17702a(latLng.f16590a, latLng.f16591b, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo17713c(String str) {
        this.f19308a = false;
        this.f19319b = false;
        this.f19315ak = false;
        this.f19325h.clearFocus();
        InputMethodManager c = m27057c();
        if (c != null) {
            c.hideSoftInputFromWindow(this.f19325h.getWindowToken(), 0);
        }
        this.f19324g.setText(str);
        this.f19325h.mo4608a((CharSequence) str, false);
        if (this.f19311ag == null) {
            this.f19311ag = new C5395a(mo1318s(), new C6608d() {
                /* renamed from: a */
                public void mo16855a(Object obj) {
                    C4580c a;
                    C4544a a2;
                    if (obj instanceof Location) {
                        Location location = (Location) obj;
                        if (location == null) {
                            C6620n.m32028a((Context) C5402c.this.mo1318s(), C5462k.warning, C5462k.location_detector_error_searching_location);
                        } else if (location.equals(C5395a.f19287a)) {
                            Toast.makeText(C5402c.this.mo1318s(), C5402c.this.mo1220a(C5462k.location_detector_location_not_found, C5402c.this.f19325h.getQuery()), 1).show();
                        } else {
                            LatLng a3 = C5402c.this.m27047a(location);
                            C5402c.this.mo17711a(a3);
                            if (C5402c.this.f19320c.mo15096a().f16583b < 6.0f) {
                                a = C5402c.this.f19320c;
                                a2 = C4579b.m22787a(a3, 6.0f);
                            } else {
                                a = C5402c.this.f19320c;
                                a2 = C4579b.m22786a(a3);
                            }
                            a.mo15109b(a2);
                        }
                    }
                }
            });
        }
        this.f19311ag.mo17705a(str);
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putBoolean("PERMISSION_REQUEST_KEY", this.f19316al);
        super.mo1282e(bundle);
    }
}
