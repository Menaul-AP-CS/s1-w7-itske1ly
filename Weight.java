public class Weight {
    private int grams;
    private int kilograms;
    


//constructor
public Weight(int g){
    
    if(g > 0 && g < 999){
        grams = g;
    } 
    else if (g < 0)
    {

    }
    else if (g > 999)
    {
        
    }
}
public Weight(int kg ,int g){
    if (kg > 0 ) {
        kilograms = kg;
    }
    if(g > 0 && g < 999){
        grams = g;
    }
    else if (g < 0)
    {
        grams = 0;
    }
    else if (g > 999)
    {
        grams = 999;
    }
    else if (kg < 0) {
        kilograms = 0;
    }
}
public boolean isHeavier(int anotherWeight) {
    return anotherWeight.compareTo(Weight);
}
public boolean isDivisible(int n)
 if (weight % n ==0){
    return true;
 } else{
    return false;
 }
}