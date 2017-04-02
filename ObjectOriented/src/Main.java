//This Program is about a Water Bottle
public class Main {
    public static void main(String[] args) {
        objectIntro bottle = new objectIntro(0);
        
        bottle.addWater(100);
        bottle.drinkWater(30);
        System.out.println("Your remaining water lvl is: "+bottle.getWater());
    }    
}
