package org.practice;

import java.util.Comparator;

/**
 * This is a functional interface and can therefore be used as the assignment target for
 * a lambda expression or method reference.
 * <p>
 * A comparison function, which imposes a total ordering on some collection of objects.
 * Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort)
 * to allow precise control over the sort order. Comparators can also be used to control the order of
 * certain data structures (such as sorted sets or sorted maps), or to provide an ordering for collections
 * of objects that don't have a natural ordering.
 */

public class LambdaComparator {

    public void oldWayOfDoing() {

        Comparator<String> myComp = new Comparator<String>() {
            public int compare(String o1, String o2) {
                //TODO- Give comparison logic here
                return Integer.compare(o1.length(), o2.length());
            }
        };
    }

    public void newWayOfDoing() {
        Comparator<String> myComp = (String o1, String o2) -> {
            return Integer.compare(o1.length(), o2.length());
        };

    }

    public void anotherNewWayOfDoing() {
        Comparator<String> myComp = (o1, o2) -> {
            return Integer.compare(o1.length(), o2.length());
        };

    }
}
