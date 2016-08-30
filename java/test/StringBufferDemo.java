
public class StringBufferDemo{
	public static void main(String[] args){
		
		//当创建StringBuffer对象时，系统为对象分配的内存会自动扩展，以容纳新增的内容
		
		//默认构造器由系统自动分配容量，而系统容量默认是16
		StringBuffer sb1 = new StringBuffer();
		System.out.println("StringBuffer sb1的初始容量:" + sb1.capacity());	//16
		System.out.println("StringBuffer sb1的初始长度:" + sb1.length());	//0
		
		
		// new StringBuffer(int x) x设置StringBuffer的容量
		StringBuffer sb2 = new StringBuffer(100);		
		System.out.println("StringBuffer sb2的初始容量:" + sb2.capacity());
		
		//保证StringBuffer的最小容量
		sb2.ensureCapacity(160);
		System.out.println("String sb2增加容量到:" + sb2.capacity());	//202
	}
}