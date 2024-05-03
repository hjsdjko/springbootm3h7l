package com.dao;

import com.entity.XiaoshuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoshuoxinxiVO;
import com.entity.view.XiaoshuoxinxiView;


/**
 * 小说信息
 * 
 * @author 
 * @email 
 * @date 2022-05-08 15:02:29
 */
public interface XiaoshuoxinxiDao extends BaseMapper<XiaoshuoxinxiEntity> {
	
	List<XiaoshuoxinxiVO> selectListVO(@Param("ew") Wrapper<XiaoshuoxinxiEntity> wrapper);
	
	XiaoshuoxinxiVO selectVO(@Param("ew") Wrapper<XiaoshuoxinxiEntity> wrapper);
	
	List<XiaoshuoxinxiView> selectListView(@Param("ew") Wrapper<XiaoshuoxinxiEntity> wrapper);

	List<XiaoshuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoshuoxinxiEntity> wrapper);
	
	XiaoshuoxinxiView selectView(@Param("ew") Wrapper<XiaoshuoxinxiEntity> wrapper);
	

}
