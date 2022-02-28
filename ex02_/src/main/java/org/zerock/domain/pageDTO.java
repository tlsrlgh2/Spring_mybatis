package org.zerock.domain;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class pageDTO {

	private int startPage, endPage;
	private boolean prev, next;
	
	private int total;
	private criteria cri;
	
	public pageDTO(criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		
		this.endPage = (int)(Math.ceil(cri.getPageNum()/10.0)) * 10;
		
		this.startPage = endPage - 9;
		
		this.prev = this.startPage > 1;
		
		int realend = (int)(Math.ceil((total * 1.0) / cri.getAmount()));
		
		this.endPage = realend <= endPage? realend : endPage;
		
		this.next = this.endPage < realend;
		
	}
}
