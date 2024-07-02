package com.gyojincompany.freeboard.dao;

import java.util.ArrayList;

import com.gyojincompany.freeboard.dto.BoardDto;

public interface BoardDao {
	
	public void writeDao(String bname, String btitle, String bcontent);//글쓰기
	public ArrayList<BoardDto> listDao();//글목록 가져오기

}
