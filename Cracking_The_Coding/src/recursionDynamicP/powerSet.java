package recursionDynamicP;

public class powerSet {
	public static void subSet(String Set) {
		
		System.out.println(Set.substring(0, 1));
		System.out.println(Set.substring(0, 2));
		System.out.println(Set.substring(0, 3));
		System.out.println(Set.substring(1, 2));
		System.out.println(Set.substring(1, 3));
		System.out.println(Set.substring(2, 3));
		
		
	/* System.out.println(Set.substring(0, 1));
		System.out.println(Set.substring(0, 1));	`
		System.out.println(Set.substring(0, 1));
		System.out.println(Set.substring(0, 1));
		System.out.println(Set.substring(0, 1));*/	
	}
public static void main(String args[]) {
	String Set = "abc";
	subSet(Set);
}
	
}
