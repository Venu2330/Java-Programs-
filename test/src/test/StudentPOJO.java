package test;

import java.util.Objects;

public class StudentPOJO {

	private int id;
	private String name;
	private int sem;
	private String branch;
	private float Avgscore;

	public StudentPOJO(int id, String name, int sem, String branch, float avgscore) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.branch = branch;
		Avgscore = avgscore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSem() {
		return sem;
	}

	public void setSem(int sem) {
		this.sem = sem;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public float getAvgscore() {
		return Avgscore;
	}

	public void setAvgscore(float avgscore) {
		Avgscore = avgscore;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Avgscore, branch, id, name, sem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPOJO other = (StudentPOJO) obj;
		return Float.floatToIntBits(Avgscore) == Float.floatToIntBits(other.Avgscore)
				&& Objects.equals(branch, other.branch) && id == other.id && Objects.equals(name, other.name)
				&& sem == other.sem;
	}

	@Override
	public String toString() {
		return "StudentPOJO [id=" + id + ", name=" + name + ", sem=" + sem + ", branch=" + branch + ", Avgscore="
				+ Avgscore + "]";
	}

	public StudentPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
