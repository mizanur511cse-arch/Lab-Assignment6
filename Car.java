public class Car extends Vehicle {
    @Override
    public void startEngine(){
        System.out.println("Engine start with key");
    }
    @Override
    public void stopEngine(){
        System.out.println("Engine stop with key");
    }

    
}
