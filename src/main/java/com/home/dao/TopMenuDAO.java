package com.home.dao;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;

import com.home.vo.TopMenuVO;

/**
 * 이 클래스는 IF_TopMenuDAO 인터페이스를 구현하는 클레스입니다,매퍼쿼리 접근하는 클래스입니다
 * @author 뱃살 현문
 *
 */
@Repository
public class TopMenuDAO implements IF_TopMenuDAO{
	@Inject
	//private SqlSession sqlSession;

	@Override
	public boolean insertMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO sqlSessuib탬플릿을 이용해서 메퍼쿼리를 실행
		return false;
	}

	@Override
	public boolean deletetMenu(int menu_no) throws Exception {
		// TODO sqlSessuib탬플릿을 이용해서 메퍼쿼리를 실행
		return false;
	}

	@Override
	public boolean updatetMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO sqlSessuib탬플릿을 이용해서 메퍼쿼리를 실행
		return false;
	}

	@Override
	public List<TopMenuVO> selectMenu() throws Exception {
		// TODO sqlSessuib탬플릿을 이용해서 메퍼쿼리를 실행
		return null;
	}

	@Override
	public TopMenuVO selectMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO sqlSessuib탬플릿을 이용해서 메퍼쿼리를 실행
		return null;
	}

	@Override
	public TopMenuVO readMenu(int topMenuNO) throws Exception {
		// TODO sqlSessuib탬플릿을 이용해서 메퍼쿼리를 실행
		return null;
	}
	
	
}
