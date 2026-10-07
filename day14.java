//Object in java

// Class = Blueprint.
// Object = uss Blueprint se banna real object.

//Real-life Example:

class Car{
    String color;
    int Speed;
}

class FirstCar{
    public static void main(String ar[]){
        Car c1 = new Car();
        c1.color= "Red";
        c1.Speed = 100;
        System.out.println(c1.color);
        System.out.println(c1.Speed);
    }
}
