public class hw1_follwoing {
    private int clicked ;



    public void click(){
        clicked++;
}
    public void reset(){
        this.clicked=0;

}
    public int display(){
        return clicked;

}
    public void undo(){
     clicked=Math.max(clicked,0);
}






    }



