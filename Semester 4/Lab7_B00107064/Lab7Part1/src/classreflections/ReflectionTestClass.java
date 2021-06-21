package classreflections;

public class ReflectionTestClass {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
		System.out.println((new ReflectionTestClass()).getClass());
		System.out.println(ReflectionTestClass.class);
		
		forName();
		newInstance();
	}

	public static void forName() throws ClassNotFoundException{
		String className = "classreflections.ReflectionTestClass";
		Class<?> myClassName = Class.forName(className);
		System.out.println(myClassName.getName());
	}
	
	public static void newInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String className = "classreflections.ReflectionTestClass";
		Object ReflectionTestClass = Class.forName(className).newInstance();
		System.out.println(ReflectionTestClass);
	}
}
