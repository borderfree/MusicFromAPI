package com.google.android.vending.expansion.downloader;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.seattleclouds.C5451m.C5462k;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.google.android.vending.expansion.downloader.d */
public class C4831d {

    /* renamed from: a */
    public static Random f17386a = new Random(SystemClock.uptimeMillis());

    /* renamed from: b */
    private static final Pattern f17387b = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");

    /* renamed from: a */
    public static int m24149a(int i) {
        switch (i) {
            case 1:
                return C5462k.state_idle;
            case 2:
                return C5462k.state_fetching_url;
            case 3:
                return C5462k.state_connecting;
            case 4:
                return C5462k.state_downloading;
            case 5:
                return C5462k.state_completed;
            case 6:
                return C5462k.state_paused_network_unavailable;
            case 7:
                return C5462k.state_paused_by_request;
            case 8:
                return C5462k.state_paused_wifi_disabled;
            case 9:
                return C5462k.state_paused_wifi_unavailable;
            case 10:
                return C5462k.state_paused_wifi_disabled;
            case 11:
                return C5462k.state_paused_wifi_unavailable;
            case 12:
                return C5462k.state_paused_roaming;
            case 13:
                return C5462k.state_paused_network_setup_failure;
            case 14:
                return C5462k.state_paused_sdcard_unavailable;
            case 15:
                return C5462k.state_failed_unlicensed;
            case 16:
                return C5462k.state_failed_fetching_url;
            case 17:
                return C5462k.state_failed_sdcard_full;
            case 18:
                return C5462k.state_failed_cancelled;
            default:
                return C5462k.state_unknown;
        }
    }

    /* renamed from: a */
    public static long m24150a(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return ((long) statFs.getBlockSize()) * (((long) statFs.getAvailableBlocks()) - 4);
    }

    /* renamed from: a */
    public static File m24151a(String str) {
        File downloadCacheDirectory = Environment.getDownloadCacheDirectory();
        if (str.startsWith(downloadCacheDirectory.getPath())) {
            return downloadCacheDirectory;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (str.startsWith(externalStorageDirectory.getPath())) {
            return externalStorageDirectory;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot determine filesystem root for ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static String m24152a(long j) {
        return (j > 3600000 ? new SimpleDateFormat("HH:mm", Locale.getDefault()) : new SimpleDateFormat("mm:ss", Locale.getDefault())).format(new Date(j - ((long) TimeZone.getDefault().getRawOffset())));
    }

    /* renamed from: a */
    public static String m24153a(long j, long j2) {
        if (j2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%.2f", new Object[]{Float.valueOf(((float) j) / 1048576.0f)}));
        sb.append("MB /");
        sb.append(String.format("%.2f", new Object[]{Float.valueOf(((float) j2) / 1048576.0f)}));
        sb.append("MB");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m24154a(Context context) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        StringBuilder sb = new StringBuilder();
        sb.append(externalStorageDirectory.toString());
        sb.append(C4821a.f17371a);
        sb.append(context.getPackageName());
        return sb.toString();
    }

    /* renamed from: a */
    public static String m24155a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m24154a(context));
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m24156a() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    /* renamed from: a */
    public static boolean m24157a(Context context, String str, long j, boolean z) {
        File file = new File(m24155a(context, str));
        if (file.exists()) {
            if (file.length() == j) {
                return true;
            }
            if (z) {
                file.delete();
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m24158b(long j, long j2) {
        if (j2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString((j * 100) / j2));
        sb.append("%");
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m24159b(String str) {
        String replaceFirst = str.replaceFirst("/+", TableOfContents.DEFAULT_PATH_SEPARATOR);
        return replaceFirst.startsWith(Environment.getDownloadCacheDirectory().toString()) || replaceFirst.startsWith(Environment.getExternalStorageDirectory().toString());
    }
}
