import java.util.Map;

/**
 * class to hold nutritional information
 */
public class Nutrition {
    int fat;
    int protein;
    int carbs;
    int calories;

    Map<String, Double> foodNutrition;

    public Nutrients (Map<String,Double> foodNutrition, int fat, int protein,
    int carbs, int calories) {
        this.foodNutrition = foodNutrition;
        this.fat = fat;
        this.protein = protein;
        this.carbs = carbs;
        this.calories = calories;
    }

    /**
     * gets the foodNutrients map
     * @return foodNutrients map
     */
    public Map<String, Double> getNutrition() {
        return foodNutrition;
    }
    public Nutrition getFat(){
        return fat;
    }
    public Nutrition getProtein(){
        return protein;
    }public Nutrition getCarbs(){
        return carbs;
    }
    public Nutrition getCalories(){
        return calories;
    }
}
