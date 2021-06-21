import java.util.*;
public class Pet{

	private String breed;
	private String size;
	private String skin;

	public Pet(){
		breed = "shephard";
		size = "large";
		skin = "fur";
	}

	public Pet(String aBreed, String aSize, String aSkin){
		breed = aBreed;
		size = aSize;
		skin = aSkin;
	}

	public void setBreed(String aBreed){
		breed = aBreed;}
	public void setSize(String aSize){
		size = aSize;}
	public void setSkin(String aSkin){
		skin = aSkin;}

	public String getBreed(){
		return breed;}
	public String getSize(){
		return size;}
	public String getSkin(){
		return skin;}
}