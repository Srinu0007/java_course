public class byteshortintlong{
	public static void main(String[] args){
		int myvalue = 10000;
		int myminintvalue = Integer.MIN_VALUE;
		int mymaxintvalue = Integer.MAX_VALUE;
		System.out.println("Integer max value = "+myminintvalue);
		System.out.println("Integer min value = "+mymaxintvalue);
		System.out.println("busted max value = " + (mymaxintvalue + 1));
		System.out.println("busted min value = " + (myminintvalue - 1));
		int mymaxinttest = 2_147_148_647;
		byte myminbytevalue = Byte.MIN_VALUE;
		byte mymaxbytevalue = Byte.MAX_VALUE;
		System.out.println("byte max value = " + (mymaxbytevalue + 1));
                System.out.println("byte min value = " + (myminbytevalue - 1));
                short myminshortvalue = Short.MIN_VALUE;
                short mymaxshortvalue = Short.MAX_VALUE;
                System.out.println("short max value = " + (mymaxshortvalue + 1));
                System.out.println("short min value = " + (myminshortvalue - 1));


	}}
		
