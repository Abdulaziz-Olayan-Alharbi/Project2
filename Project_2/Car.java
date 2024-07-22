package Project_2;

public class Car {
    private String code;
    private Route route;
    private int max_capacity;

    public Car(String code, Route route, int max_capacity) {
        this.code = code;
        this.route = route;
        this.max_capacity = max_capacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public void setMax_capacity(int max_capacity) {
        this.max_capacity = max_capacity;
    }

}
