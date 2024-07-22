package Project_2;


public class Non_subscribers_passengers extends Passenger{


    public static void capacity_limit(Car car) throws Exception{
        if (car.getMax_capacity()<=0){
            throw new Exception("The car "+car.getCode()+" in its max capacity , can not reserve");
        }
    }




    private boolean discount_coupon;
    public Non_subscribers_passengers(String name, String id, boolean discount_coupon) {
        super(name,id);
        this.discount_coupon = discount_coupon;
    }

    public boolean isDiscount_coupon() {
        return discount_coupon;
    }

    public void setDiscount_coupon(boolean discount_coupon) {
        this.discount_coupon = discount_coupon;
    }


    @Override
    public void reserve(Car car) {
        try {
            capacity_limit(car);
            this.setReserved_car(car);
            if (discount_coupon) {
                this.setTrip_cost(car.getRoute().getTrip_price() - (car.getRoute().getTrip_price()*0.1));
            } else {
                this.setTrip_cost(car.getRoute().getTrip_price());
            }
            car.setMax_capacity(car.getMax_capacity() - 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

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
