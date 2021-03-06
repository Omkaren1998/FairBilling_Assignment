package com.Assignment.sample;

/**
 *	The output result for one userid 
 */
public class FinalResult {
	
	private String userId;
	private int numberOfSessions;
	private int billableTimeInSeconds;
	
	public FinalResult() {}
	
	public FinalResult(String userId, int numberOfSessions, int billableTimeInSeconds) {
		this.userId = userId;
		this.numberOfSessions = numberOfSessions;
		this.billableTimeInSeconds = billableTimeInSeconds;		
	}
	
	// Generated getters and setters
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getNumberOfSessions() {
		return numberOfSessions;
	}
	public void setNumberOfSessions(int numberOfSessions) {
		this.numberOfSessions = numberOfSessions;
	}
	public int getBillableTimeInSeconds() {
		return billableTimeInSeconds;
	}
	public void setBillableTimeInSeconds(int billableTimeInSeconds) {
		this.billableTimeInSeconds = billableTimeInSeconds;
	}

	// Generated toString()
	@Override
	public String toString() {
		return "UserResult [userId=" + userId + ", numberOfSessions=" + numberOfSessions + ", billableTimeInSeconds="
				+ billableTimeInSeconds + "]";
	}

}
