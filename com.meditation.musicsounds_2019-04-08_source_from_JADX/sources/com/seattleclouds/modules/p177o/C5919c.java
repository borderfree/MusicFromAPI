package com.seattleclouds.modules.p177o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.order.C5956a;
import com.seattleclouds.modules.order.OrderConfigInfo;
import com.seattleclouds.util.C6595ao;
import com.seattleclouds.util.C6613i;
import com.seattleclouds.util.C6644x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.o.c */
public class C5919c {

    /* renamed from: a */
    private static String f20924a = "c";

    /* renamed from: c */
    private static C5919c f20925c;

    /* renamed from: b */
    private boolean f20926b = false;

    /* renamed from: d */
    private HashMap<String, C5918b> f20927d = new HashMap<>();

    /* renamed from: e */
    private Context f20928e;

    private C5919c(Context context) {
        this.f20928e = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C5919c m29042a(Context context) {
        if (f20925c == null) {
            f20925c = new C5919c(context);
        }
        return f20925c;
    }

    /* renamed from: a */
    private String m29043a(C5931g gVar, Context context) {
        StringBuilder sb;
        String str;
        String str2 = "";
        int size = gVar.mo18755d().size();
        int size2 = gVar.mo18754c().size();
        if (size <= 0 || size2 != 0) {
            if (size != 0 || size2 <= 0) {
                if (size <= 0 || size2 <= 0) {
                    return str2;
                }
                if (context != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(String.format(context.getString(C5462k.product_order_product_options), new Object[]{Integer.valueOf(size)}));
                    sb2.append(" ");
                    sb2.append(String.format(context.getString(C5462k.product_order_product_sizes), new Object[]{Integer.valueOf(size2)}));
                    return sb2.toString();
                }
                sb = new StringBuilder();
                sb.append("Options: ");
                sb.append(size);
                str = " Sizes: ";
            } else if (context != null) {
                return String.format(context.getString(C5462k.product_order_product_sizes), new Object[]{Integer.valueOf(size2)});
            } else {
                sb = new StringBuilder();
                str = "Sizes: ";
            }
            sb.append(str);
            sb.append(size2);
            return sb.toString();
        } else if (context != null) {
            return String.format(context.getString(C5462k.product_order_product_options), new Object[]{Integer.valueOf(size)});
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Options: ");
            sb3.append(size);
            return sb3.toString();
        }
    }

    /* renamed from: a */
    private HashMap<String, String> m29044a(String str, String str2, String str3, int i) {
        StringBuilder sb;
        String str4;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        if (this.f20928e != null) {
            sb = new StringBuilder();
            str4 = this.f20928e.getString(C5462k.product_order_products_count);
        } else {
            sb = new StringBuilder();
            str4 = "Products count:";
        }
        sb.append(str4);
        sb.append(i);
        hashMap.put(str3, sb.toString());
        return hashMap;
    }

    /* renamed from: a */
    private HashMap<String, String> m29045a(String str, String str2, String str3, String str4) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return hashMap;
    }

    /* renamed from: a */
    private HashMap<String, String> m29046a(String str, String str2, String str3, String str4, String str5, double d, String str6, String str7, int i, String str8, int i2) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        hashMap.put(str5, C6644x.m32095a(str6, d));
        hashMap.put(str7, Integer.toString(i));
        hashMap.put(str8, Integer.toString(i2));
        return hashMap;
    }

    /* renamed from: a */
    public C5931g mo18721a(String str, int i, int i2) {
        if (this.f20927d == null) {
            return null;
        }
        ArrayList c = ((C5918b) this.f20927d.get(str)).mo18719c();
        if (c != null && i <= c.size() - 1 && i >= 0) {
            ArrayList a = ((C5917a) c.get(i)).mo18714a();
            if (a != null && i2 <= a.size() - 1 && i2 >= 0) {
                return (C5931g) a.get(i2);
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo18722a() {
        C5230aa r = App.m25674r();
        return r != null ? r.mo17060aF().mo18812g() : "USD";
    }

    /* renamed from: a */
    public List<Map<String, String>> mo18723a(String str, int i) {
        int i2 = i;
        ArrayList arrayList = new ArrayList();
        if (this.f20927d == null) {
            return arrayList;
        }
        ArrayList c = ((C5918b) this.f20927d.get(str)).mo18719c();
        if (c != null && i2 <= c.size() - 1 && i2 >= 0) {
            ArrayList a = ((C5917a) c.get(i2)).mo18714a();
            String a2 = mo18722a();
            Iterator it = a.iterator();
            int i3 = 0;
            int i4 = 0;
            while (it.hasNext()) {
                C5931g gVar = (C5931g) it.next();
                if (this.f20926b) {
                    String str2 = f20924a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Product:");
                    sb.append(gVar.mo17509h());
                    Log.d(str2, sb.toString());
                }
                String a3 = m29043a(gVar, this.f20928e);
                double i5 = gVar.mo17511i();
                if (!gVar.mo18754c().isEmpty()) {
                    i5 = ((C5946k) gVar.mo18754c().get(i3)).mo18792b();
                }
                arrayList.add(m29046a("product", gVar.mo17509h(), "product_details", a3, "price", i5, a2, "categoryIndex", i, "productIndex", i4));
                i4++;
                i3 = 0;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo18724a(Activity activity, Fragment fragment, String str) {
        C5230aa r = App.m25674r();
        if (r == null) {
            C6595ao.m31930a((Context) activity, activity.getString(C5462k.product_order_error_message_there_is_no_any_order_page), true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("pageId", r.mo17046a());
        bundle.putBundle("PAGE_STYLE", r.mo17110as());
        OrderConfigInfo aF = r.mo17060aF();
        aF.mo18804a(str);
        bundle.putParcelable("ORDER_INFO", aF);
        App.m25620a(new FragmentInfo(C5956a.class.getName(), bundle), fragment);
    }

    /* renamed from: a */
    public void mo18725a(String str) {
        String str2;
        StringBuilder sb;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".json");
        try {
            this.f20927d.put(str, C5918b.m29037a(new JSONObject(C6613i.m31991b(App.m25649e(sb2.toString())))));
            return;
        } catch (IllegalArgumentException e) {
            str3 = f20924a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str2 = e.getLocalizedMessage();
            r4 = e;
        } catch (IOException e2) {
            str3 = f20924a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str2 = e2.getLocalizedMessage();
            r4 = e2;
        } catch (JSONException e3) {
            str3 = f20924a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str2 = e3.getLocalizedMessage();
            r4 = e3;
        } catch (Exception e4) {
            str3 = f20924a;
            sb = new StringBuilder();
            sb.append("ERROR:");
            str2 = e4.getLocalizedMessage();
            r4 = e4;
        }
        sb.append(str2);
        Log.e(str3, sb.toString(), r4);
    }

    /* renamed from: b */
    public C5918b mo18726b(String str) {
        if (this.f20927d != null) {
            return (C5918b) this.f20927d.get(str);
        }
        return null;
    }

    /* renamed from: c */
    public List<Map<String, String>> mo18727c(String str) {
        ArrayList arrayList = new ArrayList();
        if (this.f20927d == null) {
            return arrayList;
        }
        ArrayList b = ((C5918b) this.f20927d.get(str)).mo18718b();
        if (b == null) {
            return arrayList;
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            C5921e eVar = (C5921e) it.next();
            if (this.f20926b) {
                String str2 = f20924a;
                StringBuilder sb = new StringBuilder();
                sb.append("Location Detail:");
                sb.append(eVar.mo18737e());
                Log.d(str2, sb.toString());
            }
            arrayList.add(m29045a("city", eVar.mo18733a(), "locationDetail", eVar.mo18737e()));
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<Map<String, String>> mo18728d(String str) {
        ArrayList arrayList = new ArrayList();
        if (this.f20927d == null) {
            return arrayList;
        }
        ArrayList c = ((C5918b) this.f20927d.get(str)).mo18719c();
        if (c == null) {
            return arrayList;
        }
        Iterator it = c.iterator();
        while (it.hasNext()) {
            C5917a aVar = (C5917a) it.next();
            if (this.f20926b) {
                String str2 = f20924a;
                StringBuilder sb = new StringBuilder();
                sb.append("Category:");
                sb.append(aVar.mo18716b());
                Log.d(str2, sb.toString());
            }
            arrayList.add(m29044a("category", aVar.mo18716b(), "productCount", aVar.mo18714a().size()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public List<Map<String, String>> mo18729e(String str) {
        ArrayList arrayList = new ArrayList();
        if (this.f20927d == null) {
            return arrayList;
        }
        ArrayList d = ((C5918b) this.f20927d.get(str)).mo18720d();
        String a = mo18722a();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            C5931g gVar = (C5931g) it.next();
            if (this.f20926b) {
                String str2 = f20924a;
                StringBuilder sb = new StringBuilder();
                sb.append("Product:");
                sb.append(gVar.mo17509h());
                Log.d(str2, sb.toString());
            }
            String a2 = m29043a(gVar, this.f20928e);
            double i = gVar.mo17511i();
            if (!gVar.mo18754c().isEmpty()) {
                i = ((C5946k) gVar.mo18754c().get(0)).mo18792b();
            }
            arrayList.add(m29046a("product", gVar.mo17509h(), "product_details", a2, "price", i, a, "categoryIndex", gVar.mo18757f() > -1 ? gVar.mo18757f() : -1, "productIndex", gVar.mo18758g() > -1 ? gVar.mo18758g() : -1));
        }
        return arrayList;
    }
}
