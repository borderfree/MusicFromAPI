package android.support.transition;

import android.graphics.Rect;
import android.support.p009v4.app.C0408t;
import android.support.transition.C0294u.C0299b;
import android.support.transition.C0294u.C0300c;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class FragmentTransitionSupport extends C0408t {
    /* renamed from: a */
    private static boolean m880a(C0294u uVar) {
        return !m1882a(uVar.mo1102f()) || !m1882a(uVar.mo1104h()) || !m1882a(uVar.mo1105i());
    }

    /* renamed from: a */
    public Object mo955a(Object obj, Object obj2, Object obj3) {
        C0306y yVar = new C0306y();
        if (obj != null) {
            yVar.mo1123b((C0294u) obj);
        }
        if (obj2 != null) {
            yVar.mo1123b((C0294u) obj2);
        }
        if (obj3 != null) {
            yVar.mo1123b((C0294u) obj3);
        }
        return yVar;
    }

    /* renamed from: a */
    public void mo956a(ViewGroup viewGroup, Object obj) {
        C0302w.m1120a(viewGroup, (C0294u) obj);
    }

    /* renamed from: a */
    public void mo957a(Object obj, final Rect rect) {
        if (obj != null) {
            ((C0294u) obj).mo1083a((C0299b) new C0299b() {
            });
        }
    }

    /* renamed from: a */
    public void mo958a(Object obj, View view) {
        if (view != null) {
            C0294u uVar = (C0294u) obj;
            final Rect rect = new Rect();
            mo1682a(view, rect);
            uVar.mo1083a((C0299b) new C0299b() {
            });
        }
    }

    /* renamed from: a */
    public void mo959a(Object obj, View view, ArrayList<View> arrayList) {
        C0306y yVar = (C0306y) obj;
        List g = yVar.mo1103g();
        g.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m1881a(g, (View) arrayList.get(i));
        }
        g.add(view);
        arrayList.add(view);
        mo961a((Object) yVar, arrayList);
    }

    /* renamed from: a */
    public void mo960a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        C0294u uVar = (C0294u) obj;
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        C02273 r1 = new C0300c() {
            /* renamed from: a */
            public void mo971a(C0294u uVar) {
            }

            /* renamed from: b */
            public void mo972b(C0294u uVar) {
            }

            /* renamed from: c */
            public void mo973c(C0294u uVar) {
            }

            /* renamed from: d */
            public void mo974d(C0294u uVar) {
                if (obj5 != null) {
                    FragmentTransitionSupport.this.mo968b(obj5, arrayList4, null);
                }
                if (obj6 != null) {
                    FragmentTransitionSupport.this.mo968b(obj6, arrayList5, null);
                }
                if (obj7 != null) {
                    FragmentTransitionSupport.this.mo968b(obj7, arrayList6, null);
                }
            }
        };
        uVar.mo1080a((C0300c) r1);
    }

    /* renamed from: a */
    public void mo961a(Object obj, ArrayList<View> arrayList) {
        C0294u uVar = (C0294u) obj;
        if (uVar != null) {
            int i = 0;
            if (uVar instanceof C0306y) {
                C0306y yVar = (C0306y) uVar;
                int o = yVar.mo1130o();
                while (i < o) {
                    mo961a((Object) yVar.mo1122b(i), arrayList);
                    i++;
                }
            } else if (!m880a(uVar) && m1882a(uVar.mo1103g())) {
                int size = arrayList.size();
                while (i < size) {
                    uVar.mo1093b((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo962a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0306y yVar = (C0306y) obj;
        if (yVar != null) {
            yVar.mo1103g().clear();
            yVar.mo1103g().addAll(arrayList2);
            mo968b((Object) yVar, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public boolean mo963a(Object obj) {
        return obj instanceof C0294u;
    }

    /* renamed from: b */
    public Object mo964b(Object obj) {
        if (obj != null) {
            return ((C0294u) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo965b(Object obj, Object obj2, Object obj3) {
        C0294u uVar = (C0294u) obj;
        C0294u uVar2 = (C0294u) obj2;
        C0294u uVar3 = (C0294u) obj3;
        if (uVar != null && uVar2 != null) {
            uVar = new C0306y().mo1123b(uVar).mo1123b(uVar2).mo1121a(1);
        } else if (uVar == null) {
            uVar = uVar2 != null ? uVar2 : null;
        }
        if (uVar3 == null) {
            return uVar;
        }
        C0306y yVar = new C0306y();
        if (uVar != null) {
            yVar.mo1123b(uVar);
        }
        yVar.mo1123b(uVar3);
        return yVar;
    }

    /* renamed from: b */
    public void mo966b(Object obj, View view) {
        if (obj != null) {
            ((C0294u) obj).mo1093b(view);
        }
    }

    /* renamed from: b */
    public void mo967b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((C0294u) obj).mo1080a((C0300c) new C0300c() {
            /* renamed from: a */
            public void mo971a(C0294u uVar) {
                uVar.mo1092b((C0300c) this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }

            /* renamed from: b */
            public void mo972b(C0294u uVar) {
            }

            /* renamed from: c */
            public void mo973c(C0294u uVar) {
            }

            /* renamed from: d */
            public void mo974d(C0294u uVar) {
            }
        });
    }

    /* renamed from: b */
    public void mo968b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C0294u uVar = (C0294u) obj;
        int i = 0;
        if (uVar instanceof C0306y) {
            C0306y yVar = (C0306y) uVar;
            int o = yVar.mo1130o();
            while (i < o) {
                mo968b((Object) yVar.mo1122b(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m880a(uVar)) {
            List g = uVar.mo1103g();
            if (g.size() == arrayList.size() && g.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    uVar.mo1093b((View) arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    uVar.mo1095c((View) arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: c */
    public Object mo969c(Object obj) {
        if (obj == null) {
            return null;
        }
        C0306y yVar = new C0306y();
        yVar.mo1123b((C0294u) obj);
        return yVar;
    }

    /* renamed from: c */
    public void mo970c(Object obj, View view) {
        if (obj != null) {
            ((C0294u) obj).mo1095c(view);
        }
    }
}
