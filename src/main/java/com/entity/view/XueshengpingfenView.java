package com.entity.view;

import com.entity.XueshengpingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生评分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
@TableName("xueshengpingfen")
public class XueshengpingfenView  extends XueshengpingfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengpingfenView(){
	}
 
 	public XueshengpingfenView(XueshengpingfenEntity xueshengpingfenEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengpingfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
