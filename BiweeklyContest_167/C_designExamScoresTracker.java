package BiweeklyContest_167;

import java.util.TreeMap;

public class C_designExamScoresTracker {

	class ExamTracker {

		TreeMap<Integer,Long> map;
		long totalScore;
		
		public ExamTracker() {

			map = new TreeMap<>();
			totalScore = 0;
		}
		
		public void record(int time, int score) {

			totalScore += score;
			map.put(time, totalScore);
		}
		
		public long totalScore(int startTime, int endTime) {

			Integer end = map.floorKey(endTime);
			
			if(end == null){

				return 0;
			}

			long s2 = map.get(end);

			Integer start = map.lowerKey(startTime);
			long s1 = 0;
			
			if(start == null){

				s1 = 0;
			}

			else{

				s1 = map.get(start);
			}

			return (s2 - s1);
		}
	}
}
