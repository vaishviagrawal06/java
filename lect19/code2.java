import java.io.*;
class hello{
    public static void main(String[] args) {
        createData();
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
    static void createData(){
        try {
           FileWriter writer = new FileWriter("index.html");
           writer.write("hello ");
           writer.close(); 
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
