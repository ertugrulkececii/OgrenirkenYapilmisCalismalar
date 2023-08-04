package day30_immutableClasses;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime time= LocalTime.now();
        System.out.println(time); //21:38:26.189207700

        System.out.println(time.getHour());

        System.out.println(time.getMinute());

        System.out.println(time.minusMinutes(1000)); //05:01:28.773169600

        System.out.println(time.minusHours(100));

        

    }
}
