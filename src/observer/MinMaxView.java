package observer;

import java.util.Collections;
import java.util.List;

public class MinMaxView implements Observer {
	ScoreRecord scoreRecord;

	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}

	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();
		displayMinMax(record);
	}

	private void displayMinMax(List<Integer> record) {
		int min = Collections.min(record, null);
		int max = Collections.max(record, null);
		System.out.println("Min: " + min + " Max: " + max);
	}
}
