package Main;
import java.io.Serializable;
import java.time.LocalDate;

public class Contract implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name, descr;
	private LocalDate endDate;
	
	public Contract(String name, String descr, LocalDate endDate) {
		this.setName(name);
		this.setDescr(descr);
		this.setEndDate(endDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
