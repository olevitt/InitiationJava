package TrainPackage;

import java.sql.Time;
import java.util.Date;

public class Train {
    public Train(int id, Date departureDate, Time departureTime, String direction) {
        this.id = id;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.direction = direction;
    }

    private int id;
    private Date departureDate;
    private Time departureTime;
    private String direction;

    @Override
    public String toString() {
        return "Le train "+getId()+" en direction de "+getDirection()+" partira à "+ getDepartureDate();
    }

    public int getId() {
        return id;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
