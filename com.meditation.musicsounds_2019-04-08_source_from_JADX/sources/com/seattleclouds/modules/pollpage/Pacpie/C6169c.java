package com.seattleclouds.modules.pollpage.Pacpie;

import android.view.View;

/* renamed from: com.seattleclouds.modules.pollpage.Pacpie.c */
public final class C6169c {

    /* renamed from: com.seattleclouds.modules.pollpage.Pacpie.c$a */
    private static final class C6170a {
        /* renamed from: a */
        static void m30060a(View view, float f) {
            view.setRotation(f);
        }

        /* renamed from: b */
        static void m30061b(View view, float f) {
            view.setScaleX(f);
        }

        /* renamed from: c */
        static void m30062c(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: a */
    public static void m30057a(View view, float f) {
        if (C6167a.f21866a) {
            C6167a.m30049a(view).mo19386a(f);
        } else {
            C6170a.m30060a(view, f);
        }
    }

    /* renamed from: b */
    public static void m30058b(View view, float f) {
        if (C6167a.f21866a) {
            C6167a.m30049a(view).mo19388b(f);
        } else {
            C6170a.m30061b(view, f);
        }
    }

    /* renamed from: c */
    public static void m30059c(View view, float f) {
        if (C6167a.f21866a) {
            C6167a.m30049a(view).mo19389c(f);
        } else {
            C6170a.m30062c(view, f);
        }
    }
}
