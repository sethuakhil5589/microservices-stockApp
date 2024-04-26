package com.akhil.exception;

import java.time.LocalDateTime;

public class Error {
	String error;
	String msg;
	LocalDateTime when;
	public Error(String error, String msg, LocalDateTime localDateTime) {
		super();
		this.error = error;
		this.msg = msg;
		this.when = localDateTime;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public LocalDateTime getWhen() {
		return when;
	}
	public void setWhen(LocalDateTime when) {
		this.when = when;
	}

}
