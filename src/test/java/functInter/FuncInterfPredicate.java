package functInter;

import java.util.function.Predicate;

public class FuncInterfPredicate {
    //Lambda expression is an instance of Functional interface. They help
    //in implementing the FI

    //An FI is an interface with only one abstract method
    //Default methods do not count
    //regular static methods do not count
    //Methods from Object class do not count

    public static void oldWayOFDoingThings() {

        Predicate<String> p = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() < 20;
            }
        };
    }

    //with lambda
    public static void newWay() {

        Predicate<String> p2 = (s) -> s.length() > 20;

        System.out.println(p2.test("IshMishra"));
    }

    public static void main(String[] args) {

        newWay();
    }
}
