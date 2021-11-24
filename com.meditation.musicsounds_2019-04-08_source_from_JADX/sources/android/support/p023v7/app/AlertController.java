package android.support.p023v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.widget.NestedScrollView;
import android.support.p009v4.widget.NestedScrollView.C0664b;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.support.p023v7.widget.C1031an.C1032a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.app.AlertController */
class AlertController {

    /* renamed from: A */
    private int f2083A;

    /* renamed from: B */
    private boolean f2084B = false;

    /* renamed from: C */
    private CharSequence f2085C;

    /* renamed from: D */
    private Drawable f2086D;

    /* renamed from: E */
    private CharSequence f2087E;

    /* renamed from: F */
    private Drawable f2088F;

    /* renamed from: G */
    private CharSequence f2089G;

    /* renamed from: H */
    private Drawable f2090H;

    /* renamed from: I */
    private int f2091I = 0;

    /* renamed from: J */
    private Drawable f2092J;

    /* renamed from: K */
    private ImageView f2093K;

    /* renamed from: L */
    private TextView f2094L;

    /* renamed from: M */
    private TextView f2095M;

    /* renamed from: N */
    private View f2096N;

    /* renamed from: O */
    private int f2097O;

    /* renamed from: P */
    private int f2098P;

    /* renamed from: Q */
    private boolean f2099Q;

    /* renamed from: R */
    private int f2100R = 0;

    /* renamed from: S */
    private final OnClickListener f2101S = new OnClickListener() {
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                android.support.v7.app.AlertController r0 = android.support.p023v7.app.AlertController.this
                android.widget.Button r0 = r0.f2104c
                if (r3 != r0) goto L_0x0015
                android.support.v7.app.AlertController r0 = android.support.p023v7.app.AlertController.this
                android.os.Message r0 = r0.f2105d
                if (r0 == 0) goto L_0x0015
                android.support.v7.app.AlertController r3 = android.support.p023v7.app.AlertController.this
                android.os.Message r3 = r3.f2105d
            L_0x0010:
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0038
            L_0x0015:
                android.support.v7.app.AlertController r0 = android.support.p023v7.app.AlertController.this
                android.widget.Button r0 = r0.f2106e
                if (r3 != r0) goto L_0x0026
                android.support.v7.app.AlertController r0 = android.support.p023v7.app.AlertController.this
                android.os.Message r0 = r0.f2107f
                if (r0 == 0) goto L_0x0026
                android.support.v7.app.AlertController r3 = android.support.p023v7.app.AlertController.this
                android.os.Message r3 = r3.f2107f
                goto L_0x0010
            L_0x0026:
                android.support.v7.app.AlertController r0 = android.support.p023v7.app.AlertController.this
                android.widget.Button r0 = r0.f2108g
                if (r3 != r0) goto L_0x0037
                android.support.v7.app.AlertController r3 = android.support.p023v7.app.AlertController.this
                android.os.Message r3 = r3.f2109h
                if (r3 == 0) goto L_0x0037
                android.support.v7.app.AlertController r3 = android.support.p023v7.app.AlertController.this
                android.os.Message r3 = r3.f2109h
                goto L_0x0010
            L_0x0037:
                r3 = 0
            L_0x0038:
                if (r3 == 0) goto L_0x003d
                r3.sendToTarget()
            L_0x003d:
                android.support.v7.app.AlertController r3 = android.support.p023v7.app.AlertController.this
                android.os.Handler r3 = r3.f2117p
                r0 = 1
                android.support.v7.app.AlertController r1 = android.support.p023v7.app.AlertController.this
                android.support.v7.app.m r1 = r1.f2102a
                android.os.Message r3 = r3.obtainMessage(r0, r1)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.app.AlertController.C07371.onClick(android.view.View):void");
        }
    };

    /* renamed from: a */
    final C0796m f2102a;

    /* renamed from: b */
    ListView f2103b;

    /* renamed from: c */
    Button f2104c;

    /* renamed from: d */
    Message f2105d;

    /* renamed from: e */
    Button f2106e;

    /* renamed from: f */
    Message f2107f;

    /* renamed from: g */
    Button f2108g;

    /* renamed from: h */
    Message f2109h;

    /* renamed from: i */
    NestedScrollView f2110i;

    /* renamed from: j */
    ListAdapter f2111j;

    /* renamed from: k */
    int f2112k = -1;

    /* renamed from: l */
    int f2113l;

    /* renamed from: m */
    int f2114m;

    /* renamed from: n */
    int f2115n;

    /* renamed from: o */
    int f2116o;

    /* renamed from: p */
    Handler f2117p;

    /* renamed from: q */
    private final Context f2118q;

    /* renamed from: r */
    private final Window f2119r;

    /* renamed from: s */
    private final int f2120s;

    /* renamed from: t */
    private CharSequence f2121t;

    /* renamed from: u */
    private CharSequence f2122u;

    /* renamed from: v */
    private View f2123v;

    /* renamed from: w */
    private int f2124w;

    /* renamed from: x */
    private int f2125x;

    /* renamed from: y */
    private int f2126y;

    /* renamed from: z */
    private int f2127z;

    /* renamed from: android.support.v7.app.AlertController$RecycleListView */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f2141a;

        /* renamed from: b */
        private final int f2142b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0736j.RecycleListView);
            this.f2142b = obtainStyledAttributes.getDimensionPixelOffset(C0736j.RecycleListView_paddingBottomNoButtons, -1);
            this.f2141a = obtainStyledAttributes.getDimensionPixelOffset(C0736j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void mo2956a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f2141a, getPaddingRight(), z2 ? getPaddingBottom() : this.f2142b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C0742a {

        /* renamed from: A */
        public int f2143A;

        /* renamed from: B */
        public int f2144B;

        /* renamed from: C */
        public int f2145C;

        /* renamed from: D */
        public int f2146D;

        /* renamed from: E */
        public boolean f2147E = false;

        /* renamed from: F */
        public boolean[] f2148F;

        /* renamed from: G */
        public boolean f2149G;

        /* renamed from: H */
        public boolean f2150H;

        /* renamed from: I */
        public int f2151I = -1;

        /* renamed from: J */
        public OnMultiChoiceClickListener f2152J;

        /* renamed from: K */
        public Cursor f2153K;

        /* renamed from: L */
        public String f2154L;

        /* renamed from: M */
        public String f2155M;

        /* renamed from: N */
        public OnItemSelectedListener f2156N;

        /* renamed from: O */
        public C0747a f2157O;

        /* renamed from: P */
        public boolean f2158P = true;

        /* renamed from: a */
        public final Context f2159a;

        /* renamed from: b */
        public final LayoutInflater f2160b;

        /* renamed from: c */
        public int f2161c = 0;

        /* renamed from: d */
        public Drawable f2162d;

        /* renamed from: e */
        public int f2163e = 0;

        /* renamed from: f */
        public CharSequence f2164f;

        /* renamed from: g */
        public View f2165g;

        /* renamed from: h */
        public CharSequence f2166h;

        /* renamed from: i */
        public CharSequence f2167i;

        /* renamed from: j */
        public Drawable f2168j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f2169k;

        /* renamed from: l */
        public CharSequence f2170l;

        /* renamed from: m */
        public Drawable f2171m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f2172n;

        /* renamed from: o */
        public CharSequence f2173o;

        /* renamed from: p */
        public Drawable f2174p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f2175q;

        /* renamed from: r */
        public boolean f2176r;

        /* renamed from: s */
        public OnCancelListener f2177s;

        /* renamed from: t */
        public OnDismissListener f2178t;

        /* renamed from: u */
        public OnKeyListener f2179u;

        /* renamed from: v */
        public CharSequence[] f2180v;

        /* renamed from: w */
        public ListAdapter f2181w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f2182x;

        /* renamed from: y */
        public int f2183y;

        /* renamed from: z */
        public View f2184z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C0747a {
            /* renamed from: a */
            void mo2963a(ListView listView);
        }

        public C0742a(Context context) {
            this.f2159a = context;
            this.f2176r = true;
            this.f2160b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v1, types: [android.support.v7.app.AlertController$c] */
        /* JADX WARNING: type inference failed for: r9v2, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r1v24, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r1v25, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: type inference failed for: r9v7 */
        /* JADX WARNING: type inference failed for: r9v8 */
        /* JADX WARNING: type inference failed for: r1v26, types: [android.support.v7.app.AlertController$a$2] */
        /* JADX WARNING: type inference failed for: r1v27, types: [android.support.v7.app.AlertController$a$1] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v4
          assigns: [?[OBJECT, ARRAY], android.support.v7.app.AlertController$a$2, android.support.v7.app.AlertController$a$1]
          uses: [android.widget.ListAdapter, android.support.v7.app.AlertController$a$2, android.support.v7.app.AlertController$a$1]
          mth insns count: 72
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
        /* JADX WARNING: Unknown variable types count: 6 */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m3433b(final android.support.p023v7.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f2160b
                int r1 = r11.f2113l
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                android.support.v7.app.AlertController$RecycleListView r0 = (android.support.p023v7.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f2149G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f2153K
                if (r1 != 0) goto L_0x0026
                android.support.v7.app.AlertController$a$1 r9 = new android.support.v7.app.AlertController$a$1
                android.content.Context r3 = r10.f2159a
                int r4 = r11.f2114m
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f2180v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0026:
                android.support.v7.app.AlertController$a$2 r9 = new android.support.v7.app.AlertController$a$2
                android.content.Context r3 = r10.f2159a
                android.database.Cursor r4 = r10.f2153K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006e
            L_0x0035:
                boolean r1 = r10.f2150H
                if (r1 == 0) goto L_0x003d
                int r1 = r11.f2115n
            L_0x003b:
                r4 = r1
                goto L_0x0040
            L_0x003d:
                int r1 = r11.f2116o
                goto L_0x003b
            L_0x0040:
                android.database.Cursor r1 = r10.f2153K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005e
                android.widget.SimpleCursorAdapter r1 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f2159a
                android.database.Cursor r5 = r10.f2153K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r7 = r10.f2154L
                r9 = 0
                r6[r9] = r7
                int[] r7 = new int[r8]
                r7[r9] = r2
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                r9 = r1
                goto L_0x006e
            L_0x005e:
                android.widget.ListAdapter r1 = r10.f2181w
                if (r1 == 0) goto L_0x0065
                android.widget.ListAdapter r9 = r10.f2181w
                goto L_0x006e
            L_0x0065:
                android.support.v7.app.AlertController$c r9 = new android.support.v7.app.AlertController$c
                android.content.Context r1 = r10.f2159a
                java.lang.CharSequence[] r3 = r10.f2180v
                r9.<init>(r1, r4, r2, r3)
            L_0x006e:
                android.support.v7.app.AlertController$a$a r1 = r10.f2157O
                if (r1 == 0) goto L_0x0077
                android.support.v7.app.AlertController$a$a r1 = r10.f2157O
                r1.mo2963a(r0)
            L_0x0077:
                r11.f2111j = r9
                int r1 = r10.f2151I
                r11.f2112k = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f2182x
                if (r1 == 0) goto L_0x008a
                android.support.v7.app.AlertController$a$3 r1 = new android.support.v7.app.AlertController$a$3
                r1.<init>(r11)
            L_0x0086:
                r0.setOnItemClickListener(r1)
                goto L_0x0094
            L_0x008a:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f2152J
                if (r1 == 0) goto L_0x0094
                android.support.v7.app.AlertController$a$4 r1 = new android.support.v7.app.AlertController$a$4
                r1.<init>(r0, r11)
                goto L_0x0086
            L_0x0094:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f2156N
                if (r1 == 0) goto L_0x009d
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f2156N
                r0.setOnItemSelectedListener(r1)
            L_0x009d:
                boolean r1 = r10.f2150H
                if (r1 == 0) goto L_0x00a5
                r0.setChoiceMode(r8)
                goto L_0x00ad
            L_0x00a5:
                boolean r1 = r10.f2149G
                if (r1 == 0) goto L_0x00ad
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00ad:
                r11.f2103b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.app.AlertController.C0742a.m3433b(android.support.v7.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo2957a(AlertController alertController) {
            if (this.f2165g != null) {
                alertController.mo2945b(this.f2165g);
            } else {
                if (this.f2164f != null) {
                    alertController.mo2942a(this.f2164f);
                }
                if (this.f2162d != null) {
                    alertController.mo2940a(this.f2162d);
                }
                if (this.f2161c != 0) {
                    alertController.mo2944b(this.f2161c);
                }
                if (this.f2163e != 0) {
                    alertController.mo2944b(alertController.mo2948c(this.f2163e));
                }
            }
            if (this.f2166h != null) {
                alertController.mo2946b(this.f2166h);
            }
            if (!(this.f2167i == null && this.f2168j == null)) {
                alertController.mo2939a(-1, this.f2167i, this.f2169k, (Message) null, this.f2168j);
            }
            if (!(this.f2170l == null && this.f2171m == null)) {
                alertController.mo2939a(-2, this.f2170l, this.f2172n, (Message) null, this.f2171m);
            }
            if (!(this.f2173o == null && this.f2174p == null)) {
                alertController.mo2939a(-3, this.f2173o, this.f2175q, (Message) null, this.f2174p);
            }
            if (!(this.f2180v == null && this.f2153K == null && this.f2181w == null)) {
                m3433b(alertController);
            }
            if (this.f2184z != null) {
                if (this.f2147E) {
                    alertController.mo2941a(this.f2184z, this.f2143A, this.f2144B, this.f2145C, this.f2146D);
                    return;
                }
                alertController.mo2949c(this.f2184z);
            } else if (this.f2183y != 0) {
                alertController.mo2938a(this.f2183y);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C0748b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f2197a;

        public C0748b(DialogInterface dialogInterface) {
            this.f2197a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f2197a.get(), message.what);
                        return;
                    default:
                        return;
                }
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C0749c extends ArrayAdapter<CharSequence> {
        public C0749c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0796m mVar, Window window) {
        this.f2118q = context;
        this.f2102a = mVar;
        this.f2119r = window;
        this.f2117p = new C0748b(mVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0736j.AlertDialog, C0727a.alertDialogStyle, 0);
        this.f2097O = obtainStyledAttributes.getResourceId(C0736j.AlertDialog_android_layout, 0);
        this.f2098P = obtainStyledAttributes.getResourceId(C0736j.AlertDialog_buttonPanelSideLayout, 0);
        this.f2113l = obtainStyledAttributes.getResourceId(C0736j.AlertDialog_listLayout, 0);
        this.f2114m = obtainStyledAttributes.getResourceId(C0736j.AlertDialog_multiChoiceItemLayout, 0);
        this.f2115n = obtainStyledAttributes.getResourceId(C0736j.AlertDialog_singleChoiceItemLayout, 0);
        this.f2116o = obtainStyledAttributes.getResourceId(C0736j.AlertDialog_listItemLayout, 0);
        this.f2099Q = obtainStyledAttributes.getBoolean(C0736j.AlertDialog_showTitle, true);
        this.f2120s = obtainStyledAttributes.getDimensionPixelSize(C0736j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        mVar.mo3191b(1);
    }

    /* renamed from: a */
    private ViewGroup m3405a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m3406a(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m3407a(ViewGroup viewGroup) {
        boolean z = false;
        View view = this.f2123v != null ? this.f2123v : this.f2124w != 0 ? LayoutInflater.from(this.f2118q).inflate(this.f2124w, viewGroup, false) : null;
        if (view != null) {
            z = true;
        }
        if (!z || !m3411a(view)) {
            this.f2119r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f2119r.findViewById(C0732f.custom);
            frameLayout.addView(view, new LayoutParams(-1, -1));
            if (this.f2084B) {
                frameLayout.setPadding(this.f2125x, this.f2126y, this.f2127z, this.f2083A);
            }
            if (this.f2103b != null) {
                ((C1032a) viewGroup.getLayoutParams()).f3573g = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private void m3408a(ViewGroup viewGroup, View view, int i, int i2) {
        final View findViewById = this.f2119r.findViewById(C0732f.scrollIndicatorUp);
        View findViewById2 = this.f2119r.findViewById(C0732f.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            C0626s.m2838a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        final View view2 = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f2122u != null) {
                this.f2110i.setOnScrollChangeListener(new C0664b() {
                    /* renamed from: a */
                    public void mo2723a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                        AlertController.m3406a(nestedScrollView, findViewById, view2);
                    }
                });
                this.f2110i.post(new Runnable() {
                    public void run() {
                        AlertController.m3406a(AlertController.this.f2110i, findViewById, view2);
                    }
                });
            } else if (this.f2103b != null) {
                this.f2103b.setOnScrollListener(new OnScrollListener() {
                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        AlertController.m3406a(absListView, findViewById, view2);
                    }

                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }
                });
                this.f2103b.post(new Runnable() {
                    public void run() {
                        AlertController.m3406a(AlertController.this.f2103b, findViewById, view2);
                    }
                });
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m3409a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m3410a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0727a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m3411a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m3411a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m3412b() {
        return this.f2098P == 0 ? this.f2097O : this.f2100R == 1 ? this.f2098P : this.f2097O;
    }

    /* renamed from: b */
    private void m3413b(ViewGroup viewGroup) {
        if (this.f2096N != null) {
            viewGroup.addView(this.f2096N, 0, new LayoutParams(-1, -2));
            this.f2119r.findViewById(C0732f.title_template).setVisibility(8);
            return;
        }
        this.f2093K = (ImageView) this.f2119r.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f2121t)) || !this.f2099Q) {
            this.f2119r.findViewById(C0732f.title_template).setVisibility(8);
            this.f2093K.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f2094L = (TextView) this.f2119r.findViewById(C0732f.alertTitle);
        this.f2094L.setText(this.f2121t);
        if (this.f2091I != 0) {
            this.f2093K.setImageResource(this.f2091I);
        } else if (this.f2092J != null) {
            this.f2093K.setImageDrawable(this.f2092J);
        } else {
            this.f2094L.setPadding(this.f2093K.getPaddingLeft(), this.f2093K.getPaddingTop(), this.f2093K.getPaddingRight(), this.f2093K.getPaddingBottom());
            this.f2093K.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m3414c() {
        View findViewById = this.f2119r.findViewById(C0732f.parentPanel);
        View findViewById2 = findViewById.findViewById(C0732f.topPanel);
        View findViewById3 = findViewById.findViewById(C0732f.contentPanel);
        View findViewById4 = findViewById.findViewById(C0732f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0732f.customPanel);
        m3407a(viewGroup);
        View findViewById5 = viewGroup.findViewById(C0732f.topPanel);
        View findViewById6 = viewGroup.findViewById(C0732f.contentPanel);
        View findViewById7 = viewGroup.findViewById(C0732f.buttonPanel);
        ViewGroup a = m3405a(findViewById5, findViewById2);
        ViewGroup a2 = m3405a(findViewById6, findViewById3);
        ViewGroup a3 = m3405a(findViewById7, findViewById4);
        m3415c(a2);
        m3416d(a3);
        m3413b(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!z3 && a2 != null) {
            View findViewById8 = a2.findViewById(C0732f.textSpacerNoButtons);
            if (findViewById8 != null) {
                findViewById8.setVisibility(0);
            }
        }
        if (z2) {
            if (this.f2110i != null) {
                this.f2110i.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f2122u == null && this.f2103b == null)) {
                view = a.findViewById(C0732f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (a2 != null) {
            View findViewById9 = a2.findViewById(C0732f.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        if (this.f2103b instanceof RecycleListView) {
            ((RecycleListView) this.f2103b).mo2956a(z2, z3);
        }
        if (!z) {
            View view2 = this.f2103b != null ? this.f2103b : this.f2110i;
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m3408a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView = this.f2103b;
        if (listView != null && this.f2111j != null) {
            listView.setAdapter(this.f2111j);
            int i = this.f2112k;
            if (i > -1) {
                listView.setItemChecked(i, true);
                listView.setSelection(i);
            }
        }
    }

    /* renamed from: c */
    private void m3415c(ViewGroup viewGroup) {
        this.f2110i = (NestedScrollView) this.f2119r.findViewById(C0732f.scrollView);
        this.f2110i.setFocusable(false);
        this.f2110i.setNestedScrollingEnabled(false);
        this.f2095M = (TextView) viewGroup.findViewById(16908299);
        if (this.f2095M != null) {
            if (this.f2122u != null) {
                this.f2095M.setText(this.f2122u);
            } else {
                this.f2095M.setVisibility(8);
                this.f2110i.removeView(this.f2095M);
                if (this.f2103b != null) {
                    ViewGroup viewGroup2 = (ViewGroup) this.f2110i.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(this.f2110i);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(this.f2103b, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: d */
    private void m3416d(ViewGroup viewGroup) {
        boolean z;
        Button button;
        this.f2104c = (Button) viewGroup.findViewById(16908313);
        this.f2104c.setOnClickListener(this.f2101S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f2085C) || this.f2086D != null) {
            this.f2104c.setText(this.f2085C);
            if (this.f2086D != null) {
                this.f2086D.setBounds(0, 0, this.f2120s, this.f2120s);
                this.f2104c.setCompoundDrawables(this.f2086D, null, null, null);
            }
            this.f2104c.setVisibility(0);
            z = true;
        } else {
            this.f2104c.setVisibility(8);
            z = false;
        }
        this.f2106e = (Button) viewGroup.findViewById(16908314);
        this.f2106e.setOnClickListener(this.f2101S);
        if (!TextUtils.isEmpty(this.f2087E) || this.f2088F != null) {
            this.f2106e.setText(this.f2087E);
            if (this.f2088F != null) {
                this.f2088F.setBounds(0, 0, this.f2120s, this.f2120s);
                this.f2106e.setCompoundDrawables(this.f2088F, null, null, null);
            }
            this.f2106e.setVisibility(0);
            z |= true;
        } else {
            this.f2106e.setVisibility(8);
        }
        this.f2108g = (Button) viewGroup.findViewById(16908315);
        this.f2108g.setOnClickListener(this.f2101S);
        if (!TextUtils.isEmpty(this.f2089G) || this.f2090H != null) {
            this.f2108g.setText(this.f2089G);
            if (this.f2086D != null) {
                this.f2086D.setBounds(0, 0, this.f2120s, this.f2120s);
                this.f2104c.setCompoundDrawables(this.f2086D, null, null, null);
            }
            this.f2108g.setVisibility(0);
            z |= true;
        } else {
            this.f2108g.setVisibility(8);
        }
        if (m3410a(this.f2118q)) {
            if (z) {
                button = this.f2104c;
            } else if (z) {
                button = this.f2106e;
            } else if (z) {
                button = this.f2108g;
            }
            m3409a(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo2937a() {
        this.f2102a.setContentView(m3412b());
        m3414c();
    }

    /* renamed from: a */
    public void mo2938a(int i) {
        this.f2123v = null;
        this.f2124w = i;
        this.f2084B = false;
    }

    /* renamed from: a */
    public void mo2939a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f2117p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f2089G = charSequence;
                this.f2109h = message;
                this.f2090H = drawable;
                return;
            case -2:
                this.f2087E = charSequence;
                this.f2107f = message;
                this.f2088F = drawable;
                return;
            case -1:
                this.f2085C = charSequence;
                this.f2105d = message;
                this.f2086D = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void mo2940a(Drawable drawable) {
        this.f2092J = drawable;
        this.f2091I = 0;
        if (this.f2093K == null) {
            return;
        }
        if (drawable != null) {
            this.f2093K.setVisibility(0);
            this.f2093K.setImageDrawable(drawable);
            return;
        }
        this.f2093K.setVisibility(8);
    }

    /* renamed from: a */
    public void mo2941a(View view, int i, int i2, int i3, int i4) {
        this.f2123v = view;
        this.f2124w = 0;
        this.f2084B = true;
        this.f2125x = i;
        this.f2126y = i2;
        this.f2127z = i3;
        this.f2083A = i4;
    }

    /* renamed from: a */
    public void mo2942a(CharSequence charSequence) {
        this.f2121t = charSequence;
        if (this.f2094L != null) {
            this.f2094L.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean mo2943a(int i, KeyEvent keyEvent) {
        return this.f2110i != null && this.f2110i.mo2661a(keyEvent);
    }

    /* renamed from: b */
    public void mo2944b(int i) {
        this.f2092J = null;
        this.f2091I = i;
        if (this.f2093K == null) {
            return;
        }
        if (i != 0) {
            this.f2093K.setVisibility(0);
            this.f2093K.setImageResource(this.f2091I);
            return;
        }
        this.f2093K.setVisibility(8);
    }

    /* renamed from: b */
    public void mo2945b(View view) {
        this.f2096N = view;
    }

    /* renamed from: b */
    public void mo2946b(CharSequence charSequence) {
        this.f2122u = charSequence;
        if (this.f2095M != null) {
            this.f2095M.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean mo2947b(int i, KeyEvent keyEvent) {
        return this.f2110i != null && this.f2110i.mo2661a(keyEvent);
    }

    /* renamed from: c */
    public int mo2948c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f2118q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: c */
    public void mo2949c(View view) {
        this.f2123v = view;
        this.f2124w = 0;
        this.f2084B = false;
    }

    /* renamed from: d */
    public Button mo2950d(int i) {
        switch (i) {
            case -3:
                return this.f2108g;
            case -2:
                return this.f2106e;
            case -1:
                return this.f2104c;
            default:
                return null;
        }
    }
}
