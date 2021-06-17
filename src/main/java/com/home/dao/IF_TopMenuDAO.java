package com.home.dao;

import java.util.List;

import com.home.vo.TopMenuVO;

/**
 * 대메뉴 인터페이스
 * @author 뱃살 현문
 *
 */
public interface IF_TopMenuDAO {
	public boolean insertMenu(TopMenuVO topMenuVO);
	public boolean deletetMenu(TopMenuVO topMenuVO);
	public boolean updatetMenu(TopMenuVO topMenuVO);
	public List<TopMenuVO> selectMenu();				//대메뉴 전부 불러오는 함수
	public TopMenuVO selectMenu(TopMenuVO topMenuVO); //대메뉴
	public TopMenuVO selectMenu(int topMenuNO);
	
}
