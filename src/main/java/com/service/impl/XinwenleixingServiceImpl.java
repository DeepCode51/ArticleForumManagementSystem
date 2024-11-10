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


import com.dao.XinwenleixingDao;
import com.entity.XinwenleixingEntity;
import com.service.XinwenleixingService;
import com.entity.vo.XinwenleixingVO;
import com.entity.view.XinwenleixingView;

@Service("xinwenleixingService")
public class XinwenleixingServiceImpl extends ServiceImpl<XinwenleixingDao, XinwenleixingEntity> implements XinwenleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwenleixingEntity> page = this.selectPage(
                new Query<XinwenleixingEntity>(params).getPage(),
                new EntityWrapper<XinwenleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwenleixingEntity> wrapper) {
		  Page<XinwenleixingView> page =new Query<XinwenleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwenleixingVO> selectListVO(Wrapper<XinwenleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwenleixingVO selectVO(Wrapper<XinwenleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwenleixingView> selectListView(Wrapper<XinwenleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwenleixingView selectView(Wrapper<XinwenleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
