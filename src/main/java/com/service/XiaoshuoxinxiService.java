package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshuoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshuoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshuoxinxiView;


/**
 * 小说信息
 *
 * @author 
 * @email 
 * @date 2022-05-08 15:02:29
 */
public interface XiaoshuoxinxiService extends IService<XiaoshuoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshuoxinxiVO> selectListVO(Wrapper<XiaoshuoxinxiEntity> wrapper);
   	
   	XiaoshuoxinxiVO selectVO(@Param("ew") Wrapper<XiaoshuoxinxiEntity> wrapper);
   	
   	List<XiaoshuoxinxiView> selectListView(Wrapper<XiaoshuoxinxiEntity> wrapper);
   	
   	XiaoshuoxinxiView selectView(@Param("ew") Wrapper<XiaoshuoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshuoxinxiEntity> wrapper);
   	

}

