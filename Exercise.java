//exercise class contains methods and variables that are needed for individual exercises
public class Exercise {
  
  private String name;
  private String description;
  private int caloriesToBurn;
  private boolean isFinished;
  private boolean isCardio;
  
  public Exercise(String name, String description, int calriesToBurn, boolean isCardio){
    this.name = name;
    this.description = description;
    this.calriesToBurn = calriesToBurn;
    this.isCardio = isCardio;
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
  public boolean isCardio(){
    return isCardio;
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
