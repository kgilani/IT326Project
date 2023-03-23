//exercise class contains methods and variables that are needed for individual exercises
public class Exercise {
  
  private String name;
  private String description;
  private int caloriesToBurn;
  private int sets;
  private int repititions;
  private boolean isFinished;
  
  public Exercise(String name, String description, int calriesToBurn, int sets, int repitions){
    this.name = name;
    this.description = description;
    this.calriesToBurn = calriesToBurn;
    this.sets = sets;
    this.repititions = repititions;
    isFinished = false;
  }
  
  public void finishExercise(){
    isFinished = true;
  }
  
  public void startExercise(){
    isFinished = false;
  }
  
  public int getCalories(){
    return calriesToBurn;
  }
  public int getSets(){
     return sets;
  }
  public int getReps(){
     return repitions;
  }
  public boolean isFinished(){
    return isFinished;
  }
  public String getName(){
    return name;
  }
  public String getDesc(){
    return description;
  }
}
