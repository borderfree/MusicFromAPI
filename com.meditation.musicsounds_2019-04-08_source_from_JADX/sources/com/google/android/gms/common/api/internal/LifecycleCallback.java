package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: a */
    protected final C3141g f10638a;

    protected LifecycleCallback(C3141g gVar) {
        this.f10638a = gVar;
    }

    /* renamed from: a */
    protected static C3141g m14100a(C3140f fVar) {
        if (fVar.mo11055a()) {
            return C3133cv.m14420a(fVar.mo11058d());
        }
        if (fVar.mo11056b()) {
            return C3131ct.m14414a(fVar.mo11057c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C3141g getChimeraLifecycleFragmentImpl(C3140f fVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public Activity mo10884a() {
        return this.f10638a.mo11012j_();
    }

    /* renamed from: a */
    public void mo10885a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo10886a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo10887a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void mo10888b() {
    }

    /* renamed from: b */
    public void mo10889b(Bundle bundle) {
    }

    /* renamed from: c */
    public void mo10890c() {
    }

    /* renamed from: d */
    public void mo10891d() {
    }

    /* renamed from: e */
    public void mo10892e() {
    }
}
