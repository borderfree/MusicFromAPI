package android.support.design.widget;

import android.support.p023v7.widget.C1095bt;
import android.support.p023v7.widget.C1116l;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: android.support.design.widget.p */
public class C0210p extends C1116l {
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof C1095bt) {
                    editorInfo.hintText = ((C1095bt) parent).getHint();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return onCreateInputConnection;
    }
}
