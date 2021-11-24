package com.seattleclouds.modules.p168f;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6635q;
import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.f.b */
public class C5616b extends C6557s {

    /* renamed from: a */
    C6635q f19950a = new C6635q();

    /* renamed from: b */
    private View f19951b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5622c f19952c = null;

    /* renamed from: com.seattleclouds.modules.f.b$a */
    static class C5620a {

        /* renamed from: a */
        ImageView f19957a;

        /* renamed from: b */
        TextView f19958b;

        C5620a() {
        }
    }

    /* renamed from: com.seattleclouds.modules.f.b$b */
    private class C5621b extends AsyncTask<String, Void, Bitmap> {

        /* renamed from: a */
        public int f19959a;

        /* renamed from: c */
        private ImageView f19961c;

        private C5621b() {
            this.f19959a = -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(String... strArr) {
            return C5616b.this.m27883c(strArr[0]);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Bitmap bitmap) {
            if (this.f19961c != null && this.f19961c.getTag() != null && this.f19959a == ((Integer) this.f19961c.getTag()).intValue()) {
                this.f19961c.setImageBitmap(bitmap);
            }
        }

        /* renamed from: a */
        public void mo18150a(ImageView imageView) {
            this.f19961c = imageView;
        }
    }

    /* renamed from: com.seattleclouds.modules.f.b$c */
    public class C5622c extends BaseAdapter {

        /* renamed from: a */
        Context f19962a;

        /* renamed from: b */
        int f19963b;

        /* renamed from: c */
        ArrayList<Map<String, String>> f19964c = new ArrayList<>();

        public C5622c(Context context, int i) {
            this.f19963b = i;
            this.f19962a = context;
        }

        /* renamed from: a */
        public Map<String, String> mo18153a(int i) {
            return (Map) this.f19964c.get(i);
        }

        /* renamed from: a */
        public void mo18154a(ArrayList<Map<String, String>> arrayList) {
            this.f19964c = arrayList;
            notifyDataSetChanged();
        }

        /* renamed from: b */
        public Map<String, String> getItem(int i) {
            return (Map) this.f19964c.get(i);
        }

        public int getCount() {
            return this.f19964c.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5620a aVar;
            if (view == null) {
                view = ((Activity) this.f19962a).getLayoutInflater().inflate(this.f19963b, viewGroup, false);
                aVar = new C5620a();
                aVar.f19957a = (ImageView) view.findViewById(C5458g.image);
                aVar.f19958b = (TextView) view.findViewById(C5458g.title);
                view.setTag(aVar);
            } else {
                aVar = (C5620a) view.getTag();
            }
            Map a = mo18153a(i);
            String str = (String) a.get("md5ID");
            String str2 = (String) a.get("link");
            String str3 = (String) a.get("rssURL");
            String str4 = (String) a.get("pictureURL");
            aVar.f19957a.setImageBitmap(null);
            aVar.f19957a.setTag(Integer.valueOf(i));
            aVar.f19958b.setTag(Integer.valueOf(i));
            if (C5616b.this.f19950a.mo20624a(str) == null) {
                C5621b bVar = new C5621b();
                bVar.f19959a = i;
                bVar.mo18150a(aVar.f19957a);
                bVar.execute(new String[]{str4});
            } else {
                aVar.f19957a.setImageBitmap(C5616b.this.f19950a.mo20624a(str));
            }
            aVar.f19958b.setText((String) a.get("title"));
            return view;
        }
    }

    /* renamed from: b */
    private void m27882b() {
        ListView listView = (ListView) this.f19951b.findViewById(C5458g.favorites_listview);
        ImageView imageView = (ImageView) this.f19951b.findViewById(C5458g.favorites_header_image);
        Bundle m = mo1307m();
        if (m != null) {
            Bitmap decodeStream = BitmapFactory.decodeStream(App.m25649e(m.getString("HEADER_IMAGE")));
            if (decodeStream != null) {
                imageView.setImageBitmap(decodeStream);
                imageView.setVisibility(0);
            }
        }
        this.f19952c = new C5622c(mo1318s(), C5460i.favorites_list_cell);
        listView.setAdapter(this.f19952c);
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                String str;
                Map a = ((C5622c) adapterView.getAdapter()).mo18153a(i);
                String str2 = (String) a.get("link");
                if (str2.length() <= 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("http://");
                    sb.append(App.f18516r);
                    sb.append("/myapplications/");
                    sb.append(App.f18523y);
                    sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                    sb.append(App.f18524z);
                    sb.append("/reader.ashx?itemid=");
                    sb.append(URLEncoder.encode((String) a.get("itemID")));
                    sb.append("&rssurl=");
                    sb.append(URLEncoder.encode((String) a.get("rssURL")));
                    str = sb.toString();
                } else if (str2.contains("://")) {
                    App.m25638b(str2, (Fragment) C5616b.this);
                    return;
                } else {
                    str = App.m25655h(str2);
                }
                App.m25638b(str, (Fragment) C5616b.this);
            }
        });
        listView.setOnItemLongClickListener(new OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int i, long j) {
                new C0766a(C5616b.this.mo1318s()).mo3060b(C5462k.favorites_remove_confirm_dialog).mo3048a(17039379, (OnClickListener) new OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C5614a a = C5614a.m27865a((Context) C5616b.this.mo1318s());
                        Map a2 = C5616b.this.f19952c.mo18153a(i);
                        String str = (String) a2.get("type");
                        String str2 = (String) a2.get("md5ID");
                        String str3 = (String) a2.get("rssURL");
                        if (str.equals("ILTI")) {
                            a.mo18134a(str2);
                        } else if (str.equals("RSSItem")) {
                            a.mo18135a(str2, str3);
                        } else {
                            Log.e("Favorites", "Something went wrong with type read!");
                        }
                        C5616b.this.f19952c.notifyDataSetChanged();
                    }
                }).mo3061b(17039369, (OnClickListener) null).mo3068c();
                return true;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Bitmap m27883c(String str) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap a = this.f19950a.mo20624a(str);
        if (a != null) {
            return a;
        }
        if (str.startsWith("http://")) {
            try {
                bitmap2 = BitmapFactory.decodeStream((InputStream) new URL(str).getContent());
                try {
                    this.f19950a.mo20626a(str, bitmap2);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                bitmap2 = a;
            }
            return bitmap2;
        }
        try {
            bitmap = BitmapFactory.decodeStream(App.m25649e(str));
            try {
                this.f19950a.mo20626a(str, bitmap);
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            bitmap = a;
        }
        return bitmap;
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f19952c != null) {
            this.f19952c.mo18154a(C5614a.m27865a((Context) mo1318s()).mo18141d());
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19951b = layoutInflater.inflate(C5460i.favorites_activity, viewGroup, false);
        m27882b();
        return this.f19951b;
    }
}
