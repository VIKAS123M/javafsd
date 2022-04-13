package java_sample;
import java.util.ArrayList;
import java.util.Scanner;
public class Al {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		int fll = 0;
		ArrayList<String> filena = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter operation, 1: Add file name, 2: Search for file, 3: Delete file");
		int operation = sc.nextInt();
		switch(operation) {
		
		case 1:
			System.out.println("Enter Filename to be added");
			String fina = sc.next();
			filena.add(fina);
			System.out.println("File added");
			break;
			
		case 2:
			System.out.println("Enter file name to be searched");
			String sefi = sc.next();
			for(int i = 0; i<filena.size();i++) {
				if(sefi == filena.get(i)) {
					System.out.println("File found at:"+i);
					flag = flag + 1;
					break;
	
				}
			}
				
			if(flag == 1)
			{
				System.out.println("Ok");
			}
			else {
					System.out.println("Not found");
				}
			break;
		
		case 3:
			System.out.println("Enter File name to be deleted");
			String delf = sc.next();
			for(int i = 0; i < filena.size();i++) {
				if(delf == filena.get(i)) {
					filena.remove(i);
					fll = fll + 1;
					System.out.println("File removed successfully");
					break;
				}
			}
			if(fll == 1)
			{
				System.out.println("Ok");
			}
				else {
					System.out.println("File is not present in the database!");
				}
		break;	
		
		default:
			System.out.println("Have a good day!");
		}
		sc.close();	
		}

	}


