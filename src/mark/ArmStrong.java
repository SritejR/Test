package mark;

public class ArmStrong {

	public static void main(String[] args) {
		
		int num=153;
		int temp=num;
		int rem=0;
		int cube=0;
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			cube=cube+(rem*rem*rem);
		}
		if(temp==cube) {
			System.out.println("Arm strong Number");
		}else {
			System.out.println("Not Arm strong number");
		}
	}

}
