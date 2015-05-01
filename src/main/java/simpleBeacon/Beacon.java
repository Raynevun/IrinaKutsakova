package simpleBeacon;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang3.StringUtils;

public class Beacon {

	public static void countStats(String response) {
		if (response != null) {
			for (int i = 0; i < response.length(); i++) {
				int count = StringUtils.countMatches(response, response.charAt(i));
				System.out.println(response.charAt(i) + " , " + count);
			}
		} else {
			System.out.println("Null value");
		}
	}

	public static void readResponse(GetMethod method) {
		// Read the response body.

		try {
			byte[] responseBody = method.getResponseBody();

			// Deal with the response.
			String response = new String(responseBody);
			response = StringUtils.substringBetween(response, "<seedValue>", "</seedValue>");
			System.out.println(response + "\n");
			countStats(response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
