import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * A program Sketch.java that visually sketches a picture of a house on  grassy plain.
	 * @author: B. Zhang
   */
	
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
	  
	// Sky
    fill(52, 223, 235);
    rect(0, 0, 400,300);

	// House Body
		fill(240, 65, 65);
		rect(200, 175, 150, 125);
	
	// Chimney
		fill(91, 98, 110);
		rect(325, 110, 25, 60);
		
	// Roof Body
		fill(91, 98, 110);
		triangle(175, 175, 375, 175, 275, 100);

	// Sun
		fill(235, 222, 52);
		ellipse(25, 25, 100, 100);
  }
}