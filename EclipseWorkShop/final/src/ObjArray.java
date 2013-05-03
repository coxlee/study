
public class ObjArray {
	Athlete data[];
	int index;
	int size;
	public ObjArray() {
		size = 100;
		index = 0;
		data = new Athlete[size];
	}
	public void add(Athlete a){
		if(isFull()){
			expand();
		}
		data[index] = a;
		index++;
	}
	public Object findAthlete(int pointer){
		return data[pointer];
	}
	public boolean isFull(){
		return index>=size;
	}
	public void expand(){
		Athlete temp[] = data;
		size *=2;
		data = new Athlete[size];
		for(int i = 0;i<index;i++){
			data[i] = temp[i];
		}
	}
	public boolean delAthlete(int pointer){//
		return true;
	}

}
