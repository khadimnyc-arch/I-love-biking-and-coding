import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Main");
    } 

    public void settings() {
        size(800, 600); // Canvas size
    }

    public void setup() {
        background(135, 206, 235); // Sky 

        // Road and Grass
        fill(80, 180, 90);    
        noStroke();
        rect(0, 500, 800, 100);  
        fill(50);              
        rect(0, 470, 800, 30); 

        // Sun
        fill(255, 235, 90);
        ellipse(700, 80, 120, 120);

        // Bike Wheels
        stroke(0);
        strokeWeight(4);
        fill(255);
        ellipse(320, 420, 80, 80);
        ellipse(480, 420, 80, 80); 
        fill(170);
        noStroke();
        ellipse(320, 420, 20, 20);
        ellipse(480, 420, 20, 20);

        // Bike Frame
        stroke(220, 20, 60); 
        strokeWeight(6);
        line(320, 420, 370, 340); 
        line(370, 340, 370, 420); 
        line(320, 420, 370, 420); 
        line(370, 340, 470, 340);
        line(370, 420, 470, 420); 
        line(470, 340, 470, 420); 

        //handles
        stroke(60);
        strokeWeight(4);
        line(470, 340, 470, 315);
        line(470, 315, 510, 315);

        // Seat
        stroke(60);
        strokeWeight(4);
        line(370, 340, 360, 320);
        fill(80);
        ellipse(360, 320, 24, 10);

        // Pedals
        stroke(60);
        strokeWeight(3);
        ellipse(420, 420, 16, 16);
        line(420, 420, 430, 435);   
    }
}

