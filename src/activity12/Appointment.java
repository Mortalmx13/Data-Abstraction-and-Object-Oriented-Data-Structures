package activity12;
//3750
public class Appointment extends KeyedItem<Date> {
    private String description;

    public Appointment(Date date, String description) {
        super(date);
        this.description = description;
    }
   
    @Override
    public String toString() {
        return this.getKey() + ": " + this.description;
    }
}
