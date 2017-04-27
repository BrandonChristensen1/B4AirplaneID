
public class Flyer {
	
	public static void main(String[] args){
		
		Flyer startProgram = new Flyer();
		startProgram.createAirplaneData();
		
		AirplaneQuestions myQuestions = new AirplaneQuestions();
		
		// with the answers to the above questions,
		// tell which airplane(s) it might be, and for now
		// rule out planes it can't be.
	}

	private void createAirplaneData() {
		AirplaneData F15 = new AirplaneData();
			F15.setEngineType("Jet");
			F15.setEngineNumber(2);
			F15.setEngingeLocation("body");
		
		AirplaneData F16 = new AirplaneData();
			F16.setEngineType("Jet");
			F16.setEngineNumber(1);
			F16.setEngingeLocation("body");
		
	
		AirplaneData F18 = new AirplaneData();
			F18.setEngineType("Jet");
			F18.setEngineNumber(2);
			F18.setEngingeLocation("body");
		
	
		AirplaneData F22 = new AirplaneData();
			F22.setEngineType("Jet");
			F22.setEngineNumber(2);
			F22.setEngingeLocation("body");
		
	
		AirplaneData F35 = new AirplaneData();
			F35.setEngineType("Jet");
			F35.setEngineNumber(1);
			F35.setEngingeLocation("body");
		
	
		AirplaneData A10 = new AirplaneData();
			A10.setEngineType("Jet");
			A10.setEngineNumber(2);
			A10.setEngingeLocation("tail");
			
		//System.out.println("F16 has " + F16.getEngineNumber() + " engines");
		//System.out.println("F18 has " + F18.getEngineNumber() + " engines");
		//System.out.println("F35 has " + F35.getEngineNumber() + " engines");
		//System.out.println("A10 has " + A10.getEngineNumber() + " engines");
		
	}

}
