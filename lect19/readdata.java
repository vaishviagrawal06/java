import java.io.*;
class hello{
    public static void main(String[] args) {
        // createData();
        readFileData();
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
           FileWriter writer = new FileWriter("index.html",true);
           writer.write("\nhello");
           writer.close(); 
        } catch (Exception e) {
           System.out.println(e);
        }
    }

    static void readFileData(){
        try{
             FileReader reader = new FileReader("index.html");
        int ch;
        while((ch = reader.read())!=-1){
            System.out.print((char)ch);
        }
    }
        catch(Exception e){
            System.out.println(e);
        }
        }
       
    }

