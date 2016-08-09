package classes;

public class Jinzhi{
	public static void main(String[] args){
		int i=97;
		String b = int2BinString(i);
		System.out.println( "bin=>" + b + " ? " + Integer.toBinaryString(i));
	}
	//移位
	public static String int2BinString(int i){
		int len = 32;
		char[] chars = new char[len];
		int endpos = chars.length;
		do{
			chars[--endpos] = (i&1)==1?'1':'0';
			i=i>>1;
		}while(i!=0);
		return new String(chars, endpos, len-endpos);
	}
	public static String toHexString(){
		return "";
	}
	
}