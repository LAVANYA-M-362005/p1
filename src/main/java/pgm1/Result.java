package pgm1;

public class Result {
	
	public static String display(int m) {
		if(m<0 || m>100) {
			return "invalid";
		}
		else if(m>30 || m<100) {
			return "pass";
		}
		else {
			return "fail";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(display(89));
	}

}
