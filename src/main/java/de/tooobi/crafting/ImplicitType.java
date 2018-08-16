package de.tooobi.crafting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImplicitType {
    public static void main(String[] args) {
        testLoopWithImpliciType();

    }

    private static void testLoopWithImpliciType() {
        MyString aAsString=new MyString("");

        var a = new MyInt(1);
        aAsString=new MyString(a);


        List<String> names = Arrays.asList("Paul", "Clara", "Hans");

//        names.stream().map(var name -> name.isEmpty()).collect(Collectors.toList());;

        for (var name : names) {
            System.out.println("args = [" + name + "]");
        }

        System.out.print("adsad");
    }

    private static class MyInt {
        private int value;
        public MyInt(int value) {
            this.value=value;
        }
    }

    private static class MyString {
        private String value;
        public MyString(String value) {
            this.value=value;
        }

        public MyString(MyInt value) {
            this.value=""+value;
        }
    }
}
