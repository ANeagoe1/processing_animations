public void setup(){
size(600,400);
}
public void draw(){
background(#46BF00);
fill(#D1C9C0); //green ground

noStroke();
fill(#F4A67C);              //lower orange sky
rect(0,0,width,2*height/3);

fill(#42AAFF);            //upper bluesky
rect(0,0,650,50);

fill(#000000);              //cloud
rect(0,100,300,50);



}
