public class checkevenodd { 
    public static String checkevenoddString(int num) {
        if(num%2 == 0) {
            return num+ "is even"; 

        }
        else{
            return num+ " is odd"; 
        }
        
    }
    

public static void main(String[] args){
    System.out.println(checkevenoddString(7)); 
}
}
