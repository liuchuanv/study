
public class Test{
	public static void main(String[] args){
		// testBitCalc();
		testInitArray();
		// testSubString();
		// testEquals();
		// testConstantPool();
	}
	
	static void testConstantPool(){
		int i1 = 1;
		int i2 = 1;
		System.out.println(i1==i2);			//true
		
		int i3 = 128;
		int i4 = 128;
		System.out.println(i3==i4);			//true
		
		Integer int1 = 1;
		Integer int2 = 1;
		System.out.println(int1==int2);		//true
		
		Integer int3 = 128;
		Integer int4 = 128;
		System.out.println(int3==int4);		//false
	}
	//equals比较的是值，==比较的是引用地址
	static void testEquals(){
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1.equals(str2));	//true
		System.out.println(str1==str2);			//true
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3.equals(str4));	//true
		System.out.println(str3==str4);			//false
	}
	
	//String.substring(fromIndex, endIndex)的范围是 [)
	static void testSubString(){
		String str = "yishanggu";
		String smallStr = str.substring(1, 4);	//[)
		System.out.println(smallStr);
	}
	//初始化数组
	static void testInitArray(){
		//静态初始化，在声明时同时分配空间并赋值
		int[] arr11 = new int[]{1,3,6};
		int[] arr12 = {2,4,6};
		System.out.println("--静态初始化--");
		for(int i=0; i<arr11.length; i++){
			System.out.print(arr11[i] + " ");
		}
		
		//动态初始化，数组声明和分配空间、赋值分开操作
		int[] arr13;
		arr13 = new int[3]{1,3,9};
		System.out.println("\n--动态初始化--");
		for(int i=0; i<arr13.length; i++){
			System.out.print(arr13[i] + " ");
		}
		
		//默认(隐式)初始化
		int[] arr14 = new int[5];
		System.out.println("\n--默认(隐式)初始化--");
		for(int i=0; i<arr14.length; i++){
			System.out.print(arr14[i] + " ");
		}
		
		//二维数组
		int[][] arr3 = new int[2][];
		// int[][] arr3 = new int[][];	//错误
		arr3[0] = new int[]{2,0,8};
		arr3[1] = new int[]{1,4,7};
		System.out.println("\n--二维数组--");
		for(int i=0; i<arr3.length; i++){
			for(int j=0; j<arr3[i].length; j++){
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	//测试位运算的结果,返回的数据类型的int
	static void testBitCalc(){
		int i=1;
		System.out.println(i&1);
	}
	//string.contains(CharSequence s);
	//CharSequence是一个接口，它的实现类有String、StringBuilder、StringBuffer
	public static void testStringContains(){
		String str = "abcdefg";
		if(str.contains("abc")){
			System.out.println("包含abc");
		}
	}
}