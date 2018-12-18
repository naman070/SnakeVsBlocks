import java.io.Serializable;
import java.util.Date;

/**
 * this implements the state of the player
 * @author NAMAN
 *
 */
public class player_state implements Serializable {
	private int Score;
	private Date date;
	public player_state(int s) {
		Score=s;
		date=new Date();
	}
	/**
	 * this returns the score of the player
	 * @return
	 * returns integer score
	 */
	public int getScore() {
		return Score;
	}public Date getDate() {
		return date;
	}
}