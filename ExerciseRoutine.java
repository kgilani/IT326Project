//extension of exercise class that defines the number of sets and reps (if weights) or time (if cardio)

public class ExerciseRoutine{
    private int sets;
    private int reps;
    private int minutes;
    private double distance;
  
    public ExerciseRoutine(Exercise exercises[], int sets, int reps, int minutes, double distance){
         this.sets = sets;
         this.reps = reps;
         this.minutes = minutes;
         this.distance = distance;
         //not really sure how to implement the exercises here.
          //my idea is to take an array of exercies and use some sort of method to organize them in this class by asking the user for order.
    }
}
