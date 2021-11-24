package android.support.p023v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p023v7.app.C0756b.C0758a;
import android.support.p023v7.view.C0827b;
import android.support.p023v7.view.C0827b.C0828a;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* renamed from: android.support.v7.app.g */
public abstract class C0769g {

    /* renamed from: a */
    private static int f2235a = -1;

    /* renamed from: b */
    private static boolean f2236b = false;

    C0769g() {
    }

    /* renamed from: a */
    public static C0769g m3581a(Activity activity, C0768f fVar) {
        return m3583a(activity, activity.getWindow(), fVar);
    }

    /* renamed from: a */
    public static C0769g m3582a(Dialog dialog, C0768f fVar) {
        return m3583a(dialog.getContext(), dialog.getWindow(), fVar);
    }

    /* renamed from: a */
    private static C0769g m3583a(Context context, Window window, C0768f fVar) {
        return VERSION.SDK_INT >= 24 ? new C0774i(context, window, fVar) : VERSION.SDK_INT >= 23 ? new C0780k(context, window, fVar) : new C0776j(context, window, fVar);
    }

    /* renamed from: k */
    public static int m3584k() {
        return f2235a;
    }

    /* renamed from: l */
    public static boolean m3585l() {
        return f2236b;
    }

    /* renamed from: a */
    public abstract C0751a mo3098a();

    /* renamed from: a */
    public abstract C0827b mo3099a(C0828a aVar);

    /* renamed from: a */
    public abstract <T extends View> T mo3100a(int i);

    /* renamed from: a */
    public abstract void mo3101a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo3102a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo3103a(View view);

    /* renamed from: a */
    public abstract void mo3104a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo3105a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo3106b();

    /* renamed from: b */
    public abstract void mo3107b(int i);

    /* renamed from: b */
    public abstract void mo3108b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo3109b(View view, LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo3110c();

    /* renamed from: c */
    public abstract void mo3111c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo3112c(int i);

    /* renamed from: d */
    public abstract void mo3113d();

    /* renamed from: e */
    public abstract void mo3114e();

    /* renamed from: f */
    public abstract void mo3115f();

    /* renamed from: g */
    public abstract void mo3116g();

    /* renamed from: h */
    public abstract C0758a mo3117h();

    /* renamed from: i */
    public abstract void mo3118i();

    /* renamed from: j */
    public abstract boolean mo3119j();
}
