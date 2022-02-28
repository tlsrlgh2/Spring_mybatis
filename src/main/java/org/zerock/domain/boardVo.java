package org.zerock.domain;

import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

// @Data는 @RequiredArgsConstructor @getter @setter 대체로 사용이 된다
@Data
public class boardVo {

	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
	
}
