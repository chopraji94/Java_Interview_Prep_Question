public class CheckPrime {
    public static void main(String[] args) {
        int num = 7;

        for(int i=2;i<num/2;i++){
            if(num%i==0){
                System.out.println("This is not a prime number");
                break;
            }
        }
    }
}
