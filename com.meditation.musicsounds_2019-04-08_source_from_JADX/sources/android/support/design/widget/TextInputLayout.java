package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0087a.C0093f;
import android.support.design.C0087a.C0095h;
import android.support.design.C0087a.C0096i;
import android.support.design.C0087a.C0097j;
import android.support.design.C0087a.C0098k;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.C0577a;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.view.p021a.C0583b;
import android.support.p009v4.widget.C0710o;
import android.support.p009v4.widget.C0711p;
import android.support.p009v4.widget.C0725t;
import android.support.p023v7.p024a.C0726a.C0729c;
import android.support.p023v7.p024a.C0726a.C0735i;
import android.support.p023v7.p026c.p027a.C0817b;
import android.support.p023v7.widget.C1011ag;
import android.support.p023v7.widget.C1078bk;
import android.support.p023v7.widget.C1095bt;
import android.support.p023v7.widget.C1111k;
import android.support.p023v7.widget.C1127v;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class TextInputLayout extends LinearLayout implements C1095bt {

    /* renamed from: A */
    private boolean f432A;

    /* renamed from: B */
    private Drawable f433B;

    /* renamed from: C */
    private Drawable f434C;

    /* renamed from: D */
    private ColorStateList f435D;

    /* renamed from: E */
    private boolean f436E;

    /* renamed from: F */
    private Mode f437F;

    /* renamed from: G */
    private boolean f438G;

    /* renamed from: H */
    private ColorStateList f439H;

    /* renamed from: I */
    private ColorStateList f440I;

    /* renamed from: J */
    private boolean f441J;

    /* renamed from: K */
    private boolean f442K;

    /* renamed from: L */
    private ValueAnimator f443L;

    /* renamed from: M */
    private boolean f444M;

    /* renamed from: N */
    private boolean f445N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f446O;

    /* renamed from: a */
    EditText f447a;

    /* renamed from: b */
    TextView f448b;

    /* renamed from: c */
    boolean f449c;

    /* renamed from: d */
    final C0184e f450d;

    /* renamed from: e */
    private final FrameLayout f451e;

    /* renamed from: f */
    private CharSequence f452f;

    /* renamed from: g */
    private boolean f453g;

    /* renamed from: h */
    private CharSequence f454h;

    /* renamed from: i */
    private Paint f455i;

    /* renamed from: j */
    private final Rect f456j;

    /* renamed from: k */
    private LinearLayout f457k;

    /* renamed from: l */
    private int f458l;

    /* renamed from: m */
    private Typeface f459m;

    /* renamed from: n */
    private boolean f460n;

    /* renamed from: o */
    private int f461o;

    /* renamed from: p */
    private boolean f462p;

    /* renamed from: q */
    private CharSequence f463q;

    /* renamed from: r */
    private TextView f464r;

    /* renamed from: s */
    private int f465s;

    /* renamed from: t */
    private int f466t;

    /* renamed from: u */
    private int f467u;

    /* renamed from: v */
    private boolean f468v;

    /* renamed from: w */
    private boolean f469w;

    /* renamed from: x */
    private Drawable f470x;

    /* renamed from: y */
    private CharSequence f471y;

    /* renamed from: z */
    private CheckableImageButton f472z;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        CharSequence f479a;

        /* renamed from: b */
        boolean f480b;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f479a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f480b = z;
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.f479a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f479a, parcel, i);
            parcel.writeInt(this.f480b ? 1 : 0);
        }
    }

    /* renamed from: android.support.design.widget.TextInputLayout$a */
    private class C0162a extends C0577a {
        C0162a() {
        }

        /* renamed from: a */
        public void mo285a(View view, C0583b bVar) {
            super.mo285a(view, bVar);
            bVar.mo2361b((CharSequence) TextInputLayout.class.getSimpleName());
            CharSequence g = TextInputLayout.this.f450d.mo873g();
            if (!TextUtils.isEmpty(g)) {
                bVar.mo2366c(g);
            }
            if (TextInputLayout.this.f447a != null) {
                bVar.mo2370d((View) TextInputLayout.this.f447a);
            }
            CharSequence text = TextInputLayout.this.f448b != null ? TextInputLayout.this.f448b.getText() : null;
            if (!TextUtils.isEmpty(text)) {
                bVar.mo2391l(true);
                bVar.mo2374e(text);
            }
        }

        /* renamed from: a */
        public void mo474a(View view, AccessibilityEvent accessibilityEvent) {
            super.mo474a(view, accessibilityEvent);
            accessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
        }

        /* renamed from: b */
        public void mo805b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo805b(view, accessibilityEvent);
            CharSequence g = TextInputLayout.this.f450d.mo873g();
            if (!TextUtils.isEmpty(g)) {
                accessibilityEvent.getText().add(g);
            }
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f456j = new Rect();
        this.f450d = new C0184e(this);
        C0211q.m831a(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.f451e = new FrameLayout(context);
        this.f451e.setAddStatesFromChildren(true);
        addView(this.f451e);
        this.f450d.mo859a(C0163a.f483b);
        this.f450d.mo867b((Interpolator) new AccelerateInterpolator());
        this.f450d.mo864b(8388659);
        C1078bk a = C1078bk.m5881a(context, attributeSet, C0098k.TextInputLayout, i, C0097j.Widget_Design_TextInputLayout);
        this.f453g = a.mo5359a(C0098k.TextInputLayout_hintEnabled, true);
        setHint(a.mo5363c(C0098k.TextInputLayout_android_hint));
        this.f442K = a.mo5359a(C0098k.TextInputLayout_hintAnimationEnabled, true);
        if (a.mo5371g(C0098k.TextInputLayout_android_textColorHint)) {
            ColorStateList e = a.mo5367e(C0098k.TextInputLayout_android_textColorHint);
            this.f440I = e;
            this.f439H = e;
        }
        if (a.mo5370g(C0098k.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(a.mo5370g(C0098k.TextInputLayout_hintTextAppearance, 0));
        }
        this.f461o = a.mo5370g(C0098k.TextInputLayout_errorTextAppearance, 0);
        boolean a2 = a.mo5359a(C0098k.TextInputLayout_errorEnabled, false);
        boolean a3 = a.mo5359a(C0098k.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(a.mo5355a(C0098k.TextInputLayout_counterMaxLength, -1));
        this.f466t = a.mo5370g(C0098k.TextInputLayout_counterTextAppearance, 0);
        this.f467u = a.mo5370g(C0098k.TextInputLayout_counterOverflowTextAppearance, 0);
        this.f469w = a.mo5359a(C0098k.TextInputLayout_passwordToggleEnabled, false);
        this.f470x = a.mo5357a(C0098k.TextInputLayout_passwordToggleDrawable);
        this.f471y = a.mo5363c(C0098k.TextInputLayout_passwordToggleContentDescription);
        if (a.mo5371g(C0098k.TextInputLayout_passwordToggleTint)) {
            this.f436E = true;
            this.f435D = a.mo5367e(C0098k.TextInputLayout_passwordToggleTint);
        }
        if (a.mo5371g(C0098k.TextInputLayout_passwordToggleTintMode)) {
            this.f438G = true;
            this.f437F = C0214t.m841a(a.mo5355a(C0098k.TextInputLayout_passwordToggleTintMode, -1), null);
        }
        a.mo5358a();
        setErrorEnabled(a2);
        setCounterEnabled(a3);
        m637h();
        if (C0626s.m2859d(this) == 0) {
            C0626s.m2854b((View) this, 1);
        }
        C0626s.m2844a((View) this, (C0577a) new C0162a());
    }

    /* renamed from: a */
    private void m620a() {
        int i;
        LayoutParams layoutParams = (LayoutParams) this.f451e.getLayoutParams();
        if (this.f453g) {
            if (this.f455i == null) {
                this.f455i = new Paint();
            }
            this.f455i.setTypeface(this.f450d.mo862b());
            this.f455i.setTextSize(this.f450d.mo871e());
            i = (int) (-this.f455i.ascent());
        } else {
            i = 0;
        }
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.f451e.requestLayout();
        }
    }

    /* renamed from: a */
    private static void m622a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m622a((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: a */
    private void m623a(TextView textView) {
        if (this.f457k != null) {
            this.f457k.removeView(textView);
            int i = this.f458l - 1;
            this.f458l = i;
            if (i == 0) {
                this.f457k.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private void m624a(TextView textView, int i) {
        if (this.f457k == null) {
            this.f457k = new LinearLayout(getContext());
            this.f457k.setOrientation(0);
            addView(this.f457k, -1, -2);
            this.f457k.addView(new C0710o(getContext()), new LayoutParams(0, 0, 1.0f));
            if (this.f447a != null) {
                m628b();
            }
        }
        this.f457k.setVisibility(0);
        this.f457k.addView(textView, i);
        this.f458l++;
    }

    /* renamed from: a */
    private void m625a(final CharSequence charSequence, boolean z) {
        ViewPropertyAnimator listener;
        this.f463q = charSequence;
        if (!this.f460n) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        this.f462p = !TextUtils.isEmpty(charSequence);
        this.f448b.animate().cancel();
        if (this.f462p) {
            this.f448b.setText(charSequence);
            this.f448b.setVisibility(0);
            if (z) {
                if (this.f448b.getAlpha() == 1.0f) {
                    this.f448b.setAlpha(0.0f);
                }
                listener = this.f448b.animate().alpha(1.0f).setDuration(200).setInterpolator(C0163a.f485d).setListener(new AnimatorListenerAdapter() {
                    public void onAnimationStart(Animator animator) {
                        TextInputLayout.this.f448b.setVisibility(0);
                    }
                });
            } else {
                this.f448b.setAlpha(1.0f);
                m630c();
                mo755a(z);
            }
        } else {
            if (this.f448b.getVisibility() == 0) {
                if (z) {
                    listener = this.f448b.animate().alpha(0.0f).setDuration(200).setInterpolator(C0163a.f484c).setListener(new AnimatorListenerAdapter() {
                        public void onAnimationEnd(Animator animator) {
                            TextInputLayout.this.f448b.setText(charSequence);
                            TextInputLayout.this.f448b.setVisibility(4);
                        }
                    });
                } else {
                    this.f448b.setText(charSequence);
                    this.f448b.setVisibility(4);
                }
            }
            m630c();
            mo755a(z);
        }
        listener.start();
        m630c();
        mo755a(z);
    }

    /* renamed from: a */
    private static boolean m627a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m628b() {
        C0626s.m2839a(this.f457k, C0626s.m2864g(this.f447a), 0, C0626s.m2865h(this.f447a), this.f447a.getPaddingBottom());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m629b(boolean z) {
        boolean z2;
        if (this.f469w) {
            int selectionEnd = this.f447a.getSelectionEnd();
            if (m635f()) {
                this.f447a.setTransformationMethod(null);
                z2 = true;
            } else {
                this.f447a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                z2 = false;
            }
            this.f432A = z2;
            this.f472z.setChecked(this.f432A);
            if (z) {
                this.f472z.jumpDrawablesToCurrentState();
            }
            this.f447a.setSelection(selectionEnd);
        }
    }

    /* renamed from: c */
    private void m630c() {
        TextView textView;
        if (this.f447a != null) {
            Drawable background = this.f447a.getBackground();
            if (background != null) {
                m632d();
                if (C1011ag.m5521c(background)) {
                    background = background.mutate();
                }
                if (this.f462p && this.f448b != null) {
                    textView = this.f448b;
                } else if (!this.f468v || this.f464r == null) {
                    C0311a.m1185f(background);
                    this.f447a.refreshDrawableState();
                } else {
                    textView = this.f464r;
                }
                background.setColorFilter(C1111k.m6077a(textView.getCurrentTextColor(), Mode.SRC_IN));
            }
        }
    }

    /* renamed from: c */
    private void m631c(boolean z) {
        if (this.f443L != null && this.f443L.isRunning()) {
            this.f443L.cancel();
        }
        if (!z || !this.f442K) {
            this.f450d.mo863b(1.0f);
        } else {
            mo753a(1.0f);
        }
        this.f441J = false;
    }

    /* renamed from: d */
    private void m632d() {
        int i = VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            Drawable background = this.f447a.getBackground();
            if (background != null && !this.f444M) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.f444M = C0185f.m721a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.f444M) {
                    C0626s.m2843a((View) this.f447a, newDrawable);
                    this.f444M = true;
                }
            }
        }
    }

    /* renamed from: d */
    private void m633d(boolean z) {
        if (this.f443L != null && this.f443L.isRunning()) {
            this.f443L.cancel();
        }
        if (!z || !this.f442K) {
            this.f450d.mo863b(0.0f);
        } else {
            mo753a(0.0f);
        }
        this.f441J = true;
    }

    /* renamed from: e */
    private void m634e() {
        if (this.f447a != null) {
            if (m636g()) {
                if (this.f472z == null) {
                    this.f472z = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C0095h.design_text_input_password_icon, this.f451e, false);
                    this.f472z.setImageDrawable(this.f470x);
                    this.f472z.setContentDescription(this.f471y);
                    this.f451e.addView(this.f472z);
                    this.f472z.setOnClickListener(new OnClickListener() {
                        public void onClick(View view) {
                            TextInputLayout.this.m629b(false);
                        }
                    });
                }
                if (this.f447a != null && C0626s.m2867j(this.f447a) <= 0) {
                    this.f447a.setMinimumHeight(C0626s.m2867j(this.f472z));
                }
                this.f472z.setVisibility(0);
                this.f472z.setChecked(this.f432A);
                if (this.f433B == null) {
                    this.f433B = new ColorDrawable();
                }
                this.f433B.setBounds(0, 0, this.f472z.getMeasuredWidth(), 1);
                Drawable[] b = C0711p.m3331b(this.f447a);
                if (b[2] != this.f433B) {
                    this.f434C = b[2];
                }
                C0711p.m3329a(this.f447a, b[0], b[1], this.f433B, b[3]);
                this.f472z.setPadding(this.f447a.getPaddingLeft(), this.f447a.getPaddingTop(), this.f447a.getPaddingRight(), this.f447a.getPaddingBottom());
            } else {
                if (this.f472z != null && this.f472z.getVisibility() == 0) {
                    this.f472z.setVisibility(8);
                }
                if (this.f433B != null) {
                    Drawable[] b2 = C0711p.m3331b(this.f447a);
                    if (b2[2] == this.f433B) {
                        C0711p.m3329a(this.f447a, b2[0], b2[1], this.f434C, b2[3]);
                        this.f433B = null;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private boolean m635f() {
        return this.f447a != null && (this.f447a.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: g */
    private boolean m636g() {
        return this.f469w && (m635f() || this.f432A);
    }

    /* renamed from: h */
    private void m637h() {
        if (this.f470x == null) {
            return;
        }
        if (this.f436E || this.f438G) {
            this.f470x = C0311a.m1186g(this.f470x).mutate();
            if (this.f436E) {
                C0311a.m1175a(this.f470x, this.f435D);
            }
            if (this.f438G) {
                C0311a.m1178a(this.f470x, this.f437F);
            }
            if (this.f472z != null && this.f472z.getDrawable() != this.f470x) {
                this.f472z.setImageDrawable(this.f470x);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f447a == null) {
            if (!(editText instanceof C0210p)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f447a = editText;
            if (!m635f()) {
                this.f450d.mo858a(this.f447a.getTypeface());
            }
            this.f450d.mo853a(this.f447a.getTextSize());
            int gravity = this.f447a.getGravity();
            this.f450d.mo864b((gravity & -113) | 48);
            this.f450d.mo854a(gravity);
            this.f447a.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable editable) {
                    TextInputLayout.this.mo755a(!TextInputLayout.this.f446O);
                    if (TextInputLayout.this.f449c) {
                        TextInputLayout.this.mo754a(editable.length());
                    }
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }
            });
            if (this.f439H == null) {
                this.f439H = this.f447a.getHintTextColors();
            }
            if (this.f453g && TextUtils.isEmpty(this.f454h)) {
                this.f452f = this.f447a.getHint();
                setHint(this.f452f);
                this.f447a.setHint(null);
            }
            if (this.f464r != null) {
                mo754a(this.f447a.getText().length());
            }
            if (this.f457k != null) {
                m628b();
            }
            m634e();
            mo756a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        this.f454h = charSequence;
        this.f450d.mo860a(charSequence);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo753a(float f) {
        if (this.f450d.mo870d() != f) {
            if (this.f443L == null) {
                this.f443L = new ValueAnimator();
                this.f443L.setInterpolator(C0163a.f482a);
                this.f443L.setDuration(200);
                this.f443L.addUpdateListener(new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TextInputLayout.this.f450d.mo863b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.f443L.setFloatValues(new float[]{this.f450d.mo870d(), f});
            this.f443L.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo754a(int i) {
        boolean z = this.f468v;
        if (this.f465s == -1) {
            this.f464r.setText(String.valueOf(i));
            this.f468v = false;
        } else {
            this.f468v = i > this.f465s;
            if (z != this.f468v) {
                C0711p.m3328a(this.f464r, this.f468v ? this.f467u : this.f466t);
            }
            this.f464r.setText(getContext().getString(C0096i.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f465s)}));
        }
        if (this.f447a != null && z != this.f468v) {
            mo755a(false);
            m630c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo755a(boolean z) {
        mo756a(z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo756a(boolean z, boolean z2) {
        C0184e eVar;
        ColorStateList colorStateList;
        boolean isEnabled = isEnabled();
        boolean z3 = this.f447a != null && !TextUtils.isEmpty(this.f447a.getText());
        boolean a = m627a(getDrawableState(), 16842908);
        boolean isEmpty = true ^ TextUtils.isEmpty(getError());
        if (this.f439H != null) {
            this.f450d.mo866b(this.f439H);
        }
        if (isEnabled && this.f468v && this.f464r != null) {
            eVar = this.f450d;
            colorStateList = this.f464r.getTextColors();
        } else if (!isEnabled || !a || this.f440I == null) {
            if (this.f439H != null) {
                eVar = this.f450d;
                colorStateList = this.f439H;
            }
            if (!z3 || (isEnabled() && (a || isEmpty))) {
                if (!z2 || this.f441J) {
                    m631c(z);
                }
                return;
            } else if (z2 || !this.f441J) {
                m633d(z);
                return;
            } else {
                return;
            }
        } else {
            eVar = this.f450d;
            colorStateList = this.f440I;
        }
        eVar.mo856a(colorStateList);
        if (!z3) {
        }
        if (!z2) {
        }
        m631c(z);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f451e.addView(view, layoutParams2);
            this.f451e.setLayoutParams(layoutParams);
            m620a();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f452f == null || this.f447a == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        CharSequence hint = this.f447a.getHint();
        this.f447a.setHint(this.f452f);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f447a.setHint(hint);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f446O = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f446O = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f453g) {
            this.f450d.mo857a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f445N) {
            boolean z = true;
            this.f445N = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!C0626s.m2880w(this) || !isEnabled()) {
                z = false;
            }
            mo755a(z);
            m630c();
            if (this.f450d != null ? this.f450d.mo861a(drawableState) | false : false) {
                invalidate();
            }
            this.f445N = false;
        }
    }

    public int getCounterMaxLength() {
        return this.f465s;
    }

    public EditText getEditText() {
        return this.f447a;
    }

    public CharSequence getError() {
        if (this.f460n) {
            return this.f463q;
        }
        return null;
    }

    public CharSequence getHint() {
        if (this.f453g) {
            return this.f454h;
        }
        return null;
    }

    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f471y;
    }

    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f470x;
    }

    public Typeface getTypeface() {
        return this.f459m;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f453g && this.f447a != null) {
            Rect rect = this.f456j;
            C0725t.m3404b(this, this.f447a, rect);
            int compoundPaddingLeft = rect.left + this.f447a.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.f447a.getCompoundPaddingRight();
            this.f450d.mo855a(compoundPaddingLeft, rect.top + this.f447a.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.f447a.getCompoundPaddingBottom());
            this.f450d.mo865b(compoundPaddingLeft, getPaddingTop(), compoundPaddingRight, (i4 - i2) - getPaddingBottom());
            this.f450d.mo872f();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m634e();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2234a());
        setError(savedState.f479a);
        if (savedState.f480b) {
            m629b(true);
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f462p) {
            savedState.f479a = getError();
        }
        savedState.f480b = this.f432A;
        return savedState;
    }

    public void setCounterEnabled(boolean z) {
        if (this.f449c != z) {
            if (z) {
                this.f464r = new C1127v(getContext());
                this.f464r.setId(C0093f.textinput_counter);
                if (this.f459m != null) {
                    this.f464r.setTypeface(this.f459m);
                }
                this.f464r.setMaxLines(1);
                try {
                    C0711p.m3328a(this.f464r, this.f466t);
                } catch (Exception unused) {
                    C0711p.m3328a(this.f464r, C0735i.TextAppearance_AppCompat_Caption);
                    this.f464r.setTextColor(C0452b.m2068c(getContext(), C0729c.error_color_material));
                }
                m624a(this.f464r, -1);
                mo754a(this.f447a == null ? 0 : this.f447a.getText().length());
            } else {
                m623a(this.f464r);
                this.f464r = null;
            }
            this.f449c = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f465s != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f465s = i;
            if (this.f449c) {
                mo754a(this.f447a == null ? 0 : this.f447a.getText().length());
            }
        }
    }

    public void setEnabled(boolean z) {
        m622a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public void setError(CharSequence charSequence) {
        m625a(charSequence, C0626s.m2880w(this) && isEnabled() && (this.f448b == null || !TextUtils.equals(this.f448b.getText(), charSequence)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setErrorEnabled(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.f460n
            if (r0 == r6) goto L_0x008a
            android.widget.TextView r0 = r5.f448b
            if (r0 == 0) goto L_0x0011
            android.widget.TextView r0 = r5.f448b
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r0.cancel()
        L_0x0011:
            r0 = 0
            if (r6 == 0) goto L_0x007b
            android.support.v7.widget.v r1 = new android.support.v7.widget.v
            android.content.Context r2 = r5.getContext()
            r1.<init>(r2)
            r5.f448b = r1
            android.widget.TextView r1 = r5.f448b
            int r2 = android.support.design.C0087a.C0093f.textinput_error
            r1.setId(r2)
            android.graphics.Typeface r1 = r5.f459m
            if (r1 == 0) goto L_0x0031
            android.widget.TextView r1 = r5.f448b
            android.graphics.Typeface r2 = r5.f459m
            r1.setTypeface(r2)
        L_0x0031:
            r1 = 1
            android.widget.TextView r2 = r5.f448b     // Catch:{ Exception -> 0x0051 }
            int r3 = r5.f461o     // Catch:{ Exception -> 0x0051 }
            android.support.p009v4.widget.C0711p.m3328a(r2, r3)     // Catch:{ Exception -> 0x0051 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0051 }
            r3 = 23
            if (r2 < r3) goto L_0x004f
            android.widget.TextView r2 = r5.f448b     // Catch:{ Exception -> 0x0051 }
            android.content.res.ColorStateList r2 = r2.getTextColors()     // Catch:{ Exception -> 0x0051 }
            int r2 = r2.getDefaultColor()     // Catch:{ Exception -> 0x0051 }
            r3 = -65281(0xffffffffffff00ff, float:NaN)
            if (r2 != r3) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r2 = 0
            goto L_0x0052
        L_0x0051:
            r2 = 1
        L_0x0052:
            if (r2 == 0) goto L_0x006a
            android.widget.TextView r2 = r5.f448b
            int r3 = android.support.p023v7.p024a.C0726a.C0735i.TextAppearance_AppCompat_Caption
            android.support.p009v4.widget.C0711p.m3328a(r2, r3)
            android.widget.TextView r2 = r5.f448b
            android.content.Context r3 = r5.getContext()
            int r4 = android.support.p023v7.p024a.C0726a.C0729c.error_color_material
            int r3 = android.support.p009v4.content.C0452b.m2068c(r3, r4)
            r2.setTextColor(r3)
        L_0x006a:
            android.widget.TextView r2 = r5.f448b
            r3 = 4
            r2.setVisibility(r3)
            android.widget.TextView r2 = r5.f448b
            android.support.p009v4.view.C0626s.m2858c(r2, r1)
            android.widget.TextView r1 = r5.f448b
            r5.m624a(r1, r0)
            goto L_0x0088
        L_0x007b:
            r5.f462p = r0
            r5.m630c()
            android.widget.TextView r0 = r5.f448b
            r5.m623a(r0)
            r0 = 0
            r5.f448b = r0
        L_0x0088:
            r5.f460n = r6
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setErrorEnabled(boolean):void");
    }

    public void setErrorTextAppearance(int i) {
        this.f461o = i;
        if (this.f448b != null) {
            C0711p.m3328a(this.f448b, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f453g) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f442K = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f453g) {
            this.f453g = z;
            CharSequence hint = this.f447a.getHint();
            if (!this.f453g) {
                if (!TextUtils.isEmpty(this.f454h) && TextUtils.isEmpty(hint)) {
                    this.f447a.setHint(this.f454h);
                }
                setHintInternal(null);
            } else if (!TextUtils.isEmpty(hint)) {
                if (TextUtils.isEmpty(this.f454h)) {
                    setHint(hint);
                }
                this.f447a.setHint(null);
            }
            if (this.f447a != null) {
                m620a();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f450d.mo868c(i);
        this.f440I = this.f450d.mo874h();
        if (this.f447a != null) {
            mo755a(false);
            m620a();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f471y = charSequence;
        if (this.f472z != null) {
            this.f472z.setContentDescription(charSequence);
        }
    }

    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0817b.m3884b(getContext(), i) : null);
    }

    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f470x = drawable;
        if (this.f472z != null) {
            this.f472z.setImageDrawable(drawable);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.f469w != z) {
            this.f469w = z;
            if (!z && this.f432A && this.f447a != null) {
                this.f447a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f432A = false;
            m634e();
        }
    }

    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f435D = colorStateList;
        this.f436E = true;
        m637h();
    }

    public void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f437F = mode;
        this.f438G = true;
        m637h();
    }

    public void setTypeface(Typeface typeface) {
        if ((this.f459m != null && !this.f459m.equals(typeface)) || (this.f459m == null && typeface != null)) {
            this.f459m = typeface;
            this.f450d.mo858a(typeface);
            if (this.f464r != null) {
                this.f464r.setTypeface(typeface);
            }
            if (this.f448b != null) {
                this.f448b.setTypeface(typeface);
            }
        }
    }
}
