/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradlepracticeapp;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        CsvFileProcessor proc =new CsvFileProcessor();
        String inputPath = "D:\\aws\\in\\input.csv";
        String outPutPath = "D:\\aws\\out\\";
        CsvFileProcessor.createDevideFile(inputPath, outPutPath);
      
        
    }
}