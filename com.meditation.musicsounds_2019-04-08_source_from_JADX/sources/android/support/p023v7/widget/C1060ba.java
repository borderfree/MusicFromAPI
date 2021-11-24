package android.support.p023v7.widget;

import android.support.p023v7.widget.RecyclerView.C0937i;
import android.support.p023v7.widget.RecyclerView.C0955t;
import android.view.View;

/* renamed from: android.support.v7.widget.ba */
class C1060ba {
    /* renamed from: a */
    static int m5791a(C0955t tVar, C1047at atVar, View view, View view2, C0937i iVar, boolean z) {
        if (iVar.mo4465w() == 0 || tVar.mo4561e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(iVar.mo4431d(view) - iVar.mo4431d(view2)) + 1;
        }
        return Math.min(atVar.mo5190f(), atVar.mo5183b(view2) - atVar.mo5179a(view));
    }

    /* renamed from: a */
    static int m5792a(C0955t tVar, C1047at atVar, View view, View view2, C0937i iVar, boolean z, boolean z2) {
        if (iVar.mo4465w() == 0 || tVar.mo4561e() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (tVar.mo4561e() - Math.max(iVar.mo4431d(view), iVar.mo4431d(view2))) - 1) : Math.max(0, Math.min(iVar.mo4431d(view), iVar.mo4431d(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(atVar.mo5183b(view2) - atVar.mo5179a(view))) / ((float) (Math.abs(iVar.mo4431d(view) - iVar.mo4431d(view2)) + 1)))) + ((float) (atVar.mo5184c() - atVar.mo5179a(view))));
    }

    /* renamed from: b */
    static int m5793b(C0955t tVar, C1047at atVar, View view, View view2, C0937i iVar, boolean z) {
        if (iVar.mo4465w() == 0 || tVar.mo4561e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return tVar.mo4561e();
        }
        return (int) ((((float) (atVar.mo5183b(view2) - atVar.mo5179a(view))) / ((float) (Math.abs(iVar.mo4431d(view) - iVar.mo4431d(view2)) + 1))) * ((float) tVar.mo4561e()));
    }
}
