public class Question4{
    public static void main(String[] args){
        System.out.println("Print the odd numbers from 1 to 20:");
        for (int i=1; i<=20; i++){
            if(i%2==1){
                System.out.println(i);
                i++;
            }
        }
    }
}