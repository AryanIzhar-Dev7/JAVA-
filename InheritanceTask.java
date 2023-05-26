

class Message{

    String text="Hello World";
   

    Message(){};
    Message(String text){
        this.text= text;
    }

    public String toString (){

        return this.text ;
    }

    void setText(String text){
        this.text= text;
    }

}

class SMS extends Message {
    double contactnumber=0;

//    void setContactnumber(double x){
//        this.contactnumber=x;
//    }

    SMS(String text){
        super(text);


    }
    void  setContactNumber (double x){
        this.contactnumber=x;
    }

    public String toString (){
        return contactnumber+text;

    }
}


class Email extends Message{

    String Sender;
    String Reciever;
    String subject;

    Email(String sender, String reciever, String subject,String text){
        super(text);
        this.subject=subject;
        this.Reciever= reciever;
        this.Sender= sender;
    }

    public String toString(){


        return Sender+Reciever+subject;
    }

}
public class InheritanceTask{
    public static void main(String[] args) {


        Message message = new Message();

        Email email = new Email("Aryan", "Aqib", "Phyics Final ", "Video milyo ya na ");

        SMS sms = new SMS("Hello jani shaa hall aa");
        sms.setContactNumber(234274);

        System.out.println("Printing the data of Email Class");
        System.out.println(email.toString());

        System.out.println("Printing the data of SMS Class");

        System.out.println(sms.toString());
  


    }
}