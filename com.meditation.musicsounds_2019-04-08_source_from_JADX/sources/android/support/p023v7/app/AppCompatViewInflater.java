package android.support.p023v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p009v4.p019g.C0488a;
import android.support.p009v4.view.C0626s;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.view.C0830d;
import android.support.p023v7.widget.AppCompatCheckBox;
import android.support.p023v7.widget.AppCompatImageButton;
import android.support.p023v7.widget.AppCompatImageView;
import android.support.p023v7.widget.AppCompatRadioButton;
import android.support.p023v7.widget.AppCompatSeekBar;
import android.support.p023v7.widget.AppCompatSpinner;
import android.support.p023v7.widget.C1075bh;
import android.support.p023v7.widget.C1106f;
import android.support.p023v7.widget.C1108h;
import android.support.p023v7.widget.C1109i;
import android.support.p023v7.widget.C1116l;
import android.support.p023v7.widget.C1119o;
import android.support.p023v7.widget.C1122r;
import android.support.p023v7.widget.C1127v;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: android.support.v7.app.AppCompatViewInflater */
public class AppCompatViewInflater {

    /* renamed from: a */
    private static final Class<?>[] f2198a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f2199b = {16843375};

    /* renamed from: c */
    private static final String[] f2200c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final Map<String, Constructor<? extends View>> f2201d = new C0488a();

    /* renamed from: e */
    private final Object[] f2202e = new Object[2];

    /* renamed from: android.support.v7.app.AppCompatViewInflater$a */
    private static class C0750a implements OnClickListener {

        /* renamed from: a */
        private final View f2203a;

        /* renamed from: b */
        private final String f2204b;

        /* renamed from: c */
        private Method f2205c;

        /* renamed from: d */
        private Context f2206d;

        public C0750a(View view, String str) {
            this.f2203a = view;
            this.f2204b = str;
        }

        /* renamed from: a */
        private void m3456a(Context context, String str) {
            String str2;
            while (context != null) {
                try {
                    if (!context.isRestricted()) {
                        Method method = context.getClass().getMethod(this.f2204b, new Class[]{View.class});
                        if (method != null) {
                            this.f2205c = method;
                            this.f2206d = context;
                            return;
                        }
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f2203a.getId();
            if (id == -1) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" with id '");
                sb.append(this.f2203a.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find method ");
            sb2.append(this.f2204b);
            sb2.append("(View) in a parent or ancestor Context for android:onClick ");
            sb2.append("attribute defined on view ");
            sb2.append(this.f2203a.getClass());
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        public void onClick(View view) {
            if (this.f2205c == null) {
                m3456a(this.f2203a.getContext(), this.f2204b);
            }
            try {
                this.f2205c.invoke(this.f2206d, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private static Context m3436a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0736j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C0736j.View_theme, 0);
            if (resourceId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C0830d) || ((C0830d) context).mo3290a() != resourceId) ? new C0830d(context, resourceId) : context : context;
    }

    /* renamed from: a */
    private View m3437a(Context context, String str, String str2) {
        String str3;
        Constructor constructor = (Constructor) f2201d.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(f2198a);
                f2201d.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2202e);
    }

    /* renamed from: a */
    private void m3438a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || C0626s.m2834A(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2199b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0750a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private void m3439a(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: b */
    private View m3440b(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f2202e[0] = context;
            this.f2202e[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String a : f2200c) {
                    View a2 = m3437a(context, str, a);
                    if (a2 != null) {
                        return a2;
                    }
                }
                this.f2202e[0] = null;
                this.f2202e[1] = null;
                return null;
            }
            View a3 = m3437a(context, str, (String) null);
            this.f2202e[0] = null;
            this.f2202e[1] = null;
            return a3;
        } catch (Exception unused) {
            return null;
        } finally {
            this.f2202e[0] = null;
            this.f2202e[1] = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1127v mo2967a(Context context, AttributeSet attributeSet) {
        return new C1127v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo2968a(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo2969a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m3436a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C1075bh.m5876a(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo2967a(context2, attributeSet);
                break;
            case 1:
                view2 = mo2970b(context2, attributeSet);
                break;
            case 2:
                view2 = mo2971c(context2, attributeSet);
                break;
            case 3:
                view2 = mo2972d(context2, attributeSet);
                break;
            case 4:
                view2 = mo2973e(context2, attributeSet);
                break;
            case 5:
                view2 = mo2974f(context2, attributeSet);
                break;
            case 6:
                view2 = mo2975g(context2, attributeSet);
                break;
            case 7:
                view2 = mo2976h(context2, attributeSet);
                break;
            case 8:
                view2 = mo2977i(context2, attributeSet);
                break;
            case 9:
                view2 = mo2978j(context2, attributeSet);
                break;
            case 10:
                view2 = mo2979k(context2, attributeSet);
                break;
            case 11:
                view2 = mo2980l(context2, attributeSet);
                break;
            case 12:
                view2 = mo2981m(context2, attributeSet);
                break;
            default:
                view2 = mo2968a(context2, str, attributeSet);
                break;
        }
        m3439a(view2, str);
        if (view2 == null && context != context2) {
            view2 = m3440b(context2, str, attributeSet);
        }
        if (view2 != null) {
            m3438a(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AppCompatImageView mo2970b(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1108h mo2971c(Context context, AttributeSet attributeSet) {
        return new C1108h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C1116l mo2972d(Context context, AttributeSet attributeSet) {
        return new C1116l(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public AppCompatSpinner mo2973e(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public AppCompatImageButton mo2974f(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public AppCompatCheckBox mo2975g(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AppCompatRadioButton mo2976h(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C1109i mo2977i(Context context, AttributeSet attributeSet) {
        return new C1109i(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C1106f mo2978j(Context context, AttributeSet attributeSet) {
        return new C1106f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C1119o mo2979k(Context context, AttributeSet attributeSet) {
        return new C1119o(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C1122r mo2980l(Context context, AttributeSet attributeSet) {
        return new C1122r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public AppCompatSeekBar mo2981m(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }
}
