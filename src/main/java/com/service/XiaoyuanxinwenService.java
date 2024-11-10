package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuanxinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuanxinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanxinwenView;


/**
 * 校园新闻
 *
 * @author 
 * @email 
 * @date 2021-03-31 09:07:48
 */
public interface XiaoyuanxinwenService extends IService<XiaoyuanxinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuanxinwenVO> selectListVO(Wrapper<XiaoyuanxinwenEntity> wrapper);
   	
   	XiaoyuanxinwenVO selectVO(@Param("ew") Wrapper<XiaoyuanxinwenEntity> wrapper);
   	
   	List<XiaoyuanxinwenView> selectListView(Wrapper<XiaoyuanxinwenEntity> wrapper);
   	
   	XiaoyuanxinwenView selectView(@Param("ew") Wrapper<XiaoyuanxinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuanxinwenEntity> wrapper);
   	
}

