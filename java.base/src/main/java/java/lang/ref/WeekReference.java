package java.lang.ref;

import static java.lang.ref.Reference.week;

public class WeekReference<T> extends Reference<T> {
    WeekReference(T referent) {
        super(Reference.week(referent));
    }

    WeekReference(T referent, ReferenceQueue<? super T> queue) {
        super(Reference.week(referent), queue);
    }
}
