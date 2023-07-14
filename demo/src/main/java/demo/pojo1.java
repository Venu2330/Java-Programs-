package demo;

public class pojo1 {
	
	private String customer_name;
	private String instrument_name;
	private String Rent_price_per_day;
	private int no_of_days;

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getInstrument_name() {
		return instrument_name;
	}

	public void setInstrument_name(String instrument_name) {
		this.instrument_name = instrument_name;
	}

	public String getRent_price_per_day() {
		return Rent_price_per_day;
	}

	public void setRent_price_per_day(String rent_price_per_day) {
		Rent_price_per_day = rent_price_per_day;
	}
	
		

	public int getNo_of_days() {
		return no_of_days;
	}

	public void setNo_of_days(int no_of_days) {
		this.no_of_days = no_of_days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Rent_price_per_day == null) ? 0 : Rent_price_per_day.hashCode());
		result = prime * result + ((customer_name == null) ? 0 : customer_name.hashCode());
		result = prime * result + ((instrument_name == null) ? 0 : instrument_name.hashCode());
		result = prime * result + no_of_days;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		pojo1 other = (pojo1) obj;
		if (Rent_price_per_day == null) {
			if (other.Rent_price_per_day != null)
				return false;
		} else if (!Rent_price_per_day.equals(other.Rent_price_per_day))
			return false;
		if (customer_name == null) {
			if (other.customer_name != null)
				return false;
		} else if (!customer_name.equals(other.customer_name))
			return false;
		if (instrument_name == null) {
			if (other.instrument_name != null)
				return false;
		} else if (!instrument_name.equals(other.instrument_name))
			return false;
		if (no_of_days != other.no_of_days)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "pojo1 [customer_name=" + customer_name + ", instrument_name=" + instrument_name
				+ ", Rent_price_per_day=" + Rent_price_per_day + ", no_of_days=" + no_of_days + "]";
	}

	public pojo1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

	
	}


