package com.yxy.threadpool.core.dao;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.yxy.threadpool.core.entity.HhBusinessDO;
import com.yxy.threadpool.core.entity.HhThreadPoolDO;
import com.yxy.threadpool.core.mapper.HhBusinessMapper;
import com.yxy.threadpool.core.mapper.HhThreadPoolMapper;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

/**
 * ClassName ThreadPoolDao Description Create by yxy Date 2021/5/24 20:32
 */
@Repository
public class ThreadPoolDao {

    @Resource
    HhThreadPoolMapper hhThreadPoolMapper;
    @Resource
    HhBusinessMapper hhBusinessMapper;

    public List<HhThreadPoolDO> getThreadPoolByBusinessCode(String businessCode) {
        HhBusinessDO hhBusinessDO = hhBusinessMapper.selectOne(Wrappers.<HhBusinessDO>lambdaQuery()
                .eq(HhBusinessDO::getBusinessCode, businessCode));
        return hhThreadPoolMapper
                .selectList(Wrappers.<HhThreadPoolDO>lambdaQuery()
                        .eq(HhThreadPoolDO::getBusinessId, hhBusinessDO.getId()));
    }

}
