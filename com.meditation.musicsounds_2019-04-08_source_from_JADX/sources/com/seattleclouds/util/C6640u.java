package com.seattleclouds.util;

import android.util.Log;
import com.seattleclouds.App;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.util.u */
public class C6640u {

    /* renamed from: a */
    private static JSONObject f23374a = new JSONObject();

    /* renamed from: a */
    public static String m32087a() {
        StringBuilder sb = new StringBuilder("<script type=\"text/javascript\"> var jobject = new Object();");
        sb.append("jobject.score = ");
        sb.append(f23374a.optInt("score", 0));
        sb.append(";");
        sb.append("jobject.qscore = ");
        double size = (double) App.f18501c.mo16903E().size();
        Double.isNaN(size);
        sb.append(f23374a.optDouble("qscore", 100.0d / size));
        sb.append(";");
        sb.append("jobject.passedQuestions = ");
        sb.append(f23374a.optInt("passedQuestions", 0));
        sb.append(";");
        sb.append("jobject.numberOfQuestions = ");
        sb.append(f23374a.optInt("numberOfQuestions", 0));
        sb.append(";");
        sb.append("jobject.correctAnswers = ");
        sb.append(f23374a.optInt("correctAnswers", 0));
        sb.append(";");
        sb.append("</script>");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m32088a(String str) {
        StringBuilder sb = new StringBuilder();
        int indexOf = str.indexOf("</head>");
        if (indexOf == -1) {
            return null;
        }
        sb.append(str.substring(0, indexOf));
        sb.append(m32087a());
        sb.append(str.substring(indexOf, str.length()));
        return sb.toString();
    }

    /* renamed from: a */
    public static void m32089a(String str, String str2) {
        try {
            f23374a.put(str, str2);
            if (App.f18501c.mo16903E().size() > 0 && !str.equalsIgnoreCase("correctAnswers") && !str.equalsIgnoreCase("numberOfQuestions") && !str.equalsIgnoreCase("passedQuestions") && !str.equalsIgnoreCase("score") && !str.equalsIgnoreCase("qscore")) {
                f23374a.put("passedQuestions", f23374a.optInt("passedQuestions", 0) + 1);
                if (str2.equalsIgnoreCase("correct")) {
                    int optInt = f23374a.optInt("correctAnswers", 0) + 1;
                    f23374a.put("correctAnswers", optInt);
                    f23374a.optInt("score", 0);
                    JSONObject jSONObject = f23374a;
                    String str3 = "qscore";
                    double size = (double) App.f18501c.mo16903E().size();
                    Double.isNaN(size);
                    double optDouble = jSONObject.optDouble(str3, 100.0d / size);
                    double d = (double) optInt;
                    Double.isNaN(d);
                    f23374a.put("score", (int) (optDouble * d));
                }
            }
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("saveJValue: ");
            sb.append(e);
            Log.e("JObjectUtil", sb.toString());
        }
    }

    /* renamed from: b */
    public static void m32090b() {
        f23374a = new JSONObject();
    }
}
