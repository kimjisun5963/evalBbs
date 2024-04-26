package com.green.evalBbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.green.evalBbs.dto.EvalBbsDto;

@Mapper
public interface IEvalBbsDao {
	
	public List<EvalBbsDto> getList();
	public EvalBbsDto getDto(int bno);
	public void deleteDto(int bno);
	public void regDto(String title, String content, String writer);

}
