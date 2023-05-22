 
public class InstrumentMain {

	public static void main(String[] args) {
		
		Instrument arr[]=new Instrument[4];
		arr[0]=new Guitar();
		arr[1]=new Piano();
		arr[2]=new Guitar();
		arr[3]=new Piano();
		display(arr);
	}
	public static void display(Instrument arr[])
	{
		for(Instrument i:arr)
		{
			
			if (i instanceof Guitar)
				i.play();
				i.sayThanks();
			if (i instanceof Piano)
				i.play();
				i.sayThanks();
		}
	}

}
