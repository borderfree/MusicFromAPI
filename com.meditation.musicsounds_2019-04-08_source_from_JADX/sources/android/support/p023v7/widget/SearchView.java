package android.support.p023v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.p009v4.view.AbsSavedState;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.widget.C0689f;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0730d;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0733g;
import android.support.p023v7.p024a.C0726a.C0734h;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.view.C0829c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: android.support.v7.widget.SearchView */
public class SearchView extends C1031an implements C0829c {

    /* renamed from: i */
    static final C0971a f3175i = new C0971a();

    /* renamed from: A */
    private C0973c f3176A;

    /* renamed from: B */
    private C0972b f3177B;

    /* renamed from: C */
    private C0974d f3178C;

    /* renamed from: D */
    private OnClickListener f3179D;

    /* renamed from: E */
    private boolean f3180E;

    /* renamed from: F */
    private boolean f3181F;

    /* renamed from: G */
    private boolean f3182G;

    /* renamed from: H */
    private CharSequence f3183H;

    /* renamed from: I */
    private boolean f3184I;

    /* renamed from: J */
    private boolean f3185J;

    /* renamed from: K */
    private int f3186K;

    /* renamed from: L */
    private boolean f3187L;

    /* renamed from: M */
    private CharSequence f3188M;

    /* renamed from: N */
    private CharSequence f3189N;

    /* renamed from: O */
    private boolean f3190O;

    /* renamed from: P */
    private int f3191P;

    /* renamed from: Q */
    private Bundle f3192Q;

    /* renamed from: R */
    private final Runnable f3193R;

    /* renamed from: S */
    private Runnable f3194S;

    /* renamed from: T */
    private final WeakHashMap<String, ConstantState> f3195T;

    /* renamed from: U */
    private final OnClickListener f3196U;

    /* renamed from: V */
    private final OnEditorActionListener f3197V;

    /* renamed from: W */
    private final OnItemClickListener f3198W;

    /* renamed from: a */
    final SearchAutoComplete f3199a;

    /* renamed from: aa */
    private final OnItemSelectedListener f3200aa;

    /* renamed from: ab */
    private TextWatcher f3201ab;

    /* renamed from: b */
    final ImageView f3202b;

    /* renamed from: c */
    final ImageView f3203c;

    /* renamed from: d */
    final ImageView f3204d;

    /* renamed from: e */
    final ImageView f3205e;

    /* renamed from: f */
    OnFocusChangeListener f3206f;

    /* renamed from: g */
    C0689f f3207g;

    /* renamed from: h */
    SearchableInfo f3208h;

    /* renamed from: j */
    OnKeyListener f3209j;

    /* renamed from: k */
    private final View f3210k;

    /* renamed from: l */
    private final View f3211l;

    /* renamed from: m */
    private final View f3212m;

    /* renamed from: n */
    private final View f3213n;

    /* renamed from: o */
    private C0975e f3214o;

    /* renamed from: p */
    private Rect f3215p;

    /* renamed from: q */
    private Rect f3216q;

    /* renamed from: r */
    private int[] f3217r;

    /* renamed from: s */
    private int[] f3218s;

    /* renamed from: t */
    private final ImageView f3219t;

    /* renamed from: u */
    private final Drawable f3220u;

    /* renamed from: v */
    private final int f3221v;

    /* renamed from: w */
    private final int f3222w;

    /* renamed from: x */
    private final Intent f3223x;

    /* renamed from: y */
    private final Intent f3224y;

    /* renamed from: z */
    private final CharSequence f3225z;

    /* renamed from: android.support.v7.widget.SearchView$SavedState */
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
        boolean f3236a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3236a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.f3236a);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f3236a));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    public static class SearchAutoComplete extends C1106f {

        /* renamed from: a */
        final Runnable f3237a;

        /* renamed from: b */
        private int f3238b;

        /* renamed from: c */
        private SearchView f3239c;

        /* renamed from: d */
        private boolean f3240d;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0727a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f3237a = new Runnable() {
                public void run() {
                    SearchAutoComplete.this.m5148b();
                }
            };
            this.f3238b = getThreshold();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m5146a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m5148b() {
            if (this.f3240d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f3240d = false;
            }
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                return (i >= 600 || (i >= 640 && i2 >= 480)) ? 192 : 160;
            }
            return 256;
        }

        /* access modifiers changed from: private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f3240d = false;
                removeCallbacks(this.f3237a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f3240d = false;
                removeCallbacks(this.f3237a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f3240d = true;
            }
        }

        public boolean enoughToFilter() {
            return this.f3238b <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3240d) {
                removeCallbacks(this.f3237a);
                post(this.f3237a);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f3239c.mo4628i();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3239c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f3239c.hasFocus() && getVisibility() == 0) {
                this.f3240d = true;
                if (SearchView.m5109a(getContext())) {
                    SearchView.f3175i.mo4684a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: 0000 */
        public void setSearchView(SearchView searchView) {
            this.f3239c = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f3238b = i;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$a */
    private static class C0971a {

        /* renamed from: a */
        private Method f3242a;

        /* renamed from: b */
        private Method f3243b;

        /* renamed from: c */
        private Method f3244c;

        C0971a() {
            try {
                this.f3242a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f3242a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.f3243b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f3243b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.f3244c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f3244c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4683a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f3242a != null) {
                try {
                    this.f3242a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4684a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f3244c != null) {
                try {
                    this.f3244c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4685b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f3243b != null) {
                try {
                    this.f3243b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView$b */
    public interface C0972b {
        /* renamed from: a */
        boolean mo4686a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    public interface C0973c {
        /* renamed from: a */
        boolean mo4687a(String str);

        /* renamed from: a_ */
        boolean mo4688a_(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    public interface C0974d {
        /* renamed from: a */
        boolean mo4689a(int i);

        /* renamed from: b */
        boolean mo4690b(int i);
    }

    /* renamed from: android.support.v7.widget.SearchView$e */
    private static class C0975e extends TouchDelegate {

        /* renamed from: a */
        private final View f3245a;

        /* renamed from: b */
        private final Rect f3246b = new Rect();

        /* renamed from: c */
        private final Rect f3247c = new Rect();

        /* renamed from: d */
        private final Rect f3248d = new Rect();

        /* renamed from: e */
        private final int f3249e;

        /* renamed from: f */
        private boolean f3250f;

        public C0975e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f3249e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo4691a(rect, rect2);
            this.f3245a = view;
        }

        /* renamed from: a */
        public void mo4691a(Rect rect, Rect rect2) {
            this.f3246b.set(rect);
            this.f3248d.set(rect);
            this.f3248d.inset(-this.f3249e, -this.f3249e);
            this.f3247c.set(rect2);
        }

        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
                r6 = this;
                float r0 = r7.getX()
                int r0 = (int) r0
                float r1 = r7.getY()
                int r1 = (int) r1
                int r2 = r7.getAction()
                r3 = 1
                r4 = 0
                switch(r2) {
                    case 0: goto L_0x0027;
                    case 1: goto L_0x0019;
                    case 2: goto L_0x0019;
                    case 3: goto L_0x0014;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0033
            L_0x0014:
                boolean r2 = r6.f3250f
                r6.f3250f = r4
                goto L_0x0034
            L_0x0019:
                boolean r2 = r6.f3250f
                if (r2 == 0) goto L_0x0034
                android.graphics.Rect r5 = r6.f3248d
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L_0x0034
                r3 = 0
                goto L_0x0034
            L_0x0027:
                android.graphics.Rect r2 = r6.f3246b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x0033
                r6.f3250f = r3
                r2 = 1
                goto L_0x0034
            L_0x0033:
                r2 = 0
            L_0x0034:
                if (r2 == 0) goto L_0x0067
                if (r3 == 0) goto L_0x0052
                android.graphics.Rect r2 = r6.f3247c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0052
                android.view.View r0 = r6.f3245a
                int r0 = r0.getWidth()
                int r0 = r0 / 2
                float r0 = (float) r0
                android.view.View r1 = r6.f3245a
                int r1 = r1.getHeight()
                int r1 = r1 / 2
                goto L_0x005d
            L_0x0052:
                android.graphics.Rect r2 = r6.f3247c
                int r2 = r2.left
                int r0 = r0 - r2
                float r0 = (float) r0
                android.graphics.Rect r2 = r6.f3247c
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x005d:
                float r1 = (float) r1
                r7.setLocation(r0, r1)
                android.view.View r0 = r6.f3245a
                boolean r4 = r0.dispatchTouchEvent(r7)
            L_0x0067:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.SearchView.C0975e.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0727a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3215p = new Rect();
        this.f3216q = new Rect();
        this.f3217r = new int[2];
        this.f3218s = new int[2];
        this.f3193R = new Runnable() {
            public void run() {
                SearchView.this.mo4615d();
            }
        };
        this.f3194S = new Runnable() {
            public void run() {
                if (SearchView.this.f3207g != null && (SearchView.this.f3207g instanceof C1071be)) {
                    SearchView.this.f3207g.mo2864a((Cursor) null);
                }
            }
        };
        this.f3195T = new WeakHashMap<>();
        this.f3196U = new OnClickListener() {
            public void onClick(View view) {
                if (view == SearchView.this.f3202b) {
                    SearchView.this.mo4618g();
                } else if (view == SearchView.this.f3204d) {
                    SearchView.this.mo4617f();
                } else if (view == SearchView.this.f3203c) {
                    SearchView.this.mo4616e();
                } else if (view == SearchView.this.f3205e) {
                    SearchView.this.mo4627h();
                } else if (view == SearchView.this.f3199a) {
                    SearchView.this.mo4630l();
                }
            }
        };
        this.f3209j = new OnKeyListener() {
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.f3208h == null) {
                    return false;
                }
                if (SearchView.this.f3199a.isPopupShowing() && SearchView.this.f3199a.getListSelection() != -1) {
                    return SearchView.this.mo4611a(view, i, keyEvent);
                }
                if (SearchView.this.f3199a.m5146a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView.this.mo4606a(0, (String) null, SearchView.this.f3199a.getText().toString());
                return true;
            }
        };
        this.f3197V = new OnEditorActionListener() {
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.mo4616e();
                return true;
            }
        };
        this.f3198W = new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo4610a(i, 0, (String) null);
            }
        };
        this.f3200aa = new OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.mo4609a(i);
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        this.f3201ab = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.mo4612b(charSequence);
            }
        };
        C1078bk a = C1078bk.m5881a(context, attributeSet, C0736j.SearchView, i, 0);
        LayoutInflater.from(context).inflate(a.mo5370g(C0736j.SearchView_layout, C0733g.abc_search_view), this, true);
        this.f3199a = (SearchAutoComplete) findViewById(C0732f.search_src_text);
        this.f3199a.setSearchView(this);
        this.f3210k = findViewById(C0732f.search_edit_frame);
        this.f3211l = findViewById(C0732f.search_plate);
        this.f3212m = findViewById(C0732f.submit_area);
        this.f3202b = (ImageView) findViewById(C0732f.search_button);
        this.f3203c = (ImageView) findViewById(C0732f.search_go_btn);
        this.f3204d = (ImageView) findViewById(C0732f.search_close_btn);
        this.f3205e = (ImageView) findViewById(C0732f.search_voice_btn);
        this.f3219t = (ImageView) findViewById(C0732f.search_mag_icon);
        C0626s.m2843a(this.f3211l, a.mo5357a(C0736j.SearchView_queryBackground));
        C0626s.m2843a(this.f3212m, a.mo5357a(C0736j.SearchView_submitBackground));
        this.f3202b.setImageDrawable(a.mo5357a(C0736j.SearchView_searchIcon));
        this.f3203c.setImageDrawable(a.mo5357a(C0736j.SearchView_goIcon));
        this.f3204d.setImageDrawable(a.mo5357a(C0736j.SearchView_closeIcon));
        this.f3205e.setImageDrawable(a.mo5357a(C0736j.SearchView_voiceIcon));
        this.f3219t.setImageDrawable(a.mo5357a(C0736j.SearchView_searchIcon));
        this.f3220u = a.mo5357a(C0736j.SearchView_searchHintIcon);
        C1082bm.m5951a(this.f3202b, getResources().getString(C0734h.abc_searchview_description_search));
        this.f3221v = a.mo5370g(C0736j.SearchView_suggestionRowLayout, C0733g.abc_search_dropdown_item_icons_2line);
        this.f3222w = a.mo5370g(C0736j.SearchView_commitIcon, 0);
        this.f3202b.setOnClickListener(this.f3196U);
        this.f3204d.setOnClickListener(this.f3196U);
        this.f3203c.setOnClickListener(this.f3196U);
        this.f3205e.setOnClickListener(this.f3196U);
        this.f3199a.setOnClickListener(this.f3196U);
        this.f3199a.addTextChangedListener(this.f3201ab);
        this.f3199a.setOnEditorActionListener(this.f3197V);
        this.f3199a.setOnItemClickListener(this.f3198W);
        this.f3199a.setOnItemSelectedListener(this.f3200aa);
        this.f3199a.setOnKeyListener(this.f3209j);
        this.f3199a.setOnFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (SearchView.this.f3206f != null) {
                    SearchView.this.f3206f.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo5359a(C0736j.SearchView_iconifiedByDefault, true));
        int e = a.mo5366e(C0736j.SearchView_android_maxWidth, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.f3225z = a.mo5363c(C0736j.SearchView_defaultQueryHint);
        this.f3183H = a.mo5363c(C0736j.SearchView_queryHint);
        int a2 = a.mo5355a(C0736j.SearchView_android_imeOptions, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo5355a(C0736j.SearchView_android_inputType, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo5359a(C0736j.SearchView_android_focusable, true));
        a.mo5358a();
        this.f3223x = new Intent("android.speech.action.WEB_SEARCH");
        this.f3223x.addFlags(268435456);
        this.f3223x.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f3224y = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f3224y.addFlags(268435456);
        this.f3213n = findViewById(this.f3199a.getDropDownAnchor());
        if (this.f3213n != null) {
            this.f3213n.addOnLayoutChangeListener(new OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SearchView.this.mo4629k();
                }
            });
        }
        m5108a(this.f3180E);
        m5121r();
    }

    /* renamed from: a */
    private Intent m5103a(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: a */
    private Intent m5104a(Cursor cursor, int i, String str) {
        int i2;
        try {
            String a = C1071be.m5849a(cursor, "suggest_intent_action");
            if (a == null) {
                a = this.f3208h.getSuggestIntentAction();
            }
            if (a == null) {
                a = "android.intent.action.SEARCH";
            }
            String str2 = a;
            String a2 = C1071be.m5849a(cursor, "suggest_intent_data");
            if (a2 == null) {
                a2 = this.f3208h.getSuggestIntentData();
            }
            if (a2 != null) {
                String a3 = C1071be.m5849a(cursor, "suggest_intent_data_id");
                if (a3 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(a2);
                    sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                    sb.append(Uri.encode(a3));
                    a2 = sb.toString();
                }
            }
            return m5105a(str2, a2 == null ? null : Uri.parse(a2), C1071be.m5849a(cursor, "suggest_intent_extra_data"), C1071be.m5849a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(i2);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), e);
            return null;
        }
    }

    /* renamed from: a */
    private Intent m5105a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3189N);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f3192Q != null) {
            intent.putExtra("app_data", this.f3192Q);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f3208h.getSearchActivity());
        return intent;
    }

    /* renamed from: a */
    private void m5106a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed launch activity: ");
                sb.append(intent);
                Log.e("SearchView", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    private void m5107a(View view, Rect rect) {
        view.getLocationInWindow(this.f3217r);
        getLocationInWindow(this.f3218s);
        int i = this.f3217r[1] - this.f3218s[1];
        int i2 = this.f3217r[0] - this.f3218s[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    /* renamed from: a */
    private void m5108a(boolean z) {
        this.f3181F = z;
        int i = 8;
        boolean z2 = false;
        boolean z3 = !TextUtils.isEmpty(this.f3199a.getText());
        this.f3202b.setVisibility(z ? 0 : 8);
        m5111b(z3);
        this.f3210k.setVisibility(z ? 8 : 0);
        if (this.f3219t.getDrawable() != null && !this.f3180E) {
            i = 0;
        }
        this.f3219t.setVisibility(i);
        m5119p();
        if (!z3) {
            z2 = true;
        }
        m5114c(z2);
        m5118o();
    }

    /* renamed from: a */
    static boolean m5109a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: b */
    private Intent m5110b(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        if (this.f3192Q != null) {
            bundle.putParcelable("app_data", this.f3192Q);
        }
        Intent intent3 = new Intent(intent);
        String str = "free_form";
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        String str2 = null;
        String string = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string2 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", string);
        intent3.putExtra("android.speech.extra.LANGUAGE", string2);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        String str3 = "calling_package";
        if (searchActivity != null) {
            str2 = searchActivity.flattenToShortString();
        }
        intent3.putExtra(str3, str2);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: b */
    private void m5111b(boolean z) {
        this.f3203c.setVisibility((!this.f3182G || !m5117n() || !hasFocus() || (!z && this.f3187L)) ? 8 : 0);
    }

    /* renamed from: b */
    private boolean m5112b(int i, int i2, String str) {
        Cursor a = this.f3207g.mo2860a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        m5106a(m5104a(a, i2, str));
        return true;
    }

    /* renamed from: c */
    private CharSequence m5113c(CharSequence charSequence) {
        if (!this.f3180E || this.f3220u == null) {
            return charSequence;
        }
        double textSize = (double) this.f3199a.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f3220u.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f3220u), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    private void m5114c(boolean z) {
        int i;
        if (!this.f3187L || mo4613c() || !z) {
            i = 8;
        } else {
            i = 0;
            this.f3203c.setVisibility(8);
        }
        this.f3205e.setVisibility(i);
    }

    /* renamed from: e */
    private void m5115e(int i) {
        Editable text = this.f3199a.getText();
        Cursor a = this.f3207g.mo2860a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence c = this.f3207g.mo2869c(a);
                if (c != null) {
                    setQuery(c);
                }
            }
            setQuery(text);
        }
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0730d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0730d.abc_search_view_preferred_width);
    }

    /* renamed from: m */
    private boolean m5116m() {
        if (this.f3208h == null || !this.f3208h.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f3208h.getVoiceSearchLaunchWebSearch()) {
            intent = this.f3223x;
        } else if (this.f3208h.getVoiceSearchLaunchRecognizer()) {
            intent = this.f3224y;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: n */
    private boolean m5117n() {
        return (this.f3182G || this.f3187L) && !mo4613c();
    }

    /* renamed from: o */
    private void m5118o() {
        this.f3212m.setVisibility((!m5117n() || !(this.f3203c.getVisibility() == 0 || this.f3205e.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: p */
    private void m5119p() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f3199a.getText());
        int i = 0;
        if (!z2 && (!this.f3180E || this.f3190O)) {
            z = false;
        }
        ImageView imageView = this.f3204d;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f3204d.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: q */
    private void m5120q() {
        post(this.f3193R);
    }

    /* renamed from: r */
    private void m5121r() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f3199a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m5113c(queryHint));
    }

    /* renamed from: s */
    private void m5122s() {
        this.f3199a.setThreshold(this.f3208h.getSuggestThreshold());
        this.f3199a.setImeOptions(this.f3208h.getImeOptions());
        int inputType = this.f3208h.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f3208h.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f3199a.setInputType(inputType);
        if (this.f3207g != null) {
            this.f3207g.mo2864a((Cursor) null);
        }
        if (this.f3208h.getSuggestAuthority() != null) {
            this.f3207g = new C1071be(getContext(), this, this.f3208h, this.f3195T);
            this.f3199a.setAdapter(this.f3207g);
            C1071be beVar = (C1071be) this.f3207g;
            if (this.f3184I) {
                i = 2;
            }
            beVar.mo5343a(i);
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f3199a.setText(charSequence);
        this.f3199a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: t */
    private void m5123t() {
        this.f3199a.dismissDropDown();
    }

    /* renamed from: a */
    public void mo3288a() {
        if (!this.f3190O) {
            this.f3190O = true;
            this.f3191P = this.f3199a.getImeOptions();
            this.f3199a.setImeOptions(this.f3191P | 33554432);
            this.f3199a.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4606a(int i, String str, String str2) {
        getContext().startActivity(m5105a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4607a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: a */
    public void mo4608a(CharSequence charSequence, boolean z) {
        this.f3199a.setText(charSequence);
        if (charSequence != null) {
            this.f3199a.setSelection(this.f3199a.length());
            this.f3189N = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo4616e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4609a(int i) {
        if (this.f3178C != null && this.f3178C.mo4689a(i)) {
            return false;
        }
        m5115e(i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4610a(int i, int i2, String str) {
        if (this.f3178C != null && this.f3178C.mo4690b(i)) {
            return false;
        }
        m5112b(i, 0, null);
        this.f3199a.setImeVisibility(false);
        m5123t();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4611a(View view, int i, KeyEvent keyEvent) {
        if (this.f3208h != null && this.f3207g != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo4610a(this.f3199a.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f3199a.setSelection(i == 21 ? 0 : this.f3199a.length());
                this.f3199a.setListSelection(0);
                this.f3199a.clearListSelection();
                f3175i.mo4684a(this.f3199a, true);
                return true;
            } else if (i != 19 || this.f3199a.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo3289b() {
        mo4608a((CharSequence) "", false);
        clearFocus();
        m5108a(true);
        this.f3199a.setImeOptions(this.f3191P);
        this.f3190O = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4612b(CharSequence charSequence) {
        Editable text = this.f3199a.getText();
        this.f3189N = text;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(text);
        m5111b(z2);
        if (z2) {
            z = false;
        }
        m5114c(z);
        m5119p();
        m5118o();
        if (this.f3176A != null && !TextUtils.equals(charSequence, this.f3188M)) {
            this.f3176A.mo4688a_(charSequence.toString());
        }
        this.f3188M = charSequence.toString();
    }

    /* renamed from: c */
    public boolean mo4613c() {
        return this.f3181F;
    }

    public void clearFocus() {
        this.f3185J = true;
        super.clearFocus();
        this.f3199a.clearFocus();
        this.f3199a.setImeVisibility(false);
        this.f3185J = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4615d() {
        int[] iArr = this.f3199a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f3211l.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3212m.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4616e() {
        Editable text = this.f3199a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f3176A == null || !this.f3176A.mo4687a(text.toString())) {
                if (this.f3208h != null) {
                    mo4606a(0, (String) null, text.toString());
                }
                this.f3199a.setImeVisibility(false);
                m5123t();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4617f() {
        if (!TextUtils.isEmpty(this.f3199a.getText())) {
            this.f3199a.setText("");
            this.f3199a.requestFocus();
            this.f3199a.setImeVisibility(true);
        } else if (!this.f3180E) {
        } else {
            if (this.f3177B == null || !this.f3177B.mo4686a()) {
                clearFocus();
                m5108a(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4618g() {
        m5108a(false);
        this.f3199a.requestFocus();
        this.f3199a.setImeVisibility(true);
        if (this.f3179D != null) {
            this.f3179D.onClick(this);
        }
    }

    public int getImeOptions() {
        return this.f3199a.getImeOptions();
    }

    public int getInputType() {
        return this.f3199a.getInputType();
    }

    public int getMaxWidth() {
        return this.f3186K;
    }

    public CharSequence getQuery() {
        return this.f3199a.getText();
    }

    public CharSequence getQueryHint() {
        return this.f3183H != null ? this.f3183H : (this.f3208h == null || this.f3208h.getHintId() == 0) ? this.f3225z : getContext().getText(this.f3208h.getHintId());
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionCommitIconResId() {
        return this.f3222w;
    }

    /* access modifiers changed from: 0000 */
    public int getSuggestionRowLayout() {
        return this.f3221v;
    }

    public C0689f getSuggestionsAdapter() {
        return this.f3207g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4627h() {
        Intent b;
        if (this.f3208h != null) {
            SearchableInfo searchableInfo = this.f3208h;
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    b = m5103a(this.f3223x, searchableInfo);
                } else {
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        b = m5110b(this.f3224y, searchableInfo);
                    }
                }
                getContext().startActivity(b);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4628i() {
        m5108a(mo4613c());
        m5120q();
        if (this.f3199a.hasFocus()) {
            mo4630l();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo4629k() {
        if (this.f3213n.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f3211l.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = C1094bs.m6004a(this);
            int dimensionPixelSize = this.f3180E ? resources.getDimensionPixelSize(C0730d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0730d.abc_dropdownitem_text_padding_left) : 0;
            this.f3199a.getDropDownBackground().getPadding(rect);
            this.f3199a.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f3199a.setDropDownWidth((((this.f3213n.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4630l() {
        f3175i.mo4683a(this.f3199a);
        f3175i.mo4685b(this.f3199a);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3193R);
        post(this.f3194S);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m5107a((View) this.f3199a, this.f3215p);
            this.f3216q.set(this.f3215p.left, 0, this.f3215p.right, i4 - i2);
            if (this.f3214o == null) {
                this.f3214o = new C0975e(this.f3216q, this.f3215p, this.f3199a);
                setTouchDelegate(this.f3214o);
                return;
            }
            this.f3214o.mo4691a(this.f3216q, this.f3215p);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r3.f3186K <= 0) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo4613c()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002e
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x003e
        L_0x001d:
            int r0 = r3.f3186K
            if (r0 <= 0) goto L_0x003e
            goto L_0x0032
        L_0x0022:
            int r4 = r3.f3186K
            if (r4 <= 0) goto L_0x0029
            int r4 = r3.f3186K
            goto L_0x003e
        L_0x0029:
            int r4 = r3.getPreferredWidth()
            goto L_0x003e
        L_0x002e:
            int r0 = r3.f3186K
            if (r0 <= 0) goto L_0x0039
        L_0x0032:
            int r0 = r3.f3186K
        L_0x0034:
            int r4 = java.lang.Math.min(r0, r4)
            goto L_0x003e
        L_0x0039:
            int r0 = r3.getPreferredWidth()
            goto L_0x0034
        L_0x003e:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0050
            if (r0 == 0) goto L_0x004b
            goto L_0x0058
        L_0x004b:
            int r5 = r3.getPreferredHeight()
            goto L_0x0058
        L_0x0050:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0058:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo2234a());
        m5108a(savedState.f3236a);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3236a = mo4613c();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m5120q();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f3185J || !isFocusable()) {
            return false;
        }
        if (mo4613c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f3199a.requestFocus(i, rect);
        if (requestFocus) {
            m5108a(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3192Q = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo4617f();
        } else {
            mo4618g();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f3180E != z) {
            this.f3180E = z;
            m5108a(z);
            m5121r();
        }
    }

    public void setImeOptions(int i) {
        this.f3199a.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f3199a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f3186K = i;
        requestLayout();
    }

    public void setOnCloseListener(C0972b bVar) {
        this.f3177B = bVar;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f3206f = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0973c cVar) {
        this.f3176A = cVar;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f3179D = onClickListener;
    }

    public void setOnSuggestionListener(C0974d dVar) {
        this.f3178C = dVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f3183H = charSequence;
        m5121r();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f3184I = z;
        if (this.f3207g instanceof C1071be) {
            ((C1071be) this.f3207g).mo5343a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3208h = searchableInfo;
        if (this.f3208h != null) {
            m5122s();
            m5121r();
        }
        this.f3187L = m5116m();
        if (this.f3187L) {
            this.f3199a.setPrivateImeOptions("nm");
        }
        m5108a(mo4613c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f3182G = z;
        m5108a(mo4613c());
    }

    public void setSuggestionsAdapter(C0689f fVar) {
        this.f3207g = fVar;
        this.f3199a.setAdapter(this.f3207g);
    }
}
