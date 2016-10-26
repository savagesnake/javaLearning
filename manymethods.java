class manymethods{
  // only method in this class can use private variable
  private String girlName;

  public manymethods(String name){
    girlName = name;
  }

  public void setName(String name){
    girlName = name;
  }

  public String getName(){
    return girlName;
  }

  public void saying(){
    System.out.printf("Yout first girlfriend was %s", getName());
  }

}
