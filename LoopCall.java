public class LoopCall{

    public static void main(String[] args){
       System.out.println("Hello from the " + "main mathod");
       for(int i=0;i<5;i++){
        displayMessage();
       }
    }

    public static void displayMessage(){
        System.out.println("Hello from" + " displayMessage");
    }

}