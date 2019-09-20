import TrainPackage.Train;

import java.sql.Time;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Train train = new Train(0, new Date(2019,9,18), new Time(12,30,0), "Paris");
        System.out.println(train);
    }
}
