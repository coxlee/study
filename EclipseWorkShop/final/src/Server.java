
class Server {
	Athlete data[];
	int pointer;
	int size;
	public Server() {
		pointer = 0;
		size = 200;
		data = new Athlete[size];
	}
	public void addData(Athlete a){
		data[pointer] = a;
		pointer++;
	}

	public void List(){
		System.out.println("List of all athletes available:");
		Athlete temp;
		for(int i =0;i<pointer;i++){
			temp = data[i];
			System.out.println("Name: "+temp.getFirstName()+" "+temp.getLastName() +"Nation: "+temp.getCountry());
		}
	}
	public boolean Athlete(String commend){
		boolean isFound = false;
		for(int i =0;i<pointer;i++){
			Athlete temp = data[i];
			if(temp.getLastName().equals(commend)){
				System.out.println("Display Athlete: "+temp.getLastName());
				System.out.println(temp);
				isFound  =true;
			}
		}
		return isFound;

	}
	public boolean Country(String c){
		System.out.println("List of all athletes in a country:");
		boolean isFound = false;
		for(int i =0;i<pointer;i++){
			Athlete temp = data[i];
			if(temp.getCountry().equals(c)){
				System.out.println("Display Athlete: "+temp.getLastName());
				System.out.println(temp);
				isFound  =true;
			}
		}
		return isFound;

	}
	public void Revenue(){
		System.out.println("Display Revenue:");
		Athlete temp;
		for(int i = 0;i<pointer;i++){
			temp = data[i];
			System.out.println("Name:"+temp.getLastName()+" Revenue:"+temp.getAdRevenue());
		}
	}
	public void Venue(){
		System.out.println("Display Venue:");
		Athlete temp;
		for(int i = 0;i<pointer;i++){
			temp = data[i];
			System.out.println("Name:"+temp.getLastName()+" Revenue:"+temp.getAdRevenue());
		}
	}
	
}
