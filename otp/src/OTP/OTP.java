package OTP;

public class OTP {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(OtP(new int[] {4,3,6,5,1,8,8}));
       
	}
	static  int OtP(int input[]) {
		int otp=0;
		String s2="";
		for(int i=0;i<input.length;i++) {
			if(i%2!=0) {
				String s=Integer.toString((int) Math.pow(input[i],2));
				s2=s2+s;
			}
		}
	
		if(s2.length()>4) {
			s2=s2.substring(0,4);
			otp=Integer.parseInt(s2);
		}
		return otp;
		
	}



}
