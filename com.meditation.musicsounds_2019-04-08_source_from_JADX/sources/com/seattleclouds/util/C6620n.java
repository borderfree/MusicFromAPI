package com.seattleclouds.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.support.p023v7.widget.C1116l;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout.LayoutParams;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.p160e.C5334b;

/* renamed from: com.seattleclouds.util.n */
public class C6620n {

    /* renamed from: com.seattleclouds.util.n$a */
    public interface C6628a {
        /* renamed from: a */
        void mo18027a();

        /* renamed from: a */
        void mo18028a(String str, String str2);
    }

    /* renamed from: com.seattleclouds.util.n$b */
    public interface C6629b {
        /* renamed from: a */
        void mo18346a();

        /* renamed from: a */
        void mo18347a(String str);
    }

    /* renamed from: a */
    public static void m32027a(Context context, int i) {
        m32036a(context, (String) null, context.getResources().getString(i), (OnClickListener) null, (OnCancelListener) null);
    }

    /* renamed from: a */
    public static void m32028a(Context context, int i, int i2) {
        m32034a(context, context.getResources().getString(i), context.getResources().getString(i2));
    }

    /* renamed from: a */
    public static void m32029a(Context context, int i, int i2, OnClickListener onClickListener) {
        m32035a(context, context.getResources().getString(i), context.getResources().getString(i2), onClickListener);
    }

    /* renamed from: a */
    public static void m32030a(Context context, int i, int i2, boolean z, int i3, C6629b bVar) {
        m32042a(context, context.getResources().getString(i), context.getResources().getString(i2), z, context.getResources().getString(i3), bVar);
    }

    /* renamed from: a */
    public static void m32031a(Context context, int i, String str) {
        m32034a(context, context.getResources().getString(i), str);
    }

    /* renamed from: a */
    public static void m32032a(Context context, int i, String str, OnClickListener onClickListener) {
        m32035a(context, context.getResources().getString(i), str, onClickListener);
    }

    /* renamed from: a */
    public static void m32033a(Context context, String str) {
        m32036a(context, (String) null, str, (OnClickListener) null, (OnCancelListener) null);
    }

    /* renamed from: a */
    public static void m32034a(Context context, String str, String str2) {
        m32036a(context, str, str2, (OnClickListener) null, (OnCancelListener) null);
    }

    /* renamed from: a */
    public static void m32035a(Context context, String str, String str2, OnClickListener onClickListener) {
        m32036a(context, str, str2, onClickListener, (OnCancelListener) null);
    }

    /* renamed from: a */
    public static void m32036a(Context context, String str, String str2, OnClickListener onClickListener, OnCancelListener onCancelListener) {
        if (context != null) {
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                if (onClickListener == null) {
                    onClickListener = new OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    };
                }
                C0766a aVar = new C0766a(context);
                aVar.mo3063b((CharSequence) str2).mo3048a(17039370, onClickListener);
                if (str != null) {
                    aVar.mo3054a((CharSequence) str);
                }
                if (onCancelListener != null) {
                    aVar.mo3049a(onCancelListener);
                }
                aVar.mo3065b().show();
            }
        }
    }

    /* renamed from: a */
    public static void m32037a(Context context, String str, String str2, OnClickListener onClickListener, String str3, OnClickListener onClickListener2, String str4) {
        m32039a(context, str, str2, onClickListener, str3, onClickListener2, str4, null, null, true);
    }

    /* renamed from: a */
    public static void m32038a(Context context, String str, String str2, OnClickListener onClickListener, String str3, OnClickListener onClickListener2, String str4, OnClickListener onClickListener3, String str5) {
        m32039a(context, str, str2, onClickListener, str3, onClickListener2, str4, onClickListener3, str5, true);
    }

    /* renamed from: a */
    public static void m32039a(Context context, String str, String str2, OnClickListener onClickListener, String str3, OnClickListener onClickListener2, String str4, OnClickListener onClickListener3, String str5, boolean z) {
        C0766a aVar = new C0766a(context);
        if (str != null) {
            aVar.mo3054a((CharSequence) str);
        }
        if (str2 != null) {
            aVar.mo3063b((CharSequence) str2);
        }
        if (!(onClickListener == null || str3 == null)) {
            aVar.mo3055a((CharSequence) str3, onClickListener);
        }
        if (!(onClickListener2 == null || str4 == null)) {
            aVar.mo3067c(str4, onClickListener2);
        }
        if (!(onClickListener3 == null || str5 == null)) {
            aVar.mo3064b((CharSequence) str5, onClickListener3);
        }
        aVar.mo3056a(z);
        aVar.mo3065b().show();
    }

    /* renamed from: a */
    public static void m32040a(Context context, String str, String str2, boolean z, C6629b bVar) {
        m32042a(context, str, str2, z, context.getResources().getString(C5462k.save), bVar);
    }

    /* renamed from: a */
    public static void m32041a(final Context context, String str, String str2, boolean z, String str3, final C6628a aVar) {
        if (context != null) {
            LayoutParams layoutParams = new LayoutParams();
            layoutParams.setMargins(10, 5, 10, 5);
            final EditText editText = new EditText(context);
            editText.setHint("Username");
            editText.setLayoutParams(layoutParams);
            final EditText editText2 = new EditText(context);
            editText2.setHint("Password");
            editText2.setLayoutParams(layoutParams);
            editText2.setInputType(129);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.addView(editText);
            linearLayout.addView(editText2);
            C0766a aVar2 = new C0766a(context);
            aVar2.mo3056a(true).mo3062b((View) linearLayout).mo3055a((CharSequence) str3, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (aVar != null) {
                        aVar.mo18028a(editText.getText().toString(), editText2.getText().toString());
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                        inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                    }
                }
            }).mo3061b(17039360, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (aVar != null) {
                        aVar.mo18027a();
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                        inputMethodManager.hideSoftInputFromWindow(editText2.getWindowToken(), 0);
                    }
                    dialogInterface.cancel();
                }
            });
            if (str != null) {
                aVar2.mo3054a((CharSequence) str);
            }
            if (str2 != null) {
                aVar2.mo3063b((CharSequence) str2);
            }
            final C0765d b = aVar2.mo3065b();
            if (b.getWindow() != null) {
                b.getWindow().setSoftInputMode(5);
                b.show();
                if (!z) {
                    b.mo3039a(-1).setEnabled(false);
                    editText.addTextChangedListener(new TextWatcher() {
                        public void afterTextChanged(Editable editable) {
                        }

                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                            b.mo3039a(-1).setEnabled(charSequence.length() != 0);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    private static void m32042a(Context context, String str, String str2, boolean z, String str3, C6629b bVar) {
        m32043a(context, str, str2, z, "", str3, bVar);
    }

    /* renamed from: a */
    public static void m32043a(final Context context, String str, String str2, boolean z, String str3, String str4, final C6629b bVar) {
        if (context != null) {
            final C1116l lVar = new C1116l(context);
            if (context instanceof C6348n) {
                C5334b.m26771a(((C6348n) context).mo19778o(), (EditText) lVar);
            }
            lVar.setText(str3);
            lVar.selectAll();
            LinearLayout linearLayout = new LinearLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int a = C6619m.m32014a(context, 16.0f);
            int a2 = C6619m.m32014a(context, 20.0f);
            layoutParams.setMargins(a2, a, a2, a);
            linearLayout.addView(lVar, layoutParams);
            C0766a aVar = new C0766a(context);
            aVar.mo3056a(true).mo3062b((View) linearLayout).mo3055a((CharSequence) str4, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (bVar != null) {
                        bVar.mo18347a(lVar.getText().toString());
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(lVar.getWindowToken(), 0);
                    }
                }
            }).mo3061b(17039360, (OnClickListener) new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (bVar != null) {
                        bVar.mo18346a();
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(lVar.getWindowToken(), 0);
                    }
                    dialogInterface.cancel();
                }
            });
            if (str != null) {
                aVar.mo3054a((CharSequence) str);
            }
            if (str2 != null) {
                aVar.mo3063b((CharSequence) str2);
            }
            final C0765d b = aVar.mo3065b();
            if (b.getWindow() != null) {
                b.getWindow().setSoftInputMode(5);
                b.show();
                if (!z) {
                    b.mo3039a(-1).setEnabled(false);
                    lVar.addTextChangedListener(new TextWatcher() {
                        public void afterTextChanged(Editable editable) {
                        }

                        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                        }

                        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                            b.mo3039a(-1).setEnabled(charSequence.length() != 0);
                        }
                    });
                }
            }
        }
    }
}
