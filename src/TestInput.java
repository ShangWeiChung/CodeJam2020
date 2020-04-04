import java.util.Arrays;
import java.util.Scanner;

public class TestInput {
	public static void main(String[] args) {
		StringBuffer abc = new StringBuffer();
		
		Scanner sc = new Scanner(System.in);
		int caseNum = Integer.parseInt(sc.nextLine());
		String intString;
		for(int i = 0; i < caseNum; i ++) {
			intString = sc.nextLine();
			
			abc.append(i+"-->"+intString+"\n");
		}
		System.out.println("output:");
		System.out.println(abc.toString());
		
		sc.close();
	}
}
