package android.support.p023v7.widget;

import android.content.Context;
import android.support.p023v7.p026c.p027a.C0817b;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.i */
public class C1109i extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f3855a = {16843016};

    /* renamed from: b */
    private final C1124t f3856b;

    public C1109i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C1109i(Context context, AttributeSet attributeSet, int i) {
        super(C1075bh.m5876a(context), attributeSet, i);
        this.f3856b = C1124t.m6136a((TextView) this);
        this.f3856b.mo5532a(attributeSet, i);
        this.f3856b.mo5526a();
        C1078bk a = C1078bk.m5881a(getContext(), attributeSet, f3855a, i, 0);
        setCheckMarkDrawable(a.mo5357a(0));
        a.mo5358a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f3856b != null) {
            this.f3856b.mo5526a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1117m.m6111a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0817b.m3884b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f3856b != null) {
            this.f3856b.mo5530a(context, i);
        }
    }
}
