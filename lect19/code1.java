import java.io.*;
class hello{
    public static void main(String[] args) {
        
        try{
            File file = new File("index.html");
            if(file.createNewFile()){
                System.out.println("done "+ " " +  file.getName());
            }
            else{
                System.out.println("already exist");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
