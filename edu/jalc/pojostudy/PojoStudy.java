package edu.jalc.rectangle;

class Rectangle{

  private Width width;
  private Hight height;
  private final String color; //just to practice accesors

  private PojoStudy(){
    this.width = null;
    this.height = null;
    this.color = "black";
  }

  public PojoStudy(Width width, Height height, String color){
    this.setWidth(width);
    this.setHeight(height);
    this.color = color;
  }

  public Width getWidth(){
    return this.width;
  }
  public Height getHeight(){
    return this.height;
  }
  public String getColor(){
    return this.color;
  }

  //Mutators
  Width setWidth(width){
    this.width = width;
    return this.width;
  }
  Height setHeight(height){
    this.height = height;
    return this.height;
  }


}
