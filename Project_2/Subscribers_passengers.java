package Project_2;

public class Subscribers_passengers extends Passenger{

    public static void capacity_limit(Car car) throws Exception{
        if (car.getMax_capacity()<=0){
            throw new Exception("The car "+car.getCode()+" in its max capacity , can not reserve");
        }
    }


    public Subscribers_passengers (String name, String ID){
        super(name, ID);
    }

    @Override
    public void reserve(Car car) {
        try {
            capacity_limit(car);
            this.setReserved_car(car);
            this.setTrip_cost(car.getRoute().getTrip_price() * 0.5);
            car.setMax_capacity(car.getMax_capacity() - 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void display_information() {
        System.out.println("Passenger info { Name: "+this.getName() + " , ID : " + this.getID()+" }");
        if (this.getReserved_car() != null) {
            System.out.println("Reserved car code : " + this.getReserved_car().getCode());
            System.out.println("Trip cost : " + this.getTrip_cost());
        }else {
            System.out.println("There is no reserved car");
        }
        System.out.println("********************************************");
    }
}
