package com.facebook.ads.internal.view.p093g;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.internal.p060b.C1674b;
import com.facebook.ads.internal.p070l.C1720f;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.view.p093g.p095b.C2017b;
import com.facebook.ads.internal.view.p093g.p095b.C2023h;
import com.facebook.ads.internal.view.p093g.p095b.C2025j;
import com.facebook.ads.internal.view.p093g.p095b.C2027l;
import com.facebook.ads.internal.view.p093g.p095b.C2028m;
import com.facebook.ads.internal.view.p093g.p095b.C2029n;
import com.facebook.ads.internal.view.p093g.p095b.C2031p;
import com.facebook.ads.internal.view.p093g.p095b.C2033r;
import com.facebook.ads.internal.view.p093g.p095b.C2034s;
import com.facebook.ads.internal.view.p093g.p095b.C2036u;
import com.facebook.ads.internal.view.p093g.p095b.C2037v;
import com.facebook.ads.internal.view.p093g.p095b.C2038x;
import com.facebook.ads.internal.view.p093g.p095b.C2039y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.g.b */
public class C2003b extends C2041c {

    /* renamed from: a */
    public int f6649a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2036u f6650b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1720f<C2033r> f6651c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1720f<C2023h> f6652d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1720f<C2025j> f6653e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1720f<C2029n> f6654f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1720f<C2017b> f6655g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C1720f<C2031p> f6656h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1720f<C2038x> f6657i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C1720f<C2039y> f6658j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C1720f<C2034s> f6659k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C2028m f6660l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1994a f6661m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f6662n;

    public C2003b(Context context, C1728c cVar, C1994a aVar, String str) {
        this(context, cVar, aVar, (List<C1674b>) new ArrayList<C1674b>(), str);
    }

    public C2003b(Context context, C1728c cVar, C1994a aVar, String str, Bundle bundle) {
        this(context, cVar, aVar, new ArrayList(), str, bundle, null);
    }

    public C2003b(Context context, C1728c cVar, C1994a aVar, String str, Map<String, String> map) {
        this(context, cVar, aVar, new ArrayList(), str, null, map);
    }

    public C2003b(Context context, C1728c cVar, C1994a aVar, List<C1674b> list, String str) {
        super(context, cVar, aVar, list, str);
        this.f6650b = new C2036u() {

            /* renamed from: a */
            static final /* synthetic */ boolean f6663a = (!C2003b.class.desiredAssertionStatus());

            /* renamed from: a */
            public void mo6765a(C2037v vVar) {
                if (!f6663a && C2003b.this == null) {
                    throw new AssertionError();
                } else if (C2003b.this != null) {
                    C2003b.this.mo7495e();
                }
            }
        };
        this.f6651c = new C1720f<C2033r>() {

            /* renamed from: a */
            static final /* synthetic */ boolean f6675a = (!C2003b.class.desiredAssertionStatus());

            /* renamed from: a */
            public Class<C2033r> mo6764a() {
                return C2033r.class;
            }

            /* renamed from: a */
            public void mo6765a(C2033r rVar) {
                if (!f6675a && C2003b.this == null) {
                    throw new AssertionError();
                } else if (C2003b.this != null) {
                    C2003b.this.mo7496f();
                }
            }
        };
        this.f6652d = new C1720f<C2023h>() {

            /* renamed from: a */
            static final /* synthetic */ boolean f6677a = (!C2003b.class.desiredAssertionStatus());

            /* renamed from: a */
            public Class<C2023h> mo6764a() {
                return C2023h.class;
            }

            /* renamed from: a */
            public void mo6765a(C2023h hVar) {
                if (!f6677a && C2003b.this == null) {
                    throw new AssertionError();
                } else if (C2003b.this != null) {
                    C2003b.this.mo7497g();
                }
            }
        };
        this.f6653e = new C1720f<C2025j>() {

            /* renamed from: a */
            static final /* synthetic */ boolean f6665a = (!C2003b.class.desiredAssertionStatus());

            /* renamed from: a */
            public Class<C2025j> mo6764a() {
                return C2025j.class;
            }

            /* renamed from: a */
            public void mo6765a(C2025j jVar) {
                if (!f6665a && C2003b.this == null) {
                    throw new AssertionError();
                } else if (C2003b.this != null) {
                    if (!C2003b.this.f6662n) {
                        C2003b.this.f6662n = true;
                    } else {
                        C2003b.this.mo7498h();
                    }
                }
            }
        };
        this.f6654f = new C1720f<C2029n>() {
            /* renamed from: a */
            public Class<C2029n> mo6764a() {
                return C2029n.class;
            }

            /* renamed from: a */
            public void mo6765a(C2029n nVar) {
                int a = nVar.mo7483a();
                if (C2003b.this.f6649a <= 0 || a != C2003b.this.f6661m.getDuration() || C2003b.this.f6661m.getDuration() <= C2003b.this.f6649a) {
                    C2003b.this.mo7489a(a);
                }
            }
        };
        this.f6655g = new C1720f<C2017b>() {
            /* renamed from: a */
            public Class<C2017b> mo6764a() {
                return C2017b.class;
            }

            /* renamed from: a */
            public void mo6765a(C2017b bVar) {
                C2003b bVar2;
                int a = bVar.mo7481a();
                int b = bVar.mo7482b();
                if (C2003b.this.f6649a <= 0 || a != b || b <= C2003b.this.f6649a) {
                    if (b >= a + 500) {
                        bVar2 = C2003b.this;
                    } else if (b == 0) {
                        bVar2 = C2003b.this;
                        a = C2003b.this.f6649a;
                    } else {
                        C2003b.this.mo7492b(b);
                    }
                    bVar2.mo7492b(a);
                }
            }
        };
        this.f6656h = new C1720f<C2031p>() {
            /* renamed from: a */
            public Class<C2031p> mo6764a() {
                return C2031p.class;
            }

            /* renamed from: a */
            public void mo6765a(C2031p pVar) {
                C2003b.this.mo7490a(pVar.mo7484a(), pVar.mo7485b());
            }
        };
        this.f6657i = new C1720f<C2038x>() {
            /* renamed from: a */
            public Class<C2038x> mo6764a() {
                return C2038x.class;
            }

            /* renamed from: a */
            public void mo6765a(C2038x xVar) {
                C2003b.this.mo7491b();
            }
        };
        this.f6658j = new C1720f<C2039y>() {
            /* renamed from: a */
            public Class<C2039y> mo6764a() {
                return C2039y.class;
            }

            /* renamed from: a */
            public void mo6765a(C2039y yVar) {
                C2003b.this.mo7493c();
            }
        };
        this.f6659k = new C1720f<C2034s>() {
            /* renamed from: a */
            public Class<C2034s> mo6764a() {
                return C2034s.class;
            }

            /* renamed from: a */
            public void mo6765a(C2034s sVar) {
                C2003b.this.mo7490a(C2003b.this.mo7499i(), C2003b.this.mo7499i());
            }
        };
        this.f6660l = new C2028m() {
            /* renamed from: a */
            public void mo6765a(C2027l lVar) {
                C2003b.this.f6649a = C2003b.this.f6661m.getDuration();
            }
        };
        this.f6662n = false;
        this.f6661m = aVar;
        this.f6661m.getEventBus().mo6906a((T[]) new C1720f[]{this.f6650b, this.f6654f, this.f6651c, this.f6653e, this.f6652d, this.f6655g, this.f6656h, this.f6657i, this.f6658j, this.f6660l, this.f6659k});
    }

    public C2003b(Context context, C1728c cVar, C1994a aVar, List<C1674b> list, String str, Bundle bundle, Map<String, String> map) {
        super(context, cVar, aVar, list, str, bundle, map);
        this.f6650b = new C2036u() {

            /* renamed from: a */
            static final /* synthetic */ boolean f6663a = (!C2003b.class.desiredAssertionStatus());

            /* renamed from: a */
            public void mo6765a(C2037v vVar) {
                if (!f6663a && C2003b.this == null) {
                    throw new AssertionError();
                } else if (C2003b.this != null) {
                    C2003b.this.mo7495e();
                }
            }
        };
        this.f6651c = new C1720f<C2033r>() {

            /* renamed from: a */
            static final /* synthetic */ boolean f6675a = (!C2003b.class.desiredAssertionStatus());

            /* renamed from: a */
            public Class<C2033r> mo6764a() {
                return C2033r.class;
            }

            /* renamed from: a */
            public void mo6765a(C2033r rVar) {
                if (!f6675a && C2003b.this == null) {
                    throw new AssertionError();
                } else if (C2003b.this != null) {
                    C2003b.this.mo7496f();
                }
            }
        };
        this.f6652d = new C1720f<C2023h>() {

            /* renamed from: a */
            static final /* synthetic */ boolean f6677a = (!C2003b.class.desiredAssertionStatus());

            /* renamed from: a */
            public Class<C2023h> mo6764a() {
                return C2023h.class;
            }

            /* renamed from: a */
            public void mo6765a(C2023h hVar) {
                if (!f6677a && C2003b.this == null) {
                    throw new AssertionError();
                } else if (C2003b.this != null) {
                    C2003b.this.mo7497g();
                }
            }
        };
        this.f6653e = new C1720f<C2025j>() {

            /* renamed from: a */
            static final /* synthetic */ boolean f6665a = (!C2003b.class.desiredAssertionStatus());

            /* renamed from: a */
            public Class<C2025j> mo6764a() {
                return C2025j.class;
            }

            /* renamed from: a */
            public void mo6765a(C2025j jVar) {
                if (!f6665a && C2003b.this == null) {
                    throw new AssertionError();
                } else if (C2003b.this != null) {
                    if (!C2003b.this.f6662n) {
                        C2003b.this.f6662n = true;
                    } else {
                        C2003b.this.mo7498h();
                    }
                }
            }
        };
        this.f6654f = new C1720f<C2029n>() {
            /* renamed from: a */
            public Class<C2029n> mo6764a() {
                return C2029n.class;
            }

            /* renamed from: a */
            public void mo6765a(C2029n nVar) {
                int a = nVar.mo7483a();
                if (C2003b.this.f6649a <= 0 || a != C2003b.this.f6661m.getDuration() || C2003b.this.f6661m.getDuration() <= C2003b.this.f6649a) {
                    C2003b.this.mo7489a(a);
                }
            }
        };
        this.f6655g = new C1720f<C2017b>() {
            /* renamed from: a */
            public Class<C2017b> mo6764a() {
                return C2017b.class;
            }

            /* renamed from: a */
            public void mo6765a(C2017b bVar) {
                C2003b bVar2;
                int a = bVar.mo7481a();
                int b = bVar.mo7482b();
                if (C2003b.this.f6649a <= 0 || a != b || b <= C2003b.this.f6649a) {
                    if (b >= a + 500) {
                        bVar2 = C2003b.this;
                    } else if (b == 0) {
                        bVar2 = C2003b.this;
                        a = C2003b.this.f6649a;
                    } else {
                        C2003b.this.mo7492b(b);
                    }
                    bVar2.mo7492b(a);
                }
            }
        };
        this.f6656h = new C1720f<C2031p>() {
            /* renamed from: a */
            public Class<C2031p> mo6764a() {
                return C2031p.class;
            }

            /* renamed from: a */
            public void mo6765a(C2031p pVar) {
                C2003b.this.mo7490a(pVar.mo7484a(), pVar.mo7485b());
            }
        };
        this.f6657i = new C1720f<C2038x>() {
            /* renamed from: a */
            public Class<C2038x> mo6764a() {
                return C2038x.class;
            }

            /* renamed from: a */
            public void mo6765a(C2038x xVar) {
                C2003b.this.mo7491b();
            }
        };
        this.f6658j = new C1720f<C2039y>() {
            /* renamed from: a */
            public Class<C2039y> mo6764a() {
                return C2039y.class;
            }

            /* renamed from: a */
            public void mo6765a(C2039y yVar) {
                C2003b.this.mo7493c();
            }
        };
        this.f6659k = new C1720f<C2034s>() {
            /* renamed from: a */
            public Class<C2034s> mo6764a() {
                return C2034s.class;
            }

            /* renamed from: a */
            public void mo6765a(C2034s sVar) {
                C2003b.this.mo7490a(C2003b.this.mo7499i(), C2003b.this.mo7499i());
            }
        };
        this.f6660l = new C2028m() {
            /* renamed from: a */
            public void mo6765a(C2027l lVar) {
                C2003b.this.f6649a = C2003b.this.f6661m.getDuration();
            }
        };
        this.f6662n = false;
        this.f6661m = aVar;
        this.f6661m.getEventBus().mo6906a((T[]) new C1720f[]{this.f6650b, this.f6654f, this.f6651c, this.f6653e, this.f6652d, this.f6655g, this.f6656h, this.f6657i, this.f6658j, this.f6659k});
    }

    /* renamed from: a */
    public void mo7468a() {
        this.f6661m.getStateHandler().post(new Runnable() {
            public void run() {
                C2003b.this.f6661m.getEventBus().mo6908b((T[]) new C1720f[]{C2003b.this.f6650b, C2003b.this.f6654f, C2003b.this.f6651c, C2003b.this.f6653e, C2003b.this.f6652d, C2003b.this.f6655g, C2003b.this.f6656h, C2003b.this.f6657i, C2003b.this.f6658j, C2003b.this.f6660l, C2003b.this.f6659k});
            }
        });
    }
}
