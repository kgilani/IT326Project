//meal class contains methods and variables pertaining to an individual meal composed of ingredients
//extends ingredient and APIDelegator
public class Meal{
    String name = "";
    String description = "";
    int totalCalories = "";
    String mealType = "";
    Date dateToConsume ;

    Meal(String name, String description, int totalCalories,
    String mealType, Date dateToConsume){
        this.name = name;
        this.description = description;
        this.totalCalories = totalCalories;
        this.mealType = mealType;
        this.dateToConusme = dateToConsume;
    }
    public Ingredient addingredient(){

    }
    public void deleteIngredient(){

    }
}
