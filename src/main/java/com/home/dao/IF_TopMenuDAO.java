package com.home.dao;

import java.util.List;

import com.home.vo.TopMenuVO;

/**
 * 대메뉴 인터페이스
 * @author 뱃살 현문
 *
 */
public interface IF_TopMenuDAO {
	public boolean insertMenu(TopMenuVO topMenuVO)throws Exception;
	public boolean deletetMenu(int menu_no)throws Exception;
	public boolean updatetMenu(TopMenuVO topMenuVO)throws Exception;
	public List<TopMenuVO> selectMenu()throws Exception;				//대메뉴 전부 불러오는 함수
	public TopMenuVO selectMenu(TopMenuVO topMenuVO)throws Exception; //대메뉴
	public TopMenuVO readMenu(int topMenuNO)throws Exception;
	
}
