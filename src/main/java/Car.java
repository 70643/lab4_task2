class Car {
    private int year, quantity, price;
    private String model, brand, color;

    public Car(String model, String brand, int year, int price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String newModel) {
        this.model = newModel;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int newPrice) {
        this.price = newPrice;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void delivery() {
        this.quantity++;
    }

    public void sell() {
        this.quantity--;
    }

    public String toString() {
        return "Car - Model: " + this.model + ", Brand: " + this.brand +
                ", Year: " + this.year + ", Price: " + this.price +
                ", Color: " + this.color + ", Quantity: " + this.quantity;
    }
}

class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Prius", "Toyota", 2024, 28000, "Silver", 15);

        System.out.println(myCar.toString());

        myCar.sell();

        System.out.println(myCar.getModel());
        System.out.println(myCar.getBrand());
        System.out.println(myCar.getYear());
        System.out.println(myCar.getPrice());
        System.out.println(myCar.getColor());
        System.out.println(myCar.getQuantity());

        myCar.setModel("Camry");
        myCar.setColor("Black");
        myCar.setPrice(29500);

        System.out.println(myCar.toString());
    }
}