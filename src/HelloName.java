import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloName {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello... ?");
		//String name = System.console().readLine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("name: ");
		String name = br.readLine();
		System.out.println("Hello, " + name);
	}

}
