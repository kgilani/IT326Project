//meal class contains methods and variables pertaining to an individual meal composed of ingredients
//extends ingredient and APIDelegator
public class meal{
    String name = "";
    String description = "";
    int totalCalories = "";
    String mealType = "";
    String dateToConsume = "";

    meal(String name, String description, int totalCalories, 
    String mealType, String dateToConsume){
        this.name = name;
        this.description = description;
        this.totalCalories = totalCalories;
        this.mealType = mealType;
        this.dateToConusme = dateToConsume;
    }
    public ingredient addingredient(){

    }
    public void deleteIngredient(){
        
    }
}
