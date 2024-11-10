package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaoyuanxinwenDao;
import com.entity.XiaoyuanxinwenEntity;
import com.service.XiaoyuanxinwenService;
import com.entity.vo.XiaoyuanxinwenVO;
import com.entity.view.XiaoyuanxinwenView;

@Service("xiaoyuanxinwenService")
public class XiaoyuanxinwenServiceImpl extends ServiceImpl<XiaoyuanxinwenDao, XiaoyuanxinwenEntity> implements XiaoyuanxinwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuanxinwenEntity> page = this.selectPage(
                new Query<XiaoyuanxinwenEntity>(params).getPage(),
                new EntityWrapper<XiaoyuanxinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuanxinwenEntity> wrapper) {
		  Page<XiaoyuanxinwenView> page =new Query<XiaoyuanxinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuanxinwenVO> selectListVO(Wrapper<XiaoyuanxinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuanxinwenVO selectVO(Wrapper<XiaoyuanxinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuanxinwenView> selectListView(Wrapper<XiaoyuanxinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuanxinwenView selectView(Wrapper<XiaoyuanxinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
