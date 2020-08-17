package com.company;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        // basically , lambda expression is a way of passing code as an argument

        //simplified way of using a comparator
        Comparator<String> idComparator = (val1,val2) -> val1.compareTo(val2);
        String[] ids = {"bob","deji","pope"};
        Arrays.sort(ids,idComparator);
    }
}
