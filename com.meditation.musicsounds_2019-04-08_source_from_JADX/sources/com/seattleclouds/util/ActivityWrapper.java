package com.seattleclouds.util;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.LoaderManager;
import android.app.PendingIntent;
import android.app.SharedElementCallback;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.support.p023v7.app.C0767e;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Toolbar;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

public class ActivityWrapper extends C0767e {

    /* renamed from: n */
    private Activity f23231n;

    public ActivityWrapper(Activity activity) {
        this.f23231n = activity;
    }

    /* renamed from: a */
    public void mo20311a(Activity activity) {
        this.f23231n = activity;
    }

    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        return this.f23231n.bindService(intent, serviceConnection, i);
    }

    public int checkCallingOrSelfPermission(String str) {
        return this.f23231n.checkCallingOrSelfPermission(str);
    }

    public int checkCallingOrSelfUriPermission(Uri uri, int i) {
        return this.f23231n.checkCallingOrSelfUriPermission(uri, i);
    }

    public int checkCallingPermission(String str) {
        return this.f23231n.checkCallingPermission(str);
    }

    public int checkCallingUriPermission(Uri uri, int i) {
        return this.f23231n.checkCallingUriPermission(uri, i);
    }

    public int checkPermission(String str, int i, int i2) {
        return this.f23231n.checkPermission(str, i, i2);
    }

    public int checkUriPermission(Uri uri, int i, int i2, int i3) {
        return this.f23231n.checkUriPermission(uri, i, i2, i3);
    }

    public int checkUriPermission(Uri uri, String str, String str2, int i, int i2, int i3) {
        return this.f23231n.checkUriPermission(uri, str, str2, i, i2, i3);
    }

    public void clearWallpaper() {
        this.f23231n.clearWallpaper();
    }

    public void closeContextMenu() {
        this.f23231n.closeContextMenu();
    }

    public void closeOptionsMenu() {
        this.f23231n.closeOptionsMenu();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return this.f23231n.createConfigurationContext(configuration);
    }

    public Context createDisplayContext(Display display) {
        return this.f23231n.createDisplayContext(display);
    }

    public Context createPackageContext(String str, int i) {
        return this.f23231n.createPackageContext(str, i);
    }

    public PendingIntent createPendingResult(int i, Intent intent, int i2) {
        return this.f23231n.createPendingResult(i, intent, i2);
    }

    public String[] databaseList() {
        return this.f23231n.databaseList();
    }

    public boolean deleteDatabase(String str) {
        return this.f23231n.deleteDatabase(str);
    }

    public boolean deleteFile(String str) {
        return this.f23231n.deleteFile(str);
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f23231n.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f23231n.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f23231n.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f23231n.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f23231n.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f23231n.dispatchTrackballEvent(motionEvent);
    }

    public void enforceCallingOrSelfPermission(String str, String str2) {
        this.f23231n.enforceCallingOrSelfPermission(str, str2);
    }

    public void enforceCallingOrSelfUriPermission(Uri uri, int i, String str) {
        this.f23231n.enforceCallingOrSelfUriPermission(uri, i, str);
    }

    public void enforceCallingPermission(String str, String str2) {
        this.f23231n.enforceCallingPermission(str, str2);
    }

    public void enforceCallingUriPermission(Uri uri, int i, String str) {
        this.f23231n.enforceCallingUriPermission(uri, i, str);
    }

    public void enforcePermission(String str, int i, int i2, String str2) {
        this.f23231n.enforcePermission(str, i, i2, str2);
    }

    public void enforceUriPermission(Uri uri, int i, int i2, int i3, String str) {
        this.f23231n.enforceUriPermission(uri, i, i2, i3, str);
    }

    public void enforceUriPermission(Uri uri, String str, String str2, int i, int i2, int i3, String str3) {
        this.f23231n.enforceUriPermission(uri, str, str2, i, i2, i3, str3);
    }

    public String[] fileList() {
        return this.f23231n.fileList();
    }

    public View findViewById(int i) {
        return this.f23231n.findViewById(i);
    }

    public void finish() {
        this.f23231n.finish();
    }

    public void finishActivity(int i) {
        this.f23231n.finishActivity(i);
    }

    public void finishActivityFromChild(Activity activity, int i) {
        this.f23231n.finishActivityFromChild(activity, i);
    }

    public void finishAffinity() {
        this.f23231n.finishAffinity();
    }

    public void finishAfterTransition() {
        this.f23231n.finishAfterTransition();
    }

    public void finishAndRemoveTask() {
        this.f23231n.finishAndRemoveTask();
    }

    public void finishFromChild(Activity activity) {
        this.f23231n.finishFromChild(activity);
    }

    public ActionBar getActionBar() {
        return this.f23231n.getActionBar();
    }

    public Context getApplicationContext() {
        return this.f23231n.getApplicationContext();
    }

    public ApplicationInfo getApplicationInfo() {
        return this.f23231n.getApplicationInfo();
    }

    public AssetManager getAssets() {
        return this.f23231n.getAssets();
    }

    public String getBasePackageName() {
        try {
            String str = (String) Context.class.getDeclaredMethod("getBasePackageName", new Class[0]).invoke(this.f23231n, new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("reflective getBasePackageName result: ");
            sb.append(str);
            Log.d("ActivityWrapper", sb.toString());
            return str;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            Log.e("ActivityWrapper", "reflective getBasePackageName exception", e);
            return null;
        }
    }

    public File getCacheDir() {
        return this.f23231n.getCacheDir();
    }

    public ComponentName getCallingActivity() {
        return this.f23231n.getCallingActivity();
    }

    public String getCallingPackage() {
        return this.f23231n.getCallingPackage();
    }

    public int getChangingConfigurations() {
        return this.f23231n.getChangingConfigurations();
    }

    public ClassLoader getClassLoader() {
        return this.f23231n.getClassLoader();
    }

    public File getCodeCacheDir() {
        return this.f23231n.getCodeCacheDir();
    }

    public ComponentName getComponentName() {
        return this.f23231n.getComponentName();
    }

    public ContentResolver getContentResolver() {
        return this.f23231n.getContentResolver();
    }

    public Scene getContentScene() {
        return this.f23231n.getContentScene();
    }

    public TransitionManager getContentTransitionManager() {
        return this.f23231n.getContentTransitionManager();
    }

    public View getCurrentFocus() {
        return this.f23231n.getCurrentFocus();
    }

    public File getDatabasePath(String str) {
        return this.f23231n.getDatabasePath(str);
    }

    public File getDir(String str, int i) {
        return this.f23231n.getDir(str, i);
    }

    public File getExternalCacheDir() {
        return this.f23231n.getExternalCacheDir();
    }

    public File[] getExternalCacheDirs() {
        return this.f23231n.getExternalCacheDirs();
    }

    public File getExternalFilesDir(String str) {
        return this.f23231n.getExternalFilesDir(str);
    }

    public File[] getExternalFilesDirs(String str) {
        return this.f23231n.getExternalFilesDirs(str);
    }

    public File[] getExternalMediaDirs() {
        return this.f23231n.getExternalMediaDirs();
    }

    public File getFileStreamPath(String str) {
        return this.f23231n.getFileStreamPath(str);
    }

    public File getFilesDir() {
        return this.f23231n.getFilesDir();
    }

    public FragmentManager getFragmentManager() {
        return this.f23231n.getFragmentManager();
    }

    public Intent getIntent() {
        return this.f23231n.getIntent();
    }

    public Object getLastNonConfigurationInstance() {
        return this.f23231n.getLastNonConfigurationInstance();
    }

    public LayoutInflater getLayoutInflater() {
        return this.f23231n.getLayoutInflater();
    }

    public LoaderManager getLoaderManager() {
        return this.f23231n.getLoaderManager();
    }

    public String getLocalClassName() {
        return this.f23231n.getLocalClassName();
    }

    public Looper getMainLooper() {
        return this.f23231n.getMainLooper();
    }

    public File getNoBackupFilesDir() {
        return this.f23231n.getNoBackupFilesDir();
    }

    public File getObbDir() {
        return this.f23231n.getObbDir();
    }

    public File[] getObbDirs() {
        return this.f23231n.getObbDirs();
    }

    public String getPackageCodePath() {
        return this.f23231n.getPackageCodePath();
    }

    public PackageManager getPackageManager() {
        return this.f23231n.getPackageManager();
    }

    public String getPackageName() {
        return this.f23231n.getPackageName();
    }

    public String getPackageResourcePath() {
        return this.f23231n.getPackageResourcePath();
    }

    public Intent getParentActivityIntent() {
        return this.f23231n.getParentActivityIntent();
    }

    public SharedPreferences getPreferences(int i) {
        return this.f23231n.getPreferences(i);
    }

    public Uri getReferrer() {
        return this.f23231n.getReferrer();
    }

    public int getRequestedOrientation() {
        return this.f23231n.getRequestedOrientation();
    }

    public Resources getResources() {
        return this.f23231n.getResources();
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        return this.f23231n.getSharedPreferences(str, i);
    }

    public Object getSystemService(String str) {
        return this.f23231n.getSystemService(str);
    }

    public int getTaskId() {
        return this.f23231n.getTaskId();
    }

    public Theme getTheme() {
        return this.f23231n.getTheme();
    }

    public Drawable getWallpaper() {
        return this.f23231n.getWallpaper();
    }

    public int getWallpaperDesiredMinimumHeight() {
        return this.f23231n.getWallpaperDesiredMinimumHeight();
    }

    public int getWallpaperDesiredMinimumWidth() {
        return this.f23231n.getWallpaperDesiredMinimumWidth();
    }

    public Window getWindow() {
        return this.f23231n.getWindow();
    }

    public WindowManager getWindowManager() {
        return this.f23231n.getWindowManager();
    }

    public void grantUriPermission(String str, Uri uri, int i) {
        this.f23231n.grantUriPermission(str, uri, i);
    }

    public boolean hasWindowFocus() {
        return this.f23231n.hasWindowFocus();
    }

    public boolean isChangingConfigurations() {
        return this.f23231n.isChangingConfigurations();
    }

    public boolean isDestroyed() {
        return this.f23231n.isDestroyed();
    }

    public boolean isFinishing() {
        return this.f23231n.isFinishing();
    }

    public boolean isImmersive() {
        return this.f23231n.isImmersive();
    }

    public boolean isRestricted() {
        return this.f23231n.isRestricted();
    }

    public boolean isTaskRoot() {
        return this.f23231n.isTaskRoot();
    }

    public boolean moveTaskToBack(boolean z) {
        return this.f23231n.moveTaskToBack(z);
    }

    public boolean navigateUpTo(Intent intent) {
        return this.f23231n.navigateUpTo(intent);
    }

    public boolean navigateUpToFromChild(Activity activity, Intent intent) {
        return this.f23231n.navigateUpToFromChild(activity, intent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f23231n.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f23231n.onActionModeStarted(actionMode);
    }

    public void onActivityReenter(int i, Intent intent) {
        this.f23231n.onActivityReenter(i, intent);
    }

    public void onAttachFragment(Fragment fragment) {
        this.f23231n.onAttachFragment(fragment);
    }

    public void onAttachedToWindow() {
        this.f23231n.onAttachedToWindow();
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return this.f23231n.onContextItemSelected(menuItem);
    }

    public void onContextMenuClosed(Menu menu) {
        this.f23231n.onContextMenuClosed(menu);
    }

    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        this.f23231n.onCreate(bundle, persistableBundle);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        this.f23231n.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public CharSequence onCreateDescription() {
        return this.f23231n.onCreateDescription();
    }

    public void onCreateNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        this.f23231n.onCreateNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f23231n.onCreateOptionsMenu(menu);
    }

    public View onCreatePanelView(int i) {
        return this.f23231n.onCreatePanelView(i);
    }

    public boolean onCreateThumbnail(Bitmap bitmap, Canvas canvas) {
        return this.f23231n.onCreateThumbnail(bitmap, canvas);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f23231n.onCreateView(view, str, context, attributeSet);
    }

    @SuppressLint({"MissingSuperCall"})
    public void onDetachedFromWindow() {
        this.f23231n.onDetachedFromWindow();
    }

    public void onEnterAnimationComplete() {
        this.f23231n.onEnterAnimationComplete();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return this.f23231n.onGenericMotionEvent(motionEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.f23231n.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return this.f23231n.onKeyMultiple(i, i2, keyEvent);
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        return this.f23231n.onKeyShortcut(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f23231n.onKeyUp(i, keyEvent);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f23231n.onMenuOpened(i, menu);
    }

    public boolean onNavigateUp() {
        return this.f23231n.onNavigateUp();
    }

    public boolean onNavigateUpFromChild(Activity activity) {
        return this.f23231n.onNavigateUpFromChild(activity);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.f23231n.onOptionsItemSelected(menuItem);
    }

    public void onOptionsMenuClosed(Menu menu) {
        this.f23231n.onOptionsMenuClosed(menu);
    }

    public void onPostCreate(Bundle bundle, PersistableBundle persistableBundle) {
        this.f23231n.onPostCreate(bundle, persistableBundle);
    }

    public void onPrepareNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        this.f23231n.onPrepareNavigateUpTaskStack(taskStackBuilder);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.f23231n.onPrepareOptionsMenu(menu);
    }

    public void onProvideAssistData(Bundle bundle) {
        this.f23231n.onProvideAssistData(bundle);
    }

    public void onRestoreInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        this.f23231n.onRestoreInstanceState(bundle, persistableBundle);
    }

    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        this.f23231n.onSaveInstanceState(bundle, persistableBundle);
    }

    public boolean onSearchRequested() {
        return this.f23231n.onSearchRequested();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f23231n.onTouchEvent(motionEvent);
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return this.f23231n.onTrackballEvent(motionEvent);
    }

    public void onTrimMemory(int i) {
        this.f23231n.onTrimMemory(i);
    }

    public void onUserInteraction() {
        this.f23231n.onUserInteraction();
    }

    public void onVisibleBehindCanceled() {
        this.f23231n.onVisibleBehindCanceled();
    }

    public void onWindowAttributesChanged(LayoutParams layoutParams) {
        this.f23231n.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f23231n.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(Callback callback) {
        return this.f23231n.onWindowStartingActionMode(callback);
    }

    public void openContextMenu(View view) {
        this.f23231n.openContextMenu(view);
    }

    public FileInputStream openFileInput(String str) {
        return this.f23231n.openFileInput(str);
    }

    public FileOutputStream openFileOutput(String str, int i) {
        return this.f23231n.openFileOutput(str, i);
    }

    public void openOptionsMenu() {
        this.f23231n.openOptionsMenu();
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        return this.f23231n.openOrCreateDatabase(str, i, cursorFactory);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return this.f23231n.openOrCreateDatabase(str, i, cursorFactory, databaseErrorHandler);
    }

    public void overridePendingTransition(int i, int i2) {
        this.f23231n.overridePendingTransition(i, i2);
    }

    public Drawable peekWallpaper() {
        return this.f23231n.peekWallpaper();
    }

    public void postponeEnterTransition() {
        this.f23231n.postponeEnterTransition();
    }

    public void recreate() {
        this.f23231n.recreate();
    }

    public void registerForContextMenu(View view) {
        this.f23231n.registerForContextMenu(view);
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return this.f23231n.registerReceiver(broadcastReceiver, intentFilter);
    }

    public Intent registerReceiver(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        return this.f23231n.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public boolean releaseInstance() {
        return this.f23231n.releaseInstance();
    }

    public void removeStickyBroadcast(Intent intent) {
        this.f23231n.removeStickyBroadcast(intent);
    }

    public void removeStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
        this.f23231n.removeStickyBroadcastAsUser(intent, userHandle);
    }

    public void reportFullyDrawn() {
        this.f23231n.reportFullyDrawn();
    }

    public boolean requestVisibleBehind(boolean z) {
        return this.f23231n.requestVisibleBehind(z);
    }

    public void revokeUriPermission(Uri uri, int i) {
        this.f23231n.revokeUriPermission(uri, i);
    }

    public void sendBroadcast(Intent intent) {
        this.f23231n.sendBroadcast(intent);
    }

    public void sendBroadcast(Intent intent, String str) {
        this.f23231n.sendBroadcast(intent, str);
    }

    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle) {
        this.f23231n.sendBroadcastAsUser(intent, userHandle);
    }

    public void sendBroadcastAsUser(Intent intent, UserHandle userHandle, String str) {
        this.f23231n.sendBroadcastAsUser(intent, userHandle, str);
    }

    public void sendOrderedBroadcast(Intent intent, String str) {
        this.f23231n.sendOrderedBroadcast(intent, str);
    }

    public void sendOrderedBroadcast(Intent intent, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        this.f23231n.sendOrderedBroadcast(intent, str, broadcastReceiver, handler, i, str2, bundle);
    }

    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, String str, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str2, Bundle bundle) {
        this.f23231n.sendOrderedBroadcastAsUser(intent, userHandle, str, broadcastReceiver, handler, i, str2, bundle);
    }

    public void sendStickyBroadcast(Intent intent) {
        this.f23231n.sendStickyBroadcast(intent);
    }

    public void sendStickyBroadcastAsUser(Intent intent, UserHandle userHandle) {
        this.f23231n.sendStickyBroadcastAsUser(intent, userHandle);
    }

    public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        this.f23231n.sendStickyOrderedBroadcast(intent, broadcastReceiver, handler, i, str, bundle);
    }

    public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle userHandle, BroadcastReceiver broadcastReceiver, Handler handler, int i, String str, Bundle bundle) {
        this.f23231n.sendStickyOrderedBroadcastAsUser(intent, userHandle, broadcastReceiver, handler, i, str, bundle);
    }

    public void setActionBar(Toolbar toolbar) {
        this.f23231n.setActionBar(toolbar);
    }

    public void setContentTransitionManager(TransitionManager transitionManager) {
        this.f23231n.setContentTransitionManager(transitionManager);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        this.f23231n.setEnterSharedElementCallback(sharedElementCallback);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        this.f23231n.setExitSharedElementCallback(sharedElementCallback);
    }

    public void setFinishOnTouchOutside(boolean z) {
        this.f23231n.setFinishOnTouchOutside(z);
    }

    public void setImmersive(boolean z) {
        this.f23231n.setImmersive(z);
    }

    public void setIntent(Intent intent) {
        this.f23231n.setIntent(intent);
    }

    public void setRequestedOrientation(int i) {
        this.f23231n.setRequestedOrientation(i);
    }

    public void setTaskDescription(TaskDescription taskDescription) {
        this.f23231n.setTaskDescription(taskDescription);
    }

    public void setTheme(int i) {
        this.f23231n.setTheme(i);
    }

    public void setTitle(int i) {
        this.f23231n.setTitle(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f23231n.setTitle(charSequence);
    }

    public void setTitleColor(int i) {
        this.f23231n.setTitleColor(i);
    }

    public void setVisible(boolean z) {
        this.f23231n.setVisible(z);
    }

    public void setWallpaper(Bitmap bitmap) {
        this.f23231n.setWallpaper(bitmap);
    }

    public void setWallpaper(InputStream inputStream) {
        this.f23231n.setWallpaper(inputStream);
    }

    public boolean shouldUpRecreateTask(Intent intent) {
        return this.f23231n.shouldUpRecreateTask(intent);
    }

    public ActionMode startActionMode(Callback callback) {
        return this.f23231n.startActionMode(callback);
    }

    public void startActivities(Intent[] intentArr) {
        this.f23231n.startActivities(intentArr);
    }

    public void startActivities(Intent[] intentArr, Bundle bundle) {
        this.f23231n.startActivities(intentArr, bundle);
    }

    public void startActivity(Intent intent) {
        this.f23231n.startActivity(intent);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        this.f23231n.startActivity(intent, bundle);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.f23231n.startActivityForResult(intent, i, bundle);
    }

    public void startActivityFromChild(Activity activity, Intent intent, int i) {
        this.f23231n.startActivityFromChild(activity, intent, i);
    }

    public void startActivityFromChild(Activity activity, Intent intent, int i, Bundle bundle) {
        this.f23231n.startActivityFromChild(activity, intent, i, bundle);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        this.f23231n.startActivityFromFragment(fragment, intent, i);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.f23231n.startActivityFromFragment(fragment, intent, i, bundle);
    }

    public boolean startActivityIfNeeded(Intent intent, int i) {
        return this.f23231n.startActivityIfNeeded(intent, i);
    }

    public boolean startActivityIfNeeded(Intent intent, int i, Bundle bundle) {
        return this.f23231n.startActivityIfNeeded(intent, i, bundle);
    }

    public boolean startInstrumentation(ComponentName componentName, String str, Bundle bundle) {
        return this.f23231n.startInstrumentation(componentName, str, bundle);
    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3) {
        this.f23231n.startIntentSender(intentSender, intent, i, i2, i3);
    }

    public void startIntentSender(IntentSender intentSender, Intent intent, int i, int i2, int i3, Bundle bundle) {
        this.f23231n.startIntentSender(intentSender, intent, i, i2, i3, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.f23231n.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.f23231n.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        this.f23231n.startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4);
    }

    public void startIntentSenderFromChild(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.f23231n.startIntentSenderFromChild(activity, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startLockTask() {
        this.f23231n.startLockTask();
    }

    public void startManagingCursor(Cursor cursor) {
        this.f23231n.startManagingCursor(cursor);
    }

    public boolean startNextMatchingActivity(Intent intent) {
        return this.f23231n.startNextMatchingActivity(intent);
    }

    public boolean startNextMatchingActivity(Intent intent, Bundle bundle) {
        return this.f23231n.startNextMatchingActivity(intent, bundle);
    }

    public void startPostponedEnterTransition() {
        this.f23231n.startPostponedEnterTransition();
    }

    public void startSearch(String str, boolean z, Bundle bundle, boolean z2) {
        this.f23231n.startSearch(str, z, bundle, z2);
    }

    public ComponentName startService(Intent intent) {
        return this.f23231n.startService(intent);
    }

    public void stopLockTask() {
        this.f23231n.stopLockTask();
    }

    public void stopManagingCursor(Cursor cursor) {
        this.f23231n.stopManagingCursor(cursor);
    }

    public boolean stopService(Intent intent) {
        return this.f23231n.stopService(intent);
    }

    public void takeKeyEvents(boolean z) {
        this.f23231n.takeKeyEvents(z);
    }

    public void triggerSearch(String str, Bundle bundle) {
        this.f23231n.triggerSearch(str, bundle);
    }

    public void unbindService(ServiceConnection serviceConnection) {
        this.f23231n.unbindService(serviceConnection);
    }

    public void unregisterForContextMenu(View view) {
        this.f23231n.unregisterForContextMenu(view);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        this.f23231n.unregisterReceiver(broadcastReceiver);
    }
}
