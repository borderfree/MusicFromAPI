package com.facebook.share.internal;

import com.facebook.internal.C2217f;

public enum CameraEffectFeature implements C2217f {
    SHARE_CAMERA_EFFECT(20170417);
    
    private int minVersion;

    private CameraEffectFeature(int i) {
        this.minVersion = i;
    }

    public String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}
