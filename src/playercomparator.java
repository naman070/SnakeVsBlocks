import java.util.Comparator;

/**
 * this implements the descending sorting of the arraylist on the basis of comparing the score of the player
 * @author NAMAN
 *
 */
public class playercomparator implements Comparator<player_state> {

	@Override
	public int compare(player_state arg0, player_state arg1) {
		// TODO Auto-generated method stub
		return arg1.getScore()-arg0.getScore();
	}

}