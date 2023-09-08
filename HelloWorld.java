import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HelloWorld{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello " + reader.readLine());

	}
}