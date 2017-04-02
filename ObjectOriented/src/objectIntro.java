//This Program is about a water bottle

public class objectIntro {
    int qtd_water=0;
    
    //Default Constructor
    public objectIntro(){        
    }
    
    //Constructor for if u wanna have water already in ur bottle
    public objectIntro(int amount){
        qtd_water = amount;
    }
    
    public void addWater(int amount){
        qtd_water+= amount;
    }    
    public void drinkWater(int amount){
        qtd_water-=amount;
    }
    
    public int getWater(){
        return qtd_water;
    }
}
