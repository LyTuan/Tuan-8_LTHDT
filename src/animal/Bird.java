package animal;

public class Bird extends Animal{
	public String makeNoise(int n){
		String noise="Sweeting:";
		for(int pos =0; pos<n ;pos++){
			noise =noise+" tweet ";
		}
		return noise;
	}
	public Bird(){
		
	}
}
