import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
	private LocalDateTime startDate;
	
	public Gigasecond(LocalDate mDate) {
		this.startDate = mDate.atStartOfDay();
	}
	
	public Gigasecond(LocalDateTime mDate) {
		this.startDate = mDate;
	}
	
	public LocalDateTime getDate() {
		return startDate.plusSeconds(1000000000L);
	}
}