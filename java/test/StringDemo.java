
public class StringDemo{
	public static void main(String[] args){	
		// testIndexOf();
		// testBase();
		testReplaceAll();
	}
	static void testReplaceAll(){
		String str = "1.http://www.baidu.com,2.http://www.taobao.com,3.http://www.qq.com";
		String newStr = str.replaceAll("\\d", "num");
		System.out.println("替换后的字符串:" + newStr);
		
		String[] arr = str.split(",",2);
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	static void testIndexOf(){
		String str = "huaxia";
		int pos = str.indexOf("a",2);	//[
		System.out.println("a在" + str + "中的位置:" + pos);
		
		int pos2 = str.indexOf("ax");
		System.out.println("ax在" + str + "中的位置:" + pos2);
		
		int pos3 = str.lastIndexOf("a",5);	//从4的位置倒序搜索[
		System.out.println("a在" + str + "中最后的位置:" + pos3);
	}
	static void testBase(){
		char[] chars = new char[]{'h','u','a','x','i','a','m','i','n','z','u'};
		String str = new String(chars, 0, 6);	//new String(chars, startIndex, length);
		System.out.println("字符串:" + str);
		
		String subStr = str.substring(2, 5);
		System.out.println("子字符串:" + subStr);
		
		char c = str.charAt(2);
		System.out.println(str + "中索引为2的字符:" + c);
		
	}
}