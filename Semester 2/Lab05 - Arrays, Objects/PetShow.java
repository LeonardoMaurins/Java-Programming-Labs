public class PetShow{
	public static void main(String[] args){
		Pet p = new Pet("poodle","small","fur");
		System.out.println(p.getBreed() + "\n" + p.getSize() + "\n" + p.getSkin());
	}
}