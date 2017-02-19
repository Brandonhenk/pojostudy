package edu.jalc.rectangle;
import edu.jalc.rectangle.height.Height;
import edu.jalc.rectangle.width.Width;

class Rectangle{

  private Width width;
  private Height height;
  private final String color; //just to practice accesors

  private Rectangle(){
    this.width = null;
    this.height = null;
    this.color = "black";
  }

  public Rectangle(Width width, Height height, String color){
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
  Width setWidth(Width width){
    this.width = width;
    return this.width;
  }
  Height setHeight(Height height){
    this.height = height;
    return this.height;
  }


}
