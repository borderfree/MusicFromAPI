package android.support.transition;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: android.support.transition.aa */
public class C0230aa {

    /* renamed from: a */
    public final Map<String, Object> f689a = new HashMap();

    /* renamed from: b */
    public View f690b;

    /* renamed from: c */
    final ArrayList<C0294u> f691c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (obj instanceof C0230aa) {
            C0230aa aaVar = (C0230aa) obj;
            if (this.f690b == aaVar.f690b && this.f689a.equals(aaVar.f689a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f690b.hashCode() * 31) + this.f689a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.f690b);
        sb3.append("\n");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str : this.f689a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str);
            sb7.append(": ");
            sb7.append(this.f689a.get(str));
            sb7.append("\n");
            sb6 = sb7.toString();
        }
        return sb6;
    }
}
