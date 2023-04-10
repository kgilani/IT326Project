//exercise class contains methods and variables that are needed for individual exercises
public class Exercise implements Cloneable{
  
  private String name;
  private String description;
  private int caloriesToBurn;
  private boolean isFinished;
  private boolean isCardio;
  
  public Exercise(String name, String description, int caloriesToBurn, boolean isCardio){
    this.name = name;
    this.description = description;
    this.caloriesToBurn = caloriesToBurn;
    this.isCardio = isCardio;
    isFinished = false;
  }
  
  public Object clone(){
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }
  
  public void finishExercise(){
    isFinished = true;
  }
  
  public void startExercise(){
    isFinished = false;
  }
  
  public int getCalories(){
    return caloriesToBurn;
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
