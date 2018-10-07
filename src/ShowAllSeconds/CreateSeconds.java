package ShowAllSeconds;
//Just outputs a link for every second in a video. 
//Video length edited in first few ints
//Yeah this is awful, but it works and took 10 minutes. 
public class CreateSeconds {
	public static void main(String[] args) {
		int videoLengthMinutes = 10;
		int videoLengthSeconds = 41;
		final int vlength = videoLengthMinutes*60+videoLengthSeconds;
		
		for (int v = vlength; v != 0; v--) {
			if (videoLengthSeconds<10) {
				System.out.println(videoLengthMinutes + ":0" + videoLengthSeconds);
			}
			else
				System.out.println(videoLengthMinutes + ":" + videoLengthSeconds);
			
			videoLengthSeconds--;
			
			if (videoLengthSeconds<=0) {
				videoLengthSeconds = 59;
				videoLengthMinutes--;
			}		
		}
		
	}
}
