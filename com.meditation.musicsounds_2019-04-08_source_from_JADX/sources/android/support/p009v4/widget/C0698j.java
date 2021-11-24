package android.support.p009v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.j */
public class C0698j {

    /* renamed from: a */
    static final C0700b f2042a = (VERSION.SDK_INT >= 21 ? new C0701c() : new C0699a());

    /* renamed from: android.support.v4.widget.j$a */
    static class C0699a implements C0700b {
        C0699a() {
        }

        /* renamed from: a */
        public ColorStateList mo2893a(ImageView imageView) {
            if (imageView instanceof C0720r) {
                return ((C0720r) imageView).getSupportImageTintList();
            }
            return null;
        }

        /* renamed from: a */
        public void mo2894a(ImageView imageView, ColorStateList colorStateList) {
            if (imageView instanceof C0720r) {
                ((C0720r) imageView).setSupportImageTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo2895a(ImageView imageView, Mode mode) {
            if (imageView instanceof C0720r) {
                ((C0720r) imageView).setSupportImageTintMode(mode);
            }
        }

        /* renamed from: b */
        public Mode mo2896b(ImageView imageView) {
            if (imageView instanceof C0720r) {
                return ((C0720r) imageView).getSupportImageTintMode();
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.widget.j$b */
    interface C0700b {
        /* renamed from: a */
        ColorStateList mo2893a(ImageView imageView);

        /* renamed from: a */
        void mo2894a(ImageView imageView, ColorStateList colorStateList);

        /* renamed from: a */
        void mo2895a(ImageView imageView, Mode mode);

        /* renamed from: b */
        Mode mo2896b(ImageView imageView);
    }

    /* renamed from: android.support.v4.widget.j$c */
    static class C0701c extends C0699a {
        C0701c() {
        }

        /* renamed from: a */
        public ColorStateList mo2893a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: a */
        public void mo2894a(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        /* renamed from: a */
        public void mo2895a(ImageView imageView, Mode mode) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }

        /* renamed from: b */
        public Mode mo2896b(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    /* renamed from: a */
    public static ColorStateList m3293a(ImageView imageView) {
        return f2042a.mo2893a(imageView);
    }

    /* renamed from: a */
    public static void m3294a(ImageView imageView, ColorStateList colorStateList) {
        f2042a.mo2894a(imageView, colorStateList);
    }

    /* renamed from: a */
    public static void m3295a(ImageView imageView, Mode mode) {
        f2042a.mo2895a(imageView, mode);
    }

    /* renamed from: b */
    public static Mode m3296b(ImageView imageView) {
        return f2042a.mo2896b(imageView);
    }
}
