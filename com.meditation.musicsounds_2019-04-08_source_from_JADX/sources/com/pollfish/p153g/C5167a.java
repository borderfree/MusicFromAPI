package com.pollfish.p153g;

import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.pollfish.p150f.C5162b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pollfish.g.a */
public class C5167a extends WebChromeClient {

    /* renamed from: a */
    private Object f18445a;

    /* renamed from: b */
    private String f18446b;

    /* renamed from: c */
    private boolean f18447c = false;

    public C5167a(Object obj, String str, boolean z) {
        C5162b.m25518a("GingerbreadWebViewChrome", "new GingerbreadWebViewChrome");
        this.f18445a = obj;
        this.f18446b = str;
        this.f18447c = z;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        String str4;
        StringBuilder sb;
        String str5;
        Method[] methods;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onJsPrompt url:");
        sb2.append(str);
        sb2.append(" message: ");
        sb2.append(str2);
        sb2.append(" javascriptInterfaceBroken: ");
        sb2.append(this.f18447c);
        C5162b.m25518a("GingerbreadWebViewChrome", sb2.toString());
        if (this.f18447c && !TextUtils.isEmpty(str2) && str2.startsWith(this.f18446b)) {
            try {
                JSONObject jSONObject = new JSONObject(str2.substring(this.f18446b.length()));
                String string = jSONObject.getString("name");
                for (Method method : this.f18445a.getClass().getMethods()) {
                    if (method.getName().equals(string)) {
                        JSONArray jSONArray = jSONObject.getJSONArray("args");
                        Object[] objArr = new Object[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            objArr[i] = jSONArray.get(i).toString();
                        }
                        Object invoke = method.invoke(this.f18445a, objArr);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", invoke);
                        jsPromptResult.confirm(jSONObject2.toString());
                        return true;
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Exception shouldOverrideUrlLoading: Could not find method '");
                sb3.append(string);
                sb3.append("()'.");
                C5162b.m25519b("GingerbreadWebViewChrome", sb3.toString());
            } catch (IllegalArgumentException unused) {
                C5162b.m25519b("GingerbreadWebViewChrome", "Exception in onJsPrompt (IllegalArgumentException): shouldOverrideUrlLoading: Please ensure your JSInterface methods only have String as parameters.");
            } catch (IllegalAccessException e) {
                e = e;
                str5 = "GingerbreadWebViewChrome";
                sb = new StringBuilder();
                str4 = "Exception in onJsPrompt (IllegalAccessException): ";
                sb.append(str4);
                sb.append(e);
                C5162b.m25519b(str5, sb.toString());
            } catch (InvocationTargetException e2) {
                e = e2;
                str5 = "GingerbreadWebViewChrome";
                sb = new StringBuilder();
                str4 = "Exception in onJsPrompt (InvocationTargetException): ";
                sb.append(str4);
                sb.append(e);
                C5162b.m25519b(str5, sb.toString());
            } catch (JSONException e3) {
                e = e3;
                str5 = "GingerbreadWebViewChrome";
                sb = new StringBuilder();
                str4 = "Exception in onJsPrompt (JSONException): ";
                sb.append(str4);
                sb.append(e);
                C5162b.m25519b(str5, sb.toString());
            }
        }
        return false;
    }
}
