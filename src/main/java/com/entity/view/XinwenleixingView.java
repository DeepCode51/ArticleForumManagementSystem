package com.entity.view;

import com.entity.XinwenleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 新闻类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-31 09:07:47
 */
@TableName("xinwenleixing")
public class XinwenleixingView  extends XinwenleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinwenleixingView(){
	}
 
 	public XinwenleixingView(XinwenleixingEntity xinwenleixingEntity){
 	try {
			BeanUtils.copyProperties(this, xinwenleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
