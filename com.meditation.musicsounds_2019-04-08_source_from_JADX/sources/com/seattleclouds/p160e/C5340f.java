package com.seattleclouds.p160e;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.app.C0767e;
import android.support.p023v7.widget.AppCompatCheckBox;
import android.support.p023v7.widget.AppCompatRadioButton;
import android.support.p023v7.widget.AppCompatSpinner;
import android.support.p023v7.widget.C1078bk;
import android.support.p023v7.widget.C1108h;
import android.support.p023v7.widget.C1109i;
import android.support.p023v7.widget.C1116l;
import android.support.p023v7.widget.C1122r;
import android.support.p023v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.seattleclouds.C5451m.C5453b;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.util.C6594an;

/* renamed from: com.seattleclouds.e.f */
public class C5340f implements Factory2 {

    /* renamed from: c */
    private static final int[] f19134c = {16842964};

    /* renamed from: a */
    private final C0767e f19135a;

    /* renamed from: b */
    private final C5338d f19136b;

    public C5340f(C0767e eVar, C5338d dVar) {
        this.f19135a = eVar;
        this.f19136b = dVar;
    }

    /* renamed from: a */
    private void m26804a(AppCompatSpinner appCompatSpinner, AttributeSet attributeSet) {
        Context context = appCompatSpinner.getContext();
        C0626s.m2840a((View) appCompatSpinner, C5339e.m26801f(context, this.f19136b.mo17546c(context)));
    }

    /* renamed from: a */
    private void m26805a(SwitchCompat switchCompat, AttributeSet attributeSet) {
        Context context = switchCompat.getContext();
        int c = this.f19136b.mo17546c(context);
        ColorStateList g = C5339e.m26802g(context, c);
        ColorStateList h = C5339e.m26803h(context, c);
        Drawable g2 = C0311a.m1186g(switchCompat.getThumbDrawable());
        C0311a.m1175a(g2, g);
        switchCompat.setThumbDrawable(g2);
        Drawable g3 = C0311a.m1186g(switchCompat.getTrackDrawable());
        C0311a.m1175a(g3, h);
        switchCompat.setTrackDrawable(g3);
    }

    /* renamed from: a */
    private void m26806a(C1108h hVar, AttributeSet attributeSet) {
        Context context = hVar.getContext();
        boolean z = true;
        boolean z2 = false;
        if (VERSION.SDK_INT < 21) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f19134c, C5453b.buttonStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                if (resourceId != C5457f.abc_btn_default_mtrl_shape) {
                    if (resourceId == C5457f.abc_btn_borderless_material) {
                        z2 = true;
                    } else {
                        z = false;
                    }
                }
                obtainStyledAttributes.recycle();
            } else {
                z = false;
            }
        } else if (hVar.getTextColors().getDefaultColor() == C6594an.m31917a(context, C5453b.colorAccent)) {
            z2 = true;
        }
        if (!z) {
            return;
        }
        if (z2) {
            C5334b.m26775b(this.f19136b, (Button) hVar);
        } else {
            C5334b.m26770a(this.f19136b, (Button) hVar);
        }
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    /* renamed from: a */
    private void m26807a(C1109i iVar, AttributeSet attributeSet) {
        Drawable drawable;
        Context context = iVar.getContext();
        ColorStateList e = C5339e.m26800e(context, this.f19136b.mo17546c(context));
        if (VERSION.SDK_INT >= 21) {
            iVar.setCheckMarkTintList(e);
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            drawable = iVar.getCheckMarkDrawable();
        } else {
            C1078bk a = C1078bk.m5881a(context, attributeSet, new int[]{16843016}, 16843720, 0);
            Drawable a2 = a.mo5357a(0);
            a.mo5358a();
            drawable = a2;
        }
        if (drawable != null) {
            Drawable g = C0311a.m1186g(drawable);
            C0311a.m1175a(g, e);
            iVar.setCheckMarkDrawable(g);
        }
    }

    /* renamed from: a */
    private void m26808a(C1116l lVar, AttributeSet attributeSet) {
        C5334b.m26771a(this.f19136b, (EditText) lVar);
    }

    /* renamed from: a */
    private void m26809a(C1122r rVar, AttributeSet attributeSet) {
        Context context = rVar.getContext();
        ColorStateList a = C5339e.m26796a(context, this.f19136b.mo17546c(context));
        Drawable indeterminateDrawable = rVar.getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            Drawable g = C0311a.m1186g(indeterminateDrawable);
            C0311a.m1175a(g, a);
            rVar.setIndeterminateDrawable(g);
        }
        Drawable progressDrawable = rVar.getProgressDrawable();
        if (progressDrawable != null) {
            Drawable g2 = C0311a.m1186g(progressDrawable);
            C0311a.m1175a(g2, a);
            rVar.setProgressDrawable(g2);
        }
    }

    /* renamed from: a */
    private void m26810a(View view, AttributeSet attributeSet) {
        if (view instanceof C1108h) {
            m26806a((C1108h) view, attributeSet);
        } else if (view instanceof C1116l) {
            m26808a((C1116l) view, attributeSet);
        } else if (((view instanceof AppCompatCheckBox) || (view instanceof AppCompatRadioButton)) && (view instanceof CompoundButton)) {
            m26811a((CompoundButton) view, attributeSet);
        } else if (view instanceof C1109i) {
            m26807a((C1109i) view, attributeSet);
        } else if (view instanceof AppCompatSpinner) {
            m26804a((AppCompatSpinner) view, attributeSet);
        } else if (view instanceof C1122r) {
            m26809a((C1122r) view, attributeSet);
        } else if (view instanceof SwitchCompat) {
            m26805a((SwitchCompat) view, attributeSet);
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private void m26811a(CompoundButton compoundButton, AttributeSet attributeSet) {
        Context context = compoundButton.getContext();
        ColorStateList e = C5339e.m26800e(context, this.f19136b.mo17546c(context));
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(e);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843015}, compoundButton instanceof AppCompatRadioButton ? C5453b.radioButtonStyle : C5453b.checkboxStyle, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        Drawable g = C0311a.m1186g(drawable);
        C0311a.m1175a(g, e);
        compoundButton.setButtonDrawable(g);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((Factory2) this.f19135a.mo3087l()).onCreateView(view, str, context, attributeSet);
        if (onCreateView == null && str.equals(SwitchCompat.class.getName())) {
            onCreateView = new SwitchCompat(context, attributeSet);
        }
        if (onCreateView == null) {
            return null;
        }
        m26810a(onCreateView, attributeSet);
        return onCreateView;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((Factory2) this.f19135a.mo3087l()).onCreateView(str, context, attributeSet);
        if (onCreateView == null && str.equals(SwitchCompat.class.getName())) {
            onCreateView = new SwitchCompat(context, attributeSet);
        }
        if (onCreateView == null) {
            return null;
        }
        m26810a(onCreateView, attributeSet);
        return onCreateView;
    }
}
