public class Question7{
    public static void main(String args[]){
        try{
            int result=9/0;
        }
        catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}




