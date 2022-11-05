public class hw2 {
    private int limit , y;
    public void setLimit( int x) {
       limit=x;
    }
    public void click() {

if(y==limit)
    y=limit;
    else y++;

    }

    public int getValue() {
        return y;
    }



    public void reset() {
         y=0;
    }







    }
