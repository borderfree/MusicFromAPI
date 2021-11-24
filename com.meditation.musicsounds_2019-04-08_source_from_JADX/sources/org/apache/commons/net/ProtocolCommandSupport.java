package org.apache.commons.net;

import java.io.Serializable;
import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;

public class ProtocolCommandSupport implements Serializable {
    private static final long serialVersionUID = -8017692739988399978L;
    private final ListenerList __listeners = new ListenerList();
    private final Object __source;

    public ProtocolCommandSupport(Object obj) {
        this.__source = obj;
    }

    public void addProtocolCommandListener(C6733a aVar) {
        this.__listeners.addListener(aVar);
    }

    public void fireCommandSent(String str, String str2) {
        ProtocolCommandEvent protocolCommandEvent = new ProtocolCommandEvent(this.__source, str, str2);
        Iterator it = this.__listeners.iterator();
        while (it.hasNext()) {
            ((C6733a) ((EventListener) it.next())).mo21105a(protocolCommandEvent);
        }
    }

    public void fireReplyReceived(int i, String str) {
        ProtocolCommandEvent protocolCommandEvent = new ProtocolCommandEvent(this.__source, i, str);
        Iterator it = this.__listeners.iterator();
        while (it.hasNext()) {
            ((C6733a) ((EventListener) it.next())).mo21106b(protocolCommandEvent);
        }
    }

    public int getListenerCount() {
        return this.__listeners.getListenerCount();
    }

    public void removeProtocolCommandListener(C6733a aVar) {
        this.__listeners.removeListener(aVar);
    }
}
