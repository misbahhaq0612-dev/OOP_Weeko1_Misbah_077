public class Main {
    public static void main(String[] args) {

        Car corolla = new Car();
        Car gWagon = new Car();

        System.out.println("=== Toyota Corolla ===");
        corolla.engineOn();
        corolla.drive();
        corolla.fast();
        corolla.slow();
        corolla.moveLeft(30);
        corolla.moveRight(15);
        corolla.engineStop();
        corolla.display();
        

        System.out.println("=== Mercedes G-Wagon ===");
        gWagon.engineOn();
        gWagon.drive();
        gWagon.moveRight(45);
        gWagon.moveLeft(90);
        gWagon.slow();
        gWagon.fast();
        gWagon.gTurn();
        gWagon.engineStop();
        gWagon.display();
       
       

         
        
    }
}