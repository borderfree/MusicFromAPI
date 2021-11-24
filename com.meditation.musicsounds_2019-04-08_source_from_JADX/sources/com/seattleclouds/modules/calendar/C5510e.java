package com.seattleclouds.modules.calendar;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p023v7.app.C0765d.C0766a;
import com.seattleclouds.C5451m.C5462k;

/* renamed from: com.seattleclouds.modules.calendar.e */
public class C5510e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static int f19605a;

    /* renamed from: a */
    public static void m27423a(Context context, final C5506c cVar, long j, String str, OnClickListener onClickListener) {
        C0766a aVar;
        Context context2 = context;
        if (str == null) {
            C0766a aVar2 = new C0766a(context);
            C5506c cVar2 = cVar;
            final long j2 = j;
            final OnClickListener onClickListener2 = onClickListener;
            aVar2.mo3060b(C5462k.calendar_event_delete_confirmation).mo3047a(C5462k.calendar_event_delete).mo3056a(true).mo3048a(17039370, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    cVar.mo17852b(j2);
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(dialogInterface, i);
                    }
                }
            }).mo3061b(17039360, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            aVar = aVar2;
        } else {
            final C5506c cVar3 = cVar;
            final long j3 = j;
            final OnClickListener onClickListener3 = onClickListener;
            String[] strArr = {context.getResources().getString(C5462k.calendar_recurring_event_delete_only_this), context.getResources().getString(C5462k.calendar_recurring_event_delete_all)};
            f19605a = 0;
            aVar = new C0766a(context);
            C0766a a = aVar.mo3047a(C5462k.calendar_event_delete).mo3056a(true).mo3057a((CharSequence[]) strArr, f19605a, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C5510e.f19605a = i;
                }
            });
            final String str2 = str;
            C55144 r4 = new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (C5510e.f19605a == 0) {
                        cVar3.mo17852b(j3);
                    } else {
                        cVar3.mo17850a(str2);
                    }
                    if (onClickListener3 != null) {
                        onClickListener3.onClick(dialogInterface, i);
                    }
                }
            };
            a.mo3048a(17039370, (OnClickListener) r4).mo3061b(17039360, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
        }
        aVar.mo3065b().show();
    }
}
