package android.support.p023v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.support.p023v7.app.AlertController.C0742a;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.app.d */
public class C0765d extends C0796m implements DialogInterface {

    /* renamed from: a */
    final AlertController f2229a = new AlertController(getContext(), this, getWindow());

    /* renamed from: android.support.v7.app.d$a */
    public static class C0766a {

        /* renamed from: a */
        private final C0742a f2230a;

        /* renamed from: b */
        private final int f2231b;

        public C0766a(Context context) {
            this(context, C0765d.m3535a(context, 0));
        }

        public C0766a(Context context, int i) {
            this.f2230a = new C0742a(new ContextThemeWrapper(context, C0765d.m3535a(context, i)));
            this.f2231b = i;
        }

        /* renamed from: a */
        public Context mo3046a() {
            return this.f2230a.f2159a;
        }

        /* renamed from: a */
        public C0766a mo3047a(int i) {
            this.f2230a.f2164f = this.f2230a.f2159a.getText(i);
            return this;
        }

        /* renamed from: a */
        public C0766a mo3048a(int i, OnClickListener onClickListener) {
            this.f2230a.f2167i = this.f2230a.f2159a.getText(i);
            this.f2230a.f2169k = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3049a(OnCancelListener onCancelListener) {
            this.f2230a.f2177s = onCancelListener;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3050a(OnKeyListener onKeyListener) {
            this.f2230a.f2179u = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3051a(Drawable drawable) {
            this.f2230a.f2162d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3052a(View view) {
            this.f2230a.f2165g = view;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3053a(ListAdapter listAdapter, OnClickListener onClickListener) {
            this.f2230a.f2181w = listAdapter;
            this.f2230a.f2182x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3054a(CharSequence charSequence) {
            this.f2230a.f2164f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3055a(CharSequence charSequence, OnClickListener onClickListener) {
            this.f2230a.f2167i = charSequence;
            this.f2230a.f2169k = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3056a(boolean z) {
            this.f2230a.f2176r = z;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3057a(CharSequence[] charSequenceArr, int i, OnClickListener onClickListener) {
            this.f2230a.f2180v = charSequenceArr;
            this.f2230a.f2182x = onClickListener;
            this.f2230a.f2151I = i;
            this.f2230a.f2150H = true;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3058a(CharSequence[] charSequenceArr, OnClickListener onClickListener) {
            this.f2230a.f2180v = charSequenceArr;
            this.f2230a.f2182x = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C0766a mo3059a(CharSequence[] charSequenceArr, boolean[] zArr, OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.f2230a.f2180v = charSequenceArr;
            this.f2230a.f2152J = onMultiChoiceClickListener;
            this.f2230a.f2148F = zArr;
            this.f2230a.f2149G = true;
            return this;
        }

        /* renamed from: b */
        public C0766a mo3060b(int i) {
            this.f2230a.f2166h = this.f2230a.f2159a.getText(i);
            return this;
        }

        /* renamed from: b */
        public C0766a mo3061b(int i, OnClickListener onClickListener) {
            this.f2230a.f2170l = this.f2230a.f2159a.getText(i);
            this.f2230a.f2172n = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0766a mo3062b(View view) {
            this.f2230a.f2184z = view;
            this.f2230a.f2183y = 0;
            this.f2230a.f2147E = false;
            return this;
        }

        /* renamed from: b */
        public C0766a mo3063b(CharSequence charSequence) {
            this.f2230a.f2166h = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0766a mo3064b(CharSequence charSequence, OnClickListener onClickListener) {
            this.f2230a.f2170l = charSequence;
            this.f2230a.f2172n = onClickListener;
            return this;
        }

        /* renamed from: b */
        public C0765d mo3065b() {
            C0765d dVar = new C0765d(this.f2230a.f2159a, this.f2231b);
            this.f2230a.mo2957a(dVar.f2229a);
            dVar.setCancelable(this.f2230a.f2176r);
            if (this.f2230a.f2176r) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.f2230a.f2177s);
            dVar.setOnDismissListener(this.f2230a.f2178t);
            if (this.f2230a.f2179u != null) {
                dVar.setOnKeyListener(this.f2230a.f2179u);
            }
            return dVar;
        }

        /* renamed from: c */
        public C0766a mo3066c(int i) {
            this.f2230a.f2161c = i;
            return this;
        }

        /* renamed from: c */
        public C0766a mo3067c(CharSequence charSequence, OnClickListener onClickListener) {
            this.f2230a.f2173o = charSequence;
            this.f2230a.f2175q = onClickListener;
            return this;
        }

        /* renamed from: c */
        public C0765d mo3068c() {
            C0765d b = mo3065b();
            b.show();
            return b;
        }
    }

    protected C0765d(Context context, int i) {
        super(context, m3535a(context, i));
    }

    /* renamed from: a */
    static int m3535a(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0727a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public Button mo3039a(int i) {
        return this.f2229a.mo2950d(i);
    }

    /* renamed from: a */
    public void mo3040a(int i, CharSequence charSequence, OnClickListener onClickListener) {
        this.f2229a.mo2939a(i, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    /* renamed from: a */
    public void mo3041a(CharSequence charSequence) {
        this.f2229a.mo2946b(charSequence);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2229a.mo2937a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f2229a.mo2943a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f2229a.mo2947b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f2229a.mo2942a(charSequence);
    }
}
