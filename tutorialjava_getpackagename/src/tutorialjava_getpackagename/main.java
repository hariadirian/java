package tutorialjava_getpackagename;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find package name
//		https://www.javatips.net/blog/finding-the-package-name-of-class
//		
		String packetTitle ;
		
		packetTitle = "Judul Paket: " ;
		
		// Get package name of string class
		String str = new String();
		Package packs = str.getClass().getPackage();
		String packageName = packs.getName() ;
		
		
		
		System.out.println(packetTitle + packageName) ;
		
		
		// Find current class name package
		main o = new main()	;
		packageName = o.getClass().getPackage().getName()	;
		System.out.println(packageName);
		
		
		
	}

}
