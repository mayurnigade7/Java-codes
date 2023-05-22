//Wrapper classes are use to convert the primitive type in the form of objects
//we use because there are some classes which required only objects
//Wrapper classes providing us many utility methods for conversions

public class DemoWrapperClass {

	public static void main(String[] args) {
		int n1=10;
		//primitive to Object-Boxing
		Integer iobj=new Integer(n1);
		//object to primitive...
		//unBoxing-Object to primitive
		int x=iobj.intValue();
		String str=Integer.toString(x);
		int z=Integer.parseInt(str);
		System.out.println(Integer.toBinaryString(z));
		System.out.println(Integer.toHexString(z));
		
		//AutoBoxing
		Integer iobj2=n1;
		//AutoUnboxing
		int y=iobj2;
	}

}
