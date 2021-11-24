package com.seattleclouds.modules.podcast;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import com.seattleclouds.App;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.podcast.player.AudioPlayerActivity;
import com.seattleclouds.modules.podcast.player.C6143a;
import com.seattleclouds.modules.podcast.player.C6146c;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6598aq;
import com.seattleclouds.util.HTTPUtil;
import java.io.File;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.podcast.g */
public class C6139g {

    /* renamed from: a */
    static final int[] f21755a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 34, 42, 47, 58, 60, 62, 63, 92, 124};

    /* renamed from: b */
    private static SimpleDateFormat f21756b = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.UK);

    /* renamed from: c */
    private static SimpleDateFormat f21757c = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss ZZZ", Locale.UK);

    /* renamed from: a */
    public static Uri m29948a(PodcastItem podcastItem) {
        File file = new File(m29957b(podcastItem));
        if (file.exists()) {
            return Uri.fromFile(file);
        }
        return null;
    }

    /* renamed from: a */
    public static String m29949a() {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25666n());
        sb.append("/PodcastCache/");
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return sb2;
    }

    /* renamed from: a */
    private static String m29950a(Element element, String str) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        int length = elementsByTagName.getLength();
        if (length > 0) {
            return ((Element) elementsByTagName.item(length - 1)).getTextContent();
        }
        return null;
    }

    /* renamed from: a */
    private static String m29951a(Element element, String str, String str2) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        int length = elementsByTagName.getLength();
        if (length > 0) {
            return ((Element) elementsByTagName.item(length - 1)).getAttribute(str2);
        }
        return null;
    }

    /* renamed from: a */
    private static ArrayList<String> m29952a(Element element, String str, String... strArr) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        int length = elementsByTagName.getLength();
        if (length <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Element element2 = (Element) elementsByTagName.item(length - 1);
        for (String attribute : strArr) {
            arrayList.add(element2.getAttribute(attribute));
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return f21757c.parse(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date m29953a(java.lang.String r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.text.SimpleDateFormat r1 = f21756b     // Catch:{ ParseException -> 0x000b }
            java.util.Date r1 = r1.parse(r2)     // Catch:{ ParseException -> 0x000b }
            return r1
        L_0x000b:
            java.text.SimpleDateFormat r1 = f21757c     // Catch:{ ParseException -> 0x0012 }
            java.util.Date r2 = r1.parse(r2)     // Catch:{ ParseException -> 0x0012 }
            return r2
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.C6139g.m29953a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public static void m29954a(Activity activity, PodcastInfo podcastInfo) {
        String str = (podcastInfo.link == null || podcastInfo.link.length() <= 0) ? podcastInfo.url : podcastInfo.link;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", podcastInfo.title);
        intent.putExtra("android.intent.extra.TEXT", str);
        if (VERSION.SDK_INT >= 16) {
            StringBuilder sb = new StringBuilder();
            sb.append("<a href=\"+urlShare+\">");
            sb.append(podcastInfo.title);
            sb.append("</a>");
            intent.putExtra("android.intent.extra.HTML_TEXT", Html.fromHtml(sb.toString()));
        }
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public static void m29955a(Activity activity, PodcastItem podcastItem) {
        Intent intent;
        if (podcastItem.type.startsWith("video")) {
            try {
                Intent intent2 = new Intent(C6143a.m30001d(activity));
                intent2.setPackage("com.seattleclouds.modules.podcast");
                activity.startService(intent2);
            } catch (SecurityException unused) {
            }
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            Uri anyMediaUri = podcastItem.getAnyMediaUri();
            if ("file".equalsIgnoreCase(anyMediaUri.getScheme())) {
                anyMediaUri = C6598aq.m31937a(new File(anyMediaUri.getPath()));
                intent.setFlags(1);
            }
            intent.setDataAndType(anyMediaUri, podcastItem.type);
        } else {
            Bundle bundle = new Bundle();
            bundle.putSerializable("ARG_PODCAST_ITEM", podcastItem);
            bundle.putBoolean("ARG_AUTO_PLAY", true);
            FragmentInfo fragmentInfo = new FragmentInfo(C6146c.class.getName(), bundle);
            intent = new Intent(activity, AudioPlayerActivity.class);
            intent.putExtra("ARG_PAGE_FRAGMENT_INFO", fragmentInfo);
        }
        activity.startActivity(intent);
    }

    /* renamed from: b */
    public static String m29956b() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append("/Podcast/");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(App.f18468A);
        String sb4 = sb3.toString();
        File file = new File(sb4);
        if (!file.exists()) {
            file.mkdirs();
        }
        return sb4;
    }

    /* renamed from: b */
    public static String m29957b(PodcastItem podcastItem) {
        String b = m29956b();
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(m29966g(podcastItem.podcastTitle));
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb3.append(m29966g(podcastItem.title));
        String sb4 = sb3.toString();
        String lastPathSegment = podcastItem.getMediaUri().getLastPathSegment();
        if (lastPathSegment == null) {
            return sb4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf <= -1) {
            return sb4;
        }
        String substring = lastPathSegment.substring(lastIndexOf);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(substring);
        return sb5.toString();
    }

    /* renamed from: b */
    public static String m29958b(String str) {
        String a = m29949a();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("/PodcastCache/");
        sb.append(C6592al.m31912e(str));
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return sb2;
    }

    /* renamed from: b */
    public static void m29959b(Activity activity, PodcastItem podcastItem) {
        String str = (podcastItem.link == null || podcastItem.link.length() <= 0) ? podcastItem.mediaUrlString : podcastItem.link;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", podcastItem.title);
        intent.putExtra("android.intent.extra.TEXT", str);
        if (VERSION.SDK_INT >= 16) {
            StringBuilder sb = new StringBuilder();
            sb.append("<a href=\"+urlShare+\">");
            sb.append(podcastItem.title);
            sb.append("</a>");
            intent.putExtra("android.intent.extra.HTML_TEXT", Html.fromHtml(sb.toString()));
        }
        activity.startActivity(intent);
    }

    /* renamed from: c */
    public static String m29960c() {
        String a = m29949a();
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("downloads.ar");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m29961c(PodcastItem podcastItem) {
        StringBuilder sb = new StringBuilder();
        sb.append(m29957b(podcastItem));
        sb.append(".download");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m29962c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m29958b(str));
        sb.append("/cover.png");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m29963d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m29958b(str));
        sb.append("/info.ar");
        return sb.toString();
    }

    /* renamed from: e */
    public static String m29964e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m29958b(str));
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append("downloads.ar");
        return sb.toString();
    }

    /* renamed from: f */
    public static PodcastInfo m29965f(String str) {
        String b = HTTPUtil.m31767b(str);
        XPath newXPath = XPathFactory.newInstance().newXPath();
        Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(b)));
        PodcastInfo podcastInfo = new PodcastInfo();
        podcastInfo.url = str;
        podcastInfo.title = newXPath.evaluate("/rss/channel/title", parse);
        podcastInfo.link = newXPath.evaluate("/rss/channel/link", parse);
        podcastInfo.description = newXPath.evaluate("/rss/channel/description", parse);
        podcastInfo.lasBuildDate = newXPath.evaluate("/rss/channel/lastBuildDate", parse);
        String evaluate = newXPath.evaluate("/rss/channel/image/url", parse);
        if (evaluate == null || evaluate.length() == 0) {
            evaluate = newXPath.evaluate("/rss/channel/*[local-name() = 'image']/@href", parse);
        }
        podcastInfo.imageUrl = evaluate;
        HashMap hashMap = new HashMap();
        NodeList nodeList = (NodeList) newXPath.evaluate("/rss/channel/item", parse, XPathConstants.NODESET);
        int i = 0;
        int i2 = 0;
        while (i2 < nodeList.getLength()) {
            Element element = (Element) nodeList.item(i2);
            String[] strArr = new String[3];
            strArr[i] = "url";
            strArr[1] = "length";
            strArr[2] = "type";
            ArrayList a = m29952a(element, "enclosure", strArr);
            if (a != null) {
                String str2 = (String) a.get(i);
                String str3 = (String) a.get(1);
                String str4 = (String) a.get(2);
                String a2 = m29950a(element, "title");
                if (!(a2 == null || a2.length() == 0 || str2 == null || str2.length() == 0)) {
                    String a3 = m29950a(element, "dc:creator");
                    if (a3 == null || a3.length() == 0) {
                        a3 = m29950a(element, "itunes:author");
                    }
                    String a4 = m29950a(element, "category");
                    String a5 = m29950a(element, "link");
                    String a6 = m29950a(element, "pubDate");
                    String a7 = m29951a(element, "image", "href");
                    if (a7 == null || a7.length() == 0) {
                        a7 = m29951a(element, "itunes:image", "href");
                    }
                    String a8 = m29951a(element, "rawvoice:poster", "url");
                    String a9 = m29950a(element, "itunes:summary");
                    PodcastItem podcastItem = new PodcastItem();
                    podcastItem.title = a2;
                    podcastItem.author = a3;
                    podcastItem.summary = a9;
                    podcastItem.mediaUrlString = str2;
                    podcastItem.length = str3;
                    podcastItem.type = str4;
                    podcastItem.category = a4;
                    podcastItem.link = a5;
                    podcastItem.publishedDate = m29953a(a6);
                    podcastItem.imageUrl = a7;
                    podcastItem.posterUrl = a8;
                    podcastItem.podcastUrl = podcastInfo.url;
                    podcastItem.podcastImageUrl = podcastInfo.imageUrl;
                    podcastItem.podcastTitle = podcastInfo.title;
                    podcastItem.updateMediaUri();
                    String str5 = podcastItem.category;
                    if (str5 == null) {
                        str5 = "";
                    }
                    ArrayList arrayList = (ArrayList) hashMap.get(str5);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(str5, arrayList);
                    }
                    arrayList.add(podcastItem);
                }
            }
            i2++;
            i = 0;
        }
        for (String str6 : hashMap.keySet()) {
            ArrayList<PodcastItem> arrayList2 = (ArrayList) hashMap.get(str6);
            PodcastCategory podcastCategory = new PodcastCategory();
            podcastCategory.title = str6;
            podcastCategory.items = arrayList2;
            Collections.sort(arrayList2, new Comparator<PodcastItem>() {
                /* renamed from: a */
                public int compare(PodcastItem podcastItem, PodcastItem podcastItem2) {
                    if (podcastItem.publishedDate == null || podcastItem2.publishedDate == null) {
                        return 0;
                    }
                    return podcastItem2.publishedDate.compareTo(podcastItem.publishedDate);
                }
            });
            podcastCategory.items = arrayList2;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                PodcastItem podcastItem2 = (PodcastItem) it.next();
                if (podcastItem2.publishedDate != null && (podcastCategory.lastPodcastItem == null || podcastCategory.lastPodcastItem.publishedDate.compareTo(podcastItem2.publishedDate) == -1)) {
                    podcastCategory.lastPodcastItem = podcastItem2;
                }
            }
            podcastInfo.categories.add(podcastCategory);
        }
        Collections.sort(podcastInfo.categories, new Comparator<PodcastCategory>() {
            /* renamed from: a */
            public int compare(PodcastCategory podcastCategory, PodcastCategory podcastCategory2) {
                if (podcastCategory.lastPodcastItem == null || podcastCategory2.lastPodcastItem == null || podcastCategory.getLastItemPublishDate() == null || podcastCategory2.getLastItemPublishDate() == null) {
                    return 0;
                }
                return podcastCategory2.getLastItemPublishDate().compareTo(podcastCategory.getLastItemPublishDate());
            }
        });
        podcastInfo.synchronize();
        podcastInfo.save();
        return podcastInfo;
    }

    /* renamed from: g */
    private static String m29966g(String str) {
        char c = File.separatorChar;
        int codePointCount = str.codePointCount(0, str.length());
        StringBuilder sb = new StringBuilder(codePointCount);
        for (int i = 0; i < codePointCount; i++) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == c || Arrays.binarySearch(f21755a, codePointAt) > 0 || ((codePointAt == 46 && i == 0) || codePointAt == 95)) {
                sb.append('_');
                if (codePointAt < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(codePointAt));
            } else {
                sb.appendCodePoint(codePointAt);
            }
        }
        return sb.toString();
    }
}
