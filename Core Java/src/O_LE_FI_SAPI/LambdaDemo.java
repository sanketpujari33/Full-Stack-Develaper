package O_LE_FI_SAPI;
@FunctionalInterface
interface Phone
{
        void call(int n);
}
   /* class AndroidPhone implements Phone
    {
        @Override
        public void call(){
            System.out.println("Calling");
        }
    }

    */
public class LambdaDemo {
    public static void main(String[] args) {
     /*   Phone app = new AndroidPhone();
        app.call();

      */
        //Anonymous inner class
      /*
        Phone p=new Phone() {
            @Override
            public void call() {
                System.out.println("Calling");
            }
        };
        p.call();
       */
        // Lambda Expressions
//        Phone p=(n)->{System.out.println("Calling"+n);};
//            p.call(45454);
        Phone p=n->System.out.println("Calling"+n);
        p.call(45454);
    }

}
