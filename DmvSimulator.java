import java.util.Random;
public class DmvSimulator{
    public static void main(String[] args) {
        boolean x = true;
        System.out.println("Welcome to CT DMV! We will provide you with a random queue number now! :");
        Random rand = new Random();
        int queueNo = rand.nextInt(200);
        int userQ = queueNo;
        System.out.println("Your queue no is: " + userQ + ". Please wait until your Queue number is called out!");
        int queueStart = queueNo + 1;
        while(x){
            System.out.println("Current Queue number: " + queueStart ++);
            if (queueStart > 200){
                queueStart = 1;
            }
            if (queueStart == userQ){
                System.out.println("Its your turn!");
                x = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("error");
            }

        }
        System.out.println("PLEASE LEAVE, YOU DO NOT HAVE THE REQUIRED PAPERWORK!");
    }

}