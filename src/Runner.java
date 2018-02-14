import by.gsu.asoilab.BusinessTrip;

public class Runner {

	public static void main(String[] args) {
		BusinessTrip[] businessTrips = {
				new BusinessTrip("Boris Kuklachev", 650, 14),
				new BusinessTrip("Marina Sedushko", 702, 7),
				null,
				new BusinessTrip("Karina Emelyan", 800, 5),
				new BusinessTrip()
		};
		
		for (BusinessTrip businessTrip : businessTrips){
			if(businessTrip==null){
				System.out.println(businessTrip + "\n");
			}else{
				businessTrip.show();
			}			
		}
		
		businessTrips[businessTrips.length-1].setExpenses(700);
		
		//System.out.println("Duration = " + (businessTrips[0].getDays()+businessTrips[1].getDays()) + "\n");
		
		for(BusinessTrip businessTrip : businessTrips){
			System.out.println(businessTrip);
		}
	}
}