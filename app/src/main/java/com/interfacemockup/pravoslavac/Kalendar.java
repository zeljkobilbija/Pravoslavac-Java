package com.interfacemockup.pravoslavac;

import java.util.Calendar;
import java.util.Date;

public class Kalendar {
    Calendar kla = Calendar.getInstance();
    
    
    boolean redniDAnUGodini() {
        boolean lenient = kla.isLenient();
        Date danas = new Date();

        return lenient;
    }


}
