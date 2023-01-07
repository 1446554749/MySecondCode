package com.liming;

import com.liming.testlogback.Main;

public class Application {
    public static void main(String[] args) {
        Main.main(args);
        com.liming.testlog4j.Main.main(args);
        com.liming.testlog4j2.Main.main(args);
    }

}
