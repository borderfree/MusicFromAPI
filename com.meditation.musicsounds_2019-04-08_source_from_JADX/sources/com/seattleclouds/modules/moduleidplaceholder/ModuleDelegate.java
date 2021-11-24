package com.seattleclouds.modules.moduleidplaceholder;

import android.content.Context;
import android.os.Bundle;
import com.seattleclouds.C5230aa;
import com.seattleclouds.C6675z;
import com.seattleclouds.FragmentInfo;

public class ModuleDelegate extends C6675z {
    public FragmentInfo getPageFragmentInfo(Context context, C5230aa aaVar) {
        Bundle bundle = new Bundle();
        bundle.putString("ARG_IMAGE_NAME", (String) aaVar.mo17201y().get("imageName"));
        bundle.putString("ARG_PAGE_TO_OPEN", (String) aaVar.mo17201y().get("pageToOpen"));
        bundle.putString("ARG_TEST_STRING", (String) aaVar.mo17201y().get("testString"));
        return new FragmentInfo(C5862a.class.getName(), bundle);
    }
}
