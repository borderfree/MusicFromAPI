package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/* renamed from: nl.siegmann.epublib.domain.Date */
public class Date implements Serializable {
    private static final long serialVersionUID = 7533866830395120136L;
    private String dateString;
    private Event event;

    /* renamed from: nl.siegmann.epublib.domain.Date$Event */
    public enum Event {
        PUBLICATION("publication"),
        MODIFICATION("modification"),
        CREATION("creation");
        
        private final String value;

        private Event(String str) {
            this.value = str;
        }

        public static Event fromValue(String str) {
            Event[] values;
            for (Event event : values()) {
                if (event.value.equals(str)) {
                    return event;
                }
            }
            return null;
        }

        public String toString() {
            return this.value;
        }
    }

    public Date(String str) {
        this(str, (Event) null);
    }

    public Date(String str, String str2) {
        this(m32393a(str), Event.fromValue(str2));
        this.dateString = str;
    }

    public Date(String str, Event event2) {
        this.dateString = str;
        this.event = event2;
    }

    public Date(java.util.Date date) {
        this(date, (Event) null);
    }

    public Date(java.util.Date date, String str) {
        this(new SimpleDateFormat("yyyy-MM-dd").format(date), str);
    }

    public Date(java.util.Date date, Event event2) {
        this(new SimpleDateFormat("yyyy-MM-dd").format(date), event2);
    }

    /* renamed from: a */
    private static String m32393a(String str) {
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Cannot create a date from a blank string");
    }

    public Event getEvent() {
        return this.event;
    }

    public String getValue() {
        return this.dateString;
    }

    public void setEvent(Event event2) {
        this.event = event2;
    }

    public String toString() {
        if (this.event == null) {
            return this.dateString;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.event);
        sb.append(":");
        sb.append(this.dateString);
        return sb.toString();
    }
}
