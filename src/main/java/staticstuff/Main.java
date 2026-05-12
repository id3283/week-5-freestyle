package staticstuff;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    LocalTime timestamp = LocalTime.now();


    MyFactory myFactory = MyFactory.makeFactory();



}
