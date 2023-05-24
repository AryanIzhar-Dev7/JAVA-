import java.util.Scanner;
class UnknownOperatorException extends  Exception{
    UnknownOperatorException(String error){
        super(error);
    }


 static void check(String x) throws UnknownOperatorException {
        //System.out.println("");

    if (x.charAt(0)=='+' || x.charAt(0)=='-' || x.charAt(0)=='*' || x.charAt(0)=='/'){

    }
    else{     throw new UnknownOperatorException("Unknown Operator found ");}



}}
public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        String cont=" ";

        String opr="";
        int input=0;

        double result = 0;

        do {
            System.out.println("Enter a Operation from +, -, *, / : ");
           try {
               opr = scanner.next();
               UnknownOperatorException.check(opr);

           }
                catch (UnknownOperatorException e) {
               e.printStackTrace();

                    System.out.println("Enter a Operation from +, -, *, / : ");
                   opr = scanner.next();
                }

           System.out.println("Enter the number :" );
           input= scanner.nextInt();

           if (opr.charAt(0)=='+'){
               result+=input;
               System.out.println("Result :"+result);
           }

           else  if (opr.charAt(0)=='-'){
               result-=input;
               System.out.println("Result :"+result);
           }

           else  if (opr.charAt(0)=='*'){
               result*=input;
               System.out.println("Result :"+result);
           }

           else if (opr.charAt(0)=='/'){
               result/=input;
               System.out.println("Result :"+result);
           }



            System.out.println("Do you want to continue ? ");
           cont=scanner.next();


        } while (cont.charAt(0)=='Y'||cont.charAt(0)=='y');

    }
}
