package com.hedian.service_es.dao;

import com.hedian.service_es.entity.LogEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by 和电科技 on 2019/3/15 14:22
 */
public interface EsRepository extends ElasticsearchRepository<LogEntity,String> {
}
