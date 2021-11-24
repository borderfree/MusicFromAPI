package android.support.p023v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.support.p009v4.content.C0452b;
import android.support.p009v4.widget.C0709n;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0732f;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: android.support.v7.widget.be */
class C1071be extends C0709n implements OnClickListener {

    /* renamed from: j */
    private final SearchManager f3711j = ((SearchManager) this.f2028d.getSystemService("search"));

    /* renamed from: k */
    private final SearchView f3712k;

    /* renamed from: l */
    private final SearchableInfo f3713l;

    /* renamed from: m */
    private final Context f3714m;

    /* renamed from: n */
    private final WeakHashMap<String, ConstantState> f3715n;

    /* renamed from: o */
    private final int f3716o;

    /* renamed from: p */
    private boolean f3717p = false;

    /* renamed from: q */
    private int f3718q = 1;

    /* renamed from: r */
    private ColorStateList f3719r;

    /* renamed from: s */
    private int f3720s = -1;

    /* renamed from: t */
    private int f3721t = -1;

    /* renamed from: u */
    private int f3722u = -1;

    /* renamed from: v */
    private int f3723v = -1;

    /* renamed from: w */
    private int f3724w = -1;

    /* renamed from: x */
    private int f3725x = -1;

    /* renamed from: android.support.v7.widget.be$a */
    private static final class C1072a {

        /* renamed from: a */
        public final TextView f3726a;

        /* renamed from: b */
        public final TextView f3727b;

        /* renamed from: c */
        public final ImageView f3728c;

        /* renamed from: d */
        public final ImageView f3729d;

        /* renamed from: e */
        public final ImageView f3730e;

        public C1072a(View view) {
            this.f3726a = (TextView) view.findViewById(16908308);
            this.f3727b = (TextView) view.findViewById(16908309);
            this.f3728c = (ImageView) view.findViewById(16908295);
            this.f3729d = (ImageView) view.findViewById(16908296);
            this.f3730e = (ImageView) view.findViewById(C0732f.edit_query);
        }
    }

    public C1071be(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f3712k = searchView;
        this.f3713l = searchableInfo;
        this.f3716o = searchView.getSuggestionCommitIconResId();
        this.f3714m = context;
        this.f3715n = weakHashMap;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.graphics.drawable.Drawable$ConstantState] */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.graphics.drawable.Drawable, android.graphics.drawable.Drawable$ConstantState]
      uses: [java.lang.Object, android.graphics.drawable.Drawable]
      mth insns count: 21
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m5846a(android.content.ComponentName r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f3715n
            boolean r1 = r1.containsKey(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0023
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r3.f3715n
            java.lang.Object r4 = r4.get(r0)
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4
            if (r4 != 0) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            android.content.Context r0 = r3.f3714m
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r2 = r4.newDrawable(r0)
        L_0x0022:
            return r2
        L_0x0023:
            android.graphics.drawable.Drawable r4 = r3.m5853b(r4)
            if (r4 != 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            android.graphics.drawable.Drawable$ConstantState r2 = r4.getConstantState()
        L_0x002e:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r1 = r3.f3715n
            r1.put(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1071be.m5846a(android.content.ComponentName):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private Drawable m5847a(String str) {
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://");
                sb.append(this.f3714m.getPackageName());
                sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                sb.append(parseInt);
                String sb2 = sb.toString();
                Drawable b = m5855b(sb2);
                if (b != null) {
                    return b;
                }
                Drawable a = C0452b.m2059a(this.f3714m, parseInt);
                m5852a(sb2, a);
                return a;
            } catch (NumberFormatException unused) {
                Drawable b2 = m5855b(str);
                if (b2 != null) {
                    return b2;
                }
                drawable = m5854b(Uri.parse(str));
                m5852a(str, drawable);
            } catch (NotFoundException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Icon resource not found: ");
                sb3.append(str);
                Log.w("SuggestionsAdapter", sb3.toString());
                return null;
            }
        }
        return drawable;
    }

    /* renamed from: a */
    private static String m5848a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m5849a(Cursor cursor, String str) {
        return m5848a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private void m5850a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private void m5851a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    /* renamed from: a */
    private void m5852a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f3715n.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: b */
    private Drawable m5853b(ComponentName componentName) {
        String str;
        String nameNotFoundException;
        PackageManager packageManager = this.f2028d.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            str = "SuggestionsAdapter";
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid icon resource ");
            sb.append(iconResource);
            sb.append(" for ");
            sb.append(componentName.flattenToShortString());
            nameNotFoundException = sb.toString();
            Log.w(str, nameNotFoundException);
            return null;
        } catch (NameNotFoundException e) {
            str = "SuggestionsAdapter";
            nameNotFoundException = e.toString();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Resource does not exist: ");
        r2.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        throw new java.io.FileNotFoundException(r2.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m5854b(android.net.Uri r7) {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = "android.resource"
            boolean r1 = r2.equals(r1)     // Catch:{ FileNotFoundException -> 0x0089 }
            if (r1 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r1 = r6.mo5342a(r7)     // Catch:{ NotFoundException -> 0x0012 }
            return r1
        L_0x0012:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r3 = "Resource does not exist: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0089 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0029:
            android.content.Context r1 = r6.f3714m     // Catch:{ FileNotFoundException -> 0x0089 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.io.InputStream r1 = r1.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            if (r1 == 0) goto L_0x0072
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r1, r0)     // Catch:{ all -> 0x0055 }
            r1.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0054
        L_0x003d:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r5 = "Error closing icon stream for "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0054:
            return r2
        L_0x0055:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x0071
        L_0x005a:
            r1 = move-exception
            java.lang.String r3 = "SuggestionsAdapter"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r5 = "Error closing icon stream for "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0089 }
            r4.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            android.util.Log.e(r3, r4, r1)     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0071:
            throw r2     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0072:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r3 = "Failed to open "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0089 }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0089 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0089 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            java.lang.String r2 = "SuggestionsAdapter"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r1.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r2, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1071be.m5854b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: b */
    private Drawable m5855b(String str) {
        ConstantState constantState = (ConstantState) this.f3715n.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: b */
    private CharSequence m5856b(CharSequence charSequence) {
        if (this.f3719r == null) {
            TypedValue typedValue = new TypedValue();
            this.f2028d.getTheme().resolveAttribute(C0727a.textColorSearchUrl, typedValue, true);
            this.f3719r = this.f2028d.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, this.f3719r, null);
        spannableString.setSpan(textAppearanceSpan, 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    private void m5857d(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: e */
    private Drawable m5858e(Cursor cursor) {
        if (this.f3723v == -1) {
            return null;
        }
        Drawable a = m5847a(cursor.getString(this.f3723v));
        return a != null ? a : m5860g(cursor);
    }

    /* renamed from: f */
    private Drawable m5859f(Cursor cursor) {
        if (this.f3724w == -1) {
            return null;
        }
        return m5847a(cursor.getString(this.f3724w));
    }

    /* renamed from: g */
    private Drawable m5860g(Cursor cursor) {
        Drawable a = m5846a(this.f3713l.getSearchActivity());
        return a != null ? a : this.f2028d.getPackageManager().getDefaultActivityIcon();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Cursor mo5341a(SearchableInfo searchableInfo, String str, int i) {
        String[] strArr = null;
        if (searchableInfo == null) {
            return null;
        }
        String suggestAuthority = searchableInfo.getSuggestAuthority();
        if (suggestAuthority == null) {
            return null;
        }
        Builder fragment = new Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f2028d.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    /* renamed from: a */
    public Cursor mo2861a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f3712k.getVisibility() == 0 && this.f3712k.getWindowVisibility() == 0) {
            try {
                Cursor a = mo5341a(this.f3713l, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Drawable mo5342a(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f2028d.getPackageManager().getResourcesForApplication(authority);
                List pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt((String) pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Single path segment is not a resource ID: ");
                            sb.append(uri);
                            throw new FileNotFoundException(sb.toString());
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("More than two path segments: ");
                        sb2.append(uri);
                        throw new FileNotFoundException(sb2.toString());
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("No resource found for: ");
                    sb3.append(uri);
                    throw new FileNotFoundException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No path: ");
                sb4.append(uri);
                throw new FileNotFoundException(sb4.toString());
            } catch (NameNotFoundException unused2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("No package found for authority: ");
                sb5.append(uri);
                throw new FileNotFoundException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("No authority: ");
            sb6.append(uri);
            throw new FileNotFoundException(sb6.toString());
        }
    }

    /* renamed from: a */
    public View mo2862a(Context context, Cursor cursor, ViewGroup viewGroup) {
        View a = super.mo2862a(context, cursor, viewGroup);
        a.setTag(new C1072a(a));
        ((ImageView) a.findViewById(C0732f.edit_query)).setImageResource(this.f3716o);
        return a;
    }

    /* renamed from: a */
    public void mo5343a(int i) {
        this.f3718q = i;
    }

    /* renamed from: a */
    public void mo2864a(Cursor cursor) {
        if (this.f3717p) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
            }
            return;
        }
        try {
            super.mo2864a(cursor);
            if (cursor != null) {
                this.f3720s = cursor.getColumnIndex("suggest_text_1");
                this.f3721t = cursor.getColumnIndex("suggest_text_2");
                this.f3722u = cursor.getColumnIndex("suggest_text_2_url");
                this.f3723v = cursor.getColumnIndex("suggest_icon_1");
                this.f3724w = cursor.getColumnIndex("suggest_icon_2");
                this.f3725x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: a */
    public void mo2865a(View view, Context context, Cursor cursor) {
        C1072a aVar = (C1072a) view.getTag();
        int i = this.f3725x != -1 ? cursor.getInt(this.f3725x) : 0;
        if (aVar.f3726a != null) {
            m5851a(aVar.f3726a, (CharSequence) m5848a(cursor, this.f3720s));
        }
        if (aVar.f3727b != null) {
            String a = m5848a(cursor, this.f3722u);
            CharSequence b = a != null ? m5856b((CharSequence) a) : m5848a(cursor, this.f3721t);
            if (TextUtils.isEmpty(b)) {
                if (aVar.f3726a != null) {
                    aVar.f3726a.setSingleLine(false);
                    aVar.f3726a.setMaxLines(2);
                }
            } else if (aVar.f3726a != null) {
                aVar.f3726a.setSingleLine(true);
                aVar.f3726a.setMaxLines(1);
            }
            m5851a(aVar.f3727b, b);
        }
        if (aVar.f3728c != null) {
            m5850a(aVar.f3728c, m5858e(cursor), 4);
        }
        if (aVar.f3729d != null) {
            m5850a(aVar.f3729d, m5859f(cursor), 8);
        }
        if (this.f3718q == 2 || (this.f3718q == 1 && (i & 1) != 0)) {
            aVar.f3730e.setVisibility(0);
            aVar.f3730e.setTag(aVar.f3726a.getText());
            aVar.f3730e.setOnClickListener(this);
            return;
        }
        aVar.f3730e.setVisibility(8);
    }

    /* renamed from: c */
    public CharSequence mo2869c(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = m5849a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.f3713l.shouldRewriteQueryFromData()) {
            String a2 = m5849a(cursor, "suggest_intent_data");
            if (a2 != null) {
                return a2;
            }
        }
        if (this.f3713l.shouldRewriteQueryFromText()) {
            String a3 = m5849a(cursor, "suggest_text_1");
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View b = mo2867b(this.f2028d, this.f2027c, viewGroup);
            if (b != null) {
                ((C1072a) b.getTag()).f3726a.setText(e.toString());
            }
            return b;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View a = mo2862a(this.f2028d, this.f2027c, viewGroup);
            if (a != null) {
                ((C1072a) a.getTag()).f3726a.setText(e.toString());
            }
            return a;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m5857d(mo2860a());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m5857d(mo2860a());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f3712k.mo4607a((CharSequence) tag);
        }
    }
}
