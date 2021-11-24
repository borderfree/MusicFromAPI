package android.support.p007d.p008a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.p009v4.content.p015a.C0451c;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.p019g.C0488a;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.d.a.c */
public class C0068c extends C0078h implements C0067b {

    /* renamed from: a */
    final Callback f118a;

    /* renamed from: c */
    private C0070a f119c;

    /* renamed from: d */
    private Context f120d;

    /* renamed from: e */
    private ArgbEvaluator f121e;

    /* renamed from: f */
    private AnimatorListener f122f;

    /* renamed from: g */
    private ArrayList<Object> f123g;

    /* renamed from: android.support.d.a.c$a */
    private static class C0070a extends ConstantState {

        /* renamed from: a */
        int f125a;

        /* renamed from: b */
        C0079i f126b;

        /* renamed from: c */
        AnimatorSet f127c;

        /* renamed from: d */
        C0488a<Animator, String> f128d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ArrayList<Animator> f129e;

        public C0070a(Context context, C0070a aVar, Callback callback, Resources resources) {
            if (aVar != null) {
                this.f125a = aVar.f125a;
                if (aVar.f126b != null) {
                    ConstantState constantState = aVar.f126b.getConstantState();
                    this.f126b = (C0079i) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f126b = (C0079i) this.f126b.mutate();
                    this.f126b.setCallback(callback);
                    this.f126b.setBounds(aVar.f126b.getBounds());
                    this.f126b.mo186a(false);
                }
                if (aVar.f129e != null) {
                    int size = aVar.f129e.size();
                    this.f129e = new ArrayList<>(size);
                    this.f128d = new C0488a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) aVar.f129e.get(i);
                        Animator clone = animator.clone();
                        String str = (String) aVar.f128d.get(animator);
                        clone.setTarget(this.f126b.mo185a(str));
                        this.f129e.add(clone);
                        this.f128d.put(clone, str);
                    }
                    mo171a();
                }
            }
        }

        /* renamed from: a */
        public void mo171a() {
            if (this.f127c == null) {
                this.f127c = new AnimatorSet();
            }
            this.f127c.playTogether(this.f129e);
        }

        public int getChangingConfigurations() {
            return this.f125a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: android.support.d.a.c$b */
    private static class C0071b extends ConstantState {

        /* renamed from: a */
        private final ConstantState f130a;

        public C0071b(ConstantState constantState) {
            this.f130a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f130a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f130a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C0068c cVar = new C0068c();
            cVar.f135b = this.f130a.newDrawable();
            cVar.f135b.setCallback(cVar.f118a);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C0068c cVar = new C0068c();
            cVar.f135b = this.f130a.newDrawable(resources);
            cVar.f135b.setCallback(cVar.f118a);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C0068c cVar = new C0068c();
            cVar.f135b = this.f130a.newDrawable(resources, theme);
            cVar.f135b.setCallback(cVar.f118a);
            return cVar;
        }
    }

    C0068c() {
        this(null, null, null);
    }

    private C0068c(Context context) {
        this(context, null, null);
    }

    private C0068c(Context context, C0070a aVar, Resources resources) {
        this.f121e = null;
        this.f122f = null;
        this.f123g = null;
        this.f118a = new Callback() {
            public void invalidateDrawable(Drawable drawable) {
                C0068c.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0068c.this.scheduleSelf(runnable, j);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0068c.this.unscheduleSelf(runnable);
            }
        };
        this.f120d = context;
        if (aVar != null) {
            this.f119c = aVar;
        } else {
            this.f119c = new C0070a(context, aVar, this.f118a, resources);
        }
    }

    /* renamed from: a */
    public static C0068c m180a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0068c cVar = new C0068c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    /* renamed from: a */
    private void m181a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m181a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f121e == null) {
                    this.f121e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f121e);
            }
        }
    }

    /* renamed from: a */
    private void m182a(String str, Animator animator) {
        animator.setTarget(this.f119c.f126b.mo185a(str));
        if (VERSION.SDK_INT < 21) {
            m181a(animator);
        }
        if (this.f119c.f129e == null) {
            this.f119c.f129e = new ArrayList();
            this.f119c.f128d = new C0488a<>();
        }
        this.f119c.f129e.add(animator);
        this.f119c.f128d.put(animator, str);
    }

    public void applyTheme(Theme theme) {
        if (this.f135b != null) {
            C0311a.m1176a(this.f135b, theme);
        }
    }

    public boolean canApplyTheme() {
        if (this.f135b != null) {
            return C0311a.m1183d(this.f135b);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.f135b != null) {
            this.f135b.draw(canvas);
            return;
        }
        this.f119c.f126b.draw(canvas);
        if (this.f119c.f127c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f135b != null ? C0311a.m1182c(this.f135b) : this.f119c.f126b.getAlpha();
    }

    public int getChangingConfigurations() {
        return this.f135b != null ? this.f135b.getChangingConfigurations() : super.getChangingConfigurations() | this.f119c.f125a;
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public ConstantState getConstantState() {
        if (this.f135b == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0071b(this.f135b.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f135b != null ? this.f135b.getIntrinsicHeight() : this.f119c.f126b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f135b != null ? this.f135b.getIntrinsicWidth() : this.f119c.f126b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f135b != null ? this.f135b.getOpacity() : this.f119c.f126b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        TypedArray obtainAttributes;
        if (this.f135b != null) {
            C0311a.m1177a(this.f135b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    obtainAttributes = C0451c.m2052a(resources, theme, attributeSet, C0066a.f110e);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0079i a = C0079i.m215a(resources, resourceId, theme);
                        a.mo186a(false);
                        a.setCallback(this.f118a);
                        if (this.f119c.f126b != null) {
                            this.f119c.f126b.setCallback(null);
                        }
                        this.f119c.f126b = a;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C0066a.f111f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f120d != null) {
                            m182a(string, C0073e.m190a(this.f120d, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f119c.mo171a();
    }

    public boolean isAutoMirrored() {
        return this.f135b != null ? C0311a.m1180b(this.f135b) : this.f119c.f126b.isAutoMirrored();
    }

    public boolean isRunning() {
        return this.f135b != null ? ((AnimatedVectorDrawable) this.f135b).isRunning() : this.f119c.f127c.isRunning();
    }

    public boolean isStateful() {
        return this.f135b != null ? this.f135b.isStateful() : this.f119c.f126b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.f135b != null) {
            this.f135b.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f135b != null) {
            this.f135b.setBounds(rect);
        } else {
            this.f119c.f126b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f135b != null ? this.f135b.setLevel(i) : this.f119c.f126b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return this.f135b != null ? this.f135b.setState(iArr) : this.f119c.f126b.setState(iArr);
    }

    public void setAlpha(int i) {
        if (this.f135b != null) {
            this.f135b.setAlpha(i);
        } else {
            this.f119c.f126b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        if (this.f135b != null) {
            C0311a.m1179a(this.f135b, z);
        } else {
            this.f119c.f126b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f135b != null) {
            this.f135b.setColorFilter(colorFilter);
        } else {
            this.f119c.f126b.setColorFilter(colorFilter);
        }
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.f135b != null) {
            C0311a.m1173a(this.f135b, i);
        } else {
            this.f119c.f126b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f135b != null) {
            C0311a.m1175a(this.f135b, colorStateList);
        } else {
            this.f119c.f126b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (this.f135b != null) {
            C0311a.m1178a(this.f135b, mode);
        } else {
            this.f119c.f126b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.f135b != null) {
            return this.f135b.setVisible(z, z2);
        }
        this.f119c.f126b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        if (this.f135b != null) {
            ((AnimatedVectorDrawable) this.f135b).start();
        } else if (!this.f119c.f127c.isStarted()) {
            this.f119c.f127c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.f135b != null) {
            ((AnimatedVectorDrawable) this.f135b).stop();
        } else {
            this.f119c.f127c.end();
        }
    }
}
