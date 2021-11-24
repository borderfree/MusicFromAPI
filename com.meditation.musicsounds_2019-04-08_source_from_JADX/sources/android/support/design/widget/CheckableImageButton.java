package android.support.design.widget;

import android.content.Context;
import android.support.p009v4.view.C0577a;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.p021a.C0583b;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: a */
    private static final int[] f308a = {16842912};

    /* renamed from: b */
    private boolean f309b;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0626s.m2844a((View) this, (C0577a) new C0577a() {
            /* renamed from: a */
            public void mo285a(View view, C0583b bVar) {
                super.mo285a(view, bVar);
                bVar.mo2356a(true);
                bVar.mo2363b(CheckableImageButton.this.isChecked());
            }

            /* renamed from: a */
            public void mo474a(View view, AccessibilityEvent accessibilityEvent) {
                super.mo474a(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }

    public boolean isChecked() {
        return this.f309b;
    }

    public int[] onCreateDrawableState(int i) {
        return this.f309b ? mergeDrawableStates(super.onCreateDrawableState(i + f308a.length), f308a) : super.onCreateDrawableState(i);
    }

    public void setChecked(boolean z) {
        if (this.f309b != z) {
            this.f309b = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void toggle() {
        setChecked(!this.f309b);
    }
}
