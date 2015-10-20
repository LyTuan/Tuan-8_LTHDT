package polimophisyrm;

public abstract class Animal {
	private String kind;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public Animal(){
		this.kind ="";
	}
	public Animal(String kind){
		this.kind = kind;
	}
	public String toString(){
		return "A "+ kind+" goes "+ speak() ;
	}
	public String speak(){
		return "";
	}
	public String talk(Animal a){
		if( a instanceof Cow){
			return "I" +" am "+ a.kind+" and I go "+a.moo();
		}else if(a instanceof Cat){
			return "I"+ " am "+ a.kind+" and I go"+ a.meow();
		}else {
			return "I don't know wwho am I";
		}
	}
	public String moo(){
		return "moo";
	}
	public String meow(){
		return "meow";
	}
}
