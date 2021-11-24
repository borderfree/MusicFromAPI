package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: android.support.multidex.a */
public final class C0218a {

    /* renamed from: a */
    private static final Set<File> f670a = new HashSet();

    /* renamed from: b */
    private static final boolean f671b = m863a(System.getProperty("java.vm.version"));

    /* renamed from: android.support.multidex.a$a */
    private static final class C0219a {
        /* renamed from: a */
        private static Object[] m870a(Object obj, ArrayList<File> arrayList, File file) {
            return (Object[]) C0218a.m866b(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class}).invoke(obj, new Object[]{arrayList, file});
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m871b(ClassLoader classLoader, List<? extends File> list, File file) {
            Object obj = C0218a.m865b(classLoader, "pathList").get(classLoader);
            C0218a.m867b(obj, "dexElements", m870a(obj, new ArrayList<>(list), file));
        }
    }

    /* renamed from: android.support.multidex.a$b */
    private static final class C0220b {
        /* renamed from: a */
        private static Object[] m873a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            return (Object[]) C0218a.m866b(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m874b(ClassLoader classLoader, List<? extends File> list, File file) {
            IOException[] iOExceptionArr;
            Object obj = C0218a.m865b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C0218a.m867b(obj, "dexElements", m873a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                }
                Field a = C0218a.m865b(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
            }
        }
    }

    /* renamed from: android.support.multidex.a$c */
    private static final class C0221c {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m876b(ClassLoader classLoader, List<? extends File> list) {
            int size = list.size();
            Field a = C0218a.m865b(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) a.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(absolutePath);
                sb2.append(".dex");
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, sb2.toString(), 0);
            }
            a.set(classLoader, sb.toString());
            C0218a.m867b((Object) classLoader, "mPaths", (Object[]) strArr);
            C0218a.m867b((Object) classLoader, "mFiles", (Object[]) fileArr);
            C0218a.m867b((Object) classLoader, "mZips", (Object[]) zipFileArr);
            C0218a.m867b((Object) classLoader, "mDexs", (Object[]) dexFileArr);
        }
    }

    /* renamed from: a */
    private static File m855a(Context context, File file, String str) {
        File file2 = new File(file, "code_cache");
        try {
            m860a(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m860a(file2);
        }
        File file3 = new File(file2, str);
        m860a(file3);
        return file3;
    }

    /* renamed from: a */
    public static void m858a(Context context) {
        String str;
        String str2;
        Log.i("MultiDex", "Installing application");
        if (f671b) {
            str = "MultiDex";
            str2 = "VM has multidex support, MultiDex support library is disabled.";
        } else if (VERSION.SDK_INT >= 4) {
            try {
                ApplicationInfo b = m864b(context);
                if (b == null) {
                    Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                    return;
                }
                m859a(context, new File(b.sourceDir), new File(b.dataDir), "secondary-dexes", "");
                str = "MultiDex";
                str2 = "install done";
            } catch (Exception e) {
                Log.e("MultiDex", "MultiDex installation failure", e);
                StringBuilder sb = new StringBuilder();
                sb.append("MultiDex installation failed (");
                sb.append(e.getMessage());
                sb.append(").");
                throw new RuntimeException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MultiDex installation failed. SDK ");
            sb2.append(VERSION.SDK_INT);
            sb2.append(" is unsupported. Min SDK version is ");
            sb2.append(4);
            sb2.append(".");
            throw new RuntimeException(sb2.toString());
        }
        Log.i(str, str2);
    }

    /* renamed from: a */
    private static void m859a(Context context, File file, File file2, String str, String str2) {
        synchronized (f670a) {
            if (!f670a.contains(file)) {
                f670a.add(file);
                if (VERSION.SDK_INT > 20) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MultiDex is not guaranteed to work in SDK version ");
                    sb.append(VERSION.SDK_INT);
                    sb.append(": SDK version higher than ");
                    sb.append(20);
                    sb.append(" should be backed by ");
                    sb.append("runtime with built-in multidex capabilty but it's not the ");
                    sb.append("case here: java.vm.version=\"");
                    sb.append(System.getProperty("java.vm.version"));
                    sb.append("\"");
                    Log.w("MultiDex", sb.toString());
                }
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (classLoader == null) {
                        Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
                        return;
                    }
                    try {
                        m868c(context);
                    } catch (Throwable th) {
                        Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                    }
                    File a = m855a(context, file2, str);
                    m861a(classLoader, a, MultiDexExtractor.m847a(context, file, a, str2, false));
                } catch (RuntimeException e) {
                    Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m860a(File file) {
        String sb;
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to create dir ");
                sb2.append(file.getPath());
                sb2.append(". Parent file is null.");
                sb = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to create dir ");
                sb3.append(file.getPath());
                sb3.append(". parent file is a dir ");
                sb3.append(parentFile.isDirectory());
                sb3.append(", a file ");
                sb3.append(parentFile.isFile());
                sb3.append(", exists ");
                sb3.append(parentFile.exists());
                sb3.append(", readable ");
                sb3.append(parentFile.canRead());
                sb3.append(", writable ");
                sb3.append(parentFile.canWrite());
                sb = sb3.toString();
            }
            Log.e("MultiDex", sb);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Failed to create directory ");
            sb4.append(file.getPath());
            throw new IOException(sb4.toString());
        }
    }

    /* renamed from: a */
    private static void m861a(ClassLoader classLoader, File file, List<? extends File> list) {
        if (list.isEmpty()) {
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C0220b.m874b(classLoader, list, file);
        } else if (VERSION.SDK_INT >= 14) {
            C0219a.m871b(classLoader, list, file);
        } else {
            C0221c.m876b(classLoader, list);
        }
    }

    /* renamed from: a */
    static boolean m863a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        String str2 = "MultiDex";
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        Log.i(str2, sb.toString());
        return z;
    }

    /* renamed from: b */
    private static ApplicationInfo m864b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException e) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Field m865b(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchFieldException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Method m866b(Object obj, String str, Class<?>... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(clsArr));
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchMethodException(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m867b(Object obj, String str, Object[] objArr) {
        Field b = m865b(obj, str);
        Object[] objArr2 = (Object[]) b.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        b.set(obj, objArr3);
    }

    /* renamed from: c */
    private static void m868c(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            sb.append(").");
            Log.i("MultiDex", sb.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to list secondary dex dir content (");
                sb2.append(file.getPath());
                sb2.append(").");
                Log.w("MultiDex", sb2.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to delete old file ");
                sb3.append(file2.getPath());
                sb3.append(" of size ");
                sb3.append(file2.length());
                Log.i("MultiDex", sb3.toString());
                if (!file2.delete()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Failed to delete old file ");
                    sb4.append(file2.getPath());
                    Log.w("MultiDex", sb4.toString());
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Deleted old file ");
                    sb5.append(file2.getPath());
                    Log.i("MultiDex", sb5.toString());
                }
            }
            if (!file.delete()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Failed to delete secondary dex dir ");
                sb6.append(file.getPath());
                Log.w("MultiDex", sb6.toString());
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Deleted old secondary dex dir ");
                sb7.append(file.getPath());
                Log.i("MultiDex", sb7.toString());
            }
        }
    }
}
