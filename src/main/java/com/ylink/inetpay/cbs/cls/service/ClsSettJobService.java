package com.ylink.inetpay.cbs.cls.service;

import java.util.List;

import org.ylinkpay.framework.core.model.PageData;

import com.ylink.inetpay.common.core.constant.CLSReviewStatus;
import com.ylink.inetpay.common.core.dto.ReporHeadDto;
import com.ylink.inetpay.common.project.clear.dto.CLsMerchantSettleVo;
import com.ylink.inetpay.common.project.clear.dto.ClsClearJob;
import com.ylink.inetpay.common.project.clear.dto.ClsLiquidationJob;
import com.ylink.inetpay.common.project.clear.dto.ClsMerSett;
import com.ylink.inetpay.common.project.clear.dto.ClsPayBill;
import com.ylink.inetpay.common.project.clear.dto.ClsPayBillVo;
import com.ylink.inetpay.common.project.clear.dto.ClsSettJob;

/**
 * @类名称： ClsMerSettleService
 * @类描述： 结算任务监控接口服务类
 * @创建人： 1603254
 * @创建时间： 2016-5-25 下午2:35:48
 *
 * @修改人： 1603254
 * @操作时间： 2016-5-25 下午2:35:48
 * @操作原因： 
 * 
 */
public interface ClsSettJobService {

	/**
	 * @方法描述: 分页查询机构结算监控任务接口
	 * @作者： 徐浩南
	 * @日期： 2016-5-25-下午2:37:07
	 * @param pageDate
	 * @param settle
	 * @return 
	 * @返回类型： PageData<ClsClearJob>
	*/
	public PageData<ClsSettJob> queryClsSettJob(PageData<ClsSettJob> pageData,
			ClsSettJob clsSettJob);
	/**
	 * 结算任务详情
	 * @param id
	 * @return
	 */
	public ClsSettJob detail(String id);
}
