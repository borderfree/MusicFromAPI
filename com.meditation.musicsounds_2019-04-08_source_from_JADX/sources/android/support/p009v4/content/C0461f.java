package android.support.p009v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: android.support.v4.content.f */
public abstract class C0461f extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<WakeLock> f1388a = new SparseArray<>();

    /* renamed from: b */
    private static int f1389b = 1;

    /* renamed from: a */
    public static boolean m2105a(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f1388a) {
            WakeLock wakeLock = (WakeLock) f1388a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f1388a.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            Log.w("WakefulBroadcastReceiv.", sb.toString());
            return true;
        }
    }

    /* renamed from: a_ */
    public static ComponentName m2106a_(Context context, Intent intent) {
        synchronized (f1388a) {
            int i = f1389b;
            f1389b++;
            if (f1389b <= 0) {
                f1389b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append("wake:");
            sb.append(startService.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f1388a.put(i, newWakeLock);
            return startService;
        }
    }
}
