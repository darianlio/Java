
public class Switch {

	public static void main(String[] args) {
//		int value = 1;
//		if (value == 1) {
//			System.out.println("Value was 1");
//		} else if(value == 2) {
//			System.out.println("Value was 2");
//		} else {
//			System.out.println("Value was not 1 or 2");
//		}
	
		int switchValue = 3;
	
		switch(switchValue) {
			case 1:
				System.out.println("Value was 1");
				break;
			case 2:
				System.out.println("Value was 2");
				break;
			case 3:case 4:case 5:
				System.out.println("was a 3, or a 4, or a 5");
				System.out.println("Actually it was a " + switchValue);
				break;
			default:
				System.out.println("Value was not 1 or 2");
		}
		
		//Challenge
		char charVal = 'A';
		switch(charVal) {
		case 'A':case 'B':case 'C':case 'D': case 'E':
			System.out.println("was a A, B, C. D. or E");
			System.out.println("Actual value was " + charVal);
			break;
		default:
			System.out.println("Not found");
			break;
		}
	}
}
