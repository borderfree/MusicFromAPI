package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* renamed from: com.google.android.gms.internal.ads.pw */
final class C3830pw implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f14676a;

    /* renamed from: b */
    private final /* synthetic */ EditText f14677b;

    C3830pw(JsPromptResult jsPromptResult, EditText editText) {
        this.f14676a = jsPromptResult;
        this.f14677b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14676a.confirm(this.f14677b.getText().toString());
    }
}
