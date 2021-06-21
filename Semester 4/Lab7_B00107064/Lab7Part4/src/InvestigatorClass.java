import java.lang.reflect.*;


public class InvestigatorClass {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<MysteryClass> MysteryClassRef = MysteryClass.class;
		
		Field[] fields = MysteryClassRef.getDeclaredFields();
		
		for(Field field : fields){
		    System.out.println("Field: " + field.getName() + ". Field Type: " + field.getType());
		}			
		
		Method[] methods = MysteryClass.class.getDeclaredMethods();
		
		for(Method method : methods){
		    System.out.print("Method: " + method.getName() + ". Method Modifiers: " + Modifier.toString(method.getModifiers()));
			
		    for(Class<?> parameterType: method.getParameterTypes()) {
				System.out.print(". Method Parameter Types: " + parameterType.getName());
			}  
		    System.out.println("");
		}
		
		Method method = MysteryClass.class.getMethod("notEasyToGuessTheNameOfThisMethod", double.class);	
		System.out.println("Result of method: " + method.invoke(new MysteryClass(), 5));
	} // end main
} // end class