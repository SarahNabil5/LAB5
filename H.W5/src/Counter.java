
public class Counter {
    public static void main(String[] args) {


     TallyCounter tally = new TallyCounter( ) ;
        tally.reset();
        tally.click();
        tally.click();
        tally.click();
        int result =tally.getValue();
        System.out.println("result:"+result);
        tally.click();
         result =tally.getValue();
        tally.undo();
        tally.undo();
result=tally.getValue();
        System.out.println("result:"+result);


    }
}
