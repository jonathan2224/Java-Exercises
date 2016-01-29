import org.joda.time.DateTime;

public class Meetup {
	DateTime MonthStart;
	
	public Meetup(int month, int year) {
		MonthStart = new DateTime(year, month, 1, 0, 0);
	}
	
	public DateTime day (int dayofweek, MeetupSchedule period) {
		DateTime temp = MonthStart;
		temp = cycledaynext(dayofweek, temp);
		switch (period) {
			case FIRST:
				break;
			case SECOND:
				temp = temp.plusWeeks(1);
				break;
			case THIRD:
				temp = temp.plusWeeks(2);
				break;
			case FOURTH:
				temp = temp.plusWeeks(3);
				break;
			case LAST:
				temp = MonthStart.plusMonths(1).minusDays(1);
				temp = cycledayprev(dayofweek, temp);
				break;
			case TEENTH:
				while (temp.getDayOfMonth()<13) {
					temp=temp.plusWeeks(1);
				}
				break;
		}
		return temp;
	}
	
	private DateTime cycledaynext(int dayofweek, DateTime temp) {
		while (temp.getDayOfWeek() != dayofweek) {
			temp = temp.plusDays(1);
		}
		return temp;
	}
	
	private DateTime cycledayprev(int dayofweek, DateTime temp) {
		while (temp.getDayOfWeek() != dayofweek) {
			temp = temp.minusDays(1);
		}
		return temp;
	}
 }