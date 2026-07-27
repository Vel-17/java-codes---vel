abstract class payment{
    protected double amount;
    payment (double amount){
        this.amount=amount;
    }
        abstract void pay();
        void receipt(){
            System.out.println("Receipt generated");
            System.out.println("Amount paid:$"+amount);
        }
        void showpaymentstatus(){
            System.out.println("payment sucessful");
        }
    }
    class upipayment extends payment{
        private String upiid;
        upipayment(double amount,String upiid){
            super(amount);
            this.upiid=upiid;
        }
    
    void pay(){
        System.out.println("Processing upipayment");
        System.out.println("upiid:"+upiid);
    }
    }
    class cardpayment extends payment{
        private String cardnumber;
        cardpayment(double amount,String upiid){
            super(amount);
            this.cardnumber=cardnumber;
        }
        void pay(){
            System.out.println("processing card payment...");
            System.out.println("cardnumber:* * **");
            
        }
    }
    public class Main{
        public static void main(String[]args){
            payment p1=new upipayment(750.75,"Vel @123");
            payment p2=new cardpayment(1850.90,"1234567812345678");
            p1.pay();
            p1.receipt();
            p1.showpaymentstatus();
            System.out.println();
            p2.pay();
            p2.receipt();
            p2.showpaymentstatus();
            
        }
    }
