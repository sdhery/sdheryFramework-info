package com.sdhery.module.info.service.impl;


import com.sdhery.module.core.dao.EntityDao;
import com.sdhery.module.core.service.impl.BaseService;
import com.sdhery.module.info.dao.IInfoArticleDao;
import com.sdhery.module.info.domain.InfoArticle;
import com.sdhery.module.info.service.IInfoArticleService;

/**
* @Title:实现业务操作类
* @Description: 信息
* @author sdhery
* @Date:2013-07-09 10:41:16
*/
public class InfoArticleService extends BaseService<InfoArticle, Integer> implements IInfoArticleService {
    IInfoArticleDao infoArticleDao;

    public void setInfoArticleDao(IInfoArticleDao infoArticleDao) {
        this.infoArticleDao = infoArticleDao;
    }

    protected EntityDao<InfoArticle, Integer> getEntityDao() {
        return infoArticleDao;
    }

    public int addInfoArticle(InfoArticle infoArticle) {
        return infoArticleDao.insert(infoArticle);
    }
}