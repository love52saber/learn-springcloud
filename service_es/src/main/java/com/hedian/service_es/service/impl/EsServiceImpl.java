package com.hedian.service_es.service.impl;

import com.hedian.service_es.dao.EsRepository;
import com.hedian.service_es.service.EsService;
import org.elasticsearch.action.admin.indices.analyze.AnalyzeAction;
import org.elasticsearch.action.admin.indices.analyze.AnalyzeRequestBuilder;
import org.elasticsearch.action.admin.indices.analyze.AnalyzeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 和电科技 on 2019/3/15 14:28
 */
@Service
public class EsServiceImpl implements EsService {

    @Autowired
    private EsRepository esRepository;
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    @Override
    public List<String> getEsInfo(String searchContent) {
        AnalyzeRequestBuilder analyzeRequestBuilder = new AnalyzeRequestBuilder(elasticsearchTemplate.getClient(), AnalyzeAction.INSTANCE, "test_index",
                searchContent);
        analyzeRequestBuilder.setTokenizer("ik");
        List<AnalyzeResponse.AnalyzeToken> tokens = analyzeRequestBuilder.execute().actionGet().getTokens();
        List<String> searchTermList = new ArrayList<>();
        tokens.forEach(analyzeToken -> {
            searchTermList.add(analyzeToken.getTerm());
        });
        return searchTermList;
    }
}
