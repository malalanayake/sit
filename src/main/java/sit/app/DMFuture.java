package sit.app;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Jun 5, 2016 12:46:57 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
public class DMFuture implements Future {

	public String getStatus(int currentYear) {
		String des = getDescription(currentYear);
		return des;
	}

	private String getDescription(int year) {
		String description = "";
		switch (year) {
		case 2018:
			description = "Willing to move to CA in the end of the year";
			break;
		default:
			description = ".....................";
			break;

		}

		return description;
	}

	public static void main(String[] args) {
		Future future = new DMFuture();
		String description = future.getStatus(2018);
		
		System.out.println(description);
	}

}

