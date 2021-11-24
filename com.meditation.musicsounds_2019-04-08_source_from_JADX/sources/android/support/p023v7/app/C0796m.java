package android.support.p023v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.app.m */
public class C0796m extends Dialog implements C0768f {

    /* renamed from: a */
    private C0769g f2330a;

    public C0796m(Context context) {
        this(context, 0);
    }

    public C0796m(Context context, int i) {
        super(context, m3738a(context, i));
        mo3189a().mo3102a((Bundle) null);
        mo3189a().mo3119j();
    }

    /* renamed from: a */
    private static int m3738a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0727a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public C0769g mo3189a() {
        if (this.f2330a == null) {
            this.f2330a = C0769g.m3582a((Dialog) this, (C0768f) this);
        }
        return this.f2330a;
    }

    /* renamed from: a */
    public C0827b mo3069a(C0828a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo3071a(C0827b bVar) {
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo3189a().mo3109b(view, layoutParams);
    }

    /* renamed from: b */
    public void mo3077b(C0827b bVar) {
    }

    /* renamed from: b */
    public boolean mo3191b(int i) {
        return mo3189a().mo3112c(i);
    }

    public <T extends View> T findViewById(int i) {
        return mo3189a().mo3100a(i);
    }

    public void invalidateOptionsMenu() {
        mo3189a().mo3115f();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo3189a().mo3118i();
        super.onCreate(bundle);
        mo3189a().mo3102a(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo3189a().mo3113d();
    }

    public void setContentView(int i) {
        mo3189a().mo3107b(i);
    }

    public void setContentView(View view) {
        mo3189a().mo3103a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo3189a().mo3104a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        mo3189a().mo3105a((CharSequence) getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo3189a().mo3105a(charSequence);
    }
}
