package com.entity.view;

import com.entity.WeixiudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维修登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-30 15:36:50
 */
@TableName("weixiudengji")
public class WeixiudengjiView  extends WeixiudengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeixiudengjiView(){
	}
 
 	public WeixiudengjiView(WeixiudengjiEntity weixiudengjiEntity){
 	try {
			BeanUtils.copyProperties(this, weixiudengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
