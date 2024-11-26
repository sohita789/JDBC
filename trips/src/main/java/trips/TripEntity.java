package trips;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trip_details")

public class TripEntity {
	@Id	

		private int id;
		@Column(name="place")
		private String place;
		@Column(name="noOfdays")
		private int noOfdays;
	    @Column(name="budget")
		private int budget;
	    @Column(name="travelType")
		private String travelType;
	    
		public TripEntity( int id,String place, int noOfdays, int budget, String travelType) {
			super();
			
			this.place = place;
			this.noOfdays = noOfdays;
			this.budget = budget;
			this.travelType = travelType;
		}

		public TripEntity() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
			this.place = place;
		}

		public int getNoOfdays() {
			return noOfdays;
		}

		public void setNoOfdays(int noOfdays) {
			this.noOfdays = noOfdays;
		}

		public int getBudget() {
			return budget;
		}

		public void setBudget(int budget) {
			this.budget = budget;
		}

		public String getTravelType() {
			return travelType;
		}

		public void setTravelType(String travelType) {
			this.travelType = travelType;
		} 
		

}
