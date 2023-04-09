//Account information that is populated by the controller class for app instances

//We need to define how we want to format some of this information to store/retrieve from server.
public class Account {
    private int accountID;
    private String username;
    private String password;
    private Workout[] workouts;
    private MealPlan[] mealplans;
    private Goal[] goals;
}
