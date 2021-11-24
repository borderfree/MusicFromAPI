package com.facebook.share.internal;

import com.facebook.internal.C2217f;

public enum OpenGraphActionDialogFeature implements C2217f {
    OG_ACTION_DIALOG(20130618);
    
    private int minVersion;

    private OpenGraphActionDialogFeature(int i) {
        this.minVersion = i;
    }

    public String getAction() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}
