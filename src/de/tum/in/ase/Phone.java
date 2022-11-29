package de.tum.in.ase;

public class Phone {

    //TODO: Add nextPhoneId, id, brand, price, touchscreen attributes to the Phone class and implement the constructor with these attributes
    //TODO: Implement getter and setter methods for the attributes id, brand, price, touchscreen
    //TODO: Implement the toString method for the Phone class

    public static int nextPhoneId = -1;
    private final int id;
    private String brand;
    private double price;
    private boolean touchscreen;

    public Phone(String brand, double price, boolean touchscreen){
        setBrand(brand);
        setPrice(price);
        setTouchscreen(touchscreen);

        id = nextPhoneId+1;
        nextPhoneId = nextPhoneId+1;
    }

    public void setNextPhoneId(int nextPhoneId) {
        Phone.nextPhoneId = nextPhoneId;
    }

    public void setBrand(String brand) {
        if(brand == null){
            brand = "";
        }
        this.brand = brand;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getNextPhoneId() {
        return nextPhoneId;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
