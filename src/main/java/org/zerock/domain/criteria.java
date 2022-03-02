package org.zerock.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class criteria {

	private int pageNum;
	private int amount;
	
	private String type;
	private String keyword;
	
	public criteria() {
		this(1,10);
	}

	public criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {
		System.out.println("getTypeArr 호출..........................");
		return type == null? new String[] {}: type.split("");
		
	}
	
}
