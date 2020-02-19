package com.TutorReservationSystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rank")
public class Rank {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer getRankId() {
		return RankId;
	}
	public void setRankId(Integer rankId) {
		RankId = rankId;
	}
	public String getRankName() {
		return RankName;
	}
	public void setRankName(String rankName) {
		RankName = rankName;
	}
	
	private Integer RankId;
    private String RankName;
    
}
