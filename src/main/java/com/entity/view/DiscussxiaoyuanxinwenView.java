package com.entity.view;

import com.entity.DiscussxiaoyuanxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园新闻评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 09:07:48
 */
@TableName("discussxiaoyuanxinwen")
public class DiscussxiaoyuanxinwenView  extends DiscussxiaoyuanxinwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussxiaoyuanxinwenView(){
	}
 
 	public DiscussxiaoyuanxinwenView(DiscussxiaoyuanxinwenEntity discussxiaoyuanxinwenEntity){
 	try {
			BeanUtils.copyProperties(this, discussxiaoyuanxinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
