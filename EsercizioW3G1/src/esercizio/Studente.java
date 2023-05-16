package esercizio;

import java.time.LocalDate;

public class Studente {
	
	private int id;
	private String name;
	private String lastname;
	private String gender;
	private LocalDate birthdate;
	private int avg;
	private int minVote;
	private int maxVote;
	
	public Studente(String name, String lastname, String gender, LocalDate birthdate, int avg, int minVote,
			int maxVote) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.minVote = minVote;
		this.maxVote = maxVote;
	}

	public Studente(int id, String name, String lastname, String gender, LocalDate birthdate, int avg, int minVote,
			int maxVote) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.avg = avg;
		this.minVote = minVote;
		this.maxVote = maxVote;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getMinVote() {
		return minVote;
	}

	public void setMinVote(int minVote) {
		this.minVote = minVote;
	}

	public int getMaxVote() {
		return maxVote;
	}

	public void setMaxVote(int maxVote) {
		this.maxVote = maxVote;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", name=" + name + ", lastname=" + lastname + ", gender=" + gender
				+ ", birthdate=" + birthdate + ", avg=" + avg + ", minVote=" + minVote + ", maxVote=" + maxVote + "]";
	}
		
}
