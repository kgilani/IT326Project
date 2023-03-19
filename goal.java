//goal class contains individual goal information
public class Goal{
  protected boolean complete=false;
  protected String name="";
  protected String description="";
  
  public void toggleComplete(){
    if(complete){
      complete=false;
    }else{
      complete=true;
    }
  }
  
  public String getName(){
    return name;
  }
  
  public String getDescription(){
    return description;
  }
  
  public boolean isComplete(){
    return complete;
  }
}
  
  
