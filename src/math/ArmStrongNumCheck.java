package math;

public class ArmStrongNumCheck {
	
	public static void main(String[] args) {
		
		int num=153;  //1+125+27
		int rem = 0;
		int cube=0;
		int temp=num;
		
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			cube=cube+(rem*rem*rem);
		}
		if(cube==temp) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not Amstrong number");
		}
		
	}

}
