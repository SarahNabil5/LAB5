public class TallyCounter {
private int value;

public TallyCounter()
{
    value=0;
}
    public int getValue() {
        return value;
    }

    public void click () {
        value = value+1;
    }
    public void unclick() {
        value = value-1;
    }

    public void reset() {
        value = 0;
    }
    public void setLimit(int maximum){
        maximum=10;
    }
    public void  undo(){
    if(value>0)
    value=value;
    }

}
