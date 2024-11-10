package com.dao;

import com.entity.XiaoyuanxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuanxinwenVO;
import com.entity.view.XiaoyuanxinwenView;


/**
 * 校园新闻
 * 
 * @author 
 * @email 
 * @date 2021-03-31 09:07:48
 */
public interface XiaoyuanxinwenDao extends BaseMapper<XiaoyuanxinwenEntity> {
	
	List<XiaoyuanxinwenVO> selectListVO(@Param("ew") Wrapper<XiaoyuanxinwenEntity> wrapper);
	
	XiaoyuanxinwenVO selectVO(@Param("ew") Wrapper<XiaoyuanxinwenEntity> wrapper);
	
	List<XiaoyuanxinwenView> selectListView(@Param("ew") Wrapper<XiaoyuanxinwenEntity> wrapper);

	List<XiaoyuanxinwenView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuanxinwenEntity> wrapper);
	
	XiaoyuanxinwenView selectView(@Param("ew") Wrapper<XiaoyuanxinwenEntity> wrapper);
	
}
