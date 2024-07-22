package Project_2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Route route_1 = new Route("Tuwaiq Academy","King Saud University",50);
        Route route_2 = new Route("King Fahad Stadium","Kingdom Arena",60);

        Car elentra = new Car("001",route_1,4);
        Car camry = new Car("002",route_2,0);


        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(new Subscribers_passengers("Abdulaziz","100"));
        passengers.add(new Non_subscribers_passengers("Muhammed","101",true));

        passengers.get(0).reserve(camry);
        passengers.get(1).reserve(elentra);

        for (Passenger p : passengers) {
            p.display_information();
        }




    }
}
