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
//        Phone p=()->{System.out.println("Calling");};
//            p.call();
//        Phone p=()->System.out.println("Calling");
//        p.call();

//        Phone p=(int no)->System.out.println("Calling "+no);
//        p.call(45454);

//        Phone p=(no)->System.out.println("Calling "+no);
//        p.call(45454);

        Phone p=no->System.out.println("Calling "+no);
        p.call(45454);
    }

}
