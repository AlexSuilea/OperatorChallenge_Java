public class OperatorChallenge {
    public static void main(String[] args){
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myResult = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("myResult = " + myResult);
        double remainder = myResult % 40.00d;
        System.out.println("remainder = " + remainder);
        boolean isNoRemainder;

        /*if(remainder == 0){
            isNoRemainder = true;
        } else {
            isNoRemainder = false;
        }*/

        isNoRemainder = (remainder == 0) ? true : false;

        System.out.println(isNoRemainder);

        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
