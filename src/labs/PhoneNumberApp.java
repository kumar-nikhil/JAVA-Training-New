package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PhoneNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filename = "D:\\Java Workspace\\Java-Training\\phoneNumber.txt";
		File file = new File(filename);
		String phoneNum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNum =br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Could not Find the File");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try{
			//Phone number length exception (10 digits only)
			if(phoneNum.length() != 10){ throw new TenDigitException(phoneNum);}
			
			//Area code exception (not 0 or 9 in start)
			if(phoneNum.substring(0,1).equals("0") || phoneNum.substring(0,1).equals("9")){throw new AreaCodeException(phoneNum);}
			
			//Emergency Phone number Exception (no 911 substring)
			for(int i=0; i<=phoneNum.length()-2; i++){
				if(phoneNum.substring(i,i+1).equals("9")){
					if(phoneNum.substring(i+1,i+3).equals("11")){
						
							throw new EmergencyException(phoneNum);	
						
					}
					
				}
				
			}
			
			
			System.out.println(phoneNum);
		}catch (TenDigitException e )
		{	System.out.println("cannot have less than ten digits");
			System.out.println(e.toString()); 
		}catch (AreaCodeException e){
			System.out.println("Area Code cannot start with 0 or 9");
			System.out.println(e.toString()); 
			
		}catch (EmergencyException e){
			System.out.println("Cannot Have 911 as a sub string");
			System.out.println(e.toString());
			
		}
		
		
		
		
		

	}

}


class TenDigitException extends Exception{
	String num = null;
	TenDigitException(String num){
		this.num = num;
	}
	public String toString(){
		return "TendigitException: " + num;
	}
	
}

class AreaCodeException extends Exception{
	String num = null;
	
	AreaCodeException(String num){
		this.num = num;
	}
	public String toString(){
		return "Area Code Exception:" + num;
	}
}

class EmergencyException extends Exception{
	String num = null;
	EmergencyException(String num){
		this.num = num;
	}
	public String toString(){
		return "Emergency Exception: " + num;
	}
	
}