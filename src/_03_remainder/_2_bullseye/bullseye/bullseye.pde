
void setup() {
 
  // set the size of your sketch
size(900,890);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
for(int i = 900; i>100; i-=100){  
  
  //Use an if statement and remainder to alternate the color of your rings.
if(i % 200 == 0){
fill(0,0,255);
}
else{
fill(0,255,150);
}
ellipse(450,450,i,i);
}
}
