package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p009v4.view.C0626s;
import android.support.transition.C0294u.C0300c;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.f */
public class C0265f extends C0294u {

    /* renamed from: g */
    private static final String[] f747g = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: h */
    private static final Property<Drawable, PointF> f748h = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {

        /* renamed from: a */
        private Rect f758a = new Rect();

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f758a);
            return new PointF((float) this.f758a.left, (float) this.f758a.top);
        }

        /* renamed from: a */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f758a);
            this.f758a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f758a);
        }
    };

    /* renamed from: i */
    private static final Property<C0276a, PointF> f749i = new Property<C0276a, PointF>(PointF.class, "topLeft") {
        /* renamed from: a */
        public PointF get(C0276a aVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C0276a aVar, PointF pointF) {
            aVar.mo1064a(pointF);
        }
    };

    /* renamed from: j */
    private static final Property<C0276a, PointF> f750j = new Property<C0276a, PointF>(PointF.class, "bottomRight") {
        /* renamed from: a */
        public PointF get(C0276a aVar) {
            return null;
        }

        /* renamed from: a */
        public void set(C0276a aVar, PointF pointF) {
            aVar.mo1065b(pointF);
        }
    };

    /* renamed from: k */
    private static final Property<View, PointF> f751k = new Property<View, PointF>(PointF.class, "bottomRight") {
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C0244am.m945a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };

    /* renamed from: l */
    private static final Property<View, PointF> f752l = new Property<View, PointF>(PointF.class, "topLeft") {
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            C0244am.m945a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };

    /* renamed from: m */
    private static final Property<View, PointF> f753m = new Property<View, PointF>(PointF.class, "position") {
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: a */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0244am.m945a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };

    /* renamed from: q */
    private static C0292s f754q = new C0292s();

    /* renamed from: n */
    private int[] f755n = new int[2];

    /* renamed from: o */
    private boolean f756o = false;

    /* renamed from: p */
    private boolean f757p = false;

    /* renamed from: android.support.transition.f$a */
    private static class C0276a {

        /* renamed from: a */
        private int f777a;

        /* renamed from: b */
        private int f778b;

        /* renamed from: c */
        private int f779c;

        /* renamed from: d */
        private int f780d;

        /* renamed from: e */
        private View f781e;

        /* renamed from: f */
        private int f782f;

        /* renamed from: g */
        private int f783g;

        C0276a(View view) {
            this.f781e = view;
        }

        /* renamed from: a */
        private void m1037a() {
            C0244am.m945a(this.f781e, this.f777a, this.f778b, this.f779c, this.f780d);
            this.f782f = 0;
            this.f783g = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1064a(PointF pointF) {
            this.f777a = Math.round(pointF.x);
            this.f778b = Math.round(pointF.y);
            this.f782f++;
            if (this.f782f == this.f783g) {
                m1037a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo1065b(PointF pointF) {
            this.f779c = Math.round(pointF.x);
            this.f780d = Math.round(pointF.y);
            this.f783g++;
            if (this.f782f == this.f783g) {
                m1037a();
            }
        }
    }

    /* renamed from: a */
    private boolean m1016a(View view, View view2) {
        if (!this.f757p) {
            return true;
        }
        C0230aa b = mo1090b(view, true);
        if (b == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == b.f690b) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m1017d(C0230aa aaVar) {
        View view = aaVar.f690b;
        if (C0626s.m2880w(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            aaVar.f689a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            aaVar.f689a.put("android:changeBounds:parent", aaVar.f690b.getParent());
            if (this.f757p) {
                aaVar.f690b.getLocationInWindow(this.f755n);
                aaVar.f689a.put("android:changeBounds:windowX", Integer.valueOf(this.f755n[0]));
                aaVar.f689a.put("android:changeBounds:windowY", Integer.valueOf(this.f755n[1]));
            }
            if (this.f756o) {
                aaVar.f689a.put("android:changeBounds:clip", C0626s.m2882y(view));
            }
        }
    }

    /* renamed from: a */
    public Animator mo1014a(ViewGroup viewGroup, C0230aa aaVar, C0230aa aaVar2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        C0230aa aaVar3 = aaVar;
        C0230aa aaVar4 = aaVar2;
        if (aaVar3 == null || aaVar4 == null) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) aaVar3.f689a.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) aaVar4.f689a.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = aaVar4.f690b;
        if (m1016a(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) aaVar3.f689a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) aaVar4.f689a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) aaVar3.f689a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) aaVar4.f689a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i > 0) {
                Rect rect6 = rect5;
                Rect rect7 = rect4;
                if (!this.f756o) {
                    view = view3;
                    C0244am.m945a(view, i3, i5, i7, i9);
                    if (i == 2) {
                        if (i11 == i13 && i12 == i14) {
                            path = mo1108l().mo1069a((float) i3, (float) i5, (float) i4, (float) i6);
                            property = f753m;
                        } else {
                            final C0276a aVar = new C0276a(view);
                            ObjectAnimator a = C0280h.m1046a(aVar, f749i, mo1108l().mo1069a((float) i3, (float) i5, (float) i4, (float) i6));
                            ObjectAnimator a2 = C0280h.m1046a(aVar, f750j, mo1108l().mo1069a((float) i7, (float) i9, (float) i8, (float) i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(new Animator[]{a, a2});
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                private C0276a mViewBounds = aVar;
                            });
                            animator = animatorSet;
                        }
                    } else if (i3 == i4 && i5 == i6) {
                        path = mo1108l().mo1069a((float) i7, (float) i9, (float) i8, (float) i10);
                        property = f751k;
                    } else {
                        path = mo1108l().mo1069a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f752l;
                    }
                    animator = C0280h.m1046a(view, property, path);
                } else {
                    view = view3;
                    C0244am.m945a(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                    Animator a3 = (i3 == i4 && i5 == i6) ? null : C0280h.m1046a(view, f753m, mo1108l().mo1069a((float) i3, (float) i5, (float) i4, (float) i6));
                    if (rect7 == null) {
                        i2 = 0;
                        rect = new Rect(0, 0, i11, i12);
                    } else {
                        i2 = 0;
                        rect = rect7;
                    }
                    Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                    if (!rect.equals(rect8)) {
                        C0626s.m2842a(view, rect);
                        C0292s sVar = f754q;
                        Object[] objArr = new Object[2];
                        objArr[i2] = rect;
                        objArr[1] = rect8;
                        objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", sVar, objArr);
                        final View view4 = view;
                        final Rect rect9 = rect6;
                        final int i15 = i4;
                        final int i16 = i6;
                        final int i17 = i8;
                        final int i18 = i10;
                        C02759 r0 = new AnimatorListenerAdapter() {

                            /* renamed from: h */
                            private boolean f776h;

                            public void onAnimationCancel(Animator animator) {
                                this.f776h = true;
                            }

                            public void onAnimationEnd(Animator animator) {
                                if (!this.f776h) {
                                    C0626s.m2842a(view4, rect9);
                                    C0244am.m945a(view4, i15, i16, i17, i18);
                                }
                            }
                        };
                        objectAnimator.addListener(r0);
                    } else {
                        objectAnimator = null;
                    }
                    animator = C0309z.m1163a(a3, objectAnimator);
                }
                if (view.getParent() instanceof ViewGroup) {
                    final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                    C0235af.m918a(viewGroup4, true);
                    mo1080a((C0300c) new C0301v() {

                        /* renamed from: a */
                        boolean f759a = false;

                        /* renamed from: a */
                        public void mo971a(C0294u uVar) {
                            if (!this.f759a) {
                                C0235af.m918a(viewGroup4, false);
                            }
                            uVar.mo1092b((C0300c) this);
                        }

                        /* renamed from: b */
                        public void mo972b(C0294u uVar) {
                            C0235af.m918a(viewGroup4, false);
                        }

                        /* renamed from: c */
                        public void mo973c(C0294u uVar) {
                            C0235af.m918a(viewGroup4, true);
                        }
                    });
                }
                return animator;
            }
        } else {
            int intValue = ((Integer) aaVar3.f689a.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) aaVar3.f689a.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) aaVar4.f689a.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) aaVar4.f689a.get("android:changeBounds:windowY")).intValue();
            if (!(intValue == intValue3 && intValue2 == intValue4)) {
                viewGroup.getLocationInWindow(this.f755n);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float c = C0244am.m949c(view2);
                C0244am.m943a(view2, 0.0f);
                C0244am.m941a(viewGroup).mo980a(bitmapDrawable);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C0286n.m1053a(f748h, mo1108l().mo1069a((float) (intValue - this.f755n[0]), (float) (intValue2 - this.f755n[1]), (float) (intValue3 - this.f755n[0]), (float) (intValue4 - this.f755n[1])))});
                final ViewGroup viewGroup5 = viewGroup;
                final BitmapDrawable bitmapDrawable2 = bitmapDrawable;
                final View view5 = view2;
                final float f = c;
                C02682 r02 = new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        C0244am.m941a(viewGroup5).mo981b(bitmapDrawable2);
                        C0244am.m943a(view5, f);
                    }
                };
                ofPropertyValuesHolder.addListener(r02);
                return ofPropertyValuesHolder;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1017a(C0230aa aaVar) {
        m1017d(aaVar);
    }

    /* renamed from: a */
    public String[] mo1019a() {
        return f747g;
    }

    /* renamed from: b */
    public void mo1022b(C0230aa aaVar) {
        m1017d(aaVar);
    }
}
