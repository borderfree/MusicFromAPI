package android.support.transition;

import android.support.transition.C0294u.C0299b;
import android.support.transition.C0294u.C0300c;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.transition.y */
public class C0306y extends C0294u {

    /* renamed from: g */
    private ArrayList<C0294u> f850g = new ArrayList<>();

    /* renamed from: h */
    private boolean f851h = true;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f852i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f853j = false;

    /* renamed from: android.support.transition.y$a */
    static class C0308a extends C0301v {

        /* renamed from: a */
        C0306y f856a;

        C0308a(C0306y yVar) {
            this.f856a = yVar;
        }

        /* renamed from: a */
        public void mo971a(C0294u uVar) {
            C0306y.m1131b(this.f856a);
            if (this.f856a.f852i == 0) {
                this.f856a.f853j = false;
                this.f856a.mo1107k();
            }
            uVar.mo1092b((C0300c) this);
        }

        /* renamed from: d */
        public void mo974d(C0294u uVar) {
            if (!this.f856a.f853j) {
                this.f856a.mo1106j();
                this.f856a.f853j = true;
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m1131b(C0306y yVar) {
        int i = yVar.f852i - 1;
        yVar.f852i = i;
        return i;
    }

    /* renamed from: p */
    private void m1133p() {
        C0308a aVar = new C0308a(this);
        Iterator it = this.f850g.iterator();
        while (it.hasNext()) {
            ((C0294u) it.next()).mo1080a((C0300c) aVar);
        }
        this.f852i = this.f850g.size();
    }

    /* renamed from: a */
    public C0306y mo1121a(int i) {
        boolean z;
        switch (i) {
            case 0:
                z = true;
                break;
            case 1:
                z = false;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid parameter for TransitionSet ordering: ");
                sb.append(i);
                throw new AndroidRuntimeException(sb.toString());
        }
        this.f851h = z;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo1081a(String str) {
        String a = super.mo1081a(str);
        for (int i = 0; i < this.f850g.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            C0294u uVar = (C0294u) this.f850g.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(uVar.mo1081a(sb2.toString()));
            a = sb.toString();
        }
        return a;
    }

    /* renamed from: a */
    public void mo1017a(C0230aa aaVar) {
        if (mo1088a(aaVar.f690b)) {
            Iterator it = this.f850g.iterator();
            while (it.hasNext()) {
                C0294u uVar = (C0294u) it.next();
                if (uVar.mo1088a(aaVar.f690b)) {
                    uVar.mo1017a(aaVar);
                    aaVar.f691c.add(uVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1083a(C0299b bVar) {
        super.mo1083a(bVar);
        int size = this.f850g.size();
        for (int i = 0; i < size; i++) {
            ((C0294u) this.f850g.get(i)).mo1083a(bVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1085a(ViewGroup viewGroup, C0231ab abVar, C0231ab abVar2, ArrayList<C0230aa> arrayList, ArrayList<C0230aa> arrayList2) {
        long c = mo1094c();
        int size = this.f850g.size();
        for (int i = 0; i < size; i++) {
            C0294u uVar = (C0294u) this.f850g.get(i);
            if (c > 0 && (this.f851h || i == 0)) {
                long c2 = uVar.mo1094c();
                if (c2 > 0) {
                    uVar.mo1091b(c2 + c);
                } else {
                    uVar.mo1091b(c);
                }
            }
            uVar.mo1085a(viewGroup, abVar, abVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: b */
    public C0294u mo1122b(int i) {
        if (i < 0 || i >= this.f850g.size()) {
            return null;
        }
        return (C0294u) this.f850g.get(i);
    }

    /* renamed from: b */
    public C0306y mo1123b(C0294u uVar) {
        this.f850g.add(uVar);
        uVar.f815d = this;
        if (this.f812a >= 0) {
            uVar.mo1079a(this.f812a);
        }
        return this;
    }

    /* renamed from: b */
    public void mo1022b(C0230aa aaVar) {
        if (mo1088a(aaVar.f690b)) {
            Iterator it = this.f850g.iterator();
            while (it.hasNext()) {
                C0294u uVar = (C0294u) it.next();
                if (uVar.mo1088a(aaVar.f690b)) {
                    uVar.mo1022b(aaVar);
                    aaVar.f691c.add(uVar);
                }
            }
        }
    }

    /* renamed from: c */
    public C0306y mo1079a(long j) {
        super.mo1079a(j);
        if (this.f812a >= 0) {
            int size = this.f850g.size();
            for (int i = 0; i < size; i++) {
                ((C0294u) this.f850g.get(i)).mo1079a(j);
            }
        }
        return this;
    }

    /* renamed from: c */
    public C0306y mo1080a(C0300c cVar) {
        return (C0306y) super.mo1080a(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1096c(C0230aa aaVar) {
        super.mo1096c(aaVar);
        int size = this.f850g.size();
        for (int i = 0; i < size; i++) {
            ((C0294u) this.f850g.get(i)).mo1096c(aaVar);
        }
    }

    /* renamed from: d */
    public C0306y mo1091b(long j) {
        return (C0306y) super.mo1091b(j);
    }

    /* renamed from: d */
    public C0306y mo1092b(C0300c cVar) {
        return (C0306y) super.mo1092b(cVar);
    }

    /* renamed from: d */
    public void mo1099d(View view) {
        super.mo1099d(view);
        int size = this.f850g.size();
        for (int i = 0; i < size; i++) {
            ((C0294u) this.f850g.get(i)).mo1099d(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo1100e() {
        if (this.f850g.isEmpty()) {
            mo1106j();
            mo1107k();
            return;
        }
        m1133p();
        if (!this.f851h) {
            for (int i = 1; i < this.f850g.size(); i++) {
                final C0294u uVar = (C0294u) this.f850g.get(i);
                ((C0294u) this.f850g.get(i - 1)).mo1080a((C0300c) new C0301v() {
                    /* renamed from: a */
                    public void mo971a(C0294u uVar) {
                        uVar.mo1100e();
                        uVar.mo1092b((C0300c) this);
                    }
                });
            }
            C0294u uVar2 = (C0294u) this.f850g.get(0);
            if (uVar2 != null) {
                uVar2.mo1100e();
            }
        } else {
            Iterator it = this.f850g.iterator();
            while (it.hasNext()) {
                ((C0294u) it.next()).mo1100e();
            }
        }
    }

    /* renamed from: e */
    public void mo1101e(View view) {
        super.mo1101e(view);
        int size = this.f850g.size();
        for (int i = 0; i < size; i++) {
            ((C0294u) this.f850g.get(i)).mo1101e(view);
        }
    }

    /* renamed from: f */
    public C0306y mo1093b(View view) {
        for (int i = 0; i < this.f850g.size(); i++) {
            ((C0294u) this.f850g.get(i)).mo1093b(view);
        }
        return (C0306y) super.mo1093b(view);
    }

    /* renamed from: g */
    public C0306y mo1095c(View view) {
        for (int i = 0; i < this.f850g.size(); i++) {
            ((C0294u) this.f850g.get(i)).mo1095c(view);
        }
        return (C0306y) super.mo1095c(view);
    }

    /* renamed from: m */
    public C0294u clone() {
        C0306y yVar = (C0306y) super.clone();
        yVar.f850g = new ArrayList<>();
        int size = this.f850g.size();
        for (int i = 0; i < size; i++) {
            yVar.mo1123b(((C0294u) this.f850g.get(i)).clone());
        }
        return yVar;
    }

    /* renamed from: o */
    public int mo1130o() {
        return this.f850g.size();
    }
}
