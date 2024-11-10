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


import com.dao.DiscussxiaoyuanxinwenDao;
import com.entity.DiscussxiaoyuanxinwenEntity;
import com.service.DiscussxiaoyuanxinwenService;
import com.entity.vo.DiscussxiaoyuanxinwenVO;
import com.entity.view.DiscussxiaoyuanxinwenView;

@Service("discussxiaoyuanxinwenService")
public class DiscussxiaoyuanxinwenServiceImpl extends ServiceImpl<DiscussxiaoyuanxinwenDao, DiscussxiaoyuanxinwenEntity> implements DiscussxiaoyuanxinwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxiaoyuanxinwenEntity> page = this.selectPage(
                new Query<DiscussxiaoyuanxinwenEntity>(params).getPage(),
                new EntityWrapper<DiscussxiaoyuanxinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxiaoyuanxinwenEntity> wrapper) {
		  Page<DiscussxiaoyuanxinwenView> page =new Query<DiscussxiaoyuanxinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxiaoyuanxinwenVO> selectListVO(Wrapper<DiscussxiaoyuanxinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxiaoyuanxinwenVO selectVO(Wrapper<DiscussxiaoyuanxinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxiaoyuanxinwenView> selectListView(Wrapper<DiscussxiaoyuanxinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxiaoyuanxinwenView selectView(Wrapper<DiscussxiaoyuanxinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
