package com.ylink.inetpay.cbs.chl.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.ylinkpay.framework.mybatis.annotation.MybatisMapper;

import com.ylink.inetpay.common.project.channel.dto.TbChlFrontendSession;

@MybatisMapper("tbChlFrontendSessionMapper")
public interface TbChlFrontendSessionMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table TB_CHL_FRONTEND_SESSION
	 *
	 * @mbggenerated Mon Dec 05 15:25:31 CST 2016
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table TB_CHL_FRONTEND_SESSION
	 *
	 * @mbggenerated Mon Dec 05 15:25:31 CST 2016
	 */
	int insert(TbChlFrontendSession record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table TB_CHL_FRONTEND_SESSION
	 *
	 * @mbggenerated Mon Dec 05 15:25:31 CST 2016
	 */
	int insertSelective(TbChlFrontendSession record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table TB_CHL_FRONTEND_SESSION
	 *
	 * @mbggenerated Mon Dec 05 15:25:31 CST 2016
	 */
	TbChlFrontendSession selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table TB_CHL_FRONTEND_SESSION
	 *
	 * @mbggenerated Mon Dec 05 15:25:31 CST 2016
	 */
	int updateByPrimaryKeySelective(TbChlFrontendSession record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table TB_CHL_FRONTEND_SESSION
	 *
	 * @mbggenerated Mon Dec 05 15:25:31 CST 2016
	 */
	int updateByPrimaryKey(TbChlFrontendSession record);

	/**
	 * 批量插入会话信息
	 * 
	 * @param list
	 * @return
	 */
	int batchInsert(List<TbChlFrontendSession> list);

	/**
	 * 根据查询参数查询前置会话信息
	 * 
	 * @param sessionDate
	 *            会话日期
	 * @param channelCode
	 *            渠道编码
	 * @param sessionType
	 *            会话类型
	 * @return
	 */
	public TbChlFrontendSession selectFrontendByParam(@Param("sessionDate") String sessionDate,
			@Param("channelCode") String channelCode, @Param("sessionType") String sessionType);

	/**
	 * 根据渠道编码和会话日期锁表查询数据
	 * 
	 * @param sessionDate
	 *            会话日期
	 * @param channelCode
	 *            渠道编码
	 * @param sessionType
	 *            会话类型
	 * @return
	 */
	public TbChlFrontendSession lockSelectFrontendByParam(@Param("sessionDate") String sessionDate,
			@Param("channelCode") String channelCode, @Param("sessionType") String sessionType);
	
	/**
	 * 根据参数MAP查询会话session信息
	 * @param paramMap
	 * @return
	 */
	public List<TbChlFrontendSession> findFrontendSession(@Param("paramMap")Map<String,Object> paramMap);
	
	  /**
     * 根据参数查询所有数据
     * @param PayPaymentDto
     * @return
     */
    List<TbChlFrontendSession> queryAllData(TbChlFrontendSession record);
}