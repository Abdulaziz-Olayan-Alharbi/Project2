package Project_2;

public abstract class Passenger {
    private String name;
    private String ID;
    private Car reserved_car;
    private double trip_cost;

    public Passenger(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Car getReserved_car() {
        return reserved_car;
    }

    public double getTrip_cost() {
        return trip_cost;
    }

    public abstract void reserve (Car car);
    public abstract void display_information();

    public void setReserved_car(Car reserved_car) {
        this.reserved_car = reserved_car;
    }

    public void setTrip_cost(double trip_cost) {
        this.trip_cost = trip_cost;
    }
}
